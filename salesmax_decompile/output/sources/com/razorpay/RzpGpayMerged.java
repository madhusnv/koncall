package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient;
import com.google.android.apps.nbu.paisa.inapp.client.api.Wallet;
import com.google.android.apps.nbu.paisa.inapp.client.api.WalletUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class RzpGpayMerged implements OnCompleteListener<Boolean>, RzpPlugin {
    private static int LOAD_PAYMENT_DATA_REQUEST_CODE = 1;
    private JSONObject apiResponse;
    private PaymentsClient mPaymentClient;
    private RzpPluginRegisterCallback registerCallback;
    private RzpInternalCallback rzpInternalCallback;
    private boolean isUpiOnly = false;
    private Task<Boolean> cardsTask = null;
    private Task<Boolean> upiTask = null;

    /* JADX INFO: Access modifiers changed from: private */
    public void genericOnPaymentFailure(String str, int i, String str2) {
        if (this.isUpiOnly) {
            this.rzpInternalCallback.onPaymentError(5, RzpGpayUtilMerged.makeErrorPayload(str, str2));
        } else {
            this.rzpInternalCallback.onPaymentError(5, RzpGpayUtilMerged.makeMergedExternalSDKErrorPayload(this.apiResponse, i, str2));
        }
    }

    private void genericOnPaymentSuccess() {
        if (this.isUpiOnly) {
            this.rzpInternalCallback.onPaymentSuccess(RzpGpayUtilMerged.makeExternalSDKPayload(this.apiResponse));
        } else {
            this.rzpInternalCallback.onPaymentSuccess(RzpGpayUtilMerged.makeMergedExternalSDKPayload(this.apiResponse));
        }
    }

    private void handleResultStatusCode(int i) {
        if (i == 405) {
            genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "There is a problem with merchant's account.");
        } else if (i != 409) {
            genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "An internal error has occurred");
        } else {
            genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "There is a problem with your Google Pay account.");
        }
    }

    private void processPaymentResponse(String str) {
        AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_VERIFY_PAYMENT_CALLED);
        if (verifyPaymentResponse(str)) {
            AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_VERIFY_PAYMENT_SUCCESS_CALLED);
            genericOnPaymentSuccess();
        } else {
            AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_VERIFY_PAYMENT_ERROR_CALLED);
            genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "Payment was not successful.");
        }
    }

    private static boolean verifyPaymentResponse(String str) throws JSONException {
        try {
            String string = new JSONObject(str).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString(AWSCognitoLegacyCredentialStore.TOKEN_KEY);
            if (string == null) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_VERIFY_PAYMENT_EXCEPTION);
                return false;
            }
            String string2 = new JSONObject(new JSONObject(string).getString("signedMessage")).getJSONObject("paymentMethodDetails").getString("status");
            return string2 != null && string2.equals("SUCCESS");
        } catch (JSONException unused) {
            AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_VERIFY_PAYMENT_EXCEPTION);
            return false;
        }
    }

    @Override // com.razorpay.RzpPlugin
    public boolean doesHandlePayload(String str, JSONObject jSONObject, Activity activity) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(FirebaseAnalytics.Param.METHOD) && jSONObject.getString(FirebaseAnalytics.Param.METHOD).equalsIgnoreCase("upi") && jSONObject.getString("_[app]").equalsIgnoreCase("com.google.android.apps.nbu.paisa.user")) {
                    return true;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (jSONObject != null && jSONObject.has("type") && jSONObject.getString("type").equalsIgnoreCase("application")) {
            if (jSONObject.getString("application_name").equalsIgnoreCase("google_pay")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.razorpay.RzpPlugin
    public RzpPluginCompatibilityResponse isCompatible(String str, int i, String str2) {
        if (str.equalsIgnoreCase(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM) && i > 27) {
            return new RzpPluginCompatibilityResponse(true, null);
        }
        if (!str.equalsIgnoreCase("standard") || i <= 18) {
            return new RzpPluginCompatibilityResponse(false, str.equalsIgnoreCase(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM) ? "Razorpay's GooglePay plugin requires a min SDK Version 3.8.8 Please update." : str.equalsIgnoreCase("standard") ? "Razorpay's GooglePay plugin requires a min SDK Version 1.5.6 Please update." : "Incompatible Razorpay sdk version. Please update the base sdk");
        }
        return new RzpPluginCompatibilityResponse(true, null);
    }

    @Override // com.razorpay.RzpPlugin
    public void isRegistered(Context context, RzpPluginRegisterCallback rzpPluginRegisterCallback) throws JSONException {
        this.registerCallback = rzpPluginRegisterCallback;
        AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_CHECK_REGISTER_CALLED);
        try {
            this.mPaymentClient = Wallet.getPaymentsClient();
            AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_PAYMENT_IS_REGISTERED_CALLED);
            PaymentsClient paymentsClient = this.mPaymentClient;
            JSONObject isReadyToPayRequest = RzpGpayUtilMerged.getIsReadyToPayRequest();
            Objects.requireNonNull(isReadyToPayRequest);
            this.upiTask = paymentsClient.isReadyToPay(context, isReadyToPayRequest.toString());
            PaymentsClient paymentsClient2 = this.mPaymentClient;
            JSONObject cardsIsReadyToPayRequest = RzpGpayUtilMerged.getCardsIsReadyToPayRequest();
            Objects.requireNonNull(cardsIsReadyToPayRequest);
            this.cardsTask = paymentsClient2.isReadyToPay(context, cardsIsReadyToPayRequest.toString());
        } catch (NoSuchAlgorithmException e) {
            AnalyticsUtil.reportError(getClass().getName(), "error:exception", e.getMessage());
        }
        Task<Boolean> task = this.cardsTask;
        Objects.requireNonNull(task);
        task.addOnCompleteListener(this);
        Task<Boolean> task2 = this.upiTask;
        Objects.requireNonNull(task2);
        task2.addOnCompleteListener(this);
    }

    @Override // com.razorpay.RzpPlugin
    public void onActivityResult(String str, int i, int i2, Intent intent) {
        if (i == LOAD_PAYMENT_DATA_REQUEST_CODE) {
            if (i2 == -1) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_PAYMENT_CALLBACK_SUCCESS);
                processPaymentResponse(WalletUtils.getPaymentDataFromIntent(intent));
            } else if (i2 == 0) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_PAYMENT_CALLBACK_CANCELLED);
                genericOnPaymentFailure("BAD_REQUEST_ERROR", 0, "Payment canceled.");
            } else {
                if (i2 != 1) {
                    return;
                }
                handleResultStatusCode(intent.getIntExtra("errorCode", 8));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Boolean> task) {
        boolean zBooleanValue = task.getResult().booleanValue();
        if (!task.equals(this.cardsTask)) {
            BaseUtils.setCompatibleWithGooglePay(zBooleanValue);
        } else {
            BaseUtils.setIsGpayCardsUpiRegistered(zBooleanValue);
            this.registerCallback.onResponse(zBooleanValue);
        }
    }

    @Override // com.razorpay.RzpPlugin
    public void processPayment(String str, JSONObject jSONObject, Activity activity, RzpInternalCallback rzpInternalCallback) throws JSONException {
        try {
            this.rzpInternalCallback = rzpInternalCallback;
            this.mPaymentClient = Wallet.getPaymentsClient();
            AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_PROCESS_PAYMENT_CALLED);
            if (jSONObject.has("type") && jSONObject.getString("type").equalsIgnoreCase("application")) {
                this.apiResponse = jSONObject;
                try {
                    this.mPaymentClient.loadPaymentData(activity, jSONObject.getJSONObject("request").getJSONArray(FirebaseAnalytics.Param.CONTENT).getJSONObject(0).toString(), LOAD_PAYMENT_DATA_REQUEST_CODE);
                    return;
                } catch (Exception e) {
                    AnalyticsUtil.reportError(getClass().getName(), "S0", e.getMessage());
                    genericOnPaymentFailure("BAD_REQUEST", 1, "An internal error has occured");
                    return;
                }
            }
            if (!jSONObject.has("url_data")) {
                HashMap map = new HashMap();
                map.put("Content-Type", "application/x-www-form-urlencoded");
                M$_3_.m15991a("https://api.razorpay.com/v1/payments/create/ajax", RzpGpayUtilMerged.makeApiPayload(jSONObject), map, new C11903h(this, activity, jSONObject));
                return;
            }
            this.isUpiOnly = true;
            try {
                String string = jSONObject.get("url_data").toString();
                try {
                    this.apiResponse = RzpGpayUtilMerged.getUpiData(string);
                    this.mPaymentClient.loadPaymentData(activity, RzpGpayUtilMerged.getPaymentRequestData(string, jSONObject), LOAD_PAYMENT_DATA_REQUEST_CODE);
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "An internal error has occurred");
                    return;
                }
            } catch (Exception e3) {
                AnalyticsUtil.reportError(getClass().getName(), "error:exception", e3.getMessage());
                genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "An internal error has occurred");
                return;
            }
        } catch (Exception e4) {
            AnalyticsUtil.reportError(getClass().getName(), "error:exception", e4.getMessage());
            genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "An internal error has occurred.");
        }
        AnalyticsUtil.reportError(getClass().getName(), "error:exception", e4.getMessage());
        genericOnPaymentFailure("BAD_REQUEST_ERROR", 1, "An internal error has occurred.");
    }

    @Override // com.razorpay.RzpPlugin
    public void isRegistered(Context context) throws JSONException {
        Task taskIsReadyToPay;
        this.mPaymentClient = Wallet.getPaymentsClient();
        AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_CHECK_REGISTER_CALLED);
        Task taskIsReadyToPay2 = null;
        try {
            AnalyticsUtil.trackEvent(AnalyticsEvent.GOOGLEPAY_PAYMENT_IS_REGISTERED_CALLED);
            PaymentsClient paymentsClient = this.mPaymentClient;
            JSONObject isReadyToPayRequest = RzpGpayUtilMerged.getIsReadyToPayRequest();
            Objects.requireNonNull(isReadyToPayRequest);
            taskIsReadyToPay = paymentsClient.isReadyToPay(context, isReadyToPayRequest.toString());
            try {
                PaymentsClient paymentsClient2 = this.mPaymentClient;
                JSONObject cardsIsReadyToPayRequest = RzpGpayUtilMerged.getCardsIsReadyToPayRequest();
                Objects.requireNonNull(cardsIsReadyToPayRequest);
                taskIsReadyToPay2 = paymentsClient2.isReadyToPay(context, cardsIsReadyToPayRequest.toString());
            } catch (NoSuchAlgorithmException e) {
                e = e;
                AnalyticsUtil.reportError(getClass().getName(), "error:exception", e.getMessage());
                Objects.requireNonNull(taskIsReadyToPay2);
                taskIsReadyToPay2.addOnCompleteListener(new C11904i(this));
                Objects.requireNonNull(taskIsReadyToPay);
                taskIsReadyToPay.addOnCompleteListener(new C11905j(this));
            }
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            taskIsReadyToPay = null;
        }
        Objects.requireNonNull(taskIsReadyToPay2);
        taskIsReadyToPay2.addOnCompleteListener(new C11904i(this));
        Objects.requireNonNull(taskIsReadyToPay);
        taskIsReadyToPay.addOnCompleteListener(new C11905j(this));
    }
}
