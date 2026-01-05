package p001o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class xdj {
    /* renamed from: a */
    public static final mej m56099a(h7f h7fVar) {
        Object next;
        sq8.m48649h(h7fVar, "<this>");
        Iterator it = h7fVar.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((hu6) next).getClass() == mej.class) {
                break;
            }
        }
        hu6 hu6Var = (hu6) next;
        if (hu6Var != null) {
            return (mej) hu6Var;
        }
        throw new IllegalArgumentException(("Expected to find trait " + kge.m35689b(mej.class) + " in " + h7fVar + " but was not present.").toString());
    }
}
