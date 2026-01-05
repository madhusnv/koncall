package p001o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v4d extends m8 {

    /* renamed from: a */
    public final t4d f49863a;

    public v4d(t4d t4dVar) {
        sq8.m48649h(t4dVar, "builder");
        this.f49863a = t4dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f49863a.clear();
    }

    @Override // p001o.z8
    /* renamed from: d */
    public int mo21591d() {
        return this.f49863a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new w4d(this.f49863a);
    }

    @Override // p001o.m8
    /* renamed from: j */
    public boolean mo38511j(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        Object obj = this.f49863a.get(entry.getKey());
        return obj != null ? sq8.m48644c(obj, entry.getValue()) : entry.getValue() == null && this.f49863a.containsKey(entry.getKey());
    }

    @Override // p001o.m8
    /* renamed from: p */
    public boolean mo38513p(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        return this.f49863a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        throw new UnsupportedOperationException();
    }
}
