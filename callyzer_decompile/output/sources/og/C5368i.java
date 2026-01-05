package og;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.i */
/* loaded from: classes.dex */
public class C5368i implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f26523a = 0;

    /* renamed from: b */
    public final Iterator f26524b;

    /* renamed from: c */
    public Collection f26525c;

    /* renamed from: d */
    public final /* synthetic */ Object f26526d;

    public C5368i(C5372m c5372m, ListIterator listIterator) {
        this.f26526d = c5372m;
        this.f26525c = c5372m.f26628b;
        this.f26524b = listIterator;
    }

    /* renamed from: a */
    public void m10694a() {
        C5372m c5372m = (C5372m) this.f26526d;
        c5372m.m10755b();
        if (c5372m.f26628b != this.f26525c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26523a) {
            case 0:
                break;
            default:
                m10694a();
                break;
        }
        return this.f26524b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26523a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f26524b.next();
                this.f26525c = (Collection) entry.getValue();
                Object key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                C5375p c5375p = ((C5369j) this.f26526d).f26551d;
                c5375p.getClass();
                List list = (List) collection;
                return new C5383x(key, list instanceof RandomAccess ? new C5370k(c5375p, key, list, null) : new C5372m(c5375p, key, list, null));
            default:
                m10694a();
                return this.f26524b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26523a) {
            case 0:
                qa.m10850e("no calls to next() since the last call to remove()", this.f26525c != null);
                this.f26524b.remove();
                ((C5369j) this.f26526d).f26551d.getClass();
                this.f26525c.size();
                this.f26525c.clear();
                this.f26525c = null;
                break;
            default:
                this.f26524b.remove();
                ((C5372m) this.f26526d).m10756c();
                break;
        }
    }

    public C5368i(C5369j c5369j) {
        this.f26526d = c5369j;
        this.f26524b = c5369j.f26550c.entrySet().iterator();
    }

    public C5368i(C5372m c5372m) {
        Iterator it;
        this.f26526d = c5372m;
        Collection collection = c5372m.f26628b;
        this.f26525c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f26524b = it;
    }
}
