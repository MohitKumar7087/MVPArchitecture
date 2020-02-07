package com.mvparchitecture.retrofit;
import android.os.Handler;
import android.os.Message;

import com.mvparchitecture.mainActivity.loginRresponseModel.LoginResponseModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitCalls {

    public APIInterface apiInterface;

    public RetrofitCalls() {

        apiInterface = APIClient.getClient().create(APIInterface.class);
    }
    /*userLogin_Api method call for user login in app if register/already register*/
    public void userLogin_Api(String email, String phone_number, String password, String device_token, String login_type,
                              String lattitude, String longitude, final Handler mHandler) {

        final Message message = new Message();
        Call<LoginResponseModel> call = apiInterface.user_Login(email, phone_number, password, device_token, login_type, lattitude, longitude);
        call.enqueue(new Callback<LoginResponseModel>() {
            @Override
            public void onResponse(Call<LoginResponseModel> call,
                                   Response<LoginResponseModel> response) {
                if (response.body() != null) {
                    if (response.body().getStatus().equalsIgnoreCase("200")) {
                        message.what = apiInterface.LOGIN_SUCCESS;
                        message.obj = response.body();
                        mHandler.sendMessage(message);
                    } else if (response.body().getStatus().equalsIgnoreCase("401")) {
                        message.what = apiInterface.LOGIN_INVALID_REQUEST;
                        message.obj = response.body().getMessage();
                        mHandler.sendMessage(message);
                    } else {
                        message.what = apiInterface.LOGIN_FAILED;
                        message.obj = response.body().getMessage();
                        mHandler.sendMessage(message);
                    }
                }
            }
            @Override
            public void onFailure(Call<LoginResponseModel> call, Throwable t) {
                message.what = apiInterface.LOGIN_FAILED;
                message.obj = t.getMessage();
                mHandler.sendMessage(message);
            }
        });

    }
}
