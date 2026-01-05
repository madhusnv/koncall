package uw;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import pg.x5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uw.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7557a implements InterfaceC7562f {

    /* renamed from: a */
    public final InterfaceC7563g f36436a;

    public AbstractC7557a(InterfaceC7563g key) {
        AbstractC4154l.m8923f(key, "key");
        this.f36436a = key;
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    @Override // uw.InterfaceC7562f
    public final InterfaceC7563g getKey() {
        return this.f36436a;
    }

    @Override // uw.InterfaceC7564h
    public /* bridge */ InterfaceC7562f o0(InterfaceC7563g interfaceC7563g) {
        return x5.m11926a(this, interfaceC7563g);
    }

    @Override // uw.InterfaceC7564h
    public final /* bridge */ InterfaceC7564h t0(InterfaceC7564h interfaceC7564h) {
        return x5.m11928d(this, interfaceC7564h);
    }

    @Override // uw.InterfaceC7564h
    /* renamed from: z */
    public /* bridge */ InterfaceC7564h mo1766z(InterfaceC7563g interfaceC7563g) {
        return x5.m11927b(this, interfaceC7563g);
    }
}
