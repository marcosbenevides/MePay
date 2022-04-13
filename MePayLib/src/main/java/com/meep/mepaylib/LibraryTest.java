package com.meep.mepaylib;

import android.util.Log;

import java.util.Locale;

public class LibraryTest {
    private static final String TAG = "LibraryTest";

    public static int sum(int a, int b) {
        int result = a + b;
        String resultStr = String.format(Locale.getDefault(), "Result sum %d + %d = %d", a, b, result);

        Log.d(TAG, resultStr);

        return result;
    }
}
