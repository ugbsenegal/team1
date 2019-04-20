package com.example.inscription;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_name = findViewById(R.id.name),et_email = (EditText) findViewById(R.id.email),et_phone = findViewById(R.id.phone),et_password = findViewById(R.id.password),et_cpassword;
    private String name,email,phone,password,cpassword;
    Button insbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_cpassword= findViewById(R.id.cpassword);
        insbtn=findViewById(R.id.insbtn);
        insbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inscrire(); //call when the button is clicked to validate the input


            }
        });



    }

    public void inscrire ()
    {
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
    public boolean validate(){
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
    public  void onSignupSuccess(){
        // TODO what will go after the valid input
    }
    public  void  initialize ()
    {
        name= et_name.getText().toString().trim();
        email= et_email.getText().toString().trim();
        phone= et_phone.getText().toString().trim();
        password= et_password.getText().toString().trim();
        cpassword= et_cpassword.getText().toString().trim();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
