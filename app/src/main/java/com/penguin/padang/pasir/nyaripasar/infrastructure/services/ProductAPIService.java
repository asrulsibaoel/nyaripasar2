package com.penguin.padang.pasir.nyaripasar.infrastructure.services;

import android.support.annotation.Nullable;

import com.penguin.padang.pasir.nyaripasar.infrastructure.utilities.Constanta;
import com.penguin.padang.pasir.nyaripasar.model.Product;
import com.penguin.padang.pasir.nyaripasar.model.ProductList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by jowy on 7/2/16.
 */
public interface ProductAPIService {

    @FormUrlEncoded
    @POST(Constanta.LOGIN_URL)
    Call<Product> getLogin(
            @Field("page") int page
    );


    @GET(Constanta.PRODUCT_LIST)
    Call<ProductList> getListProduct(
            @Query("page") int page
    );
}
