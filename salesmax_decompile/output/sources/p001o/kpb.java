package p001o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface kpb extends Map, wb9 {

    /* renamed from: o.kpb$a */
    public static final class C14898a {
        /* renamed from: a */
        public static void m36038a(kpb kpbVar, Map map) {
            sq8.m48649h(map, "other");
            for (Map.Entry entry : map.entrySet()) {
                kpbVar.mo20278m(entry.getKey(), (List) entry.getValue());
            }
        }

        /* renamed from: b */
        public static List m36039b(kpb kpbVar, Object obj, Object obj2) {
            return (List) kpbVar.put((kpb) obj, (Object) ch3.m21252q(obj2));
        }

        /* renamed from: c */
        public static bob m36040c(kpb kpbVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(kpbVar.size()));
            for (Map.Entry entry : kpbVar.entrySet()) {
                linkedHashMap.put(entry.getKey(), kh3.Q0((List) entry.getValue()));
            }
            return new otf(isa.m32693t(linkedHashMap));
        }
    }

    /* renamed from: E */
    boolean mo20265E(Object obj, Object obj2);

    /* renamed from: i */
    ief mo20275i();

    /* renamed from: l */
    bob mo20277l();

    /* renamed from: m */
    boolean mo20278m(Object obj, Collection collection);

    @Override // java.util.Map
    List put(Object obj, Object obj2);

    /* renamed from: q */
    void mo20281q(Map map);
}
