package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class k8 implements Map, sb9 {

    /* renamed from: a */
    public static final C14727a f31608a = new C14727a(null);

    /* renamed from: o.k8$a */
    public static final class C14727a {
        public C14727a() {
        }

        public /* synthetic */ C14727a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.k8$b */
    public static final class C14728b extends kf9 implements xk7 {
        public C14728b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            sq8.m48649h(entry, "it");
            return k8.this.m35145k(entry);
        }
    }

    /* renamed from: c */
    public final boolean m35139c(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        sq8.m48647f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!sq8.m48644c(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        sq8.m48647f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (sq8.m48644c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public abstract Set mo35140d();

    /* renamed from: e */
    public abstract Set mo35141e();

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo35140d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!m35139c((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract int mo35142f();

    /* renamed from: g */
    public abstract Collection mo35143g();

    /* renamed from: h */
    public final String m35144h(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final String m35145k(Map.Entry entry) {
        return m35144h(entry.getKey()) + '=' + m35144h(entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return mo35141e();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return mo35142f();
    }

    public String toString() {
        return kh3.p0(entrySet(), ", ", "{", "}", 0, null, new C14728b(), 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return mo35143g();
    }
}
