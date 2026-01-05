package b8;

import bl.C0689a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import pg.x5;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.a */
/* loaded from: classes.dex */
public final class C0606a implements InterfaceC7562f {

    /* renamed from: b */
    public static final C0689a f3996b = new C0689a(3);

    /* renamed from: a */
    public final C0627v f3997a;

    public C0606a(C0627v connectionWrapper) {
        AbstractC4154l.m8923f(connectionWrapper, "connectionWrapper");
        this.f3997a = connectionWrapper;
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    @Override // uw.InterfaceC7562f
    public final InterfaceC7563g getKey() {
        return f3996b;
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
