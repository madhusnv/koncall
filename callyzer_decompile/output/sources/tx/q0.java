package tx;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 implements b1 {

    /* renamed from: a */
    public final boolean f34667a;

    public q0(boolean z6) {
        this.f34667a = z6;
    }

    @Override // tx.b1
    /* renamed from: h */
    public final boolean mo13461h() {
        return this.f34667a;
    }

    @Override // tx.b1
    /* renamed from: i */
    public final n1 mo13462i() {
        return null;
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Empty{"), this.f34667a ? "Active" : "New", '}');
    }
}
