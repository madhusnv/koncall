package k2;

import fx.InterfaceC2395a;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f20409a = 0;

    /* renamed from: b */
    public final v1 f20410b;

    /* renamed from: c */
    public final int f20411c;

    /* renamed from: d */
    public int f20412d;

    /* renamed from: e */
    public int f20413e;

    public j0(v1 v1Var, int i10, int i11) {
        this.f20410b = v1Var;
        this.f20411c = i11;
        this.f20412d = i10;
        this.f20413e = v1Var.f20600h;
        if (v1Var.f20599g) {
            x1.m8710f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f20409a) {
            case 0:
                return this.f20412d < this.f20411c;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20409a) {
            case 0:
                v1 v1Var = this.f20410b;
                int i10 = v1Var.f20600h;
                int i11 = this.f20413e;
                if (i10 != i11) {
                    x1.m8710f();
                }
                int i12 = this.f20412d;
                this.f20412d = x1.m8705a(i12, v1Var.f20593a) + i12;
                return new w1(v1Var, i12, i11);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f20409a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j0(v1 v1Var, int i10, k0 k0Var, C3953b c3953b) {
        this.f20410b = v1Var;
        this.f20411c = i10;
        this.f20412d = v1Var.f20600h;
    }
}
