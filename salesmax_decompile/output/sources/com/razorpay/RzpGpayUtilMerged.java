package com.razorpay;

import android.net.Uri;
import android.text.TextUtils;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RzpGpayUtilMerged {
    private static final String GOOGLE_PAY = "GOOGLE_PAY";
    private static final String GPAY_INAPP = "gpay_inapp";
    private static final String GPAY_MERGED = "gpay_merged";

    private static JSONArray getAllowedCardNetworks() {
        return new JSONArray().put("MASTERCARD").put("VISA");
    }

    private static JSONObject getBaseCardPaymentMethod() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "CARD");
            jSONObject.put("parameters", new JSONObject().put("allowedCardNetworks", getAllowedCardNetworks()));
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getLocalizedMessage());
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject getBaseRequest() {
        try {
            return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private static JSONObject getBaseUPIPaymentMethod() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "UPI");
            return jSONObject;
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject getCardsIsReadyToPayRequest() throws JSONException {
        try {
            JSONObject baseRequest = getBaseRequest();
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(getBaseCardPaymentMethod()));
            return baseRequest;
        } catch (JSONException e) {
            e.printStackTrace();
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            return null;
        }
    }

    public static JSONObject getIsReadyToPayRequest() throws JSONException {
        try {
            JSONObject baseRequest = getBaseRequest();
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(getBaseUPIPaymentMethod()));
            return baseRequest;
        } catch (JSONException e) {
            e.printStackTrace();
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            return null;
        }
    }

    public static String getPaymentRequestData(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject upiData = getUpiData(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiVersion", 2);
            jSONObject2.put("apiVersionMinor", 0);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("totalPriceStatus", "FINAL");
            jSONObject3.put("totalPrice", new BigDecimal(String.valueOf(jSONObject.getLong("amount"))).divide(new BigDecimal(100)).toPlainString());
            jSONObject3.put("currencyCode", jSONObject.getString(FirebaseAnalytics.Param.CURRENCY));
            jSONObject3.put("transactionNote", upiData.get(MediaTrack.ROLE_DESCRIPTION));
            jSONObject2.put("transactionInfo", jSONObject3);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type", "UPI");
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("payeeVpa", upiData.get("address"));
            jSONObject5.put("payeeName", upiData.get("name"));
            jSONObject5.put("mcc", upiData.get("mc"));
            jSONObject5.put("transactionReferenceId", upiData.get("transactionRefId"));
            jSONObject4.put("parameters", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("type", "DIRECT");
            jSONObject4.put("tokenizationSpecification", jSONObject6);
            jSONArray.put(jSONObject4);
            jSONObject2.put("allowedPaymentMethods", jSONArray);
            return jSONObject2.toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject getUpiData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!str.startsWith("upi://")) {
                str = new JSONObject(new JSONObject(str).getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getString("intent_url");
            }
            if (str.contains("//")) {
                try {
                    Map<String, String> mapSplitQuery = splitQuery(new URL(str.replaceFirst("upi://", "http://")));
                    if (!TextUtils.isEmpty(mapSplitQuery.get("pa"))) {
                        jSONObject.put("address", mapSplitQuery.get("pa"));
                    }
                    if (!TextUtils.isEmpty(mapSplitQuery.get("pn"))) {
                        jSONObject.put("name", mapSplitQuery.get("pn"));
                    }
                    if (!TextUtils.isEmpty(mapSplitQuery.get("am"))) {
                        jSONObject.put("amount", mapSplitQuery.get("am"));
                    }
                    if (!TextUtils.isEmpty(mapSplitQuery.get("tn"))) {
                        jSONObject.put(MediaTrack.ROLE_DESCRIPTION, mapSplitQuery.get("tn"));
                    }
                    if (!TextUtils.isEmpty(mapSplitQuery.get("tr"))) {
                        jSONObject.put("transactionRefId", mapSplitQuery.get("tr"));
                    }
                    if (!TextUtils.isEmpty(mapSplitQuery.get("mc"))) {
                        jSONObject.put("mc", mapSplitQuery.get("mc"));
                    }
                } catch (UnsupportedEncodingException e) {
                    AnalyticsUtil.reportError("RzpGpay", "S0", e.getLocalizedMessage());
                    e.printStackTrace();
                } catch (MalformedURLException e2) {
                    AnalyticsUtil.reportError("RzpGpay", "S2", e2.getLocalizedMessage());
                    e2.printStackTrace();
                }
            }
        } catch (JSONException e3) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e3.getMessage());
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public static String makeApiPayload(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            sb.append(String.format("%s=%s&", next, Uri.encode(jSONObject.getString(next))));
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String makeErrorPayload(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", str);
            jSONObject2.put(MediaTrack.ROLE_DESCRIPTION, str2);
            jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            e.printStackTrace();
            return "{\"error\":{\"code\": \"BAD_REQUEST_ERROR\", \"description\": \"An unknown error occurred.\"}}";
        }
    }

    public static String makeExceptionErrorPayload(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, GOOGLE_PAY);
            jSONObject.put("resultCode", "1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", GPAY_MERGED);
            jSONObject2.put(MediaTrack.ROLE_DESCRIPTION, "Something went wrong please try again.");
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "{\"provider\":\"GOOGLE_PAY\",\"resultCode\":\"1\",\"data\":{\"apiResponse\":{\"type\":\"gpay_merged\",\"description\":\"Something went wrong. Please try again\"}}}";
        }
    }

    public static String makeExternalSDKPayload(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("type", GPAY_INAPP);
            jSONObject2.put("apiResponse", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, GOOGLE_PAY);
            jSONObject3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject3.toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String makeMergedExternalSDKErrorPayload(JSONObject jSONObject, int i, String str) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("type", GPAY_MERGED);
            jSONObject3.put(MediaTrack.ROLE_DESCRIPTION, str);
            jSONObject2.put("apiResponse", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, GOOGLE_PAY);
            jSONObject4.put("resultCode", i);
            jSONObject4.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject4.toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            return makeExceptionErrorPayload(jSONObject.has("bundle"));
        }
    }

    public static String makeMergedExternalSDKPayload(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("type", GPAY_MERGED);
            jSONObject2.put("apiResponse", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, GOOGLE_PAY);
            jSONObject3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject3.toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError("RzpGpay", "error:exception", e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    private static Map<String, String> splitQuery(URL url) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : url.getQuery().split("&")) {
            int iIndexOf = str.indexOf("=");
            linkedHashMap.put(URLDecoder.decode(str.substring(0, iIndexOf), HTTP.UTF_8), URLDecoder.decode(str.substring(iIndexOf + 1), HTTP.UTF_8));
        }
        return linkedHashMap;
    }
}
