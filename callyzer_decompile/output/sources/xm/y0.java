package xm;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41028a = 0;

    /* renamed from: b */
    public LocalDateTime f41029b;

    /* renamed from: c */
    public int f41030c;

    /* renamed from: d */
    public final /* synthetic */ x1 f41031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x1 x1Var, LocalDateTime localDateTime, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41031d = x1Var;
        this.f41029b = localDateTime;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41028a) {
            case 0:
                return new y0(this.f41031d, this.f41029b, interfaceC7559c);
            default:
                return new y0(this.f41031d, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41028a) {
        }
        return ((y0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f41028a
            switch(r0) {
                case 0: goto L6d;
                default: goto L5;
            }
        L5:
            xm.x1 r0 = r7.f41031d
            gn.x2 r0 = r0.f40991a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r7.f41030c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L29
            if (r2 == r5) goto L25
            if (r2 != r4) goto L1d
            j$.time.LocalDateTime r0 = r7.f41029b
            og.od.m10798c(r8)
            r1 = r0
            goto L5a
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            og.od.m10798c(r8)
            goto L40
        L29:
            og.od.m10798c(r8)
            r7.f41030c = r5
            an.g5 r8 = r0.f14948h
            z7.w r8 = r8.f862a
            ad.h r2 = new ad.h
            r6 = 18
            r2.<init>(r6)
            java.lang.Object r8 = og.pe.m10839n(r7, r8, r5, r3, r2)
            if (r8 != r1) goto L40
            goto L6c
        L40:
            j$.time.LocalDateTime r8 = (j$.time.LocalDateTime) r8
            r7.f41029b = r8
            r7.f41030c = r4
            an.h3 r0 = r0.f14941a
            z7.w r0 = r0.f899a
            ad.h r2 = new ad.h
            r4 = 8
            r2.<init>(r4)
            java.lang.Object r0 = og.pe.m10839n(r7, r0, r5, r3, r2)
            if (r0 != r1) goto L58
            goto L6c
        L58:
            r1 = r8
            r8 = r0
        L5a:
            j$.time.LocalDateTime r8 = (j$.time.LocalDateTime) r8
            if (r1 == 0) goto L6b
            if (r8 == 0) goto L6c
            boolean r0 = r8.isAfter(r1)
            if (r0 == 0) goto L67
            goto L68
        L67:
            r8 = 0
        L68:
            if (r8 != 0) goto L6b
            goto L6c
        L6b:
            r1 = r8
        L6c:
            return r1
        L6d:
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r1 = r7.f41030c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L83
            if (r1 != r3) goto L7b
            og.od.m10798c(r8)
            goto L9f
        L7b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L83:
            og.od.m10798c(r8)
            xm.x1 r8 = r7.f41031d
            gn.x2 r8 = r8.f40991a
            j$.time.LocalDateTime r1 = r7.f41029b
            r7.f41030c = r3
            an.h3 r8 = r8.f14941a
            z7.w r8 = r8.f899a
            an.x1 r4 = new an.x1
            r5 = 0
            r4.<init>(r5, r1)
            java.lang.Object r8 = og.pe.m10839n(r7, r8, r3, r2, r4)
            if (r8 != r0) goto L9f
            goto Lac
        L9f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 <= 0) goto La8
            r2 = r3
        La8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x1 x1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41031d = x1Var;
    }
}
