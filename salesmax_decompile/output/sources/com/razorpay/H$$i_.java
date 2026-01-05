package com.razorpay;

/* loaded from: classes6.dex */
final class H$$i_ implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CheckoutPresenterImpl f13623a;

    /* renamed from: b */
    private /* synthetic */ String f13624b;

    /* renamed from: c */
    private /* synthetic */ String f13625c;

    /* renamed from: d */
    private /* synthetic */ String f13626d;

    public H$$i_(CheckoutPresenterImpl checkoutPresenterImpl, String str, String str2, String str3) {
        this.f13623a = checkoutPresenterImpl;
        this.f13624b = str;
        this.f13625c = str2;
        this.f13626d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckoutUtils.m15973a(this.f13623a.activity, this.f13624b, this.f13625c, this.f13626d, new J__n_(this));
    }
}
