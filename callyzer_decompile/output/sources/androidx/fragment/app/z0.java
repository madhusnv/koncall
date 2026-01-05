package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import p004e.AbstractC1887v;
import p004e.C1866a;
import p7.C5838i;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends AbstractC1887v {

    /* renamed from: d */
    public final /* synthetic */ j1 f2761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var) {
        super(false);
        this.f2761d = j1Var;
    }

    @Override // p004e.AbstractC1887v
    /* renamed from: a */
    public final void mo1275a() {
        boolean zM1152K = j1.m1152K(3);
        j1 j1Var = this.f2761d;
        if (zM1152K) {
            Objects.toString(j1Var);
        }
        if (j1.m1152K(3)) {
            Objects.toString(j1Var.f2586h);
        }
        C0336a c0336a = j1Var.f2586h;
        if (c0336a != null) {
            c0336a.f2452s = false;
            c0336a.m1089d();
            C0336a c0336a2 = j1Var.f2586h;
            RunnableC0359x runnableC0359x = new RunnableC0359x(2, j1Var);
            if (c0336a2.f2450q == null) {
                c0336a2.f2450q = new ArrayList();
            }
            c0336a2.f2450q.add(runnableC0359x);
            j1Var.f2586h.m1090e();
            j1Var.f2587i = true;
            j1Var.m1201z(true);
            j1Var.m1159F();
            j1Var.f2587i = false;
            j1Var.f2586h = null;
        }
    }

    @Override // p004e.AbstractC1887v
    /* renamed from: b */
    public final void mo1276b() {
        boolean zM1152K = j1.m1152K(3);
        j1 j1Var = this.f2761d;
        if (zM1152K) {
            Objects.toString(j1Var);
        }
        z0 z0Var = j1Var.f2588j;
        ArrayList arrayList = j1Var.f2592n;
        j1Var.f2587i = true;
        j1Var.m1201z(true);
        int i10 = 0;
        j1Var.f2587i = false;
        if (j1Var.f2586h == null) {
            if (z0Var.f8901a) {
                j1.m1152K(3);
                j1Var.m1167R();
                return;
            } else {
                j1.m1152K(3);
                j1Var.f2585g.m5502c();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(j1.m1151G(j1Var.f2586h));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                C5838i c5838i = (C5838i) obj;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    c5838i.m11413a((j0) it.next(), true);
                }
            }
        }
        ArrayList arrayList2 = j1Var.f2586h.f2434a;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            j0 j0Var = ((u1) obj2).f2712b;
            if (j0Var != null) {
                j0Var.mTransitioning = false;
            }
        }
        Iterator it2 = j1Var.m1181f(new ArrayList(Collections.singletonList(j1Var.f2586h)), 0, 1).iterator();
        while (it2.hasNext()) {
            C0352q c0352q = (C0352q) it2.next();
            c0352q.getClass();
            j1.m1152K(3);
            ArrayList arrayList3 = c0352q.f2676c;
            c0352q.m1243m(arrayList3);
            c0352q.m1236c(arrayList3);
        }
        ArrayList arrayList4 = j1Var.f2586h.f2434a;
        int size3 = arrayList4.size();
        while (i10 < size3) {
            Object obj3 = arrayList4.get(i10);
            i10++;
            j0 j0Var2 = ((u1) obj3).f2712b;
            if (j0Var2 != null && j0Var2.mContainer == null) {
                j1Var.m1182g(j0Var2).m1254i();
            }
        }
        j1Var.f2586h = null;
        j1Var.e0();
        if (j1.m1152K(3)) {
            boolean z6 = z0Var.f8901a;
            j1Var.toString();
        }
    }

    @Override // p004e.AbstractC1887v
    /* renamed from: c */
    public final void mo1277c(C1866a backEvent) {
        boolean zM1152K = j1.m1152K(2);
        j1 j1Var = this.f2761d;
        if (zM1152K) {
            Objects.toString(j1Var);
        }
        if (j1Var.f2586h != null) {
            int i10 = 0;
            Iterator it = j1Var.m1181f(new ArrayList(Collections.singletonList(j1Var.f2586h)), 0, 1).iterator();
            while (it.hasNext()) {
                C0352q c0352q = (C0352q) it.next();
                c0352q.getClass();
                AbstractC4154l.m8923f(backEvent, "backEvent");
                j1.m1152K(2);
                ArrayList arrayList = c0352q.f2676c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    AbstractC6663m.m12765x(arrayList2, ((h2) obj).f2555k);
                }
                List listC0 = AbstractC6663m.c0(AbstractC6663m.g0(arrayList2));
                int size2 = listC0.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((g2) listC0.get(i12)).mo1135d(backEvent, c0352q.f2674a);
                }
            }
            ArrayList arrayList3 = j1Var.f2592n;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                ((C5838i) obj2).getClass();
            }
        }
    }

    @Override // p004e.AbstractC1887v
    /* renamed from: d */
    public final void mo1278d(C1866a c1866a) {
        boolean zM1152K = j1.m1152K(3);
        j1 j1Var = this.f2761d;
        if (zM1152K) {
            Objects.toString(j1Var);
        }
        j1Var.m1198w();
        j1Var.m1199x(new h1(j1Var), false);
    }
}
