package e1;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.u */
/* loaded from: classes.dex */
public final class C1919u implements Map, InterfaceC2395a {

    /* renamed from: a */
    public final j0 f9059a;

    /* renamed from: b */
    public C1906h f9060b;

    /* renamed from: c */
    public C1906h f9061c;

    /* renamed from: d */
    public y0 f9062d;

    public C1919u(j0 parent) {
        AbstractC4154l.m8923f(parent, "parent");
        this.f9059a = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f9059a.m5570c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f9059a.m5571d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1906h c1906h = this.f9060b;
        if (c1906h != null) {
            return c1906h;
        }
        C1906h c1906h2 = new C1906h(this.f9059a, 0);
        this.f9060b = c1906h2;
        return c1906h2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1919u.class != obj.getClass()) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f9059a, ((C1919u) obj).f9059a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f9059a.m5574g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9059a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9059a.m5576i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1906h c1906h = this.f9061c;
        if (c1906h != null) {
            return c1906h;
        }
        C1906h c1906h2 = new C1906h(this.f9059a, 1);
        this.f9061c = c1906h2;
        return c1906h2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9059a.f9002e;
    }

    public final String toString() {
        return this.f9059a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        y0 y0Var = this.f9062d;
        if (y0Var != null) {
            return y0Var;
        }
        y0 y0Var2 = new y0(this.f9059a);
        this.f9062d = y0Var2;
        return y0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
