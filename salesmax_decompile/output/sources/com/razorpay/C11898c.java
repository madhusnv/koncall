package com.razorpay;

import android.view.WindowManager;

/* renamed from: com.razorpay.c */
/* loaded from: classes6.dex */
final class C11898c implements Callback {

    /* renamed from: com.razorpay.c$_2_ */
    final class _2_ implements Runnable {

        /* renamed from: a */
        private /* synthetic */ int f13730a;

        /* renamed from: b */
        private /* synthetic */ int f13731b;

        /* renamed from: c */
        private /* synthetic */ CheckoutPresenterImpl f13732c;

        public _2_(CheckoutPresenterImpl checkoutPresenterImpl, int i, int i2) {
            this.f13732c = checkoutPresenterImpl;
            this.f13730a = i;
            this.f13731b = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WindowManager.LayoutParams attributes = this.f13732c.activity.getWindow().getAttributes();
            attributes.height = C11897b.m16051a(this.f13732c.activity, this.f13730a);
            attributes.width = C11897b.m16051a(this.f13732c.activity, this.f13731b);
            this.f13732c.activity.getWindow().setAttributes(attributes);
        }
    }

    public C11898c(RzpAssist rzpAssist) {
    }

    @Override // com.razorpay.Callback
    public final void run(ResponseObject responseObject) {
        responseObject.getResponseResult();
    }
}
