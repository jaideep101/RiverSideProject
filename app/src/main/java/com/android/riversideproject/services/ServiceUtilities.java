package com.android.riversideproject.services;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;

import java.util.TimeZone;

public class ServiceUtilities {

    public static String getTimeZone(){
        return TimeZone.getDefault().getID();
    }

    public static String getDeviceUniqueID(Activity activity){
        String device_unique_id = Settings.Secure.getString(activity.getContentResolver(),
                Settings.Secure.ANDROID_ID);
        return device_unique_id;
    }

    public static String getDeviceName() {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        if (model.startsWith(manufacturer)) {
            return model.toUpperCase();
        } else {
            return manufacturer.toUpperCase() + " " + model;
        }
    }


}
