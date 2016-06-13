package com.danjiang.jni;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
/**
 *
 *	Author: ZhangDanJiang
 *
 *  Date:2016年6月13日  Time: 下午9:27:08
 *
 *  Function: JNI调用方法返回字符串
 *
 */
public class HelloWorld extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.text_view);
		 tv.setText(JniClient.sayName());
	}
	
	  static {
	        System.loadLibrary("AndroidJni");
	    }
	
	
}
