package z7;

import ex.InterfaceC2141e;
import java.util.concurrent.atomic.AtomicInteger;
import pg.x5;
import ug.C7453x;
import uw.InterfaceC7561e;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements InterfaceC7562f {

    /* renamed from: c */
    public static final C7453x f42717c = new C7453x(25);

    /* renamed from: a */
    public final InterfaceC7561e f42718a;

    /* renamed from: b */
    public final AtomicInteger f42719b = new AtomicInteger(0);

    public c0(InterfaceC7561e interfaceC7561e) {
        this.f42718a = interfaceC7561e;
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    @Override // uw.InterfaceC7562f
    public final InterfaceC7563g getKey() {
        return f42717c;
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
