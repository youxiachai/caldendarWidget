package com.achai;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.Toast;

public class CalendarWidgetActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
       
        setContentView(R.layout.main);
        CalendarView cv = new CalendarView(this);
        
        LinearLayout mCalder = (LinearLayout) findViewById(R.id.calendar);
        mCalder.addView(cv);
        cv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
        
        cv.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				float x = event.getX();
				float y = event.getY();
				Toast.makeText(CalendarWidgetActivity.this, "onTouch:"+"x:"+x+"y:"+y, Toast.LENGTH_SHORT).show();
				
				return true;
			}
		});
    }
}