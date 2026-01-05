package fc;

import ac.C0088a;
import ad.C0100g;
import ec.InterfaceC2017o;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4161s;
import kotlin.jvm.internal.d0;
import mx.AbstractC4913i;
import mx.InterfaceC4911g;
import og.pe;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fc.i */
/* loaded from: classes.dex */
public final class C2261i implements InterfaceC2017o {

    /* renamed from: a */
    public final C0100g f10267a;

    /* renamed from: b */
    public final C4161s f10268b;

    /* renamed from: c */
    public final AbstractC4152j f10269c;

    /* renamed from: d */
    public final C4161s f10270d;

    /* renamed from: e */
    public final AbstractC4152j f10271e;

    /* renamed from: f */
    public final C2260h f10272f = new C2260h(this, 0);

    /* renamed from: g */
    public final C2260h f10273g = new C2260h(this, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public C2261i(C0100g c0100g, C4161s c4161s, InterfaceC2139c interfaceC2139c, C4161s c4161s2, InterfaceC2139c interfaceC2139c2) {
        this.f10267a = c0100g;
        this.f10268b = c4161s;
        this.f10269c = (AbstractC4152j) interfaceC2139c;
        this.f10270d = c4161s2;
        this.f10271e = (AbstractC4152j) interfaceC2139c2;
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: a */
    public final InterfaceC4911g mo261a() {
        return AbstractC4913i.m9811g(this.f10267a.f349a.mo261a(), new C2260h(this, 2));
    }

    @Override // java.util.Map
    public final void clear() {
        this.f10267a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f10267a.containsKey(this.f10269c.invoke(obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!d0.m8910g(obj)) {
            return false;
        }
        List value = (List) obj;
        AbstractC4154l.m8923f(value, "value");
        return this.f10267a.containsValue(this.f10273g.invoke(value));
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set setEntrySet = this.f10267a.f349a.entrySet();
        int i10 = 0;
        int i11 = 1;
        C0088a c0088a = new C0088a(i11, this, C2261i.class, "fwdEntryView", "fwdEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;", i10, 23);
        C0088a c0088a2 = new C0088a(i11, this, C2261i.class, "revEntryView", "revEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;", i10, 24);
        AbstractC4154l.m8923f(setEntrySet, "<this>");
        return new C2262j(setEntrySet, c0088a, c0088a2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // ec.InterfaceC2017o
    /* renamed from: g */
    public final boolean mo266g(Object obj, String str) {
        List list = (List) get(str);
        if (list == null) {
            this.f10267a.put(this.f10269c.invoke(str), (Object) new ArrayList());
            list = (List) AbstractC6674x.m12774b(this, str);
        }
        return list.add(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // java.util.Map
    public final Object get(Object obj) {
        List list = (List) this.f10267a.get(this.f10269c.invoke(obj));
        if (list != null) {
            return (List) this.f10272f.invoke(list);
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f10267a.f349a.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // ec.InterfaceC2017o
    /* renamed from: k */
    public final boolean mo270k(Object obj, Collection values) {
        AbstractC4154l.m8923f(values, "values");
        List list = (List) get(obj);
        if (list == null) {
            this.f10267a.put(this.f10269c.invoke(obj), (Object) new ArrayList());
            list = (List) AbstractC6674x.m12774b(this, obj);
        }
        return list.addAll(values);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // java.util.Map
    public final Set keySet() {
        Set setKeySet = this.f10267a.f349a.keySet();
        AbstractC4154l.m8923f(setKeySet, "<this>");
        return new C2262j(setKeySet, this.f10268b, this.f10269c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        List value = (List) obj2;
        AbstractC4154l.m8923f(value, "value");
        List list = (List) this.f10267a.put(this.f10269c.invoke(obj), this.f10273g.invoke(value));
        if (list != null) {
            return (List) this.f10272f.invoke(list);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC4154l.m8923f(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            this.f10267a.put(this.f10269c.invoke(key), this.f10273g.invoke(list));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        List list = (List) this.f10267a.remove(this.f10269c.invoke(obj));
        if (list != null) {
            return (List) this.f10272f.invoke(list);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f10267a.f349a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collectionValues = this.f10267a.f349a.values();
        AbstractC4154l.m8923f(collectionValues, "<this>");
        return new C2255c(collectionValues, this.f10272f, this.f10273g);
    }

    @Override // ec.InterfaceC2017o, java.util.Map
    public final List put(Object obj, Object obj2) {
        return (List) put(obj, (Object) pe.m10835j(obj2));
    }
}
