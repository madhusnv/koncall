package com.razorpay;

import android.webkit.JavascriptInterface;
import com.google.firebase.messaging.Constants;
import com.razorpay.CheckoutBridge;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class PluginCheckoutBridge extends CheckoutBridge {
    private final PluginCheckoutInteractor pluginCheckoutInteractor;

    public PluginCheckoutBridge(PluginCheckoutInteractor pluginCheckoutInteractor, int i) {
        super(pluginCheckoutInteractor, i);
        this.pluginCheckoutInteractor = pluginCheckoutInteractor;
    }

    @Override // com.razorpay.CheckoutBridge
    @JavascriptInterface
    public /* bridge */ /* synthetic */ void invokePopup(String str) {
        super.invokePopup(str);
    }

    @Override // com.razorpay.CheckoutBridge
    @JavascriptInterface
    public /* bridge */ /* synthetic */ void onCheckoutBackPress() {
        super.onCheckoutBackPress();
    }

    @JavascriptInterface
    public void processPayment(final String str) {
        HashMap map = new HashMap();
        map.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_PROCESS_PAYMENT_CALLED, AnalyticsUtil.getJSONResponse(map));
        super.isWebViewSafeOnUI(new CheckoutBridge.WebViewSafeCheckCallback() { // from class: com.razorpay.i_$z_
            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void secure() {
                this.f13776b.pluginCheckoutInteractor.processPayment(str);
            }

            @Override // com.razorpay.CheckoutBridge.WebViewSafeCheckCallback
            public final void unSecure() {
            }
        });
    }
}
