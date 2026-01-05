package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface bob extends Map, sb9 {

    /* renamed from: o.bob$a */
    public static final class C12466a {
        /* renamed from: a */
        public static kpb m19499a(bob bobVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : bobVar.entrySet()) {
                linkedHashMap.put(entry.getKey(), kh3.T0((List) entry.getValue()));
            }
            return new ptf(linkedHashMap);
        }
    }

    /* renamed from: i */
    ief mo19497i();

    /* renamed from: z */
    kpb mo19498z();
}
