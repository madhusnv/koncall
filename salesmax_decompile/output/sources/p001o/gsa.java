package p001o;

import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public abstract class gsa {
    /* renamed from: a */
    public static final Object m29448a(Map map, Object obj) {
        sq8.m48649h(map, "<this>");
        if (map instanceof zra) {
            return ((zra) map).m59790x(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
