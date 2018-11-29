package com.it.yangk.custom_view.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Test2DrawCircleView extends View {


    public Test2DrawCircleView(Context context) {
        super(context);
    }

    public Test2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //实❤圆
        Paint paint = new Paint();
        paint.setAntiAlias(true);//抗锯齿，更光滑
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300,200,150,paint);


        //空心圆
        Paint paint_2 = new Paint();
        paint_2.setAntiAlias(true);//抗锯齿，更光滑
        paint_2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800,200,150,paint_2);

        //蓝色实心圆
        Paint paint_3 = new Paint();
        paint_3.setAntiAlias(true);//抗锯齿，更光滑
        paint_3.setColor(Color.BLUE);
        paint_3.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(300,600,150,paint_3);

        //线宽为 20 的空心圆
        Paint paint_4 = new Paint();
        paint_4.setAntiAlias(true);//抗锯齿，更光滑
        paint_4.setStrokeWidth(20);//设置线条宽度
        paint_4.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(800,600,150,paint_4);
    }
}
