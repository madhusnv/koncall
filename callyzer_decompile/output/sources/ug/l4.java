package ug;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import bg.C0658c;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.imap.IMAPStore;
import ec.C2019q;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pf.C5906f;
import pg.h6;
import s1.C6725t;
import s7.C6769a;
import s7.C6770b;
import sf.AbstractC6840z;
import u7.C7352b;
import v7.C7684b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l4 extends t1 {

    /* renamed from: j */
    public static final String[] f35598j = {"firebase_", "google_", "ga_"};

    /* renamed from: k */
    public static final String[] f35599k = {"_err"};

    /* renamed from: c */
    public SecureRandom f35600c;

    /* renamed from: d */
    public final AtomicLong f35601d;

    /* renamed from: e */
    public int f35602e;

    /* renamed from: f */
    public C7352b f35603f;

    /* renamed from: g */
    public Boolean f35604g;

    /* renamed from: h */
    public Integer f35605h;

    public l4(n1 n1Var) {
        super(n1Var);
        this.f35605h = null;
        this.f35601d = new AtomicLong(0L);
    }

    public static ArrayList C0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7434e c7434e = (C7434e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c7434e.f35357a);
            bundle.putString("origin", c7434e.f35358b);
            bundle.putLong("creation_timestamp", c7434e.f35360d);
            bundle.putString(IMAPStore.ID_NAME, c7434e.f35359c.f35549b);
            Object objM14016b = c7434e.f35359c.m14016b();
            AbstractC6840z.m13036g(objM14016b);
            z1.m14265c(bundle, objM14016b);
            bundle.putBoolean("active", c7434e.f35361e);
            String str = c7434e.f35362f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C7449t c7449t = c7434e.f35363g;
            if (c7449t != null) {
                bundle.putString("timed_out_event_name", c7449t.f35827a);
                C7448s c7448s = c7449t.f35828b;
                if (c7448s != null) {
                    bundle.putBundle("timed_out_event_params", c7448s.m14134g());
                }
            }
            bundle.putLong("trigger_timeout", c7434e.f35364h);
            C7449t c7449t2 = c7434e.f35365j;
            if (c7449t2 != null) {
                bundle.putString("triggered_event_name", c7449t2.f35827a);
                C7448s c7448s2 = c7449t2.f35828b;
                if (c7448s2 != null) {
                    bundle.putBundle("triggered_event_params", c7448s2.m14134g());
                }
            }
            bundle.putLong("triggered_timestamp", c7434e.f35359c.f35550c);
            bundle.putLong("time_to_live", c7434e.f35366k);
            C7449t c7449t3 = c7434e.f35367l;
            if (c7449t3 != null) {
                bundle.putString("expired_event_name", c7449t3.f35827a);
                C7448s c7448s3 = c7449t3.f35828b;
                if (c7448s3 != null) {
                    bundle.putBundle("expired_event_params", c7448s3.m14134g());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean D0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC6840z.m13036g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void E0(x2 x2Var, Bundle bundle, boolean z6) {
        if (bundle != null && x2Var != null) {
            if (!bundle.containsKey("_sc") || z6) {
                String str = x2Var.f35922a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = x2Var.f35923b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", x2Var.f35924c);
                return;
            }
            z6 = false;
        }
        if (bundle != null && x2Var == null && z6) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean G0(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean L0(String str) {
        AbstractC6840z.m13033d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: R */
    public static String m14028R(int i10, String str, boolean z6) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z6) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public static boolean V0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void c0(l4.d0 d0Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        G0(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        d0Var.m9090x(str, "_err", bundle);
    }

    public static MessageDigest d0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long e0(byte[] bArr) {
        AbstractC6840z.m13036g(bArr);
        int length = bArr.length;
        int i10 = 0;
        AbstractC6840z.m13039j(length > 0);
        long j6 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j6 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j6;
    }

    public static boolean f0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int h0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static boolean j0(String str) {
        String str2 = (String) f0.f44826r0.m13872a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean l0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean m0(String str, String[] strArr) {
        AbstractC6840z.m13036g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] r0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final void A0(com.google.android.gms.internal.measurement.n0 n0Var, Bundle bundle) {
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning bundle value to wrapper");
        }
    }

    public final void B0(com.google.android.gms.internal.measurement.n0 n0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning bundle list to wrapper");
        }
    }

    public final String F0() {
        byte[] bArr = new byte[16];
        K0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object H0(int i10, Object obj, boolean z6, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m14028R(i10, obj.toString(), z6);
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleO0 = o0((Bundle) parcelable);
                if (!bundleO0.isEmpty()) {
                    arrayList.add(bundleO0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int I0(String str) {
        n1 n1Var = (n1) this.f482a;
        if ("_ldl".equals(str)) {
            n1Var.getClass();
            return NewHope.SENDB_BYTES;
        }
        if (TransferTable.COLUMN_ID.equals(str)) {
            n1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            n1Var.getClass();
            return 100;
        }
        n1Var.getClass();
        return 36;
    }

    public final long J0() {
        long andIncrement;
        long j6;
        AtomicLong atomicLong = this.f35601d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f35601d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((n1) this.f482a).f35674l.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f35602e + 1;
            this.f35602e = i10;
            j6 = jNextLong + i10;
        }
        return j6;
    }

    public final SecureRandom K0() {
        mo325M();
        if (this.f35600c == null) {
            this.f35600c = new SecureRandom();
        }
        return this.f35600c;
    }

    public final Bundle M0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    @Override // ug.t1
    /* renamed from: N */
    public final boolean mo13860N() {
        return true;
    }

    public final boolean N0(String str, String str2) {
        n1 n1Var = (n1) this.f482a;
        if (str2 == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35864h.m14141b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35864h.m14141b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            v0 v0Var3 = n1Var.f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35864h.m14142c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                v0 v0Var4 = n1Var.f35669f;
                n1.m14085m(v0Var4);
                v0Var4.f35864h.m14142c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean O0(String str, String str2) {
        n1 n1Var = (n1) this.f482a;
        if (str2 == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35864h.m14141b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35864h.m14141b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                v0 v0Var3 = n1Var.f35669f;
                n1.m14085m(v0Var3);
                v0Var3.f35864h.m14142c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                v0 v0Var4 = n1Var.f35669f;
                n1.m14085m(v0Var4);
                v0Var4.f35864h.m14142c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean P0(String str, String[] strArr, String[] strArr2, String str2) {
        n1 n1Var = (n1) this.f482a;
        if (str2 == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35864h.m14141b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(f35598j[i10])) {
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35864h.m14142c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m0(str2, strArr2)) {
            return true;
        }
        v0 v0Var3 = n1Var.f35669f;
        n1.m14085m(v0Var3);
        v0Var3.f35864h.m14142c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: Q */
    public final boolean m14029Q(String str) {
        n1 n1Var = (n1) this.f482a;
        if (TextUtils.isEmpty(str)) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35864h.m14140a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC6840z.m13036g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        v0 v0Var2 = n1Var.f35669f;
        n1.m14085m(v0Var2);
        v0Var2.f35864h.m14141b(v0.m14157U(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean Q0(int i10, String str, String str2) {
        n1 n1Var = (n1) this.f482a;
        if (str2 == null) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35864h.m14141b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        v0 v0Var2 = n1Var.f35669f;
        n1.m14085m(v0Var2);
        v0Var2.f35864h.m14143d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final int R0(String str) {
        if (!O0("event", str)) {
            return 2;
        }
        if (!P0("event", z1.f36025a, z1.f36026b, str)) {
            return 13;
        }
        ((n1) this.f482a).getClass();
        return !Q0(40, "event", str) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m14030S(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.l4.m14030S(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int S0(String str) {
        if (!O0("user property", str)) {
            return 6;
        }
        if (!P0("user property", z1.f36033i, null, str)) {
            return 15;
        }
        ((n1) this.f482a).getClass();
        return !Q0(24, "user property", str) ? 6 : 0;
    }

    /* renamed from: T */
    public final Object m14031T(Object obj, String str) {
        n1 n1Var = (n1) this.f482a;
        int iMax = 500;
        if ("_ev".equals(str)) {
            n1Var.f35667d.getClass();
            return H0(Math.max(500, 256), obj, true, true);
        }
        if (l0(str)) {
            n1Var.f35667d.getClass();
            iMax = Math.max(500, 256);
        } else {
            n1Var.f35667d.getClass();
        }
        return H0(iMax, obj, false, true);
    }

    public final int T0(String str) {
        if (!N0("event param", str)) {
            return 3;
        }
        if (!P0("event param", null, null, str)) {
            return 14;
        }
        ((n1) this.f482a).getClass();
        return !Q0(40, "event param", str) ? 3 : 0;
    }

    /* renamed from: U */
    public final Bundle m14032U(String str, Bundle bundle, List list, boolean z6) {
        int iT0;
        String str2;
        List list2 = list;
        boolean zM0 = m0(str, z1.f36028d);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        n1 n1Var = (n1) this.f482a;
        C7436g c7436g = n1Var.f35667d;
        q0 q0Var = n1Var.f35673k;
        l4 l4Var = ((n1) c7436g.f482a).f35672j;
        n1.m14083i(l4Var);
        int i10 = l4Var.s0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                iT0 = !z6 ? T0(str4) : 0;
                if (iT0 == 0) {
                    iT0 = U0(str4);
                }
            } else {
                iT0 = 0;
            }
            if (iT0 != 0) {
                m14036Y(bundle2, iT0, str4, iT0 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int iM14030S = m14030S(str, str4, bundle.get(str4), bundle2, list2, z6, zM0);
                if (iM14030S == 17) {
                    m14036Y(bundle2, 17, str4, Boolean.FALSE);
                } else if (iM14030S != 0 && !"_ev".equals(str4)) {
                    m14036Y(bundle2, iM14030S, iM14030S == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (L0(str4)) {
                    i11++;
                    if (i11 > i10) {
                        if (n1Var.f35667d.m13889W(str3, f0.f44807e1) && z10) {
                            str2 = str3;
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" params");
                            String string = sb2.toString();
                            v0 v0Var = n1Var.f35669f;
                            n1.m14085m(v0Var);
                            str2 = str3;
                            v0Var.f35864h.m14142c(string, q0Var.m14113a(str), q0Var.m14117e(bundle));
                        }
                        G0(5, bundle2);
                        bundle2.remove(str4);
                        z10 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    public final int U0(String str) {
        if (!O0("event param", str)) {
            return 3;
        }
        if (!P0("event param", null, null, str)) {
            return 14;
        }
        ((n1) this.f482a).getClass();
        return !Q0(40, "event param", str) ? 3 : 0;
    }

    /* renamed from: V */
    public final void m14033V(C2019q c2019q, int i10) {
        Bundle bundle = (Bundle) c2019q.f9568e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z6 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (L0(str) && (i11 = i11 + 1) > i10) {
                n1 n1Var = (n1) this.f482a;
                C7436g c7436g = n1Var.f35667d;
                q0 q0Var = n1Var.f35673k;
                if (!c7436g.m13889W(null, f0.f44807e1) || !z6) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    String string = sb2.toString();
                    v0 v0Var = n1Var.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35864h.m14142c(string, q0Var.m14113a((String) c2019q.f9566c), q0Var.m14117e(bundle));
                    G0(5, bundle);
                }
                bundle.remove(str);
                z6 = true;
            }
        }
    }

    /* renamed from: W */
    public final void m14034W(Parcelable[] parcelableArr, int i10) {
        AbstractC6840z.m13036g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            boolean z6 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (L0(str) && !m0(str, z1.f36032h) && (i11 = i11 + 1) > i10) {
                    n1 n1Var = (n1) this.f482a;
                    C7436g c7436g = n1Var.f35667d;
                    q0 q0Var = n1Var.f35673k;
                    if (!c7436g.m13889W(null, f0.f44807e1) || !z6) {
                        v0 v0Var = n1Var.f35669f;
                        n1.m14085m(v0Var);
                        t0 t0Var = v0Var.f35864h;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        t0Var.m14142c(sb2.toString(), q0Var.m14114b(str), q0Var.m14117e(bundle));
                    }
                    G0(28, bundle);
                    bundle.remove(str);
                    z6 = true;
                }
            }
        }
    }

    public final boolean W0(int i10, Object obj, String str, String str2) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i10) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35867l.m14143d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final void m14035X(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                l4 l4Var = ((n1) this.f482a).f35672j;
                n1.m14083i(l4Var);
                l4Var.b0(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void X0(String str, String str2, Bundle bundle, List list, boolean z6) {
        int iT0;
        String str3;
        int iM14030S;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        n1 n1Var = (n1) this.f482a;
        C7436g c7436g = n1Var.f35667d;
        v0 v0Var = n1Var.f35669f;
        q0 q0Var = n1Var.f35673k;
        l4 l4Var = ((n1) c7436g.f482a).f35672j;
        n1.m14083i(l4Var);
        int i10 = true != l4Var.s0(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                iT0 = !z6 ? T0(str4) : 0;
                if (iT0 == 0) {
                    iT0 = U0(str4);
                }
            } else {
                iT0 = 0;
            }
            if (iT0 != 0) {
                m14036Y(bundle, iT0, str4, iT0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (V0(bundle.get(str4))) {
                    n1.m14085m(v0Var);
                    v0Var.f35867l.m14143d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    iM14030S = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    iM14030S = m14030S(str, str4, bundle.get(str4), bundle, list2, z6, false);
                }
                if (iM14030S != 0 && !"_ev".equals(str4)) {
                    m14036Y(bundle, iM14030S, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (L0(str4) && !m0(str4, z1.f36032h)) {
                    int i12 = i11 + 1;
                    if (!s0(231100000)) {
                        n1.m14085m(v0Var);
                        v0Var.f35864h.m14142c("Item array not supported on client's version of Google Play Services (Android Only)", q0Var.m14113a(str), q0Var.m14117e(bundle));
                        G0(23, bundle);
                        bundle.remove(str4);
                    } else if (i12 > i10) {
                        if (!n1Var.f35667d.m13889W(str3, f0.f44807e1) || !z10) {
                            n1.m14085m(v0Var);
                            t0 t0Var = v0Var.f35864h;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            t0Var.m14142c(sb2.toString(), q0Var.m14113a(str), q0Var.m14117e(bundle));
                        }
                        G0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i11 = i12;
                        z10 = true;
                    }
                    list2 = list;
                    i11 = i12;
                }
            }
            list2 = list;
        }
    }

    /* renamed from: Y */
    public final void m14036Y(Bundle bundle, int i10, String str, Object obj) {
        if (G0(i10, bundle)) {
            ((n1) this.f482a).getClass();
            bundle.putString("_ev", m14028R(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* renamed from: Z */
    public final int m14037Z(Object obj, String str) {
        return "_ldl".equals(str) ? W0(I0(str), obj, "user property referrer", str) : W0(I0(str), obj, "user property", str) ? 0 : 7;
    }

    public final Object a0(Object obj, String str) {
        return "_ldl".equals(str) ? H0(I0(str), obj, true, false) : H0(I0(str), obj, false, false);
    }

    public final void b0(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            n1 n1Var = (n1) this.f482a;
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35867l.m14142c("Not putting event parameter. Invalid value type. name, type", n1Var.f35673k.m14114b(str), simpleName);
        }
    }

    public final C7352b g0() {
        h6 c7684b;
        Object objInvoke;
        if (this.f35603f == null) {
            Context context = ((n1) this.f482a).f35664a;
            AbstractC4154l.m8923f(context, "context");
            int i10 = Build.VERSION.SDK_INT;
            C6770b c6770b = C6770b.f32225a;
            if (i10 >= 33) {
                c6770b.m12971a();
            }
            if ((i10 >= 33 ? c6770b.m12971a() : 0) >= 5) {
                c7684b = new C7684b(context, 1);
            } else {
                C6769a c6769a = C6769a.f32224a;
                if (((i10 == 31 || i10 == 32) ? c6769a.m12970a() : 0) >= 9) {
                    try {
                        objInvoke = new C6725t(9, context).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 == 31 || i11 == 32) {
                            c6769a.m12970a();
                        }
                        objInvoke = null;
                    }
                    c7684b = (h6) objInvoke;
                } else {
                    c7684b = null;
                }
            }
            this.f35603f = c7684b != null ? new C7352b(c7684b) : null;
        }
        return this.f35603f;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i0() {
        /*
            r12 = this;
            r12.mo325M()
            java.lang.Object r0 = r12.f482a
            ug.n1 r0 = (ug.n1) r0
            ug.n0 r1 = r0.m14095r()
            ug.v0 r0 = r0.f35669f
            java.lang.String r1 = r1.m14080S()
            boolean r1 = j0(r1)
            r2 = 0
            if (r1 != 0) goto L1a
            return r2
        L1a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 30
            if (r1 >= r5) goto L24
            r5 = 4
            goto L44
        L24:
            int r1 = android.os.ext.SdkExtensions.getExtensionVersion(r5)
            r5 = 4
            if (r1 >= r5) goto L2e
            r5 = 8
            goto L44
        L2e:
            int r1 = h0()
            ug.e0 r5 = ug.f0.f44820l0
            java.lang.Object r5 = r5.m13872a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r1 >= r5) goto L43
            r5 = 16
            goto L44
        L43:
            r5 = r2
        L44:
            java.lang.String r1 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r1 = r12.k0(r1)
            if (r1 != 0) goto L4f
            r7 = 2
            long r5 = r5 | r7
        L4f:
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 != 0) goto Lb3
            java.lang.Boolean r1 = r12.f35604g
            if (r1 != 0) goto La9
            u7.b r1 = r12.g0()
            r7 = 0
            if (r1 != 0) goto L5f
            goto Laf
        L5f:
            zh.d r1 = r1.m13760b()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L87 java.lang.InterruptedException -> L89 java.util.concurrent.ExecutionException -> L8b java.util.concurrent.CancellationException -> L8d
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = r1.get(r9, r8)     // Catch: java.util.concurrent.TimeoutException -> L87 java.lang.InterruptedException -> L89 java.util.concurrent.ExecutionException -> L8b java.util.concurrent.CancellationException -> L8d
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.util.concurrent.TimeoutException -> L87 java.lang.InterruptedException -> L89 java.util.concurrent.ExecutionException -> L8b java.util.concurrent.CancellationException -> L8d
            if (r1 == 0) goto L80
            int r4 = r1.intValue()     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L7a java.util.concurrent.ExecutionException -> L7c java.util.concurrent.CancellationException -> L7e
            r8 = 1
            if (r4 != r8) goto L80
            r7 = r8
            goto L80
        L78:
            r4 = move-exception
            goto L91
        L7a:
            r4 = move-exception
            goto L91
        L7c:
            r4 = move-exception
            goto L91
        L7e:
            r4 = move-exception
            goto L91
        L80:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L7a java.util.concurrent.ExecutionException -> L7c java.util.concurrent.CancellationException -> L7e
            r12.f35604g = r4     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L7a java.util.concurrent.ExecutionException -> L7c java.util.concurrent.CancellationException -> L7e
            goto L9f
        L87:
            r1 = move-exception
            goto L8e
        L89:
            r1 = move-exception
            goto L8e
        L8b:
            r1 = move-exception
            goto L8e
        L8d:
            r1 = move-exception
        L8e:
            r11 = r4
            r4 = r1
            r1 = r11
        L91:
            ug.n1.m14085m(r0)
            ug.t0 r7 = r0.f35865j
            java.lang.String r8 = "Measurement manager api exception"
            r7.m14141b(r4, r8)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r12.f35604g = r4
        L9f:
            ug.n1.m14085m(r0)
            ug.t0 r0 = r0.f35870p
            java.lang.String r4 = "Measurement manager api status result"
            r0.m14141b(r1, r4)
        La9:
            java.lang.Boolean r0 = r12.f35604g
            boolean r7 = r0.booleanValue()
        Laf:
            if (r7 != 0) goto Lb3
            r5 = 64
        Lb3:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto Lba
            r0 = 1
            return r0
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.l4.i0():long");
    }

    public final boolean k0(String str) {
        mo325M();
        n1 n1Var = (n1) this.f482a;
        if (((Context) C0658c.m1928a(n1Var.f35664a).f4200a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35869n.m14141b(str, "Permission not granted");
        return false;
    }

    public final boolean n0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((n1) this.f482a).f35667d.m13883Q("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle o0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM14031T = m14031T(bundle.get(str), str);
                if (objM14031T == null) {
                    n1 n1Var = (n1) this.f482a;
                    v0 v0Var = n1Var.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35867l.m14141b(n1Var.f35673k.m14114b(str), "Param value can't be null");
                } else {
                    b0(bundle2, str, objM14031T);
                }
            }
        }
        return bundle2;
    }

    public final C7449t p0(String str, Bundle bundle, String str2, long j6, boolean z6) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (R0(str) != 0) {
            n1 n1Var = (n1) this.f482a;
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(n1Var.f35673k.m14115c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM14032U = m14032U(str, bundle2, Collections.singletonList("_o"), true);
        if (z6) {
            bundleM14032U = o0(bundleM14032U);
        }
        AbstractC6840z.m13036g(bundleM14032U);
        return new C7449t(str, new C7448s(bundleM14032U), str2, j6);
    }

    public final boolean q0(Context context, String str) {
        Signature[] signatureArr;
        n1 n1Var = (n1) this.f482a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM1920c = C0658c.m1928a(context).m1920c(64, str);
            if (packageInfoM1920c == null || (signatureArr = packageInfoM1920c.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(e2, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(e10, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean s0(int i10) {
        Boolean bool = ((n1) this.f482a).m14093p().f35571e;
        if (t0() < i10 / IMAPStore.RESPONSE) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int t0() {
        if (this.f35605h == null) {
            n1 n1Var = (n1) this.f482a;
            C5906f c5906f = C5906f.f28748b;
            Context context = n1Var.f35664a;
            c5906f.getClass();
            this.f35605h = Integer.valueOf(C5906f.m11514a(context) / IMAPStore.RESPONSE);
        }
        return this.f35605h.intValue();
    }

    public final void u0(Bundle bundle, long j6) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(Long.valueOf(j10), "Params already contained engagement");
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j6 + j10);
    }

    public final void v0(String str, com.google.android.gms.internal.measurement.n0 n0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning string value to wrapper");
        }
    }

    public final void w0(com.google.android.gms.internal.measurement.n0 n0Var, long j6) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j6);
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning long value to wrapper");
        }
    }

    public final void x0(com.google.android.gms.internal.measurement.n0 n0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning int value to wrapper");
        }
    }

    public final void y0(com.google.android.gms.internal.measurement.n0 n0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning byte array to wrapper");
        }
    }

    public final void z0(com.google.android.gms.internal.measurement.n0 n0Var, boolean z6) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z6);
        try {
            n0Var.mo3311E(bundle);
        } catch (RemoteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error returning boolean value to wrapper");
        }
    }
}
