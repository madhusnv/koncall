package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class lpb {
    /* renamed from: a */
    public static final kpb m37590a(hwc... hwcVarArr) {
        sq8.m48649h(hwcVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (hwc hwcVar : hwcVarArr) {
            Object objM31229c = hwcVar.m31229c();
            Object arrayList = linkedHashMap.get(objM31229c);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objM31229c, arrayList);
            }
            ((List) arrayList).add(hwcVar.m31230d());
        }
        return new ptf(linkedHashMap);
    }
}
