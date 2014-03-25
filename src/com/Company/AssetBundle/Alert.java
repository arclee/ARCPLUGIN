package com.Company.AssetBundle;

import android.app.AlertDialog;
import android.app.Activity;
import android.util.Log;
 
public class Alert {

    private Activity mActivity;
    public Alert(Activity currentActivity)
    {
        Log.i("Alert", "Constructor called with currentActivity = " + currentActivity);
        mActivity = currentActivity;
    }
 
    public void showAlert( final String title, final String msg ){
        mActivity.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
                builder.setTitle(title);
                builder.setMessage(msg);
                builder.setPositiveButton("OK", null);
 
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}
