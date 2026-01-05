package com.razorpay;

/* renamed from: com.razorpay.d */
/* loaded from: classes6.dex */
final class RunnableC11899d implements Runnable {

    /* renamed from: a */
    private /* synthetic */ boolean f13735a;

    /* renamed from: b */
    private /* synthetic */ RzpAssist f13736b;

    public RunnableC11899d(RzpAssist rzpAssist, boolean z) {
        this.f13736b = rzpAssist;
        this.f13735a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13736b.webview.getSettings().setUseWideViewPort(this.f13735a);
    }
}
