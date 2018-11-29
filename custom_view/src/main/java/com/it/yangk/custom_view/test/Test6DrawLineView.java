package com.it.yangk.custom_view.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Test6DrawLineView extends View {

    public Test6DrawLineView(Context context) {
        super(context);
    }

    public Test6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawLine() 方法画直线
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(30);
        canvas.drawLine(30,30,400,400,paint);
    }
}
