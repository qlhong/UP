package com.qlh.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.qlh.app.MainActivity;
import com.qlh.app.R;

public class LoadActivity extends Activity {

	private SharedPreferences spf;
	private SharedPreferences.Editor spfEditer;

	protected void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_load);
		this.spf = getSharedPreferences("wistbean",0);
		this.spfEditer = this.spf.edit();
		this.spfEditer.putString("isfirst", "1");
		this.spfEditer.commit();
		new Handler().postDelayed(new GoHome(), 1000L);
	}

	protected void onPause() {
		super.onPause();
	}

	protected void onResume() {
		super.onResume();
	}
	//进入主页
	class GoHome implements Runnable{
		@Override
		public void run() {
			Intent localIntent = new Intent(LoadActivity.this,MainActivity.class);
			startActivity(localIntent);
			finish();
		}
	}
}
