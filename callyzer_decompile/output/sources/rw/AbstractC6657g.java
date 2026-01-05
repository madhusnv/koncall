package rw;

import fx.InterfaceC2399e;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6657g extends AbstractMap implements Map, InterfaceC2399e {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    public abstract Set getEntries();

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
