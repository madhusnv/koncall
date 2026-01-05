package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import ug.C7454y;
import x4.C8304n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w7.f */
/* loaded from: classes.dex */
public abstract class AbstractC7948f {

    /* renamed from: a */
    public static final C8304n f38231a = new C8304n();

    /* renamed from: b */
    public static final Object f38232b = new Object();

    /* renamed from: c */
    public static C7454y f38233c = null;

    /* renamed from: a */
    public static long m15122a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC7946d.m15119a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C7454y m15123b() {
        C7454y c7454y = new C7454y(21);
        f38233c = c7454y;
        f38231a.m15504j(c7454y);
        return f38233c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m15124c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.AbstractC7948f.m15124c(android.content.Context, boolean):void");
    }
}
