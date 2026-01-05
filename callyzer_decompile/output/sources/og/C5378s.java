package og;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.s */
/* loaded from: classes.dex */
public final class C5378s extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f26787a;

    /* renamed from: b */
    public final /* synthetic */ C5381v f26788b;

    public /* synthetic */ C5378s(C5381v c5381v, int i10) {
        this.f26787a = i10;
        this.f26788b = c5381v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f26787a) {
            case 0:
                this.f26788b.clear();
                break;
            default:
                this.f26788b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f26787a) {
            case 0:
                C5381v c5381v = this.f26788b;
                Map mapM11001h = c5381v.m11001h();
                if (mapM11001h != null) {
                    return mapM11001h.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM11005n = c5381v.m11005n(entry.getKey());
                    if (iM11005n != -1 && pa.m10818e(c5381v.m11000f()[iM11005n], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f26788b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f26787a) {
            case 0:
                C5381v c5381v = this.f26788b;
                Map mapM11001h = c5381v.m11001h();
                return mapM11001h != null ? mapM11001h.entrySet().iterator() : new C5376q(c5381v, 1);
            default:
                C5381v c5381v2 = this.f26788b;
                Map mapM11001h2 = c5381v2.m11001h();
                return mapM11001h2 != null ? mapM11001h2.keySet().iterator() : new C5376q(c5381v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f26787a) {
            case 0:
                C5381v c5381v = this.f26788b;
                Map mapM11001h = c5381v.m11001h();
                if (mapM11001h != null) {
                    return mapM11001h.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c5381v.m11003j()) {
                        int iM11004l = c5381v.m11004l();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c5381v.f26833a;
                        Objects.requireNonNull(obj2);
                        int iM10889b = sa.m10889b(key, value, iM11004l, obj2, c5381v.m10998b(), c5381v.m10999d(), c5381v.m11000f());
                        if (iM10889b != -1) {
                            c5381v.m11002i(iM10889b, iM11004l);
                            c5381v.f26838f--;
                            c5381v.f26837e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C5381v c5381v2 = this.f26788b;
                Map mapM11001h2 = c5381v2.m11001h();
                return mapM11001h2 != null ? mapM11001h2.keySet().remove(obj) : c5381v2.m11007p(obj) != C5381v.f26832k;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f26787a) {
        }
        return this.f26788b.size();
    }
}
