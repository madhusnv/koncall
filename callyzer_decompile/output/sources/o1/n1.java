package o1;

import com.skydoves.balloon.internals.DefinitionKt;
import g2.C2451e;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.te;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.InterfaceC7028o;
import w2.C7870i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 implements t3.j0, k1 {

    /* renamed from: a */
    public final InterfaceC5247f f25796a;

    /* renamed from: b */
    public final C7870i f25797b;

    public n1(InterfaceC5247f interfaceC5247f, C7870i c7870i) {
        this.f25796a = interfaceC5247f;
        this.f25797b = c7870i;
    }

    @Override // o1.k1
    /* renamed from: a */
    public final int mo10352a(t3.w0 w0Var) {
        return w0Var.f34031b;
    }

    @Override // o1.k1
    /* renamed from: b */
    public final long mo10353b(int i10, int i11, int i12, boolean z6) {
        return !z6 ? AbstractC6746b.m12923a(i10, i11, 0, i12) : te.m10936b(i10, i11, 0, i12);
    }

    @Override // o1.k1
    /* renamed from: c */
    public final t3.k0 mo10354c(t3.w0[] w0VarArr, t3.l0 l0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return l0Var.g0(i10, i11, C6669s.f31944a, new C2451e(w0VarArr, this, i11, iArr));
    }

    @Override // o1.k1
    /* renamed from: d */
    public final void mo10355d(int i10, int[] iArr, int[] iArr2, t3.l0 l0Var) {
        this.f25796a.mo10316c(l0Var, i10, iArr, l0Var.getLayoutDirection(), iArr2);
    }

    @Override // o1.k1
    /* renamed from: e */
    public final int mo10356e(t3.w0 w0Var) {
        return w0Var.f34030a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return AbstractC4154l.m8918a(this.f25796a, n1Var.f25796a) && AbstractC4154l.m8918a(this.f25797b, n1Var.f25797b);
    }

    public final int hashCode() {
        return this.f25797b.hashCode() + (this.f25796a.hashCode() * 31);
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25796a.mo10336a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iE0, i10);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            t3.i0 i0Var = (t3.i0) list.get(i11);
            float fM10327l = AbstractC5244c.m10327l(AbstractC5244c.m10326k(i0Var));
            if (fM10327l == DefinitionKt.NO_Float_VALUE) {
                int iMin2 = Math.min(i0Var.mo13313y(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.mo13311b(iMin2));
            } else if (fM10327l > DefinitionKt.NO_Float_VALUE) {
                f6 += fM10327l;
            }
        }
        int iRound = f6 == DefinitionKt.NO_Float_VALUE ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f6);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            t3.i0 i0Var2 = (t3.i0) list.get(i12);
            float fM10327l2 = AbstractC5244c.m10327l(AbstractC5244c.m10326k(i0Var2));
            if (fM10327l2 > DefinitionKt.NO_Float_VALUE) {
                iMax = Math.max(iMax, i0Var2.mo13311b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM10327l2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25796a.mo10336a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f6 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            t3.i0 i0Var = (t3.i0) list.get(i12);
            float fM10327l = AbstractC5244c.m10327l(AbstractC5244c.m10326k(i0Var));
            int iMo13313y = i0Var.mo13313y(i10);
            if (fM10327l == DefinitionKt.NO_Float_VALUE) {
                i11 += iMo13313y;
            } else if (fM10327l > DefinitionKt.NO_Float_VALUE) {
                f6 += fM10327l;
                iMax = Math.max(iMax, Math.round(iMo13313y / fM10327l));
            }
        }
        return ((list.size() - 1) * iE0) + Math.round(iMax * f6) + i11;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        return AbstractC5244c.m10328m(this, C6745a.m12920k(j6), C6745a.m12919j(j6), C6745a.m12918i(j6), C6745a.m12917h(j6), l0Var.e0(this.f25796a.mo10336a()), l0Var, list, new t3.w0[list.size()], 0, list.size(), null, 0);
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25796a.mo10336a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iE0, i10);
        int size = list.size();
        int iMax = 0;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            t3.i0 i0Var = (t3.i0) list.get(i11);
            float fM10327l = AbstractC5244c.m10327l(AbstractC5244c.m10326k(i0Var));
            if (fM10327l == DefinitionKt.NO_Float_VALUE) {
                int iMin2 = Math.min(i0Var.mo13313y(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.a0(iMin2));
            } else if (fM10327l > DefinitionKt.NO_Float_VALUE) {
                f6 += fM10327l;
            }
        }
        int iRound = f6 == DefinitionKt.NO_Float_VALUE ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f6);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            t3.i0 i0Var2 = (t3.i0) list.get(i12);
            float fM10327l2 = AbstractC5244c.m10327l(AbstractC5244c.m10326k(i0Var2));
            if (fM10327l2 > DefinitionKt.NO_Float_VALUE) {
                iMax = Math.max(iMax, i0Var2.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM10327l2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25796a.mo10336a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f6 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            t3.i0 i0Var = (t3.i0) list.get(i12);
            float fM10327l = AbstractC5244c.m10327l(AbstractC5244c.m10326k(i0Var));
            int iMo13312x = i0Var.mo13312x(i10);
            if (fM10327l == DefinitionKt.NO_Float_VALUE) {
                i11 += iMo13312x;
            } else if (fM10327l > DefinitionKt.NO_Float_VALUE) {
                f6 += fM10327l;
                iMax = Math.max(iMax, Math.round(iMo13312x / fM10327l));
            }
        }
        return ((list.size() - 1) * iE0) + Math.round(iMax * f6) + i11;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f25796a + ", verticalAlignment=" + this.f25797b + ')';
    }
}
