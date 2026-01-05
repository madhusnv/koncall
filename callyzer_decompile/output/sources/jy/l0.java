package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l0 implements InterfaceC2401a {

    /* renamed from: a */
    public static final l0 f19920a = new l0();

    /* renamed from: b */
    public static final k0 f19921b = k0.f19916a;

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19921b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        Void value = (Void) obj;
        AbstractC4154l.m8923f(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
