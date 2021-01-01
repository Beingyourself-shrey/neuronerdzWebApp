package com.neuronerdz.www;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webContainer=findViewById(R.id.webview);
        WebSettings webSettings=webContainer.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webContainer.setWebViewClient(new WebViewClient());
        webContainer.loadUrl("https://www.neuronerdz.com");



    }

    @Override
    public void onBackPressed() {
        if(webContainer.canGoBack())
            webContainer.goBack();
        else
        super.onBackPressed();

    }
    public void home(View view){
        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void test(View view){
        Intent i =new Intent(this,Test.class);
        startActivity(i);
    }
}