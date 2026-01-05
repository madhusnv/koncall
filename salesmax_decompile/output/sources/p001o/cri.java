package p001o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.AccessToken;
import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p001o.mt6;

/* loaded from: classes5.dex */
public final class cri {

    /* renamed from: b */
    public static int f18558b;

    /* renamed from: j */
    public static Locale f18566j;

    /* renamed from: a */
    public static final cri f18557a = new cri();

    /* renamed from: c */
    public static long f18559c = -1;

    /* renamed from: d */
    public static long f18560d = -1;

    /* renamed from: e */
    public static long f18561e = -1;

    /* renamed from: f */
    public static String f18562f = "";

    /* renamed from: g */
    public static String f18563g = "";

    /* renamed from: h */
    public static String f18564h = "NoCarrier";

    /* renamed from: i */
    public static String f18565i = "";

    /* renamed from: o.cri$a */
    public interface InterfaceC12734a {
        /* renamed from: a */
        void mo12937a(ur6 ur6Var);

        /* renamed from: b */
        void mo12938b(JSONObject jSONObject);
    }

    /* renamed from: A */
    public static final long m21641A(Uri uri) {
        sq8.m48649h(uri, "contentUri");
        Cursor cursorQuery = null;
        try {
            cursorQuery = C10773c.m13019l().getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: B */
    public static final Locale m21642B() {
        Locale localeM21650O = m21650O();
        if (localeM21650O != null) {
            return localeM21650O;
        }
        Locale locale = Locale.getDefault();
        sq8.m48648g(locale, "getDefault()");
        return locale;
    }

    public static final void C0(Runnable runnable) {
        try {
            C10773c.m13028u().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: D */
    public static final JSONObject m21643D() {
        if (a94.m16694d(cri.class)) {
            return null;
        }
        try {
            String string = C10773c.m13019l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, cri.class);
            return null;
        }
    }

    public static final void D0(JSONObject jSONObject, vx0 vx0Var, String str, boolean z, Context context) throws JSONException {
        sq8.m48649h(jSONObject, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        sq8.m48649h(context, "context");
        mt6.EnumC15426c enumC15426c = mt6.EnumC15426c.ServiceUpdateCompliance;
        if (!mt6.m39648g(enumC15426c)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", C10773c.m13018k());
        if (vx0Var != null) {
            if (mt6.m39648g(enumC15426c)) {
                f18557a.m21686c(jSONObject, vx0Var, str, context);
            }
            if (vx0Var.m53524j() != null) {
                if (mt6.m39648g(enumC15426c)) {
                    f18557a.m21687d(jSONObject, vx0Var, context);
                } else {
                    jSONObject.put("attribution", vx0Var.m53524j());
                }
            }
            if (vx0Var.m53522h() != null) {
                jSONObject.put("advertiser_id", vx0Var.m53522h());
                jSONObject.put("advertiser_tracking_enabled", !vx0Var.m53525k());
            }
            if (!vx0Var.m53525k()) {
                String strM20983b = cdi.m20983b();
                if (!(strM20983b.length() == 0)) {
                    jSONObject.put("ud", strM20983b);
                }
            }
            if (vx0Var.m53523i() != null) {
                jSONObject.put("installer_package", vx0Var.m53523i());
            }
        }
        mm0 mm0VarM39336a = mm0.f35670b.m39336a();
        Object objM39331e = mm0VarM39336a != null ? mm0VarM39336a.m39331e("campaign_ids") : null;
        if (objM39331e != null) {
            jSONObject.put("campaign_ids", objM39331e);
        }
    }

    public static final void E0(JSONObject jSONObject, Context context) throws JSONException, PackageManager.NameNotFoundException {
        Locale locale;
        int i;
        Display display;
        PackageInfo packageInfo;
        sq8.m48649h(jSONObject, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        sq8.m48649h(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f18557a.z0(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i3 = packageInfo.versionCode;
        f18565i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(f18565i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f18566j = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = f18566j;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = f18566j;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(f18562f);
        jSONArray.put(f18564h);
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            Object systemService = context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            display = displayManager != null ? displayManager.getDisplay(0) : null;
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            try {
                i2 = displayMetrics.heightPixels;
                d = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i = i2;
            i2 = i4;
        } else {
            i = 0;
        }
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(f18557a.w0());
        jSONArray.put(f18560d);
        jSONArray.put(f18561e);
        jSONArray.put(f18563g);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: F */
    public static final String m21644F(String str) {
        String strM13029v = C10773c.m13029v();
        return str == null ? strM13029v : sq8.m48644c(str, "gaming") ? e9g.m24593G(strM13029v, "facebook.com", "fb.gg", false, 4, null) : sq8.m48644c(str, "instagram") ? e9g.m24593G(strM13029v, "facebook.com", "instagram.com", false, 4, null) : strM13029v;
    }

    public static final String F0(byte[] bArr) {
        sq8.m48649h(bArr, "bytes");
        return f18557a.m21685T("SHA-1", bArr);
    }

    public static final String G0(String str) {
        if (str == null) {
            return null;
        }
        return f18557a.m21684S("SHA-256", str);
    }

    /* renamed from: H */
    public static final void m21645H(final String str, final InterfaceC12734a interfaceC12734a) {
        sq8.m48649h(str, "accessToken");
        sq8.m48649h(interfaceC12734a, "callback");
        JSONObject jSONObjectM39359a = mmd.m39359a(str);
        if (jSONObjectM39359a != null) {
            interfaceC12734a.mo12938b(jSONObjectM39359a);
            return;
        }
        GraphRequest.InterfaceC10763b interfaceC10763b = new GraphRequest.InterfaceC10763b() { // from class: o.ari
            @Override // com.facebook.GraphRequest.InterfaceC10763b
            /* renamed from: a */
            public final void mo12873a(C10776f c10776f) {
                cri.m21646I(interfaceC12734a, str, c10776f);
            }
        };
        GraphRequest graphRequestM21679G = f18557a.m21679G(str);
        graphRequestM21679G.m12842C(interfaceC10763b);
        graphRequestM21679G.m12852l();
    }

    public static final void H0(Parcel parcel, Map map) {
        sq8.m48649h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    /* renamed from: I */
    public static final void m21646I(InterfaceC12734a interfaceC12734a, String str, C10776f c10776f) {
        sq8.m48649h(interfaceC12734a, "$callback");
        sq8.m48649h(str, "$accessToken");
        sq8.m48649h(c10776f, "response");
        if (c10776f.m13064b() != null) {
            interfaceC12734a.mo12937a(c10776f.m13064b().m12823e());
            return;
        }
        JSONObject jSONObjectM13066d = c10776f.m13066d();
        if (jSONObjectM13066d == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        mmd.m39360b(str, jSONObjectM13066d);
        interfaceC12734a.mo12938b(c10776f.m13066d());
    }

    public static final void I0(Parcel parcel, Map map) {
        sq8.m48649h(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    /* renamed from: K */
    public static final String m21647K(Context context) {
        rri.m47115j(context, "context");
        return C10773c.m13020m();
    }

    /* renamed from: L */
    public static final Method m21648L(Class cls, String str, Class... clsArr) {
        sq8.m48649h(cls, "clazz");
        sq8.m48649h(str, "methodName");
        sq8.m48649h(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static final Method m21649M(String str, String str2, Class... clsArr) throws ClassNotFoundException {
        sq8.m48649h(str, "className");
        sq8.m48649h(str2, "methodName");
        sq8.m48649h(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            sq8.m48648g(cls, "clazz");
            return m21648L(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: O */
    public static final Locale m21650O() {
        try {
            return C10773c.m13019l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: P */
    public static final Object m21651P(JSONObject jSONObject, String str, String str2) throws JSONException {
        sq8.m48649h(jSONObject, "jsonObject");
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new ur6("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    /* renamed from: U */
    public static final Object m21652U(Object obj, Method method, Object... objArr) {
        sq8.m48649h(method, FirebaseAnalytics.Param.METHOD);
        sq8.m48649h(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: V */
    public static final boolean m21653V() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            h8g h8gVar = h8g.f26398a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C10773c.m13020m()}, 1));
            sq8.m48648g(str, "format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextM13019l = C10773c.m13019l();
            PackageManager packageManager = contextM13019l.getPackageManager();
            String packageName = contextM13019l.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            sq8.m48648g(listQueryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (sq8.m48644c(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: W */
    public static final boolean m21654W(Context context) {
        AutofillManager autofillManagerM28458a;
        sq8.m48649h(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManagerM28458a = gd0.m28458a(context.getSystemService(fd0.m26459a()))) != null && autofillManagerM28458a.isAutofillSupported() && autofillManagerM28458a.isEnabled();
    }

    /* renamed from: X */
    public static final boolean m21655X(Context context) {
        sq8.m48649h(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            sq8.m48648g(str, "DEVICE");
            if (new mge(".+_cheets|cheets_.+").m38995g(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public static final boolean m21656Y(Uri uri) {
        return uri != null && e9g.m24606x(FirebaseAnalytics.Param.CONTENT, uri.getScheme(), true);
    }

    /* renamed from: Z */
    public static final boolean m21657Z(AccessToken accessToken) {
        return accessToken != null && sq8.m48644c(accessToken, AccessToken.f11242y.m12774e());
    }

    public static final boolean a0() {
        if (a94.m16694d(cri.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectM21643D = m21643D();
            if (jSONObjectM21643D == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectM21643D.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    sq8.m48648g(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (sq8.m48644c(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, cri.class);
            return false;
        }
    }

    public static final boolean b0(Uri uri) {
        return uri != null && e9g.m24606x(TransferTable.COLUMN_FILE, uri.getScheme(), true);
    }

    public static final boolean d0(String str) {
        if (str != null) {
            return str.length() == 0;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m21660e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : sq8.m48644c(obj, obj2);
    }

    public static final boolean e0(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: f */
    public static final JSONObject m21661f(String str) {
        sq8.m48649h(str, "accessToken");
        JSONObject jSONObjectM39359a = mmd.m39359a(str);
        if (jSONObjectM39359a != null) {
            return jSONObjectM39359a;
        }
        C10776f c10776fM12851k = f18557a.m21679G(str).m12851k();
        if (c10776fM12851k.m13064b() != null) {
            return null;
        }
        return c10776fM12851k.m13066d();
    }

    public static final boolean f0(Uri uri) {
        return uri != null && (e9g.m24606x(HttpHost.DEFAULT_SCHEME_NAME, uri.getScheme(), true) || e9g.m24606x("https", uri.getScheme(), true) || e9g.m24606x("fbstaging", uri.getScheme(), true));
    }

    /* renamed from: g */
    public static final Uri m21662g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        sq8.m48648g(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static final Set g0(JSONArray jSONArray) throws JSONException {
        sq8.m48649h(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            sq8.m48648g(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final List h0(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public static final void m21663i(Context context) {
        sq8.m48649h(context, "context");
        try {
            cri criVar = f18557a;
            criVar.m21688h(context, "facebook.com");
            criVar.m21688h(context, ".facebook.com");
            criVar.m21688h(context, "https://facebook.com");
            criVar.m21688h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final Map i0(String str) throws JSONException {
        sq8.m48649h(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                sq8.m48648g(next, TransferTable.COLUMN_KEY);
                String string = jSONObject.getString(next);
                sq8.m48648g(string, "jsonObject.getString(key)");
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: j */
    public static final void m21664j(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void j0(String str, Exception exc) {
        if (!C10773c.m12991E() || str == null || exc == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(exc.getClass().getSimpleName());
        sb.append(": ");
        sb.append(exc.getMessage());
    }

    /* renamed from: k */
    public static final String m21665k(String str, String str2) {
        return d0(str) ? str2 : str;
    }

    public static final void k0(String str, String str2) {
        C10773c.m12991E();
    }

    public static final void l0(String str, String str2, Throwable th) {
        if (C10773c.m12991E()) {
            d0(str);
        }
    }

    /* renamed from: m */
    public static final HashSet m21666m(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            sq8.m48648g(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final String m0(Map map) throws JSONException {
        sq8.m48649h(map, "map");
        String string = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                string = jSONObject.toString();
            } catch (JSONException unused) {
            }
            sq8.m48648g(string, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        }
        return string;
    }

    /* renamed from: n */
    public static final List m21667n(JSONArray jSONArray) throws JSONException {
        sq8.m48649h(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                sq8.m48648g(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final String n0(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return f18557a.m21684S("MD5", str);
    }

    /* renamed from: o */
    public static final Map m21668o(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            return map;
        }
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            try {
                String string = jSONArrayNames.getString(i);
                sq8.m48648g(string, "keys.getString(i)");
                Object objM21668o = jSONObject.get(string);
                if (objM21668o instanceof JSONObject) {
                    objM21668o = m21668o((JSONObject) objM21668o);
                }
                sq8.m48648g(objM21668o, "value");
                map.put(string, objM21668o);
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    public static final boolean o0(Context context) {
        sq8.m48649h(context, "context");
        return m21654W(context);
    }

    /* renamed from: p */
    public static final Map m21669p(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                sq8.m48648g(next, TransferTable.COLUMN_KEY);
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final Bundle p0(String str) {
        Bundle bundle = new Bundle();
        if (!d0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            for (String str2 : (String[]) f9g.D0(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0])) {
                String[] strArr = (String[]) f9g.D0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], HTTP.UTF_8), URLDecoder.decode(strArr[1], HTTP.UTF_8));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], HTTP.UTF_8), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    j0("FacebookSDK", e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: q */
    public static final int m21670q(InputStream inputStream, OutputStream outputStream) throws Throwable {
        sq8.m48649h(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = bufferedInputStream2.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i2);
                    i += i2;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final boolean q0(Bundle bundle, String str, Object obj) {
        sq8.m48649h(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    /* renamed from: r */
    public static final void m21671r(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final void r0(Bundle bundle, String str, String str2) {
        sq8.m48649h(bundle, "b");
        if (d0(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final Map s0(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    /* renamed from: t */
    public static final String m21672t(int i) {
        String string = new BigInteger(i * 5, new Random()).toString(32);
        sq8.m48648g(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }

    public static final String t0(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            String string = sb.toString();
                            sq8.m48648g(string, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                            m21664j(bufferedInputStream);
                            m21664j(inputStreamReader);
                            return string;
                        }
                        sb.append(cArr, 0, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m21664j(bufferedInputStream);
                    m21664j(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    /* renamed from: u */
    public static final String m21673u(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        sq8.m48648g(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final Map u0(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    /* renamed from: v */
    public static final String m21674v(Context context) {
        String string;
        sq8.m48649h(context, "context");
        try {
            String strM13021n = C10773c.m13021n();
            if (strM13021n != null) {
                return strM13021n;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i);
                sq8.m48648g(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: w */
    public static final String m21675w() throws PackageManager.NameNotFoundException {
        Context contextM13019l = C10773c.m13019l();
        if (contextM13019l == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextM13019l.getPackageManager().getPackageInfo(contextM13019l.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final boolean x0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    /* renamed from: y */
    public static final Date m21676y(Bundle bundle, String str, Date date) throws NumberFormatException {
        long jLongValue;
        sq8.m48649h(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(date.getTime() + (jLongValue * 1000));
    }

    public final void A0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            sq8.m48648g(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            f18562f = displayName;
            String id = timeZone.getID();
            sq8.m48648g(id, "tz.id");
            f18563g = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    public final void B0() {
        try {
            if (m21690s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f18560d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f18560d = m21689l(f18560d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: C */
    public final String m21677C() {
        AccessToken accessTokenM12774e = AccessToken.f11242y.m12774e();
        return (accessTokenM12774e == null || accessTokenM12774e.m12756h() == null) ? "facebook" : accessTokenM12774e.m12756h();
    }

    /* renamed from: E */
    public final String m21678E() {
        return f18563g;
    }

    /* renamed from: G */
    public final GraphRequest m21679G(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", m21681N(m21677C()));
        bundle.putString("access_token", str);
        GraphRequest graphRequestM12914y = GraphRequest.f11338n.m12914y(null, null);
        graphRequestM12914y.m12846G(bundle);
        graphRequestM12914y.m12845F(p38.GET);
        return graphRequestM12914y;
    }

    /* renamed from: J */
    public final Locale m21680J() {
        return f18566j;
    }

    /* renamed from: N */
    public final String m21681N(String str) {
        return sq8.m48644c(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    /* renamed from: Q */
    public final String m21682Q() {
        return f18565i;
    }

    /* renamed from: R */
    public final String m21683R(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        sq8.m48648g(bArrDigest, "digest");
        for (byte b : bArrDigest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        String string = sb.toString();
        sq8.m48648g(string, "builder.toString()");
        return string;
    }

    /* renamed from: S */
    public final String m21684S(String str, String str2) {
        byte[] bytes = str2.getBytes(sh2.f45422b);
        sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
        return m21685T(str, bytes);
    }

    /* renamed from: T */
    public final String m21685T(String str, byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            sq8.m48648g(messageDigest, "hash");
            return m21683R(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void m21686c(JSONObject jSONObject, vx0 vx0Var, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !c0(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (vx0Var.m53525k()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public final boolean c0(Context context) throws ClassNotFoundException {
        Method methodM21649M = m21649M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM21649M == null) {
            return false;
        }
        Object objM21652U = m21652U(null, methodM21649M, context);
        return (objM21652U instanceof Integer) && sq8.m48644c(objM21652U, 0);
    }

    /* renamed from: d */
    public final void m21687d(JSONObject jSONObject, vx0 vx0Var, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !c0(context)) {
            jSONObject.put("attribution", vx0Var.m53524j());
        } else {
            if (vx0Var.m53525k()) {
                return;
            }
            jSONObject.put("attribution", vx0Var.m53524j());
        }
    }

    /* renamed from: h */
    public final void m21688h(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) f9g.D0(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0])) {
            String[] strArr = (String[]) f9g.D0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = sq8.m48651j(str3.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* renamed from: l */
    public final long m21689l(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: s */
    public final boolean m21690s() {
        return sq8.m48644c("mounted", Environment.getExternalStorageState());
    }

    public final void v0() {
        try {
            if (m21690s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f18561e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f18561e = m21689l(f18561e);
        } catch (Exception unused) {
        }
    }

    public final int w0() {
        int i = f18558b;
        if (i > 0) {
            return i;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: o.bri
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return cri.x0(file, str);
                }
            });
            if (fileArrListFiles != null) {
                f18558b = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f18558b <= 0) {
            f18558b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f18558b;
    }

    /* renamed from: x */
    public final long m21691x() {
        return f18561e;
    }

    public final void y0(Context context) {
        if (sq8.m48644c(f18564h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                sq8.m48647f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                sq8.m48648g(networkOperatorName, "telephonyManager.networkOperatorName");
                f18564h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: z */
    public final String m21692z() {
        return f18564h;
    }

    public final void z0(Context context) {
        if (f18559c == -1 || System.currentTimeMillis() - f18559c >= 1800000) {
            f18559c = System.currentTimeMillis();
            A0();
            y0(context);
            B0();
            v0();
        }
    }
}
