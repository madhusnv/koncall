package com.razorpay;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.razorpay.AnalyticsProperty;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Keep
@KeepClassMembers
/* loaded from: classes6.dex */
class AnalyticsUtil {
    static String BUILD_TYPE = null;
    static String FRAMEWORK = null;
    static String KEY_TYPE = null;
    static int MERCHANT_APP_BUILD = 0;
    static CharSequence MERCHANT_APP_NAME = null;
    static CharSequence MERCHANT_APP_NAMESPACE = null;
    static CharSequence MERCHANT_APP_VERSION = null;
    private static boolean isAnalyticsInitialized = false;
    static String libraryType = null;
    private static String localOrderId = null;
    private static String localPaymentId = null;
    private static String sdkType = "standealone";
    private static String sdkVersion;
    private static int sdkVersionCode;
    static int sessionErroredApiCalls;

    public static void addFilteredPropertiesFromPayload(JSONObject jSONObject) {
        U$$U$.m16029a(jSONObject);
    }

    public static void addProperty(String str, AnalyticsProperty analyticsProperty) {
        AnalyticsProperty.Scope scope = analyticsProperty.scope;
        if (scope == AnalyticsProperty.Scope.PAYMENT) {
            U$$U$.m16025a(str, analyticsProperty.value);
        } else if (scope == AnalyticsProperty.Scope.ORDER) {
            U$$U$.m16034b(str, analyticsProperty.value);
        }
    }

