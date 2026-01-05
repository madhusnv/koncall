package com.razorpay;

import android.app.Activity;
import android.webkit.WebView;
import com.razorpay.CheckoutPresenterImpl;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class Z$_A_ extends CheckoutPresenterImpl {
    private boolean isSecondaryRzpAssistEnabled;
    private RzpAssist primaryRzpAssist;
    private RzpAssist secondaryRzpAssist;

    public Z$_A_(Activity activity, CheckoutPresenterImpl.CheckoutView checkoutView) {
        super(activity, checkoutView);
        this.isSecondaryRzpAssistEnabled = true;
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public void addAnalyticsData(JSONObject jSONObject) throws JSONException {
        try {
            RzpAssist rzpAssist = this.primaryRzpAssist;
            if (rzpAssist != null) {
                rzpAssist.setPaymentData(jSONObject);
                jSONObject.put("razorpay_otp", this.primaryRzpAssist.isRazorpayOtpReceived());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        super.addAnalyticsData(jSONObject);
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public void addOnFlowEnd() {
        RzpAssist rzpAssist = this.primaryRzpAssist;
        if (rzpAssist != null) {
            rzpAssist.paymentFlowEnd();
        }
        RzpAssist rzpAssist2 = this.secondaryRzpAssist;
        if (rzpAssist2 != null) {
            rzpAssist2.paymentFlowEnd();
        }
        super.addOnFlowEnd();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void backPressed(Map<String, Object> map) {
        RzpAssist rzpAssist = this.primaryRzpAssist;
        if (rzpAssist != null) {
            map.put("current_loading_url_primary_webview", rzpAssist.getCurrentLoadingUrl());
            map.put("last_loaded_url_primary_webview", this.primaryRzpAssist.getLastLoadedUrl());
        }
        RzpAssist rzpAssist2 = this.secondaryRzpAssist;
        if (rzpAssist2 != null) {
            map.put("current_loading_url_secondary_webview", rzpAssist2.getCurrentLoadingUrl());
            map.put("last_loaded_url_secondary_webview", this.secondaryRzpAssist.getLastLoadedUrl());
        }
        super.backPressed(map);
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public void enableAddon(JSONObject jSONObject) throws JSONException {
        super.enableAddon(jSONObject);
        try {
            if (jSONObject.has("otpelf")) {
                boolean z = jSONObject.getBoolean("otpelf");
                this.isSecondaryRzpAssistEnabled = z;
                RzpAssist rzpAssist = this.secondaryRzpAssist;
                if (rzpAssist != null) {
                    rzpAssist.setRzpAssistEnabled(z);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public void helpersReset() {
        super.helpersReset();
        RzpAssist rzpAssist = this.primaryRzpAssist;
        if (rzpAssist != null) {
            rzpAssist.reset();
        }
        RzpAssist rzpAssist2 = this.secondaryRzpAssist;
        if (rzpAssist2 == null || !this.isSecondaryRzpAssistEnabled) {
            return;
        }
        rzpAssist2.reset();
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void onPageFinished(int i, WebView webView, String str) {
        super.onPageFinished(i, webView, str);
        if (i != 2) {
            return;
        }
        RzpAssist rzpAssist = this.secondaryRzpAssist;
        if (rzpAssist != null && this.isSecondaryRzpAssistEnabled) {
            rzpAssist.onPageFinished(webView, str);
        }
        if (this.view.isWebViewVisible(2)) {
            CheckoutUtils.m15969a();
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void onPageStarted(int i, WebView webView, String str) {
        super.onPageStarted(i, webView, str);
        if (i == 1) {
            RzpAssist rzpAssist = this.primaryRzpAssist;
            if (rzpAssist != null) {
                rzpAssist.onPageStarted(webView, str);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        RzpAssist rzpAssist2 = this.secondaryRzpAssist;
        if (rzpAssist2 != null && this.isSecondaryRzpAssistEnabled) {
            rzpAssist2.onPageStarted(webView, str);
        }
        if (this.view.isWebViewVisible(2)) {
            CheckoutUtils.m15978e(this.activity);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void onProgressChanges(int i, int i2) {
        RzpAssist rzpAssist;
        if (i == 1) {
            RzpAssist rzpAssist2 = this.primaryRzpAssist;
            if (rzpAssist2 != null) {
                rzpAssist2.onProgressChanged(i2);
            }
        } else if (i == 2 && (rzpAssist = this.secondaryRzpAssist) != null && this.isSecondaryRzpAssistEnabled) {
            rzpAssist.onProgressChanged(i2);
        }
        super.onProgressChanges(i, i2);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        RzpAssist rzpAssist = this.primaryRzpAssist;
        if (rzpAssist != null) {
            rzpAssist.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl
    public void primaryWebviewPageFinished(String str, WebView webView) throws JSONException {
        super.primaryWebviewPageFinished(str, webView);
        RzpAssist rzpAssist = this.primaryRzpAssist;
        if (rzpAssist != null) {
            rzpAssist.onPageFinished(webView, str);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutInteractor
    public void setPaymentID(String str) {
        RzpAssist rzpAssist = this.primaryRzpAssist;
        if (rzpAssist != null) {
            rzpAssist.setPaymentId(str);
        }
        super.setPaymentID(str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl, com.razorpay.CheckoutPresenter
    public void setUpAddOn() {
        RzpAssist rzpAssist;
        RzpAssist rzpAssist2 = new RzpAssist(this.merchantKey, this.activity, this.view.getWebView(1), g$_H$.f13746a, g$_H$.f13748c, g$_H$.f13747b);
        this.primaryRzpAssist = rzpAssist2;
        rzpAssist2.setRzpAssistEnabled(true);
        RzpAssist rzpAssist3 = new RzpAssist(this.merchantKey, this.activity, this.view.getWebView(2), g$_H$.f13746a, g$_H$.f13748c, g$_H$.f13747b);
        this.secondaryRzpAssist = rzpAssist3;
        rzpAssist3.setRzpAssistEnabled(true);
        if (this.checkoutOptions.m16008g() != null && (rzpAssist = this.primaryRzpAssist) != null) {
            rzpAssist.setOtpElfPreferences(this.checkoutOptions.m16008g());
        }
        super.setUpAddOn();
    }
}
