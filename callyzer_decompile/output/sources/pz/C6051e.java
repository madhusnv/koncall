package pz;

import b00.C0526k;
import b00.C0535t;
import b00.h0;
import b00.k0;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pz.e */
/* loaded from: classes3.dex */
public final class C6051e implements h0 {

    /* renamed from: a */
    public final C0535t f29534a;

    /* renamed from: b */
    public boolean f29535b;

    /* renamed from: c */
    public final /* synthetic */ C6053g f29536c;

    public C6051e(C6053g c6053g) {
        this.f29536c = c6053g;
        this.f29534a = new C0535t(c6053g.f29542d.mo1538f());
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f29535b) {
            return;
        }
        this.f29535b = true;
        C0535t c0535t = this.f29534a;
        k0 k0Var = c0535t.f3666e;
        c0535t.f3666e = k0.f3639d;
        k0Var.mo1596a();
        k0Var.mo1597b();
        this.f29536c.f29543e = 3;
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return this.f29534a;
    }

    @Override // b00.h0, java.io.Flushable
    public final void flush() {
        if (this.f29535b) {
            return;
        }
        this.f29536c.f29542d.flush();
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        if (this.f29535b) {
            throw new IllegalStateException("closed");
        }
        AbstractC4297c.m8997a(source.f3638b, 0L, j6);
        this.f29536c.f29542d.h0(source, j6);
    }
}
