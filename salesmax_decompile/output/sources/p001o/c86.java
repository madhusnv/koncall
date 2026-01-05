package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class c86 {
    /* renamed from: a */
    public static final List m20440a(List list, List list2) {
        sq8.m48649h(list, "modeled");
        sq8.m48649h(list2, "endpointOptions");
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(d01.m22166d(((vz0) obj).mo53621a()), obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            vz0 vz0VarM56984a = (vz0) it.next();
            vz0 vz0Var = (vz0) linkedHashMap.get(d01.m22166d(vz0VarM56984a.mo53621a()));
            if (vz0Var != null && !vz0Var.getAttributes().isEmpty()) {
                tob tobVarM50745j = tx0.m50745j(vz0Var.getAttributes());
                tx0.m50739d(tobVarM50745j, vz0VarM56984a.getAttributes());
                vz0VarM56984a = xz0.m56984a(vz0VarM56984a.mo53621a(), tobVarM50745j);
            }
            arrayList.add(vz0VarM56984a);
        }
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(d01.m22166d(((vz0) it2.next()).mo53621a()));
        }
        Set setV0 = kh3.V0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!setV0.contains(d01.m22166d(((vz0) obj2).mo53621a()))) {
                arrayList3.add(obj2);
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
