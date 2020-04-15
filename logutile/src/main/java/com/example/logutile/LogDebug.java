package com.example.logutile;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "LogDebug";

    public static void db(String message){
        Log.e(TAG, message );
    }
}
