package i1;

import m1.C4626h;
import m1.C4627i;
import m1.InterfaceC4630l;
import p3.C5812j;
import p3.EnumC5813k;
import uw.InterfaceC7559c;
import v3.u1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends AbstractC7878q implements u1 {

    /* renamed from: q */
    public InterfaceC4630l f16933q;

    /* renamed from: r */
    public C4626h f16934r;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(i1.n0 r4, ww.AbstractC8193c r5) {
        /*
            boolean r0 = r5 instanceof i1.k0
            if (r0 == 0) goto L13
            r0 = r5
            i1.k0 r0 = (i1.k0) r0
            int r1 = r0.f16903e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16903e = r1
            goto L18
        L13:
            i1.k0 r0 = new i1.k0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f16901c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f16903e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            m1.h r4 = r0.f16900b
            i1.n0 r0 = r0.f16899a
            og.od.m10798c(r5)
            r5 = r4
            r4 = r0
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            og.od.m10798c(r5)
            m1.h r5 = r4.f16934r
            if (r5 != 0) goto L52
            m1.h r5 = new m1.h
            r5.<init>()
            m1.l r2 = r4.f16933q
            r0.f16899a = r4
            r0.f16900b = r5
            r0.f16903e = r3
            java.lang.Object r0 = r2.mo9501a(r5, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r4.f16934r = r5
        L52:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.n0.L0(i1.n0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(i1.n0 r4, ww.AbstractC8193c r5) {
        /*
            boolean r0 = r5 instanceof i1.l0
            if (r0 == 0) goto L13
            r0 = r5
            i1.l0 r0 = (i1.l0) r0
            int r1 = r0.f16913d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16913d = r1
            goto L18
        L13:
            i1.l0 r0 = new i1.l0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f16911b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f16913d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            i1.n0 r4 = r0.f16910a
            og.od.m10798c(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            og.od.m10798c(r5)
            m1.h r5 = r4.f16934r
            if (r5 == 0) goto L4d
            m1.i r2 = new m1.i
            r2.<init>(r5)
            m1.l r5 = r4.f16933q
            r0.f16910a = r4
            r0.f16913d = r3
            java.lang.Object r5 = r5.mo9501a(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r5 = 0
            r4.f16934r = r5
        L4d:
            qw.a0 r4 = qw.a0.f30746a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.n0.M0(i1.n0, ww.c):java.lang.Object");
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
        N0();
    }

    public final void N0() {
        C4626h c4626h = this.f16934r;
        if (c4626h != null) {
            this.f16933q.mo9502b(new C4627i(c4626h));
            this.f16934r = null;
        }
    }

    @Override // v3.u1
    /* renamed from: S */
    public final void mo6316S(C5812j c5812j, EnumC5813k enumC5813k, long j6) {
        if (enumC5813k == EnumC5813k.Main) {
            int i10 = c5812j.f28470d;
            InterfaceC7559c interfaceC7559c = null;
            if (i10 == 4) {
                tx.c0.m13502y(z0(), null, null, new m0(this, interfaceC7559c, 0), 3);
            } else if (i10 == 5) {
                tx.c0.m13502y(z0(), null, null, new m0(this, interfaceC7559c, 1), 3);
            }
        }
    }

    @Override // v3.u1
    /* renamed from: x */
    public final void mo6317x() {
        N0();
    }
}
