package com.shwetang.jqueryhtmltest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
	
	private WebView myWebView;

	@SuppressLint({ "SetJavaScriptEnabled", "JavascriptInterface" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		myWebView = new WebView(this);
		myWebView.getSettings().setJavaScriptEnabled(true);
		
		myWebView.loadUrl("file:///android_asset/www/index.html");
		setContentView(myWebView);
	}
}
