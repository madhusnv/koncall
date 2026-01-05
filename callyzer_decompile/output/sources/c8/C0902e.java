package c8;

import b8.InterfaceC0628w;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k8.InterfaceC4024a;
import og.mb;
import ww.AbstractC8193c;
import ww.AbstractC8199i;
import z7.d0;
import z7.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c8.e */
/* loaded from: classes.dex */
public final class C0902e implements e0, InterfaceC0628w {

    /* renamed from: a */
    public final C0898a f5559a;

    public C0902e(C0898a c0898a) {
        this.f5559a = c0898a;
    }

    @Override // z7.InterfaceC8888q
    /* renamed from: a */
    public final Object mo1780a(String str, InterfaceC2139c interfaceC2139c, AbstractC8193c abstractC8193c) {
        AbstractC0905h abstractC0905hY0 = this.f5559a.y0(str);
        try {
            Object objInvoke = interfaceC2139c.invoke(abstractC0905hY0);
            mb.m10760a(abstractC0905hY0, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // b8.InterfaceC0628w
    /* renamed from: b */
    public final InterfaceC4024a mo1781b() {
        return this.f5559a;
    }

    @Override // z7.e0
    /* renamed from: c */
    public final Object mo1782c(d0 d0Var, InterfaceC2141e interfaceC2141e, AbstractC8199i abstractC8199i) {
        return m2541e(d0Var, interfaceC2141e, abstractC8199i);
    }

    @Override // z7.e0
    /* renamed from: d */
    public final Object mo1783d(AbstractC8199i abstractC8199i) {
        return Boolean.valueOf(this.f5559a.f5551a.d0());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2541e(z7.d0 r5, ex.InterfaceC2141e r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof c8.C0901d
            if (r0 == 0) goto L13
            r0 = r7
            c8.d r0 = (c8.C0901d) r0
            int r1 = r0.f5558e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5558e = r1
            goto L18
        L13:
            c8.d r0 = new c8.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f5556c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f5558e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            l8.a r5 = r0.f5555b
            c8.e r6 = r0.f5554a
            og.od.m10798c(r7)     // Catch: java.lang.Throwable -> L2b
            goto L77
        L2b:
            r7 = move-exception
            goto L8c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r7)
            c8.a r7 = r4.f5559a
            l8.a r7 = r7.f5551a
            r7.d0()
            int[] r2 = c8.AbstractC0900c.f5553a
            int r5 = r5.ordinal()
            r5 = r2[r5]
            if (r5 == r3) goto L5d
            r2 = 2
            if (r5 == r2) goto L59
            r2 = 3
            if (r5 != r2) goto L53
            r7.mo9262k()
            goto L60
        L53:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L59:
            r7.mo9260I()
            goto L60
        L5d:
            r7.mo9265x()
        L60:
            b8.o r5 = new b8.o     // Catch: java.lang.Throwable -> L87
            r2 = 1
            r5.<init>(r2, r4)     // Catch: java.lang.Throwable -> L87
            r0.f5554a = r4     // Catch: java.lang.Throwable -> L87
            r0.f5555b = r7     // Catch: java.lang.Throwable -> L87
            r0.f5558e = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L87
            if (r5 != r1) goto L73
            return r1
        L73:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L77:
            r5.mo9259F()     // Catch: java.lang.Throwable -> L2b
            r5.mo9261T()
            boolean r5 = r5.d0()
            if (r5 != 0) goto L86
            r6.getClass()
        L86:
            return r7
        L87:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L8c:
            r5.mo9261T()
            boolean r5 = r5.d0()
            if (r5 != 0) goto L98
            r6.getClass()
        L98:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.C0902e.m2541e(z7.d0, ex.e, ww.c):java.lang.Object");
    }
}
