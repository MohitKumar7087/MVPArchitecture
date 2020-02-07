package com.mvparchitecture.utils;

import android.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.Html;
import android.util.Log;


public class Utility {

    public static boolean isNetworkConnectionAvailable(Context context){
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnected();

        if(isConnected) {
            Log.d("Network", "Connected");

            return true;
        }
        else{
            checkNetworkConnection(context);
            Log.d("Network","Not Connected");
            return false;
        }
    }

    public static void checkNetworkConnection(final Context context){
        AlertDialog.Builder builder =new AlertDialog.Builder(context);
        builder.setTitle(Html.fromHtml("<b>"+"No internet Connection"+"</b>"));
        builder.setMessage("Please check your internet Setting and try again");
        builder.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                isNetworkConnectionAvailable(context);
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
