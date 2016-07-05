package com.penguin.padang.pasir.nyaripasar.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.penguin.padang.pasir.nyaripasar.R;
import com.penguin.padang.pasir.nyaripasar.presenter.LoginPresenter;
import com.penguin.padang.pasir.nyaripasar.presenter.interafaces.LoginPresenterInterface;
import com.penguin.padang.pasir.nyaripasar.view.interfaces.LoginInterface;

public class LoginActivity extends AppCompatActivity implements LoginInterface {

    LoginPresenterInterface loginPresenter;
    ProgressDialog dialog;
    SharedPreferences preferences;

    TextView llg;
    TextView login;
    TextView signup;
    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login_main);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),"fonts/Lato-Light.ttf");

        user = (EditText) findViewById(R.id.user);
        user.setTypeface(custom_font);

        pass = (EditText)findViewById(R.id.pass);
        pass.setTypeface(custom_font);

        login = (TextView)findViewById(R.id.login);
        login.setTypeface(custom_font);

        signup = (TextView)findViewById(R.id.signup);
        signup.setTypeface(custom_font);

        llg = (TextView)findViewById(R.id.llg);
        llg.setTypeface(custom_font);

        dialog = new ProgressDialog(this);
        dialog.setIndeterminate(true);

        loginPresenter = new LoginPresenter(LoginActivity.this, dialog);

        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(LoginActivity.this,MainActivity_2.class);
                startActivity(it);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
                loginPresenter.doLogin(user.getText().toString(), pass.getText().toString());
            }
        });
    }

    @Override
    public void loginFailed(String message) {
        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(LoginActivity.this, "success", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
