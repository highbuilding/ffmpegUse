package com.zhonghuai.ffmpeg;

import android.util.Log;

public class AVToolHelper {
    private static final String TAG = "AVToolHelper";

    static {
        Log.i(TAG, "static loadLibrary");
        System.loadLibrary("av-ffmpeg");
    }

    public static String GetFFmpegVersion() {
        return native_GetFFmpegVersion();
    }

    private static native String native_GetFFmpegVersion();

}
