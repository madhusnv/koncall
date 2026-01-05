package t3;

import a2.C0037j;
import java.util.ArrayList;
import java.util.List;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends v3.d0 {

    /* renamed from: b */
    public static final z0 f34054b = new z0("Undefined intrinsics block and it is required");

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final k0 mo16554measure3p2s80s(l0 l0Var, List list, long j6) {
        int size = list.size();
        C6669s c6669s = C6669s.f31944a;
        if (size == 0) {
            return l0Var.g0(C6745a.m12920k(j6), C6745a.m12919j(j6), c6669s, x0.f34038c);
        }
        if (size == 1) {
            w0 w0VarMo13314z = ((i0) list.get(0)).mo13314z(j6);
            return l0Var.g0(AbstractC6746b.m12929g(w0VarMo13314z.f34030a, j6), AbstractC6746b.m12928f(w0VarMo13314z.f34031b, j6), c6669s, new C0037j(w0VarMo13314z, 14));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            w0 w0VarMo13314z2 = ((i0) list.get(i10)).mo13314z(j6);
            iMax = Math.max(w0VarMo13314z2.f34030a, iMax);
            iMax2 = Math.max(w0VarMo13314z2.f34031b, iMax2);
            arrayList.add(w0VarMo13314z2);
        }
        return l0Var.g0(AbstractC6746b.m12929g(iMax, j6), AbstractC6746b.m12928f(iMax2, j6), c6669s, new b2.o0(6, arrayList));
    }
}
