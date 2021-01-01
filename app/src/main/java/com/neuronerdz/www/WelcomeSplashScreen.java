package com.neuronerdz.www;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeSplashScreen extends AppCompatActivity {

    ImageView logo,banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_splash_screen);
        logo=findViewById(R.id.logo);
        banner=findViewById(R.id.banner);
        logo.animate().alpha(1).setDuration(1000);
        banner.animate().alpha(1).setDuration(1000).setStartDelay(1000);
        ChangingActivity ca=new ChangingActivity();
        ca.start();
    }

    protected class ChangingActivity extends Thread{
        @Override
         public void run(){
            try{
                sleep(3000);
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                WelcomeSplashScreen.this.finish();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }



    }
}
