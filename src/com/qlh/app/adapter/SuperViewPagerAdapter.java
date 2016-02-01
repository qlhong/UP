package com.qlh.app.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.qlh.app.R;
import com.qlh.app.activity.LoadActivity;

public class SuperViewPagerAdapter extends PagerAdapter implements
		View.OnClickListener {

	private Context context;
	private Button welcomeBtn1;
	private Button welcomeBtn2;
	private Button welcomeBtn3;
	private Button welcomeBtn4;
	private ImageView go;

	public SuperViewPagerAdapter(Context paramContext) {
		this.context = paramContext;
	}

	@Override
	public int getCount() {
		return 5;
	}

	@Override
	public boolean isViewFromObject(View paramView, Object paramObject) {
		return paramView == paramObject;
	}

	@Override
	public void onClick(View arg0) {
		Intent localIntent = new Intent(this.context, LoadActivity.class);
		this.context.startActivity(localIntent);
		((Activity) this.context).finish();
	}

	public Object instantiateItem(ViewGroup paramViewGroup, int paramInt) {
		 Object localObject=null;
		 if(paramInt==0)
		 {
			 View localView5 = View.inflate(this.context, R.layout.item_introduct_v1, null);
			 localView5.findViewById(R.id.welcome_img1).setBackgroundResource(R.drawable.start_page1);
			 this.welcomeBtn1 = (Button) localView5.findViewById(R.id.bt_item1_go);
			 this.welcomeBtn1.setOnClickListener(this);
			 localObject = localView5;
		 }
		 if(paramInt==1)
		 {
			 View localView4 = View.inflate(this.context, R.layout.item_introduct_v2, null);
			 localView4.findViewById(R.id.welcome_img2).setBackgroundResource(R.drawable.start_page2);
			 this.welcomeBtn2 = (Button) localView4.findViewById(R.id.bt_item2_go);
			 this.welcomeBtn2.setOnClickListener(this);
			 localObject = localView4;
		 }
		 if(paramInt==2)
		 {
			 View localView3 = View.inflate(this.context, R.layout.item_introduct_v3, null);
			 localView3.findViewById(R.id.welcome_img3).setBackgroundResource(R.drawable.start_page3);
			 this.welcomeBtn3 = (Button) localView3.findViewById(R.id.bt_item3_go);
			 this.welcomeBtn3.setOnClickListener(this);
			 localObject = localView3;
		 }
		 if(paramInt==3)
		 {
			 View localView2 = View.inflate(this.context, R.layout.item_introduct_v4, null);
			 localView2.findViewById(R.id.welcome_img4).setBackgroundResource(R.drawable.start_page4);
			 this.welcomeBtn4 = (Button) localView2.findViewById(R.id.bt_item4_go);
			 this.welcomeBtn4.setOnClickListener(this);
			 localObject = localView2;
		 }
		 if(paramInt==4)
		 {
			 View localView1 = View.inflate(this.context, R.layout.item_introduct_v5, null);
			 localView1.findViewById(R.id.welcome_img5).setBackgroundResource(R.drawable.start_page5);
			 this.go = (ImageView) localView1.findViewById(R.id.bt_item5_go);
			 this.go.setOnClickListener(this);
			 localObject = localView1;
		 }
		 paramViewGroup.addView((View)localObject, 0);
		return localObject;
		 
	}

	public void destroyItem(ViewGroup paramViewGroup, int paramInt,
			Object paramObject) {
		paramViewGroup.removeView((View) paramObject);
	}

}
