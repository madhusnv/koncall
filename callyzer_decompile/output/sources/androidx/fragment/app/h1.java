package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import p7.C5838i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 implements f1 {

    /* renamed from: a */
    public final /* synthetic */ j1 f2544a;

    public h1(j1 j1Var) {
        this.f2544a = j1Var;
    }

    @Override // androidx.fragment.app.f1
    /* renamed from: a */
    public final boolean mo1086a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zM1169T;
        j1 j1Var = this.f2544a;
        ArrayList arrayList5 = j1Var.f2592n;
        if (j1.m1152K(2)) {
            Objects.toString(j1Var.f2579a);
        }
        int i10 = 0;
        if (j1Var.f2582d.isEmpty()) {
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zM1169T = false;
        } else {
            ArrayList arrayList6 = j1Var.f2582d;
            C0336a c0336a = (C0336a) arrayList6.get(arrayList6.size() - 1);
            j1Var.f2586h = c0336a;
            ArrayList arrayList7 = c0336a.f2434a;
            int size = arrayList7.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList7.get(i11);
                i11++;
                j0 j0Var = ((u1) obj).f2712b;
                if (j0Var != null) {
                    j0Var.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zM1169T = j1Var.m1169T(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                linkedHashSet.addAll(j1.m1151G((C0336a) obj2));
            }
            int size3 = arrayList5.size();
            while (i10 < size3) {
                Object obj3 = arrayList5.get(i10);
                i10++;
                C5838i c5838i = (C5838i) obj3;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    c5838i.m11414b((j0) it.next(), zBooleanValue);
                }
            }
        }
        return zM1169T;
    }
}
