package ug;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import dj.RunnableC1730c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import of.RunnableC5354i;
import pf.C5906f;
import sf.AbstractC6840z;
import yf.C8643a;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k3 extends h0 {

    /* renamed from: c */
    public final j3 f35569c;

    /* renamed from: d */
    public i0 f35570d;

    /* renamed from: e */
    public volatile Boolean f35571e;

    /* renamed from: f */
    public final h3 f35572f;

    /* renamed from: g */
    public ScheduledExecutorService f35573g;

    /* renamed from: h */
    public final k1.j2 f35574h;

    /* renamed from: j */
    public final ArrayList f35575j;

    /* renamed from: k */
    public final h3 f35576k;

    public k3(n1 n1Var) {
        super(n1Var);
        this.f35575j = new ArrayList();
        this.f35574h = new k1.j2(n1Var.f35674l);
        this.f35569c = new j3(this);
        this.f35572f = new h3(this, n1Var, 0);
        this.f35576k = new h3(this, n1Var, 1);
    }

    @Override // ug.h0
    /* renamed from: P */
    public final boolean mo13839P() {
        return false;
    }

    /* renamed from: Q */
    public final void m14017Q(AtomicReference atomicReference) {
        mo325M();
        m13936N();
        a0(new RunnableC1730c(this, atomicReference, c0(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14018R(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.mo325M()
            r7.m13936N()
            ug.s r4 = new ug.s
            r4.<init>(r8)
            r7.m14025Y()
            java.lang.Object r0 = r7.f482a
            ug.n1 r0 = (ug.n1) r0
            ug.g r1 = r0.f35667d
            r2 = 0
            ug.e0 r3 = ug.f0.f44801b1
            boolean r1 = r1.m13889W(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            ug.p0 r0 = r0.m14092o()
            java.lang.Object r1 = r0.f482a
            ug.n1 r1 = (ug.n1) r1
            ug.l4 r3 = r1.f35672j
            ug.v0 r1 = r1.f35669f
            ug.n1.m14083i(r3)
            byte[] r3 = ug.l4.r0(r4)
            if (r3 != 0) goto L3f
            ug.n1.m14085m(r1)
            ug.t0 r0 = r1.f35863g
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.m14140a(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            ug.n1.m14085m(r1)
            ug.t0 r0 = r1.f35863g
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.m14140a(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.m14109T(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            ug.n4 r2 = r7.c0(r2)
            ug.f2 r0 = new ug.f2
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.k3.m14018R(android.os.Bundle):void");
    }

    /* renamed from: S */
    public final void m14019S() {
        mo325M();
        m13936N();
        if (d0()) {
            return;
        }
        if (m14020T()) {
            j3 j3Var = this.f35569c;
            k3 k3Var = j3Var.f35547c;
            k3Var.mo325M();
            Context context = ((n1) k3Var.f482a).f35664a;
            synchronized (j3Var) {
                try {
                    if (j3Var.f35545a) {
                        v0 v0Var = ((n1) j3Var.f35547c.f482a).f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35870p.m14140a("Connection attempt already in progress");
                        return;
                    } else {
                        if (j3Var.f35546b != null && (j3Var.f35546b.m12997c() || j3Var.f35546b.m13001g())) {
                            v0 v0Var2 = ((n1) j3Var.f35547c.f482a).f35669f;
                            n1.m14085m(v0Var2);
                            v0Var2.f35870p.m14140a("Already awaiting connection attempt");
                            return;
                        }
                        j3Var.f35546b = new r0(context, Looper.getMainLooper(), sf.k0.m13017a(context), C5906f.f28748b, 93, j3Var, j3Var, null);
                        v0 v0Var3 = ((n1) j3Var.f35547c.f482a).f35669f;
                        n1.m14085m(v0Var3);
                        v0Var3.f35870p.m14140a("Connecting to remote service");
                        j3Var.f35545a = true;
                        AbstractC6840z.m13036g(j3Var.f35546b);
                        j3Var.f35546b.m13006n();
                        return;
                    }
                } finally {
                }
            }
        }
        n1 n1Var = (n1) this.f482a;
        if (n1Var.f35667d.m13882P()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = n1Var.f35664a.getPackageManager().queryIntentServices(new Intent().setClassName(n1Var.f35664a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            v0 v0Var4 = n1Var.f35669f;
            n1.m14085m(v0Var4);
            v0Var4.f35862f.m14140a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(n1Var.f35664a, "com.google.android.gms.measurement.AppMeasurementService"));
        j3 j3Var2 = this.f35569c;
        k3 k3Var2 = j3Var2.f35547c;
        k3Var2.mo325M();
        Context context2 = ((n1) k3Var2.f482a).f35664a;
        C8643a c8643aM15964b = C8643a.m15964b();
        synchronized (j3Var2) {
            try {
                if (j3Var2.f35545a) {
                    v0 v0Var5 = ((n1) j3Var2.f35547c.f482a).f35669f;
                    n1.m14085m(v0Var5);
                    v0Var5.f35870p.m14140a("Connection attempt already in progress");
                } else {
                    k3 k3Var3 = j3Var2.f35547c;
                    v0 v0Var6 = ((n1) k3Var3.f482a).f35669f;
                    n1.m14085m(v0Var6);
                    v0Var6.f35870p.m14140a("Using local app measurement service");
                    j3Var2.f35545a = true;
                    c8643aM15964b.m15965a(context2, intent, k3Var3.f35569c, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m14020T() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.k3.m14020T():boolean");
    }

    /* renamed from: U */
    public final void m14021U() {
        mo325M();
        m13936N();
        j3 j3Var = this.f35569c;
        if (j3Var.f35546b != null && (j3Var.f35546b.m13001g() || j3Var.f35546b.m12997c())) {
            j3Var.f35546b.m12999e();
        }
        j3Var.f35546b = null;
        try {
            C8643a.m15964b().m15966c(((n1) this.f482a).f35664a, j3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f35570d = null;
    }

    /* renamed from: V */
    public final boolean m14022V() {
        mo325M();
        m13936N();
        if (!m14020T()) {
            return true;
        }
        l4 l4Var = ((n1) this.f482a).f35672j;
        n1.m14083i(l4Var);
        return l4Var.t0() >= ((Integer) f0.J0.m13872a(null)).intValue();
    }

    /* renamed from: W */
    public final boolean m14023W() {
        mo325M();
        m13936N();
        if (!m14020T()) {
            return true;
        }
        l4 l4Var = ((n1) this.f482a).f35672j;
        n1.m14083i(l4Var);
        return l4Var.t0() >= 241200;
    }

    /* renamed from: X */
    public final void m14024X(ComponentName componentName) {
        mo325M();
        if (this.f35570d != null) {
            this.f35570d = null;
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14141b(componentName, "Disconnected from device MeasurementService");
            mo325M();
            m14019S();
        }
    }

    /* renamed from: Y */
    public final void m14025Y() {
        ((n1) this.f482a).getClass();
    }

    /* renamed from: Z */
    public final void m14026Z() {
        mo325M();
        k1.j2 j2Var = this.f35574h;
        ((C8946a) j2Var.f20151c).getClass();
        j2Var.f20150b = SystemClock.elapsedRealtime();
        ((n1) this.f482a).getClass();
        this.f35572f.m14096b(((Long) f0.f35404Y.m13872a(null)).longValue());
    }

    public final void a0(Runnable runnable) {
        mo325M();
        if (d0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f35575j;
        long size = arrayList.size();
        n1 n1Var = (n1) this.f482a;
        n1Var.getClass();
        if (size >= 1000) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f35576k.m14096b(60000L);
            m14019S();
        }
    }

    public final void b0() {
        mo325M();
        n1 n1Var = (n1) this.f482a;
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        t0 t0Var = v0Var.f35870p;
        ArrayList arrayList = this.f35575j;
        t0Var.m14141b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e2) {
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35862f.m14141b(e2, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f35576k.m14097c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.n4 c0(boolean r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f482a
            ug.n1 r0 = (ug.n1) r0
            r0.getClass()
            ug.n0 r1 = r0.m14095r()
            r2 = 0
            if (r11 == 0) goto Lca
            ug.v0 r11 = r0.f35669f
            ug.n1.m14085m(r11)
            java.lang.Object r11 = r11.f482a
            ug.n1 r11 = (ug.n1) r11
            ug.d1 r0 = r11.f35668e
            ug.n1.m14083i(r0)
            ia.l r0 = r0.f35331e
            if (r0 != 0) goto L22
            goto Lca
        L22:
            ug.d1 r11 = r11.f35668e
            ug.n1.m14083i(r11)
            ia.l r11 = r11.f35331e
            java.lang.Object r0 = r11.f17358e
            ug.d1 r0 = (ug.d1) r0
            r0.mo325M()
            r0.mo325M()
            java.lang.Object r3 = r11.f17358e
            ug.d1 r3 = (ug.d1) r3
            android.content.SharedPreferences r3 = r3.m13861Q()
            java.lang.Object r4 = r11.f17355b
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            long r3 = r3.getLong(r4, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L4e
            r11.m7566g()
            r3 = r5
            goto L60
        L4e:
            java.lang.Object r7 = r0.f482a
            ug.n1 r7 = (ug.n1) r7
            zf.a r7 = r7.f35674l
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
        L60:
            long r7 = r11.f17354a
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L68
        L66:
            r11 = r2
            goto L9f
        L68:
            long r7 = r7 + r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L71
            r11.m7566g()
            goto L66
        L71:
            java.lang.Object r3 = r11.f17357d
            java.lang.String r3 = (java.lang.String) r3
            android.content.SharedPreferences r4 = r0.m13861Q()
            java.lang.String r3 = r4.getString(r3, r2)
            java.lang.Object r4 = r11.f17356c
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences r0 = r0.m13861Q()
            long r7 = r0.getLong(r4, r5)
            r11.m7566g()
            if (r3 == 0) goto L9d
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 > 0) goto L93
            goto L9d
        L93:
            android.util.Pair r11 = new android.util.Pair
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r11.<init>(r3, r0)
            goto L9f
        L9d:
            android.util.Pair r11 = ug.d1.f35326D
        L9f:
            if (r11 == 0) goto Lca
            android.util.Pair r0 = ug.d1.f35326D
            if (r11 != r0) goto La6
            goto Lca
        La6:
            java.lang.Object r0 = r11.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r11 = r11.first
            java.lang.String r11 = (java.lang.String) r11
            int r2 = r0.length()
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r2 = r2 + 1
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = ":"
            java.lang.String r2 = p020v.a1.m14335o(r4, r0, r2, r11)
        Lca:
            ug.n4 r11 = r1.m14078Q(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.k3.c0(boolean):ug.n4");
    }

    public final boolean d0() {
        mo325M();
        m13936N();
        return this.f35570d != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x02da A[Catch: all -> 0x0202, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #61 {all -> 0x0202, blocks: (B:102:0x01dd, B:104:0x01f1, B:106:0x01f6, B:119:0x021a, B:120:0x021d, B:118:0x0216, B:123:0x0223, B:125:0x0237, B:132:0x024f, B:133:0x0258, B:134:0x025b, B:130:0x0249, B:137:0x025f, B:139:0x0273, B:146:0x028b, B:147:0x0295, B:148:0x0298, B:144:0x0285, B:151:0x029c, B:155:0x02b0, B:170:0x02da, B:171:0x02e4, B:172:0x02e7, B:168:0x02d4, B:180:0x02f4, B:181:0x0301, B:206:0x0366), top: B:422:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #58 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:420:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047c A[PHI: r5 r6 r24 r25 r27 r37 r38
      0x047c: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
      (r5v12 android.database.sqlite.SQLiteDatabase)
      (r5v13 android.database.sqlite.SQLiteDatabase)
      (r5v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x04a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(ug.i0 r67, tf.AbstractC7149a r68, ug.n4 r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.k3.e0(ug.i0, tf.a, ug.n4):void");
    }

    public final void f0(C7434e c7434e) {
        boolean zM14109T;
        mo325M();
        m13936N();
        n1 n1Var = (n1) this.f482a;
        n1Var.getClass();
        p0 p0VarM14092o = n1Var.m14092o();
        n1 n1Var2 = (n1) p0VarM14092o.f482a;
        n1.m14083i(n1Var2.f35672j);
        byte[] bArrR0 = l4.r0(c7434e);
        if (bArrR0.length > 131072) {
            v0 v0Var = n1Var2.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35863g.m14140a("Conditional user property too long for local database. Sending directly to service");
            zM14109T = false;
        } else {
            zM14109T = p0VarM14092o.m14109T(2, bArrR0);
        }
        a0(new RunnableC5354i(this, c0(true), zM14109T, new C7434e(c7434e)));
    }
}
