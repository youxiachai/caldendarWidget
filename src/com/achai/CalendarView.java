package com.achai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.view.View;

public class CalendarView extends View {

	public CalendarView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		//1 练习一: 绘制背景图
		Paint background = new Paint();
		background.setColor(Color.CYAN);
		//前两个参数为定义起始点
		canvas.drawRect(0, 0, getWidth(), getHeight(), background);
		
		//定义线的颜色
		Paint dark = new Paint();
		dark.setColor(Color.BLACK);
		
	//	canvas.drawLine(0, 0, getWidth(), 0, dark);
		
	//	canvas.drawLine(0, 100, getWidth(), 100, dark);
		
		//画网格
	
		
		int row = 6;
		int column = 7;
		
		float height = getHeight() / 6;
		
		float width = getWidth() / 7;
		
		//画 row
		for(int i=0; i < row ; i++){
			canvas.drawLine(0, height*i, getWidth(), height *i, dark);
			
		}
		canvas.drawLine(0, getHeight()-1, getWidth(), getHeight() - 1, dark);
		//画 column
		for (int i =0; i < column; i++){
			canvas.drawLine(i*width, 0, i*width, getHeight(), dark);
		}
		
		canvas.drawLine(getWidth()-1, 0,getWidth()-1, getHeight(), dark);
		//画数字
		//1,定义字体颜色
		Paint foreground = new Paint(Paint.ANTI_ALIAS_FLAG);
		
		FontMetrics fm = foreground.getFontMetrics();
		
		
		//字体的垂直居中
		float x = width / 2 + (fm.ascent + fm.descent) /2;
		float y = height / 2 - (fm.ascent + fm.descent) /2;
		int count = 1;
		for (int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				canvas.drawText(String.valueOf(count), j*width +x, i * height +y, foreground);
				count++;
			}
		}
		
		
	}

}
