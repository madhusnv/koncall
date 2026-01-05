package ng;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.i */
/* loaded from: classes.dex */
public final class C5058i extends AbstractC5055f {

    /* renamed from: c */
    public final transient C5061l f24840c;

    /* renamed from: d */
    public final transient Object[] f24841d;

    /* renamed from: e */
    public final transient int f24842e;

    public C5058i(C5061l c5061l, Object[] objArr, int i10) {
        this.f24840c = c5061l;
        this.f24841d = objArr;
        this.f24842e = i10;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: a */
    public final int mo9987a(Object[] objArr) {
        AbstractC5053d c5057h = this.f24835b;
        if (c5057h == null) {
            c5057h = new C5057h(this);
            this.f24835b = c5057h;
        }
        return c5057h.mo9987a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f24840c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC5053d c5057h = this.f24835b;
        if (c5057h == null) {
            c5057h = new C5057h(this);
            this.f24835b = c5057h;
        }
        return c5057h.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24842e;
    }
}
