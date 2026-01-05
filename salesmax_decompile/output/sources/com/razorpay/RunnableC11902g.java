package com.razorpay;

import com.razorpay.AnalyticsProperty;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.razorpay.g */
/* loaded from: classes6.dex */
final class RunnableC11902g implements Runnable {

    /* renamed from: a */
    private /* synthetic */ String f13743a;

    /* renamed from: b */
    private /* synthetic */ RzpAssist f13744b;

    public RunnableC11902g(RzpAssist rzpAssist, String str) {
        this.f13744b = rzpAssist;
        this.f13743a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            JSONObject jSONObject = new JSONObject(this.f13743a);
            OTP otp = new OTP(jSONObject.getString("otp"), jSONObject.getString("sender"), jSONObject.getString("bank"));
            HashMap map = new HashMap();
            map.put("sender", otp.f13659a);
            if (otp.f13659a.contains("RZRPAY")) {
                this.f13744b.isRazorpayOtpReceived = true;
                map.put("razorpay_otp", Boolean.TRUE);
            } else {
                map.put("razorpay_otp", Boolean.FALSE);
                this.f13744b.otpRead = true;
                AnalyticsUtil.addProperty("payment_otp_received", new AnalyticsProperty(true, AnalyticsProperty.Scope.PAYMENT));
            }
            AnalyticsUtil.trackEvent(AnalyticsEvent.OTP_RECEIVED, AnalyticsUtil.getJSONResponse(map));
        } catch (Exception e) {
            d__1_.m16053a("Error in parsing json", e);
        }
    }
}
