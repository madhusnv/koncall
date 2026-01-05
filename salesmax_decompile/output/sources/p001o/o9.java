package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class o9 extends b7 implements Set {

    /* renamed from: a */
    public static final C15735a f37946a = new C15735a(null);

    /* renamed from: o.o9$a */
    public static final class C15735a {
        public C15735a() {
        }

        public /* synthetic */ C15735a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final boolean m41785a(Set set, Set set2) {
            sq8.m48649h(set, "c");
            sq8.m48649h(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        /* renamed from: b */
        public final int m41786b(Collection collection) {
            sq8.m48649h(collection, "c");
            Iterator it = collection.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f37946a.m41785a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f37946a.m41786b(this);
    }
}
