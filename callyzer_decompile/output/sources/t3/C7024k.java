package t3;

import s4.C6745a;
import v3.j1;
import v3.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.k */
/* loaded from: classes.dex */
public final class C7024k implements i0 {

    /* renamed from: a */
    public final /* synthetic */ int f34009a;

    /* renamed from: b */
    public final i0 f34010b;

    /* renamed from: c */
    public final Enum f34011c;

    /* renamed from: d */
    public final Enum f34012d;

    public /* synthetic */ C7024k(i0 i0Var, Enum r22, Enum r32, int i10) {
        this.f34009a = i10;
        this.f34010b = i0Var;
        this.f34011c = r22;
        this.f34012d = r32;
    }

    @Override // t3.i0
    /* renamed from: C */
    public final Object mo13310C() {
        switch (this.f34009a) {
        }
        return this.f34010b.mo13310C();
    }

    @Override // t3.i0
    public final int a0(int i10) {
        switch (this.f34009a) {
        }
        return this.f34010b.a0(i10);
    }

    @Override // t3.i0
    /* renamed from: b */
    public final int mo13311b(int i10) {
        switch (this.f34009a) {
        }
        return this.f34010b.mo13311b(i10);
    }

    @Override // t3.i0
    /* renamed from: x */
    public final int mo13312x(int i10) {
        switch (this.f34009a) {
        }
        return this.f34010b.mo13312x(i10);
    }

    @Override // t3.i0
    /* renamed from: y */
    public final int mo13313y(int i10) {
        switch (this.f34009a) {
        }
        return this.f34010b.mo13313y(i10);
    }

    @Override // t3.i0
    /* renamed from: z */
    public final w0 mo13314z(long j6) {
        switch (this.f34009a) {
            case 0:
                EnumC7029p enumC7029p = (EnumC7029p) this.f34011c;
                EnumC7030q enumC7030q = (EnumC7030q) this.f34012d;
                EnumC7030q enumC7030q2 = EnumC7030q.Width;
                i0 i0Var = this.f34010b;
                if (enumC7030q == enumC7030q2) {
                    return new C7026m(enumC7029p == EnumC7029p.Max ? i0Var.mo13313y(C6745a.m12917h(j6)) : i0Var.mo13312x(C6745a.m12917h(j6)), C6745a.m12913d(j6) ? C6745a.m12917h(j6) : 32767, 0);
                }
                return new C7026m(C6745a.m12914e(j6) ? C6745a.m12918i(j6) : 32767, enumC7029p == EnumC7029p.Max ? i0Var.mo13311b(C6745a.m12918i(j6)) : i0Var.a0(C6745a.m12918i(j6)), 0);
            case 1:
                m0 m0Var = (m0) this.f34011c;
                n0 n0Var = (n0) this.f34012d;
                n0 n0Var2 = n0.Width;
                i0 i0Var2 = this.f34010b;
                if (n0Var == n0Var2) {
                    return new C7026m(m0Var == m0.Max ? i0Var2.mo13313y(C6745a.m12917h(j6)) : i0Var2.mo13312x(C6745a.m12917h(j6)), C6745a.m12913d(j6) ? C6745a.m12917h(j6) : 32767, 1);
                }
                return new C7026m(C6745a.m12914e(j6) ? C6745a.m12918i(j6) : 32767, m0Var == m0.Max ? i0Var2.mo13311b(C6745a.m12918i(j6)) : i0Var2.a0(C6745a.m12918i(j6)), 1);
            default:
                j1 j1Var = (j1) this.f34011c;
                k1 k1Var = (k1) this.f34012d;
                k1 k1Var2 = k1.Width;
                i0 i0Var3 = this.f34010b;
                if (k1Var == k1Var2) {
                    return new C7026m(j1Var == j1.Max ? i0Var3.mo13313y(C6745a.m12917h(j6)) : i0Var3.mo13312x(C6745a.m12917h(j6)), C6745a.m12913d(j6) ? C6745a.m12917h(j6) : 32767, 2);
                }
                return new C7026m(C6745a.m12914e(j6) ? C6745a.m12918i(j6) : 32767, j1Var == j1.Max ? i0Var3.mo13311b(C6745a.m12918i(j6)) : i0Var3.a0(C6745a.m12918i(j6)), 2);
        }
    }
}
