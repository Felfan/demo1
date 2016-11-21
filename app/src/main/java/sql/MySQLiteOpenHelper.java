package sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observer;

import interfaces.DataObserver;

/**
 * Created by XaChya on 2016/10/10.
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper{

    private static List<DataObserver> list=null;
    static{
        list=new ArrayList<DataObserver>();
    }
    public void registerObserver(DataObserver dataObserver){
        list.add(dataObserver);
    }
    public void unregisterObserver(DataObserver dataObserver){
        list.remove(dataObserver);
    }







    private static final String DB_NAME="db_openhelper";
    private static final int VERSION=1;
    //表示了数据库的链接，也是具体操作数据库的对象
    private SQLiteDatabase dbConn=null;

    public MySQLiteOpenHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
        //获取数据库的链接
        dbConn=this.getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists tb_address(_id integer primary key autoincrement,name,phone,province,address,ischoose)");
        db.execSQL("create table if not exists tb_favorite(_id integer primary key autoincrement,name varchar,imageUrl varchar,price varchar,url varchar)");
        db.execSQL("create table if not exists tb_shopping_card(_id integer primary key autoincrement,goods_id varchar,goods_name varchar,goods_price varchar,goods_costprice varchar,goods_image varchar,color varchar,size varchar,number varchar,storage varchar,is_choose)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion>oldVersion){
            db.execSQL("drop table if exists tb_address");
            db.execSQL("drop table if exists tb_favorite");
            db.execSQL("drop table if exists tb_shopping_card");
            onCreate(db);
        }
    }


    //封装数据操作


    //Cursor转化成List<Map<String,Object>>
    public static List<Map<String,Object>> cursorToList(Cursor cursor){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();

        //获取到cursor中所有的列名
        String [] arrColumnName=cursor.getColumnNames();
        int cursorTempIndex=cursor.getPosition();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()){
            Map<String,Object> map=new HashMap<String , Object>();
            for (int i = 0; i <arrColumnName.length; i++) {
                Object cols_value=cursor.getString(i);
                map.put(arrColumnName[i],cols_value);

            }
            list.add(map);
        }
        cursor.moveToPosition(cursorTempIndex);
        //别关，为何？
        //这个cursor是外部的，不是你自己的，
        //人家只是用你获取数据


        return list;
    }

    //返回cursor的查询
    public Cursor selectCursor(String sql,String [] selectionArgs){
        return dbConn.rawQuery(sql,selectionArgs);
    }

    //返回list的查询
    public List<Map<String,Object>> selectList(String sql,String [] selectionArgs){
        return cursorToList(selectCursor(sql,selectionArgs));
    }
    //自定义语句,你可以自己写insert、delete、update
    public boolean execData(String sql){
        try {
            dbConn.execSQL(sql);
            notifyObserver();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public int insert(String table, String nullColumnHack, ContentValues values){
        int n=(int) dbConn.insert(table,nullColumnHack,values);
        notifyObserver();
        return n;
    }
    public int update(String table,ContentValues value,String selection,String [] selectionArgs){
        int n=dbConn.update(table,value,selection,selectionArgs);
        notifyObserver();
        return n;
    }
    public int delete(String table,String selection,String [] selectionArgs){
        int n=dbConn.delete(table,selection,selectionArgs);
        notifyObserver();
        return n;
    }
    private void notifyObserver(){
        if(list!=null){
            for (int i = 0; i <list.size(); i++) {
                DataObserver observer=list.get(i);
                if(observer!=null){
                    observer.onDataChanged();
                }
            }
        }
    }

}
