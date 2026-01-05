package com.razorpay;

import android.webkit.JavascriptInterface;

/* loaded from: classes6.dex */
class CheckoutBridge {
    private String integratedPlugin;
    CheckoutInteractor interactor;
    private boolean isRegistered = true;
    private int webViewType;

    interface WebViewSafeCheckCallback {
        void secure();

        void unSecure();
    }

    public CheckoutBridge(CheckoutInteractor checkoutInteractor, int i) {
        this.interactor = checkoutInteractor;
        this.webViewType = i;
    }

    @JavascriptInterface
    public final void callNativeIntent(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.N$$J$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13655b.interactor.callNativeIntent(str, null);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void getPdfString(final String str, final String str2) {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.t_$J_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13814c.interactor.getPdfString(str, str2);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final String getSdkPlugins() {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.C__D$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                CheckoutBridge checkoutBridge = this.f13598a;
                checkoutBridge.integratedPlugin = checkoutBridge.interactor.getSdkPlugins();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
        return this.integratedPlugin;
    }

    @JavascriptInterface
    public void invokePopup(final String str) {
        this.interactor.invokePopup(str);
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.b_$A$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13729b.interactor.invokePopup(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final boolean isUserRegistered(final String str) {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.Y_$B$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                CheckoutBridge checkoutBridge = this.f13717b;
                checkoutBridge.isRegistered = checkoutBridge.interactor.isUserRegistered(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
        return this.isRegistered;
    }

    @JavascriptInterface
    public final boolean isUserRegisteredOnUPI(final String str) {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.r_$Z$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                CheckoutBridge checkoutBridge = this.f13809b;
                checkoutBridge.isRegistered = checkoutBridge.interactor.isUserRegisteredOnUPI(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
        return this.isRegistered;
    }

    public void isWebViewSafe(WebViewSafeCheckCallback webViewSafeCheckCallback) {
        this.interactor.isWebViewSafe(this.webViewType, webViewSafeCheckCallback);
    }

    public void isWebViewSafeOnUI(WebViewSafeCheckCallback webViewSafeCheckCallback) {
        this.interactor.isWebViewSafeOnUI(this.webViewType, webViewSafeCheckCallback);
    }

    @JavascriptInterface
    public void onCheckoutBackPress() {
        this.interactor.onCheckoutBackPress();
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.y$_O_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13821a.interactor.onCheckoutBackPress();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void onCheckoutRendered() {
        isWebViewSafe(new WebViewSafeCheckCallback() { // from class: com.razorpay.Q__v$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13676a.interactor.onCheckoutRendered();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void oncomplete(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.K$$z$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13643b.interactor.onComplete(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void ondismiss() {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.J$$A_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13635a.interactor.onDismiss();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void onerror(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.I$_e_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13632b.interactor.onError(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void onfault(String str) {
        isWebViewSafeOnUI(new h__y_(this, str));
    }

    @JavascriptInterface
    public final void onload() {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.J$_0_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13636a.interactor.onLoad();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void onsubmit(String str) {
        isWebViewSafeOnUI(new O__Y_(this, str));
    }

    @JavascriptInterface
    public final void relay(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.L$$C_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13647b.interactor.sendDataToWebView(2, str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void requestExtraAnalyticsData() {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.Q$$U_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13668a.interactor.requestExtraAnalyticsData();
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void setAppToken(final String str) {
        this.interactor.setAppToken(str);
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.U$_z$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13708b.interactor.setAppToken(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void setDeviceToken(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.I$_n_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13634b.interactor.setDeviceToken(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void setDimensions(final int i, final int i2) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.B_$q$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13597c.interactor.setDimensions(i, i2);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void setMerchantOptions(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.n__T$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13792b.interactor.setMerchantOptions(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void setPaymentID(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.x_$Q_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13820b.interactor.setPaymentID(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void showAlertDialog(final String str, final String str2, final String str3) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.H$_a_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13630d.interactor.showAlertDialog(str, str2, str3);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void toast(final String str, final int i) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.B$$J$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13593c.interactor.toast(str, i);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void callNativeIntent(final String str, final String str2) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.S$_U_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13681c.interactor.callNativeIntent(str, str2);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }

    @JavascriptInterface
    public final void ondismiss(final String str) {
        isWebViewSafeOnUI(new WebViewSafeCheckCallback() { // from class: com.razorpay.T__j$
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13687b.interactor.onDismiss(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }
}
