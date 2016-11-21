package utils;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Yizhongli on 2016/11/7.
 */
public class LoadJson {
    public static String getJsonData(String fileName, Context context){
        InputStream inputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            inputStream = context.getResources().getAssets().open(fileName);
            baos = new ByteArrayOutputStream();
            int buff = 0;
            byte[]data = new byte[1024*8];
            while((buff = inputStream.read(data)) != -1){
                baos.write(data,0,buff);
                baos.flush();
            }
            byte[] bytes = baos.toByteArray();
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
