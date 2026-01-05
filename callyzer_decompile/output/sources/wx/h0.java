package wx;

import ex.InterfaceC2142f;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ AbstractC8199i f39232a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8210k f39233b;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(InterfaceC2142f interfaceC2142f, InterfaceC8210k interfaceC8210k) {
        this.f39232a = (AbstractC8199i) interfaceC2142f;
        this.f39233b = interfaceC8210k;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [ex.f, ww.i] */
    @Override // wx.InterfaceC8210k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, uw.InterfaceC7559c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wx.g0
            if (r0 == 0) goto L13
            r0 = r6
            wx.g0 r0 = (wx.g0) r0
            int r1 = r0.f39229c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39229c = r1
            goto L18
        L13:
            wx.g0 r0 = new wx.g0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39228b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39229c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wx.h0 r5 = r0.f39227a
            og.od.m10798c(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r0.f39227a = r4
            r0.f39229c = r3
            ww.i r6 = r4.f39232a
            wx.k r2 = r4.f39233b
            java.lang.Object r6 = r6.invoke(r2, r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            qw.a0 r5 = qw.a0.f30746a
            return r5
        L4f:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.h0.emit(java.lang.Object, uw.c):java.lang.Object");
    }
}
