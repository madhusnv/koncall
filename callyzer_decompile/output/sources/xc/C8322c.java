package xc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tx.InterfaceC7258r;
import tx.f1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.c */
/* loaded from: classes.dex */
public final class C8322c {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39888b = AtomicReferenceFieldUpdater.newUpdater(C8322c.class, Object.class, "a");

    /* renamed from: a */
    public volatile /* synthetic */ Object f39889a;

    /* renamed from: a */
    public final void m15516a() {
        InterfaceC7258r interfaceC7258r = (InterfaceC7258r) f39888b.getAndSet(this, null);
        if (interfaceC7258r != null) {
            ((f1) interfaceC7258r).i0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15517b(ex.InterfaceC2137a r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xc.C8320a
            if (r0 == 0) goto L13
            r0 = r6
            xc.a r0 = (xc.C8320a) r0
            int r1 = r0.f39883c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39883c = r1
            goto L18
        L13:
            xc.a r0 = new xc.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39881a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39883c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            r0.f39883c = r3
            java.lang.Object r6 = r4.m15518c(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            qw.a0 r6 = qw.a0.f30746a
            if (r5 == 0) goto L46
            return r6
        L46:
            r4.m15516a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.C8322c.m15517b(ex.a, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15518c(ex.InterfaceC2137a r7, ww.AbstractC8193c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xc.C8321b
            if (r0 == 0) goto L13
            r0 = r8
            xc.b r0 = (xc.C8321b) r0
            int r1 = r0.f39887d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39887d = r1
            goto L18
        L13:
            xc.b r0 = new xc.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f39885b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f39887d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            int r7 = r0.f39884a
            og.od.m10798c(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            og.od.m10798c(r8)
            tx.f1 r8 = tx.c0.m13480c()
        L39:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = xc.C8322c.f39888b
            r5 = 0
            boolean r5 = r2.compareAndSet(r6, r5, r8)
            if (r5 == 0) goto L5b
            java.lang.Object r7 = r7.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L61
            r0.f39884a = r4
            r0.f39887d = r4
            java.lang.Object r7 = r8.mo13508U(r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r4
            goto L62
        L5b:
            java.lang.Object r2 = r2.get(r6)
            if (r2 == 0) goto L39
        L61:
            r7 = r3
        L62:
            if (r7 == 0) goto L65
            r3 = r4
        L65:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.C8322c.m15518c(ex.a, ww.c):java.lang.Object");
    }
}
