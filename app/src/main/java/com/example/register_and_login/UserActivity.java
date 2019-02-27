package com.example.register_and_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //final TextView etUsername = (TextView) findViewById(R.id.textView4);
        //final TextView etAge = (TextView) findViewById(R.id.textView5);
        final TextView welcomeMessage = (TextView) findViewById(R.id.welcomeMessage);
        final Button buttonback = (Button)findViewById(R.id.buttonback);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoutIntent = new Intent(UserActivity.this,LoginActivity.class);
                UserActivity.this.startActivity(logoutIntent);
                //startActivity(toy);
            }
        });
    }

}
