package com.example.android.apis;

/**
 * Import statements
 */
import com.example.android.google.apis.R;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
	}
}
