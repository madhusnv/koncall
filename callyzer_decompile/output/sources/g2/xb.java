package g2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4165w;
import pg.AbstractC5939t;
import rw.C6669s;
import s4.C6745a;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class xb implements t3.o0 {

    /* renamed from: a */
    public final /* synthetic */ float f13263a;

    /* renamed from: b */
    public final /* synthetic */ yb f13264b;

    /* renamed from: c */
    public final /* synthetic */ int f13265c;

    /* renamed from: d */
    public final /* synthetic */ w9 f13266d;

    public xb(float f6, yb ybVar, int i10, w9 w9Var) {
        this.f13263a = f6;
        this.f13264b = ybVar;
        this.f13265c = i10;
        this.f13266d = w9Var;
    }

    @Override // t3.o0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16690measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        float f6 = this.f13263a;
        int iE0 = l0Var.e0(f6);
        int size = list2.size();
        int iE02 = l0Var.e0(dc.f11411a);
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((t3.i0) list2.get(i10)).mo13311b(Integer.MAX_VALUE)));
        }
        int iIntValue = numValueOf.intValue();
        int i11 = iE0 * 2;
        long jM12911b = C6745a.m12911b(j6, iE02, 0, iIntValue, iIntValue, 2);
        C4165w c4165w = new C4165w();
        c4165w.f21161a = f6;
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList2.add(((t3.i0) list2.get(i12)).mo13314z(jM12911b));
        }
        ArrayList arrayList3 = new ArrayList(size);
        int iE03 = i11;
        for (int i13 = 0; i13 < size; i13++) {
            float f10 = ((C6750f) AbstractC5939t.m11867b(new C6750f(dc.f11411a), new C6750f(l0Var.mo8433F(((t3.w0) arrayList2.get(i13)).f34030a)))).f32201a;
            iE03 = l0Var.e0(f10) + iE03;
            float f11 = ((C6750f) AbstractC5939t.m11867b(new C6750f(f10 - (rb.f12617c * 2)), new C6750f(24))).f32201a;
            float f12 = c4165w.f21161a;
            sb sbVar = new sb(f12, f10, f11);
            c4165w.f21161a = f12 + f10;
            arrayList3.add(sbVar);
        }
        this.f13264b.f13333a.setValue(arrayList3);
        ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i14 = 0; i14 < size4; i14++) {
            arrayList4.add(((t3.i0) list3.get(i14)).mo13314z(C6745a.m12911b(j6, iE03, iE03, 0, 0, 8)));
        }
        int i15 = iE03;
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        int i16 = 0;
        while (i16 < size5) {
            arrayList5.add(((t3.i0) list4.get(i16)).mo13314z(C6745a.m12910a(0, l0Var.e0(((sb) arrayList3.get(this.f13265c)).f12719b), 0, iIntValue)));
            i16++;
            list4 = list4;
            arrayList3 = arrayList3;
        }
        return l0Var.g0(i15, iIntValue, C6669s.f31944a, new wb(c4165w, this.f13263a, arrayList2, arrayList4, arrayList5, this.f13266d, l0Var, iE0, arrayList3, this.f13265c, iIntValue));
    }
}
