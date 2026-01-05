package com.razorpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.google.firebase.messaging.Constants;
import com.razorpay.CheckoutBridge;
import com.razorpay.CheckoutPresenterImpl;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class PluginOtpElfCheckoutPresenterImpl extends Z$_A_ implements PluginCheckoutInteractor {
    private RzpPlugin extActiveRzpPluginInstance;
    private boolean isExtRzpPluginActive;
    private HashMap<String, String> pluginsMap;
    private final RzpInternalCallback rzpInternalCallback;

    public PluginOtpElfCheckoutPresenterImpl(Activity activity, CheckoutPresenterImpl.CheckoutView checkoutView, HashMap<String, String> map) {
        super(activity, checkoutView);
        this.isExtRzpPluginActive = false;
        this.rzpInternalCallback = new RzpInternalCallback() { // from class: com.razorpay.g$$C_
            @Override // com.razorpay.RzpInternalCallback
            public final void onPaymentError(int i, String str) {
                HashMap map2 = new HashMap();
                map2.put("response", str);
                map2.put("code", Integer.valueOf(i));
                AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR, AnalyticsUtil.getJSONResponse(map2));
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has(AWSCognitoLegacyCredentialStore.PROVIDER_KEY) && jSONObject.getString(AWSCognitoLegacyCredentialStore.PROVIDER_KEY).equals("GOOGLE_PAY")) {
                        this.f13745a.verifyGPayResponse(str);
                    } else {
                        this.f13745a.onComplete(jSONObject.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR_EXCEPTION);
                    this.f13745a.onComplete(str);
                }
            }

            @Override // com.razorpay.RzpInternalCallback
            public final void onPaymentSuccess(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has(AWSCognitoLegacyCredentialStore.PROVIDER_KEY) && jSONObject.getString(AWSCognitoLegacyCredentialStore.PROVIDER_KEY).equals("GOOGLE_PAY")) {
                        this.f13745a.verifyGPayResponse(str);
                    } else {
                        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_SUCCESS, AnalyticsUtil.getJSONResponse(str));
                        this.f13745a.onComplete(str);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_INTERNAL_CALLBACK_ERROR);
                }
            }
        };
        this.pluginsMap = map;
    }

    @Override // com.razorpay.Z$_A_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void backPressed(Map map) {
        super.backPressed(map);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void callNativeIntent(String str, String str2) {
        super.callNativeIntent(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void checkSmsPermission() {
        super.checkSmsPermission();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void cleanUpOnDestroy() {
        super.cleanUpOnDestroy();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void destroyActivity(int i, String str) {
        super.destroyActivity(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void fetchCondfig() {
        super.fetchCondfig();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ O_$v$ getCheckoutOptions() {
        return super.getCheckoutOptions();
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public JSONObject getOptionsForHandleMessage() throws JSONException {
        JSONObject optionsForHandleMessage = super.getOptionsForHandleMessage();
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z = false;
            boolean z2 = false;
            for (String str : this.pluginsMap.keySet()) {
                int length = str.length();
                if (str.substring(20, length).equalsIgnoreCase("googlepay_all")) {
                    try {
                        if (Class.forName("com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient").newInstance() != null) {
                            jSONObject.put("googlepay", true);
                            z2 = true;
                        }
                    } catch (ClassNotFoundException unused) {
                        AnalyticsUtil.reportError(getClass().getName(), "S2", "GooglePay SDK is not included");
                    }
                }
                if (str.substring(20, length).equalsIgnoreCase("googlepay")) {
                    jSONObject.put(str.substring(20, length), true);
                    z = true;
                }
            }
            if (z && z2) {
                optionsForHandleMessage.put("googlepay_wrapper_version", "both");
            } else if (z2) {
                optionsForHandleMessage.put("googlepay_wrapper_version", "2");
            }
            optionsForHandleMessage.put("external_sdks", jSONObject);
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getLocalizedMessage());
            e.printStackTrace();
        }
        return optionsForHandleMessage;
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void getPdfString(String str, String str2) throws IOException {
        super.getPdfString(str, str2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ String getProgressBarColor() {
        return super.getProgressBarColor();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ String getSdkPlugins() {
        return super.getSdkPlugins();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void handleCardSaving() throws JSONException {
        super.handleCardSaving();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void invokePopup(String str) {
        super.invokePopup(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean isAllowRotation() {
        return super.isAllowRotation();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean isMagicPresent() {
        return super.isMagicPresent();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ boolean isUserRegistered(String str) {
        return super.isUserRegistered(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ boolean isUserRegisteredOnUPI(String str) {
        return super.isUserRegisteredOnUPI(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void isWebViewSafe(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        super.isWebViewSafe(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void isWebViewSafeOnUI(int i, CheckoutBridge.WebViewSafeCheckCallback webViewSafeCheckCallback) {
        super.isWebViewSafeOnUI(i, webViewSafeCheckCallback);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void loadForm(String str) {
        super.loadForm(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void onActivityResultReceived(int i, int i2, Intent intent) throws JSONException {
        if (this.isExtRzpPluginActive) {
            this.extActiveRzpPluginInstance.onActivityResult(this.merchantKey, i, i2, intent);
        } else {
            super.onActivityResultReceived(i, i2, intent);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onCheckoutBackPress() {
        super.onCheckoutBackPress();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onCheckoutRendered() {
        super.onCheckoutRendered();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onComplete(String str) {
        super.onComplete(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onDismiss() {
        super.onDismiss();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onError(String str) {
        super.onError(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onFault(String str) {
        super.onFault(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onLoad() {
        super.onLoad();
    }

    @Override // com.razorpay.Z$_A_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onPageFinished(int i, WebView webView, String str) {
        super.onPageFinished(i, webView, str);
    }

    @Override // com.razorpay.Z$_A_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onPageStarted(int i, WebView webView, String str) {
        super.onPageStarted(i, webView, str);
    }

    @Override // com.razorpay.Z$_A_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onProgressChanges(int i, int i2) {
        super.onProgressChanges(i, i2);
    }

    @Override // com.razorpay.Z$_A_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onSubmit(String str) throws JSONException {
        super.onSubmit(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void passPrefillToSegment() {
        super.passPrefillToSegment();
    }

    @Override // com.razorpay.PluginCheckoutInteractor
    public void processPayment(String str) {
        RzpPlugin rzpPlugin;
        HashMap<String, String> map = this.pluginsMap;
        if (map == null || map.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map2 = new HashMap();
            map2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_CALLING_PROCESS_PAYMENT, AnalyticsUtil.getJSONResponse(map2));
            if (this.pluginsMap.containsKey("com.razorpay.plugin.googlepay_all") && this.pluginsMap.containsValue("com.razorpay.plugin.googlepay")) {
                this.pluginsMap.remove("com.razorpay.plugin.googlepay");
            }
            Iterator<String> it = this.pluginsMap.values().iterator();
            while (it.hasNext()) {
                try {
                    rzpPlugin = (RzpPlugin) RzpPlugin.class.getClassLoader().loadClass(it.next()).newInstance();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                    e.printStackTrace();
                }
                if (rzpPlugin.doesHandlePayload(this.merchantKey, jSONObject, this.activity)) {
                    this.isExtRzpPluginActive = true;
                    this.extActiveRzpPluginInstance = rzpPlugin;
                    rzpPlugin.processPayment(this.merchantKey, jSONObject, this.activity, this.rzpInternalCallback);
                    return;
                }
                continue;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            HashMap map3 = new HashMap();
            map3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_CALLING_PROCESS_PAYMENT_EXCEPTION, AnalyticsUtil.getJSONResponse(map3));
            e2.printStackTrace();
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void relay(String str) {
        super.relay(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void requestExtraAnalyticsData() {
        super.requestExtraAnalyticsData();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void requestOtpPermission() {
        super.requestOtpPermission();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void saveInstanceState(Bundle bundle) {
        super.saveInstanceState(bundle);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void sendDataToWebView(int i, String str) {
        super.sendDataToWebView(i, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void sendOtpPermissionCallback(boolean z) {
        super.sendOtpPermissionCallback(z);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setAppToken(String str) {
        super.setAppToken(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setCheckoutLoadStartAt() {
        super.setCheckoutLoadStartAt();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setDeviceToken(String str) {
        super.setDeviceToken(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setDimensions(int i, int i2) {
        super.setDimensions(i, i2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setMerchantOptions(String str) {
        super.setMerchantOptions(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ boolean setOptions(Bundle bundle, boolean z) {
        return super.setOptions(bundle, z);
    }

    @Override // com.razorpay.Z$_A_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void setPaymentID(String str) {
        super.setPaymentID(str);
    }

    @Override // com.razorpay.Z$_A_, com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void setUpAddOn() {
        super.setUpAddOn();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void showAlertDialog(String str, String str2, String str3) {
        super.showAlertDialog(str, str2, str3);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void toast(String str, int i) {
        super.toast(str, i);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void unregisterReceivers() {
        super.unregisterReceivers();
    }

    @Override // com.razorpay.PluginCheckoutInteractor
    public void verifyGPayResponse(String str) {
        super.verifyGPaySdkResponse(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public /* bridge */ /* synthetic */ void verifyGPaySdkResponse(String str) {
        super.verifyGPaySdkResponse(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public /* bridge */ /* synthetic */ void onDismiss(String str) {
        super.onDismiss(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public void onError(JSONObject jSONObject) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_PLUGIN_ON_ERROR_CALLED, jSONObject);
        if (!this.isExtRzpPluginActive) {
            super.onError(jSONObject);
            return;
        }
        this.view.loadUrl(1, String.format("javascript: window.onComplete(%s)", jSONObject.toString()));
        this.isExtRzpPluginActive = false;
    }
}
