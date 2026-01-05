package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: j$.time.format.y */
/* loaded from: classes2.dex */
public final class C3455y {

    /* renamed from: a */
    public final Map f18214a;

    /* renamed from: b */
    public final Map f18215b;

    public C3455y(Map map) {
        this.f18214a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l9 = (Long) entry2.getKey();
                ConcurrentMap concurrentMap = C3456z.f18216a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l9));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C3456z.f18217b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C3456z.f18217b);
        this.f18215b = map2;
    }

    /* renamed from: a */
    public final String m7993a(long j6, TextStyle textStyle) {
        Map map = (Map) this.f18214a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j6));
        }
        return null;
    }
}
