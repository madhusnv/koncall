package o1;

import a2.C0037j;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public float f25821q;

    /* renamed from: r */
    public float f25822r;

    /* renamed from: s */
    public float f25823s;

    /* renamed from: t */
    public float f25824t;

    /* renamed from: v */
    public boolean f25825v;

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        long jL0 = L0(n0Var);
        if (C6745a.m12915f(jL0)) {
            return C6745a.m12917h(jL0);
        }
        if (!this.f25825v) {
            i10 = AbstractC6746b.m12929g(i10, jL0);
        }
        return AbstractC6746b.m12928f(i0Var.a0(i10), jL0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L0(t3.l0 r7) {
        /*
            r6 = this;
            float r0 = r6.f25823s
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f25823s
            int r0 = r7.e0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f25824t
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f25824t
            int r3 = r7.e0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f25821q
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f25821q
            int r4 = r7.e0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f25822r
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f25822r
            int r7 = r7.e0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = s4.AbstractC6746b.m12923a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.q1.L0(t3.l0):long");
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        long jL0 = L0(n0Var);
        if (C6745a.m12915f(jL0)) {
            return C6745a.m12917h(jL0);
        }
        if (!this.f25825v) {
            i10 = AbstractC6746b.m12929g(i10, jL0);
        }
        return AbstractC6746b.m12928f(i0Var.mo13311b(i10), jL0);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        int iM12920k;
        int iM12918i;
        int iM12919j;
        int iM12917h;
        long jM12923a;
        long jL0 = L0(l0Var);
        if (this.f25825v) {
            jM12923a = AbstractC6746b.m12927e(j6, jL0);
        } else {
            if (Float.isNaN(this.f25821q)) {
                iM12920k = C6745a.m12920k(j6);
                int iM12918i2 = C6745a.m12918i(jL0);
                if (iM12920k > iM12918i2) {
                    iM12920k = iM12918i2;
                }
            } else {
                iM12920k = C6745a.m12920k(jL0);
            }
            if (Float.isNaN(this.f25823s)) {
                iM12918i = C6745a.m12918i(j6);
                int iM12920k2 = C6745a.m12920k(jL0);
                if (iM12918i < iM12920k2) {
                    iM12918i = iM12920k2;
                }
            } else {
                iM12918i = C6745a.m12918i(jL0);
            }
            if (Float.isNaN(this.f25822r)) {
                iM12919j = C6745a.m12919j(j6);
                int iM12917h2 = C6745a.m12917h(jL0);
                if (iM12919j > iM12917h2) {
                    iM12919j = iM12917h2;
                }
            } else {
                iM12919j = C6745a.m12919j(jL0);
            }
            if (Float.isNaN(this.f25824t)) {
                iM12917h = C6745a.m12917h(j6);
                int iM12919j2 = C6745a.m12919j(jL0);
                if (iM12917h < iM12919j2) {
                    iM12917h = iM12919j2;
                }
            } else {
                iM12917h = C6745a.m12917h(jL0);
            }
            jM12923a = AbstractC6746b.m12923a(iM12920k, iM12918i, iM12919j, iM12917h);
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(jM12923a);
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 10));
    }

    @Override // v3.InterfaceC7652x
    public final int k0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        long jL0 = L0(n0Var);
        if (C6745a.m12916g(jL0)) {
            return C6745a.m12918i(jL0);
        }
        if (!this.f25825v) {
            i10 = AbstractC6746b.m12928f(i10, jL0);
        }
        return AbstractC6746b.m12929g(i0Var.mo13313y(i10), jL0);
    }

    @Override // v3.InterfaceC7652x
    public final int x0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        long jL0 = L0(n0Var);
        if (C6745a.m12916g(jL0)) {
            return C6745a.m12918i(jL0);
        }
        if (!this.f25825v) {
            i10 = AbstractC6746b.m12928f(i10, jL0);
        }
        return AbstractC6746b.m12929g(i0Var.mo13312x(i10), jL0);
    }
}
