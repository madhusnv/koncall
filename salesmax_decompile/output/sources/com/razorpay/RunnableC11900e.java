package com.razorpay;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.razorpay.e */
/* loaded from: classes6.dex */
final class RunnableC11900e implements Runnable {

    /* renamed from: a */
    private /* synthetic */ RzpAssist f13739a;

    public RunnableC11900e(RzpAssist rzpAssist) {
        this.f13739a = rzpAssist;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InputMethodManager) this.f13739a.activity.getSystemService("input_method")).showSoftInput(this.f13739a.webview, 0);
    }
}
