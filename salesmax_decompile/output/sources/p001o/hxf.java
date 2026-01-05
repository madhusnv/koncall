package p001o;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class hxf implements Set, zb9 {

    /* renamed from: a */
    public final uxf f27765a;

    public hxf(uxf uxfVar) {
        sq8.m48649h(uxfVar, "map");
        this.f27765a = uxfVar;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f27765a.clear();
    }

    /* renamed from: d */
    public final uxf m31268d() {
        return this.f27765a;
    }

    /* renamed from: e */
    public int m31269e() {
        return this.f27765a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f27765a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m31269e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return yg3.m57773a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
