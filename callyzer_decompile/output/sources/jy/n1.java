package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n1 implements InterfaceC2401a {

    /* renamed from: b */
    public static final n1 f19932b = new n1();

    /* renamed from: a */
    public final /* synthetic */ C3884u f19933a = new C3884u("kotlin.Unit", qw.a0.f30746a);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        this.f19933a.deserialize(interfaceC3366c);
        return qw.a0.f30746a;
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return this.f19933a.getDescriptor();
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        qw.a0 value = (qw.a0) obj;
        AbstractC4154l.m8923f(value, "value");
        this.f19933a.serialize(interfaceC3367d, value);
    }
}
