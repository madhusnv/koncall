package oc;

import bd.C0645a;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import nc.AbstractC4996g;
import nc.InterfaceC4991b;
import tc.C7123h;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import wc.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oc.c */
/* loaded from: classes.dex */
public final class C5336c extends c0 implements InterfaceC4991b {

    /* renamed from: c */
    public final InterfaceC4991b f26252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5336c(InterfaceC4991b delegate) {
        super(delegate);
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f26252c = delegate;
    }

    @Override // nc.InterfaceC4991b
    /* renamed from: G */
    public final Object mo9898G(C0645a c0645a, C7123h c7123h, InterfaceC7559c interfaceC7559c) {
        return this.f26252c.mo9898G(c0645a, c7123h, interfaceC7559c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f26252c.close();
    }

    @Override // nc.InterfaceC4991b
    /* renamed from: d */
    public final AbstractC4996g mo9899d() {
        return this.f26252c.mo9899d();
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f26252c.mo1865w();
    }
}
