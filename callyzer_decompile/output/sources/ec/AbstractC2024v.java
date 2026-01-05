package ec;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.v */
/* loaded from: classes.dex */
public abstract class AbstractC2024v implements InterfaceC2023u {

    /* renamed from: c */
    public final Map f9581c;

    public AbstractC2024v(Map initialValues) {
        AbstractC4154l.m8923f(initialValues, "initialValues");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6674x.m12776d(initialValues.size()));
        for (Map.Entry entry : initialValues.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC6663m.c0((List) entry.getValue()));
        }
        C2007e c2007e = new C2007e();
        c2007e.putAll(linkedHashMap);
        this.f9581c = c2007e;
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: a */
    public final Set mo5747a() {
        return this.f9581c.entrySet();
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: c */
    public final boolean mo5749c() {
        return true;
    }

    @Override // ec.InterfaceC2023u
    public final boolean contains(String name) {
        AbstractC4154l.m8923f(name, "name");
        return this.f9581c.containsKey(name);
    }

    @Override // ec.InterfaceC2023u
    /* renamed from: d */
    public final List mo5750d(String name) {
        AbstractC4154l.m8923f(name, "name");
        return (List) this.f9581c.get(name);
    }

    public final boolean equals(Object obj) {
        boolean z6 = obj instanceof AbstractC2024v;
        Map map = this.f9581c;
        if (z6) {
            if (!AbstractC4154l.m8918a(map, ((AbstractC2024v) obj).f9581c)) {
                return false;
            }
        } else {
            if (!(obj instanceof InterfaceC2023u)) {
                return false;
            }
            InterfaceC2023u interfaceC2023u = (InterfaceC2023u) obj;
            if (true != interfaceC2023u.mo5749c() || !AbstractC4154l.m8918a(map.entrySet(), interfaceC2023u.mo5747a())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f9581c.hashCode();
    }

    @Override // ec.InterfaceC2023u
    public final boolean isEmpty() {
        return this.f9581c.isEmpty();
    }

    @Override // ec.InterfaceC2023u
    public final Set names() {
        return this.f9581c.keySet();
    }
}
