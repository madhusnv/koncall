package og;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends b0 {

    /* renamed from: c */
    public final transient j0 f26454c;

    /* renamed from: d */
    public final transient Object[] f26455d;

    /* renamed from: e */
    public final transient int f26456e = 1;

    public g0(j0 j0Var, Object[] objArr) {
        this.f26454c = j0Var;
        this.f26455d = objArr;
    }

    @Override // og.AbstractC5382w
    /* renamed from: a */
    public final int mo10520a(int i10, Object[] objArr) {
        a0 f0Var = this.f26328b;
        if (f0Var == null) {
            f0Var = new f0(this);
            this.f26328b = f0Var;
        }
        return f0Var.mo10520a(i10, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f26454c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        a0 f0Var = this.f26328b;
        if (f0Var == null) {
            f0Var = new f0(this);
            this.f26328b = f0Var;
        }
        return f0Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26456e;
    }
}
