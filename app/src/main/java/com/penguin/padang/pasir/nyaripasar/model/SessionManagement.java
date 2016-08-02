package com.penguin.padang.pasir.nyaripasar.model;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.penguin.padang.pasir.nyaripasar.infrastructure.services.LoginAPIService;
import com.penguin.padang.pasir.nyaripasar.infrastructure.utilities.Constanta;
import com.penguin.padang.pasir.nyaripasar.view.HomeActivity;
import com.penguin.padang.pasir.nyaripasar.view.LoginActivity;
import com.penguin.padang.pasir.nyaripasar.view.MainActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jowy on 6/20/16.
 */
public class SessionManagement {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Retrofit retrofit;
    ProgressDialog dialog;

    Context context;

    public static final String IS_USER_LOGIN = "IsUserLogin";
    public static final String KEY_ID = "Id";
    public static final String KEY_NAME = "Name";
    public static final String KEY_EMAIL = "Email";
    public static final String KEY_PASSWORD = "Password";

    private String email;
    private String password;
    private boolean isLoggedIn = false;

    public SessionManagement(Context context, ProgressDialog dialog, String email, String password){
        this.context = context;
        this.dialog = dialog;
        this.sharedPreferences = context.getSharedPreferences("UserSession", Context.MODE_APPEND);
        this.email = email;
        this.password = password;
    }

    public boolean checkLogin(){
        initRetrofit();
        checkUser();

        return isLoggedIn;
    }

    private void initRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl(Constanta.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private void checkUser(){
        LoginAPIService apiService = retrofit.create(LoginAPIService.class);
        Call<User> result = apiService.getLogin(email, password);

        System.out.println(result);
        result.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                dialog.dismiss();
                try{

                    User resUser = response.body();

                    if(resUser.getLogin().equals(true)){
                        setSession(resUser);
                        Intent intent = new Intent(context, HomeActivity.class);
                        context.startActivity(intent);
                    }else {
                        Toast.makeText(SessionManagement.this.context, "email atau password salah!", Toast.LENGTH_SHORT).show();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable throwable) {
                dialog.dismiss();
                throwable.printStackTrace();
            }
        });
    }

    private void setSession(User user){
        editor = sharedPreferences.edit();
        editor.putBoolean(IS_USER_LOGIN, true);
        editor.putString(KEY_ID, user.getId());
        editor.putString(KEY_NAME, user.getName());
        editor.putString(KEY_EMAIL, user.getEmail());

        editor.commit();
    }

    /**
     *
     * @return isLoggedIn
     */
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    /**
     *
     * @param loggedIn
     */
    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
