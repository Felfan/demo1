package myviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by XaChya on 2016/10/14.
 */

public class NumberIcon extends ImageView {

    //表示信息数量
    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        invalidate();
    }

    public NumberIcon(Context context) {
        this(context, null);
    }

    public NumberIcon(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NumberIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        textPaint = new TextPaint();
        textPaint.setColor(Color.WHITE);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(getPaddingRight());
        textPaint.setStrokeWidth(5);
    }

    //画圆用的画笔
    private Paint paint = null;
    //画数字用的画笔
    private TextPaint textPaint = null;


    @Override
    protected void onDraw(Canvas canvas) {

        //先画头像，再画红圆圈，再画文字
        //定位顺序，现有头像，头像右上角有文字，文字正中心是圆心

        //先画头像
        super.onDraw(canvas);
        float cx = 0;
        float cy = 0;
        float r = 0;
        if (num > 0 && num < 100) {
            //画红圆
            //确定圆心?
            cx = getWidth() - getPaddingRight() - 1.0f * textPaint.measureText("" + num);
            cy = getPaddingTop() + 3.0f * textPaint.getFontMetrics().bottom;
            r = textPaint.getTextSize();
            canvas.drawCircle(cx, cy, r, paint);

            //绘制文字
            canvas.drawText(num + "",
                    getWidth() - getPaddingRight() - 1.5f*textPaint.measureText("" + num),
                    getPaddingTop() + textPaint.getFontMetrics().bottom * 4.5f,
                    textPaint);
        } else {
            if (num > 99) {
                //画红圆
                //确定圆心?
                cx = getWidth() - getPaddingRight() - 1.0f * textPaint.measureText("99");
                cy = getPaddingTop() + 3.0f * textPaint.getFontMetrics().bottom;
                r = textPaint.getTextSize();
                canvas.drawCircle(cx, cy, r, paint);

                //绘制文字
                canvas.drawText("99",
                        getWidth() - getPaddingRight() - 1.5f*textPaint.measureText("99"),
                        getPaddingTop() + textPaint.getFontMetrics().bottom * 4.5f,
                        textPaint);
            }
        }
    }


}
