package beans;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/9.
 */
public class Item_display implements IItem{
    private String imageUrl;
    private String id;
    private String price;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int getType() {
        return DISPLAY_ITEM;
    }
}
