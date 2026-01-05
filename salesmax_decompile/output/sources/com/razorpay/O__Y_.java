package com.razorpay;

import com.razorpay.CheckoutBridge;

/* loaded from: classes6.dex */
final class O__Y_ implements CheckoutBridge.WebViewSafeCheckCallback {

    /* renamed from: a */
    private /* synthetic */ String f13663a;

    /* renamed from: b */
    private /* synthetic */ CheckoutBridge f13664b;

    public O__Y_(CheckoutBridge checkoutBridge, String str) {
        this.f13664b = checkoutBridge;
        this.f13663a = str;
    }

    @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
    public final void secure() {
        this.f13664b.interactor.onSubmit(this.f13663a);
    }

    @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
    public final void unSecure() {
    }
}
