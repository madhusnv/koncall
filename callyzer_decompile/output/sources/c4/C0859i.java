package c4;

import h4.C2841r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.i */
/* loaded from: classes.dex */
public final class C0859i {

    /* renamed from: a */
    public int f5398a;

    /* renamed from: b */
    public float f5399b;

    /* renamed from: c */
    public final Object f5400c;

    public C0859i(int i10, C0853c c0853c) {
        this.f5398a = i10;
        this.f5400c = c0853c;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float m2298a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5400c
            h4.r r0 = (h4.C2841r) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f15832f
            int r3 = h4.AbstractC2838o.m6964d(r3, r6, r7)
            android.text.Layout r4 = r0.f15832f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.m6972f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f5398a
            if (r1 != r4) goto L35
            float r6 = r5.f5399b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.m6974h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.m6975i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f5398a = r4
            r5.f5399b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C0859i.m2298a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2299b(float r5, ww.AbstractC8193c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof c4.C0858h
            if (r0 == 0) goto L13
            r0 = r6
            c4.h r0 = (c4.C0858h) r0
            int r1 = r0.f5397d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5397d = r1
            goto L18
        L13:
            c4.h r0 = new c4.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5395b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f5397d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            c4.i r5 = r0.f5394a
            og.od.m10798c(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            java.lang.Object r6 = r4.f5400c
            c4.c r6 = (c4.C0853c) r6
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.f5394a = r4
            r0.f5397d = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f5399b
            float r0 = r0 + r6
            r5.f5399b = r0
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C0859i.m2299b(float, ww.c):java.lang.Object");
    }

    public C0859i(C2841r c2841r) {
        this.f5400c = c2841r;
        this.f5398a = -1;
    }
}
