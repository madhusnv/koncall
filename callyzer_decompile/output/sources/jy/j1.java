package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import qw.C6372v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j1 implements InterfaceC2401a {

    /* renamed from: a */
    public static final j1 f19912a = new j1();

    /* renamed from: b */
    public static final C3889z f19913b = n0.m8420a(j0.f19910a, "kotlin.ULong");

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return new C6372v(interfaceC3366c.mo7700e(f19913b).mo7706p());
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19913b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        interfaceC3367d.mo7713e(f19913b).mo7723q(((C6372v) obj).f30772a);
    }
}
