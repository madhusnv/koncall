package ky;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.List;
import jy.C3866c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.x9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.g */
/* loaded from: classes3.dex */
public final class C4275g implements InterfaceC2401a {

    /* renamed from: a */
    public static final C4275g f21676a = new C4275g();

    /* renamed from: b */
    public static final C4274f f21677b = C4274f.f21673b;

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        x9.m11934b(interfaceC3366c);
        return new C4273e((List) new C3866c(C4283o.f21689a).deserialize(interfaceC3366c));
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f21677b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        C4273e value = (C4273e) obj;
        AbstractC4154l.m8923f(value, "value");
        x9.m11933a(interfaceC3367d);
        new C3866c(C4283o.f21689a).serialize(interfaceC3367d, value);
    }
}
