package kz;

import b00.AbstractC0517b;
import b00.C0526k;
import b00.InterfaceC0528m;
import b00.i0;
import b00.k0;
import iz.C3393z;
import iz.n0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kz.a */
/* loaded from: classes3.dex */
public final class C4295a extends n0 implements i0 {

    /* renamed from: c */
    public final C3393z f21700c;

    /* renamed from: d */
    public final long f21701d;

    public C4295a(C3393z c3393z, long j6) {
        this.f21700c = c3393z;
        this.f21701d = j6;
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return k0.f3639d;
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // iz.n0
    /* renamed from: h */
    public final long mo7460h() {
        return this.f21701d;
    }

    @Override // iz.n0
    /* renamed from: j */
    public final C3393z mo7461j() {
        return this.f21700c;
    }

    @Override // iz.n0
    /* renamed from: n */
    public final InterfaceC0528m mo7462n() {
        return AbstractC0517b.m1524c(this);
    }

    @Override // iz.n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
