package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class bsi {
    /* renamed from: a */
    public static final Map m19701a(Map map) {
        sq8.m48649h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), kh3.T0((List) entry.getValue()));
        }
        return linkedHashMap;
    }
}
