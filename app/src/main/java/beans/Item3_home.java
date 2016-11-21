package beans;

import java.util.ArrayList;
import java.util.List;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class Item3_home implements IItem {
    @Override
    public int getType() {
        return 3;
    }

    private List<String> mList = new ArrayList<>();

    private List<String> toList = new ArrayList<>();

    public List<String> getToList() {
        return toList;
    }

    public void setToList(List<String> toList) {
        this.toList = toList;
    }

    public List<String> getList() {
        return mList;
    }

    public void setList(List<String> list) {
        mList = list;
    }
}
