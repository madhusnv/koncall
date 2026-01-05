package com.razorpay;

/* loaded from: classes6.dex */
public interface PaymentResultListener {
    void onPaymentError(int i, String str);

    void onPaymentSuccess(String str);
}
