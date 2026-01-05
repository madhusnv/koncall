package com.razorpay;

import android.content.Context;
import android.util.TypedValue;
import com.razorpay.CheckoutBridge;

/* renamed from: com.razorpay.b */
/* loaded from: classes6.dex */
final class C11897b {

    /* renamed from: com.razorpay.b$_f_ */
    final class _f_ implements Runnable {

        /* renamed from: a */
        private /* synthetic */ int f13725a;

        /* renamed from: b */
        private /* synthetic */ CheckoutBridge.WebViewSafeCheckCallback f13726b;

        /* renamed from: c */
        private /* synthetic */ CheckoutPresenterImpl f13727c;

        public _f_(CheckoutPresenterImpl checkoutPresenterImpl, int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
            this.f13727c = checkoutPresenterImpl;
            this.f13725a = i;
            this.f13726b = webViewSafeCheckCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13727c.executeWebViewCallback(this.f13725a, this.f13726b);
        }
    }

    /* renamed from: a */
    public static boolean m16052a(Context context) {
        return context.getResources().getBoolean(C11895R.bool.isTablet);
    }

    /* renamed from: a */
    public static int m16051a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
