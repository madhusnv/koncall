package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class vee {

    /* renamed from: a */
    public static final Object f50243a = new Object();

    /* renamed from: b */
    public static final Object f50244b = new Object();

    /* renamed from: a */
    public static final Object m52675a(Map map, Object obj) {
        sq8.m48649h(map, "<this>");
        List list = (List) map.get(obj);
        if (list == null) {
            return null;
        }
        Object objM30448H = hh3.m30448H(list);
        if (!list.isEmpty()) {
            return objM30448H;
        }
        map.remove(obj);
        return objM30448H;
    }
}
