package beans;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class Item_draw implements IItem{

    private String imageUrl;
    private String title;
    private String id;
    private String toUrl;

    public String getToUrl() {
        return toUrl;
    }

    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getType() {
        return GRID_ITEM;
    }
}
