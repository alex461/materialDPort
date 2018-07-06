package com.example.alexander.miappalex.Login.View;

public interface IntfViewLogin {

    void enableImput();
    void disableImput();

    void showProgressBar();
    void hideProgressBar();

    void loginError(String error);

    void goCreateAccont();
    void goHome();
}
