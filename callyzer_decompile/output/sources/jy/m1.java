package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import qw.C6375y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m1 implements InterfaceC2401a {

    /* renamed from: a */
    public static final m1 f19927a = new m1();

    /* renamed from: b */
    public static final C3889z f19928b = n0.m8420a(z0.f19984a, "kotlin.UShort");

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return new C6375y(interfaceC3366c.mo7700e(f19928b).mo7696A());
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19928b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        interfaceC3367d.mo7713e(f19928b).mo7715g(((C6375y) obj).f30775a);
    }
}
