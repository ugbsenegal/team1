package com.beniapp.ugbfood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inscriotion__ extends AppCompatActivity {

    private EditText et_name ,et_email ,et_phone ,et_password ,et_cpassword;
    private String name,email,phone,password,cpassword;
    Button insbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscriotion__);
        insbtn = findViewById(R.id.insbtn);
        insbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrire();
            }
        });
    }

    private void incrire() {
        initialize(); //initialize the input to string variable
        if(!validate())
        {
            Toast.makeText(this,"Inscription invalide",Toast.LENGTH_SHORT).show();
        }
        else
        {
            onSignupSuccess();
        }
    }

    private void onSignupSuccess() {
       // Toast.makeText(this,"Inscription validé",Toast.LENGTH_SHORT).show();
    }

    private void initialize() {
        name= et_name.getText().toString().trim();
        email= et_email.getText().toString().trim();
        phone= et_phone.getText().toString().trim();
        password= et_password.getText().toString().trim();
        cpassword= et_cpassword.getText().toString().trim();
    }

    private boolean validate() {

        boolean valid = true;
        if (name.isEmpty()||name.length()>32)
        {
            et_name.setError("Please Enter valid name");
            valid = false;
        }
        if (email.isEmpty()|| !Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            et_email.setError("Please Enter valid Email Address");
            valid = false;
        }
        if (password.isEmpty())
        {
            et_password.setError("Please Enter Password");
            valid = false;
        }
        if (cpassword.isEmpty())
        {
            et_cpassword.setError("Please Confirm Password");
            valid = false;
        }
        if (phone.isEmpty())
        {
            et_phone.setError("Please enter Phone Number");
            valid = false;
        }
        return valid;

    }
}
