package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.apache.http.message.TokenParser;
import p001o.vv5;

/* loaded from: classes3.dex */
public abstract class vv5 {

    /* renamed from: o.vv5$a */
    public static final class C17675a extends vv5 {

        /* renamed from: a */
        public final boolean f50912a;

        public C17675a(boolean z) {
            super(null);
            this.f50912a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17675a) && this.f50912a == ((C17675a) obj).f50912a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f50912a);
        }

        /* renamed from: n */
        public final boolean m53461n() {
            return this.f50912a;
        }

        public String toString() {
            return String.valueOf(this.f50912a);
        }
    }

    /* renamed from: o.vv5$b */
    public static final class C17676b extends vv5 implements List, sb9 {

        /* renamed from: a */
        public final List f50913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17676b(List list) {
            super(null);
            sq8.m48649h(list, "value");
            this.f50913a = list;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof vv5) {
                return m53462n((vv5) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            return this.f50913a.containsAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17676b) && sq8.m48644c(this.f50913a, ((C17676b) obj).f50913a);
        }

        @Override // java.util.List, java.util.Collection
        public int hashCode() {
            return this.f50913a.hashCode();
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof vv5) {
                return m53466w((vv5) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f50913a.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f50913a.iterator();
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof vv5) {
                return m53467y((vv5) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return this.f50913a.listIterator();
        }

        /* renamed from: n */
        public boolean m53462n(vv5 vv5Var) {
            return this.f50913a.contains(vv5Var);
        }

        @Override // java.util.List
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public vv5 get(int i) {
            return (vv5) this.f50913a.get(i);
        }

        /* renamed from: r */
        public int m53464r() {
            return this.f50913a.size();
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m53464r();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            return this.f50913a.subList(i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return yg3.m57773a(this);
        }

        public String toString() {
            return kh3.p0(this.f50913a, ",", "[", "]", 0, null, null, 56, null);
        }

        /* renamed from: v */
        public final List m53465v() {
            return this.f50913a;
        }

        /* renamed from: w */
        public int m53466w(vv5 vv5Var) {
            return this.f50913a.indexOf(vv5Var);
        }

        /* renamed from: y */
        public int m53467y(vv5 vv5Var) {
            return this.f50913a.lastIndexOf(vv5Var);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return this.f50913a.listIterator(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            sq8.m48649h(objArr, "array");
            return yg3.m57774b(this, objArr);
        }
    }

    /* renamed from: o.vv5$c */
    public static final class C17677c extends vv5 implements Map, sb9 {

        /* renamed from: a */
        public final Map f50914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17677c(Map map) {
            super(null);
            sq8.m48649h(map, "value");
            this.f50914a = map;
        }

        /* renamed from: I */
        public static final CharSequence m53468I(Map.Entry entry) {
            sq8.m48649h(entry, "<destruct>");
            return TokenParser.DQUOTE + ((String) entry.getKey()) + "\":" + ((vv5) entry.getValue());
        }

        /* renamed from: A */
        public int m53470A() {
            return this.f50914a.size();
        }

        /* renamed from: B */
        public final Map m53471B() {
            return this.f50914a;
        }

        /* renamed from: F */
        public Collection m53472F() {
            return this.f50914a.values();
        }

        @Override // java.util.Map
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public vv5 remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return m53474o((String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj == null ? true : obj instanceof vv5) {
                return m53475r((vv5) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final /* bridge */ Set entrySet() {
            return m53477w();
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17677c) && sq8.m48644c(this.f50914a, ((C17677c) obj).f50914a);
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return m53476v((String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f50914a.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f50914a.isEmpty();
        }

        @Override // java.util.Map
        public final /* bridge */ Set keySet() {
            return m53478y();
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: o */
        public boolean m53474o(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return this.f50914a.containsKey(str);
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: r */
        public boolean m53475r(vv5 vv5Var) {
            return this.f50914a.containsValue(vv5Var);
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return m53470A();
        }

        public String toString() {
            return kh3.p0(this.f50914a.entrySet(), ",", "{", "}", 0, null, new xk7() { // from class: o.uv5
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return vv5.C17677c.m53468I((Map.Entry) obj);
                }
            }, 24, null);
        }

        /* renamed from: v */
        public vv5 m53476v(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (vv5) this.f50914a.get(str);
        }

        @Override // java.util.Map
        public final /* bridge */ Collection values() {
            return m53472F();
        }

        /* renamed from: w */
        public Set m53477w() {
            return this.f50914a.entrySet();
        }

        /* renamed from: y */
        public Set m53478y() {
            return this.f50914a.keySet();
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.vv5$d */
    public static final class C17678d extends vv5 {

        /* renamed from: a */
        public final Number f50915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C17678d(Number number) {
            super(null);
            sq8.m48649h(number, "value");
            this.f50915a = number;
            if (number instanceof Double) {
                double dDoubleValue = number.doubleValue();
                if ((Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) ? false : true) {
                    if (!(number instanceof Float)) {
                        return;
                    }
                    float fFloatValue = number.floatValue();
                    if ((Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue)) ? false : true) {
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("a document number cannot be " + number + ", as its value cannot be preserved across serde");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17678d) && sq8.m48644c(this.f50915a, ((C17678d) obj).f50915a);
        }

        public int hashCode() {
            return this.f50915a.hashCode();
        }

        /* renamed from: n */
        public final Number m53479n() {
            return this.f50915a;
        }

        public String toString() {
            return this.f50915a.toString();
        }
    }

    /* renamed from: o.vv5$e */
    public static final class C17679e extends vv5 {

        /* renamed from: a */
        public final String f50916a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17679e(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f50916a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17679e) && sq8.m48644c(this.f50916a, ((C17679e) obj).f50916a);
        }

        public int hashCode() {
            return this.f50916a.hashCode();
        }

        /* renamed from: n */
        public final String m53480n() {
            return this.f50916a;
        }

        public String toString() {
            return TokenParser.DQUOTE + this.f50916a + TokenParser.DQUOTE;
        }
    }

    public vv5() {
    }

    public /* synthetic */ vv5(id5 id5Var) {
        this();
    }

    /* renamed from: d */
    public final boolean m53459d() {
        sq8.m48647f(this, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.content.Document.Boolean");
        return ((C17675a) this).m53461n();
    }

    /* renamed from: e */
    public final String m53460e() {
        sq8.m48647f(this, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.content.Document.String");
        return ((C17679e) this).m53480n();
    }
}
