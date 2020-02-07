package com.mvparchitecture.mainActivity.interfacesLogin;

import com.mvparchitecture.mainActivity.loginRresponseModel.LoginResponseModel;

public interface ILoginActivity {

    void loginSuccessFromPresenter(LoginResponseModel loginResponseModel);
    void loginFailedFromPresenter(String message);
    void loginInvalidFromPresenter(String message);
}
