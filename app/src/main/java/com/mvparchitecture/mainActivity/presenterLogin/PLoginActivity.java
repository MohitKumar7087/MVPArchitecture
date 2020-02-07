package com.mvparchitecture.mainActivity.presenterLogin;

import com.mvparchitecture.mainActivity.LoginActivity;
import com.mvparchitecture.mainActivity.interfacesLogin.ILoginActivity;
import com.mvparchitecture.mainActivity.interfacesLogin.IMLoginActivity;
import com.mvparchitecture.mainActivity.interfacesLogin.IPLoginActivity;
import com.mvparchitecture.mainActivity.loginRresponseModel.LoginResponseModel;
import com.mvparchitecture.mainActivity.modelLogin.MLoginActivity;

public class PLoginActivity implements IPLoginActivity {

    ILoginActivity iLoginActivity;
    IMLoginActivity imLoginActivity;
    public PLoginActivity(LoginActivity loginActivity) {
        this.iLoginActivity=loginActivity;
    }

    @Override
    public void startLogin(String email, String phone_number, String password, String device_token, String login_type, String lattitude, String longitude) {
        imLoginActivity=new MLoginActivity(this);
        imLoginActivity.loginRestCalls(email,phone_number,password,device_token,login_type,lattitude,longitude);
    }

    @Override
    public void successResponseFromModel(LoginResponseModel loginResponseModel) {
        iLoginActivity.loginSuccessFromPresenter(loginResponseModel);
    }

    @Override
    public void faildResponseFromModel(String message) {
        iLoginActivity.loginFailedFromPresenter(message);
    }

    @Override
    public void invalidRequestFromModel(String message) {
        iLoginActivity.loginInvalidFromPresenter(message);
    }
}
