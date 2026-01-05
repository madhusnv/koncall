package jy;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.m */
/* loaded from: classes3.dex */
public final class C3876m implements InterfaceC2401a {

    /* renamed from: a */
    public static final C3876m f19923a = new C3876m();

    /* renamed from: b */
    public static final t0 f19924b = new t0("kotlin.Char", C3053d.f16390d);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return Character.valueOf(interfaceC3366c.mo7702g());
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19924b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        interfaceC3367d.mo7719l(((Character) obj).charValue());
    }
}
