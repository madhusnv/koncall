package g2;

import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.List;
import mm.AbstractC4801l;
import og.af;
import rw.AbstractC6663m;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.AbstractC7016c;
import t3.InterfaceC7028o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s6 implements t3.o0 {
    /* renamed from: a */
    public static int m6304a(InterfaceC7028o interfaceC7028o, ArrayList arrayList, int i10, InterfaceC2141e interfaceC2141e) {
        int iIntValue;
        int iIntValue2;
        int i11 = i10;
        List list = (List) arrayList.get(0);
        int i12 = 1;
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iE0 = interfaceC7028o.e0(n6.f12194c + n6.f12195d);
        if (i11 != Integer.MAX_VALUE) {
            i11 -= iE0;
        }
        t3.i0 i0Var = (t3.i0) AbstractC6663m.m12743G(list4);
        if (i0Var != null) {
            iIntValue = ((Number) interfaceC2141e.invoke(i0Var, Integer.valueOf(i11))).intValue();
            int iMo13313y = i0Var.mo13313y(Integer.MAX_VALUE);
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iMo13313y;
            }
        } else {
            iIntValue = 0;
        }
        t3.i0 i0Var2 = (t3.i0) AbstractC6663m.m12743G(list5);
        if (i0Var2 != null) {
            iIntValue2 = ((Number) interfaceC2141e.invoke(i0Var2, Integer.valueOf(i11))).intValue();
            int iMo13313y2 = i0Var2.mo13313y(Integer.MAX_VALUE);
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iMo13313y2;
            }
        } else {
            iIntValue2 = 0;
        }
        Object obj = (t3.i0) AbstractC6663m.m12743G(list2);
        int iIntValue3 = obj != null ? ((Number) interfaceC2141e.invoke(obj, Integer.valueOf(i11))).intValue() : 0;
        Object obj2 = (t3.i0) AbstractC6663m.m12743G(list);
        int iIntValue4 = obj2 != null ? ((Number) interfaceC2141e.invoke(obj2, Integer.valueOf(i11))).intValue() : 0;
        Object obj3 = (t3.i0) AbstractC6663m.m12743G(list3);
        int iIntValue5 = obj3 != null ? ((Number) interfaceC2141e.invoke(obj3, Integer.valueOf(i11))).intValue() : 0;
        boolean z6 = iIntValue5 > interfaceC7028o.mo8436Z(af.m10534c(30));
        boolean z10 = iIntValue3 > 0;
        boolean z11 = iIntValue5 > 0;
        if ((z10 && z11) || z6) {
            i12 = 3;
        } else if (z10 || z11) {
            i12 = 2;
        }
        return n6.m6220d(interfaceC7028o, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i12, interfaceC7028o.e0((i12 == 3 ? n6.f12193b : n6.f12192a) * 2), AbstractC6746b.m12924b(0, 0, 15));
    }

    /* renamed from: b */
    public static int m6305b(InterfaceC7028o interfaceC7028o, ArrayList arrayList, int i10, InterfaceC2141e interfaceC2141e) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        t3.i0 i0Var = (t3.i0) AbstractC6663m.m12743G(list4);
        int iIntValue = i0Var != null ? ((Number) interfaceC2141e.invoke(i0Var, Integer.valueOf(i10))).intValue() : 0;
        t3.i0 i0Var2 = (t3.i0) AbstractC6663m.m12743G(list5);
        int iIntValue2 = i0Var2 != null ? ((Number) interfaceC2141e.invoke(i0Var2, Integer.valueOf(i10))).intValue() : 0;
        t3.i0 i0Var3 = (t3.i0) AbstractC6663m.m12743G(list);
        int iIntValue3 = i0Var3 != null ? ((Number) interfaceC2141e.invoke(i0Var3, Integer.valueOf(i10))).intValue() : 0;
        t3.i0 i0Var4 = (t3.i0) AbstractC6663m.m12743G(list2);
        int iIntValue4 = i0Var4 != null ? ((Number) interfaceC2141e.invoke(i0Var4, Integer.valueOf(i10))).intValue() : 0;
        t3.i0 i0Var5 = (t3.i0) AbstractC6663m.m12743G(list3);
        int iIntValue5 = i0Var5 != null ? ((Number) interfaceC2141e.invoke(i0Var5, Integer.valueOf(i10))).intValue() : 0;
        int iE0 = interfaceC7028o.e0(n6.f12194c + n6.f12195d);
        long jM12924b = AbstractC6746b.m12924b(0, 0, 15);
        return C6745a.m12914e(jM12924b) ? C6745a.m12918i(jM12924b) : AbstractC4801l.m9725C(iE0, iIntValue, Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)), iIntValue2);
    }

    @Override // t3.o0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6304a(interfaceC7028o, (ArrayList) list, i10, o6.f12283a);
    }

    @Override // t3.o0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6305b(interfaceC7028o, (ArrayList) list, i10, p6.f12408a);
    }

    @Override // t3.o0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16690measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        List list2;
        List list3;
        t3.w0 w0VarMo13314z;
        int i10;
        t3.w0 w0VarMo13314z2;
        float f6;
        t3.w0 w0VarMo13314z3;
        int i11;
        int i12;
        ArrayList arrayList = (ArrayList) list;
        List list4 = (List) arrayList.get(0);
        List list5 = (List) arrayList.get(1);
        List list6 = (List) arrayList.get(2);
        List list7 = (List) arrayList.get(3);
        List list8 = (List) arrayList.get(4);
        long jM12911b = C6745a.m12911b(j6, 0, 0, 0, 0, 10);
        float f10 = n6.f12194c;
        float f11 = n6.f12195d;
        int iE0 = l0Var.e0(f10 + f11);
        t3.i0 i0Var = (t3.i0) AbstractC6663m.m12743G(list7);
        int iMo13312x = i0Var != null ? i0Var.mo13312x(C6745a.m12917h(j6)) : 0;
        t3.i0 i0Var2 = (t3.i0) AbstractC6663m.m12743G(list8);
        int iMo13312x2 = i0Var2 != null ? i0Var2.mo13312x(C6745a.m12917h(j6)) : 0;
        int iM12918i = C6745a.m12918i(jM12911b);
        int i13 = iMo13312x + iMo13312x2 + iE0;
        if (iM12918i != Integer.MAX_VALUE) {
            iM12918i -= i13;
        }
        t3.i0 i0Var3 = (t3.i0) AbstractC6663m.m12743G(list6);
        float f12 = (((AbstractC6663m.m12743G(list5) != null) && (AbstractC6663m.m12743G(list6) != null)) || ((i0Var3 != null ? i0Var3.a0(iM12918i) : 0) > l0Var.mo8436Z(af.m10534c(30)))) ? n6.f12193b : n6.f12192a;
        float f13 = 2;
        long jM12931i = AbstractC6746b.m12931i(-iE0, -l0Var.e0(f12 * f13), jM12911b);
        t3.i0 i0Var4 = (t3.i0) AbstractC6663m.m12743G(list7);
        t3.w0 w0VarMo13314z4 = i0Var4 != null ? i0Var4.mo13314z(jM12931i) : null;
        float f14 = h2.s0.f15774b;
        int i14 = w0VarMo13314z4 != null ? w0VarMo13314z4.f34030a : 0;
        t3.i0 i0Var5 = (t3.i0) AbstractC6663m.m12743G(list8);
        if (i0Var5 != null) {
            list2 = list4;
            list3 = list5;
            w0VarMo13314z = i0Var5.mo13314z(AbstractC6746b.m12932j(-i14, 0, 2, jM12931i));
        } else {
            list2 = list4;
            list3 = list5;
            w0VarMo13314z = null;
        }
        int i15 = i14 + (w0VarMo13314z != null ? w0VarMo13314z.f34030a : 0);
        t3.i0 i0Var6 = (t3.i0) AbstractC6663m.m12743G(list2);
        if (i0Var6 != null) {
            i10 = 2;
            w0VarMo13314z2 = i0Var6.mo13314z(AbstractC6746b.m12932j(-i15, 0, 2, jM12931i));
        } else {
            i10 = 2;
            w0VarMo13314z2 = null;
        }
        int i16 = w0VarMo13314z2 != null ? w0VarMo13314z2.f34031b : 0;
        t3.i0 i0Var7 = (t3.i0) AbstractC6663m.m12743G(list6);
        if (i0Var7 != null) {
            f6 = f13;
            w0VarMo13314z3 = i0Var7.mo13314z(AbstractC6746b.m12931i(-i15, -i16, jM12931i));
        } else {
            f6 = f13;
            w0VarMo13314z3 = null;
        }
        int i17 = i16 + (w0VarMo13314z3 != null ? w0VarMo13314z3.f34031b : 0);
        boolean z6 = (w0VarMo13314z3 == null || w0VarMo13314z3.d0(AbstractC7016c.f33966a) == w0VarMo13314z3.d0(AbstractC7016c.f33967b)) ? false : true;
        t3.i0 i0Var8 = (t3.i0) AbstractC6663m.m12743G(list3);
        t3.w0 w0VarMo13314z5 = i0Var8 != null ? i0Var8.mo13314z(AbstractC6746b.m12931i(-i15, -i17, jM12931i)) : null;
        boolean z10 = w0VarMo13314z5 != null;
        boolean z11 = w0VarMo13314z3 != null;
        if ((z10 && z11) || z6) {
            i12 = 3;
            i11 = 3;
        } else if (z10 || z11) {
            i11 = i10;
            i12 = 3;
        } else {
            i12 = 3;
            i11 = 1;
        }
        float f15 = i11 == i12 ? n6.f12193b : n6.f12192a;
        float f16 = f15 * f6;
        int i18 = i11;
        int iM12918i2 = C6745a.m12914e(j6) ? C6745a.m12918i(j6) : AbstractC4801l.m9725C(iE0, w0VarMo13314z4 != null ? w0VarMo13314z4.f34030a : 0, Math.max(w0VarMo13314z2 != null ? w0VarMo13314z2.f34030a : 0, Math.max(w0VarMo13314z5 != null ? w0VarMo13314z5.f34030a : 0, w0VarMo13314z3 != null ? w0VarMo13314z3.f34030a : 0)), w0VarMo13314z != null ? w0VarMo13314z.f34030a : 0);
        t3.w0 w0Var = w0VarMo13314z2;
        t3.w0 w0Var2 = w0VarMo13314z5;
        int iM6220d = n6.m6220d(l0Var, w0VarMo13314z4 != null ? w0VarMo13314z4.f34031b : 0, w0VarMo13314z != null ? w0VarMo13314z.f34031b : 0, w0VarMo13314z2 != null ? w0VarMo13314z2.f34031b : 0, w0VarMo13314z5 != null ? w0VarMo13314z5.f34031b : 0, w0VarMo13314z3 != null ? w0VarMo13314z3.f34031b : 0, i18, l0Var.e0(f16), j6);
        return l0Var.g0(iM12918i2, iM6220d, C6669s.f31944a, new m6(w0VarMo13314z4, w0VarMo13314z, l0Var.e0(f10), i18 == 3, l0Var.e0(f15), w0Var, w0Var2, w0VarMo13314z3, iM6220d, iM12918i2, l0Var.e0(f11)));
    }

    @Override // t3.o0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6304a(interfaceC7028o, (ArrayList) list, i10, q6.f12488a);
    }

    @Override // t3.o0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return m6305b(interfaceC7028o, (ArrayList) list, i10, r6.f12593a);
    }
}
