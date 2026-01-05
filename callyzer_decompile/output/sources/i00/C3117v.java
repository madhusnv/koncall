package i00;

import b00.AbstractC0517b;
import b00.InterfaceC0528m;
import iz.C3393z;
import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.v */
/* loaded from: classes3.dex */
public final class C3117v extends iz.n0 {

    /* renamed from: c */
    public final iz.n0 f16754c;

    /* renamed from: d */
    public final b00.d0 f16755d;

    /* renamed from: e */
    public IOException f16756e;

    public C3117v(iz.n0 n0Var) {
        this.f16754c = n0Var;
        this.f16755d = AbstractC0517b.m1524c(new C3116u(this, n0Var.mo7462n()));
    }

    @Override // iz.n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16754c.close();
    }

    @Override // iz.n0
    /* renamed from: h */
    public final long mo7460h() {
        return this.f16754c.mo7460h();
    }

    @Override // iz.n0
    /* renamed from: j */
    public final C3393z mo7461j() {
        return this.f16754c.mo7461j();
    }

    @Override // iz.n0
    /* renamed from: n */
    public final InterfaceC0528m mo7462n() {
        return this.f16755d;
    }
}
