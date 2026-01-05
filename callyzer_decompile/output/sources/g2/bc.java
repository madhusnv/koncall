package g2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4166x;
import pg.AbstractC5939t;
import rw.C6669s;
import s4.C6745a;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class bc implements t3.o0 {

    /* renamed from: a */
    public final /* synthetic */ cc f11268a;

    public bc(cc ccVar) {
        this.f11268a = ccVar;
    }

    @Override // t3.o0
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final t3.k0 mo16690measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int iM12918i = C6745a.m12918i(j6);
        int size = list2.size();
        C4166x c4166x = new C4166x();
        if (size > 0) {
            c4166x.f21162a = iM12918i / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            numValueOf = Integer.valueOf(Math.max(((t3.i0) list2.get(i10)).mo13311b(c4166x.f21162a), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(new sb(l0Var.mo8433F(c4166x.f21162a) * i11, l0Var.mo8433F(c4166x.f21162a), ((C6750f) AbstractC5939t.m11867b(new C6750f(l0Var.mo8433F(Math.min(((t3.i0) list2.get(i11)).mo13313y(iIntValue), c4166x.f21162a)) - (rb.f12617c * 2)), new C6750f(24))).f32201a));
        }
        this.f11268a.f11330a.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            t3.i0 i0Var = (t3.i0) list2.get(i12);
            int i13 = c4166x.f21162a;
            arrayList3.add(i0Var.mo13314z(C6745a.m12910a(i13, i13, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i14 = 0;
        for (int size4 = list3.size(); i14 < size4; size4 = size4) {
            arrayList4.add(((t3.i0) list3.get(i14)).mo13314z(C6745a.m12911b(j6, 0, 0, 0, 0, 11)));
            i14++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int i15 = 0;
        for (int size5 = list4.size(); i15 < size5; size5 = size5) {
            t3.i0 i0Var2 = (t3.i0) list4.get(i15);
            int i16 = c4166x.f21162a;
            arrayList5.add(i0Var2.mo13314z(C6745a.m12910a(i16, i16, 0, iIntValue)));
            i15++;
            list4 = list4;
        }
        return l0Var.g0(iM12918i, iIntValue, C6669s.f31944a, new b3.k0(arrayList3, arrayList4, arrayList5, c4166x, iIntValue));
    }
}
