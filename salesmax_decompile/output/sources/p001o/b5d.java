package p001o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b5d extends o9 implements qf8 {

    /* renamed from: b */
    public final r4d f15561b;

    public b5d(r4d r4dVar) {
        sq8.m48649h(r4dVar, "map");
        this.f15561b = r4dVar;
    }

    @Override // p001o.b7, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m18170e((Map.Entry) obj);
        }
        return false;
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f15561b.size();
    }

    /* renamed from: e */
    public boolean m18170e(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        Object obj = this.f15561b.get(entry.getKey());
        return obj != null ? sq8.m48644c(obj, entry.getValue()) : entry.getValue() == null && this.f15561b.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new c5d(this.f15561b.m46210t());
    }
}
