package p2;

import ec.C2008f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.n */
/* loaded from: classes.dex */
public final class C5802n extends AbstractC5800l {

    /* renamed from: d */
    public final C2008f f28407d;

    public C5802n(C2008f c2008f) {
        this.f28407d = c2008f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f28405c;
        this.f28405c = i10 + 2;
        Object[] objArr = this.f28403a;
        return new C5789a(this.f28407d, objArr[i10], objArr[i10 + 1]);
    }
}
