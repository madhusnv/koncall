package com.razorpay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.razorpay.AdvertisingIdUtil;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.c64;
import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Keep
@KeepClassMembers
/* loaded from: classes6.dex */
class BaseUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static String PERMISSION_DISABLED = "permission disabled";
    private static BaseUtils baseUtils;
    static String ipAddress;
    private String orderId;
    private String paymentId;
    private static boolean sWebViewDebuggingEnabled = n$_B$.f13788a.booleanValue();
    private static boolean isCompatibleWithGooglePay = true;
    private static boolean isGpayCardsUpiRegistered = false;

    public static String buildSerial() {
        return Build.SERIAL;
    }

    public static void checkForLatestVersion(Context context, int i) {
        if (D$$l_.m15982a().isSDKUpdateAlertEnabled() && isMerchantAppDebuggable(context) && i < D$$l_.m15982a().getLatestSDKVersionCode()) {
            Toast.makeText(context, D$$l_.m15982a().getUpdateSDKMsg(), 1).show();
        }
    }

    public static boolean checkGpayCardsUpiRegistered(Activity activity, String str) throws JSONException {
        if (str == null) {
            return isGpayCardsUpiRegistered;
        }
        try {
            String string = new JSONObject(str).getString("code");
            if (((string.hashCode() == -1534821982 && string.equals("google_pay")) ? (char) 0 : (char) 65535) != 0) {
                return false;
            }
            return isGpayCardsUpiRegistered;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean checkUpiRegisteredApp(Context context, String str) {
        str.hashCode();
        if (str.equals("com.google.android.apps.nbu.paisa.user")) {
            return isCompatibleWithGooglePay;
        }
        return true;
    }

    public static String constructBasicAuth(String str) {
        return Base64.encodeToString((str + ":").getBytes(HTTP.UTF_8), 2);
    }

    public static PublicKey constructPublicKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 0)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String decryptFile(String str) throws NoSuchAlgorithmException {
        try {
            CryptLib cryptLib = new CryptLib();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update("rzpisunitedred".getBytes(HTTP.UTF_8));
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                stringBuffer.append(String.format("%02x", Byte.valueOf(b)));
            }
            return cryptLib.m15981b(str, 32 > stringBuffer.toString().length() ? stringBuffer.toString() : stringBuffer.toString().substring(0, 32), "glorygloryunited");
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getLocalizedMessage());
            e.getMessage();
            return null;
        }
    }

    public static int dpToPixels(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private static void enableJavaScriptInWebView(WebView webView) {
        webView.getSettings().setJavaScriptEnabled(true);
    }

    public static void fetchIP(final RzpJSONCallback rzpJSONCallback) {
        new Thread(new Runnable() { // from class: com.razorpay.l_$w$
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                HttpsURLConnection httpsURLConnection;
                HttpsURLConnection httpsURLConnection2 = null;
                try {
                    try {
                        try {
                            httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://approvals-api.getsimpl.com/my-ip").openConnection()));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (SocketTimeoutException unused) {
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        httpsURLConnection.setRequestMethod("GET");
                        httpsURLConnection.setReadTimeout(Opcodes.FCMPG);
                        httpsURLConnection.setConnectTimeout(250);
                        if (httpsURLConnection.getResponseCode() == 200) {
                            rzpJSONCallback.onResponse(BaseUtils.getResponseJson(httpsURLConnection));
                        } else {
                            rzpJSONCallback.onResponse(new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR));
                        }
                        httpsURLConnection.disconnect();
                    } catch (SocketTimeoutException unused2) {
                        httpsURLConnection2 = httpsURLConnection;
                        rzpJSONCallback.onResponse(new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "timeout"));
                        if (httpsURLConnection2 == null) {
                            return;
                        }
                        httpsURLConnection2.disconnect();
                    } catch (Exception e2) {
                        e = e2;
                        httpsURLConnection2 = httpsURLConnection;
                        AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                        if (httpsURLConnection2 == null) {
                            return;
                        }
                        httpsURLConnection2.disconnect();
                    } catch (Throwable th2) {
                        th = th2;
                        httpsURLConnection2 = httpsURLConnection;
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    AnalyticsUtil.reportError(e3.getMessage(), "S2", e3.getMessage());
                }
            }
        }).start();
    }

    public static HashMap<String, String> getAllPluginsFromManifest(Context context) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return null;
            }
            HashMap<String, String> map = new HashMap<>();
            for (String str : applicationInfo.metaData.keySet()) {
                if (str.contains("com.razorpay.plugin.") && applicationInfo.metaData.getString(str).equalsIgnoreCase("com.razorpay.RzpGpayMerged")) {
                    try {
                        if (Class.forName("com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient").newInstance() != null) {
                            map.put(str, applicationInfo.metaData.getString(str));
                        }
                    } catch (ClassNotFoundException e) {
                        AnalyticsUtil.reportError(e.getMessage(), "S2", "GooglePay SDK is not included");
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        e.printStackTrace();
                    } catch (InstantiationException e3) {
                        e = e3;
                        e.printStackTrace();
                    }
                } else if (str.contains("com.razorpay.plugin.") && applicationInfo.metaData.getString(str).equalsIgnoreCase("com.razorpay.RzpGooglePay")) {
                    try {
                        if (Class.forName("com.google.android.apps.nbu.paisa.inapp.client.api.PaymentsClient").newInstance() != null) {
                            map.put(str, applicationInfo.metaData.getString(str));
                        }
                    } catch (ClassNotFoundException e4) {
                        AnalyticsUtil.reportError(e4.getMessage(), "S2", "GooglePay SDK is not included");
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        e.printStackTrace();
                    } catch (InstantiationException e6) {
                        e = e6;
                        e.printStackTrace();
                    }
                } else if (str.contains("com.razorpay.plugin.") && applicationInfo.metaData.getString(str) != null) {
                    map.put(str, applicationInfo.metaData.getString(str));
                }
            }
            return map;
        } catch (PackageManager.NameNotFoundException e7) {
            AnalyticsUtil.reportError(e7.getMessage(), "S0", e7.getMessage());
            return null;
        }
    }

    public static String getAndroidId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String getAppBuildType(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0 ? "development" : "production";
    }

    public static String getAppNameOfPackageName(String str, Context context) throws Exception {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            int i = applicationInfo.labelRes;
            return i == 0 ? applicationInfo.nonLocalizedLabel.toString() : packageManager.getResourcesForApplication(applicationInfo).getString(i);
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getLocalizedMessage());
            e.printStackTrace();
            throw e;
        }
    }

    public static String getAppNameOfResolveInfo(ResolveInfo resolveInfo, Context context) {
        return getAppNameOfPackageName(resolveInfo.activityInfo.packageName, context);
    }

    public static String getBase64FromOtherAppsResource(Context context, String str) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            return getBase64FromResource(packageManager.getResourcesForApplication(applicationInfo), applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static String getBase64FromResource(Resources resources, int i) {
        Drawable drawable;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i);
        if (bitmapDecodeResource == null && (drawable = resources.getDrawable(i)) != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmapDecodeResource = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmapDecodeResource = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapDecodeResource);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            }
        }
        if (bitmapDecodeResource == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static String getCarrierOperatorName(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : PERMISSION_DISABLED;
    }

    public static String getCellularNetworkProviderName(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(context, "phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "unknown";
    }

    public static String getCellularNetworkType(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (c64.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                switch (telephonyManager.getNetworkType()) {
                }
                return "NA";
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getLocalizedMessage());
        }
        return "NA";
    }

    public static NetworkType getDataNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        if (hasPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) getSystemService(context, "connectivity")) != null) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && networkInfo.isConnected()) {
                return NetworkType.WIFI;
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(7);
            if (networkInfo2 != null && networkInfo2.isConnected()) {
                return NetworkType.BLUETOOTH;
            }
            NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
            if (networkInfo3 != null && networkInfo3.isConnected()) {
                return NetworkType.CELLULAR;
            }
        }
        return NetworkType.UNKNOWN;
    }

    public static Map<String, String> getDeviceAttributes(Context context) {
        HashMap map = new HashMap();
        if (context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            context.getSystemService("phone");
            map.put("device_id", BaseConfig.getAdvertisingId(context));
            map.put("sim_serial_number", PERMISSION_DISABLED);
            map.put("build_unique_id", UUID.randomUUID().toString());
        } else {
            map.put("device_id", PERMISSION_DISABLED);
            map.put("sim_serial_number", PERMISSION_DISABLED);
        }
        map.put("device_manufacturer", Build.MANUFACTURER);
        map.put("device_model", Build.MODEL);
        return map;
    }

    public static void getDeviceParamValues(final Context context, final RzpJSONCallback rzpJSONCallback) {
        final JSONObject jSONObject = new JSONObject();
        try {
            fetchIP(new c__C_());
            AdvertisingIdUtil.getId(context, new AdvertisingIdUtil.AdvertisingIdCallback() { // from class: com.razorpay.E$_6$
                @Override // com.razorpay.AdvertisingIdUtil.AdvertisingIdCallback
                public final void onResult(String str) throws JSONException {
                    try {
                        jSONObject.put("advertising_id", str);
                        jSONObject.put("is_roming", BaseUtils.isNetworkRoaming(context));
                        jSONObject.put("carrier_network", BaseUtils.getCarrierOperatorName(context));
                        jSONObject.put("carrier_id", "null");
                        Map<String, String> deviceAttributes = BaseUtils.getDeviceAttributes(context);
                        jSONObject.put("device_Id", deviceAttributes.get("device_Id"));
                        jSONObject.put("device_manufacturer", deviceAttributes.get("device_manufacturer"));
                        jSONObject.put("device_model", deviceAttributes.get("device_model"));
                        jSONObject.put("serial_number", BaseUtils.buildSerial());
                        jSONObject.put("ip_address", BaseUtils.ipAddress);
                        jSONObject.put("wifi_ssid", BaseUtils.getWifiSSID(context));
                        jSONObject.put("android_id", BaseUtils.getAndroidId(context));
                        jSONObject.put("safety_net basic_integrity", "true");
                        jSONObject.put("safety_net_cts_profile_match", "null");
                        rzpJSONCallback.onResponse(jSONObject);
                    } catch (JSONException e) {
                        AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
                    }
                }
            });
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    public static int getDisplayHeight(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String getDisplayResolution(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return String.format(Locale.ENGLISH, "%dx%dx%d", Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.densityDpi));
    }

    public static int getDisplayWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static String getFileFromInternal(Activity activity, String str, String str2) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(activity.openFileInput(getVersionedAssetName(getLocalVersion(activity, str2).toString(), str)), HTTP.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return decryptFile(sb.toString());
            }
            sb.append(line);
        }
    }

    public static String getGenericPaymentErrorResponse(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "BAD_REQUEST_ERROR");
            jSONObject.put(MediaTrack.ROLE_DESCRIPTION, str);
            jSONObject.put("source", "customer");
            jSONObject.put("step", "payment_authentication");
            jSONObject.put("reason", "payment_timeout");
            return new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jSONObject).toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }

    public static BaseUtils getInstance() {
        BaseUtils baseUtils2 = baseUtils;
        if (baseUtils2 != null) {
            return baseUtils2;
        }
        BaseUtils baseUtils3 = new BaseUtils();
        baseUtils = baseUtils3;
        return baseUtils3;
    }

    public static JSONObject getJSONFromIntentData(Intent intent) throws JSONException {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, extras.get(str));
                } catch (JSONException e) {
                    AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getLocalizedMessage());
                }
            }
        }
        return jSONObject;
    }

    public static Object getJsonValue(String str, JSONObject jSONObject, Object obj) {
        Object jsonValue = getJsonValue(str.split("\\."), jSONObject, 0);
        return jsonValue != null ? jsonValue : obj;
    }

    public static String getKeyId(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("com.razorpay.ApiKey");
        } catch (PackageManager.NameNotFoundException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
            return null;
        }
    }

    public static List<ResolveInfo> getListOfAppsWhichHandleDeepLink(Context context, String str) {
        Intent intent = new Intent();
        intent.setData(Uri.parse(str));
        return context.getPackageManager().queryIntentActivities(intent, Opcodes.ACC_DEPRECATED);
    }

    public static String getLocalVersion(Activity activity, String str) {
        String strM16079a = C11907l.m16079a(activity, str);
        return strM16079a == null ? getVersionFromJsonString("{\n  \"hash\" : \"MD5\",\n  \"magic_hash\": \"MD5\"\n}\n", str) : strM16079a;
    }

    public static String getLocale() {
        return Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
    }

    public static HashMap<String, String> getMapFromJSONObject(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getMessage());
            e.printStackTrace();
        }
        return map;
    }

    public static int getNetworkType(Context context) {
        NetworkType dataNetworkType = getDataNetworkType(context);
        if (dataNetworkType == NetworkType.WIFI) {
            return 0;
        }
        if (dataNetworkType == NetworkType.BLUETOOTH) {
            return 1;
        }
        if (dataNetworkType != NetworkType.CELLULAR) {
            return -1;
        }
        String cellularNetworkType = getCellularNetworkType(context);
        if (cellularNetworkType.equalsIgnoreCase("2G")) {
            return 2;
        }
        if (cellularNetworkType.equalsIgnoreCase("3G")) {
            return 3;
        }
        return cellularNetworkType.equalsIgnoreCase("4G") ? 4 : -1;
    }

    public static String getPaymentCancelledResponse(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "BAD_REQUEST_ERROR");
            jSONObject.put(MediaTrack.ROLE_DESCRIPTION, "Payment processing cancelled by user");
            jSONObject.put("source", "customer");
            jSONObject.put("step", "payment_authentication");
            jSONObject.put("reason", "payment_cancelled");
            if (str != null) {
                if (str.startsWith("pay")) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("payment_id", str);
                    jSONObject.put("metadata", jSONObject2);
                } else {
                    jSONObject.put("metadata", new JSONObject(str));
                }
            }
            return new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jSONObject).toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }

    public static String getRandomString() {
        return new BigInteger(130, new SecureRandom()).toString(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject getResponseJson(HttpsURLConnection httpsURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return new JSONObject(sb.toString());
            }
            sb.append(line);
        }
    }

    public static HashSet<String> getSetOfPackageNamesSupportingUpi(Context context) {
        List<ResolveInfo> listOfAppsWhichHandleDeepLink = getListOfAppsWhichHandleDeepLink(context, "upi://pay");
        HashSet<String> hashSet = new HashSet<>();
        if (listOfAppsWhichHandleDeepLink != null && listOfAppsWhichHandleDeepLink.size() > 0) {
            Iterator<ResolveInfo> it = listOfAppsWhichHandleDeepLink.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(it.next().activityInfo.packageName);
                } catch (Exception e) {
                    AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
                }
            }
        }
        if (hashSet.size() > 0 && !checkUpiRegisteredApp(context, "com.google.android.apps.nbu.paisa.user")) {
            hashSet.remove("com.google.android.apps.nbu.paisa.user");
        }
        if (hashSet.size() > 0 && !checkUpiRegisteredApp(context, "com.truecaller")) {
            hashSet.remove("com.truecaller");
        }
        return hashSet;
    }

    public static void getSignalStrength(Context context) {
        ((TelephonyManager) context.getSystemService("phone")).listen(new PhoneStateListener() { // from class: com.razorpay.O_$B_
            @Override // android.telephony.PhoneStateListener
            public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                super.onSignalStrengthsChanged(signalStrength);
                if (!signalStrength.isGsm()) {
                    signalStrength.getCdmaDbm();
                } else if (signalStrength.getGsmSignalStrength() != 99) {
                    signalStrength.getGsmSignalStrength();
                } else {
                    signalStrength.getGsmSignalStrength();
                }
            }
        }, 256);
    }

    public static <T> T getSystemService(Context context, String str) {
        return (T) context.getApplicationContext().getSystemService(str);
    }

    public static String getVersionFromJsonString(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (str2.equalsIgnoreCase("otpelf_version")) {
                return jSONObject.getString("hash");
            }
            if (str2.equalsIgnoreCase("magic_version")) {
                return jSONObject.getString("magic_hash");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getVersionedAssetName(String str, String str2) {
        return str.replaceAll("\\.", "-") + "-" + str2;
    }

    public static CharSequence getWebViewUserAgent(Context context) {
        return AnalyticsUtil.returnUndefinedIfNull(new WebView(context).getSettings().getUserAgentString());
    }

    public static String getWifiSSID(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0 ? ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID() : PERMISSION_DISABLED;
    }

    public static Certificate getX509Certificate(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray == null) {
            return null;
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
        } catch (CertificateException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }

    public static boolean hasFeature(Context context, String str) {
        return context.getPackageManager().hasSystemFeature(str);
    }

    public static boolean hasPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
            return false;
        }
    }

    public static String installedApps(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(0)) {
                if ((applicationInfo.flags & 1) == 0) {
                    if (sb.length() != 0) {
                        sb.append(",");
                    }
                    sb.append(applicationInfo.packageName);
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "Apps not available";
        }
    }

    public static boolean isDeviceHaveCorrectTlsVersion() {
        String[] protocols;
        try {
            protocols = SSLContext.getDefault().getDefaultSSLParameters().getProtocols();
        } catch (NoSuchAlgorithmException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
        if (protocols == null) {
            return false;
        }
        for (String str : protocols) {
            if (str.startsWith("TLS") && !str.equalsIgnoreCase("TLSv1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMerchantAppDebuggable(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private boolean isMocked(Context context, Location location) {
        return location.isFromMockProvider();
    }

    public static boolean isNetworkRoaming(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.isNetworkRoaming();
        }
        return false;
    }

    private static Boolean isUserRegisteredOnTruePay(Context context) {
        try {
            boolean z = true;
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName("com.truecaller", "com.truecaller.truepay.UserRegistered")) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            e.printStackTrace();
            AnalyticsUtil.reportError(e.getMessage(), "S1", e.getMessage());
            return Boolean.FALSE;
        }
    }

    public static ArrayList<String> jsonStringArrayToArrayList(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
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
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", e.getMessage());
            e.printStackTrace();
            return "{\"error\":{\"code\": \"BAD_REQUEST_ERROR\", \"description\": \"An unknown error occurred.\"}}";
        }
    }

    public static String makeUrlEncodedPayload(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            sb.append(String.format("%s=%s&", next, Uri.encode(jSONObject.getString(next))));
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String nanoTimeToSecondsString(long j, int i) {
        double dRound = round(j / 1.0E9d, i);
        StringBuilder sb = new StringBuilder();
        sb.append(dRound);
        return sb.toString();
    }

    public static void pdfDownloadHelper(Activity activity, String str, String str2) throws IOException {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = activity.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(Base64.decode(str2, 0));
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception unused) {
        }
        try {
            Uri uriM5839h = FileProvider.m5839h(activity, activity.getApplicationContext().getPackageName(), new File(activity.getFilesDir().toString() + "/" + str + ".pdf"));
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.setDataAndType(uriM5839h, "application/pdf");
            if (Build.VERSION.SDK_INT >= 26) {
                intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse("/Documents"));
            }
            activity.startActivityForResult(intent, 77);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double round(double d, int i) {
        if (i >= 0) {
            return new BigDecimal(d).setScale(i, RoundingMode.HALF_UP).doubleValue();
        }
        throw new IllegalArgumentException();
    }

    private static void setBaseWebViewSettings() {
        WebView.setWebContentsDebuggingEnabled(sWebViewDebuggingEnabled);
    }

    public static void setCompatibleWithGooglePay(boolean z) {
        isCompatibleWithGooglePay = z;
    }

    public static void setIsGpayCardsUpiRegistered(boolean z) {
        isGpayCardsUpiRegistered = z;
    }

    public static void setWebViewSettings(Context context, WebView webView, boolean z) {
        setBaseWebViewSettings();
        enableJavaScriptInWebView(webView);
        CookieManager.getInstance().setAcceptCookie(true);
        webView.setTag("");
        WebSettings settings = webView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setTextZoom(100);
        context.getApplicationContext().getDir("database", 0).getPath();
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        if (z) {
            settings.setCacheMode(2);
        }
        settings.setSaveFormData(false);
        webView.addJavascriptInterface(new C11909n(context), "StorageBridge");
    }

    public static void setup() {
        AnalyticsUtil.reset();
    }

    public static void startActivityForResult(String str, String str2, Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (str2 != null && str2.length() > 0) {
                intent.setPackage(str2);
            }
            if (str.startsWith("credpay")) {
                activity.startActivityForResult(intent, 20);
            } else {
                activity.startActivityForResult(intent, 99);
            }
        } catch (ActivityNotFoundException e) {
            AnalyticsUtil.reportError("BaseUtils", "S2", e.getMessage());
        }
    }

    public static boolean storeFileInInternal(Activity activity, String str, String str2) throws IOException {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = activity.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes());
            fileOutputStreamOpenFileOutput.close();
            return true;
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S1", "Error in saving file: " + str);
            new StringBuilder("Error in saving file: ").append(str);
            return false;
        }
    }

    public static void updateLocalVersion(Activity activity, String str, String str2) {
        C11907l.m16082b(activity, str, str2);
    }

    public String getMetadata() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payment_id", this.paymentId);
            jSONObject.put("order_id", this.orderId);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getSystemFontSize(Context context) {
        return String.valueOf(context.getResources().getConfiguration().fontScale);
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPaymentId(String str) {
        this.paymentId = str;
    }

    private static Object getJsonValue(String[] strArr, Object obj, int i) {
        while (i != strArr.length) {
            String str = strArr[i];
            if (obj instanceof JSONObject) {
                obj = ((JSONObject) obj).opt(str);
            } else {
                if (!(obj instanceof JSONArray)) {
                    return null;
                }
                JSONArray jSONArray = (JSONArray) obj;
                if (!TextUtils.isDigitsOnly(str)) {
                    return null;
                }
                obj = jSONArray.opt(Integer.parseInt(str));
            }
            i++;
        }
        return obj;
    }

    public static String getGenericPaymentErrorResponse(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "BAD_REQUEST_ERROR");
            jSONObject.put(MediaTrack.ROLE_DESCRIPTION, str);
            jSONObject.put("source", "customer");
            jSONObject.put("step", "payment_authentication");
            jSONObject.put("reason", "payment_error");
            if (str2 != null) {
                jSONObject.put("metadata", new JSONObject(str2));
            }
            return new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, jSONObject).toString();
        } catch (JSONException e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getLocalizedMessage());
            return null;
        }
    }
}
