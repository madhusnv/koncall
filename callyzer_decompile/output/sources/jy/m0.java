package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m0 implements InterfaceC2401a {

    /* renamed from: a */
    public final InterfaceC2401a f19925a;

    /* renamed from: b */
    public final v0 f19926b;

    public m0(InterfaceC2401a serializer) {
        AbstractC4154l.m8923f(serializer, "serializer");
        this.f19925a = serializer;
        this.f19926b = new v0(serializer.getDescriptor());
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        if (interfaceC3366c.mo7707q()) {
            return interfaceC3366c.mo7708v(this.f19925a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m0.class == obj.getClass() && AbstractC4154l.m8918a(this.f19925a, ((m0) obj).f19925a);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return this.f19926b;
    }

    public final int hashCode() {
        return this.f19925a.hashCode();
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        if (obj != null) {
            interfaceC3367d.mo7721o(this.f19925a, obj);
        } else {
            interfaceC3367d.mo7712d();
        }
    }
}
