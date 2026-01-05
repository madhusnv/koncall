package com.razorpay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RzpTokenReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String string;
        String strM16057b = f$_G$.m16057b(context);
        if (TextUtils.isEmpty(strM16057b)) {
            return;
        }
        Bundle resultExtras = getResultExtras(true);
        JSONArray jSONArray = new JSONArray();
        if (resultExtras != null && (string = resultExtras.getString("device_token_info_list")) != null) {
            try {
                jSONArray = new JSONArray(string);
            } catch (Exception unused) {
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rzp_device_token", strM16057b);
            jSONObject.put("card_saving_token_source", context.getPackageName());
            jSONArray.put(jSONObject);
        } catch (Throwable unused2) {
        }
        resultExtras.putString("device_token_info_list", jSONArray.toString());
    }
}
