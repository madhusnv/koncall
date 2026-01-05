package mx;

import fx.InterfaceC2395a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import rw.C6671u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mx.b */
/* loaded from: classes3.dex */
public final class C4906b implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f24441a = 1;

    /* renamed from: b */
    public final Iterator f24442b;

    /* renamed from: c */
    public int f24443c;

    public C4906b(Iterator iterator) {
        AbstractC4154l.m8923f(iterator, "iterator");
        this.f24442b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f24441a) {
            case 0:
                break;
            default:
                return this.f24442b.hasNext();
        }
        while (true) {
            int i10 = this.f24443c;
            it = this.f24442b;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f24443c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f24441a) {
            case 0:
                break;
            default:
                int i10 = this.f24443c;
                this.f24443c = i10 + 1;
                if (i10 >= 0) {
                    return new C6671u(i10, this.f24442b.next());
                }
                pe.m10842q();
                throw null;
        }
        while (true) {
            int i11 = this.f24443c;
            it = this.f24442b;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f24443c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24441a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4906b(C4907c c4907c) {
        this.f24442b = c4907c.f24444a.iterator();
        this.f24443c = c4907c.f24445b;
    }
}
