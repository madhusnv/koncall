package wj;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import s1.u0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.w */
/* loaded from: classes.dex */
public final class RunnableC8097w implements Runnable {

    /* renamed from: f */
    public static final Object f38754f = new Object();

    /* renamed from: g */
    public static Boolean f38755g;

    /* renamed from: h */
    public static Boolean f38756h;

    /* renamed from: a */
    public final Context f38757a;

    /* renamed from: b */
    public final u0 f38758b;

    /* renamed from: c */
    public final PowerManager.WakeLock f38759c;

    /* renamed from: d */
    public final C8095u f38760d;

    /* renamed from: e */
    public final long f38761e;

    public RunnableC8097w(C8095u c8095u, Context context, u0 u0Var, long j6) {
        this.f38760d = c8095u;
        this.f38757a = context;
        this.f38761e = j6;
        this.f38758b = u0Var;
        this.f38759c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: a */
    public static boolean m15278a(Context context) {
        boolean zBooleanValue;
        synchronized (f38754f) {
            try {
                Boolean bool = f38756h;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f38756h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* renamed from: b */
    public static boolean m15279b(Context context) {
        boolean zBooleanValue;
        synchronized (f38754f) {
            try {
                Boolean bool = f38755g;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f38755g = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m15280c() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f38757a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.RunnableC8097w.m15280c():boolean");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        C8095u c8095u = this.f38760d;
        Context context = this.f38757a;
        boolean zM15279b = m15279b(context);
        PowerManager.WakeLock wakeLock = this.f38759c;
        if (zM15279b) {
            wakeLock.acquire(AbstractC8080f.f38696a);
        }
        try {
            try {
                try {
                    c8095u.m15275d(true);
                    if (!this.f38758b.m12864d()) {
                        c8095u.m15275d(false);
                        if (m15279b(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!m15278a(context) || m15280c()) {
                        if (c8095u.m15276e()) {
                            c8095u.m15275d(false);
                        } else {
                            c8095u.m15277f(this.f38761e);
                        }
                        if (m15279b(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    C8096v c8096v = new C8096v();
                    c8096v.f38753a = this;
                    Log.isLoggable("FirebaseMessaging", 3);
                    context.registerReceiver(c8096v, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (m15279b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e2) {
                e2.getMessage();
                c8095u.m15275d(false);
                if (m15279b(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (m15279b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}
