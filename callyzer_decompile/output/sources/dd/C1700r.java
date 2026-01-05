package dd;

import dy.AbstractC1856d;
import dy.C1855c;
import oj.C5392d;
import ox.AbstractC5773d;
import ox.C5770a;
import ox.C5774e;
import ox.EnumC5772c;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.r */
/* loaded from: classes.dex */
public final class C1700r {

    /* renamed from: e */
    public static final C5392d f8302e = new C5392d(6);

    /* renamed from: a */
    public final C5950e f8303a;

    /* renamed from: b */
    public int f8304b = 500;

    /* renamed from: c */
    public C5774e f8305c = new C5774e(AbstractC5773d.m11305c());

    /* renamed from: d */
    public final C1855c f8306d = AbstractC1856d.m5490a();

    public C1700r(C5950e c5950e) {
        this.f8303a = c5950e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5391a(dd.C1700r r4, int r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof dd.C1699q
            if (r0 == 0) goto L13
            r0 = r6
            dd.q r0 = (dd.C1699q) r0
            int r1 = r0.f8301e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8301e = r1
            goto L18
        L13:
            dd.q r0 = new dd.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8299c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8301e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f8297a
            dy.c r0 = r0.f8298b
            og.od.m10798c(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            og.od.m10798c(r6)
            dy.c r6 = r4.f8306d
            r0.f8298b = r6
            r0.f8297a = r5
            r0.f8301e = r3
            java.lang.Object r0 = r6.mo1768h(r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            r0 = r6
        L46:
            r6 = 0
            r4.m5394d()     // Catch: java.lang.Throwable -> L66
            int r1 = r4.f8304b     // Catch: java.lang.Throwable -> L66
            int r1 = r1 + r5
            r5 = 500(0x1f4, float:7.0E-43)
            int r5 = java.lang.Math.min(r5, r1)     // Catch: java.lang.Throwable -> L66
            r4.f8304b = r5     // Catch: java.lang.Throwable -> L66
            long r1 = ox.AbstractC5773d.m11305c()     // Catch: java.lang.Throwable -> L66
            ox.e r5 = new ox.e     // Catch: java.lang.Throwable -> L66
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r4.f8305c = r5     // Catch: java.lang.Throwable -> L66
            qw.a0 r4 = qw.a0.f30746a     // Catch: java.lang.Throwable -> L66
            r0.mo1769j(r6)
            return r4
        L66:
            r4 = move-exception
            r0.mo1769j(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.C1700r.m5391a(dd.r, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5392b(ww.AbstractC8193c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dd.C1697o
            if (r0 == 0) goto L13
            r0 = r5
            dd.o r0 = (dd.C1697o) r0
            int r1 = r0.f8291c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8291c = r1
            goto L18
        L13:
            dd.o r0 = new dd.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8289a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8291c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.f8291c = r3
            r5 = 0
            java.lang.Object r5 = r4.m5393c(r5, r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            dd.n r5 = new dd.n
            r5.<init>(r4, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.C1700r.m5392b(ww.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v8, types: [dy.a] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5393c(int r7, ww.AbstractC8193c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dd.C1698p
            if (r0 == 0) goto L13
            r0 = r8
            dd.p r0 = (dd.C1698p) r0
            int r1 = r0.f8296e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8296e = r1
            goto L18
        L13:
            dd.p r0 = new dd.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8294c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8296e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L43
            if (r2 == r3) goto L3a
            r7 = 2
            if (r2 != r7) goto L32
            dy.a r7 = r0.f8293b
            og.od.m10798c(r8)     // Catch: java.lang.Throwable -> L30
            r8 = 0
            r6.f8304b = r8     // Catch: java.lang.Throwable -> L30
            goto L60
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            int r7 = r0.f8292a
            dy.a r0 = r0.f8293b
            og.od.m10798c(r8)
            r8 = r0
            goto L55
        L43:
            og.od.m10798c(r8)
            dy.c r8 = r6.f8306d
            r0.f8293b = r8
            r0.f8292a = r7
            r0.f8296e = r3
            java.lang.Object r0 = r8.mo1768h(r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            r6.m5394d()     // Catch: java.lang.Throwable -> L71
            int r0 = r6.f8304b     // Catch: java.lang.Throwable -> L71
            if (r7 > r0) goto L76
            int r0 = r0 - r7
            r6.f8304b = r0     // Catch: java.lang.Throwable -> L71
            r7 = r8
        L60:
            long r0 = ox.AbstractC5773d.m11305c()     // Catch: java.lang.Throwable -> L30
            ox.e r8 = new ox.e     // Catch: java.lang.Throwable -> L30
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r6.f8305c = r8     // Catch: java.lang.Throwable -> L30
            qw.a0 r8 = qw.a0.f30746a     // Catch: java.lang.Throwable -> L30
            r7.mo1769j(r4)
            return r8
        L71:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L7e
        L76:
            aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException r7 = new aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "Insufficient capacity to attempt retry"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r7     // Catch: java.lang.Throwable -> L71
        L7e:
            r7.mo1769j(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.C1700r.m5393c(int, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public final void m5394d() {
        this.f8304b = Math.min(500, this.f8304b + ((int) Math.floor(0 * C5770a.m11301l(C5774e.m11306a(this.f8305c.f28340a), EnumC5772c.SECONDS))));
    }
}
