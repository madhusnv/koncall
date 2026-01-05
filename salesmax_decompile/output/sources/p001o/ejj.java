package p001o;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ejj {

    /* renamed from: a */
    public static final Set f21769a = new HashSet(Arrays.asList("app_update", "review"));

    /* renamed from: b */
    public static final Set f21770b = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: c */
    public static final Map f21771c = new HashMap();

    /* renamed from: d */
    public static final sjj f21772d = new sjj("PlayCoreVersion");

    /* renamed from: a */
    public static synchronized Map m25161a(String str) {
        Map map;
        map = f21771c;
        if (!map.containsKey("app_update")) {
            HashMap map2 = new HashMap();
            map2.put("java", 11004);
            map.put("app_update", map2);
        }
        return (Map) map.get("app_update");
    }
}
