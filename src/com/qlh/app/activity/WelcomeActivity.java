package com.qlh.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.qlh.app.R;
import com.qlh.app.adapter.SuperViewPagerAdapter;

public class WelcomeActivity extends Activity {
	private ViewPager viewPager;
	private SharedPreferences spf;
	private Button welcomeBtn1;
	private Button welcomeBtn2;
	private Button welcomeBtn3;
	private Button welcomeBtn4;
	private ImageView go;
	
	private SuperViewPagerAdapter viewPageAdapter;
	
	
	private void begin(){
		this.viewPager = (ViewPager) findViewById(R.id.viewpager);
		View localView1 = View.inflate(this, R.layout.item_introduct_v1, null);
		View localView2 = View.inflate(this, R.layout.item_introduct_v2, null);
		View localView3 = View.inflate(this, R.layout.item_introduct_v3, null);
		View localView4 = View.inflate(this, R.layout.item_introduct_v4, null);
		View localView5 = View.inflate(this, R.layout.item_introduct_v5, null);
		welcomeBtn1 = (Button) localView1.findViewById(R.id.bt_item1_go);
		welcomeBtn2 = (Button) localView2.findViewById(R.id.bt_item2_go);
		welcomeBtn3 = (Button) localView3.findViewById(R.id.bt_item3_go);
		welcomeBtn4 = (Button) localView4.findViewById(R.id.bt_item4_go);
		go = (ImageView) localView5.findViewById(R.id.bt_item5_go);
		viewPageAdapter = new SuperViewPagerAdapter(this);
		viewPager.setAdapter(viewPageAdapter);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_welcome);
		this.spf = getSharedPreferences("wistbean", 0); 
		if(this.spf.getString("isfirst", "0").equals("1")){
			startActivity(new Intent(this, LoadActivity.class));
			finish();
		}
		begin();
	}

}
