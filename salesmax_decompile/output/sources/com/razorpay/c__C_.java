package com.razorpay;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class c__C_ implements RzpJSONCallback {
    @Override // com.razorpay.RzpJSONCallback
    public final void onResponse(JSONObject jSONObject) {
        try {
            if (jSONObject.getString("ip") != null) {
                BaseUtils.ipAddress = jSONObject.getString("ip");
            }
        } catch (JSONException unused) {
        }
    }
}
