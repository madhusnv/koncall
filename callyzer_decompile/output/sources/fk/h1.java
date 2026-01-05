package fk;

import ik.C3287k;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import o6.InterfaceC5304f;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a */
    public final C3287k f10409a;

    /* renamed from: b */
    public final x0 f10410b;

    /* renamed from: c */
    public final s0 f10411c;

    /* renamed from: d */
    public final m1 f10412d;

    /* renamed from: e */
    public final InterfaceC5304f f10413e;

    /* renamed from: f */
    public final f0 f10414f;

    /* renamed from: g */
    public final InterfaceC7564h f10415g;

    /* renamed from: h */
    public k0 f10416h;

    /* renamed from: i */
    public boolean f10417i;

    /* renamed from: j */
    public String f10418j;

    public h1(C3287k sessionsSettings, x0 sessionGenerator, s0 sessionFirelogPublisher, m1 timeProvider, InterfaceC5304f sessionDataStore, f0 processDataManager, InterfaceC7564h backgroundDispatcher) {
        AbstractC4154l.m8923f(sessionsSettings, "sessionsSettings");
        AbstractC4154l.m8923f(sessionGenerator, "sessionGenerator");
        AbstractC4154l.m8923f(sessionFirelogPublisher, "sessionFirelogPublisher");
        AbstractC4154l.m8923f(timeProvider, "timeProvider");
        AbstractC4154l.m8923f(sessionDataStore, "sessionDataStore");
        AbstractC4154l.m8923f(processDataManager, "processDataManager");
        AbstractC4154l.m8923f(backgroundDispatcher, "backgroundDispatcher");
        this.f10409a = sessionsSettings;
        this.f10410b = sessionGenerator;
        this.f10411c = sessionFirelogPublisher;
        this.f10412d = timeProvider;
        this.f10413e = sessionDataStore;
        this.f10414f = processDataManager;
        this.f10415g = backgroundDispatcher;
        d1 d1Var = d1.GENERAL;
        this.f10418j = "";
        tx.c0.m13502y(tx.c0.m13479b(backgroundDispatcher), null, null, new c1(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5971a(fk.h1 r4, java.lang.String r5, fk.d1 r6, uw.InterfaceC7559c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof fk.g1
            if (r0 == 0) goto L16
            r0 = r7
            fk.g1 r0 = (fk.g1) r0
            int r1 = r0.f10400e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f10400e = r1
            goto L1b
        L16:
            fk.g1 r0 = new fk.g1
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f10398c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10400e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            fk.d1 r6 = r0.f10397b
            java.lang.String r5 = r0.f10396a
            og.od.m10798c(r7)
            goto L55
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            og.od.m10798c(r7)
            java.lang.String r7 = r4.f10418j
            boolean r7 = kotlin.jvm.internal.AbstractC4154l.m8918a(r7, r5)
            if (r7 == 0) goto L44
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L44:
            r4.f10418j = r5
            gk.c r4 = gk.C2622c.f14197a
            r0.f10396a = r5
            r0.f10397b = r6
            r0.f10400e = r3
            java.lang.Object r7 = r4.m6596b(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r4 = r7.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L61:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lc3
            java.lang.Object r7 = r4.next()
            wi.i r7 = (wi.C8059i) r7
            gk.e r0 = new gk.e
            r0.<init>(r5)
            r7.getClass()
            java.util.Objects.toString(r0)
            r0 = 3
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r1, r0)
            wi.h r7 = r7.f38589b
            monitor-enter(r7)
            java.lang.String r0 = r7.f38587c     // Catch: java.lang.Throwable -> L9f
            boolean r0 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto La1
            cj.e r0 = r7.f38585a     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r7.f38586b     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = "aqs."
            if (r1 == 0) goto L9c
            java.lang.String r2 = r2.concat(r5)     // Catch: java.io.IOException -> L9c java.lang.Throwable -> L9f
            java.io.File r0 = r0.m2781o(r1, r2)     // Catch: java.io.IOException -> L9c java.lang.Throwable -> L9f
            r0.createNewFile()     // Catch: java.io.IOException -> L9c java.lang.Throwable -> L9f
        L9c:
            r7.f38587c = r5     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r4 = move-exception
            goto Lc1
        La1:
            monitor-exit(r7)
            int[] r7 = fk.e1.f10373a
            int r0 = r6.ordinal()
            r7 = r7[r0]
            if (r7 == r3) goto Lbb
            r0 = 2
            if (r7 != r0) goto Lb5
            gk.d r7 = gk.EnumC2623d.CRASHLYTICS
            java.util.Objects.toString(r7)
            goto L61
        Lb5:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        Lbb:
            gk.d r7 = gk.EnumC2623d.CRASHLYTICS
            java.util.Objects.toString(r7)
            goto L61
        Lc1:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9f
            throw r4
        Lc3:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.h1.m5971a(fk.h1, java.lang.String, fk.d1, uw.c):java.lang.Object");
    }

    /* renamed from: b */
    public final void m5972b() {
        this.f10417i = false;
        if (this.f10416h == null) {
            return;
        }
        this.f10414f.m5967a();
        tx.c0.m13502y(tx.c0.m13479b(this.f10415g), null, null, new c1(this, null, 1), 3);
    }

    /* renamed from: c */
    public final boolean m5973c(k0 k0Var) {
        Map map = k0Var.f10450c;
        boolean z6 = true;
        f0 f0Var = this.f10414f;
        if (map == null) {
            f0Var.m5967a();
            return true;
        }
        f0Var.getClass();
        d0 d0Var = (d0) map.get(f0Var.m5967a());
        if (d0Var != null && d0Var.f10365a == f0Var.f10381c && AbstractC4154l.m8918a(d0Var.f10366b, (String) f0Var.f10382d.getValue())) {
            z6 = false;
        }
        if (z6) {
            f0Var.m5967a();
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5974d(fk.k0 r10) {
        /*
            r9 = this;
            fk.l1 r0 = r10.f10449b
            fk.p0 r10 = r10.f10448a
            r1 = 0
            if (r0 == 0) goto L5c
            fk.m1 r2 = r9.f10412d
            fk.l1 r2 = r2.m5981a()
            int r3 = ox.C5770a.f28335d
            long r2 = r2.f10453a
            long r4 = r0.f10453a
            long r2 = r2 - r4
            ox.c r0 = ox.EnumC5772c.MILLISECONDS
            long r2 = og.bb.m10552h(r2, r0)
            ik.k r0 = r9.f10409a
            ik.p r4 = r0.f17504a
            ox.a r4 = r4.mo7630c()
            r5 = 0
            if (r4 == 0) goto L33
            long r7 = r4.f28336a
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L33
            boolean r4 = ox.C5770a.m11297h(r7)
            if (r4 != 0) goto L33
            goto L50
        L33:
            ik.p r0 = r0.f17505b
            ox.a r0 = r0.mo7630c()
            if (r0 == 0) goto L48
            long r7 = r0.f28336a
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L48
            boolean r0 = ox.C5770a.m11297h(r7)
            if (r0 != 0) goto L48
            goto L50
        L48:
            r0 = 30
            ox.c r4 = ox.EnumC5772c.MINUTES
            long r7 = og.bb.m10551g(r0, r4)
        L50:
            int r0 = ox.C5770a.m11292c(r2, r7)
            if (r0 <= 0) goto L57
            r1 = 1
        L57:
            if (r1 == 0) goto L5b
            java.lang.String r10 = r10.f10467a
        L5b:
            return r1
        L5c:
            java.lang.String r10 = r10.f10467a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.h1.m5974d(fk.k0):boolean");
    }
}
