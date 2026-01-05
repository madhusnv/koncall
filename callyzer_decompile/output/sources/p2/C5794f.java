package p2;

import ec.C2008f;
import java.util.Iterator;
import java.util.Map;
import rw.AbstractC6658h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.f */
/* loaded from: classes.dex */
public final class C5794f extends AbstractC6658h {

    /* renamed from: a */
    public final /* synthetic */ int f28392a;

    /* renamed from: b */
    public final C5792d f28393b;

    public /* synthetic */ C5794f(int i10, C5792d c5792d) {
        this.f28392a = i10;
        this.f28393b = c5792d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f28392a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // rw.AbstractC6658h
    /* renamed from: b */
    public final int mo11347b() {
        switch (this.f28392a) {
        }
        return this.f28393b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f28392a) {
            case 0:
                this.f28393b.clear();
                break;
            default:
                this.f28393b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f28392a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C5792d c5792d = this.f28393b;
                Object obj2 = c5792d.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c5792d.containsKey(entry.getKey());
            default:
                return this.f28393b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f28392a) {
            case 0:
                return new C2008f(this.f28393b);
            default:
                AbstractC5800l[] abstractC5800lArr = new AbstractC5800l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC5800lArr[i10] = new C5801m(1);
                }
                return new C5795g(this.f28393b, abstractC5800lArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f28392a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f28393b.remove(entry.getKey(), entry.getValue());
            default:
                C5792d c5792d = this.f28393b;
                if (!c5792d.containsKey(obj)) {
                    return false;
                }
                c5792d.remove(obj);
                return true;
        }
    }
}
