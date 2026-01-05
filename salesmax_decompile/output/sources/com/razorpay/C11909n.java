package com.razorpay;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.JavascriptInterface;

/* renamed from: com.razorpay.n */
/* loaded from: classes6.dex */
final class C11909n {

    /* renamed from: a */
    private SharedPreferences f13786a;

    /* renamed from: b */
    private SharedPreferences.Editor f13787b;

    public C11909n(Context context) {
        this.f13786a = context.getSharedPreferences("rzp_preferences_storage_bridge", 0);
        this.f13787b = context.getSharedPreferences("rzp_preferences_storage_bridge", 0).edit();
    }

    @JavascriptInterface
    public final boolean getBoolean(String str) {
        try {
            return this.f13786a.getBoolean(str, false);
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public final float getFloat(String str) {
        try {
            return this.f13786a.getFloat(str, 0.0f);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @JavascriptInterface
    public final int getInt(String str) {
        try {
            return this.f13786a.getInt(str, 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    @JavascriptInterface
    public final String getString(String str) {
        try {
            return this.f13786a.getString(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    @JavascriptInterface
    public final void setBoolean(String str, boolean z) {
        try {
            this.f13787b.putBoolean(str, z);
            this.f13787b.commit();
        } catch (Exception e) {
            d__1_.m16053a("Error saving boolean", e);
        }
    }

    @JavascriptInterface
    public final void setFloat(String str, float f) {
        try {
            this.f13787b.putFloat(str, f);
            this.f13787b.commit();
        } catch (Exception e) {
            d__1_.m16053a("Error saving float", e);
        }
    }

    @JavascriptInterface
    public final void setInt(String str, int i) {
        try {
            this.f13787b.putInt(str, i);
            this.f13787b.commit();
        } catch (Exception e) {
            d__1_.m16053a("Error saving integer", e);
        }
    }

    @JavascriptInterface
    public final void setString(String str, String str2) {
        try {
            this.f13787b.putString(str, str2);
            this.f13787b.commit();
        } catch (Exception e) {
            d__1_.m16053a("Error saving string", e);
        }
    }
}
