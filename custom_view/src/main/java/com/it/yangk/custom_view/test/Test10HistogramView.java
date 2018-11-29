package com.it.yangk.custom_view.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Test10HistogramView extends View {


    public Test10HistogramView(Context context) {
        super(context);
    }

    public Test10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }




    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //绘制直方图
        drawLine(canvas);
        //绘制直方图上面的块状物体
        drawRect(canvas);
        //绘制文字
        drawText(canvas);
    }

    private void drawText(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);//设置抗锯齿
        paint.setStyle(Paint.Style.STROKE);//设置实心图
        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        canvas.drawText("A",150,680,paint);
        canvas.drawText("B",250,680,paint);
        canvas.drawText("C",350,680,paint);
        canvas.drawText("D",450,680,paint);
        canvas.drawText("E",550,680,paint);
        canvas.drawText("F",650,680,paint);
        canvas.drawText("G",750,680,paint);
        canvas.drawText("J",850,680,paint);
    }

    private void drawRect(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);//设置抗锯齿
        paint.setStyle(Paint.Style.FILL);//设置实心图
        paint.setColor(Color.YELLOW);
        canvas.drawRect(120,600,200,650,paint);
        paint.setColor(Color.BLUE);
        canvas.drawRect(220,620,300,650,paint);
        paint.setColor(Color.RED);
        canvas.drawRect(320,500,400,650,paint);
        paint.setColor(Color.GRAY);
        canvas.drawRect(420,400,500,650,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(520,380,600,650,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(620,450,680,650,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(720,390,800,650,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(820,550,900,650,paint);
    }

    private void drawLine(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2);

        Path path = new Path();
        path.moveTo(100,100);
        path.lineTo(100,650);
        path.rLineTo(900,0);

        canvas.drawPath(path,paint);
    }
}
