package pz;

import b00.C0526k;
import b00.C0535t;
import b00.InterfaceC0527l;
import b00.h0;
import b00.k0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pz.b */
/* loaded from: classes3.dex */
public final class C6048b implements h0 {

    /* renamed from: a */
    public final C0535t f29526a;

    /* renamed from: b */
    public boolean f29527b;

    /* renamed from: c */
    public final /* synthetic */ C6053g f29528c;

    public C6048b(C6053g c6053g) {
        this.f29528c = c6053g;
        this.f29526a = new C0535t(c6053g.f29542d.mo1538f());
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.f29527b) {
            return;
        }
        this.f29527b = true;
        this.f29528c.f29542d.mo1534N("0\r\n\r\n");
        C0535t c0535t = this.f29526a;
        k0 k0Var = c0535t.f3666e;
        c0535t.f3666e = k0.f3639d;
        k0Var.mo1596a();
        k0Var.mo1597b();
        this.f29528c.f29543e = 3;
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return this.f29526a;
    }

    @Override // b00.h0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f29527b) {
            return;
        }
        this.f29528c.f29542d.flush();
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) {
        InterfaceC0527l interfaceC0527l = this.f29528c.f29542d;
        AbstractC4154l.m8923f(source, "source");
        if (this.f29527b) {
            throw new IllegalStateException("closed");
        }
        if (j6 == 0) {
            return;
        }
        interfaceC0527l.mo1535V(j6);
        interfaceC0527l.mo1534N("\r\n");
        interfaceC0527l.h0(source, j6);
        interfaceC0527l.mo1534N("\r\n");
    }
}
