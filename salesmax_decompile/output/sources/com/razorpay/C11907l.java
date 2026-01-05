package com.razorpay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.Constants;
import org.json.JSONObject;

/* renamed from: com.razorpay.l */
/* loaded from: classes6.dex */
final class C11907l {

    /* renamed from: a */
    private static SharedPreferences f13780a;

    /* renamed from: b */
    private static SharedPreferences.Editor f13781b;

    /* renamed from: a */
    public static SharedPreferences m16078a(Context context) {
        if (f13780a == null) {
            f13780a = context.getSharedPreferences("rzp_preference_private", 0);
        }
        return f13780a;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public static SharedPreferences.Editor m16081b(Context context) {
        if (f13781b == null) {
            f13781b = m16078a(context).edit();
        }
        return f13781b;
    }

    /* renamed from: c */
    public static SharedPreferences m16083c(Context context) {
        try {
            return context.getSharedPreferences("rzp_preference_public", 0);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
            return context.getSharedPreferences("rzp_preference_public", 0);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: d */
    public static SharedPreferences.Editor m16084d(Context context) {
        return m16083c(context).edit();
    }

    /* renamed from: a */
    public static String m16080a(Context context, String str, String str2) {
        try {
            String strM16079a = m16079a(context, str);
            if (strM16079a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM16079a);
            CryptLib cryptLib = new CryptLib();
            if (str2.equals(jSONObject.getString("sdk_version"))) {
                return cryptLib.m15981b(jSONObject.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), "c", jSONObject.getString("iv"));
            }
            return null;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getLocalizedMessage());
            d__1_.m16053a("Unable to decrypt value", e);
            return null;
        }
    }

    /* renamed from: b */
    public static void m16082b(Context context, String str, String str2) {
        SharedPreferences.Editor editorM16081b = m16081b(context);
        editorM16081b.putString(str, str2);
        editorM16081b.commit();
    }

    /* renamed from: a */
    public static String m16079a(Context context, String str) {
        return m16078a(context).getString(str, null);
    }
}
