package com.razorpay;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.razorpay.k */
/* loaded from: classes6.dex */
final class C11906k extends WebChromeClient {

    /* renamed from: a */
    private CheckoutPresenter f13777a;

    public C11906k(CheckoutPresenter checkoutPresenter) {
        this.f13777a = checkoutPresenter;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f13777a.onProgressChanges(2, i);
    }
}
