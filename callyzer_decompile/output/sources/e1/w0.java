package e1;

import rw.AbstractC6672v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 extends AbstractC6672v {

    /* renamed from: a */
    public int f9078a;

    /* renamed from: b */
    public final /* synthetic */ v0 f9079b;

    public w0(v0 v0Var) {
        this.f9079b = v0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9078a < this.f9079b.m5649f();
    }

    @Override // rw.AbstractC6672v
    public final int nextInt() {
        int i10 = this.f9078a;
        this.f9078a = i10 + 1;
        return this.f9079b.m5647d(i10);
    }
}
