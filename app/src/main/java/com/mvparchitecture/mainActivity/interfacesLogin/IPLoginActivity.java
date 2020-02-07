package com.mvparchitecture.mainActivity.interfacesLogin;

import com.mvparchitecture.mainActivity.loginRresponseModel.LoginResponseModel;

public interface IPLoginActivity {

    void startLogin(String email, String phone_number,
                    String password, String device_token,
                    String login_type , String lattitude,
                    String longitude);

    void successResponseFromModel(LoginResponseModel loginResponseModel);
    void faildResponseFromModel(String message);
    void invalidRequestFromModel(String message);

}
