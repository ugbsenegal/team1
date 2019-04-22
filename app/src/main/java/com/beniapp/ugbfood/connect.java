package com.beniapp.ugbfood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class connect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        Button btn1= findViewById(R.id.btnConnect);
        Button btn2= findViewById(R.id.btnSubscribe);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Connexion", Toast.LENGTH_LONG);
                t1.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Toast t2 = Toast.makeText(getApplicationContext(), "Creation de compte", Toast.LENGTH_LONG);
                t2.show();
            }
        });

    }
}
