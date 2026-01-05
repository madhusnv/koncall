package p001o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.nob;

/* loaded from: classes3.dex */
public abstract class v8 implements lob {

    /* renamed from: a */
    public transient Collection f49999a;

    /* renamed from: b */
    public transient Set f50000b;

    /* renamed from: c */
    public transient Collection f50001c;

    /* renamed from: d */
    public transient Map f50002d;

    /* renamed from: o.v8$a */
    public class C17525a extends nob.AbstractC15621b {
        public C17525a() {
        }

        @Override // p001o.nob.AbstractC15621b
        /* renamed from: b */
        public lob mo40872b() {
            return v8.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return v8.this.mo36687i();
        }
    }

    /* renamed from: o.v8$b */
    public class C17526b extends AbstractCollection {
        public C17526b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            v8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return v8.this.m52449d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return v8.this.mo36688k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return v8.this.size();
        }
    }

    @Override // p001o.lob
    /* renamed from: a */
    public Map mo26264a() {
        Map map = this.f50002d;
        if (map != null) {
            return map;
        }
        Map mapMo40870e = mo40870e();
        this.f50002d = mapMo40870e;
        return mapMo40870e;
    }

    @Override // p001o.lob
    /* renamed from: b */
    public Collection mo36684b() {
        Collection collection = this.f49999a;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo36685f = mo36685f();
        this.f49999a = collectionMo36685f;
        return collectionMo36685f;
    }

    @Override // p001o.lob
    /* renamed from: c */
    public boolean mo37575c(Object obj, Object obj2) {
        Collection collection = (Collection) mo26264a().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: d */
    public boolean m52449d(Object obj) {
        Iterator it = mo26264a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public abstract Map mo40870e();

    public boolean equals(Object obj) {
        return nob.m40867a(this, obj);
    }

    /* renamed from: f */
    public abstract Collection mo36685f();

    /* renamed from: g */
    public abstract Set mo40871g();

    /* renamed from: h */
    public abstract Collection mo36686h();

    public int hashCode() {
        return mo26264a().hashCode();
    }

    /* renamed from: i */
    public abstract Iterator mo36687i();

    /* renamed from: j */
    public Set m52450j() {
        Set set = this.f50000b;
        if (set != null) {
            return set;
        }
        Set setMo40871g = mo40871g();
        this.f50000b = setMo40871g;
        return setMo40871g;
    }

    /* renamed from: k */
    public abstract Iterator mo36688k();

    @Override // p001o.lob
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) mo26264a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo26264a().toString();
    }

    @Override // p001o.lob
    public Collection values() {
        Collection collection = this.f50001c;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo36686h = mo36686h();
        this.f50001c = collectionMo36686h;
        return collectionMo36686h;
    }
}
