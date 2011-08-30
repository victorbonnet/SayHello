package com.infine.sayHello;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HelloActivity extends Activity {
	private Context context;
	private TextView textView;
	private Button button;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);

        context = this;
        textView = (TextView) findViewById(R.id.hello);
        button = (Button) findViewById(R.id.back);
        
        textView.setText(getResources().getString(R.string.hello));
        
        button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				((Activity) context).finish();
			}
		});
    }
}