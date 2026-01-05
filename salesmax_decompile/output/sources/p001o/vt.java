package p001o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import type.SearchableSortDirection;

/* loaded from: classes.dex */
public class vt extends jzf {

    /* renamed from: c */
    public static Map f50836c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f50836c = linkedHashMap;
        linkedHashMap.put("Activity Type", uyh.of("activityType", SearchableSortDirection.asc));
        f50836c.put("Created At", uyh.of("createdAt", SearchableSortDirection.desc));
    }

    /* renamed from: e */
    public Optional m53392e() {
        Optional optionalM34795a = m34795a();
        Map map = f50836c;
        Objects.requireNonNull(map);
        return optionalM34795a.map(new ut(map));
    }
}
