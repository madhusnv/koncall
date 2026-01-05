package wx;

import ex.InterfaceC2141e;
import uw.InterfaceC7564h;
import vx.EnumC7799a;
import ww.AbstractC8199i;
import xx.AbstractC8499e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wx.c */
/* loaded from: classes3.dex */
public final class C8202c extends C8204e {

    /* renamed from: f */
    public final AbstractC8199i f39193f;

    /* JADX WARN: Multi-variable type inference failed */
    public C8202c(InterfaceC2141e interfaceC2141e, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        super(interfaceC2141e, interfaceC7564h, i10, enumC7799a);
        this.f39193f = (AbstractC8199i) interfaceC2141e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wx.C8204e, xx.AbstractC8499e
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo15368e(vx.InterfaceC7819u r5, uw.InterfaceC7559c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wx.C8201b
            if (r0 == 0) goto L13
            r0 = r6
            wx.b r0 = (wx.C8201b) r0
            int r1 = r0.f39180d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39180d = r1
            goto L1a
        L13:
            wx.b r0 = new wx.b
            ww.c r6 = (ww.AbstractC8193c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f39178b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39180d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            vx.u r5 = r0.f39177a
            og.od.m10798c(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r6)
            r0.f39177a = r5
            r0.f39180d = r3
            java.lang.Object r6 = super.mo15368e(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            vx.t r5 = (vx.C7818t) r5
            vx.h r5 = r5.f37529d
            boolean r5 = r5.m14759A()
            if (r5 == 0) goto L4e
            qw.a0 r5 = qw.a0.f30746a
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wx.C8202c.mo15368e(vx.u, uw.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ex.e, ww.i] */
    @Override // wx.C8204e, xx.AbstractC8499e
    /* renamed from: f */
    public final AbstractC8499e mo15369f(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return new C8202c(this.f39193f, interfaceC7564h, i10, enumC7799a);
    }
}
