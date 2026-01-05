package g2;

import androidx.compose.ui.layout.AbstractC0264a;
import java.util.ArrayList;
import java.util.List;
import rw.C6669s;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class xc implements t3.j0 {

    /* renamed from: a */
    public final /* synthetic */ float f13267a;

    public xc(float f6) {
        this.f13267a = f6;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        Object obj;
        Object obj2;
        float fMo8435T = l0Var.mo8435T(this.f13267a);
        int i10 = 0;
        long jM12911b = C6745a.m12911b(j6, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj3 = list.get(i11);
            t3.i0 i0Var = (t3.i0) obj3;
            if (AbstractC0264a.m720a(i0Var) != h6.Selector && AbstractC0264a.m720a(i0Var) != h6.InnerCircle) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(((t3.i0) arrayList.get(i12)).mo13314z(jM12911b));
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (AbstractC0264a.m720a((t3.i0) obj) == h6.Selector) {
                break;
            }
            i13++;
        }
        t3.i0 i0Var2 = (t3.i0) obj;
        int size4 = list.size();
        while (true) {
            if (i10 >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i10);
            if (AbstractC0264a.m720a((t3.i0) obj2) == h6.InnerCircle) {
                break;
            }
            i10++;
        }
        t3.i0 i0Var3 = (t3.i0) obj2;
        return l0Var.g0(C6745a.m12920k(j6), C6745a.m12919j(j6), C6669s.f31944a, new wc(i0Var2 != null ? i0Var2.mo13314z(jM12911b) : null, arrayList2, i0Var3 != null ? i0Var3.mo13314z(jM12911b) : null, j6, fMo8435T, 6.2831855f / arrayList2.size()));
    }
}
