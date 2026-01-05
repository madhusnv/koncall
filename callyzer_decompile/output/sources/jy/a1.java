package jy;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a1 implements InterfaceC2401a {

    /* renamed from: a */
    public static final a1 f19869a = new a1();

    /* renamed from: b */
    public static final t0 f19870b = new t0("kotlin.String", C3053d.f16396j);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return interfaceC3366c.mo7705n();
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19870b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        String value = (String) obj;
        AbstractC4154l.m8923f(value, "value");
        interfaceC3367d.mo7724r(value);
    }
}
