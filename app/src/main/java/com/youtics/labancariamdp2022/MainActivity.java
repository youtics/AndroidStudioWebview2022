package com.youtics.labancariamdp2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myweb = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = myweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myweb.loadUrl("https://labancaria.obliviondev.com.ar/");

        //mantenersee dentro de la app y no abra el navegador
        myweb.setWebViewClient(new WebViewClient());
    }
    //para mantenernos dentro de la app cuando vamos atras
    @Override
    public void onBackPressed()
    {
        if(myweb.canGoBack()) {
            myweb.goBack();
        }else {
            super.onBackPressed();
        }
    }
}