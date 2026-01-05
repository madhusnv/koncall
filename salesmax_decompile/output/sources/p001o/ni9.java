package p001o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ni9 extends oi9 {

    /* renamed from: o.ni9$a */
    public static class C15587a implements Map.Entry {
        /* renamed from: a */
        public abstract ni9 m40631a();
    }

    /* renamed from: o.ni9$b */
    public static class C15588b implements Iterator {

        /* renamed from: a */
        public Iterator f36878a;

        public C15588b(Iterator it) {
            this.f36878a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f36878a.next();
            entry.getValue();
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36878a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f36878a.remove();
        }
    }
}
