package zf;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import bg.C0657b;
import bg.C0658c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import pf.AbstractC5907g;
import pf.C5908h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zf.b */
/* loaded from: classes.dex */
public abstract class AbstractC8947b {

    /* renamed from: a */
    public static final char[] f42952a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final char[] f42953b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    public static Boolean f42954c;

    /* renamed from: d */
    public static Boolean f42955d;

    /* renamed from: e */
    public static Boolean f42956e;

    /* renamed from: f */
    public static Boolean f42957f;

    /* renamed from: a */
    public static String m16424a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = (bArr[i10] & 240) >>> 4;
            char[] cArr = f42952a;
            sb2.append(cArr[i11]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static byte[] m16425b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* renamed from: c */
    public static String m16426c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: d */
    public static byte[] m16427d(Context context, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        PackageInfo packageInfoM1920c = C0658c.m1928a(context).m1920c(64, str);
        Signature[] signatureArr = packageInfoM1920c.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i10++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoM1920c.signatures[0].toByteArray());
            }
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m16428e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: f */
    public static boolean m16429f(Context context, int i10) throws PackageManager.NameNotFoundException {
        if (m16431h(i10, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C5908h c5908hM11519a = C5908h.m11519a(context);
                c5908hM11519a.getClass();
                return packageInfo != null && (C5908h.m11521d(packageInfo, false) || (C5908h.m11521d(packageInfo, true) && AbstractC5907g.m11517a(c5908hM11519a.f28755a)));
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m16430g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f42954c == null) {
            f42954c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f42954c.booleanValue();
        if (f42955d == null) {
            f42955d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f42955d.booleanValue()) {
            return !m16428e() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m16431h(int i10, Context context, String str) {
        C0657b c0657bM1928a = C0658c.m1928a(context);
        c0657bM1928a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) c0657bM1928a.f4200a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
