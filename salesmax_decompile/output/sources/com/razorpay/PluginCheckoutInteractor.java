package com.razorpay;

/* loaded from: classes6.dex */
public interface PluginCheckoutInteractor extends CheckoutInteractor {
    void processPayment(String str);

    void verifyGPayResponse(String str);
}
