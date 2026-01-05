package com.razorpay;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class E$_j$ {
    /* renamed from: a */
    public static JSONObject m15984a(boolean z) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("otp_read", z ? 1 : 0);
            return jSONObject;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
            return null;
        }
    }
}
