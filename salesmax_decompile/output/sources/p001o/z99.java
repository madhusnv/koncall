package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@dff(with = aa9.class)
/* loaded from: classes6.dex */
public final class z99 extends k89 implements Map<String, k89>, sb9 {
    public static final C18584a Companion = new C18584a(null);

    /* renamed from: a */
    public final Map f56739a;

    /* renamed from: o.z99$a */
    public static final class C18584a {
        public C18584a() {
        }

        public /* synthetic */ C18584a(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return aa9.f14377a;
        }
    }

    /* renamed from: o.z99$b */
    public static final class C18585b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18585b f56740a = new C18585b();

        public C18585b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            sq8.m48649h(entry, "<name for destructuring parameter 0>");
            String str = (String) entry.getKey();
            k89 k89Var = (k89) entry.getValue();
            StringBuilder sb = new StringBuilder();
            o8g.m41773c(sb, str);
            sb.append(':');
            sb.append(k89Var);
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z99(Map map) {
        super(null);
        sq8.m48649h(map, FirebaseAnalytics.Param.CONTENT);
        this.f56739a = map;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k89 compute(String str, BiFunction<? super String, ? super k89, ? extends k89> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k89 computeIfAbsent(String str, Function<? super String, ? extends k89> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k89 computeIfPresent(String str, BiFunction<? super String, ? super k89, ? extends k89> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return m58975d((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof k89) {
            return m58976e((k89) obj);
        }
        return false;
    }

    /* renamed from: d */
    public boolean m58975d(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return this.f56739a.containsKey(str);
    }

    /* renamed from: e */
    public boolean m58976e(k89 k89Var) {
        sq8.m48649h(k89Var, "value");
        return this.f56739a.containsValue(k89Var);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, k89>> entrySet() {
        return m58978o();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return sq8.m48644c(this.f56739a, obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k89 get(Object obj) {
        if (obj instanceof String) {
            return m58977n((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f56739a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f56739a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m58979r();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k89 merge(String str, k89 k89Var, BiFunction<? super k89, ? super k89, ? extends k89> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: n */
    public k89 m58977n(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return (k89) this.f56739a.get(str);
    }

    /* renamed from: o */
    public Set m58978o() {
        return this.f56739a.entrySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k89 put(String str, k89 k89Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends k89> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k89 putIfAbsent(String str, k89 k89Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: r */
    public Set m58979r() {
        return this.f56739a.keySet();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k89 replace(String str, k89 k89Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super k89, ? extends k89> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m58980v();
    }

    public String toString() {
        return kh3.p0(this.f56739a.entrySet(), ",", "{", "}", 0, null, C18585b.f56740a, 24, null);
    }

    /* renamed from: v */
    public int m58980v() {
        return this.f56739a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<k89> values() {
        return m58981w();
    }

    /* renamed from: w */
    public Collection m58981w() {
        return this.f56739a.values();
    }

    @Override // java.util.Map
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public k89 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, k89 k89Var, k89 k89Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
