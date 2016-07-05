package com.penguin.padang.pasir.nyaripasar.view;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.penguin.padang.pasir.nyaripasar.R;

public class MainActivity_2 extends AppCompatActivity {

    EditText user;
    EditText email;
    EditText pass;
    EditText mob;

    TextView login;
    TextView signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/Lato-Light.ttf");

        user = (EditText) findViewById(R.id.user);
        user.setTypeface(custom_font);

        pass = (EditText)findViewById(R.id.pass);
        pass.setTypeface(custom_font);

        email = (EditText) findViewById(R.id.email);
        email.setTypeface(custom_font);

        mob = (EditText) findViewById(R.id.mob);
        mob.setTypeface(custom_font);

        login = (TextView)findViewById(R.id.login);
        login.setTypeface(custom_font);

        signup = (TextView)findViewById(R.id.signup);
        signup.setTypeface(custom_font);


           login.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent it = new Intent(MainActivity_2.this,LoginActivity.class);
                   startActivity(it);
               }
           });

    }
}
