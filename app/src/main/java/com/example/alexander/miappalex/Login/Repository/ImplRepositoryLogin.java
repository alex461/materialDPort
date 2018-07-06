package com.example.alexander.miappalex.Login.Repository;

import com.example.alexander.miappalex.Login.Presenter.IntfPresenterLogin;

public class ImplRepositoryLogin implements IntfRepositoryLogin {

    IntfPresenterLogin intfPresenterLogin;

    public ImplRepositoryLogin(IntfPresenterLogin intfPresenterLogin) {
        this.intfPresenterLogin = intfPresenterLogin;
    }

    @Override
    public void singIn(String username, String password) {
        boolean success= true;
        if(success){
            intfPresenterLogin.loginSuccess();
        }else {
            intfPresenterLogin.loginError("ocurrio un error");
        }

    }


}
