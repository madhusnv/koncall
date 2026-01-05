package ug;

import ai.AbstractC0151h;
import al.C0174b;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.v5;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import sf.AbstractC6840z;
import xh.C8380e;
import xh.C8381f;
import xh.InterfaceC8379d;
import yk.C8687a;
import zf.C8946a;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 implements u1 {

    /* renamed from: I */
    public static volatile n1 f35656I;

    /* renamed from: B */
    public long f35657B;

    /* renamed from: C */
    public volatile Boolean f35658C;

    /* renamed from: D */
    public volatile boolean f35659D;

    /* renamed from: E */
    public int f35660E;

    /* renamed from: F */
    public int f35661F;

    /* renamed from: H */
    public final long f35663H;

    /* renamed from: a */
    public final Context f35664a;

    /* renamed from: b */
    public final boolean f35665b;

    /* renamed from: c */
    public final C8687a f35666c;

    /* renamed from: d */
    public final C7436g f35667d;

    /* renamed from: e */
    public final d1 f35668e;

    /* renamed from: f */
    public final v0 f35669f;

    /* renamed from: g */
    public final m1 f35670g;

    /* renamed from: h */
    public final s3 f35671h;

    /* renamed from: j */
    public final l4 f35672j;

    /* renamed from: k */
    public final q0 f35673k;

    /* renamed from: l */
    public final C8946a f35674l;

    /* renamed from: m */
    public final b3 f35675m;

    /* renamed from: n */
    public final q2 f35676n;

    /* renamed from: p */
    public final c0 f35677p;

    /* renamed from: q */
    public final t2 f35678q;

    /* renamed from: r */
    public final String f35679r;

    /* renamed from: s */
    public p0 f35680s;

    /* renamed from: t */
    public k3 f35681t;

    /* renamed from: v */
    public C7446q f35682v;

    /* renamed from: w */
    public n0 f35683w;

    /* renamed from: x */
    public u2 f35684x;

    /* renamed from: z */
    public Boolean f35686z;

    /* renamed from: y */
    public boolean f35685y = false;

    /* renamed from: G */
    public final AtomicInteger f35662G = new AtomicInteger(0);

    public n1(b2 b2Var) {
        InterfaceC8379d c8380e;
        Context context;
        Context context2 = b2Var.f35282a;
        C8687a c8687a = new C8687a(28);
        this.f35666c = c8687a;
        z1.f36035k = c8687a;
        this.f35664a = context2;
        this.f35665b = b2Var.f35286e;
        this.f35658C = b2Var.f35283b;
        this.f35679r = b2Var.f35288g;
        this.f35659D = true;
        if (com.google.android.gms.internal.measurement.o4.f6322h == null && context2 != null) {
            Object obj = com.google.android.gms.internal.measurement.o4.f6321g;
            synchronized (obj) {
                try {
                    if (com.google.android.gms.internal.measurement.o4.f6322h == null) {
                        synchronized (obj) {
                            com.google.android.gms.internal.measurement.e4 e4Var = com.google.android.gms.internal.measurement.o4.f6322h;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (e4Var == null || e4Var.f6125a != applicationContext) {
                                if (e4Var != null) {
                                    com.google.android.gms.internal.measurement.g4.m3292c();
                                    q4.m3598a();
                                    synchronized (com.google.android.gms.internal.measurement.j4.class) {
                                        try {
                                            com.google.android.gms.internal.measurement.j4 j4Var = com.google.android.gms.internal.measurement.j4.f6249e;
                                            if (j4Var != null && (context = (Context) j4Var.f6252c) != null && ((com.google.android.gms.internal.measurement.i4) j4Var.f6253d) != null && j4Var.f6251b) {
                                                context.getContentResolver().unregisterContentObserver((com.google.android.gms.internal.measurement.i4) com.google.android.gms.internal.measurement.j4.f6249e.f6253d);
                                            }
                                            com.google.android.gms.internal.measurement.j4.f6249e = null;
                                        } finally {
                                        }
                                    }
                                }
                                v5 v5Var = new v5(applicationContext);
                                if (v5Var instanceof Serializable) {
                                    c8380e = new C8380e(v5Var);
                                } else {
                                    C8381f c8381f = new C8381f();
                                    c8381f.f40054a = v5Var;
                                    c8380e = c8381f;
                                }
                                com.google.android.gms.internal.measurement.o4.f6322h = new com.google.android.gms.internal.measurement.e4(applicationContext, c8380e);
                                com.google.android.gms.internal.measurement.o4.f6323i.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                } finally {
                }
            }
        }
        this.f35674l = C8946a.f42951a;
        Long l9 = b2Var.f35287f;
        this.f35663H = l9 != null ? l9.longValue() : System.currentTimeMillis();
        C7436g c7436g = new C7436g(this);
        c7436g.f35446d = C0174b.f536b;
        this.f35667d = c7436g;
        d1 d1Var = new d1(this);
        d1Var.m14145P();
        this.f35668e = d1Var;
        v0 v0Var = new v0(this);
        v0Var.m14145P();
        this.f35669f = v0Var;
        l4 l4Var = new l4(this);
        l4Var.m14145P();
        this.f35672j = l4Var;
        this.f35673k = new q0(new g1(b2Var, this));
        this.f35677p = new c0(this);
        b3 b3Var = new b3(this);
        b3Var.m13937O();
        this.f35675m = b3Var;
        q2 q2Var = new q2(this);
        q2Var.m13937O();
        this.f35676n = q2Var;
        s3 s3Var = new s3(this);
        s3Var.m13937O();
        this.f35671h = s3Var;
        t2 t2Var = new t2(this);
        t2Var.m14145P();
        this.f35678q = t2Var;
        m1 m1Var = new m1(this);
        m1Var.m14145P();
        this.f35670g = m1Var;
        com.google.android.gms.internal.measurement.u0 u0Var = b2Var.f35285d;
        boolean z6 = u0Var == null || u0Var.f6403b == 0;
        if (context2.getApplicationContext() instanceof Application) {
            m14084k(q2Var);
            if (((n1) q2Var.f482a).f35664a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((n1) q2Var.f482a).f35664a.getApplicationContext();
                if (q2Var.f35770c == null) {
                    q2Var.f35770c = new m2(q2Var);
                }
                if (z6) {
                    application.unregisterActivityLifecycleCallbacks(q2Var.f35770c);
                    application.registerActivityLifecycleCallbacks(q2Var.f35770c);
                    v0 v0Var2 = ((n1) q2Var.f482a).f35669f;
                    m14085m(v0Var2);
                    v0Var2.f35870p.m14140a("Registered activity lifecycle callback");
                }
            }
        } else {
            m14085m(v0Var);
            v0Var.f35865j.m14140a("Application context is not an Application");
        }
        m1Var.m14047V(new RunnableC8956c(15, this, b2Var, false));
    }

    /* renamed from: h */
    public static final void m14082h(d0 d0Var) {
        if (d0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: i */
    public static final void m14083i(AbstractC0151h abstractC0151h) {
        if (abstractC0151h == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: k */
    public static final void m14084k(h0 h0Var) {
        if (h0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!h0Var.f35458b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(h0Var.getClass())));
        }
    }

    /* renamed from: m */
    public static final void m14085m(t1 t1Var) {
        if (t1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!t1Var.f35835b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(t1Var.getClass())));
        }
    }

    /* renamed from: s */
    public static n1 m14086s(Context context, com.google.android.gms.internal.measurement.u0 u0Var, Long l9) {
        Bundle bundle;
        if (u0Var != null) {
            Bundle bundle2 = u0Var.f6405d;
            u0Var = new com.google.android.gms.internal.measurement.u0(u0Var.f6402a, u0Var.f6403b, u0Var.f6404c, bundle2, null);
        }
        AbstractC6840z.m13036g(context);
        AbstractC6840z.m13036g(context.getApplicationContext());
        if (f35656I == null) {
            synchronized (n1.class) {
                try {
                    if (f35656I == null) {
                        f35656I = new n1(new b2(context, u0Var, l9));
                    }
                } finally {
                }
            }
        } else if (u0Var != null && (bundle = u0Var.f6405d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC6840z.m13036g(f35656I);
            f35656I.f35658C = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC6840z.m13036g(f35656I);
        return f35656I;
    }

    @Override // ug.u1
    /* renamed from: a */
    public final v0 mo326a() {
        v0 v0Var = this.f35669f;
        m14085m(v0Var);
        return v0Var;
    }

    @Override // ug.u1
    /* renamed from: b */
    public final m1 mo327b() {
        m1 m1Var = this.f35670g;
        m14085m(m1Var);
        return m1Var;
    }

    @Override // ug.u1
    /* renamed from: c */
    public final C8687a mo328c() {
        return this.f35666c;
    }

    /* renamed from: d */
    public final boolean m14087d() {
        return m14088e() == 0;
    }

    /* renamed from: e */
    public final int m14088e() {
        m1 m1Var = this.f35670g;
        m14085m(m1Var);
        m1Var.mo325M();
        C7436g c7436g = this.f35667d;
        if (c7436g.m13892Z()) {
            return 1;
        }
        m14085m(m1Var);
        m1Var.mo325M();
        if (!this.f35659D) {
            return 8;
        }
        d1 d1Var = this.f35668e;
        m14083i(d1Var);
        d1Var.mo325M();
        Boolean boolValueOf = d1Var.m13861Q().contains("measurement_enabled") ? Boolean.valueOf(d1Var.m13861Q().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        C8687a c8687a = ((n1) c7436g.f482a).f35666c;
        Boolean boolM13891Y = c7436g.m13891Y("firebase_analytics_collection_enabled");
        return boolM13891Y != null ? boolM13891Y.booleanValue() ? 0 : 4 : (this.f35658C == null || this.f35658C.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m14089f() {
        /*
            r6 = this;
            boolean r0 = r6.f35685y
            if (r0 == 0) goto L96
            ug.m1 r0 = r6.f35670g
            m14085m(r0)
            r0.mo325M()
            java.lang.Boolean r0 = r6.f35686z
            zf.a r1 = r6.f35674l
            if (r0 == 0) goto L34
            long r2 = r6.f35657B
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f35657B
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f35657B = r0
            ug.l4 r0 = r6.f35672j
            m14083i(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.k0(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.k0(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f35664a
            bg.b r3 = bg.C0658c.m1928a(r1)
            boolean r3 = r3.m1921d()
            r4 = 1
            if (r3 != 0) goto L74
            ug.g r3 = r6.f35667d
            boolean r3 = r3.m13882P()
            if (r3 != 0) goto L74
            boolean r3 = ug.l4.D0(r1)
            if (r3 == 0) goto L75
            boolean r1 = ug.l4.f0(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f35686z = r1
            if (r2 == 0) goto L8f
            ug.n0 r1 = r6.m14095r()
            java.lang.String r1 = r1.m14081T()
            boolean r0 = r0.m14029Q(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f35686z = r0
        L8f:
            java.lang.Boolean r0 = r6.f35686z
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.n1.m14089f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14090g(int r20, java.lang.Throwable r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.n1.m14090g(int, java.lang.Throwable, byte[]):void");
    }

    @Override // ug.u1
    /* renamed from: j */
    public final Context mo333j() {
        return this.f35664a;
    }

    @Override // ug.u1
    /* renamed from: l */
    public final C8946a mo334l() {
        return this.f35674l;
    }

    /* renamed from: n */
    public final q0 m14091n() {
        return this.f35673k;
    }

    /* renamed from: o */
    public final p0 m14092o() {
        m14084k(this.f35680s);
        return this.f35680s;
    }

    /* renamed from: p */
    public final k3 m14093p() {
        m14084k(this.f35681t);
        return this.f35681t;
    }

    /* renamed from: q */
    public final C7446q m14094q() {
        m14085m(this.f35682v);
        return this.f35682v;
    }

    /* renamed from: r */
    public final n0 m14095r() {
        m14084k(this.f35683w);
        return this.f35683w;
    }
}
