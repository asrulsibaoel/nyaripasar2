package com.penguin.padang.pasir.nyaripasar.presenter.fragments;

import com.penguin.padang.pasir.nyaripasar.infrastructure.services.ProductAPIService;
import com.penguin.padang.pasir.nyaripasar.infrastructure.services.RetrofitBridge;
import com.penguin.padang.pasir.nyaripasar.infrastructure.utilities.Constanta;
import com.penguin.padang.pasir.nyaripasar.model.Product;
import com.penguin.padang.pasir.nyaripasar.model.ProductList;
import com.penguin.padang.pasir.nyaripasar.presenter.interafaces.FragmentPresenterInterface;
import com.penguin.padang.pasir.nyaripasar.view.interfaces.FragmentViewInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jowy on 7/2/16.
 */
public class HomeFragmentPresenter implements FragmentPresenterInterface {

    FragmentViewInterface view;
    private Retrofit retrofit;

    public HomeFragmentPresenter(FragmentViewInterface view) {
        this.view = view;
    }

    @Override
    public void loadData(int page) {
//        RetrofitBridge.init();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constanta.SECOND_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ProductAPIService apiService = retrofit.create(ProductAPIService.class);
        Call<ProductList> listProduct = apiService.getListProduct(1);

        listProduct.enqueue(new Callback<ProductList>() {
            @Override
            public void onResponse(Call<ProductList> call, Response<ProductList> response) {
                try {
                    ProductList products = response.body();
                    List<Product> listProduct = products.getData();

                    for (int i = 0; i < listProduct.size(); i++) {
                        Product product = listProduct.get(i);
                        System.out.println(product.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ProductList> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}
