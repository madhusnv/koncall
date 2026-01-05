package pc;

import b00.C0526k;
import b00.InterfaceC0527l;
import b00.h0;
import b00.k0;
import ec.C2005c;
import kotlin.jvm.internal.AbstractC4154l;
import pd.C5897c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.i */
/* loaded from: classes.dex */
public final class C5881i implements h0 {

    /* renamed from: a */
    public final InterfaceC0527l f28683a;

    /* renamed from: b */
    public final C5897c f28684b;

    /* renamed from: c */
    public final C2005c f28685c;

    public C5881i(InterfaceC0527l interfaceC0527l, C5897c counter, C2005c c2005c) {
        AbstractC4154l.m8923f(counter, "counter");
        this.f28683a = interfaceC0527l;
        this.f28684b = counter;
        this.f28685c = c2005c;
    }

    @Override // b00.h0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        InterfaceC0527l interfaceC0527l = this.f28683a;
        interfaceC0527l.mo1537c();
        interfaceC0527l.close();
    }

    @Override // b00.h0
    /* renamed from: f */
    public final k0 mo1538f() {
        return this.f28683a.mo1538f();
    }

    @Override // b00.h0, java.io.Flushable
    public final void flush() {
        this.f28683a.flush();
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) {
        AbstractC4154l.m8923f(source, "source");
        this.f28683a.h0(source, j6);
        C5897c.m11505a(this.f28684b, j6, this.f28685c);
    }
}
