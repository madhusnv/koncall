package ec;

import fx.InterfaceC2395a;
import j3.g0;
import j3.i0;
import java.util.Iterator;
import java.util.Map;
import p2.AbstractC5800l;
import p2.C5792d;
import p2.C5793e;
import p2.C5802n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.f */
/* loaded from: classes.dex */
public final class C2008f implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f9538a = 0;

    /* renamed from: b */
    public final Iterator f9539b;

    public C2008f(C2009g c2009g) {
        this.f9539b = c2009g.f9540a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9538a) {
            case 0:
                return this.f9539b.hasNext();
            case 1:
                return this.f9539b.hasNext();
            default:
                return ((C5793e) this.f9539b).f28381c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9538a) {
            case 0:
                return ((C2010h) this.f9539b.next()).f9542b;
            case 1:
                return (i0) this.f9539b.next();
            default:
                return (Map.Entry) ((C5793e) this.f9539b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9538a) {
            case 0:
                this.f9539b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C5793e) this.f9539b).remove();
                return;
        }
    }

    public C2008f(C5792d c5792d) {
        AbstractC5800l[] abstractC5800lArr = new AbstractC5800l[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC5800lArr[i10] = new C5802n(this);
        }
        this.f9539b = new C5793e(c5792d, abstractC5800lArr);
    }

    public C2008f(g0 g0Var) {
        this.f9539b = g0Var.f19021k.iterator();
    }
}
