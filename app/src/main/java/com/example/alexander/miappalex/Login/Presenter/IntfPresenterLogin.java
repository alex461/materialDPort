package com.example.alexander.miappalex.Login.Presenter;

public interface IntfPresenterLogin  {

    void singIn(String username, String password); //interactor
    void loginSuccess();
    void loginError(String error);
}
