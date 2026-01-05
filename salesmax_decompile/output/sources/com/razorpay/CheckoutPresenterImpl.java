package com.razorpay;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.razorpay.AnalyticsProperty;
import com.razorpay.C11897b;
import com.razorpay.C11898c;
import com.razorpay.CheckoutBridge;
import com.razorpay.CheckoutUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.c64;

/* loaded from: classes6.dex */
class CheckoutPresenterImpl implements CheckoutInteractor, CheckoutPresenter {
    protected Activity activity;
    private AutoReadOtpHelper autoReadOtpHelper;
    private long checkoutLoadStartAt;
    O_$v$ checkoutOptions;
    private String checkoutUrl;
    private boolean clearHistory;
    private String dashOptions;
    private JSONObject dashOptionsJSON;
    private Task<Void> loginOtpSmsTask;
    String merchantKey;
    private long preloadAbortDuration;
    private long preloadCompleteDuration;
    protected CheckoutView view;
    private String checkoutContent = "{}";
    private int paymentAttempts = 0;
    private boolean isPaymentSuccessful = false;
    private boolean isTwoWebViewFlow = false;
    private boolean isMagic = false;
    private int merchantLogoResourceId = 0;
    private boolean isActivityCreated = false;
    private boolean sendSmsHash = false;
    private boolean allowRotation = false;
    private String sanitizedChallanEncodedString = "";
    private String payment_id = null;
    private F_$o_ magicBase = null;
    private BroadcastReceiver otpAutoReadBroadcast = new BroadcastReceiver() { // from class: com.razorpay.E$_q$
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) throws JSONException {
            CheckoutPresenterImpl checkoutPresenterImpl = this.f13608a;
            checkoutPresenterImpl.activity.unregisterReceiver(checkoutPresenterImpl.otpAutoReadBroadcast);
            if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                int statusCode = ((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode();
                if (statusCode != 0) {
                    if (statusCode != 15) {
                        return;
                    }
                    AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_TIMEOUT);
                } else {
                    String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                    Intent intent2 = new Intent();
                    intent2.putExtra(SmsRetriever.EXTRA_SMS_MESSAGE, str);
                    this.f13608a.onActivityResultReceived(1001, -1, intent2);
                }
            }
        }
    };
    Queue<String> checkoutMessageQueue = new LinkedList();
    private boolean isCheckoutLoaded = false;

    interface CheckoutView {
        void addJavascriptInterfaceToPrimaryWebview(Object obj, String str);

        void checkSmsPermission();

        void clearWebViewHistory(int i);

        void destroy(int i, String str);

        WebView getWebView(int i);

        void hideProgressBar();

        boolean isWebViewVisible(int i);

        void loadData(int i, String str, String str2, String str3);

        void loadDataWithBaseURL(int i, String str, String str2, String str3, String str4, String str5);

        void loadUrl(int i, String str);

        void makeWebViewVisible(int i);

        void showProgressBar(int i);

        void showToast(String str, int i);
    }

    public CheckoutPresenterImpl(Activity activity, CheckoutView checkoutView) {
        this.activity = activity;
        this.view = checkoutView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeWebViewCallback(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        CheckoutView checkoutView;
        int i2 = 1;
        if (i == 1) {
            checkoutView = this.view;
        } else {
            checkoutView = this.view;
            i2 = 2;
        }
        try {
            String host = new URL(checkoutView.getWebView(i2).getTag().toString()).getHost();
            if (host == null || !(host.endsWith("razorpay.com") || host.endsWith("razorpay.in"))) {
                webViewSafeCheckCallback.unSecure();
            } else {
                webViewSafeCheckCallback.secure();
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
            webViewSafeCheckCallback.unSecure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getHandleMessageFormattedString() {
        return String.format("javascript: handleMessage(%s)", getOptionsForHandleMessage().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRetry(String str) {
        int i = this.paymentAttempts;
        int iM16069f = g$_H$.m16059a().m16069f();
        if (!(g$_H$.m16059a().m16068e() && (iM16069f == -1 || iM16069f > i))) {
            destroyActivity(0, str);
            return;
        }
        try {
            if (str == null) {
                destroyActivity(0, "");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.checkoutUrl.contains("?") ? "&" : "?");
                str = sb.toString();
                if (jSONObject.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR) instanceof JSONObject) {
                    str = str + "error=" + ((JSONObject) jSONObject.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR)).toString();
                }
            }
            helpersReset();
            loadForm(str);
        } catch (Exception e) {
            destroyActivity(0, "");
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
        }
    }

    private void injectJs(String str) {
        this.view.getWebView(1).loadUrl(String.format("javascript: %s", str));
    }

    private void loadResultToWebView(JSONObject jSONObject, String str) {
        HashMap map = new HashMap();
        map.put("result", jSONObject);
        AnalyticsUtil.trackEvent(AnalyticsEvent.NATIVE_INTENT_ONACTIVITY_RESULT, AnalyticsUtil.getJSONResponse(map));
        if (this.isCheckoutLoaded) {
            this.view.loadUrl(1, str);
            return;
        }
        if (this.checkoutMessageQueue == null) {
            this.checkoutMessageQueue = new LinkedList();
        }
        this.checkoutMessageQueue.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void markPaymentCancelled() {
        if (this.payment_id == null || this.isPaymentSuccessful) {
            return;
        }
        try {
            String strConstructBasicAuth = BaseUtils.constructBasicAuth(this.merchantKey);
            HashMap map = new HashMap();
            map.put("Authorization", "Basic " + strConstructBasicAuth);
            M$_3_.m15992a("https://api.razorpay.com/v1/payments/" + this.payment_id + "/cancel?platform=android_sdk", map, new Callback(this) { // from class: com.razorpay.c__h$
                @Override // com.razorpay.Callback
                public final void run(ResponseObject responseObject) {
                    responseObject.getResponseResult();
                }
            });
            this.payment_id = null;
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
        }
    }

    private void savePrefillData(JSONObject jSONObject) {
        try {
            if (jSONObject.has("contact")) {
                CheckoutUtils.m15975b(this.activity, jSONObject.getString("contact"));
                this.checkoutOptions.m15999a("contact", jSONObject.getString("contact"));
            }
            if (jSONObject.has("email")) {
                CheckoutUtils.m15971a(this.activity, jSONObject.getString("email"));
                this.checkoutOptions.m15999a("email", jSONObject.getString("email"));
            }
        } catch (JSONException e) {
            d__1_.m16053a("Error parsing JSON", e);
        }
    }

    private void sendQueuedMessagesToCheckout() {
        Queue<String> queue = this.checkoutMessageQueue;
        if (queue == null || queue.isEmpty()) {
            return;
        }
        Iterator<String> it = this.checkoutMessageQueue.iterator();
        while (it.hasNext()) {
            this.view.loadUrl(1, it.next());
        }
        this.checkoutMessageQueue.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSmsRetrieverForSavedCardsOTP() {
        this.loginOtpSmsTask = SmsRetriever.getClient(this.activity).startSmsUserConsent(null);
        this.autoReadOtpHelper = new AutoReadOtpHelper(this.activity);
        this.activity.registerReceiver(this.autoReadOtpHelper, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION));
    }

    public void addAnalyticsData(JSONObject jSONObject) {
        AnalyticsUtil.addFilteredPropertiesFromPayload(jSONObject);
    }

    public void addOnFlowEnd() {
        F_$o_ f_$o_ = this.magicBase;
        if (f_$o_ != null) {
            f_$o_.f13611b.m16091b(f_$o_);
            f_$o_.f13611b.m16090b((Activity) f_$o_.f13610a);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void backPressed(final Map<String, Object> map) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_HARD_BACK_PRESSED, AnalyticsUtil.getJSONResponse(map));
        WebView webView = this.view.getWebView(1);
        if ((webView.getTag() == null ? "" : webView.getTag().toString()).contains(g$_H$.m16059a().getCheckoutEndpoint()) && !this.view.isWebViewVisible(2)) {
            this.view.loadUrl(1, "javascript: window.backPressed ? window.backPressed('onCheckoutBackPress') : CheckoutBridge.onCheckoutBackPress();");
            map.put("in_checkout", "true");
        } else if (g$_H$.m16059a().m16074k()) {
            CheckoutUtils.m15973a(this.activity, g$_H$.m16059a().m16075l(), g$_H$.m16059a().m16073j(), g$_H$.m16059a().m16072i(), new CheckoutUtils.BackButtonDialogCallback() { // from class: com.razorpay.Q$$2_
                @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
                public final void onNegativeButtonClick() {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.ALERT_PAYMENT_CANCELLED, AnalyticsUtil.getJSONResponse((Map<String, Object>) map));
                    if (this.f13667b.isTwoWebViewFlow) {
                        this.f13667b.view.makeWebViewVisible(1);
                        this.f13667b.view.loadUrl(2, "about:blank");
                        this.f13667b.view.loadUrl(1, "javascript: window.onpaymentcancel()");
                    } else {
                        this.f13667b.handleRetry(null);
                        this.f13667b.markPaymentCancelled();
                    }
                    this.f13667b.isTwoWebViewFlow = false;
                }

                @Override // com.razorpay.CheckoutUtils.BackButtonDialogCallback
                public final void onPositiveButtonClick() {
                    AnalyticsUtil.trackEvent(AnalyticsEvent.ALERT_PAYMENT_CONTINUE, AnalyticsUtil.getJSONResponse((Map<String, Object>) map));
                }
            });
        } else {
            destroyActivity(0, "BackPressed");
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void callNativeIntent(String str, String str2) {
        BaseUtils.startActivityForResult(str, str2, this.activity);
        HashMap map = new HashMap();
        if (str == null) {
            str = "null";
        }
        map.put(ImagesContract.URL, str);
        if (str2 == null) {
            str2 = "null";
        }
        map.put("package_name", str2);
        AnalyticsUtil.trackEvent(AnalyticsEvent.NATIVE_INTENT_CALLED, AnalyticsUtil.getJSONResponse(map));
    }

    @Override // com.razorpay.CheckoutInteractor
    public void checkSmsPermission() {
        this.view.checkSmsPermission();
    }

    @Override // com.razorpay.CheckoutPresenter
    public void cleanUpOnDestroy() {
        try {
            markPaymentCancelled();
            this.activity.unregisterReceiver(this.autoReadOtpHelper);
            this.activity.unregisterReceiver(this.otpAutoReadBroadcast);
            J$_M_.m15988a();
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void destroyActivity(int i, String str) {
        String strValueOf = String.valueOf(i);
        AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.ORDER;
        AnalyticsUtil.addProperty("destroy_resultCode", new AnalyticsProperty(strValueOf, scope));
        AnalyticsUtil.addProperty("destroy_result", new AnalyticsProperty(str, scope));
        AnalyticsUtil.trackEvent(AnalyticsEvent.INTERNAL_DESTROY_METHOD_CALLED);
        cleanUpOnDestroy();
        this.view.destroy(i, str);
    }

    public void enableAddon(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has("magic")) {
                boolean z = jSONObject.getBoolean("magic");
                this.isMagic = z;
                F_$o_ f_$o_ = this.magicBase;
                if (f_$o_ != null) {
                    f_$o_.f13612c = z;
                }
                AnalyticsUtil.addProperty("is_magic", new AnalyticsProperty(z, AnalyticsProperty.Scope.PAYMENT));
            }
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void fetchCondfig() {
        g$_H$.f13749d = isMagicPresent();
        g$_H$.m16060a(this.activity, this.merchantKey);
    }

    @Override // com.razorpay.CheckoutPresenter
    public O_$v$ getCheckoutOptions() {
        return this.checkoutOptions;
    }

    public JSONObject getOptionsForHandleMessage() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("options", this.checkoutOptions.m16005d());
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.checkoutContent);
            jSONObject.put(OutcomeConstants.OUTCOME_ID, AnalyticsUtil.getLocalOrderId());
            jSONObject.put("pdf_download_supported", true);
            jSONObject.put("key_id", this.merchantKey);
            jSONObject.put("externalSDKs", new JSONObject());
            if (this.checkoutOptions.m16001b()) {
                jSONObject.put("sms_hash", new AppSignatureHelper(this.activity).getAppSignatures().get(0));
            }
            jSONObject.put("upi_intents_data", CheckoutUtils.m15976c(this.activity));
            jSONObject.put("uri_data", CheckoutUtils.m15977d(this.activity));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("openedAt", System.currentTimeMillis());
            jSONObject.put("metadata", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("framework", AnalyticsUtil.getFramework());
            jSONObject3.put("type", g$_H$.f13746a);
            jSONObject3.put("name", g$_H$.f13746a + "_android_" + AnalyticsUtil.getFramework());
            jSONObject3.put(ClientCookie.VERSION_ATTR, BuildConfig.VERSION_NAME);
            jSONObject3.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject.put("sdk", jSONObject3);
            String strM16057b = f$_G$.m16057b(this.activity.getApplicationContext());
            if (!TextUtils.isEmpty(strM16057b)) {
                jSONObject.put("device_token", strM16057b);
            }
            jSONObject.put("sdk_popup", true);
            jSONObject.put("magic", true);
            jSONObject.put("network_type", BaseUtils.getNetworkType(this.activity));
            jSONObject.put("activity_recreated", this.isActivityCreated);
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
        }
        return jSONObject;
    }

    @Override // com.razorpay.CheckoutInteractor
    public void getPdfString(String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str2) || !str2.contains("base64,")) {
            return;
        }
        String str3 = str2.split("base64,")[1];
        this.sanitizedChallanEncodedString = str3;
        BaseUtils.pdfDownloadHelper(this.activity, str, str3);
    }

    @Override // com.razorpay.CheckoutPresenter
    public String getProgressBarColor() throws Exception {
        JSONObject jSONObject;
        String string = null;
        try {
            if (this.checkoutOptions.m16005d() == null) {
                throw new Exception("No options defined");
            }
            String string2 = this.checkoutOptions.m16005d().getJSONObject("theme").getString("color");
            Color.parseColor(string2);
            return string2;
        } catch (Exception e) {
            try {
                jSONObject = this.dashOptionsJSON;
            } catch (Exception e2) {
                AnalyticsUtil.reportError("CxPsntrImpl", "S2", e2.getMessage());
            }
            if (jSONObject == null) {
                throw new Exception("No dash options defined");
            }
            string = jSONObject.getJSONObject("theme").getString("color");
            Color.parseColor(string);
            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getMessage());
            return string;
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public String getSdkPlugins() throws JSONException, PackageManager.NameNotFoundException {
        HashMap<String, String> allPluginsFromManifest = BaseUtils.getAllPluginsFromManifest(this.activity);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAmazonPluginIntegrated", false);
            jSONObject.put("isGooglePayPluginIntegrated", false);
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
            e.printStackTrace();
        }
        if (allPluginsFromManifest != null && allPluginsFromManifest.size() != 0) {
            for (String str : allPluginsFromManifest.values()) {
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RazorpayAmazon")) {
                    jSONObject.put("isAmazonPluginIntegrated", true);
                }
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RzpGpayMerged")) {
                    jSONObject.put("isGooglePayPluginIntegrated", true);
                }
            }
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    @Override // com.razorpay.CheckoutPresenter
    public void handleCardSaving() throws JSONException {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CARD_SAVING_START);
        f$_G$.m16055a(this.activity.getApplicationContext());
    }

    public void helpersReset() {
    }

    @Override // com.razorpay.CheckoutInteractor
    public void invokePopup(final String str) {
        this.isTwoWebViewFlow = true;
        try {
            this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.k__c$
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        this.f13779b.enableAddon(jSONObject);
                        if (jSONObject.has(FirebaseAnalytics.Param.CONTENT)) {
                            this.f13779b.view.loadDataWithBaseURL(2, "about:blank", jSONObject.getString(FirebaseAnalytics.Param.CONTENT), "text/html", HTTP.UTF_8, null);
                        }
                        if (jSONObject.has(ImagesContract.URL)) {
                            this.f13779b.view.loadUrl(2, jSONObject.getString(ImagesContract.URL));
                        }
                        if (!jSONObject.has("focus") || jSONObject.getBoolean("focus")) {
                            this.f13779b.view.makeWebViewVisible(2);
                        } else {
                            this.f13779b.view.makeWebViewVisible(1);
                        }
                    } catch (Exception e) {
                        AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
                        e.printStackTrace();
                    }
                    AnalyticsUtil.addProperty("two_webview_flow", new AnalyticsProperty(true, AnalyticsProperty.Scope.PAYMENT));
                }
            });
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public boolean isAllowRotation() {
        return this.allowRotation;
    }

    @Override // com.razorpay.CheckoutPresenter
    public boolean isMagicPresent() {
        return false;
    }

    @Override // com.razorpay.CheckoutInteractor
    public boolean isUserRegistered(String str) {
        return BaseUtils.checkGpayCardsUpiRegistered(this.activity, str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public boolean isUserRegisteredOnUPI(String str) {
        return BaseUtils.checkUpiRegisteredApp(this.activity, str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void isWebViewSafe(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        executeWebViewCallback(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void isWebViewSafeOnUI(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        this.activity.runOnUiThread(new C11897b._f_(this, i, webViewSafeCheckCallback));
    }

    @Override // com.razorpay.CheckoutPresenter
    public void loadForm(String str) {
        if (this.paymentAttempts != 0) {
            AnalyticsUtil.postData();
        }
        int i = this.paymentAttempts + 1;
        this.paymentAttempts = i;
        AnalyticsUtil.addProperty("payment_attempt", new AnalyticsProperty(i, AnalyticsProperty.Scope.ORDER));
        this.clearHistory = true;
        this.view.loadUrl(1, (this.checkoutUrl + str).replace(" ", "%20"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.app.Activity] */
    @Override // com.razorpay.CheckoutPresenter
    public void onActivityResultReceived(int i, int i2, Intent intent) throws JSONException {
        Intent intent2;
        if (i == 77) {
            if (i2 != -1 || intent.getData() == null) {
                return;
            }
            Uri data = intent.getData();
            try {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.activity.getContentResolver().openFileDescriptor(data, "w");
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    fileOutputStream.write(Base64.decode(this.sanitizedChallanEncodedString, 0));
                    fileOutputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    intent2 = new Intent("android.intent.action.VIEW");
                } catch (IOException e) {
                    e.printStackTrace();
                    intent2 = new Intent("android.intent.action.VIEW");
                }
                intent2.setDataAndType(data, "application/pdf");
                intent2.addFlags(1);
                data = this.activity;
                data.startActivity(intent2);
                return;
            } catch (Throwable th) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setDataAndType(data, "application/pdf");
                intent3.addFlags(1);
                this.activity.startActivity(intent3);
                throw th;
            }
        }
        if (i != 1001) {
            if (i == 99) {
                JSONObject jSONFromIntentData = BaseUtils.getJSONFromIntentData(intent);
                loadResultToWebView(jSONFromIntentData, String.format("javascript: upiIntentResponse(%s)", jSONFromIntentData.toString()));
                return;
            }
            if (i == 20) {
                try {
                    JSONObject jSONObject = new JSONObject("{'data':" + i2 + "}");
                    jSONObject.put(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, "CRED");
                    loadResultToWebView(jSONObject, String.format("javascript:externalAppResponse(%s)", jSONObject.toString()));
                    return;
                } catch (JSONException e2) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S0", e2.getMessage());
                    return;
                }
            }
            return;
        }
        if (i2 != -1) {
            AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_CONSENT_DECLINED);
            return;
        }
        AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_RECEIVED_SMS);
        String stringExtra = intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE);
        if (this.isCheckoutLoaded) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sender", "razorpay");
                jSONObject2.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, stringExtra);
                String.format("javascript: OTPElf.elfBridge.setSms(%s)", jSONObject2.toString());
                injectJs(String.format("OTPElf.showOTP('%s','%s')", stringExtra, "razorpay"));
                AnalyticsUtil.trackEvent(AnalyticsEvent.AUTO_READ_OTP_SMS_RETRIEVER_API_OTP_POPULATION_JS);
            } catch (JSONException e3) {
                AnalyticsUtil.reportError("CxPsntrImpl", "S0", e3.getLocalizedMessage());
                e3.printStackTrace();
            }
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onCheckoutBackPress() {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_SOFT_BACK_PRESSED);
        destroyActivity(0, BaseUtils.getPaymentCancelledResponse(BaseUtils.getInstance().getMetadata()));
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onCheckoutRendered() {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_RENDERED_COMPLETE);
    }

    public void onComplete(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.PAYMENT;
                AnalyticsUtil.addProperty("payment_status", new AnalyticsProperty("fail", scope));
                AnalyticsUtil.addProperty("payload", new AnalyticsProperty(jSONObject.toString(), scope));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PAYMENT_COMPLETE);
                if (this.isTwoWebViewFlow) {
                    this.view.makeWebViewVisible(1);
                }
                onError(jSONObject);
            } else if (jSONObject.has("razorpay_fund_account_id")) {
                destroyActivity(1, jSONObject.toString());
            } else if (jSONObject.has("razorpay_payment_id")) {
                String string = jSONObject.getString("razorpay_payment_id");
                this.payment_id = string;
                AnalyticsProperty.Scope scope2 = AnalyticsProperty.Scope.PAYMENT;
                AnalyticsUtil.addProperty("payment_id", new AnalyticsProperty(string, scope2));
                AnalyticsUtil.addProperty("payment_status", new AnalyticsProperty(FirebaseAnalytics.Param.SUCCESS, scope2));
                AnalyticsUtil.addProperty("payload", new AnalyticsProperty(jSONObject.toString(), scope2));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PAYMENT_COMPLETE);
                this.isPaymentSuccessful = true;
                destroyActivity(1, jSONObject.toString());
            } else if (jSONObject.has("external_wallet")) {
                destroyActivity(4, jSONObject.toString());
            } else {
                destroyActivity(0, "Post payment parsing error");
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
            destroyActivity(0, e.getMessage());
        }
        this.isTwoWebViewFlow = false;
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onDismiss() {
        destroyActivity(0, BaseUtils.getPaymentCancelledResponse(BaseUtils.getInstance().getMetadata()));
    }

    public void onError(final JSONObject jSONObject) {
        if (!this.isTwoWebViewFlow) {
            this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.G$_X_
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13619b.handleRetry(jSONObject.toString());
                }
            });
        } else {
            this.view.loadUrl(1, String.format("javascript: window.onComplete(%s)", jSONObject.toString()));
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onFault(String str) {
        try {
            destroyActivity(3, new JSONObject(str).toString());
        } catch (JSONException unused) {
            destroyActivity(3, BaseUtils.getGenericPaymentErrorResponse(str, BaseUtils.getInstance().getMetadata()));
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onLoad() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.d__w$
            @Override // java.lang.Runnable
            public final void run() {
                CheckoutPresenterImpl checkoutPresenterImpl = this.f13738a;
                checkoutPresenterImpl.view.loadUrl(1, checkoutPresenterImpl.getHandleMessageFormattedString());
                CheckoutPresenterImpl checkoutPresenterImpl2 = this.f13738a;
                checkoutPresenterImpl2.view.loadUrl(1, String.format("javascript: CheckoutBridge.sendAnalyticsData({data: %s})", AnalyticsUtil.getAnalyticsDataForCheckout(checkoutPresenterImpl2.activity).toString()));
            }
        });
        if (Build.VERSION.SDK_INT >= 29 || c64.checkSelfPermission(this.activity, "android.permission.RECEIVE_SMS") != 0) {
            if (!this.sendSmsHash) {
                startSmsRetrieverForSavedCardsOTP();
                return;
            }
            this.loginOtpSmsTask = SmsRetriever.getClient(this.activity).startSmsRetriever();
            try {
                final long j = 2000;
                final long j2 = 1000;
                new CountDownTimer(j, j2) { // from class: com.razorpay.O$_M$
                    {
                        super(2000L, 1000L);
                    }

                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        try {
                            if (!this.f13658a.loginOtpSmsTask.isSuccessful()) {
                                this.f13658a.startSmsRetrieverForSavedCardsOTP();
                                return;
                            }
                            IntentFilter intentFilter = new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION);
                            CheckoutPresenterImpl checkoutPresenterImpl = this.f13658a;
                            checkoutPresenterImpl.activity.registerReceiver(checkoutPresenterImpl.otpAutoReadBroadcast, intentFilter, SmsRetriever.SEND_PERMISSION, null);
                        } catch (AbstractMethodError e) {
                            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                            this.f13658a.startSmsRetrieverForSavedCardsOTP();
                        } catch (Exception e2) {
                            AnalyticsUtil.reportError("CxPsntrImpl", "S2", e2.getMessage());
                            this.f13658a.startSmsRetrieverForSavedCardsOTP();
                        }
                    }

                    @Override // android.os.CountDownTimer
                    public final void onTick(long j3) {
                    }
                }.start();
            } catch (Exception e) {
                AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getMessage());
                startSmsRetrieverForSavedCardsOTP();
            }
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onPageFinished(int i, WebView webView, String str) {
        F_$o_ f_$o_;
        if (i == 1) {
            primaryWebviewPageFinished(str, webView);
        } else if (i == 2 && (f_$o_ = this.magicBase) != null && this.isMagic) {
            f_$o_.m15986a();
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onPageStarted(int i, WebView webView, String str) {
        F_$o_ f_$o_;
        if (i == 1) {
            CheckoutUtils.m15978e(this.activity);
        } else if (i == 2 && (f_$o_ = this.magicBase) != null && this.isMagic) {
            f_$o_.f13613d = false;
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onProgressChanges(int i, int i2) {
        if (i != 1) {
            return;
        }
        this.view.showProgressBar(i2);
    }

    @Override // com.razorpay.CheckoutPresenter
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onSubmit(String str) throws JSONException {
        if (this.paymentAttempts > 1) {
            AnalyticsUtil.refreshPaymentSession();
        }
        if (this.autoReadOtpHelper != null && this.loginOtpSmsTask.isComplete()) {
            try {
                this.activity.unregisterReceiver(this.autoReadOtpHelper);
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.checkoutContent = str;
            addAnalyticsData(jSONObject);
            savePrefillData(jSONObject);
            if (jSONObject.has(FirebaseAnalytics.Param.METHOD)) {
                String string = jSONObject.getString(FirebaseAnalytics.Param.METHOD);
                if (string.equalsIgnoreCase("netbanking") || string.equalsIgnoreCase("card")) {
                    if (Build.VERSION.SDK_INT >= 29 || c64.checkSelfPermission(this.activity, "android.permission.RECEIVE_SMS") != 0) {
                        startSmsRetrieverForSavedCardsOTP();
                    }
                } else if (string.equals("wallet") && jSONObject.has("wallet")) {
                    String string2 = jSONObject.getString("wallet");
                    if (this.checkoutOptions.m16002b(string2)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("external_wallet", string2);
                        AnalyticsUtil.addProperty("external_wallet", new AnalyticsProperty(string2, AnalyticsProperty.Scope.ORDER));
                        AnalyticsUtil.trackEvent(AnalyticsEvent.EXTERNAL_WALLET_SELECTED);
                        onComplete(jSONObject2);
                    }
                }
            }
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_SUBMIT);
            AnalyticsUtil.postData();
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
            d__1_.m16053a("Error in submit", e);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void passPrefillToSegment() {
        String strM16012k = this.checkoutOptions.m16012k();
        if (!TextUtils.isEmpty(strM16012k)) {
            AnalyticsUtil.addProperty("email", new AnalyticsProperty(strM16012k, AnalyticsProperty.Scope.ORDER));
        }
        String strM16011j = this.checkoutOptions.m16011j();
        if (TextUtils.isEmpty(strM16011j)) {
            return;
        }
        AnalyticsUtil.addProperty("contact", new AnalyticsProperty(strM16011j, AnalyticsProperty.Scope.ORDER));
    }

    public void primaryWebviewPageFinished(String str, WebView webView) {
        long jNanoTime = System.nanoTime();
        CheckoutUtils.m15969a();
        this.view.hideProgressBar();
        if (str.contains("https://api.razorpay.com") && str.contains(CredentialsData.CREDENTIALS_TYPE_ANDROID) && str.contains(BuildConfig.VERSION_NAME)) {
            if (this.paymentAttempts == 1) {
                this.isCheckoutLoaded = true;
                sendQueuedMessagesToCheckout();
                HashMap map = new HashMap();
                long j = jNanoTime - this.checkoutLoadStartAt;
                map.put("checkout_load_duration", Long.valueOf(j));
                BaseUtils.nanoTimeToSecondsString(j, 2);
                long j2 = this.preloadCompleteDuration;
                if (j2 > 0) {
                    map.put("preload_finish_duration", Long.valueOf(j2));
                    BaseUtils.nanoTimeToSecondsString(this.preloadCompleteDuration, 2);
                } else {
                    long j3 = this.preloadAbortDuration;
                    if (j3 > 0) {
                        map.put("preload_abort_duration", Long.valueOf(j3));
                        BaseUtils.nanoTimeToSecondsString(this.preloadAbortDuration, 2);
                    }
                }
                long j4 = this.preloadCompleteDuration - j;
                if (j4 > 0) {
                    map.put("time_shaved_off", Long.valueOf(j4));
                    BaseUtils.nanoTimeToSecondsString(j4, 2);
                }
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_LOADED, AnalyticsUtil.getJSONResponse(map));
            }
            if (this.clearHistory) {
                this.view.clearWebViewHistory(1);
                this.clearHistory = false;
            }
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void relay(String str) {
    }

    @Override // com.razorpay.CheckoutInteractor
    public void requestExtraAnalyticsData() {
        final JSONObject extraAnalyticsPayload = AnalyticsUtil.getExtraAnalyticsPayload();
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.J__A$
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f13640b.view.loadUrl(1, String.format("javascript: CheckoutBridge.sendExtraAnalyticsData(%s)", extraAnalyticsPayload.toString()));
                } catch (Exception e) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
                }
            }
        });
    }

    @Override // com.razorpay.CheckoutInteractor
    public void requestOtpPermission() {
    }

    @Override // com.razorpay.CheckoutPresenter
    public void saveInstanceState(Bundle bundle) {
        if (this.merchantLogoResourceId != 0) {
            bundle.putString("OPTIONS", this.checkoutOptions.m16010i());
            bundle.putInt("IMAGE", this.merchantLogoResourceId);
        } else {
            bundle.putString("OPTIONS", this.checkoutOptions.m16006e());
        }
        bundle.putString("DASH_OPTIONS", this.dashOptions);
        if (this.activity.getIntent() != null) {
            bundle.putBoolean("DISABLE_FULL_SCREEN", this.activity.getIntent().getBooleanExtra("DISABLE_FULL_SCREEN", false));
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void sendDataToWebView(final int i, final String str) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.z$_w$
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                if (i2 == 1) {
                    this.f13824c.view.loadUrl(1, String.format("javascript: handleRelay(%s)", str));
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.f13824c.view.loadUrl(2, String.format("javascript: Magic.handleRelay(%s)", str));
                }
            }
        });
    }

    @Override // com.razorpay.CheckoutPresenter
    public void sendOtpPermissionCallback(final boolean z) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.N_$R$
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("granted", z);
                    this.f13657b.view.loadUrl(1, String.format("javascript: otpPermissionCallback(%s)", jSONObject.toString()));
                } catch (Exception e) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S2", e.getLocalizedMessage());
                }
            }
        });
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setAppToken(String str) {
        C11907l.m16081b(this.activity).putString("rzp_app_token", str).apply();
    }

    @Override // com.razorpay.CheckoutPresenter
    public void setCheckoutLoadStartAt() {
        this.checkoutLoadStartAt = System.nanoTime();
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setDeviceToken(String str) {
        f$_G$.m16056a(this.activity, str);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setDimensions(int i, int i2) {
        if (C11897b.m16052a(this.activity)) {
            this.activity.runOnUiThread(new C11898c._2_(this, i2, i));
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setMerchantOptions(String str) {
        this.dashOptions = str;
        if (str != null) {
            try {
                if (str.equalsIgnoreCase(SQLiteCommandFactory.UNDEFINED)) {
                    this.dashOptionsJSON = null;
                } else {
                    this.dashOptionsJSON = new JSONObject(this.dashOptions);
                }
            } catch (Exception e) {
                d__1_.m16053a("Error parsing merchant dash options JSON", e);
                this.dashOptionsJSON = null;
                AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
            }
        } else {
            this.dashOptionsJSON = null;
        }
        if (this.dashOptionsJSON == null) {
            CheckoutUtils.m15972a(this.activity, this.merchantKey, (String) null);
        } else {
            CheckoutUtils.m15972a(this.activity, this.merchantKey, str);
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public boolean setOptions(Bundle bundle, boolean z) throws JSONException, PackageManager.NameNotFoundException {
        this.isActivityCreated = z;
        if (bundle == null) {
            destroyActivity(0, this.activity.getResources().getString(C11895R.string.activity_result_invalid_parameters));
            return false;
        }
        O_$v$ o_$v$ = new O_$v$(bundle.getString("OPTIONS"));
        this.checkoutOptions = o_$v$;
        JSONObject jSONObjectM16005d = o_$v$.m16005d();
        if (jSONObjectM16005d.has("retry")) {
            g$_H$.m16059a().m16064a(jSONObjectM16005d);
        }
        this.merchantKey = this.checkoutOptions.m15997a();
        this.sendSmsHash = this.checkoutOptions.m16001b();
        this.allowRotation = this.checkoutOptions.m16004c();
        int i = bundle.getInt("IMAGE", 0);
        this.merchantLogoResourceId = i;
        this.checkoutOptions.m15998a(this.activity, i);
        AnalyticsUtil.setup(this.activity, this.merchantKey, g$_H$.f13746a, g$_H$.f13748c, g$_H$.f13747b);
        jSONObjectM16005d.has("ep");
        O_$v$ o_$v$2 = this.checkoutOptions;
        String strM15966a = CheckoutUtils.m15966a("https://api.razorpay.com/v1/checkout/public", ClientCookie.VERSION_ATTR, g$_H$.f13747b);
        Map<String, String> mapM16070g = g$_H$.m16059a().m16070g();
        for (String str : mapM16070g.keySet()) {
            strM15966a = CheckoutUtils.m15966a(strM15966a, str, mapM16070g.get(str));
        }
        Iterator<String> it = g$_H$.m16059a().m16071h().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (o_$v$2.m16000a(next)) {
                strM15966a = CheckoutUtils.m15966a(strM15966a, next, (String) o_$v$2.m16003c(next));
            }
        }
        this.checkoutUrl = strM15966a;
        if (strM15966a == null) {
            destroyActivity(3, this.activity.getResources().getString(C11895R.string.activity_result_invalid_url));
        }
        if (z) {
            this.dashOptions = bundle.getString("DASH_OPTIONS");
            if (!bundle.getBoolean("DISABLE_FULL_SCREEN", false)) {
                return true;
            }
            CheckoutUtils.m15970a(this.activity);
            return true;
        }
        this.checkoutOptions.m16009h();
        Activity activity = this.activity;
        String str2 = this.merchantKey;
        String string = C11907l.m16078a(activity).getString("pref_merchant_options_" + str2, null);
        this.dashOptions = string;
        if (string != null) {
            try {
                this.dashOptionsJSON = new JSONObject(this.dashOptions);
            } catch (Exception e) {
                AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getLocalizedMessage());
            }
        }
        String string2 = bundle.getString("FRAMEWORK");
        if (string2 != null) {
            AnalyticsUtil.addProperty("framework", new AnalyticsProperty(string2, AnalyticsProperty.Scope.ORDER));
        }
        AnalyticsUtil.setFramework(string2);
        String string3 = bundle.getString("FRAMEWORK_VERSION");
        if (string3 != null) {
            AnalyticsUtil.addProperty("frameworkVersion", new AnalyticsProperty(string3, AnalyticsProperty.Scope.ORDER));
        }
        if (bundle.getBoolean("DISABLE_FULL_SCREEN", false)) {
            CheckoutUtils.m15970a(this.activity);
        }
        if (bundle.containsKey("PRELOAD_COMPLETE_DURATION")) {
            this.preloadCompleteDuration = bundle.getLong("PRELOAD_COMPLETE_DURATION");
        }
        if (!bundle.containsKey("PRELOAD_ABORT_DURATION")) {
            return true;
        }
        this.preloadAbortDuration = bundle.getLong("PRELOAD_ABORT_DURATION");
        return true;
    }

    @Override // com.razorpay.CheckoutInteractor
    public void setPaymentID(String str) {
        this.payment_id = str;
        BaseUtils.getInstance().setPaymentId(str);
        if (this.checkoutOptions.m16007f() != null) {
            BaseUtils.getInstance().setOrderId(this.checkoutOptions.m16007f());
        }
        AnalyticsUtil.addProperty("payment_id", new AnalyticsProperty(str, AnalyticsProperty.Scope.PAYMENT));
        AnalyticsUtil.trackEvent(AnalyticsEvent.PAYMENT_ID_ATTACHED);
    }

    @Override // com.razorpay.CheckoutPresenter
    public void setUpAddOn() {
        this.magicBase = new F_$o_(this.activity, this.view.getWebView(2));
    }

    @Override // com.razorpay.CheckoutInteractor
    public void showAlertDialog(String str, String str2, String str3) {
        this.activity.runOnUiThread(new H$$i_(this, str, str3, str2));
    }

    @Override // com.razorpay.CheckoutInteractor
    public void toast(final String str, final int i) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.T_$Z$
            @Override // java.lang.Runnable
            public final void run() {
                this.f13685c.view.showToast(str, i);
            }
        });
    }

    @Override // com.razorpay.CheckoutPresenter
    public void unregisterReceivers() {
        try {
            BroadcastReceiver broadcastReceiver = this.otpAutoReadBroadcast;
            if (broadcastReceiver != null) {
                this.activity.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPrntrImpl", "S2", e.getMessage());
        }
        try {
            AutoReadOtpHelper autoReadOtpHelper = this.autoReadOtpHelper;
            if (autoReadOtpHelper != null) {
                this.activity.unregisterReceiver(autoReadOtpHelper);
            }
        } catch (Exception e2) {
            AnalyticsUtil.reportError("CxPrntrImpl", "S2", e2.getMessage());
        }
    }

    @Override // com.razorpay.CheckoutPresenter
    public void verifyGPaySdkResponse(String str) {
        String str2 = String.format("javascript: window.externalSDKResponse(%s)", str);
        if (this.isCheckoutLoaded) {
            this.view.loadUrl(1, str2);
            return;
        }
        if (this.checkoutMessageQueue == null) {
            this.checkoutMessageQueue = new LinkedList();
        }
        this.checkoutMessageQueue.add(str2);
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onDismiss(String str) {
        try {
            destroyActivity(0, new JSONObject(str).toString());
        } catch (JSONException unused) {
            destroyActivity(0, BaseUtils.getGenericPaymentErrorResponse(str, BaseUtils.getInstance().getMetadata()));
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onError(String str) {
        try {
            onError(new JSONObject(str));
        } catch (Exception e) {
            AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
            this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.L_$k$
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13648a.helpersReset();
                    this.f13648a.loadForm("");
                }
            });
        }
    }

    @Override // com.razorpay.CheckoutInteractor
    public void onComplete(final String str) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.razorpay.K_$q$
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f13645b.onComplete(new JSONObject(str));
                } catch (Exception e) {
                    AnalyticsUtil.reportError("CxPsntrImpl", "S0", e.getMessage());
                    this.f13645b.destroyActivity(0, BaseUtils.getPaymentCancelledResponse(BaseUtils.getInstance().getMetadata()));
                }
            }
        });
    }
}
