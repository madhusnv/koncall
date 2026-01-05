package jy;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.f */
/* loaded from: classes3.dex */
public final class C3869f implements InterfaceC2401a {

    /* renamed from: a */
    public static final C3869f f19891a = new C3869f();

    /* renamed from: b */
    public static final t0 f19892b = new t0("kotlin.Boolean", C3053d.f16388b);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return Boolean.valueOf(interfaceC3366c.mo7701f());
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19892b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        interfaceC3367d.mo7717j(((Boolean) obj).booleanValue());
    }
}
