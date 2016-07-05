package com.penguin.padang.pasir.nyaripasar.presenter;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.penguin.padang.pasir.nyaripasar.model.SessionManagement;
import com.penguin.padang.pasir.nyaripasar.model.User;
import com.penguin.padang.pasir.nyaripasar.presenter.interafaces.LoginPresenterInterface;
import com.penguin.padang.pasir.nyaripasar.view.HomeActivity;
import com.penguin.padang.pasir.nyaripasar.view.LoginActivity;
import com.penguin.padang.pasir.nyaripasar.view.interfaces.LoginInterface;


/**
 * Created by jowy on 6/18/16.
 */

public class LoginPresenter implements LoginPresenterInterface {

    LoginInterface loginActivity;
    ProgressDialog dialog;
    SessionManagement sessionManagement;
    SharedPreferences preferences;
    Context context;

    public LoginPresenter(LoginActivity loginActivity, ProgressDialog dialog) {
        this.loginActivity = loginActivity;
        this.dialog = dialog;
        this.context = (Context) loginActivity;
        checkLogin();
    }

    @Override
    public void checkLogin(){
        preferences = context.getSharedPreferences("UserSession", Context.MODE_PRIVATE);
        Boolean isLoggedIn = preferences.getBoolean("IsUserLogin",false);
        if(isLoggedIn){
            Intent intent = new Intent(context, HomeActivity.class);
            context.startActivity(intent);
        }
    }

    @Override
    public void doLogin(String email, String password) {
        sessionManagement = new SessionManagement(context, dialog, email, password);
        try{
            sessionManagement.checkLogin();
        } catch (Exception e){
            loginActivity.loginFailed("Terjadi Kesalahan");
        }
    }

    @Override
    public void getUser(String email, String password) {

    }

    @Override
    public void setUser(User user) {

    }
}
