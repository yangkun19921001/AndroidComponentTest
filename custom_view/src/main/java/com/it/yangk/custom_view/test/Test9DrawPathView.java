package com.it.yangk.custom_view.test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.it.yangk.custom_view.R;

public class Test9DrawPathView extends View {

    public Test9DrawPathView(Context context) {
        super(context);
    }

    public Test9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint();
        Path path = new Path();
        //绘制一个❤
        path.addArc(200, 200, 400, 400, -225, 225);

        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 580);

        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);

        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        Path path1 = new Path();
        path1.addCircle(700, 500, 200, Path.Direction.CCW);
        canvas.drawPath(path1, paint1);


        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(Color.YELLOW);
        paint2.setStrokeWidth(20);
        paint2.setStyle(Paint.Style.STROKE);
        Path path2 = new Path();
        path2.lineTo(400, 400);
        path2.rLineTo(400,200);
        canvas.drawPath(path2,paint2);

        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(Color.BLUE);
        paint3.setStrokeWidth(10);
        paint3.setStyle(Paint.Style.STROKE);
        Path path3 = new Path();
        path3.lineTo(0, 400);//由当前位置（0,0）向坐标 （0,400）画一条直线
        path3.rLineTo(400,0);//由当前位置 （0,400）向正右方方向画 400 的像素 向下 10 像素
        canvas.drawPath(path3,paint3);

        Paint paint4 = new Paint();
        paint4.setStrokeWidth(30);
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.STROKE);
        path4.lineTo(100, 100); // 画斜线
        path4.moveTo(200, 100); // 我移~~
        path4.lineTo(200, 0); // 画竖线
        canvas.drawPath(path4,paint4);
        paint4.setColor(Color.YELLOW);
        Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.sample_round_rect);
        canvas.drawBitmap(icon,400,400,paint4);
        paint.setColor(Color.YELLOW);
        canvas.drawText("发射aoaoao",400,400,paint);
    }
}
