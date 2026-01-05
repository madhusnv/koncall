package jy;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.i */
/* loaded from: classes3.dex */
public final class C3872i implements InterfaceC2401a {

    /* renamed from: a */
    public static final C3872i f19906a = new C3872i();

    /* renamed from: b */
    public static final t0 f19907b = new t0("kotlin.Byte", C3053d.f16389c);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return Byte.valueOf(interfaceC3366c.mo7709x());
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19907b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        interfaceC3367d.mo7716h(((Number) obj).byteValue());
    }
}
