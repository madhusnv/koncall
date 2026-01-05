package p001o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C10773c;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.mt6;

/* loaded from: classes5.dex */
public final class wp {

    /* renamed from: a */
    public static final wp f52417a = new wp();

    /* renamed from: b */
    public static final String f52418b;

    /* renamed from: c */
    public static final ScheduledExecutorService f52419c;

    /* renamed from: d */
    public static final ScheduledExecutorService f52420d;

    /* renamed from: e */
    public static volatile ScheduledFuture f52421e;

    /* renamed from: f */
    public static final Object f52422f;

    /* renamed from: g */
    public static final AtomicInteger f52423g;

    /* renamed from: h */
    public static volatile hhf f52424h;

    /* renamed from: i */
    public static final AtomicBoolean f52425i;

    /* renamed from: j */
    public static String f52426j;

    /* renamed from: k */
    public static long f52427k;

    /* renamed from: l */
    public static int f52428l;

    /* renamed from: m */
    public static WeakReference f52429m;

    /* renamed from: n */
    public static String f52430n;

    /* renamed from: o.wp$a */
    public static final class C17943a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            sja.f45482e.m48387b(bka.APP_EVENTS, wp.f52418b, "onActivityCreated");
            gl0.m28967a();
            wp.m54770q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            sq8.m48649h(activity, "activity");
            sja.f45482e.m48387b(bka.APP_EVENTS, wp.f52418b, "onActivityDestroyed");
            wp.f52417a.m54780s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            sq8.m48649h(activity, "activity");
            sja.f45482e.m48387b(bka.APP_EVENTS, wp.f52418b, "onActivityPaused");
            gl0.m28967a();
            wp.f52417a.m54781t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            sq8.m48649h(activity, "activity");
            sja.f45482e.m48387b(bka.APP_EVENTS, wp.f52418b, "onActivityResumed");
            gl0.m28967a();
            wp.m54774w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            sq8.m48649h(activity, "activity");
            sq8.m48649h(bundle, "outState");
            sja.f45482e.m48387b(bka.APP_EVENTS, wp.f52418b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            sq8.m48649h(activity, "activity");
            wp.f52428l++;
            sja.f45482e.m48387b(bka.APP_EVENTS, wp.f52418b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            sq8.m48649h(activity, "activity");
            sja.f45482e.m48387b(bka.APP_EVENTS, wp.f52418b, "onActivityStopped");
            nl0.f36985b.m40740g();
            wp.f52428l--;
        }
    }

    static {
        String canonicalName = wp.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f52418b = canonicalName;
        f52419c = Executors.newSingleThreadScheduledExecutor();
        f52420d = Executors.newSingleThreadScheduledExecutor();
        f52422f = new Object();
        f52423g = new AtomicInteger(0);
        f52425i = new AtomicBoolean(false);
    }

    /* renamed from: A */
    public static final void m54755A(boolean z) {
        if (z) {
            uf3.m51520f();
        } else {
            uf3.m51519e();
        }
    }

    /* renamed from: m */
    public static final Activity m54767m() {
        WeakReference weakReference = f52429m;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: n */
    public static final UUID m54768n() {
        hhf hhfVar;
        if (f52424h == null || (hhfVar = f52424h) == null) {
            return null;
        }
        return hhfVar.m30592d();
    }

    /* renamed from: p */
    public static final boolean m54769p() {
        return f52428l == 0;
    }

    /* renamed from: q */
    public static final void m54770q(Activity activity) {
        f52419c.execute(new Runnable() { // from class: o.up
            @Override // java.lang.Runnable
            public final void run() {
                wp.m54771r();
            }
        });
    }

    /* renamed from: r */
    public static final void m54771r() {
        if (f52424h == null) {
            f52424h = hhf.f26995g.m30603b();
        }
    }

    /* renamed from: u */
    public static final void m54772u(final long j, final String str) {
        sq8.m48649h(str, "$activityName");
        if (f52424h == null) {
            f52424h = new hhf(Long.valueOf(j), null, null, 4, null);
        }
        hhf hhfVar = f52424h;
        if (hhfVar != null) {
            hhfVar.m30599k(Long.valueOf(j));
        }
        if (f52423g.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: o.vp
                @Override // java.lang.Runnable
                public final void run() {
                    wp.m54773v(j, str);
                }
            };
            synchronized (f52422f) {
                f52421e = f52419c.schedule(runnable, f52417a.m54779o(), TimeUnit.SECONDS);
                y3i y3iVar = y3i.f54824a;
            }
        }
        long j2 = f52427k;
        u61.m50979i(str, j2 > 0 ? (j - j2) / 1000 : 0L);
        hhf hhfVar2 = f52424h;
        if (hhfVar2 != null) {
            hhfVar2.m30601m();
        }
    }

