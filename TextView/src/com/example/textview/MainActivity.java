package com.example.textview;

import android.os.Bundle;
import android.app.*;
import android.content.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button start = (Button)findViewById(R.id.start);
		ImageButton start2 = (ImageButton)findViewById(R.id.imageButton1);
		
		
		start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "버튼이 눌렸어요", Toast.LENGTH_LONG).show();
				
				//Intent MyIntent = new Intent(getApplicationContext(),newActivity.class);
				//startActivity(MyIntent);
				//Toast.makeText(MainActivity.this,"button click", Toast.LENGTH_SHORT).show();
			}
		});
		
		start2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "배고파용용용", Toast.LENGTH_LONG).show();
				//Intent intent =(new Intent(MainActivity.this,Test2.class));
			//	startActivity(intent);
				
			}
			
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
