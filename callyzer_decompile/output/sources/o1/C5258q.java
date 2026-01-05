package o1;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4166x;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.AbstractC6753i;
import s4.C6745a;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.q */
/* loaded from: classes.dex */
public final class C5258q implements t3.j0 {

    /* renamed from: a */
    public final InterfaceC7866e f25812a;

    /* renamed from: b */
    public final boolean f25813b;

    public C5258q(InterfaceC7866e interfaceC7866e, boolean z6) {
        this.f25812a = interfaceC7866e;
        this.f25813b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5258q)) {
            return false;
        }
        C5258q c5258q = (C5258q) obj;
        return AbstractC4154l.m8918a(this.f25812a, c5258q.f25812a) && this.f25813b == c5258q.f25813b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25813b) + (this.f25812a.hashCode() * 31);
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        int iM12920k;
        int iM12919j;
        t3.w0 w0VarMo13314z;
        boolean zIsEmpty = list.isEmpty();
        C6669s c6669s = C6669s.f31944a;
        if (zIsEmpty) {
            return l0Var.g0(C6745a.m12920k(j6), C6745a.m12919j(j6), c6669s, C5254m.f25786c);
        }
        long j10 = this.f25813b ? j6 : j6 & (-8589934589L);
        if (list.size() == 1) {
            t3.i0 i0Var = (t3.i0) list.get(0);
            Object objMo13310C = i0Var.mo13310C();
            C5253l c5253l = objMo13310C instanceof C5253l ? (C5253l) objMo13310C : null;
            if (c5253l != null ? c5253l.f25779r : false) {
                iM12920k = C6745a.m12920k(j6);
                iM12919j = C6745a.m12919j(j6);
                int iM12920k2 = C6745a.m12920k(j6);
                int iM12919j2 = C6745a.m12919j(j6);
                if (!((iM12919j2 >= 0) & (iM12920k2 >= 0))) {
                    AbstractC6753i.m12938a("width and height must be >= 0");
                }
                w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12930h(iM12920k2, iM12920k2, iM12919j2, iM12919j2));
            } else {
                w0VarMo13314z = i0Var.mo13314z(j10);
                iM12920k = Math.max(C6745a.m12920k(j6), w0VarMo13314z.f34030a);
                iM12919j = Math.max(C6745a.m12919j(j6), w0VarMo13314z.f34031b);
            }
            int i10 = iM12919j;
            int i11 = iM12920k;
            return l0Var.g0(i11, i10, c6669s, new C5257p(w0VarMo13314z, i0Var, l0Var, i11, i10, this));
        }
        t3.w0[] w0VarArr = new t3.w0[list.size()];
        C4166x c4166x = new C4166x();
        c4166x.f21162a = C6745a.m12920k(j6);
        C4166x c4166x2 = new C4166x();
        c4166x2.f21162a = C6745a.m12919j(j6);
        int size = list.size();
        boolean z6 = false;
        for (int i12 = 0; i12 < size; i12++) {
            t3.i0 i0Var2 = (t3.i0) list.get(i12);
            Object objMo13310C2 = i0Var2.mo13310C();
            C5253l c5253l2 = objMo13310C2 instanceof C5253l ? (C5253l) objMo13310C2 : null;
            if (c5253l2 != null ? c5253l2.f25779r : false) {
                z6 = true;
            } else {
                t3.w0 w0VarMo13314z2 = i0Var2.mo13314z(j10);
                w0VarArr[i12] = w0VarMo13314z2;
                c4166x.f21162a = Math.max(c4166x.f21162a, w0VarMo13314z2.f34030a);
                c4166x2.f21162a = Math.max(c4166x2.f21162a, w0VarMo13314z2.f34031b);
            }
        }
        if (z6) {
            int i13 = c4166x.f21162a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = c4166x2.f21162a;
            long jM12923a = AbstractC6746b.m12923a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                t3.i0 i0Var3 = (t3.i0) list.get(i16);
                Object objMo13310C3 = i0Var3.mo13310C();
                C5253l c5253l3 = objMo13310C3 instanceof C5253l ? (C5253l) objMo13310C3 : null;
                if (c5253l3 != null ? c5253l3.f25779r : false) {
                    w0VarArr[i16] = i0Var3.mo13314z(jM12923a);
                }
            }
        }
        return l0Var.g0(c4166x.f21162a, c4166x2.f21162a, c6669s, new g2.e1(w0VarArr, list, l0Var, c4166x, c4166x2, this, 2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f25812a);
        sb2.append(", propagateMinConstraints=");
        return i0.m0.m7382o(sb2, this.f25813b, ')');
    }
}
