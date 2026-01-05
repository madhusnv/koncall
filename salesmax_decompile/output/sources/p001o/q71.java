package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes2.dex */
public abstract class q71 {

    /* renamed from: o.q71$a */
    public static final class C16308a extends q71 implements Map, sb9 {

        /* renamed from: a */
        public final Map f41416a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16308a(Map map) {
            super(null);
            sq8.m48649h(map, "value");
            this.f41416a = map;
        }

        /* renamed from: a */
        public boolean m44909a(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return this.f41416a.containsKey(str);
        }

        /* renamed from: c */
        public boolean m44910c(String str) {
            sq8.m48649h(str, "value");
            return this.f41416a.containsValue(str);
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
                return m44909a((String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof String) {
                return m44910c((String) obj);
            }
            return false;
        }

        /* renamed from: d */
        public String m44911d(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (String) this.f41416a.get(str);
        }

        /* renamed from: e */
        public Set m44912e() {
            return this.f41416a.entrySet();
        }

        @Override // java.util.Map
        public final /* bridge */ Set entrySet() {
            return m44912e();
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16308a) && sq8.m48644c(this.f41416a, ((C16308a) obj).f41416a);
        }

        /* renamed from: f */
        public Set m44913f() {
            return this.f41416a.keySet();
        }

        /* renamed from: g */
        public int m44914g() {
            return this.f41416a.size();
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof String) {
                return m44911d((String) obj);
            }
            return null;
        }

        /* renamed from: h */
        public Collection m44915h() {
            return this.f41416a.values();
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f41416a.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f41416a.isEmpty();
        }

        @Override // java.util.Map
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ Set keySet() {
            return m44913f();
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
            return m44914g();
        }

        public String toString() {
            return this.f41416a.toString();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection values() {
            return m44915h();
        }

        @Override // java.util.Map
        public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: o.q71$b */
    public static final class C16309b extends q71 {

        /* renamed from: a */
        public final String f41417a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16309b(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f41417a = str;
        }

        /* renamed from: a */
        public final String m44917a() {
            return this.f41417a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16309b) && sq8.m48644c(this.f41417a, ((C16309b) obj).f41417a);
        }

        public int hashCode() {
            return this.f41417a.hashCode();
        }

        public String toString() {
            return this.f41417a;
        }
    }

    public q71() {
    }

    public /* synthetic */ q71(id5 id5Var) {
        this();
    }
}
