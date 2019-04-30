package com.beniapp.ugbfood;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class restaurants_publics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_publics);

        Button btnLocalisation= findViewById(R.id.btnLocation);

        CardView card1 = findViewById(R.id.bankcardId1);
        CardView card2 = findViewById(R.id.bankcardId2);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                openActivitymenu();

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                openActivitymenu2();

            }
        });

        btnLocalisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                Toast t4 = Toast.makeText(getApplicationContext(), "Cliqued", Toast.LENGTH_LONG);
                t4.show();
                Log.i("MAINACTIVITY", "Localisation is clicked");
                String geoUri = String.format("geo:https://www.google.com/maps/@16.0651907,-16.4268478,17z"); //resto1 ugb
                Uri geo = Uri.parse(geoUri);
                Intent geoMap = new Intent(Intent.ACTION_VIEW,geo);
                startActivity(geoMap);
            }
        });
    }


    public void openActivitymenu(){
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }

    public void openActivitymenu2(){
        Intent intent2 = new Intent(this, menu.class);
        startActivity(intent2);
    }
}
