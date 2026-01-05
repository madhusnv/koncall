package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 implements InterfaceC3888y {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2401a f19868a;

    public a0(InterfaceC2401a interfaceC2401a) {
        this.f19868a = interfaceC2401a;
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{this.f19868a};
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        throw new IllegalStateException("unsupported");
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
