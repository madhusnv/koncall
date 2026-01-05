package ky;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Map;
import jy.a1;
import jy.f0;
import kotlin.jvm.internal.AbstractC4154l;
import pg.x9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 implements InterfaceC2401a {

    /* renamed from: a */
    public static final b0 f21664a = new b0();

    /* renamed from: b */
    public static final a0 f21665b = a0.f21661b;

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        x9.m11934b(interfaceC3366c);
        a1 a1Var = a1.f19869a;
        return new C4294z((Map) new f0(C4283o.f21689a).deserialize(interfaceC3366c));
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f21665b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        C4294z value = (C4294z) obj;
        AbstractC4154l.m8923f(value, "value");
        x9.m11933a(interfaceC3367d);
        a1 a1Var = a1.f19869a;
        new f0(C4283o.f21689a).serialize(interfaceC3367d, value);
    }
}
