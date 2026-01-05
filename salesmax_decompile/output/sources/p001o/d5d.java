package p001o;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d5d extends o9 implements qf8 {

    /* renamed from: b */
    public final r4d f19122b;

    public d5d(r4d r4dVar) {
        sq8.m48649h(r4dVar, "map");
        this.f19122b = r4dVar;
    }

    @Override // p001o.b7, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f19122b.containsKey(obj);
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f19122b.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new e5d(this.f19122b.m46210t());
    }
}
