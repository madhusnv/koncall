package xc;

import tx.c0;
import tx.s1;
import uw.InterfaceC7559c;
import wc.C7983q;
import wc.C7985s;
import wc.InterfaceC7988v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.e */
/* loaded from: classes.dex */
public final class C8324e implements InterfaceC7988v {

    /* renamed from: a */
    public final InterfaceC7988v f39897a = new C7983q(16384);

    /* renamed from: b */
    public s1 f39898b;

    @Override // wc.InterfaceC7988v
    /* renamed from: Y */
    public final boolean mo15150Y(Throwable th2) {
        s1 s1Var;
        if (th2 != null && (s1Var = this.f39898b) != null) {
            s1Var.mo13566p(c0.m13478a("channel was closed with cause", th2));
        }
        return this.f39897a.mo15150Y(th2);
    }

    @Override // wc.InterfaceC7989w
    public final boolean cancel(Throwable th2) {
        s1 s1Var = this.f39898b;
        if (s1Var != null) {
            s1Var.mo13566p(c0.m13478a("channel was cancelled", th2));
        }
        return this.f39897a.cancel(th2);
    }

    @Override // wc.InterfaceC7988v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39897a.close();
    }

    @Override // wc.InterfaceC7989w
    public final int getAvailableForRead() {
        return this.f39897a.getAvailableForRead();
    }

    @Override // wc.InterfaceC7989w
    public final Throwable getClosedCause() {
        return this.f39897a.getClosedCause();
    }

    @Override // wc.InterfaceC7988v
    public final Object i0(C7985s c7985s, long j6, InterfaceC7559c interfaceC7559c) {
        return this.f39897a.i0(c7985s, j6, interfaceC7559c);
    }

    @Override // wc.InterfaceC7989w
    public final boolean isClosedForRead() {
        return this.f39897a.isClosedForRead();
    }

    @Override // wc.InterfaceC7989w
    public final boolean isClosedForWrite() {
        return this.f39897a.isClosedForWrite();
    }

    @Override // wc.InterfaceC7989w
    public final Object read(C7985s c7985s, long j6, InterfaceC7559c interfaceC7559c) {
        return this.f39897a.read(c7985s, j6, interfaceC7559c);
    }
}
