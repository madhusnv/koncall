package ik;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.k */
/* loaded from: classes.dex */
public final class C3287k {

    /* renamed from: a */
    public final InterfaceC3292p f17504a;

    /* renamed from: b */
    public final InterfaceC3292p f17505b;

    public C3287k(InterfaceC3292p localOverrideSettings, InterfaceC3292p remoteSettings) {
        AbstractC4154l.m8923f(localOverrideSettings, "localOverrideSettings");
        AbstractC4154l.m8923f(remoteSettings, "remoteSettings");
        this.f17504a = localOverrideSettings;
        this.f17505b = remoteSettings;
    }

    /* renamed from: a */
    public final double m7633a() {
        Double dMo7631d = this.f17504a.mo7631d();
        if (dMo7631d != null) {
            double dDoubleValue = dMo7631d.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dMo7631d2 = this.f17505b.mo7631d();
        if (dMo7631d2 != null) {
            double dDoubleValue2 = dMo7631d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.mo7629b(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7634b(ww.AbstractC8193c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ik.C3286j
            if (r0 == 0) goto L13
            r0 = r6
            ik.j r0 = (ik.C3286j) r0
            int r1 = r0.f17503d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17503d = r1
            goto L18
        L13:
            ik.j r0 = new ik.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17501b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17503d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ik.k r2 = r0.f17500a
            og.od.m10798c(r6)
            goto L49
        L38:
            og.od.m10798c(r6)
            r0.f17500a = r5
            r0.f17503d = r4
            ik.p r6 = r5.f17504a
            java.lang.Object r6 = r6.mo7629b(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            ik.p r6 = r2.f17505b
            r2 = 0
            r0.f17500a = r2
            r0.f17503d = r3
            java.lang.Object r6 = r6.mo7629b(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.C3287k.m7634b(ww.c):java.lang.Object");
    }
}
