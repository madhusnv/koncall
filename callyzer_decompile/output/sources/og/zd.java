package og;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class zd {

    /* renamed from: a */
    public static final /* synthetic */ int f27046a = 0;

    /* renamed from: a */
    public static final LinkedHashMap m11094a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (AbstractC5185w.m10138t((String) entry.getKey(), str, false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC6674x.m12776d(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String strSubstring = ((String) entry2.getKey()).substring(str.length());
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            linkedHashMap2.put(strSubstring, entry2.getValue());
        }
        return linkedHashMap2;
    }
}
