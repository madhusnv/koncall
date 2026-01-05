package ec;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC4154l;
import mx.C4914j;
import mx.InterfaceC4911g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.s */
/* loaded from: classes.dex */
public final class C2021s implements InterfaceC2015m, Map, InterfaceC2395a {

    /* renamed from: a */
    public final Map f9579a;

    public C2021s(Map map) {
        this.f9579a = map;
    }

    @Override // ec.InterfaceC2015m
    /* renamed from: a */
    public final InterfaceC4911g mo292a() {
        return new C4914j(new C2020r(this, null, 0));
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
        return this.f9579a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return this.f9579a.containsValue((List) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f9579a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2021s.class != obj.getClass()) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f9579a, ((C2021s) obj).f9579a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return (List) this.f9579a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9579a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9579a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f9579a.keySet();
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
        return this.f9579a.size();
    }

    public final String toString() {
        return this.f9579a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f9579a.values();
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
