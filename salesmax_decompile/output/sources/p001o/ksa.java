package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ksa extends jsa {
    /* renamed from: x */
    public static final ief m36187x(Map map) {
        sq8.m48649h(map, "<this>");
        return kh3.m35706V(map.entrySet());
    }

    /* renamed from: y */
    public static final List m36188y(Map map) {
        sq8.m48649h(map, "<this>");
        if (map.size() == 0) {
            return ch3.m21246k();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ch3.m21246k();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return bh3.m18963e(new hwc(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new hwc(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new hwc(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
