package x1;

import java.util.ArrayList;
import java.util.List;
import rw.C6669s;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.e */
/* loaded from: classes.dex */
public final class C8255e implements t3.j0 {

    /* renamed from: b */
    public static final C8255e f39477b = new C8255e(0);

    /* renamed from: c */
    public static final C8255e f39478c = new C8255e(1);

    /* renamed from: a */
    public final /* synthetic */ int f39479a;

    public /* synthetic */ C8255e(int i10) {
        this.f39479a = i10;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        switch (this.f39479a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((t3.i0) list.get(i10)).mo13314z(j6));
                }
                return l0Var.g0(C6745a.m12918i(j6), C6745a.m12917h(j6), C6669s.f31944a, new b2.o0(10, arrayList));
            default:
                return l0Var.g0(C6745a.m12918i(j6), C6745a.m12917h(j6), C6669s.f31944a, C8259i.f39522f);
        }
    }
}
