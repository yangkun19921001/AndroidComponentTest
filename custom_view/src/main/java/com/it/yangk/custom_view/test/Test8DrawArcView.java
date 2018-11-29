package com.it.yangk.custom_view.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Test8DrawArcView extends View {

    public Test8DrawArcView(Context context) {
        super(context);
    }

    public Test8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        canvas.drawArc(200,200,700,700,-120,120,true,paint); // 绘制扇形
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200,200,700,700,0,50,true,paint); // 绘制扇形
        paint.setColor(Color.YELLOW);
        canvas.drawArc(200,200,700,700,50,100,true,paint); // 绘制扇形
        paint.setColor(Color.GRAY);
        canvas.drawArc(200,200,700,700,150,40,true,paint); // 绘制扇形
        paint.setStyle(Paint.Style.STROKE); // 画线模式
        paint.setColor(Color.BLACK);
        canvas.drawArc(200,200,700,700,190,50,false,paint); // 绘制扇形
    }
}
