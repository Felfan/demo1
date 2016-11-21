package myviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/**
 * Created by XaChya on 2016/10/14.
 */

public class MyRadioGroup extends RadioGroup {
    public MyRadioGroup(Context context) {
        super(context);
    }

    public MyRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //它是排列子view的方法
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //以垂直方向，来排列子view
        int sumW = 0;
        int sumH = 0;
        //排列所有的view，因此，遍历所有的view
        for (int i = 0; i < getChildCount(); i++) {
            //得到一个子view
            View view = getChildAt(i);
            //测量这个子view
            view.measure(0, 0);
            int w = view.getMeasuredWidth();
            int h = view.getMeasuredHeight();
            //这个方法是给一个view定位的。
            //就是说指定左上右下四个值，把一个view固定在那里
            if (i%4 == 0&&i != 0){
                sumH += h;
                view.layout(0,sumH,w,sumH+h);
                sumW = 0;
            }else {
                view.layout(sumW ,sumH,sumW+w,sumH+h);
                sumW+=w;
            }
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //应该计算出所有的view的高度的和
        //所有的view的宽度的最大值
        int sumH = 0;
        View view = getChildAt(0);
        view.measure(0, 0);
        sumH = (getChildCount()+3)/4*view.getMeasuredHeight();
        setMeasuredDimension(widthMeasureSpec, sumH);
    }
}
