package com.beniapp.ugbfood;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;


public class Home_activity extends AppCompatActivity {

    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(this);
        CardView card3 = findViewById(R.id.clk_resto_public);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_connect();

            }
        });
        CardView card2 = findViewById(R.id.clk_resto_prive);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_connect2();

            }
        });
        CardView card1 = findViewById(R.id.clk_se_connecter);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_connect3();

            }
        });
    }

    public void ShowPopup(View v){
        TextView txtclose;
        CardView cardView;
        myDialog.setContentView(R.layout.popup);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();

            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    private void openActivity_connect3() {
        Intent intent = new Intent(this, connect.class);
        startActivity(intent);
    }

    private void openActivity_connect2() {
        Intent intent = new Intent(this, restaurants_prives.class);
        startActivity(intent);
    }

    public void openActivity_connect() {
        Intent intent = new Intent(this, restaurants_publics.class);
        startActivity(intent);
    }

}
