package p001o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import type.SearchableSortDirection;

/* loaded from: classes.dex */
public class mw9 extends jzf {

    /* renamed from: c */
    public static Map f36050c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f36050c = linkedHashMap;
        SearchableSortDirection searchableSortDirection = SearchableSortDirection.desc;
        linkedHashMap.put("Last Called Time", uyh.of("lastCalledTime", searchableSortDirection));
        f36050c.put("Last Assigned", uyh.of("lastEngagementFromAccount", searchableSortDirection));
        f36050c.put("Lead Name", uyh.of("name", SearchableSortDirection.asc));
        f36050c.put("Created At", uyh.of("createdAt", searchableSortDirection));
        f36050c.put("Updated At", uyh.of("updatedAt", searchableSortDirection));
    }

    /* renamed from: e */
    public Optional m39735e() {
        Optional optionalM34795a = m34795a();
        Map map = f36050c;
        Objects.requireNonNull(map);
        return optionalM34795a.map(new ut(map));
    }
}
