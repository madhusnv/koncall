package wj;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import xg.C8374a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.x */
/* loaded from: classes.dex */
public abstract class AbstractC8098x {

    /* renamed from: a */
    public static final long f38762a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f38763b = new Object();

    /* renamed from: c */
    public static C8374a f38764c;

    /* renamed from: a */
    public static void m15281a(Context context) {
        if (f38764c == null) {
            C8374a c8374a = new C8374a(context);
            f38764c = c8374a;
            synchronized (c8374a.f40035a) {
                c8374a.f40041g = true;
            }
        }
    }

    /* renamed from: b */
    public static void m15282b(Intent intent) {
        synchronized (f38763b) {
            try {
                if (f38764c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f38764c.m15545c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static ComponentName m15283c(Context context, Intent intent) {
        synchronized (f38763b) {
            try {
                m15281a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f38764c.m15543a(f38762a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
