package com.zhaowh.okweather.util;

import android.util.Log;

public class LogUtil {

    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;

    public static int level = VERBOSE;

    public void v(String tag, String msg){
        if(level <= VERBOSE){
            Log.v(tag, msg);
        }
    }

    public void d(String tag, String msg){
        if(level <= DEBUG){
            Log.d(tag, msg);
        }
    }

    public void i(String tag, String msg){
        if(level <= INFO){
            Log.i(tag, msg);
        }
    }

    public void w(String tag, String msg){
        if(level <= WARN){
            Log.w(tag, msg);
        }
    }

    public void e(String tag, String msg){
        if(level <= ERROR){
            Log.e(tag, msg);
        }
    }

}
