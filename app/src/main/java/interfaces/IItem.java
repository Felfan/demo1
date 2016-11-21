package interfaces;

/**
 * Created by 房庆丰 on 2016/11/7.
 */
public interface IItem {

    int getType();

    //一张图片的类型
    int ONE_IMAGE = 1;
    //商品展示的类型
    int DISPLAY_ITEM = 10;
    //尾部局的类型
    int FOOT_ITEM = 20;
    //商标的类型
    int GRID_ITEM = 30;
    //客户端
    int CLIENT = 0;
    //客服端
    int SERVER = 1;

}
