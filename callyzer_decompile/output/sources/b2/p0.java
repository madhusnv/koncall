package b2;

import java.util.ArrayList;
import java.util.List;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 implements t3.j0 {

    /* renamed from: a */
    public static final p0 f3799a = new p0();

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            t3.w0 w0VarMo13314z = ((t3.i0) list.get(i10)).mo13314z(j6);
            iMax = Math.max(iMax, w0VarMo13314z.f34030a);
            iMax2 = Math.max(iMax2, w0VarMo13314z.f34031b);
            arrayList.add(w0VarMo13314z);
        }
        return l0Var.g0(iMax, iMax2, C6669s.f31944a, new o0(0, arrayList));
    }
}
