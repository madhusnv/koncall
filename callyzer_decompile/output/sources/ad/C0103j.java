package ad;

import bl.C0689a;
import ec.InterfaceC2015m;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC4154l;
import mx.InterfaceC4911g;
import sd.C6808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.j */
/* loaded from: classes.dex */
public final class C0103j implements InterfaceC2015m {

    /* renamed from: c */
    public static final /* synthetic */ int f355c = 0;

    /* renamed from: a */
    public final InterfaceC2015m f356a;

    /* renamed from: b */
    public final boolean f357b;

    static {
        new C0100g().m263d();
    }

    public C0103j(InterfaceC2015m interfaceC2015m, boolean z6) {
        this.f356a = interfaceC2015m;
        this.f357b = z6;
    }

    @Override // ec.InterfaceC2015m
    /* renamed from: a */
    public final InterfaceC4911g mo292a() {
        return this.f356a.mo292a();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof C6808b)) {
            return false;
        }
        return this.f356a.containsKey((C6808b) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return this.f356a.containsValue((List) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f356a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0103j.class != obj.getClass()) {
            return false;
        }
        C0103j c0103j = (C0103j) obj;
        return AbstractC4154l.m8918a(this.f356a, c0103j.f356a) && this.f357b == c0103j.f357b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof C6808b)) {
            return null;
        }
        return (List) this.f356a.get((C6808b) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return Boolean.hashCode(this.f357b) + (this.f356a.hashCode() * 31);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f356a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f356a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f356a.size();
    }

    public final String toString() {
        return C0689a.m1981i(this.f356a.mo292a(), this.f357b);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f356a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
