package p001o;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class aj8 {
    /* renamed from: a */
    public static Object m17201a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m17202b(Object obj, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m17201a(obj);
    }

    /* renamed from: c */
    public static final Object m17203c(Object obj, Object obj2) {
        if (obj == null) {
            return m17201a(obj2);
        }
        if (obj instanceof ArrayList) {
            sq8.m48647f(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(obj2);
            return m17201a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return m17201a(arrayList);
    }
}
