package xg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import bg.C0658c;
import bk.RunnableC0683n;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import qg.C6213a;
import r5.AbstractC6468c;
import sf.AbstractC6840z;
import zf.AbstractC8949d;
import zf.AbstractC8950e;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xg.a */
/* loaded from: classes.dex */
public final class C8374a {

    /* renamed from: n */
    public static final long f40032n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o */
    public static volatile ScheduledExecutorService f40033o = null;

    /* renamed from: p */
    public static final Object f40034p = new Object();

    /* renamed from: a */
    public final Object f40035a;

    /* renamed from: b */
    public final PowerManager.WakeLock f40036b;

    /* renamed from: c */
    public int f40037c;

    /* renamed from: d */
    public ScheduledFuture f40038d;

    /* renamed from: e */
    public long f40039e;

    /* renamed from: f */
    public final HashSet f40040f;

    /* renamed from: g */
    public boolean f40041g;

    /* renamed from: h */
    public C6213a f40042h;

    /* renamed from: i */
    public final C8946a f40043i;

    /* renamed from: j */
    public final String f40044j;

    /* renamed from: k */
    public final HashMap f40045k;

    /* renamed from: l */
    public final AtomicInteger f40046l;

    /* renamed from: m */
    public final ScheduledExecutorService f40047m;

    public C8374a(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f40035a = new Object();
        this.f40037c = 0;
        this.f40040f = new HashSet();
        this.f40041g = true;
        this.f40043i = C8946a.f42951a;
        this.f40045k = new HashMap();
        this.f40046l = new AtomicInteger(0);
        AbstractC6840z.m13034e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f40042h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f40044j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f40044j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f40036b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = AbstractC8950e.f42962a;
        synchronized (AbstractC8950e.class) {
            Boolean bool = AbstractC8950e.f42964c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = AbstractC6468c.m12450a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                AbstractC8950e.f42964c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i10 = AbstractC8949d.f42961a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoM1919b = C0658c.m1928a(context).m1919b(0, packageName);
                    if (applicationInfoM1919b == null) {
                        "Could not get applicationInfo from package: ".concat(packageName);
                    } else {
                        int i11 = applicationInfoM1919b.uid;
                        workSource = new WorkSource();
                        Method method2 = AbstractC8950e.f42963b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i11), packageName);
                            } catch (Exception e2) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                            }
                        } else {
                            Method method3 = AbstractC8950e.f42962a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i11));
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    "Could not find package: ".concat(packageName);
                }
            }
            if (workSource != null) {
                try {
                    this.f40036b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f40033o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f40034p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f40033o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f40033o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f40047m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* renamed from: a */
    public final void m15543a(long j6) {
        this.f40046l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f40032n), 1L);
        if (j6 > 0) {
            jMax = Math.min(j6, jMax);
        }
        synchronized (this.f40035a) {
            try {
                if (!m15544b()) {
                    this.f40042h = C6213a.f30199a;
                    this.f40036b.acquire();
                    this.f40043i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f40037c++;
                if (this.f40041g) {
                    TextUtils.isEmpty(null);
                }
                C8375b c8375b = (C8375b) this.f40045k.get(null);
                if (c8375b == null) {
                    c8375b = new C8375b();
                    this.f40045k.put(null, c8375b);
                }
                c8375b.f40048a++;
                this.f40043i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j10 > this.f40039e) {
                    this.f40039e = j10;
                    ScheduledFuture scheduledFuture = this.f40038d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f40038d = this.f40047m.schedule(new RunnableC0683n(23, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final boolean m15544b() {
        boolean z6;
        synchronized (this.f40035a) {
            z6 = this.f40037c > 0;
        }
        return z6;
    }

    /* renamed from: c */
    public final void m15545c() {
        if (this.f40046l.decrementAndGet() < 0) {
            String.valueOf(this.f40044j).concat(" release without a matched acquire!");
        }
        synchronized (this.f40035a) {
            try {
                if (this.f40041g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f40045k.containsKey(null)) {
                    C8375b c8375b = (C8375b) this.f40045k.get(null);
                    if (c8375b != null) {
                        int i10 = c8375b.f40048a - 1;
                        c8375b.f40048a = i10;
                        if (i10 == 0) {
                            this.f40045k.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f40044j).concat(" counter does not exist");
                }
                m15547e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m15546d() {
        HashSet hashSet = this.f40040f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* renamed from: e */
    public final void m15547e() {
        synchronized (this.f40035a) {
            try {
                if (m15544b()) {
                    if (this.f40041g) {
                        int i10 = this.f40037c - 1;
                        this.f40037c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f40037c = 0;
                    }
                    m15546d();
                    Iterator it = this.f40045k.values().iterator();
                    while (it.hasNext()) {
                        ((C8375b) it.next()).f40048a = 0;
                    }
                    this.f40045k.clear();
                    ScheduledFuture scheduledFuture = this.f40038d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f40038d = null;
                        this.f40039e = 0L;
                    }
                    if (this.f40036b.isHeld()) {
                        try {
                            try {
                                this.f40036b.release();
                                if (this.f40042h != null) {
                                    this.f40042h = null;
                                }
                            } catch (RuntimeException e2) {
                                if (!e2.getClass().equals(RuntimeException.class)) {
                                    throw e2;
                                }
                                String.valueOf(this.f40044j).concat(" failed to release!");
                                if (this.f40042h != null) {
                                    this.f40042h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f40042h != null) {
                                this.f40042h = null;
                            }
                            throw th2;
                        }
                    } else {
                        String.valueOf(this.f40044j).concat(" should be held!");
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
