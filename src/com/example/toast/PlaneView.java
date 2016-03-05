package com.example.toast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class PlaneView extends View{
	public float mx,py;
	public Bitmap bitmap;
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		//创建画笔
		Paint p=new Paint();
		//绘制飞机
		canvas.drawBitmap(bitmap, mx, py, p);
	}

	public PlaneView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		bitmap=BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher);
	}

}
