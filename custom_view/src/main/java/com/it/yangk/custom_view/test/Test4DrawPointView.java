package com.it.yangk.custom_view.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Test4DrawPointView extends View {

    public Test4DrawPointView(Context context) {
        super(context);
    }

    public Test4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        //画一个圆点
        Paint paint_1 = new Paint();
        paint_1.setAntiAlias(true);
        paint_1.setColor(Color.BLACK);
        paint_1.setStrokeCap(Paint.Cap.ROUND);
        paint_1.setStrokeWidth(100);
        canvas.drawPoint(200,500,paint_1);

        //画一个方点
        Paint paint_2 = new Paint();
        paint_2.setAntiAlias(true);
        paint_2.setColor(Color.RED);
        paint_2.setStrokeWidth(10);
        paint_2.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(500, 500, paint_2);

        Paint paint_3 = new Paint();
        paint_3.setAntiAlias(true);
        paint_3.setColor(Color.BLACK);
        paint_3.setStrokeCap(Paint.Cap.ROUND);
        paint_3.setStrokeWidth(40);
        float [] points = new float[]{100,450,200,250,300,380,380,380,400,410,500,180,600,350};
        //画一个连续的点
        canvas.drawPoints(points,paint_3);
    }
}
