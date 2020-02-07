package com.mvparchitecture.mainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mvparchitecture.R;
import com.mvparchitecture.mainActivity.interfacesLogin.ILoginActivity;
import com.mvparchitecture.mainActivity.interfacesLogin.IPLoginActivity;
import com.mvparchitecture.mainActivity.loginRresponseModel.LoginResponseModel;
import com.mvparchitecture.mainActivity.presenterLogin.PLoginActivity;
import com.mvparchitecture.utils.CommonMethods;
import com.mvparchitecture.utils.Utility;

public class LoginActivity extends AppCompatActivity implements ILoginActivity {
    EditText email, password;
    Button login;
    Context context;
    IPLoginActivity ipLoginActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = LoginActivity.this;
        initViews();
        presenterInit();

    }

    private void presenterInit() {
        ipLoginActivity = new PLoginActivity(this);
    }

    private void initViews() {
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validationOnLogin();
            }
        });
    }


    private void validationOnLogin() {

        if (Utility.isNetworkConnectionAvailable(context)) {
            if (email.getText().toString().trim().isEmpty()) {
                Toast.makeText(context, "Please enter register email", Toast.LENGTH_SHORT).show();
            } else if (!CommonMethods.isValidEmail(email.getText().toString())) {
                Toast.makeText(context, "Please enter valid email", Toast.LENGTH_SHORT).show();
            } else if (password.getText().toString().trim().isEmpty()) {
                Toast.makeText(context, "Please enter password", Toast.LENGTH_SHORT).show();


            } else {

                /*TODO
                 Api call for user login from app
                * for type 1 simple login*/
                ipLoginActivity.startLogin(email.getText().toString().trim(), "", password.getText().toString().trim(),
                        "12345678788", "1", "30.704649", "76.717873");

            }
        }

    }

    @Override
    public void loginSuccessFromPresenter(LoginResponseModel loginResponseModel) {
        Toast.makeText(context, "" + loginResponseModel.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailedFromPresenter(String message) {
        Toast.makeText(context, "" + message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginInvalidFromPresenter(String message) {
        Toast.makeText(context, "" + message, Toast.LENGTH_SHORT).show();

    }
}
