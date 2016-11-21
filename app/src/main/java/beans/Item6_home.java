package beans;

import java.util.Map;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class Item6_home implements IItem {
    @Override
    public int getType() {
        return 7;
    }
    private Map<String,String>mMap;

    public Map<String, String> getMap() {
        return mMap;
    }

    public void setMap(Map<String, String> map) {
        mMap = map;
    }
}
