package com.mvparchitecture.retrofit;

import com.mvparchitecture.mainActivity.loginRresponseModel.LoginResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {


    public static final int LOGIN_SUCCESS = 1;
    public static final int LOGIN_FAILED = 2;
    public static final int LOGIN_INVALID_REQUEST = 20;


    // TODO user_login api for existing user login
    @FormUrlEncoded
    @POST("user_login")
    Call<LoginResponseModel> user_Login(@Field("email") String email,
                                        @Field("phone_number") String phone_number,
                                        @Field("password") String password,
                                        @Field("device_token") String device_token,
                                        @Field("login_type") String login_type,
                                        @Field("lattitude") String lattitude,
                                        @Field("longitude") String longitude);
}
