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

import com.blankj.utilcode.util.LogUtils;

public class Test11PieChartView extends View {

    public Test11PieChartView(Context context) {
        super(context);
    }

    public Test11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Test11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("饼图",canvas.getWidth()/2 -100 ,canvas.getHeight()-100,paint);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        drawArc(canvas);

        drawLineAndTxt(canvas);


    }

    /**
     * 绘制折线和文字
     * @param canvas
     */
    private void drawLineAndTxt(Canvas canvas) {

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void drawArc(Canvas canvas) {
        try {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.YELLOW);
            canvas.drawArc(300, 150, 800, 600, -60, 60, true, paint);
            paint.setColor(Color.DKGRAY);
            canvas.drawArc(300, 150, 800, 600, 5, 5, true, paint);
            paint.setColor(Color.BLUE);
            canvas.drawArc(300, 150, 800, 600, 15, 5, true, paint);
            paint.setColor(Color.CYAN);
            canvas.drawArc(300, 150, 800, 600, 25, 45, true, paint);
            paint.setColor(Color.MAGENTA);
            canvas.drawArc(300, 150, 800, 600, 75, 90, true, paint);
            paint.setColor(Color.RED);
            canvas.drawArc(280, 130, 780, 580, 170, 130, true, paint);
        } catch (Exception e) {
            LogUtils.e(e.getMessage());
        }

    }
}
