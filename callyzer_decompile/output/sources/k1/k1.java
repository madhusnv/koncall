package k1;

import o3.InterfaceC5278a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 implements InterfaceC5278a {

    /* renamed from: a */
    public final x1 f20154a;

    /* renamed from: b */
    public boolean f20155b;

    public k1(x1 x1Var, boolean z6) {
        this.f20154a = x1Var;
        this.f20155b = z6;
    }

    @Override // o3.InterfaceC5278a
    public final long d0(int i10, long j6, long j10) {
        if (!this.f20155b) {
            return 0L;
        }
        x1 x1Var = this.f20154a;
        if (x1Var.f20309a.mo7520a()) {
            return 0L;
        }
        return x1Var.m8481g(x1Var.m8477c(x1Var.f20309a.mo7524e(x1Var.m8477c(x1Var.m8480f(j10)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o3.InterfaceC5278a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo6162s(long r5, long r7, uw.InterfaceC7559c r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof k1.j1
            if (r5 == 0) goto L13
            r5 = r9
            k1.j1 r5 = (k1.j1) r5
            int r6 = r5.f20148d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.f20148d = r6
            goto L1a
        L13:
            k1.j1 r5 = new k1.j1
            ww.c r9 = (ww.AbstractC8193c) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.f20146b
            vw.a r9 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r0 = r5.f20148d
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 == r1) goto L3a
            r7 = 2
            if (r0 != r7) goto L32
            long r7 = r5.f20145a
            og.od.m10798c(r6)
            s4.q r6 = (s4.C6761q) r6
            long r5 = r6.f32216a
            goto L60
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            long r7 = r5.f20145a
            og.od.m10798c(r6)
            goto L5c
        L40:
            og.od.m10798c(r6)
            boolean r6 = r4.f20155b
            r2 = 0
            if (r6 == 0) goto L64
            k1.x1 r6 = r4.f20154a
            boolean r0 = r6.f20316h
            if (r0 == 0) goto L51
            r5 = r2
            goto L60
        L51:
            r5.f20145a = r7
            r5.f20148d = r1
            java.lang.Object r6 = r6.m8476b(r7, r5)
            if (r6 != r9) goto L5c
            return r9
        L5c:
            s4.q r6 = (s4.C6761q) r6
            long r5 = r6.f32216a
        L60:
            long r2 = s4.C6761q.m12961d(r7, r5)
        L64:
            s4.q r5 = new s4.q
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.k1.mo6162s(long, long, uw.c):java.lang.Object");
    }
}
