package p001o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class l66 implements Map, Serializable, sb9 {

    /* renamed from: a */
    public static final l66 f33300a = new l66();

    private final Object readResolve() {
        return f33300a;
    }

    /* renamed from: a */
    public boolean m36610a(Void r2) {
        sq8.m48649h(r2, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m36610a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set m36612d() {
        return s66.f44871a;
    }

    /* renamed from: e */
    public Set m36613e() {
        return s66.f44871a;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m36612d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public int m36614f() {
        return 0;
    }

    /* renamed from: g */
    public Collection m36615g() {
        return k66.f31526a;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m36613e();
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
    public final /* bridge */ int size() {
        return m36614f();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m36615g();
    }
}
