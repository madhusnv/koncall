package p001o;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class w50 {
    /* renamed from: b */
    public static Map m53970b(Map map) {
        sq8.m48649h(map, "extras");
        return map;
    }

    /* renamed from: c */
    public static String m53971c(Map map) {
        return kh3.p0(map.entrySet(), " ", null, null, 0, null, new xk7() { // from class: o.v50
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return w50.m53972d((Map.Entry) obj);
            }
        }, 30, null);
    }

    /* renamed from: d */
    public static final CharSequence m53972d(Map.Entry entry) {
        sq8.m48649h(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (e9g.m24606x((String) value, "true", true)) {
            value = null;
        }
        return i91.m31759d("md", str, (String) value);
    }
}
