package com.razorpay;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.cast.CredentialsData;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.razorpay.AnalyticsProperty;
import java.util.HashMap;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class RzpAssist implements SmsAgentInterface {
    private Activity activity;
    private OtpElfData elfData;
    String lastSms;
    private String merchantKey;
    String message;
    private long pageStartTime;
    private String paymentId;
    private String sdkType;
    private String sdkVersion;
    private int sdkVersionCode;
    String sender;
    private C11908m smsAgent;
    private WebView webview;
    private boolean hasOtpPermission = false;
    private String lastURL = "";
    private String currentLoadingUrl = "";
    private boolean isMagic = false;
    private boolean isRazorpayOtpReceived = false;
    private JSONObject otpElfPreferences = new JSONObject();
    private JSONObject paymentData = new JSONObject();
    private boolean isRzpAssistEnabled = false;
    private boolean otpRead = false;
    private boolean jsInsertedInCurrentPage = false;

    public RzpAssist(String str, Activity activity, WebView webView, String str2, int i, String str3) throws PackageManager.NameNotFoundException {
        this.sdkType = "standalone";
        if (D$$l_.m15982a().isOTPElfEnabled().booleanValue()) {
            if (str == null || str.isEmpty()) {
                throw new RuntimeException("merchantKey cannot be null or empty");
            }
            this.sdkType = str2;
            this.sdkVersionCode = i;
            this.sdkVersion = str3;
            if (str2.equals("standalone") || str2.equalsIgnoreCase("standard") || str2.equalsIgnoreCase(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM)) {
                AnalyticsUtil.setup(activity, str, str2, i, str3);
            }
            this.webview = webView;
            this.merchantKey = str;
            this.activity = activity;
            OtpElfData otpElfData = new OtpElfData(activity);
            this.elfData = otpElfData;
            otpElfData.checkForUpdates();
            setup();
            AnalyticsUtil.addProperty("OTPElf Version", new AnalyticsProperty(BaseUtils.getLocalVersion(activity, OtpElfData.versionKey), AnalyticsProperty.Scope.ORDER));
        }
    }

    private void handleJsInsertion() throws JSONException {
        try {
            JSONObject oTPElfSettings = D$$l_.m15982a().getOTPElfSettings();
            oTPElfSettings.put("merchant_key", this.merchantKey);
            oTPElfSettings.put("otp_permission", this.hasOtpPermission);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.sdkType);
            jSONObject.put(ClientCookie.VERSION_ATTR, this.sdkVersion);
            jSONObject.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject.put("framework", "native");
            jSONObject.put("name", this.sdkType + "_android_native");
            oTPElfSettings.put("sdk", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            if (this.isMagic) {
                jSONObject2.put("type", "magic");
                jSONObject2.put("version_code", n$_B$.f13790c.intValue());
            } else {
                jSONObject2.put("type", "rzpassist");
                jSONObject2.put("version_code", n$_B$.f13789b.intValue());
            }
            oTPElfSettings.put("plugin", jSONObject2);
            oTPElfSettings.put("payment_data", this.paymentData);
            oTPElfSettings.put("preferences", this.otpElfPreferences);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("package_name", this.activity.getApplicationContext().getPackageName());
            PackageManager packageManager = this.activity.getPackageManager();
            jSONObject3.put("app_name", AnalyticsUtil.returnUndefinedIfNull(packageManager.getPackageInfo(this.activity.getPackageName(), 0).applicationInfo.loadLabel(packageManager)));
            jSONObject3.put("platform", "mobile_sdk");
            jSONObject3.put("os", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject3.put("os_version", Build.VERSION.RELEASE);
            jSONObject3.put("data_network_type", BaseUtils.getDataNetworkType(this.activity).getNetworkTypeName());
            jSONObject3.put("framework", AnalyticsUtil.getFramework());
            jSONObject3.put("library", "standard");
            jSONObject3.put("sdk", jSONObject);
            oTPElfSettings.put("metadata", jSONObject3);
            injectJs("window.__rzp_options = " + oTPElfSettings.toString());
        } catch (Exception e) {
            d__1_.m16053a("Unable to load otpelf settings", e);
        }
        injectJs(this.elfData.getOtpElfJs());
        AnalyticsUtil.trackEvent(AnalyticsEvent.OTPELF_INJECTED);
        String str = this.lastSms;
        if (str != null) {
            injectJs(String.format("OTPElf.showOTP('%s','%s')", str, this.sender));
            this.lastSms = null;
        }
    }

    private void injectJs(String str) {
        this.webview.loadUrl(String.format("javascript: %s", str));
    }

    private void postStatsToAPI() {
        try {
            String strConstructBasicAuth = BaseUtils.constructBasicAuth(this.merchantKey);
            HashMap map = new HashMap();
            map.put("Authorization", "Basic " + strConstructBasicAuth);
            map.put("Content-Type", "application/json");
            if (this.paymentId == null) {
                return;
            }
            M$_3_.m15991a("https://api.razorpay.com/v1/payments/" + this.paymentId + "/metadata", E$_j$.m15984a(this.otpRead).toString(), map, new C11898c(this));
        } catch (Exception e) {
            AnalyticsUtil.reportError("RzpAssist", "S0", e.getMessage());
        }
    }

    private void setup() {
        C11908m c11908mM16085a = C11908m.m16085a();
        this.smsAgent = c11908mM16085a;
        c11908mM16085a.m16086a(this);
        this.smsAgent.m16088a(this.activity);
        this.webview.addJavascriptInterface(this, "OTPElfBridge");
        this.webview.getSettings().setUseWideViewPort(true);
    }

    @JavascriptInterface
    public final void copyToClipboard(String str) {
        ((ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("rzp_clip_data", str));
    }

    public final void enableMagic() {
        this.isMagic = true;
    }

    public final String getCurrentLoadingUrl() {
        return this.currentLoadingUrl;
    }

    public final String getLastLoadedUrl() {
        return this.lastURL;
    }

    public final boolean isRazorpayOtpReceived() {
        return this.isRazorpayOtpReceived;
    }

    @JavascriptInterface
    public final void onOtpParsed(String str) {
        this.activity.runOnUiThread(new RunnableC11902g(this, str));
    }

    public final void onPageFinished(WebView webView, String str) throws JSONException {
        AnalyticsUtil.trackPageLoadEnd(str, System.nanoTime() - this.pageStartTime);
        this.lastURL = str;
        this.currentLoadingUrl = "";
        if (D$$l_.m15982a().isOTPElfEnabled().booleanValue() && !this.jsInsertedInCurrentPage) {
            handleJsInsertion();
            this.jsInsertedInCurrentPage = true;
        }
    }

    public final void onPageStarted(WebView webView, String str) {
        AnalyticsUtil.trackPageLoadStart(str);
        this.pageStartTime = System.nanoTime();
        this.currentLoadingUrl = str;
        this.jsInsertedInCurrentPage = false;
    }

    public final void onProgressChanged(int i) {
        D$$l_.m15982a().isOTPElfEnabled().booleanValue();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11908m c11908m = this.smsAgent;
        if (i != 1) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            c11908m.m16087a(false);
            AnalyticsUtil.trackEvent(AnalyticsEvent.SMS_PERMISSION_NOW_DENIED);
        } else {
            c11908m.m16087a(true);
            c11908m.m16089b();
            AnalyticsUtil.trackEvent(AnalyticsEvent.SMS_PERMISSION_NOW_GRANTED);
        }
    }

    @JavascriptInterface
    public final void openKeyboard() {
        this.activity.runOnUiThread(new RunnableC11900e(this));
    }

    public final void paymentFlowEnd() {
        if (this.sdkType.equals("standalone")) {
            AnalyticsUtil.postData();
        }
        if (D$$l_.m15982a().isOTPElfEnabled().booleanValue()) {
            this.smsAgent.m16090b(this.activity);
            this.smsAgent.m16091b(this);
        }
    }

    @Override // com.razorpay.SmsAgentInterface
    public final void postSms(String str, String str2) throws JSONException {
        if (this.isRzpAssistEnabled) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sender", str);
                jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, str2);
                this.sender = str;
                this.message = str2;
                this.lastSms = jSONObject.toString();
                injectJs(String.format("OTPElf.showOTP('%s','%s')", str2, str));
            } catch (Exception e) {
                d__1_.m16053a("Exception", e);
            }
        }
    }

    public final void reset() {
        postStatsToAPI();
        this.lastURL = "";
        this.currentLoadingUrl = "";
        this.otpRead = false;
    }

    public final void setOTPEnabled(boolean z) {
        this.hasOtpPermission = z;
        AnalyticsUtil.addProperty("otp_autoreading_access", new AnalyticsProperty(z, AnalyticsProperty.Scope.ORDER));
    }

    public final void setOtpElfPreferences(JSONObject jSONObject) {
        this.otpElfPreferences = jSONObject;
    }

    public final void setPaymentData(JSONObject jSONObject) {
        this.paymentData = jSONObject;
    }

    public final void setPaymentId(String str) {
        this.paymentId = str;
    }

    public final void setRzpAssistEnabled(boolean z) {
        this.isRzpAssistEnabled = z;
    }

    @Override // com.razorpay.SmsAgentInterface
    public final void setSmsPermission(boolean z) {
        setOTPEnabled(z);
    }

    @JavascriptInterface
    public final void setUseWideViewPort(boolean z) {
        this.activity.runOnUiThread(new RunnableC11899d(this, z));
    }

    @JavascriptInterface
    public final void toast(String str) {
        this.activity.runOnUiThread(new RunnableC11901f(this, str));
    }

    @JavascriptInterface
    public final void trackEvent(String str, String str2) {
        try {
            AnalyticsEvent analyticsEvent = AnalyticsEvent.JS_EVENT;
            analyticsEvent.setEventName(str);
            AnalyticsUtil.trackEvent(analyticsEvent, new JSONObject(str2));
        } catch (Exception e) {
            d__1_.m16053a("Error in tracking JS Event", e);
        }
    }

    @JavascriptInterface
    public final void trackEvent(String str) {
        AnalyticsEvent analyticsEvent = AnalyticsEvent.JS_EVENT;
        analyticsEvent.setEventName(str);
        AnalyticsUtil.trackEvent(analyticsEvent);
    }
}
