package c0;

import a2.AbstractC0030c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.r */
/* loaded from: classes.dex */
public final class C0825r {

    /* renamed from: b */
    public static final C0825r f5202b;

    /* renamed from: c */
    public static final C0825r f5203c;

    /* renamed from: a */
    public final LinkedHashSet f5204a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new i0.f1(0));
        f5202b = new C0825r(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new i0.f1(1));
        f5203c = new C0825r(linkedHashSet2);
    }

    public C0825r(LinkedHashSet linkedHashSet) {
        this.f5204a = linkedHashSet;
    }

    /* renamed from: a */
    public final ArrayList m2225a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f5204a.iterator();
        while (it.hasNext()) {
            InterfaceC0822o interfaceC0822o = (InterfaceC0822o) it.next();
            List<i0.e0> listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            i0.f1 f1Var = (i0.f1) interfaceC0822o;
            f1Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (i0.e0 e0Var : listUnmodifiableList) {
                og.y0.m11051a("The camera info doesn't contain internal implementation.", e0Var instanceof i0.e0);
                if (e0Var.mo7326i() == f1Var.f16454b) {
                    arrayList3.add(e0Var);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    /* renamed from: b */
    public final Integer m2226b() {
        Iterator it = this.f5204a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0822o interfaceC0822o = (InterfaceC0822o) it.next();
            if (interfaceC0822o instanceof i0.f1) {
                Integer numValueOf = Integer.valueOf(((i0.f1) interfaceC0822o).f16454b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: c */
    public final i0.g0 m2227c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0.g0) it.next()).mo2207c());
        }
        ArrayList arrayListM2225a = m2225a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            i0.g0 g0Var = (i0.g0) it2.next();
            if (arrayListM2225a.contains(g0Var.mo2207c())) {
                linkedHashSet2.add(g0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (i0.g0) it3.next();
        }
        StringBuilder sb2 = new StringBuilder("Cams:");
        sb2.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            i0.e0 e0VarMo7319q = ((i0.g0) it4.next()).mo7319q();
            sb2.append(" Id:" + e0VarMo7319q.mo7323e() + "  Lens:" + e0VarMo7319q.mo7326i());
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.f5204a;
        sb3.append("PhyId:null  Filters:" + linkedHashSet3.size());
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            InterfaceC0822o interfaceC0822o = (InterfaceC0822o) it5.next();
            sb3.append(" Id:");
            interfaceC0822o.getClass();
            sb3.append(InterfaceC0822o.f5183a);
            if (interfaceC0822o instanceof i0.f1) {
                sb3.append(" LensFilter:");
                sb3.append(((i0.f1) interfaceC0822o).f16454b);
            }
        }
        throw new IllegalArgumentException(AbstractC0030c.m121l("No available camera can be found. ", string, " ", sb3.toString()));
    }
}
