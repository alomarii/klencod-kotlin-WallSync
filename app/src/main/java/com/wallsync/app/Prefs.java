package com.wallsync.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

final class Prefs {
    static SharedPreferences p(Context c) {
        return c.getApplicationContext().getSharedPreferences("ws", Context.MODE_PRIVATE);
    }
    static String url(Context c) {
        String u = p(c).getString("url", "").trim();
        while (u.endsWith("/")) u = u.substring(0, u.length() - 1);
        return u;
    }
    static String code(Context c) { return p(c).getString("code", "").trim(); }
    static String dev(Context c) {
        String d = p(c).getString("dev", null);
        if (d == null) {
            d = UUID.randomUUID().toString().substring(0, 8);
            p(c).edit().putString("dev", d).apply();
        }
        return d;
    }
    static boolean ready(Context c) {
        return url(c).startsWith("https://") && code(c).length() >= 6;
    }
}
