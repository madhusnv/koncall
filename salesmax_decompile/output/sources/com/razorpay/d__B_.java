package com.razorpay;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.HashMap;

/* loaded from: classes6.dex */
final class d__B_ extends WebChromeClient {

    /* renamed from: a */
    private CheckoutPresenter f13737a;

    public d__B_(CheckoutPresenter checkoutPresenter) {
        this.f13737a = checkoutPresenter;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return false;
        }
        HashMap map = new HashMap();
        map.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, consoleMessage.message());
        map.put("source_id", consoleMessage.sourceId());
        map.put("line_number", String.valueOf(consoleMessage.lineNumber()));
        AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_JS_ERROR, AnalyticsUtil.getJSONResponse(map));
        new StringBuilder("Webview JS Error: ").append(consoleMessage.message());
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f13737a.onProgressChanges(1, i);
    }
}
