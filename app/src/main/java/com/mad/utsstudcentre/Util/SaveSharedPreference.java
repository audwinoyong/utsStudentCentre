package com.mad.utsstudcentre.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.SharedPreferences.Editor;

/**
 * Created by HP on 7/09/2017.
 */

public class SaveSharedPreference {

    static final String PREF_USERNAME = "username";

    static SharedPreferences getSharedPreferences(Context ctx){
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setUserName(Context ctx, String userName){
        Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USERNAME, userName);
        editor.commit();
    }

    public static String getUserName(Context ctx){
        return getSharedPreferences(ctx).getString(PREF_USERNAME, "");
    }

    public static void clearUserName(Context ctx)
    {
        Editor editor = getSharedPreferences(ctx).edit();
        editor.clear(); //clear all stored data
        editor.commit();
    }

}