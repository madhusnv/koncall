package yx;

import ex.InterfaceC2141e;
import pg.x5;
import tx.v1;
import uw.C7565i;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.t */
/* loaded from: classes3.dex */
public final class C8826t implements v1 {

    /* renamed from: a */
    public final Object f42521a;

    /* renamed from: b */
    public final ThreadLocal f42522b;

    /* renamed from: c */
    public final C8827u f42523c;

    public C8826t(Object obj, ThreadLocal threadLocal) {
        this.f42521a = obj;
        this.f42522b = threadLocal;
        this.f42523c = new C8827u(threadLocal);
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    @Override // tx.v1
    /* renamed from: H */
    public final void mo9584H(InterfaceC7564h interfaceC7564h, Object obj) {
        this.f42522b.set(obj);
    }

    @Override // tx.v1
    public final Object f0(InterfaceC7564h interfaceC7564h) {
        ThreadLocal threadLocal = this.f42522b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f42521a);
        return obj;
    }

    @Override // uw.InterfaceC7562f
    public final InterfaceC7563g getKey() {
        return this.f42523c;
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7562f o0(InterfaceC7563g interfaceC7563g) {
        if (this.f42523c.equals(interfaceC7563g)) {
            return this;
        }
        return null;
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7564h t0(InterfaceC7564h interfaceC7564h) {
        return x5.m11928d(this, interfaceC7564h);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f42521a + ", threadLocal = " + this.f42522b + ')';
    }

    @Override // uw.InterfaceC7564h
    /* renamed from: z */
    public final InterfaceC7564h mo1766z(InterfaceC7563g interfaceC7563g) {
        return this.f42523c.equals(interfaceC7563g) ? C7565i.f36440a : this;
    }
}
