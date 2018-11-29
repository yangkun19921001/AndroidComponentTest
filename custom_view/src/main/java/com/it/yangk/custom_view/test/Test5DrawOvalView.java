package com.it.yangk.custom_view.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Test5DrawOvalView extends View {

    public Test5DrawOvalView(Context context) {
        super(context);
    }

    public Test5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        Paint paint =new Paint();
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);

        canvas.drawOval(200,500,500,400,paint);
        Paint paint_2 = new Paint();
        paint_2.setStrokeWidth(20);
        paint_2.setStyle(Paint.Style.FILL);
        paint_2.setAntiAlias(true);

        canvas.drawOval(200, 200, 500, 400, paint_2);
    }
}
