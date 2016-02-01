package com.qlh.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.qlh.app.MainActivity;

public class LoadActivity extends Activity {

	private SharedPreferences spf;
	private SharedPreferences.Editor spfEditer;
	//private Handler c = new gn(this);

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		System.out.println("111");
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}

	protected void onPause() {
		super.onPause();
	}

	protected void onResume() {
		super.onResume();
	}
}
