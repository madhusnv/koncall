package yf;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import bg.C0658c;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import sf.AbstractC6840z;
import sf.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yf.a */
/* loaded from: classes.dex */
public final class C8643a {

    /* renamed from: b */
    public static final Object f41927b = new Object();

    /* renamed from: c */
    public static volatile C8643a f41928c;

    /* renamed from: a */
    public final ConcurrentHashMap f41929a = new ConcurrentHashMap();

    /* renamed from: b */
    public static C8643a m15964b() {
        if (f41928c == null) {
            synchronized (f41927b) {
                try {
                    if (f41928c == null) {
                        f41928c = new C8643a();
                    }
                } finally {
                }
            }
        }
        C8643a c8643a = f41928c;
        AbstractC6840z.m13036g(c8643a);
        return c8643a;
    }

    /* renamed from: a */
    public final boolean m15965a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return m15967d(context, context.getClass().getName(), intent, serviceConnection, i10, null);
    }

    /* renamed from: c */
    public final void m15966c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof i0)) {
            ConcurrentHashMap concurrentHashMap = this.f41929a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* renamed from: d */
    public final boolean m15967d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C0658c.m1928a(context).m1919b(0, packageName).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof i0) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f41929a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
