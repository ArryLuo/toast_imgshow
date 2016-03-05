package com.example.toast;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ImageView img=new ImageView(MainActivity.this);
				img.setImageResource(R.drawable.ic_launcher);
				LinearLayout la=new LinearLayout(MainActivity.this);
				la.addView(img);
				TextView tx=new TextView(MainActivity.this);
				tx.setText("显示图片");
				tx.setTextColor(Color.RED);
				la.addView(tx);
				Toast toast=new Toast(MainActivity.this);
				toast.setView(la);
				toast.setDuration(0);
				toast.show();
			}
		});
	}
}
