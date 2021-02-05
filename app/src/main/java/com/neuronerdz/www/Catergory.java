package com.neuronerdz.www;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Catergory extends AppCompatActivity {
    WebView webContainer;
    ProgressBar progress;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catergory);
        String category = getIntent().getStringExtra("category");
        webContainer=findViewById(R.id.webview2);
        WebSettings webSettings=webContainer.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webContainer.setWebViewClient(new WebViewClient());
        webContainer.loadUrl("https://www.neuronerdz.com/category/"+category);
        progress=findViewById(R.id.progress2);

        webContainer.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                progress.setVisibility(View.VISIBLE);
                progress.setProgress(newProgress);
                if(newProgress==100){
                    progress.setVisibility(View.GONE);

                }

                super.onProgressChanged(view, newProgress);
            }
        });
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
    public void explore(View view){
        Intent i =new Intent(this, Explore.class);
        startActivity(i);
    }
    public void about(View view){
        Intent i =new Intent(this, AboutActivity.class);
        startActivity(i);
    }
}