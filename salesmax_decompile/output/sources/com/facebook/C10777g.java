package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.bka;
import p001o.id5;
import p001o.sja;
import p001o.sq8;
import p001o.za;

/* renamed from: com.facebook.g */
/* loaded from: classes5.dex */
public final class C10777g {

    /* renamed from: c */
    public static final a f11443c = new a(null);

    /* renamed from: d */
    public static final String f11444d = C10777g.class.getSimpleName();

    /* renamed from: a */
    public final String f11445a;

    /* renamed from: b */
    public final SharedPreferences f11446b;

    /* renamed from: com.facebook.g$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m13076a(Bundle bundle) {
            sq8.m48649h(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        /* renamed from: b */
        public final Date m13077b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        /* renamed from: c */
        public final Date m13078c(Bundle bundle) {
            sq8.m48649h(bundle, "bundle");
            return m13077b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        /* renamed from: d */
        public final Date m13079d(Bundle bundle) {
            sq8.m48649h(bundle, "bundle");
            return m13077b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        /* renamed from: e */
        public final za m13080e(Bundle bundle) {
            sq8.m48649h(bundle, "bundle");
            return bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource") ? (za) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource") : bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? za.FACEBOOK_APPLICATION_WEB : za.WEB_VIEW;
        }

        /* renamed from: f */
        public final String m13081f(Bundle bundle) {
            sq8.m48649h(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        /* renamed from: g */
        public final boolean m13082g(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10777g(Context context, String str) {
        sq8.m48649h(context, "context");
        if (str == null) {
            str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        } else {
            if (str.length() == 0) {
            }
        }
        this.f11445a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        sq8.m48648g(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.f11446b = sharedPreferences;
    }

    /* renamed from: a */
    public final void m13073a() {
        this.f11446b.edit().clear().apply();
    }

    /* renamed from: b */
    public final void m13074b(String str, Bundle bundle) throws JSONException, ClassNotFoundException {
        String str2;
        String string;
        String string2 = this.f11446b.getString(str, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        sq8.m48648g(string2, "checkNotNull(cache.getString(key, \"{}\"))");
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("valueType");
        if (string3 != null) {
            int i = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals("stringList")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        while (i < length) {
                            Object obj = jSONArray.get(i);
                            if (obj == JSONObject.NULL) {
                                str2 = null;
                            } else {
                                sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.String");
                                str2 = (String) obj;
                            }
                            arrayList.add(i, str2);
                            i++;
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals("bool[]")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        while (i < length2) {
                            zArr[i] = jSONArray2.getBoolean(i);
                            i++;
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals("byte[]")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        while (i < length3) {
                            bArr[i] = (byte) jSONArray3.getInt(i);
                            i++;
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals("char[]")) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        for (int i2 = 0; i2 < length4; i2++) {
                            String string4 = jSONArray4.getString(i2);
                            if (string4 != null && string4.length() == 1) {
                                cArr[i2] = string4.charAt(0);
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals("double")) {
                        bundle.putDouble(str, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals("long[]")) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        while (i < length5) {
                            jArr[i] = jSONArray5.getLong(i);
                            i++;
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(str, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals("float[]")) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        while (i < length6) {
                            fArr[i] = (float) jSONArray6.getDouble(i);
                            i++;
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals("int")) {
                        bundle.putInt(str, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals("bool")) {
                        bundle.putBoolean(str, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals("byte")) {
                        bundle.putByte(str, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals("char") && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals("enum")) {
                        try {
                            Class<?> cls = Class.forName(jSONObject.getString("enumType"));
                            sq8.m48647f(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                            bundle.putSerializable(str, Enum.valueOf(cls, jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(str, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals("float")) {
                        bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals("int[]")) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        while (i < length7) {
                            iArr[i] = jSONArray7.getInt(i);
                            i++;
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals("short")) {
                        bundle.putShort(str, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals("double[]")) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        while (i < length8) {
                            dArr[i] = jSONArray8.getDouble(i);
                            i++;
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals("short[]")) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        while (i < length9) {
                            sArr[i] = (short) jSONArray9.getInt(i);
                            i++;
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: c */
    public final Bundle m13075c() throws ClassNotFoundException {
        Bundle bundle = new Bundle();
        for (String str : this.f11446b.getAll().keySet()) {
            try {
                sq8.m48648g(str, TransferTable.COLUMN_KEY);
                m13074b(str, bundle);
            } catch (JSONException e) {
                sja.C16851a c16851a = sja.f45482e;
                bka bkaVar = bka.CACHE;
                String str2 = f11444d;
                sq8.m48648g(str2, "TAG");
                c16851a.m48386a(bkaVar, 5, str2, "Error reading cached value for key: '" + str + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public /* synthetic */ C10777g(Context context, String str, int i, id5 id5Var) {
        this(context, (i & 2) != 0 ? null : str);
    }
}
