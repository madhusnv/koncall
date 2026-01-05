package p001o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class z89 {
    /* renamed from: a */
    public static final String m58938a(h7f h7fVar) {
        Object next;
        sq8.m48649h(h7fVar, "<this>");
        Iterator it = h7fVar.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((hu6) next).getClass() == na9.class) {
                break;
            }
        }
        hu6 hu6Var = (hu6) next;
        if (hu6Var != null) {
            return ((na9) hu6Var).m40278a();
        }
        throw new IllegalArgumentException(("Expected to find trait " + kge.m35689b(na9.class) + " in " + h7fVar + " but was not present.").toString());
    }
}
