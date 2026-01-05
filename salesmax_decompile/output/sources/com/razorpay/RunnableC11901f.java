package com.razorpay;

import android.widget.Toast;

/* renamed from: com.razorpay.f */
/* loaded from: classes6.dex */
final class RunnableC11901f implements Runnable {

    /* renamed from: a */
    private /* synthetic */ String f13741a;

    /* renamed from: b */
    private /* synthetic */ RzpAssist f13742b;

    public RunnableC11901f(RzpAssist rzpAssist, String str) {
        this.f13742b = rzpAssist;
        this.f13741a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f13742b.activity, this.f13741a, 1).show();
    }
}
