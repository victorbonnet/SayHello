package com.infine.sayHello;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SayHelloActivity extends Activity {
	private final String SAY_HELLO = "sayHello"; 
	private Context context;
	private EditText editText;
	private Button button;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        context = this;
        editText = (EditText) findViewById(R.id.name);
        button = (Button) findViewById(R.id.button);
        
        button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				if (editText.getText().toString().equals("")) {
					Toast.makeText(context, R.string.error, 1000).show();
				} else {
					Intent intent = new Intent(context, HelloActivity.class);
					intent.putExtra("Name", editText.getText().toString());
					context.startActivity(intent);
				}
				
			}
		});
    }
}