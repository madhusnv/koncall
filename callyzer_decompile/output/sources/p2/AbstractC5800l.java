package p2;

import fx.InterfaceC2395a;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.l */
/* loaded from: classes.dex */
public abstract class AbstractC5800l implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public Object[] f28403a = C5799k.f28398e.f28402d;

    /* renamed from: b */
    public int f28404b;

    /* renamed from: c */
    public int f28405c;

    /* renamed from: b */
    public final void m11372b(Object[] objArr, int i10, int i11) {
        this.f28403a = objArr;
        this.f28404b = i10;
        this.f28405c = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28405c < this.f28404b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
