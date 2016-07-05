package com.penguin.padang.pasir.nyaripasar.infrastructure.services;

import com.penguin.padang.pasir.nyaripasar.infrastructure.utilities.Constanta;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jowy on 7/2/16.
 */
public class RetrofitBridge {

    public RetrofitBridge() {

    }

    public static void init(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constanta.SECOND_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
