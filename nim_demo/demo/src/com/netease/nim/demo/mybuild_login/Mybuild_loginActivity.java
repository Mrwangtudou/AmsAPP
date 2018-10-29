package com.netease.nim.demo.mybuild_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.netease.nim.demo.R;
import com.netease.nim.demo.main.activity.MainActivity;

public class Mybuild_loginActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private WebView webview;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    Log.e("diyikuai","----------------------来了");
                    webview = findViewById(R.id.webview);
                    WebSettings webset = webview.getSettings();
                    webview.loadUrl("http://192.168.2.114:8080/");
                    //设置WebView属性，能够执行Javascript脚本
                    Log.e("执行了吗","----------------------来了");
                    webview.getSettings().setJavaScriptEnabled(true);
                    Log.e("执行了吗","----------------------来een了");
                    webview.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);
                            return true;
                        }
                    });
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
                    Log.e("第二块","----------------------来了");
                    webview = findViewById(R.id.webview);
                    WebSettings webset2 = webview.getSettings();
                    webview.loadUrl("http://wap.amisheng.com/index/product/cate_list.html");
                    //设置WebView属性，能够执行Javascript脚本
                    Log.e("执行了吗","----------------------来了");
                    webview.getSettings().setJavaScriptEnabled(true);
                    Log.e("执行了吗","----------------------来een了");
                    webview.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);
                            return true;
                        }
                    });
                    return true;

               case   R.id.title_chatname:
                  Intent inte  = new Intent(Mybuild_loginActivity.this, MainActivity.class);
                  startActivity(inte);
                  return true;

                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
                    Log.e("第san块","----------------------来了");
                    webview = findViewById(R.id.webview);
                    WebSettings webset4 = webview.getSettings();
                    webview.loadUrl("http://wap.amisheng.com/index/mycenter/index.html");
                    //设置WebView属性，能够执行Javascript脚本
                    Log.e("执行了吗","----------------------来了");
                    webview.getSettings().setJavaScriptEnabled(true);
                    Log.e("执行了吗","----------------------来een了");
                    webview.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView view, String url) {
                            view.loadUrl(url);
                            return true;
                        }
                    });


                    return true;

            }
                   return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybuild_login_activity);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        webview = findViewById(R.id.webview);
        WebSettings webset4 = webview.getSettings();
        webview.loadUrl("http://192.168.2.114:8080/");
        //设置WebView属性，能够执行Javascript脚本
        Log.e("执行了吗","----------------------来了");
        webview.getSettings().setJavaScriptEnabled(true);
        Log.e("执行了吗","----------------------来een了");
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
