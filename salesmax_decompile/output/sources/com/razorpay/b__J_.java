package com.razorpay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.MediaError;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.razorpay.CheckoutPresenterImpl;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class b__J_ extends Activity implements CheckoutPresenterImpl.CheckoutView, SmsAgentInterface {
    private static int UPI_REQUEST_CODE = 99;
    protected Object checkoutBridgeObject;
    private RelativeLayout container;
    private ViewGroup parent;
    protected CheckoutPresenter presenter;
    private WebChromeClient primaryWebChromeClient;
    private WebView primaryWebView;
    private WebViewClient primaryWebViewClient;
    private o$_b$ rzpbar;
    private WebChromeClient secondaryWebChromeClient;
    private WebView secondaryWebView;
    private WebViewClient secondaryWebViewClient;
    private C11908m smsAgent;

    private void createContainer() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.container = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.container.setBackgroundColor(-1);
        this.parent.addView(this.container);
        this.primaryWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.secondaryWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.primaryWebView.setContentDescription("primary_webview");
        this.secondaryWebView.setContentDescription("secondary_webview");
        this.container.addView(this.primaryWebView);
        this.container.addView(this.secondaryWebView);
        String progressBarColor = this.presenter.getProgressBarColor();
        if (progressBarColor != null) {
            this.rzpbar = new o$_b$(this, this.container, progressBarColor);
        } else {
            this.rzpbar = new o$_b$(this, this.container);
        }
        this.presenter.setUpAddOn();
    }

    @SuppressLint({"JavascriptInterface"})
    private void createPrimaryWebView(Object obj) {
        WebView webView = new WebView(this);
        this.primaryWebView = webView;
        BaseUtils.setWebViewSettings(this, webView, false);
        this.primaryWebView.clearFormData();
        this.primaryWebView.addJavascriptInterface(obj, "CheckoutBridge");
        this.primaryWebView.setWebChromeClient(this.primaryWebChromeClient);
        this.primaryWebView.setWebViewClient(this.primaryWebViewClient);
    }

    private void createSecondaryWebView() {
        WebView webView = new WebView(this);
        this.secondaryWebView = webView;
        BaseUtils.setWebViewSettings(this, webView, false);
        this.secondaryWebView.clearFormData();
        WebView webView2 = this.secondaryWebView;
        final CheckoutInteractor checkoutInteractor = (CheckoutInteractor) this.presenter;
        webView2.addJavascriptInterface(new Object(checkoutInteractor) { // from class: com.razorpay.P$_S_

            /* renamed from: a */
            private CheckoutInteractor f13665a;

            {
                this.f13665a = checkoutInteractor;
            }

            @JavascriptInterface
            public final void relay(String str) {
                this.f13665a.sendDataToWebView(1, str);
            }
        }, "MagicBridge");
        this.secondaryWebView.addJavascriptInterface(new CheckoutBridge((CheckoutInteractor) this.presenter, 2), "CheckoutBridge");
        this.secondaryWebView.setVisibility(8);
        this.secondaryWebView.setWebChromeClient(this.secondaryWebChromeClient);
        this.secondaryWebView.setWebViewClient(this.secondaryWebViewClient);
    }

    private void setWebChromeClient(int i, WebChromeClient webChromeClient) {
        if (i == 1) {
            this.primaryWebChromeClient = webChromeClient;
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebChromeClient = webChromeClient;
        }
    }

    private void setWebViewClient(int i, WebViewClient webViewClient) {
        if (i == 1) {
            this.primaryWebViewClient = webViewClient;
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebViewClient = webViewClient;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterfaceToPrimaryWebview(Object obj, String str) {
        this.primaryWebView.addJavascriptInterface(obj, str);
    }

    public void checkSmsPermission() {
        C11908m c11908mM16085a = C11908m.m16085a();
        this.smsAgent = c11908mM16085a;
        c11908mM16085a.m16086a((SmsAgentInterface) this);
        this.smsAgent.m16088a((Activity) this);
    }

    public void clearWebViewHistory(int i) {
        if (i == 1) {
            this.primaryWebView.clearHistory();
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.clearHistory();
        }
    }

    public void destroy(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("RESULT", str);
        if (str == null || TextUtils.isEmpty(str)) {
            i = 5;
        }
        setResult(i, intent);
        finish();
    }

    public WebView getWebView(int i) {
        if (i == 1) {
            return this.primaryWebView;
        }
        if (i != 2) {
            return null;
        }
        return this.secondaryWebView;
    }

    public void hideProgressBar() {
        o$_b$ o__b_ = this.rzpbar;
        if (o__b_ != null) {
            o__b_.m16097a();
        }
    }

    public boolean isWebViewVisible(int i) {
        WebView webView;
        if (i == 1) {
            WebView webView2 = this.primaryWebView;
            if (webView2 != null && webView2.getVisibility() == 0) {
                return true;
            }
        } else if (i == 2 && (webView = this.secondaryWebView) != null && webView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void loadData(int i, String str, String str2, String str3) {
        if (i == 1) {
            this.primaryWebView.loadData(str, str2, str3);
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.loadData(str, str2, str3);
        }
    }

    public void loadDataWithBaseURL(int i, String str, String str2, String str3, String str4, String str5) {
        if (i == 1) {
            this.primaryWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public void loadUrl(int i, String str) {
        if (i == 1) {
            this.primaryWebView.loadUrl(str);
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.loadUrl(str);
        }
    }

    public void makeWebViewVisible(int i) {
        if (i == 1) {
            if (this.primaryWebView.getVisibility() == 8) {
                this.primaryWebView.setVisibility(0);
                this.secondaryWebView.setVisibility(8);
                CheckoutUtils.m15969a();
                AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_SECONDARY_TO_PRIMARY_SWITCH);
                return;
            }
            return;
        }
        if (i == 2 && this.secondaryWebView.getVisibility() == 8) {
            this.primaryWebView.setVisibility(8);
            this.secondaryWebView.setVisibility(0);
            CheckoutUtils.m15969a();
            AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_PRIMARY_TO_SECONDARY_SWITCH);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            this.presenter.sendOtpPermissionCallback(true);
        }
        this.presenter.onActivityResultReceived(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.presenter.backPressed(new HashMap());
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(Bundle bundle) {
        boolean z;
        String str = g$_H$.f13747b;
        try {
            if (!str.equalsIgnoreCase(C11907l.m16079a(this, "sdk_version"))) {
                C11907l.m16082b(this, "rzp_config_json", null);
                C11907l.m16082b(this, "rzp_config_version", null);
                C11907l.m16082b(this, "sdk_version", str);
            }
        } catch (NullPointerException unused) {
            C11907l.m16082b(this, "rzp_config_json", null);
            C11907l.m16082b(this, "rzp_config_version", null);
            C11907l.m16082b(this, "sdk_version", str);
        }
        g$_H$.m16059a().m16063a(this);
        BaseUtils.checkForLatestVersion(this, g$_H$.f13748c);
        this.presenter.setCheckoutLoadStartAt();
        AnalyticsUtil.libraryType = "CHECKOUTJS";
        setWebViewClient(1, new PrimaryWebViewClient(this.presenter));
        setWebViewClient(2, new SecondaryWebViewClient(this.presenter));
        setWebChromeClient(1, new d__B_(this.presenter));
        setWebChromeClient(2, new C11906k(this.presenter));
        checkSmsPermission();
        BaseUtils.setup();
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_INIT);
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
            z = false;
        } else {
            z = true;
        }
        if (this.presenter.setOptions(bundle, z)) {
            this.parent = (ViewGroup) findViewById(android.R.id.content);
            createPrimaryWebView(this.checkoutBridgeObject);
            createSecondaryWebView();
            createContainer();
            this.presenter.loadForm("");
            this.presenter.passPrefillToSegment();
            if ((getWindow().getAttributes().flags & 1024) != 0) {
                Q_$2$.m16017a(this);
            }
            if (this.presenter.isAllowRotation()) {
                return;
            }
            if (C11897b.m16052a(this)) {
                setFinishOnTouchOutside(false);
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                int iM16051a = C11897b.m16051a(this, 375);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                int identifier = getResources().getIdentifier("status_bar_height", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID);
                int dimensionPixelSize = i - (identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0);
                if (dimensionPixelSize > 600) {
                    dimensionPixelSize = C11897b.m16051a(this, MediaError.DetailedErrorCode.TEXT_UNKNOWN);
                }
                attributes.height = dimensionPixelSize;
                attributes.width = iM16051a;
                getWindow().setAttributes(attributes);
            } else {
                setRequestedOrientation(1);
            }
            this.presenter.fetchCondfig();
            this.presenter.handleCardSaving();
            if (BaseUtils.isDeviceHaveCorrectTlsVersion()) {
                return;
            }
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_TLS_ERROR);
            destroy(6, "TLSv1  is not supported for security reasons");
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONDESTROY_CALLED);
        try {
            this.presenter.cleanUpOnDestroy();
        } catch (ConcurrentModificationException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
            e.printStackTrace();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        try {
            this.presenter.unregisterReceivers();
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.presenter.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.presenter.saveInstanceState(bundle);
    }

    public void postSms(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sender", str);
            jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, str2);
            loadUrl(1, String.format("OTPElf.showOTP('%s','%s')", str2, str));
        } catch (JSONException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getMessage());
            e.printStackTrace();
        }
    }

    public void setSmsPermission(boolean z) {
        this.presenter.sendOtpPermissionCallback(z);
        C11908m c11908m = this.smsAgent;
        if (c11908m != null) {
            c11908m.m16091b((SmsAgentInterface) this);
        }
    }

    public void showProgressBar(int i) {
        o$_b$ o__b_ = this.rzpbar;
        if (o__b_ != null) {
            o__b_.m16098a(i);
        }
    }

    public void showToast(String str, int i) {
        Toast.makeText(this, str, i).show();
    }
}
