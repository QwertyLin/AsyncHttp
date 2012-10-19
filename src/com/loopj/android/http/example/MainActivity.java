package com.loopj.android.http.example;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		final TextView tv = new TextView(this);
		setContentView(tv);
		//
		AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://www.baidu.com", new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                tv.setText(response);
            }
        });
	}
	
}
