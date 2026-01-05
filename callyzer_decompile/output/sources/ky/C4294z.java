package ky;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.z */
/* loaded from: classes3.dex */
public final class C4294z extends AbstractC4281m implements Map<String, AbstractC4281m>, InterfaceC2395a {
    public static final C4293y Companion = new C4293y();

    /* renamed from: a */
    public final Map f21699a;

    public C4294z(Map content) {
        AbstractC4154l.m8923f(content, "content");
        this.f21699a = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4281m compute(String str, BiFunction<? super String, ? super AbstractC4281m, ? extends AbstractC4281m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4281m computeIfAbsent(String str, Function<? super String, ? extends AbstractC4281m> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4281m computeIfPresent(String str, BiFunction<? super String, ? super AbstractC4281m, ? extends AbstractC4281m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f21699a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof AbstractC4281m)) {
            return false;
        }
        return this.f21699a.containsValue((AbstractC4281m) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, AbstractC4281m>> entrySet() {
        return this.f21699a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC4154l.m8918a(this.f21699a, obj);
    }

    @Override // java.util.Map
    public final AbstractC4281m get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (AbstractC4281m) this.f21699a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f21699a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f21699a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f21699a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4281m merge(String str, AbstractC4281m abstractC4281m, BiFunction<? super AbstractC4281m, ? super AbstractC4281m, ? extends AbstractC4281m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4281m put(String str, AbstractC4281m abstractC4281m) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends AbstractC4281m> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4281m putIfAbsent(String str, AbstractC4281m abstractC4281m) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final AbstractC4281m remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ AbstractC4281m replace(String str, AbstractC4281m abstractC4281m) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super AbstractC4281m, ? extends AbstractC4281m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f21699a.size();
    }

    public final String toString() {
        return AbstractC6663m.m12748L(this.f21699a.entrySet(), ",", "{", "}", new hq.d0(4), 24);
    }

    @Override // java.util.Map
    public final Collection<AbstractC4281m> values() {
        return this.f21699a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, AbstractC4281m abstractC4281m, AbstractC4281m abstractC4281m2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
