package com.mvparchitecture.mainActivity.modelLogin;

import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;

import com.mvparchitecture.mainActivity.interfacesLogin.IMLoginActivity;
import com.mvparchitecture.mainActivity.interfacesLogin.IPLoginActivity;
import com.mvparchitecture.mainActivity.loginRresponseModel.LoginResponseModel;
import com.mvparchitecture.mainActivity.presenterLogin.PLoginActivity;
import com.mvparchitecture.retrofit.APIInterface;
import com.mvparchitecture.retrofit.RetrofitCalls;

public class MLoginActivity implements IMLoginActivity {

    IPLoginActivity ipLoginActivity;

    public MLoginActivity(PLoginActivity pLoginActivity) {
        ipLoginActivity = pLoginActivity;
    }

    @Override
    public void loginRestCalls(String email, String phone_number, String password, String device_token, String login_type, String lattitude, String longitude) {
        RetrofitCalls retrofitCalls = new RetrofitCalls();
        retrofitCalls.userLogin_Api(email, phone_number, password, device_token, login_type, lattitude, longitude, mHandler);
    }

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            switch (msg.what) {

                case APIInterface.LOGIN_SUCCESS:
                    LoginResponseModel loginResponseModel = ((LoginResponseModel) msg.obj);
                    ipLoginActivity.successResponseFromModel(loginResponseModel);
                    break;
                case APIInterface.LOGIN_FAILED:
                    String loginFailed = String.valueOf(msg.obj);
                    ipLoginActivity.faildResponseFromModel(loginFailed);
                    break;
                case APIInterface.LOGIN_INVALID_REQUEST:
                    String loginIvalid = String.valueOf(msg.obj);
                    ipLoginActivity.invalidRequestFromModel(loginIvalid);
                    break;
            }
        }
    };
}
