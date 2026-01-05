package p001o;

import com.google.android.gms.common.api.Api;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.lif;

/* loaded from: classes3.dex */
public abstract class fsa {

    /* renamed from: o.fsa$a */
    public class C13544a extends bvh {
        public C13544a(Iterator it) {
            super(it);
        }

        @Override // p001o.bvh
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object mo19878a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.fsa$b */
    public static abstract class EnumC13545b implements ol7 {
        public static final EnumC13545b KEY = new a("KEY", 0);
        public static final EnumC13545b VALUE = new b("VALUE", 1);
        private static final /* synthetic */ EnumC13545b[] $VALUES = $values();

        /* renamed from: o.fsa$b$a */
        public enum a extends EnumC13545b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.fsa.EnumC13545b, p001o.ol7
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: o.fsa$b$b */
        public enum b extends EnumC13545b {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // p001o.fsa.EnumC13545b, p001o.ol7
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private static /* synthetic */ EnumC13545b[] $values() {
            return new EnumC13545b[]{KEY, VALUE};
        }

        private EnumC13545b(String str, int i) {
        }

        public static EnumC13545b valueOf(String str) {
            return (EnumC13545b) Enum.valueOf(EnumC13545b.class, str);
        }

        public static EnumC13545b[] values() {
            return (EnumC13545b[]) $VALUES.clone();
        }

        @Override // p001o.ol7
        public abstract /* synthetic */ Object apply(Object obj);

        public /* synthetic */ EnumC13545b(String str, int i, esa esaVar) {
            this(str, i);
        }
    }

    /* renamed from: o.fsa$c */
    public static abstract class AbstractC13546c extends lif.AbstractC15085d {
        /* renamed from: b */
        public abstract Map mo27441b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo27441b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo27441b().isEmpty();
        }

        @Override // p001o.lif.AbstractC15085d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) dgd.m23062o(collection));
            } catch (UnsupportedOperationException unused) {
                return lif.m37330j(this, collection.iterator());
            }
        }

        @Override // p001o.lif.AbstractC15085d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) dgd.m23062o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM37327g = lif.m37327g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetM37327g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo27441b().keySet().retainAll(hashSetM37327g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo27441b().size();
        }
    }

    /* renamed from: o.fsa$d */
    public static class C13547d extends lif.AbstractC15085d {

        /* renamed from: a */
        public final Map f24030a;

        public C13547d(Map map) {
            this.f24030a = (Map) dgd.m23062o(map);
        }

        /* renamed from: b */
        public Map m27442b() {
            return this.f24030a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m27442b().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m27442b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m27442b().size();
        }
    }

    /* renamed from: o.fsa$e */
    public static class C13548e extends AbstractCollection {

        /* renamed from: a */
        public final Map f24031a;

        public C13548e(Map map) {
            this.f24031a = (Map) dgd.m23062o(map);
        }

        /* renamed from: b */
        public final Map m27443b() {
            return this.f24031a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m27443b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m27443b().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m27443b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return fsa.m27439l(m27443b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : m27443b().entrySet()) {
                    if (r6c.m46255a(obj, entry.getValue())) {
                        m27443b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) dgd.m23062o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM37326f = lif.m37326f();
                for (Map.Entry entry : m27443b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetM37326f.add(entry.getKey());
                    }
                }
                return m27443b().keySet().removeAll(hashSetM37326f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) dgd.m23062o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetM37326f = lif.m37326f();
                for (Map.Entry entry : m27443b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetM37326f.add(entry.getKey());
                    }
                }
                return m27443b().keySet().retainAll(hashSetM37326f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m27443b().size();
        }
    }

    /* renamed from: o.fsa$f */
    public static abstract class AbstractC13549f extends AbstractMap {

        /* renamed from: a */
        public transient Set f24032a;

        /* renamed from: b */
        public transient Collection f24033b;

        /* renamed from: a */
        public abstract Set mo27444a();

        /* renamed from: c */
        public Collection m27445c() {
            return new C13548e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f24032a;
            if (set != null) {
                return set;
            }
            Set setMo27444a = mo27444a();
            this.f24032a = setMo27444a;
            return setMo27444a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f24033b;
            if (collection != null) {
                return collection;
            }
            Collection collectionM27445c = m27445c();
            this.f24033b = collectionM27445c;
            return collectionM27445c;
        }
    }

    /* renamed from: a */
    public static int m27428a(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        rg3.m46690b(i, "expectedSize");
        return i + 1;
    }

    /* renamed from: b */
    public static boolean m27429b(Map map, Object obj) {
        return e69.m24380d(m27439l(map.entrySet().iterator()), obj);
    }

    /* renamed from: c */
    public static boolean m27430c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: d */
    public static Map.Entry m27431d(Object obj, Object obj2) {
        return new kf8(obj, obj2);
    }

    /* renamed from: e */
    public static HashMap m27432e(int i) {
        return new HashMap(m27428a(i));
    }

    /* renamed from: f */
    public static IdentityHashMap m27433f() {
        return new IdentityHashMap();
    }

    /* renamed from: g */
    public static boolean m27434g(Map map, Object obj) {
        dgd.m23062o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static Object m27435h(Map map, Object obj) {
        dgd.m23062o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Object m27436i(Map map, Object obj) {
        dgd.m23062o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m27437j(Map map) {
        StringBuilder sbM17047b = ah3.m17047b(map.size());
        sbM17047b.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sbM17047b.append(", ");
            }
            sbM17047b.append(entry.getKey());
            sbM17047b.append('=');
            sbM17047b.append(entry.getValue());
            z = false;
        }
        sbM17047b.append('}');
        return sbM17047b.toString();
    }

    /* renamed from: k */
    public static ol7 m27438k() {
        return EnumC13545b.VALUE;
    }

    /* renamed from: l */
    public static Iterator m27439l(Iterator it) {
        return new C13544a(it);
    }
}
