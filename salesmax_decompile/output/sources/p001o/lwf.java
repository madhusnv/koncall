package p001o;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p001o.fu6;

/* loaded from: classes6.dex */
public abstract class lwf extends AbstractMap {

    /* renamed from: a */
    public final int f34456a;

    /* renamed from: b */
    public List f34457b;

    /* renamed from: c */
    public Map f34458c;

    /* renamed from: d */
    public boolean f34459d;

    /* renamed from: e */
    public volatile C15169g f34460e;

    /* renamed from: f */
    public Map f34461f;

    /* renamed from: g */
    public volatile C15165c f34462g;

    /* renamed from: o.lwf$a */
    public static class C15163a extends lwf {
        public C15163a(int i) {
            super(i, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m38056A((fu6.InterfaceC13557b) obj, obj2);
        }

        @Override // p001o.lwf
        /* renamed from: w */
        public void mo38068w() {
            if (!m38067v()) {
                for (int i = 0; i < m38063r(); i++) {
                    Map.Entry entryM38062o = m38062o(i);
                    if (((fu6.InterfaceC13557b) entryM38062o.getKey()).mo27516k()) {
                        entryM38062o.setValue(Collections.unmodifiableList((List) entryM38062o.getValue()));
                    }
                }
                for (Map.Entry entry : m38065t()) {
                    if (((fu6.InterfaceC13557b) entry.getKey()).mo27516k()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo38068w();
        }
    }

    /* renamed from: o.lwf$c */
    public class C15165c extends C15169g {
        public C15165c() {
            super(lwf.this, null);
        }

        @Override // p001o.lwf.C15169g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C15164b(lwf.this, null);
        }

        public /* synthetic */ C15165c(lwf lwfVar, C15163a c15163a) {
            this();
        }
    }

    /* renamed from: o.lwf$d */
    public static class C15166d {

        /* renamed from: a */
        public static final Iterator f34467a = new a();

        /* renamed from: b */
        public static final Iterable f34468b = new b();

        /* renamed from: o.lwf$d$a */
        public static class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: o.lwf$d$b */
        public static class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return C15166d.f34467a;
            }
        }

        /* renamed from: b */
        public static Iterable m38072b() {
            return f34468b;
        }
    }

    /* renamed from: o.lwf$e */
    public class C15167e implements Map.Entry, Comparable {

        /* renamed from: a */
        public final Comparable f34469a;

        /* renamed from: b */
        public Object f34470b;

        public C15167e(lwf lwfVar, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15167e c15167e) {
            return getKey().compareTo(c15167e.getKey());
        }

        /* renamed from: c */
        public final boolean m38074c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f34469a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m38074c(this.f34469a, entry.getKey()) && m38074c(this.f34470b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f34470b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f34469a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f34470b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            lwf.this.m38059h();
            Object obj2 = this.f34470b;
            this.f34470b = obj;
            return obj2;
        }

        public String toString() {
            return this.f34469a + "=" + this.f34470b;
        }

        public C15167e(Comparable comparable, Object obj) {
            this.f34469a = comparable;
            this.f34470b = obj;
        }
    }

    /* renamed from: o.lwf$g */
    public class C15169g extends AbstractSet {
        public C15169g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            lwf.this.m38056A((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            lwf.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = lwf.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C15168f(lwf.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            lwf.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return lwf.this.size();
        }

        public /* synthetic */ C15169g(lwf lwfVar, C15163a c15163a) {
            this();
        }
    }

    public /* synthetic */ lwf(int i, C15163a c15163a) {
        this(i);
    }

    /* renamed from: y */
    public static lwf m38055y(int i) {
        return new C15163a(i);
    }

    /* renamed from: A */
    public Object m38056A(Comparable comparable, Object obj) {
        m38059h();
        int iM38058g = m38058g(comparable);
        if (iM38058g >= 0) {
            return ((C15167e) this.f34457b.get(iM38058g)).setValue(obj);
        }
        m38061n();
        int i = -(iM38058g + 1);
        if (i >= this.f34456a) {
            return m38066u().put(comparable, obj);
        }
        int size = this.f34457b.size();
        int i2 = this.f34456a;
        if (size == i2) {
            C15167e c15167e = (C15167e) this.f34457b.remove(i2 - 1);
            m38066u().put(c15167e.getKey(), c15167e.getValue());
        }
        this.f34457b.add(i, new C15167e(comparable, obj));
        return null;
    }

    /* renamed from: B */
    public final Object m38057B(int i) {
        m38059h();
        Object value = ((C15167e) this.f34457b.remove(i)).getValue();
        if (!this.f34458c.isEmpty()) {
            Iterator it = m38066u().entrySet().iterator();
            this.f34457b.add(new C15167e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m38059h();
        if (!this.f34457b.isEmpty()) {
            this.f34457b.clear();
        }
        if (this.f34458c.isEmpty()) {
            return;
        }
        this.f34458c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m38058g(comparable) >= 0 || this.f34458c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f34460e == null) {
            this.f34460e = new C15169g(this, null);
        }
        return this.f34460e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwf)) {
            return super.equals(obj);
        }
        lwf lwfVar = (lwf) obj;
        int size = size();
        if (size != lwfVar.size()) {
            return false;
        }
        int iM38063r = m38063r();
        if (iM38063r != lwfVar.m38063r()) {
            return entrySet().equals(lwfVar.entrySet());
        }
        for (int i = 0; i < iM38063r; i++) {
            if (!m38062o(i).equals(lwfVar.m38062o(i))) {
                return false;
            }
        }
        if (iM38063r != size) {
            return this.f34458c.equals(lwfVar.f34458c);
        }
        return true;
    }

