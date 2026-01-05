package com.razorpay;

import com.razorpay.CheckoutBridge;

/* loaded from: classes6.dex */
final class h__y_ implements CheckoutBridge.WebViewSafeCheckCallback {

    /* renamed from: a */
    private /* synthetic */ String f13773a;

    /* renamed from: b */
    private /* synthetic */ CheckoutBridge f13774b;

    public h__y_(CheckoutBridge checkoutBridge, String str) {
        this.f13774b = checkoutBridge;
        this.f13773a = str;
    }

    @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
    public final void secure() {
        this.f13774b.interactor.onFault(this.f13773a);
    }

    @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
    public final void unSecure() {
    }
}
