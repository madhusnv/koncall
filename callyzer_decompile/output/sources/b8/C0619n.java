package b8;

import dg.AbstractC1717f;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.a9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.n */
/* loaded from: classes.dex */
public final class C0619n implements InterfaceC4026c {

    /* renamed from: a */
    public final InterfaceC4026c f4054a;

    /* renamed from: b */
    public final long f4055b;

    /* renamed from: c */
    public final /* synthetic */ C0627v f4056c;

    public C0619n(C0627v c0627v, InterfaceC4026c delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f4056c = c0627v;
        this.f4054a = delegate;
        this.f4055b = AbstractC1717f.m5411a();
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: B */
    public final void mo1776B(int i10, String value) {
        AbstractC4154l.m8923f(value, "value");
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            this.f4054a.mo1776B(i10, value);
        } else {
            a9.m11540c(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: W */
    public final String mo1777W(int i10) {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            return this.f4054a.mo1777W(i10);
        }
        a9.m11540c(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            this.f4054a.close();
        } else {
            a9.m11540c(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: g */
    public final void mo1778g(int i10, long j6) {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            this.f4054a.mo1778g(i10, j6);
        } else {
            a9.m11540c(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // k8.InterfaceC4026c
    public final int getColumnCount() {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            return this.f4054a.getColumnCount();
        }
        a9.m11540c(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    public final String getColumnName(int i10) {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            return this.f4054a.getColumnName(i10);
        }
        a9.m11540c(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    public final long getLong(int i10) {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            return this.f4054a.getLong(i10);
        }
        a9.m11540c(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    /* renamed from: i */
    public final void mo1779i(int i10) {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            this.f4054a.mo1779i(i10);
        } else {
            a9.m11540c(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // k8.InterfaceC4026c
    public final boolean isNull(int i10) {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            return this.f4054a.isNull(i10);
        }
        a9.m11540c(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    public final boolean r0() {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            return this.f4054a.r0();
        }
        a9.m11540c(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // k8.InterfaceC4026c
    public final void reset() {
        if (this.f4056c.f4089d.get()) {
            a9.m11540c(21, "Statement is recycled");
            throw null;
        }
        if (this.f4055b == AbstractC1717f.m5411a()) {
            this.f4054a.reset();
        } else {
            a9.m11540c(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
