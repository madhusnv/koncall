package com.razorpay;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.razorpay.AnalyticsProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class U$$U$ {

    /* renamed from: d */
    private static String f13691d;

    /* renamed from: e */
    private static String f13692e;

    /* renamed from: f */
    private static boolean f13693f;

    /* renamed from: g */
    private static boolean f13694g;

    /* renamed from: h */
    private static boolean f13695h;

    /* renamed from: i */
    private static float f13696i;

    /* renamed from: j */
    private static int f13697j;

    /* renamed from: k */
    private static int f13698k;

    /* renamed from: l */
    private static JSONObject f13699l;

    /* renamed from: m */
    private static JSONObject f13700m;

    /* renamed from: p */
    private static String f13703p;

    /* renamed from: r */
    private static Map<String, Object> f13705r;

    /* renamed from: s */
    private static Map<String, Object> f13706s;

    /* renamed from: a */
    private static String f13688a = Build.MANUFACTURER;

    /* renamed from: b */
    private static String f13689b = Build.MODEL;

    /* renamed from: c */
    private static String f13690c = Build.DEVICE;

    /* renamed from: n */
    private static boolean f13701n = false;

    /* renamed from: o */
    private static String f13702o = "standalone";

    /* renamed from: q */
    private static ArrayList<JSONObject> f13704q = new ArrayList<>();

    /* renamed from: a */
    public static void m16025a(String str, Object obj) {
        f13705r.put(str, obj);
    }

    /* renamed from: b */
    private static void m16035b(JSONObject jSONObject) {
        if (!f13701n) {
            f13704q.add(jSONObject);
            return;
        }
        try {
            JSONObject jSONObjectM16037c = m16037c(jSONObject);
            synchronized (f13699l) {
                f13699l.getJSONArray("events").put(jSONObjectM16037c);
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
    }

    /* renamed from: c */
    private static JSONObject m16036c(String str) {
        try {
            return new JSONObject("{event: '" + str + "',timestamp: '" + String.valueOf(System.currentTimeMillis() / 1000) + "'}");
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in creating base for trackEvent");
            return null;
        }
    }

    /* renamed from: d */
    private static void m16042d(JSONObject jSONObject) {
        if (D$$l_.m15982a().isLumberJackEnabled().booleanValue()) {
            HashMap map = new HashMap();
            map.put("x-identifier", D$$l_.m15982a().getLumberjackSdkIdentifier());
            map.put("Content-Type", "application/json");
            M$_3_.m15991a(D$$l_.m15982a().getLumberjackEndpoint(), jSONObject.toString(), map, new Callback() { // from class: com.razorpay.n$$t$
                @Override // com.razorpay.Callback
                public final void run(ResponseObject responseObject) {
                    responseObject.getResponseResult();
                }
            });
        }
    }

    /* renamed from: e */
    private static JSONObject m16044e(JSONObject jSONObject) throws JSONException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("properties")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("properties");
                    if (jSONObject3.has(ImagesContract.URL)) {
                        String string = jSONObject3.getString(ImagesContract.URL);
                        if (string.startsWith("data:")) {
                            string = "Data present in url";
                        }
                        jSONObject3.put(ImagesContract.URL, string);
                    }
                    jSONObject2.put("properties", jSONObject3);
                }
                jSONArray.put(i, jSONObject2);
            }
            jSONObject.put("events", jSONArray);
        } catch (JSONException e) {
            d__1_.m16053a("Error in filtering payload", e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    private static void m16045f() {
        try {
            JSONObject jSONObject = f13699l;
            if (jSONObject == null) {
                return;
            }
            synchronized (jSONObject) {
                f13699l.put("events", new JSONArray());
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
    }

    /* renamed from: g */
    private static void m16047g() {
        Iterator<JSONObject> it = f13704q.iterator();
        while (it.hasNext()) {
            m16035b(it.next());
        }
        m16048h();
    }

    /* renamed from: h */
    private static void m16048h() {
        f13704q = new ArrayList<>();
    }

    /* renamed from: i */
    private static JSONObject m16049i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TransferTable.COLUMN_KEY, D$$l_.m15982a().getLumberjackKey());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "checkout.mobile.sessionCreated.metrics");
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "session_created");
            jSONObject3.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject3.put("framework", f13702o + "_android_" + AnalyticsUtil.getFramework());
            jSONArray2.put(jSONObject3);
            jSONObject2.put("labels", jSONArray2);
            jSONArray.put(jSONObject2);
            jSONObject.put("metrics", jSONArray);
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m16027a(String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                AnalyticsUtil.reportError(e.getMessage(), "S0", "Error adding analytics property " + entry.getKey() + " to JSONObject");
            }
        }
        m16028a(str, jSONObject);
    }

    /* renamed from: c */
    private static JSONObject m16037c(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.has("properties") ? jSONObject.getJSONObject("properties") : null;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("merchant_app_name", AnalyticsUtil.MERCHANT_APP_NAME);
            jSONObject2.put("merchant_app_version", AnalyticsUtil.MERCHANT_APP_VERSION);
            jSONObject2.put("merchant_app_build", AnalyticsUtil.MERCHANT_APP_BUILD);
            jSONObject2.put("platform", "mobile_sdk");
            jSONObject2.put("platform_version", f13703p);
            jSONObject2.put("os", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("library", AnalyticsUtil.libraryType);
            for (Map.Entry<String, Object> entry : f13705r.entrySet()) {
                try {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    AnalyticsUtil.reportError(e.getMessage(), "S0", "Error adding analytics property " + entry.getKey() + " to JSONObject");
                }
            }
            for (Map.Entry<String, Object> entry2 : f13706s.entrySet()) {
                try {
                    jSONObject2.put(entry2.getKey(), entry2.getValue());
                } catch (Exception e2) {
                    AnalyticsUtil.reportError(e2.getMessage(), "S0", "Error adding analytics property " + entry2.getKey() + " to JSONObject");
                }
            }
            jSONObject.put("properties", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: f */
    private static void m16046f(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("accept", "application/json");
        map.put("content-type", "applications/json");
        M$_3_.m15991a("https://lumberjack-metrics.razorpay.com/v1/frontend-metrics", jSONObject.toString(), map, new Callback() { // from class: com.razorpay.M$$8$
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                responseObject.getResponseResult();
            }
        });
    }

    /* renamed from: d */
    public static void m16041d() {
        f13706s = new HashMap();
    }

    /* renamed from: d */
    private static JSONObject m16040d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TransferTable.COLUMN_KEY, D$$l_.m15982a().getLumberjackKey());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "checkout.mobile.sessionErrored.metrics");
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "session_errored");
            jSONObject3.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject3.put("framework", f13702o + "_android_" + AnalyticsUtil.getFramework());
            jSONObject3.put("severity", str);
            jSONArray2.put(jSONObject3);
            jSONObject2.put("labels", jSONArray2);
            jSONArray.put(jSONObject2);
            jSONObject.put("metrics", jSONArray);
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m16028a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectM16036c = m16036c(str);
            if (jSONObjectM16036c == null) {
                jSONObjectM16036c = new JSONObject();
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("sdk_session_id", AnalyticsUtil.getLocalOrderId());
            jSONObject.put("local_payment_id", AnalyticsUtil.getLocalPaymentId());
            jSONObjectM16036c.put("properties", jSONObject);
            m16035b(jSONObjectM16036c);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in adding properties to base json for event tracking");
        }
    }

    /* renamed from: b */
    public static void m16034b(String str, Object obj) {
        f13706s.put(str, obj);
    }

    /* renamed from: b */
    private static String m16031b(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static void m16032b() {
        m16041d();
        m16038c();
        m16045f();
        m16048h();
        f13701n = false;
    }

    /* renamed from: e */
    public static JSONObject m16043e() {
        return f13700m;
    }

    /* renamed from: b */
    public static void m16033b(String str) {
        m16046f(m16040d(str));
    }

    /* renamed from: a */
    public static void m16024a(String str) {
        m16028a(str, new JSONObject());
    }

    /* renamed from: a */
    public static void m16026a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(ImagesContract.URL, str2);
        m16027a("Viewed " + str + " Page", (Map<String, Object>) map);
    }

    /* renamed from: a */
    public static void m16021a() {
        synchronized (f13699l) {
            JSONObject jSONObjectM16044e = m16044e(f13699l);
            f13699l = jSONObjectM16044e;
            m16042d(jSONObjectM16044e);
        }
        m16045f();
    }

    /* renamed from: c */
    private static boolean m16039c(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getBoolean(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static void m16038c() {
        f13705r = new HashMap();
    }

    /* renamed from: a */
    public static void m16023a(Context context, String str, String str2) {
        f13702o = str;
        f13703p = str2;
        try {
            f13691d = BaseUtils.getCellularNetworkType(context);
            f13692e = BaseUtils.getCellularNetworkProviderName(context);
            int i = M$_J_.f13653a[BaseUtils.getDataNetworkType(context).ordinal()];
            if (i == 1) {
                f13695h = true;
            } else if (i == 2) {
                f13693f = true;
            } else if (i == 3) {
                f13694g = true;
            }
            Display defaultDisplay = ((WindowManager) BaseUtils.getSystemService(context, "window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            f13696i = displayMetrics.density;
            f13698k = displayMetrics.heightPixels;
            f13697j = displayMetrics.widthPixels;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TransferTable.COLUMN_KEY, D$$l_.m15982a().getLumberjackKey());
            jSONObject.put("events", new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mode", AnalyticsUtil.getKeyType());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(OutcomeConstants.OUTCOME_ID, BaseConfig.getAdvertisingId(context));
            jSONObject3.put("manufacturer", f13688a);
            jSONObject3.put("model", f13689b);
            jSONObject3.put("name", f13690c);
            jSONObject3.put("type", "phone");
            jSONObject3.put(ClientCookie.VERSION_ATTR, "Android" + Build.VERSION.RELEASE);
            jSONObject3.put(f13688a, Build.MANUFACTURER);
            jSONObject3.put(f13689b, Build.MODEL);
            jSONObject3.put("device_size", BaseUtils.getDisplayWidth(context) + "w X " + BaseUtils.getDisplayHeight(context) + "h");
            jSONObject3.put("device_resolution", BaseUtils.getDisplayResolution(context));
            jSONObject2.put("device", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(ClientCookie.VERSION_ATTR, f13703p);
            jSONObject4.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            jSONObject4.put("type", f13702o);
            jSONObject4.put("framework", AnalyticsUtil.getFramework());
            jSONObject4.put("name", f13702o + "_android_" + AnalyticsUtil.getFramework());
            jSONObject2.put("sdk", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("bluetooth", f13694g);
            jSONObject5.put("carrier", f13692e);
            jSONObject5.put("cellular", f13693f);
            jSONObject5.put("cellular_network_type", f13691d);
            jSONObject5.put("wifi", f13695h);
            jSONObject5.put("carrier_network", BaseUtils.getCarrierOperatorName(context));
            jSONObject5.put("network_type", BaseUtils.getNetworkType(context));
            jSONObject5.put("ip_address", BaseUtils.ipAddress);
            jSONObject5.put("is_roming", BaseUtils.isNetworkRoaming(context));
            Map<String, String> deviceAttributes = BaseUtils.getDeviceAttributes(context);
            jSONObject5.put("device_Id", deviceAttributes.get("device_Id"));
            String str3 = f13688a;
            jSONObject5.put(str3, deviceAttributes.get(str3));
            String str4 = f13689b;
            jSONObject5.put(str4, deviceAttributes.get(str4));
            jSONObject2.put("network", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("density", f13696i);
            jSONObject6.put("width", f13697j);
            jSONObject6.put("height", f13698k);
            jSONObject2.put("screen", jSONObject6);
            jSONObject2.put("locale", BaseUtils.getLocale());
            jSONObject2.put("timezone", AnalyticsUtil.returnUndefinedIfNull(TimeZone.getDefault().getID()));
            jSONObject2.put("framework", f13702o + "_android_" + AnalyticsUtil.getFramework());
            jSONObject2.put("user_agent", AnalyticsUtil.returnUndefinedIfNull(System.getProperty("http.agent")));
            jSONObject2.put("sdk_session_id", AnalyticsUtil.getLocalOrderId());
            jSONObject2.put("local_order_id", AnalyticsUtil.getLocalOrderId());
            jSONObject2.put("webview_user_agent", BaseUtils.getWebViewUserAgent(context));
            f13700m = jSONObject2;
            jSONObject.put("context", jSONObject2);
            f13699l = jSONObject;
            m16046f(m16049i());
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", "Error in creating BaseImportJSON");
            f13699l = new JSONObject();
        }
        f13701n = true;
        m16047g();
        String strM16080a = C11907l.m16080a(context, "SavedEventsData", str2);
        if (strM16080a == null || strM16080a.length() == 0) {
            return;
        }
        try {
            m16042d(new JSONObject(strM16080a));
        } catch (Exception e2) {
            AnalyticsUtil.reportError(e2.getMessage(), "S1", e2.getMessage());
        } finally {
            C11907l.m16082b(context, "SavedEventsData", null);
        }
    }

    /* renamed from: a */
    private static void m16030a(JSONObject jSONObject, String str, AnalyticsProperty.Scope scope) {
        try {
            Object objM16020a = m16020a(jSONObject, str);
            if (objM16020a != null) {
                if (scope == AnalyticsProperty.Scope.PAYMENT) {
                    m16025a(str, objM16020a);
                } else if (scope == AnalyticsProperty.Scope.ORDER) {
                    m16034b(str, objM16020a);
                }
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    /* renamed from: a */
    private static Object m16020a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.get(str);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static void m16022a(Context context) {
        synchronized (f13699l) {
            String string = m16044e(f13699l).toString();
            String str = f13703p;
            try {
                String randomString = BaseUtils.getRandomString();
                String strM15980a = new CryptLib().m15980a(string, "c", randomString);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, strM15980a);
                jSONObject.put("iv", randomString);
                jSONObject.put("sdk_version", str);
                C11907l.m16082b(context, "SavedEventsData", jSONObject.toString());
            } catch (Exception e) {
                AnalyticsUtil.reportError(e.getMessage(), "S1", e.getLocalizedMessage());
                d__1_.m16053a("Unable to encrypt value", e);
            }
        }
    }

    /* renamed from: a */
    public static void m16029a(JSONObject jSONObject) {
        try {
            m16034b("amount", Long.valueOf(Long.parseLong(m16031b(jSONObject, "amount"))));
        } catch (Exception unused) {
        }
        try {
            m16034b("framework", jSONObject.has("framework") ? m16031b(jSONObject, "framework") : "native");
        } catch (Exception unused2) {
        }
        try {
            AnalyticsProperty.Scope scope = AnalyticsProperty.Scope.ORDER;
            m16030a(jSONObject, "contact", scope);
            m16030a(jSONObject, "email", scope);
            m16030a(jSONObject, "order_id", scope);
            String strM16031b = m16031b(jSONObject, FirebaseAnalytics.Param.METHOD);
            if (strM16031b == null) {
                return;
            }
            if (jSONObject.has(AWSCognitoLegacyCredentialStore.TOKEN_KEY)) {
                strM16031b = "saved card";
            }
            m16025a(FirebaseAnalytics.Param.METHOD, (Object) strM16031b);
            if (strM16031b.equals("card")) {
                String strM16031b2 = m16031b(jSONObject, "card[number]");
                if (AnalyticsUtil.isNullOrEmpty(strM16031b2) || strM16031b2.length() < 6) {
                    return;
                }
                m16025a("card_number", (Object) strM16031b2.substring(0, 6));
                return;
            }
            if (strM16031b.equals("saved card")) {
                boolean zM16039c = m16039c(jSONObject, "razorpay_otp");
                StringBuilder sb = new StringBuilder();
                sb.append(zM16039c ? false : true);
                m16034b("Checkout Login", sb.toString());
                return;
            }
            if (strM16031b.equals("netbanking")) {
                m16030a(jSONObject, "bank", AnalyticsProperty.Scope.PAYMENT);
            } else if (strM16031b.equals("wallet")) {
                m16030a(jSONObject, "wallet", AnalyticsProperty.Scope.PAYMENT);
            } else if (strM16031b.equals("upi")) {
                m16025a("flow", (Object) m16031b(jSONObject, "_[flow]"));
            }
        } catch (Exception e) {
            e.getMessage();
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }
}
