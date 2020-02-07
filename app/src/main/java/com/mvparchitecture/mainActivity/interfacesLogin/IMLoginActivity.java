package com.mvparchitecture.mainActivity.interfacesLogin;

public interface IMLoginActivity {
    void loginRestCalls(String email, String phone_number,
                        String password, String device_token,
                        String login_type , String lattitude,
                        String longitude);
}
