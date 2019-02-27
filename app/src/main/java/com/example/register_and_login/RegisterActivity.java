package com.example.register_and_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class RegisterActivity extends AppCompatActivity {

    EditText etFirstname;
    EditText etLastname;
    EditText etDOB;
    EditText etEmail;
    EditText etPassword;
    Button etRegister;

    TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        myTextView = (TextView)findViewById(R.id.textView);

      etFirstname = (EditText) findViewById(R.id.etFirstname);
       etLastname = (EditText) findViewById(R.id.etLastname);
      etDOB = (EditText) findViewById(R.id.etDOB);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
         etRegister = (Button)findViewById(R.id.etRegister);



        etRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent1 = new Intent(RegisterActivity.this,LoginActivity.class);
                RegisterActivity.this.startActivity(registerIntent1);
                checkDataEntered();

            }
        });
    }

    boolean isEmail(EditText text){
        CharSequence etEmail = text.getText().toString();
        return (!TextUtils.isEmpty(etEmail)&& Patterns.EMAIL_ADDRESS.matcher(etEmail).matches());
    }
    boolean isEmpty(EditText text){
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void checkDataEntered() {


        if (isEmpty(etFirstname)) {
            etFirstname.setError("First name required");
        }
        if (isEmpty(etLastname)) {
            etLastname.setError("Lastname required");
        }
        if (isEmail(etEmail) == false) {
            etEmail.setError("Enter Valid Email");
        }
        if (isEmpty(etDOB) ){
            etDOB.setError("Enter Valid Date");
        }
        if (isEmpty(etPassword) ){
            etPassword.setError("Enter Valid Password");
        }

    }
    public void doSomething(View view) {
        myTextView.setText("");
    }
}
