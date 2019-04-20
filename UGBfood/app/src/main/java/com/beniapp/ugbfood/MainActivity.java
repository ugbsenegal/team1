package com.beniapp.ugbfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView txv;
    public ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);
        txv = (TextView) findViewById(R.id.bienvenu_txt);
        imgv = (ImageView) findViewById(R.id.sama_logo_id);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        txv.startAnimation(anim);
        imgv.startAnimation(anim);
        final Intent intent = new Intent(this,Home_activity.class);
        Thread timer = new Thread(){
            public void run (){
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
