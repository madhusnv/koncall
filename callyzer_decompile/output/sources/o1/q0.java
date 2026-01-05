package o1;

import com.sun.mail.util.AbstractC1452a;
import e1.C1908j;
import kotlin.NoWhenBranchMatchedException;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a */
    public final m0 f25814a;

    /* renamed from: b */
    public t3.i0 f25815b;

    /* renamed from: c */
    public t3.w0 f25816c;

    /* renamed from: d */
    public t3.i0 f25817d;

    /* renamed from: e */
    public t3.w0 f25818e;

    /* renamed from: f */
    public C1908j f25819f;

    /* renamed from: g */
    public C1908j f25820g;

    public q0(m0 m0Var) {
        this.f25814a = m0Var;
    }

    /* renamed from: a */
    public final C1908j m10365a(int i10, int i11, boolean z6) {
        int i12 = o0.f25801a[this.f25814a.ordinal()];
        if (i12 == 1 || i12 == 2) {
            return null;
        }
        if (i12 == 3) {
            if (z6) {
                return this.f25819f;
            }
            return null;
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z6) {
            return this.f25819f;
        }
        if (i10 + 1 < 0 || i11 < 0) {
            return null;
        }
        return this.f25820g;
    }

    /* renamed from: b */
    public final void m10366b(t3.i0 i0Var, t3.i0 i0Var2, boolean z6, long j6) {
        long jM10324i = AbstractC5244c.m10324i(j6, z6 ? c1.Horizontal : c1.Vertical);
        if (i0Var != null) {
            int iM12917h = C6745a.m12917h(jM10324i);
            int iMo13312x = z6 ? i0Var.mo13312x(iM12917h) : i0Var.a0(iM12917h);
            this.f25819f = new C1908j(C1908j.m5567a(iMo13312x, z6 ? i0Var.a0(iMo13312x) : i0Var.mo13312x(iMo13312x)));
            this.f25815b = i0Var;
            this.f25816c = null;
        }
        if (i0Var2 != null) {
            int iM12917h2 = C6745a.m12917h(jM10324i);
            int iMo13312x2 = z6 ? i0Var2.mo13312x(iM12917h2) : i0Var2.a0(iM12917h2);
            this.f25820g = new C1908j(C1908j.m5567a(iMo13312x2, z6 ? i0Var2.a0(iMo13312x2) : i0Var2.mo13312x(iMo13312x2)));
            this.f25817d = i0Var2;
            this.f25818e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.f25814a == ((q0) obj).f25814a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC1452a.m4556c(0, this.f25814a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f25814a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
