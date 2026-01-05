package r1;

import k1.x0;
import og.td;
import rw.AbstractC6663m;
import s1.InterfaceC6720o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.f */
/* loaded from: classes.dex */
public final class C6421f implements InterfaceC6720o {

    /* renamed from: a */
    public final C6440y f30956a;

    public C6421f(C6440y c6440y) {
        this.f30956a = c6440y;
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: a */
    public final int mo12089a() {
        return this.f30956a.m12434g().f31033o;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // s1.InterfaceC6720o
    /* renamed from: b */
    public final int mo12090b() {
        return ((C6434s) AbstractC6663m.m12750N(this.f30956a.m12434g().f31030l)).f31037a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // s1.InterfaceC6720o
    /* renamed from: c */
    public final int mo12091c() {
        boolean z6;
        long j6;
        C6440y c6440y = this.f30956a;
        int i10 = 0;
        if (c6440y.m12434g().f31030l.isEmpty()) {
            return 0;
        }
        C6433r c6433rM12434g = c6440y.m12434g();
        x0 x0Var = c6433rM12434g.f31034p;
        x0 x0Var2 = x0.Vertical;
        int iM12428f = (int) (x0Var == x0Var2 ? c6433rM12434g.m12428f() & 4294967295L : c6433rM12434g.m12428f() >> 32);
        C6433r c6433rM12434g2 = c6440y.m12434g();
        boolean z10 = c6433rM12434g2.f31034p == x0Var2;
        ?? r52 = c6433rM12434g2.f31030l;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < r52.size()) {
            int iM10934b = td.m10934b(z10, c6433rM12434g2, i11);
            if (iM10934b == -1) {
                i11++;
            } else {
                int iMax = i10;
                while (i11 < r52.size() && td.m10934b(z10, c6433rM12434g2, i11) == iM10934b) {
                    if (z10) {
                        z6 = z10;
                        j6 = ((C6434s) r52.get(i11)).f31050n & 4294967295L;
                    } else {
                        z6 = z10;
                        j6 = ((C6434s) r52.get(i11)).f31050n >> 32;
                    }
                    iMax = Math.max(iMax, (int) j6);
                    i11++;
                    z10 = z6;
                }
                i12 += iMax;
                i13++;
                z10 = z10;
                i10 = 0;
            }
        }
        int i14 = iM12428f / ((i12 / i13) + c6433rM12434g2.f31036r);
        if (i14 < 1) {
            return 1;
        }
        return i14;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // s1.InterfaceC6720o
    /* renamed from: d */
    public final boolean mo12092d() {
        return !this.f30956a.m12434g().f31030l.isEmpty();
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: e */
    public final int mo12093e() {
        return this.f30956a.f31077d.f29752b.m8526f();
    }
}
