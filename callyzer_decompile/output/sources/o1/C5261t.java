package o1;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.te;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.InterfaceC7028o;
import w2.C7869h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.t */
/* loaded from: classes.dex */
public final class C5261t implements t3.j0, k1 {

    /* renamed from: a */
    public final InterfaceC5249h f25848a;

    /* renamed from: b */
    public final C7869h f25849b;

    public C5261t(InterfaceC5249h interfaceC5249h, C7869h c7869h) {
        this.f25848a = interfaceC5249h;
        this.f25849b = c7869h;
    }

    @Override // o1.k1
    /* renamed from: a */
    public final int mo10352a(t3.w0 w0Var) {
        return w0Var.f34030a;
    }

    @Override // o1.k1
    /* renamed from: b */
    public final long mo10353b(int i10, int i11, int i12, boolean z6) {
        return !z6 ? AbstractC6746b.m12923a(0, i12, i10, i11) : te.m10935a(0, i12, i10, i11);
    }

    @Override // o1.k1
    /* renamed from: c */
    public final t3.k0 mo10354c(t3.w0[] w0VarArr, t3.l0 l0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return l0Var.g0(i11, i10, C6669s.f31944a, new b3.k0(w0VarArr, this, i11, l0Var, iArr));
    }

    @Override // o1.k1
    /* renamed from: d */
    public final void mo10355d(int i10, int[] iArr, int[] iArr2, t3.l0 l0Var) {
        this.f25848a.mo10335b(l0Var, i10, iArr, iArr2);
    }

    @Override // o1.k1
    /* renamed from: e */
    public final int mo10356e(t3.w0 w0Var) {
        return w0Var.f34031b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5261t)) {
            return false;
        }
        C5261t c5261t = (C5261t) obj;
        return AbstractC4154l.m8918a(this.f25848a, c5261t.f25848a) && this.f25849b.equals(c5261t.f25849b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f25849b.f37660a) + (this.f25848a.hashCode() * 31);
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25848a.mo10336a());
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
            int iMo13311b = i0Var.mo13311b(i10);
            if (fM10327l == DefinitionKt.NO_Float_VALUE) {
                i11 += iMo13311b;
            } else if (fM10327l > DefinitionKt.NO_Float_VALUE) {
                f6 += fM10327l;
                iMax = Math.max(iMax, Math.round(iMo13311b / fM10327l));
            }
        }
        return ((list.size() - 1) * iE0) + Math.round(iMax * f6) + i11;
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25848a.mo10336a());
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
                int iMin2 = Math.min(i0Var.mo13311b(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.mo13313y(iMin2));
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
                iMax = Math.max(iMax, i0Var2.mo13313y(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM10327l2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        return AbstractC5244c.m10328m(this, C6745a.m12919j(j6), C6745a.m12920k(j6), C6745a.m12917h(j6), C6745a.m12918i(j6), l0Var.e0(this.f25848a.mo10336a()), l0Var, list, new t3.w0[list.size()], 0, list.size(), null, 0);
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25848a.mo10336a());
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
            int iA0 = i0Var.a0(i10);
            if (fM10327l == DefinitionKt.NO_Float_VALUE) {
                i11 += iA0;
            } else if (fM10327l > DefinitionKt.NO_Float_VALUE) {
                f6 += fM10327l;
                iMax = Math.max(iMax, Math.round(iA0 / fM10327l));
            }
        }
        return ((list.size() - 1) * iE0) + Math.round(iMax * f6) + i11;
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iE0 = interfaceC7028o.e0(this.f25848a.mo10336a());
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
                int iMin2 = Math.min(i0Var.mo13311b(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, i0Var.mo13312x(iMin2));
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
                iMax = Math.max(iMax, i0Var2.mo13312x(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM10327l2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f25848a + ", horizontalAlignment=" + this.f25849b + ')';
    }
}
