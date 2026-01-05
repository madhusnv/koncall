package pg;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class va extends sa {

    /* renamed from: c */
    public final transient og.j0 f29092c;

    /* renamed from: d */
    public final transient Object[] f29093d;

    /* renamed from: e */
    public final transient int f29094e = 1;

    public va(og.j0 j0Var, Object[] objArr) {
        this.f29092c = j0Var;
        this.f29093d = objArr;
    }

    @Override // pg.l9
    /* renamed from: a */
    public final int mo11769a(Object[] objArr) {
        ra uaVar = this.f29061b;
        if (uaVar == null) {
            uaVar = new ua(this);
            this.f29061b = uaVar;
        }
        return uaVar.mo11769a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f29092c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ra uaVar = this.f29061b;
        if (uaVar == null) {
            uaVar = new ua(this);
            this.f29061b = uaVar;
        }
        return uaVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29094e;
    }
}