    /* renamed from: v */
    public static final void m54773v(long j, String str) {
        sq8.m48649h(str, "$activityName");
        if (f52424h == null) {
            f52424h = new hhf(Long.valueOf(j), null, null, 4, null);
        }
        if (f52423g.get() <= 0) {
            ihf.m32155d(str, f52424h, f52426j);
            hhf.f26995g.m30602a();
            f52424h = null;
        }
        synchronized (f52422f) {
            f52421e = null;
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: w */
    public static final void m54774w(Activity activity) {
        sq8.m48649h(activity, "activity");
        f52429m = new WeakReference(activity);
        f52423g.incrementAndGet();
        f52417a.m54778l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f52427k = jCurrentTimeMillis;
        final String strM21673u = cri.m21673u(activity);
        uf3.m51525l(activity);
        ldb.m36978d(activity);
        bcg.m18622h(activity);
        String str = f52430n;
        boolean z = false;
        if (str != null && f9g.m26306P(str, "ProxyBillingActivity", false, 2, null)) {
            z = true;
        }
        if (z && !sq8.m48644c(strM21673u, "ProxyBillingActivity")) {
            f52420d.execute(new Runnable() { // from class: o.sp
                @Override // java.lang.Runnable
                public final void run() {
                    wp.m54775x();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        f52419c.execute(new Runnable() { // from class: o.tp
            @Override // java.lang.Runnable
            public final void run() {
                wp.m54776y(jCurrentTimeMillis, strM21673u, applicationContext);
            }
        });
        f52430n = strM21673u;
    }

    /* renamed from: x */
    public static final void m54775x() {
        ih8.m32137h();
    }

    /* renamed from: y */
    public static final void m54776y(long j, String str, Context context) {
        hhf hhfVar;
        sq8.m48649h(str, "$activityName");
        hhf hhfVar2 = f52424h;
        Long lM30593e = hhfVar2 != null ? hhfVar2.m30593e() : null;
        if (f52424h == null) {
            f52424h = new hhf(Long.valueOf(j), null, null, 4, null);
            String str2 = f52426j;
            sq8.m48648g(context, "appContext");
            ihf.m32154b(str, null, str2, context);
        } else if (lM30593e != null) {
            long jLongValue = j - lM30593e.longValue();
            if (jLongValue > f52417a.m54779o() * 1000) {
                ihf.m32155d(str, f52424h, f52426j);
                String str3 = f52426j;
                sq8.m48648g(context, "appContext");
                ihf.m32154b(str, null, str3, context);
                f52424h = new hhf(Long.valueOf(j), null, null, 4, null);
            } else if (jLongValue > 1000 && (hhfVar = f52424h) != null) {
                hhfVar.m30596h();
            }
        }
        hhf hhfVar3 = f52424h;
        if (hhfVar3 != null) {
            hhfVar3.m30599k(Long.valueOf(j));
        }
        hhf hhfVar4 = f52424h;
        if (hhfVar4 != null) {
            hhfVar4.m30601m();
        }
    }

    /* renamed from: z */
    public static final void m54777z(Application application, String str) {
        sq8.m48649h(application, "application");
        if (f52425i.compareAndSet(false, true)) {
            mt6.m39645a(mt6.EnumC15426c.CodelessEvents, new mt6.InterfaceC15425b() { // from class: o.qp
                @Override // p001o.mt6.InterfaceC15425b
                /* renamed from: a */
                public final void mo17402a(boolean z) {
                    wp.m54755A(z);
                }
            });
            f52426j = str;
            application.registerActivityLifecycleCallbacks(new C17943a());
        }
    }

    /* renamed from: l */
    public final void m54778l() {
        ScheduledFuture scheduledFuture;
        synchronized (f52422f) {
            if (f52421e != null && (scheduledFuture = f52421e) != null) {
                scheduledFuture.cancel(false);
            }
            f52421e = null;
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: o */
    public final int m54779o() {
        tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
        return tt6VarM56796f == null ? rt3.m47141a() : tt6VarM56796f.m50555v();
    }

    /* renamed from: s */
    public final void m54780s(Activity activity) {
        uf3.m51523j(activity);
    }

    /* renamed from: t */
    public final void m54781t(Activity activity) {
        AtomicInteger atomicInteger = f52423g;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        m54778l();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strM21673u = cri.m21673u(activity);
        uf3.m51524k(activity);
        f52419c.execute(new Runnable() { // from class: o.rp
            @Override // java.lang.Runnable
            public final void run() {
                wp.m54772u(jCurrentTimeMillis, strM21673u);
            }
        });
    }
}
