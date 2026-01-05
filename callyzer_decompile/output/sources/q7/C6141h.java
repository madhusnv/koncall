package q7;

import e1.AbstractC1916r;
import e1.v0;
import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l7.AbstractC4422v;
import ly.C4599w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q7.h */
/* loaded from: classes.dex */
public final class C6141h implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public int f29942a = -1;

    /* renamed from: b */
    public boolean f29943b;

    /* renamed from: c */
    public final /* synthetic */ C4599w f29944c;

    public C6141h(C4599w c4599w) {
        this.f29944c = c4599w;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29942a + 1 < ((v0) this.f29944c.f22767f).m5649f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f29943b = true;
        v0 v0Var = (v0) this.f29944c.f22767f;
        int i10 = this.f29942a + 1;
        this.f29942a = i10;
        return (AbstractC4422v) v0Var.m5650g(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f29943b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        v0 v0Var = (v0) this.f29944c.f22767f;
        ((AbstractC4422v) v0Var.m5650g(this.f29942a)).f22136c = null;
        int i10 = this.f29942a;
        Object[] objArr = v0Var.f9074c;
        Object obj = objArr[i10];
        Object obj2 = AbstractC1916r.f9044c;
        if (obj != obj2) {
            objArr[i10] = obj2;
            v0Var.f9072a = true;
        }
        this.f29942a = i10 - 1;
        this.f29943b = false;
    }
}