    /* renamed from: g */
    public final int m38058g(Comparable comparable) {
        int size = this.f34457b.size() - 1;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((C15167e) this.f34457b.get(size)).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = comparable.compareTo(((C15167e) this.f34457b.get(i2)).getKey());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM38058g = m38058g(comparable);
        return iM38058g >= 0 ? ((C15167e) this.f34457b.get(iM38058g)).getValue() : this.f34458c.get(comparable);
    }

    /* renamed from: h */
    public final void m38059h() {
        if (this.f34459d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM38063r = m38063r();
        int iHashCode = 0;
        for (int i = 0; i < iM38063r; i++) {
            iHashCode += ((C15167e) this.f34457b.get(i)).hashCode();
        }
        return m38064s() > 0 ? iHashCode + this.f34458c.hashCode() : iHashCode;
    }

    /* renamed from: k */
    public Set m38060k() {
        if (this.f34462g == null) {
            this.f34462g = new C15165c(this, null);
        }
        return this.f34462g;
    }

    /* renamed from: n */
    public final void m38061n() {
        m38059h();
        if (!this.f34457b.isEmpty() || (this.f34457b instanceof ArrayList)) {
            return;
        }
        this.f34457b = new ArrayList(this.f34456a);
    }

    /* renamed from: o */
    public Map.Entry m38062o(int i) {
        return (Map.Entry) this.f34457b.get(i);
    }

    /* renamed from: r */
    public int m38063r() {
        return this.f34457b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m38059h();
        Comparable comparable = (Comparable) obj;
        int iM38058g = m38058g(comparable);
        if (iM38058g >= 0) {
            return m38057B(iM38058g);
        }
        if (this.f34458c.isEmpty()) {
            return null;
        }
        return this.f34458c.remove(comparable);
    }

    /* renamed from: s */
    public int m38064s() {
        return this.f34458c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f34457b.size() + this.f34458c.size();
    }

    /* renamed from: t */
    public Iterable m38065t() {
        return this.f34458c.isEmpty() ? C15166d.m38072b() : this.f34458c.entrySet();
    }

    /* renamed from: u */
    public final SortedMap m38066u() {
        m38059h();
        if (this.f34458c.isEmpty() && !(this.f34458c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f34458c = treeMap;
            this.f34461f = treeMap.descendingMap();
        }
        return (SortedMap) this.f34458c;
    }

    /* renamed from: v */
    public boolean m38067v() {
        return this.f34459d;
    }

    /* renamed from: w */
    public void mo38068w() {
        if (this.f34459d) {
            return;
        }
        this.f34458c = this.f34458c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f34458c);
        this.f34461f = this.f34461f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f34461f);
        this.f34459d = true;
    }

    /* renamed from: o.lwf$b */
    public class C15164b implements Iterator {

        /* renamed from: a */
        public int f34463a;

        /* renamed from: b */
        public Iterator f34464b;

        public C15164b() {
            this.f34463a = lwf.this.f34457b.size();
        }

        /* renamed from: a */
        public final Iterator m38069a() {
            if (this.f34464b == null) {
                this.f34464b = lwf.this.f34461f.entrySet().iterator();
            }
            return this.f34464b;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (m38069a().hasNext()) {
                return (Map.Entry) m38069a().next();
            }
            List list = lwf.this.f34457b;
            int i = this.f34463a - 1;
            this.f34463a = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f34463a;
            return (i > 0 && i <= lwf.this.f34457b.size()) || m38069a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C15164b(lwf lwfVar, C15163a c15163a) {
            this();
        }
    }

    /* renamed from: o.lwf$f */
    public class C15168f implements Iterator {

        /* renamed from: a */
        public int f34472a;

        /* renamed from: b */
        public boolean f34473b;

        /* renamed from: c */
        public Iterator f34474c;

        public C15168f() {
            this.f34472a = -1;
        }

        /* renamed from: a */
        public final Iterator m38076a() {
            if (this.f34474c == null) {
                this.f34474c = lwf.this.f34458c.entrySet().iterator();
            }
            return this.f34474c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f34473b = true;
            int i = this.f34472a + 1;
            this.f34472a = i;
            return i < lwf.this.f34457b.size() ? (Map.Entry) lwf.this.f34457b.get(this.f34472a) : (Map.Entry) m38076a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34472a + 1 >= lwf.this.f34457b.size()) {
                return !lwf.this.f34458c.isEmpty() && m38076a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f34473b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f34473b = false;
            lwf.this.m38059h();
            if (this.f34472a >= lwf.this.f34457b.size()) {
                m38076a().remove();
                return;
            }
            lwf lwfVar = lwf.this;
            int i = this.f34472a;
            this.f34472a = i - 1;
            lwfVar.m38057B(i);
        }

        public /* synthetic */ C15168f(lwf lwfVar, C15163a c15163a) {
            this();
        }
    }

    public lwf(int i) {
        this.f34456a = i;
        this.f34457b = Collections.emptyList();
        this.f34458c = Collections.emptyMap();
        this.f34461f = Collections.emptyMap();
    }
}
