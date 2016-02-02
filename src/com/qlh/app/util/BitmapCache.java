package com.qlh.app.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader.ImageCache;

@SuppressLint("NewApi")
public class BitmapCache implements ImageCache {

	private LruCache<String, Bitmap> cache;
	
	public BitmapCache(){
		cache = new LruCache<String, Bitmap>(8 * 1024 * 1024){
			@Override
			protected int sizeOf(String key, Bitmap value) {
				return super.sizeOf(key, value);
			}
		};
	}
	
	@Override
	public Bitmap getBitmap(String url) {
		return cache.get(url);
	}

	@Override
	public void putBitmap(String url, Bitmap bitmap) {
		 cache.put(url, bitmap);
	}

}
