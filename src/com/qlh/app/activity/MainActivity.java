package com.qlh.app.activity;

import android.app.FragmentManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.qlh.app.R;
import com.qlh.app.util.BitmapCache;

public class MainActivity extends FragmentActivity implements
		View.OnClickListener {

	public static MainActivity a;
	public LinearLayout maintab;
	private FragmentManager l;
	private TextView mainDynamic;
	private TextView mainSurrounding;
	private TextView mainCollege;
	private TextView mainMall;
	private TextView mainMy;
	private ImageLoader imageLoader;
	private boolean x;

	private void findByView() {
		this.maintab = ((LinearLayout) findViewById(R.id.ll_maintab));
		this.mainDynamic = ((TextView) findViewById(R.id.main_dynamic));
		this.mainSurrounding = ((TextView) findViewById(R.id.main_surrounding));
		this.mainCollege = ((TextView) findViewById(R.id.main_college));
		this.mainMall = ((TextView) findViewById(R.id.main_mall));
		this.mainMy = ((TextView) findViewById(R.id.main_my));
		this.mainDynamic.setOnClickListener(this);
		this.mainSurrounding.setOnClickListener(this);
		this.mainCollege.setOnClickListener(this);
		this.mainMall.setOnClickListener(this);
		this.mainMy.setOnClickListener(this);
	}

	private void i() {
		this.mainMy.setTextColor(Color.parseColor("#ff64be"));
		Drawable localDrawable = getResources().getDrawable(R.drawable.me_selected);
		localDrawable.setBounds(0, 0, localDrawable.getMinimumWidth(),
				localDrawable.getMinimumHeight());
		this.mainMy.setCompoundDrawables(null, localDrawable, null, null);
	}

	private void k() {
		this.mainCollege.setTextColor(Color.parseColor("#ff64be"));
		Drawable localDrawable = getResources().getDrawable(R.drawable.mall_selected);
		localDrawable.setBounds(0, 0, localDrawable.getMinimumWidth(),
				localDrawable.getMinimumHeight());
		this.mainCollege.setCompoundDrawables(null, localDrawable, null, null);
	}

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		this.imageLoader = new ImageLoader(
				Volley.newRequestQueue(getApplicationContext()),
				new BitmapCache());
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		findByView();
		if ((getIntent().getStringExtra("gotomyfragment") != null)
				&& (getIntent().getStringExtra("gotomyfragment").equals("yes"))) {
			i();
		}
		k();

	}

	@Override
	public void onClick(View v) {
	}
}
