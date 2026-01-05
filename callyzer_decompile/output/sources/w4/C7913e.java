package w4;

import a2.C0037j;
import b2.o0;
import java.util.ArrayList;
import java.util.List;
import rw.C6669s;
import s4.C6745a;
import t3.i0;
import t3.j0;
import t3.k0;
import t3.l0;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.e */
/* loaded from: classes.dex */
public final class C7913e implements j0 {

    /* renamed from: b */
    public static final C7913e f38086b = new C7913e(0);

    /* renamed from: c */
    public static final C7913e f38087c = new C7913e(1);

    /* renamed from: a */
    public final /* synthetic */ int f38088a;

    public /* synthetic */ C7913e(int i10) {
        this.f38088a = i10;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final k0 mo16554measure3p2s80s(l0 l0Var, List list, long j6) {
        switch (this.f38088a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM12920k = 0;
                int iM12919j = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    w0 w0VarMo13314z = ((i0) list.get(i10)).mo13314z(j6);
                    iM12920k = Math.max(iM12920k, w0VarMo13314z.f34030a);
                    iM12919j = Math.max(iM12919j, w0VarMo13314z.f34031b);
                    arrayList.add(w0VarMo13314z);
                }
                if (list.isEmpty()) {
                    iM12920k = C6745a.m12920k(j6);
                    iM12919j = C6745a.m12919j(j6);
                }
                return l0Var.g0(iM12920k, iM12919j, C6669s.f31944a, new o0(8, arrayList));
            default:
                int size2 = list.size();
                C6669s c6669s = C6669s.f31944a;
                if (size2 == 0) {
                    return l0Var.g0(0, 0, c6669s, C7911c.f38079f);
                }
                if (size2 == 1) {
                    w0 w0VarMo13314z2 = ((i0) list.get(0)).mo13314z(j6);
                    return l0Var.g0(w0VarMo13314z2.f34030a, w0VarMo13314z2.f34031b, c6669s, new C0037j(w0VarMo13314z2, 15));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i11 = 0; i11 < size3; i11++) {
                    w0 w0VarMo13314z3 = ((i0) list.get(i11)).mo13314z(j6);
                    iMax = Math.max(iMax, w0VarMo13314z3.f34030a);
                    iMax2 = Math.max(iMax2, w0VarMo13314z3.f34031b);
                    arrayList2.add(w0VarMo13314z3);
                }
                return l0Var.g0(iMax, iMax2, c6669s, new o0(9, arrayList2));
        }
    }
}
