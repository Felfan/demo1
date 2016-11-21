package beans;

import java.util.List;

import interfaces.IItem;

/**
 * Created by 房庆丰 on 2016/11/8.
 */
public class Item5_home implements IItem{
    @Override
    public int getType() {
        return 5;
    }

    private String title;
    private List<String>imageUrls;
    private List<String>tabs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<String> getTabs() {
        return tabs;
    }

    public void setTabs(List<String> tabs) {
        this.tabs = tabs;
    }
}
