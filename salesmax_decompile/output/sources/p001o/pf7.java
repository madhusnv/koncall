package p001o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class pf7 extends qf7 implements Map {
    @Override // java.util.Map
    public void clear() {
        mo33628k().clear();
    }

    public boolean containsKey(Object obj) {
        return mo33628k().containsKey(obj);
    }

    public Set entrySet() {
        return mo33628k().entrySet();
    }

    public Object get(Object obj) {
        return mo33628k().get(obj);
    }

    public boolean isEmpty() {
        return mo33628k().isEmpty();
    }

    /* renamed from: k */
    public abstract Map mo33628k();

    public Set keySet() {
        return mo33628k().keySet();
    }

    /* renamed from: o */
    public boolean m43568o(Object obj) {
        return fsa.m27429b(this, obj);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return mo33628k().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        mo33628k().putAll(map);
    }

    /* renamed from: r */
    public boolean m43569r(Object obj) {
        return fsa.m27430c(this, obj);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return mo33628k().remove(obj);
    }

    /* renamed from: s */
    public int m43570s() {
        return lif.m37324d(entrySet());
    }

    public int size() {
        return mo33628k().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return mo33628k().values();
    }
}
