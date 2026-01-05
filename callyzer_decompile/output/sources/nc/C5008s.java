package nc;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import pg.x5;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.s */
/* loaded from: classes.dex */
public final class C5008s implements InterfaceC7562f {

    /* renamed from: b */
    public static final C5006q f24760b = new C5006q();

    /* renamed from: a */
    public final InterfaceC7564h f24761a;

    public C5008s(InterfaceC7564h callContext) {
        AbstractC4154l.m8923f(callContext, "callContext");
        this.f24761a = callContext;
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    @Override // uw.InterfaceC7562f
    public final InterfaceC7563g getKey() {
        return f24760b;
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7562f o0(InterfaceC7563g interfaceC7563g) {
        return x5.m11926a(this, interfaceC7563g);
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7564h t0(InterfaceC7564h interfaceC7564h) {
        return x5.m11928d(this, interfaceC7564h);
    }

    @Override // uw.InterfaceC7564h
    /* renamed from: z */
    public final InterfaceC7564h mo1766z(InterfaceC7563g interfaceC7563g) {
        return x5.m11927b(this, interfaceC7563g);
    }
}
