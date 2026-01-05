package pf;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import bg.C0658c;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.g */
/* loaded from: classes.dex */
public abstract class AbstractC5907g {

    /* renamed from: b */
    public static boolean f28750b = false;

    /* renamed from: c */
    public static boolean f28751c = false;

    /* renamed from: e */
    public static final /* synthetic */ int f28753e = 0;

    /* renamed from: a */
    public static final AtomicBoolean f28749a = new AtomicBoolean();

    /* renamed from: d */
    public static final AtomicBoolean f28752d = new AtomicBoolean();

    /* renamed from: a */
    public static boolean m11517a(Context context) {
        if (!f28751c) {
            try {
                PackageInfo packageInfoM1920c = C0658c.m1928a(context).m1920c(64, "com.google.android.gms");
                C5908h.m11519a(context);
                if (packageInfoM1920c == null || C5908h.m11521d(packageInfoM1920c, false) || !C5908h.m11521d(packageInfoM1920c, true)) {
                    f28750b = false;
                } else {
                    f28750b = true;
                }
                f28751c = true;
            } catch (PackageManager.NameNotFoundException unused) {
                f28751c = true;
            } catch (Throwable th2) {
                f28751c = true;
                throw th2;
            }
        }
        return f28750b || !"user".equals(Build.TYPE);
    }

    /* renamed from: b */
    public static boolean m11518b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
