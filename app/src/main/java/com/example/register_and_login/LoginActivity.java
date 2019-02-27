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

public class LoginActivity extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    Button button;
    TextView registerLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        etUsername = (EditText) findViewById(R.id.etUsername);
      etPassword = (EditText) findViewById(R.id.etPassword);
        button = (Button) findViewById(R.id.button);
        registerLink = (TextView) findViewById(R.id.textView);




        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkDataEntered();
                    Intent loginIntent = new Intent(LoginActivity.this,UserActivity.class);
                    LoginActivity.this.startActivity(loginIntent);
                    //startActivity(toy);
                }
            });

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }


    boolean isEmpty(EditText text){
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void checkDataEntered() {


        if (isEmpty(etUsername)) {
            etUsername.setError("Username required");
        }
        if (isEmpty(etPassword)) {
            etPassword.setError("Password required");
        }
    }
}
