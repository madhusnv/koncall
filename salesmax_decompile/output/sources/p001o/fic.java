package p001o;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class fic {

    /* renamed from: o.fic$a */
    public static class C13443a {
        /* renamed from: a */
        public static Signature[] m26779a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        /* renamed from: b */
        public static long m26780b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        /* renamed from: c */
        public static Signature[] m26781c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        /* renamed from: d */
        public static boolean m26782d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        /* renamed from: e */
        public static boolean m26783e(PackageManager packageManager, String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    /* renamed from: a */
    public static long m26778a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C13443a.m26780b(packageInfo) : packageInfo.versionCode;
    }
}
