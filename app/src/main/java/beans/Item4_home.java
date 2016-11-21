package beans;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class Item4_home implements IItem{
    @Override
    public int getType() {
        return 4;
    }

    private String imageUrl1,imageUrl2, toUrl1, toUrl2;

    public String getImageUrl1() {
        return imageUrl1;
    }

    public void setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public void setImageUrl2(String imageUrl2) {
        this.imageUrl2 = imageUrl2;
    }

    public String getToUrl1() {
        return toUrl1;
    }

    public void setToUrl1(String toUrl1) {
        this.toUrl1 = toUrl1;
    }

    public String getToUrl2() {
        return toUrl2;
    }

    public void setToUrl2(String toUrl2) {
        this.toUrl2 = toUrl2;
    }
}
