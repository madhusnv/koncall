package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ci6 implements Map.Entry, sb9 {

    /* renamed from: a */
    public final Object f18224a;

    /* renamed from: b */
    public final Object f18225b;

    public ci6(Object obj, Object obj2) {
        this.f18224a = obj;
        this.f18225b = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci6)) {
            return false;
        }
        ci6 ci6Var = (ci6) obj;
        return sq8.m48644c(this.f18224a, ci6Var.f18224a) && sq8.m48644c(this.f18225b, ci6Var.f18225b);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f18224a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f18225b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object obj = this.f18224a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f18225b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return "Entry(key=" + this.f18224a + ", value=" + this.f18225b + ')';
    }
}
