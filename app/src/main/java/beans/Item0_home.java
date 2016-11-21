package beans;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public class Item0_home implements IItem {
    private int type;
    @Override
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private String to1,to2,to3,to4;
    private String imageUrl1,imageUrl2,imageurl3,imageUrl4;
    private String title;

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

    public String getImageurl3() {
        return imageurl3;
    }

    public void setImageurl3(String imageurl3) {
        this.imageurl3 = imageurl3;
    }

    public String getImageUrl4() {
        return imageUrl4;
    }

    public void setImageUrl4(String imageUrl4) {
        this.imageUrl4 = imageUrl4;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTo1() {
        return to1;
    }

    public void setTo1(String to1) {
        this.to1 = to1;
    }

    public String getTo2() {
        return to2;
    }

    public void setTo2(String to2) {
        this.to2 = to2;
    }

    public String getTo3() {
        return to3;
    }

    public void setTo3(String to3) {
        this.to3 = to3;
    }

    public String getTo4() {
        return to4;
    }

    public void setTo4(String to4) {
        this.to4 = to4;
    }
}
