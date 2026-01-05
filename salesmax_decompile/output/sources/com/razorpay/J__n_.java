package com.razorpay;

import com.razorpay.CheckoutUtils;

/* loaded from: classes6.dex */
final class J__n_ implements CheckoutUtils.BackButtonDialogCallback {

    /* renamed from: a */
    private /* synthetic */ H$$i_ f13641a;

    public J__n_(H$$i_ h$$i_) {
        this.f13641a = h$$i_;
    }

    @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
    public final void onNegativeButtonClick() {
        this.f13641a.f13623a.view.loadUrl(1, String.format("javascript: CheckoutBridge.isPositiveButtonClicked({isClicked: %s})", Boolean.FALSE));
    }

    @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
    public final void onPositiveButtonClick() {
        this.f13641a.f13623a.view.loadUrl(1, String.format("javascript: CheckoutBridge.isPositiveButtonClicked({isClicked: %s})", Boolean.TRUE));
    }
}
