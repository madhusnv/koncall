package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import c6.AbstractC0879i;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h */
    public static final Pattern f7175h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final Context f7176a;

    /* renamed from: b */
    public final String f7177b;

    /* renamed from: c */
    public final String f7178c;

    /* renamed from: d */
    public final String f7179d;

    /* renamed from: e */
    public final String f7180e;

    /* renamed from: f */
    public final long f7181f;

    /* renamed from: g */
    public final long f7182g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j6, long j10) {
        this.f7176a = context;
        this.f7177b = str;
        this.f7178c = str2;
        Matcher matcher = f7175h.matcher(str);
        this.f7179d = matcher.matches() ? matcher.group(1) : null;
        this.f7180e = "firebase";
        this.f7181f = j6;
        this.f7182g = j10;
    }

    /* renamed from: c */
    public static JSONObject m4491c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    /* renamed from: d */
    public static void m4492d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: a */
    public final JSONObject m4493a(String str, String str2, Map map, Long l9, Map map2) throws PackageManager.NameNotFoundException, FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f7177b);
        Context context = this.f7176a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i10));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(i10 >= 28 ? AbstractC0879i.m2393e(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.0.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Objects.toString(map2.keySet());
        }
        if (l9 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l9));
        }
        return new JSONObject(map3);
    }

    /* renamed from: b */
    public final HttpURLConnection m4494b() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f7179d + "/namespaces/" + this.f7180e + ":fetch").openConnection();
        } catch (IOException e2) {
            throw new FirebaseRemoteConfigException(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[LOOP:0: B:11:0x006f->B:13:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af A[Catch: all -> 0x0162, IOException | JSONException -> 0x0165, IOException -> 0x0168, TRY_LEAVE, TryCatch #1 {all -> 0x0162, blocks: (B:15:0x0093, B:17:0x00af, B:67:0x016a, B:68:0x0173, B:69:0x0174, B:70:0x017b), top: B:82:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a A[Catch: all -> 0x0162, IOException | JSONException -> 0x0165, IOException -> 0x0168, TRY_ENTER, TryCatch #1 {all -> 0x0162, blocks: (B:15:0x0093, B:17:0x00af, B:67:0x016a, B:68:0x0173, B:69:0x0174, B:70:0x017b), top: B:82:0x0093 }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bk.C0679j fetch(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.Long r16, java.util.Date r17, java.util.Map<java.lang.String, java.lang.String> r18) throws org.json.JSONException, java.security.NoSuchAlgorithmException, com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):bk.j");
    }
}
