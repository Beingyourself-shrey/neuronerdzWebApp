package com.neuronerdz.www;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WebView webContainer;
    int i=0;
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
        else {
            i++;
            if(i==2)
                finishAffinity();
            else
                Toast.makeText(this,"Press Again to Exit",Toast.LENGTH_SHORT).show();
        }
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