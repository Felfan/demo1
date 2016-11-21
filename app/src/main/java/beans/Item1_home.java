package beans;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class Item1_home implements IItem {
    private String imageUrl;
    private int type = ONE_IMAGE;
    private int id;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
