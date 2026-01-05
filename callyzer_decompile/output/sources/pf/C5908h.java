package pf;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.h */
/* loaded from: classes.dex */
public final class C5908h {

    /* renamed from: c */
    public static C5908h f28754c;

    /* renamed from: a */
    public final Context f28755a;

    /* renamed from: b */
    public volatile String f28756b;

    public C5908h(Context context) {
        this.f28755a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C5908h m11519a(Context context) {
        AbstractC6840z.m13036g(context);
        synchronized (C5908h.class) {
            if (f28754c == null) {
                BinderC5912l binderC5912l = AbstractC5916p.f28771a;
                synchronized (AbstractC5916p.class) {
                    try {
                        if (AbstractC5916p.f28775e == null) {
                            AbstractC5916p.f28775e = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                f28754c = new C5908h(context);
            }
        }
        return f28754c;
    }

    /* renamed from: c */
    public static final AbstractBinderC5913m m11520c(PackageInfo packageInfo, AbstractBinderC5913m... abstractBinderC5913mArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        BinderC5914n binderC5914n = new BinderC5914n(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < abstractBinderC5913mArr.length; i10++) {
            if (abstractBinderC5913mArr[i10].equals(binderC5914n)) {
                return abstractBinderC5913mArr[i10];
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m11521d(PackageInfo packageInfo, boolean z6) {
        PackageInfo packageInfo2;
        if (!z6) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z6 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z6 ? m11520c(packageInfo2, AbstractC5915o.f28770a) : m11520c(packageInfo2, AbstractC5915o.f28770a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01c3 A[EDGE_INSN: B:118:0x01c3->B:93:0x01c3 BREAK  A[LOOP:0: B:8:0x001a->B:90:0x01b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2 A[LOOP:0: B:8:0x001a->B:90:0x01b2, LOOP_END] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11522b(int r17) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.C5908h.m11522b(int):boolean");
    }
}
