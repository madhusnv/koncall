package wc;

import ic.InterfaceC3227e;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.g */
/* loaded from: classes.dex */
public final class C7973g implements InterfaceC7989w {

    /* renamed from: a */
    public final InterfaceC3227e f38360a;

    /* renamed from: b */
    public final InterfaceC7989w f38361b;

    public C7973g(InterfaceC3227e interfaceC3227e, InterfaceC7989w chan) {
        AbstractC4154l.m8923f(chan, "chan");
        this.f38360a = interfaceC3227e;
        this.f38361b = chan;
    }

    @Override // wc.InterfaceC7989w
    public final boolean cancel(Throwable th2) {
        return this.f38361b.cancel(th2);
    }

    @Override // wc.InterfaceC7989w
    public final int getAvailableForRead() {
        return this.f38361b.getAvailableForRead();
    }

    @Override // wc.InterfaceC7989w
    public final Throwable getClosedCause() {
        return this.f38361b.getClosedCause();
    }

    @Override // wc.InterfaceC7989w
    public final boolean isClosedForRead() {
        return this.f38361b.isClosedForRead();
    }

    @Override // wc.InterfaceC7989w
    public final boolean isClosedForWrite() {
        return this.f38361b.isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wc.InterfaceC7989w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object read(wc.C7985s r5, long r6, uw.InterfaceC7559c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof wc.C7972f
            if (r0 == 0) goto L13
            r0 = r8
            wc.f r0 = (wc.C7972f) r0
            int r1 = r0.f38346d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38346d = r1
            goto L1a
        L13:
            wc.f r0 = new wc.f
            ww.c r8 = (ww.AbstractC8193c) r8
            r0.<init>(r4, r8)
        L1a:
            java.lang.Object r8 = r0.f38344b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38346d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wc.t r5 = r0.f38343a
            og.od.m10798c(r8)
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r8)
            wc.h r8 = new wc.h
            ic.e r2 = r4.f38360a
            r8.<init>(r2, r5)
            wc.t r5 = wc.AbstractC7984r.m15158b(r8)
            wc.s r8 = r5.mo15143a()
            r0.f38343a = r5
            r0.f38346d = r3
            wc.w r2 = r4.f38361b
            java.lang.Object r8 = r2.read(r8, r6, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r6 = r8
            java.lang.Number r6 = (java.lang.Number) r6
            r6.longValue()
            r5.mo15144c()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.C7973g.read(wc.s, long, uw.c):java.lang.Object");
    }
}
