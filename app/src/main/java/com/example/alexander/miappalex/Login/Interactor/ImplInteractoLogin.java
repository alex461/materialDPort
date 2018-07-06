package com.example.alexander.miappalex.Login.Interactor;

import com.example.alexander.miappalex.Login.Presenter.IntfPresenterLogin;
import com.example.alexander.miappalex.Login.Repository.ImplRepositoryLogin;
import com.example.alexander.miappalex.Login.Repository.IntfRepositoryLogin;

public class ImplInteractoLogin implements IntfIteractorLogin {

    private IntfPresenterLogin intfPresenterLogin;
    private IntfRepositoryLogin intfRepositoryLogin;


    public ImplInteractoLogin(IntfPresenterLogin intfPresenterLogin) {
        this.intfPresenterLogin = intfPresenterLogin;
        intfRepositoryLogin= new ImplRepositoryLogin(intfPresenterLogin);

    }

    @Override
    public void singIn(String username, String password) {
        intfRepositoryLogin.singIn(username,password);
    }
}
