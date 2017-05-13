package com.example.huishuaishuai.utils.utils;

import android.util.Log;

/**
 * Created by huishuaishuai on 2017/5/11.
 * Log统一管理类
 */

public class L {
    private L() {
        /*cannot be instantiated*/
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isDebug = true; //是否需要打印bug，可以在application的onCreat方法中初始化

    public static final String TAG = "way";

    //下面四个是默认TAG函数
    public static void i(String msg) {
        if (isDebug) {
            Log.i(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }

    public static void v(String msg) {
        if (isDebug) {
            Log.v(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    //下面四个是自定义TAG函数
    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (isDebug) {
            Log.v(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }
}
