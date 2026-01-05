package p001o;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f5d extends b7 implements jf8 {

    /* renamed from: a */
    public final r4d f22760a;

    public f5d(r4d r4dVar) {
        sq8.m48649h(r4dVar, "map");
        this.f22760a = r4dVar;
    }

    @Override // p001o.b7, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f22760a.containsValue(obj);
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f22760a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new g5d(this.f22760a.m46210t());
    }
}
