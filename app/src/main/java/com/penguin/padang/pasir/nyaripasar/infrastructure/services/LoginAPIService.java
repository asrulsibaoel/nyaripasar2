package com.penguin.padang.pasir.nyaripasar.infrastructure.services;

import com.penguin.padang.pasir.nyaripasar.infrastructure.utilities.Constanta;
import com.penguin.padang.pasir.nyaripasar.model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by jowy on 6/20/16.
 */
public interface LoginAPIService {

    @FormUrlEncoded
    @POST(Constanta.LOGIN_URL)
    Call<User> getLogin(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET(Constanta.USER_LIST)
    Call<User> getListUser();
}
