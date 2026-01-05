package jw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import yh.C8668l;
import yh.C8669m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jw.c */
/* loaded from: classes3.dex */
public final class C3860c implements Map {

    /* renamed from: a */
    public final C8669m f19864a;

    public C3860c(C8669m c8669m) {
        this.f19864a = c8669m;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f19864a.containsKey(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f19864a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f19864a.get(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f19864a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19864a.f41988f;
    }

    @Override // java.util.Map
    public final Collection values() {
        C8669m c8669m = this.f19864a;
        C8668l c8668l = c8669m.f41985c;
        if (c8668l != null) {
            return c8668l;
        }
        C8668l c8668l2 = new C8668l(c8669m.f41987e, 1, c8669m.f41988f);
        c8669m.f41985c = c8668l2;
        return c8668l2;
    }
}
