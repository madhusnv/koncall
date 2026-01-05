package com.razorpay;

import android.app.Activity;
import com.google.firebase.messaging.Constants;
import org.json.JSONObject;

/* renamed from: com.razorpay.h */
/* loaded from: classes6.dex */
final class C11903h implements Callback {

    /* renamed from: a */
    private /* synthetic */ Activity f13770a;

    /* renamed from: b */
    private /* synthetic */ JSONObject f13771b;

    /* renamed from: c */
    private /* synthetic */ RzpGpayMerged f13772c;

    public C11903h(RzpGpayMerged rzpGpayMerged, Activity activity, JSONObject jSONObject) {
        this.f13772c = rzpGpayMerged;
        this.f13770a = activity;
        this.f13771b = jSONObject;
    }

    @Override // com.razorpay.Callback
    public final void run(ResponseObject responseObject) {
        try {
            this.f13772c.isUpiOnly = true;
            this.f13772c.apiResponse = new JSONObject(responseObject.getResponseResult());
            JSONObject jSONObject = new JSONObject(responseObject.getResponseResult());
            if (responseObject.getResponseCode() >= 400) {
                this.f13772c.genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "An error occurred while fetching payment details from API.");
            }
            if (jSONObject.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_PROCESS_PAYMENT_PAYLOAD_ERROR);
                this.f13772c.genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, jSONObject.toString());
            } else {
                AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_PROCESS_PAYMENT_CALLED);
                this.f13772c.mPaymentClient.loadPaymentData(this.f13770a, RzpGpayUtilMerged.getPaymentRequestData(responseObject.getResponseResult(), this.f13771b), RzpGpayMerged.LOAD_PAYMENT_DATA_REQUEST_CODE);
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError("RzpGpayMerged", "S0", e.getMessage());
            this.f13772c.genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "An internal error has occurred.");
        }
    }
}
