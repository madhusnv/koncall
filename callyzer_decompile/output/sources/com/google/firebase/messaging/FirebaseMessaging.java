package com.google.firebase.messaging;

import a1.C0004c;
import a1.C0013l;
import a9.C0073l;
import ag.ThreadFactoryC0141a;
import ak.C0169h;
import al.C0182j;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import b9.AbstractC0630b;
import com.google.firebase.messaging.FirebaseMessaging;
import e1.C1903e;
import h6.ExecutorC2852h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ji.C3773g;
import ni.InterfaceC5073b;
import nj.InterfaceC5077c;
import of.C5347b;
import of.C5349d;
import of.C5358m;
import of.C5359n;
import of.ExecutorC5353h;
import p020v.x0;
import pg.l8;
import pg.v6;
import pg.w6;
import qj.InterfaceC6237b;
import rj.InterfaceC6558d;
import s1.u0;
import sf.AbstractC6840z;
import uf.C7427b;
import ug.a3;
import ug.m2;
import wj.C8083i;
import wj.C8085k;
import wj.C8091q;
import wj.C8095u;
import yg.C8656m;
import yg.InterfaceC8648e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: k */
    public static C7427b f7158k;

    /* renamed from: m */
    public static ScheduledThreadPoolExecutor f7160m;

    /* renamed from: a */
    public final C3773g f7161a;

    /* renamed from: b */
    public final Context f7162b;

    /* renamed from: c */
    public final x0 f7163c;

    /* renamed from: d */
    public final C8083i f7164d;

    /* renamed from: e */
    public final C0182j f7165e;

    /* renamed from: f */
    public final ScheduledThreadPoolExecutor f7166f;

    /* renamed from: g */
    public final ThreadPoolExecutor f7167g;

    /* renamed from: h */
    public final u0 f7168h;

    /* renamed from: i */
    public boolean f7169i;

    /* renamed from: j */
    public static final long f7157j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l */
    public static InterfaceC6237b f7159l = new C0169h(7);

    public FirebaseMessaging(C3773g c3773g, InterfaceC6237b interfaceC6237b, InterfaceC6237b interfaceC6237b2, InterfaceC6558d interfaceC6558d, InterfaceC6237b interfaceC6237b3, InterfaceC5077c interfaceC5077c) {
        c3773g.m8293a();
        Context context = c3773g.f19662a;
        final u0 u0Var = new u0();
        final int i10 = 0;
        u0Var.f32144b = 0;
        u0Var.f32145c = context;
        final x0 x0Var = new x0(c3773g, u0Var, interfaceC6237b, interfaceC6237b2, interfaceC6558d);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0141a("Firebase-Messaging-Task"));
        final int i11 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0141a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0141a("Firebase-Messaging-File-Io"));
        this.f7169i = false;
        f7159l = interfaceC6237b3;
        this.f7161a = c3773g;
        C0182j c0182j = new C0182j();
        c0182j.f557d = this;
        c0182j.f555b = interfaceC5077c;
        this.f7165e = c0182j;
        c3773g.m8293a();
        final Context context2 = c3773g.f19662a;
        this.f7162b = context2;
        m2 m2Var = new m2();
        this.f7168h = u0Var;
        this.f7163c = x0Var;
        this.f7164d = new C8083i(executorServiceNewSingleThreadExecutor);
        this.f7166f = scheduledThreadPoolExecutor;
        this.f7167g = threadPoolExecutor;
        c3773g.m8293a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(m2Var);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: wj.j

            /* renamed from: b */
            public final /* synthetic */ FirebaseMessaging f38710b;

            {
                this.f38710b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8656m c8656mM11764e;
                int i12;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f38710b;
                        if (firebaseMessaging.f7165e.m417h() && firebaseMessaging.m4485h(firebaseMessaging.m4481d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f7169i) {
                                    firebaseMessaging.m4484g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f38710b;
                        final Context context3 = firebaseMessaging2.f7162b;
                        AbstractC0630b.m1794c(context3);
                        x0 x0Var2 = firebaseMessaging2.f7163c;
                        final boolean zM4483f = firebaseMessaging2.m4483f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesM11907a = w6.m11907a(context3);
                            if (!sharedPreferencesM11907a.contains("proxy_retention") || sharedPreferencesM11907a.getBoolean("proxy_retention", false) != zM4483f) {
                                C5347b c5347b = (C5347b) x0Var2.f36756d;
                                if (c5347b.f26267c.m2751u() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zM4483f);
                                    C5359n c5359nM10484J = C5359n.m10484J(c5347b.f26266b);
                                    synchronized (c5359nM10484J) {
                                        i12 = c5359nM10484J.f26303a;
                                        c5359nM10484J.f26303a = i12 + 1;
                                    }
                                    c8656mM11764e = c5359nM10484J.m10495K(new C5358m(i12, 4, bundle, 0));
                                } else {
                                    c8656mM11764e = l8.m11764e(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c8656mM11764e.m15979f(new ExecutorC2852h(0), new InterfaceC8648e() { // from class: wj.n
                                    @Override // yg.InterfaceC8648e
                                    /* renamed from: g */
                                    public final void mo27g(Object obj) {
                                        SharedPreferences.Editor editorEdit = w6.m11907a(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zM4483f);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.m4483f()) {
                            firebaseMessaging2.m4482e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0141a("Firebase-Messaging-Topics-Io"));
        int i12 = C8095u.f38744j;
        l8.m11762c(scheduledThreadPoolExecutor2, new Callable() { // from class: wj.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C8093s c8093s;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                u0 u0Var2 = u0Var;
                x0 x0Var2 = x0Var;
                synchronized (C8093s.class) {
                    try {
                        WeakReference weakReference = C8093s.f38736b;
                        c8093s = weakReference != null ? (C8093s) weakReference.get() : null;
                        if (c8093s == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            C8093s c8093s2 = new C8093s();
                            synchronized (c8093s2) {
                                c8093s2.f38737a = C0073l.m191q(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            C8093s.f38736b = new WeakReference(c8093s2);
                            c8093s = c8093s2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new C8095u(firebaseMessaging, u0Var2, c8093s, x0Var2, context3, scheduledThreadPoolExecutor3);
            }
        }).m15979f(scheduledThreadPoolExecutor, new C8085k(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: wj.j

            /* renamed from: b */
            public final /* synthetic */ FirebaseMessaging f38710b;

            {
                this.f38710b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8656m c8656mM11764e;
                int i122;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f38710b;
                        if (firebaseMessaging.f7165e.m417h() && firebaseMessaging.m4485h(firebaseMessaging.m4481d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f7169i) {
                                    firebaseMessaging.m4484g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f38710b;
                        final Context context3 = firebaseMessaging2.f7162b;
                        AbstractC0630b.m1794c(context3);
                        x0 x0Var2 = firebaseMessaging2.f7163c;
                        final boolean zM4483f = firebaseMessaging2.m4483f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesM11907a = w6.m11907a(context3);
                            if (!sharedPreferencesM11907a.contains("proxy_retention") || sharedPreferencesM11907a.getBoolean("proxy_retention", false) != zM4483f) {
                                C5347b c5347b = (C5347b) x0Var2.f36756d;
                                if (c5347b.f26267c.m2751u() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zM4483f);
                                    C5359n c5359nM10484J = C5359n.m10484J(c5347b.f26266b);
                                    synchronized (c5359nM10484J) {
                                        i122 = c5359nM10484J.f26303a;
                                        c5359nM10484J.f26303a = i122 + 1;
                                    }
                                    c8656mM11764e = c5359nM10484J.m10495K(new C5358m(i122, 4, bundle, 0));
                                } else {
                                    c8656mM11764e = l8.m11764e(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c8656mM11764e.m15979f(new ExecutorC2852h(0), new InterfaceC8648e() { // from class: wj.n
                                    @Override // yg.InterfaceC8648e
                                    /* renamed from: g */
                                    public final void mo27g(Object obj) {
                                        SharedPreferences.Editor editorEdit = w6.m11907a(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zM4483f);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.m4483f()) {
                            firebaseMessaging2.m4482e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* renamed from: b */
    public static void m4478b(long j6, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f7160m == null) {
                    f7160m = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0141a("TAG"));
                }
                f7160m.schedule(runnable, j6, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static synchronized C7427b m4479c(Context context) {
        try {
            if (f7158k == null) {
                f7158k = new C7427b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f7158k;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C3773g c3773g) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c3773g.m8294b(FirebaseMessaging.class);
        AbstractC6840z.m13037h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* renamed from: a */
    public final String m4480a() throws IOException {
        C8656m c8656mM15981h;
        C8091q c8091qM4481d = m4481d();
        if (!m4485h(c8091qM4481d)) {
            return c8091qM4481d.f38729a;
        }
        String strM12861c = u0.m12861c(this.f7161a);
        C8083i c8083i = this.f7164d;
        synchronized (c8083i) {
            c8656mM15981h = (C8656m) ((C1903e) c8083i.f38708b).get(strM12861c);
            if (c8656mM15981h != null) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                Log.isLoggable("FirebaseMessaging", 3);
                x0 x0Var = this.f7163c;
                c8656mM15981h = x0Var.m14485o(x0Var.m14477M(u0.m12861c((C3773g) x0Var.f36754b), "*", new Bundle())).m15986m(this.f7167g, new C0013l(13, this, strM12861c, c8091qM4481d)).m15981h((Executor) c8083i.f38707a, new C0004c(22, c8083i, strM12861c));
                ((C1903e) c8083i.f38708b).put(strM12861c, c8656mM15981h);
            }
        }
        try {
            return (String) l8.m11760a(c8656mM15981h);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: d */
    public final C8091q m4481d() {
        C8091q c8091qM15270a;
        C7427b c7427bM4479c = m4479c(this.f7162b);
        C3773g c3773g = this.f7161a;
        c3773g.m8293a();
        String strM8295d = "[DEFAULT]".equals(c3773g.f19663b) ? "" : c3773g.m8295d();
        String strM12861c = u0.m12861c(this.f7161a);
        synchronized (c7427bM4479c) {
            c8091qM15270a = C8091q.m15270a(((SharedPreferences) c7427bM4479c.f35231b).getString(strM8295d + "|T|" + strM12861c + "|*", null));
        }
        return c8091qM15270a;
    }

    /* renamed from: e */
    public final void m4482e() {
        C8656m c8656mM11764e;
        int i10;
        C5347b c5347b = (C5347b) this.f7163c.f36756d;
        if (c5347b.f26267c.m2751u() >= 241100000) {
            C5359n c5359nM10484J = C5359n.m10484J(c5347b.f26266b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c5359nM10484J) {
                i10 = c5359nM10484J.f26303a;
                c5359nM10484J.f26303a = i10 + 1;
            }
            c8656mM11764e = c5359nM10484J.m10495K(new C5358m(i10, 5, bundle, 1)).m15980g(ExecutorC5353h.f26280c, C5349d.f26274c);
        } else {
            c8656mM11764e = l8.m11764e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        c8656mM11764e.m15979f(this.f7166f, new C8085k(this, 1));
    }

    /* renamed from: f */
    public final boolean m4483f() {
        Context context = this.f7162b;
        AbstractC0630b.m1794c(context);
        if (!AbstractC0630b.m1795d(context)) {
            return false;
        }
        if (this.f7161a.m8294b(InterfaceC5073b.class) != null) {
            return true;
        }
        return v6.m11893a() && f7159l != null;
    }

    /* renamed from: g */
    public final synchronized void m4484g(long j6) {
        m4478b(j6, new a3(this, Math.min(Math.max(30L, 2 * j6), f7157j)));
        this.f7169i = true;
    }

    /* renamed from: h */
    public final boolean m4485h(C8091q c8091q) {
        if (c8091q != null) {
            return System.currentTimeMillis() > c8091q.f38731c + C8091q.f38727d || !this.f7168h.m12863b().equals(c8091q.f38730b);
        }
        return true;
    }
}
