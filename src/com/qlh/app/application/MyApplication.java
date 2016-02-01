package com.qlh.app.application;

import android.app.Application;
import android.content.SharedPreferences;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.qlh.app.bean.BaseInfo;

public class MyApplication extends Application {

	private static RequestQueue requestQueue;

	public static RequestQueue requestQueue() {
		return requestQueue;
	}
	
	@Override
	public void onCreate(){
		 super.onCreate();
		 //SDKInitializer.initialize(getApplicationContext());
		 requestQueue = Volley.newRequestQueue(getApplicationContext());
		 SharedPreferences localSharedPreferences = getSharedPreferences("memberinfo", 0);
		 BaseInfo.Omemberid = localSharedPreferences.getInt("memberid", -1);
		 BaseInfo.VENDORID =  localSharedPreferences.getString("vendorid", null);
		 BaseInfo.SHOPVENDORID = localSharedPreferences.getString("shopvendorid", null);
		    //cn.uface.app.beans.BaseInfo.LongTitude = a.a(this).b("lng", "113");
		   // cn.uface.app.beans.BaseInfo.LatTitude = a.a(this).b("lat", "23");*/
		 
	}
}