    public static JSONObject getAnalyticsDataForCheckout(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "mobile_sdk");
            jSONObject.put("platform_version", sdkVersion);
            jSONObject.put("os", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            if (C11897b.m16052a(context)) {
                jSONObject.put("device", "tablet");
            } else {
                jSONObject.put("device", "mobile");
            }
        } catch (Exception e) {
            reportError(e.getLocalizedMessage(), "critical", e.getMessage());
        }
        return jSONObject;
    }

    public static String getAppDetail() {
        if (!isAnalyticsInitialized) {
            return null;
        }
        return ((Object) MERCHANT_APP_NAME) + "-" + ((Object) MERCHANT_APP_VERSION) + "-" + MERCHANT_APP_BUILD;
    }

    public static String getBuildType() {
        return BUILD_TYPE;
    }

    public static Map<String, Object> getErrorProperties(String str, String str2) {
        HashMap map = new HashMap();
        map.put("severity", str);
        map.put("unhandled", Boolean.TRUE);
        map.put("source", "self");
        map.put("stack", "");
        map.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, str2);
        return map;
    }

    public static JSONObject getExtraAnalyticsPayload() {
        return U$$U$.m16043e();
    }

    public static String getFramework() {
        return isNullOrEmpty(FRAMEWORK) ? "native" : FRAMEWORK;
    }

    public static JSONObject getJSONErrorResponse(String str, Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("severity", map.get("severity"));
            jSONObject3.put("unhandled", map.get("unhandled"));
            jSONObject3.put("source", map.get("source"));
            JSONObject jSONObject4 = new JSONObject();
            if (str != null) {
                jSONObject4.put("stack", str);
            } else {
                jSONObject4.put("stack", "AbstractMethodError");
            }
            jSONObject4.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, map.get(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE));
            jSONObject4.put("tags", jSONObject3);
            jSONObject2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jSONObject4);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            reportError(e.getLocalizedMessage(), "S0", "Error adding analytics property " + map.get(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE) + " to JSONObject");
            return jSONObject;
        }
    }

    public static JSONObject getJSONResponse(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("response", str);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static String getKeyType() {
        return KEY_TYPE;
    }

    public static String getLocalOrderId() {
        if (localOrderId == null) {
            localOrderId = getUniqueId();
        }
        return localOrderId;
    }

    public static String getLocalPaymentId() {
        if (localPaymentId == null) {
            localPaymentId = getUniqueId();
        }
        return localPaymentId;
    }

    public static Map<String, Object> getPageLoadEndProperties(String str, long j) {
        HashMap map = new HashMap();
        map.put(ImagesContract.URL, str);
        map.put("page_load_time", Double.valueOf(j / 1.0E9d));
        return map;
    }

    public static Map<String, Object> getPageLoadStartProperties(String str) {
        HashMap map = new HashMap();
        map.put(ImagesContract.URL, str);
        return map;
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static String getUniqueId() {
        return tobase62((System.currentTimeMillis() - 1388534400000L) * 1000000) + tobase62((long) Math.floor(Math.random() * 1.4776336E7d));
    }

    private static void init(Context context, String str) {
        if (context == null) {
            throw new RuntimeException("Context not set");
        }
        if (str == null) {
            throw new RuntimeException("Merchant key not set");
        }
        U$$U$.m16023a(context, sdkType, sdkVersion);
        U$$U$.m16034b("merchant_key", str);
        U$$U$.m16034b("merchant_package", context.getPackageName());
        J$_M_.m15989a(context);
        isAnalyticsInitialized = true;
    }

    public static boolean isCheckoutUrl(String str) {
        return str.indexOf(D$$l_.m15982a().getCheckoutEndpoint()) == 0;
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (length > i && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        return length - i == 0;
    }

    public static void postData() {
        if (isAnalyticsInitialized) {
            U$$U$.m16021a();
        }
    }

    public static void refreshOrderSession() {
        localOrderId = getUniqueId();
        localPaymentId = getUniqueId();
        U$$U$.m16041d();
        U$$U$.m16038c();
    }

    public static void refreshPaymentSession() {
        localPaymentId = getUniqueId();
        U$$U$.m16038c();
    }

    public static void reportError(String str, String str2, String str3) {
        trackEvent(AnalyticsEvent.ERROR_LOGGED, getJSONErrorResponse(str, getErrorProperties(str2, str3)));
        if ((str2.equalsIgnoreCase("S0") || str2.equalsIgnoreCase("S1")) && sessionErroredApiCalls <= 0) {
            U$$U$.m16033b(str2);
            sessionErroredApiCalls++;
        }
    }

    public static void reportUncaughtException(Throwable th) {
        trackEvent(AnalyticsEvent.ERROR_LOGGED, getJSONResponse(getErrorProperties("S0", getStackTrace(th))));
    }

    public static void reset() {
        isAnalyticsInitialized = false;
        localPaymentId = null;
        localOrderId = null;
        U$$U$.m16032b();
    }

    public static CharSequence returnUndefinedIfNull(CharSequence charSequence) {
        return isNullOrEmpty(charSequence) ? SQLiteCommandFactory.UNDEFINED : charSequence;
    }

    public static void saveEventsToPreferences(Context context) {
        U$$U$.m16022a(context);
    }

    public static void setAppDetails(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            MERCHANT_APP_NAME = returnUndefinedIfNull(packageInfo.applicationInfo.loadLabel(packageManager));
            MERCHANT_APP_VERSION = returnUndefinedIfNull(packageInfo.versionName);
            MERCHANT_APP_NAMESPACE = returnUndefinedIfNull(packageInfo.packageName);
            MERCHANT_APP_BUILD = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            reportError(e.getMessage(), "S0", e.getMessage());
        }
        BUILD_TYPE = BaseUtils.getAppBuildType(context);
        KEY_TYPE = getKeyType(str);
    }

    public static void setFramework(String str) {
        FRAMEWORK = str;
    }

    public static void setLocalOrderId(String str) {
        localOrderId = str;
    }

    public static void setup(Context context, String str, String str2, int i, String str3) throws PackageManager.NameNotFoundException {
        sdkType = str2;
        sdkVersionCode = i;
        sdkVersion = str3;
        setAppDetails(context, str);
        init(context, str);
    }

    public static String tobase62(long j) {
        String str = "";
        String[] strArrSplit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
        while (j > 0) {
            str = String.valueOf(strArrSplit[(int) (j % 62)]) + str;
            j = (long) Math.floor(j / 62);
        }
        return str;
    }

    public static void trackEvent(AnalyticsEvent analyticsEvent) {
        U$$U$.m16024a(analyticsEvent.getEventName());
    }

    public static void trackPage(String str, String str2) {
        U$$U$.m16026a(str, str2);
    }

    public static void trackPageLoadEnd(String str, long j) {
        trackEvent(isCheckoutUrl(str) ? AnalyticsEvent.CHECKOUT_PAGE_LOAD_FINISH : AnalyticsEvent.PAGE_LOAD_FINISH, getJSONResponse(getPageLoadEndProperties(str, j)));
    }

    public static void trackPageLoadStart(String str) {
        trackEvent(isCheckoutUrl(str) ? AnalyticsEvent.CHECKOUT_PAGE_LOAD_START : AnalyticsEvent.PAGE_LOAD_START, getJSONResponse(getPageLoadStartProperties(str)));
    }

    public static String getKeyType(String str) {
        if (isNullOrEmpty(str)) {
            return null;
        }
        String strSubstring = str.substring(0, 8);
        if (strSubstring.equals("rzp_live")) {
            return "live";
        }
        if (strSubstring.equals("rzp_test")) {
            return "test";
        }
        return null;
    }

    public static void trackEvent(AnalyticsEvent analyticsEvent, Map<String, Object> map) {
        U$$U$.m16027a(analyticsEvent.getEventName(), map);
    }

    public static void trackEvent(AnalyticsEvent analyticsEvent, JSONObject jSONObject) {
        U$$U$.m16028a(analyticsEvent.getEventName(), jSONObject);
    }

    public static JSONObject getJSONResponse(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                reportError(e.getLocalizedMessage(), "S0", "Error adding analytics property " + entry.getKey() + " to JSONObject");
            }
        }
        return jSONObject;
    }

    public static void reportError(AbstractMethodError abstractMethodError, String str, String str2) {
        trackEvent(AnalyticsEvent.ERROR_LOGGED, getJSONErrorResponse(null, getErrorProperties(str, str2)));
        if ((str.equalsIgnoreCase("S0") || str.equalsIgnoreCase("S1")) && sessionErroredApiCalls <= 0) {
            U$$U$.m16033b(str);
            sessionErroredApiCalls++;
        }
    }
}
