package myviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/11/10 0010.
 */
public class Text extends TextView{
    public Text(Context context) {
        this(context,null);
    }

    public Text(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Text(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint=new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(deleteLineStyle);
    }
    private Paint mPaint=null;

    private int deleteLineStyle;
    public void setDeleteLineStyle(int deleteLineStyle) {
        this.deleteLineStyle = deleteLineStyle;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int startX=0;
        int startY=getHeight()+1;
        int stopX=getWidth();
        int stopY=getHeight()+1;

        canvas.drawLine(startX,startY,stopX,stopY,mPaint);

    }
}
