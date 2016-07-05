package com.penguin.padang.pasir.nyaripasar.presenter.interafaces;

import com.penguin.padang.pasir.nyaripasar.model.User;

/**
 * Created by jowy on 6/19/16.
 */
public interface LoginPresenterInterface extends Presenter {

    void checkLogin();

    void doLogin(String email, String password);

    void getUser(String email, String password);

    void setUser(User user);
}
