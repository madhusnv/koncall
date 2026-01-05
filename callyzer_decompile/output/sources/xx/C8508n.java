package xx;

import vx.C7806h;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.n */
/* loaded from: classes3.dex */
public final class C8508n implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ C7806h f41428a;

    /* renamed from: b */
    public final /* synthetic */ int f41429b;

    public C8508n(C7806h c7806h, int i10) {
        this.f41428a = c7806h;
        this.f41429b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (tx.c0.m13477M(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wx.InterfaceC8210k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, uw.InterfaceC7559c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xx.C8507m
            if (r0 == 0) goto L13
            r0 = r7
            xx.m r0 = (xx.C8507m) r0
            int r1 = r0.f41427c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41427c = r1
            goto L18
        L13:
            xx.m r0 = new xx.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f41425a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f41427c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            og.od.m10798c(r7)
            goto L4b
        L36:
            og.od.m10798c(r7)
            rw.u r7 = new rw.u
            int r2 = r5.f41429b
            r7.<init>(r2, r6)
            r0.f41427c = r4
            vx.h r6 = r5.f41428a
            java.lang.Object r6 = r6.mo14775g(r7, r0)
            if (r6 != r1) goto L4b
            goto L53
        L4b:
            r0.f41427c = r3
            java.lang.Object r6 = tx.c0.m13477M(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xx.C8508n.emit(java.lang.Object, uw.c):java.lang.Object");
    }
}
