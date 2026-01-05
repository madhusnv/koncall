package ec;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.ud;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.c */
/* loaded from: classes.dex */
public final class C2005c implements InterfaceC2016n {

    /* renamed from: a */
    public final LinkedHashMap f9534a;

    public C2005c(InterfaceC2004b seed) {
        AbstractC4154l.m8923f(seed, "seed");
        this.f9534a = new LinkedHashMap();
        ud.m10979e(this, seed);
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: a */
    public final boolean mo1861a(C2003a key) {
        AbstractC4154l.m8923f(key, "key");
        return this.f9534a.containsKey(key);
    }

    @Override // ec.InterfaceC2016n
    /* renamed from: b */
    public final void mo1862b(C2003a key, Object value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        this.f9534a.put(key, value);
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: c */
    public final Set mo1863c() {
        return this.f9534a.keySet();
    }

    /* renamed from: d */
    public final void m5741d(C2003a key) {
        AbstractC4154l.m8923f(key, "key");
        this.f9534a.remove(key);
    }

    @Override // ec.InterfaceC2004b
    /* renamed from: e */
    public final Object mo1864e(C2003a key) {
        AbstractC4154l.m8923f(key, "key");
        return this.f9534a.get(key);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC2004b)) {
            return false;
        }
        LinkedHashMap linkedHashMap = this.f9534a;
        InterfaceC2004b interfaceC2004b = (InterfaceC2004b) obj;
        if (linkedHashMap.keySet().size() != interfaceC2004b.mo1863c().size()) {
            return false;
        }
        Set<C2003a> setKeySet = linkedHashMap.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return true;
        }
        for (C2003a c2003a : setKeySet) {
            if (!mo1861a(c2003a) || !AbstractC4154l.m8918a(mo1864e(c2003a), interfaceC2004b.mo1864e(c2003a))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f9534a.hashCode();
    }

    @Override // ec.InterfaceC2004b
    public final boolean isEmpty() {
        return this.f9534a.isEmpty();
    }

    public final String toString() {
        return this.f9534a.toString();
    }
}
