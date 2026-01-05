package ky;

import fy.InterfaceC2401a;
import hy.C3052c;
import hy.C3056g;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5941v;
import pg.x9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.o */
/* loaded from: classes3.dex */
public final class C4283o implements InterfaceC2401a {

    /* renamed from: a */
    public static final C4283o f21689a = new C4283o();

    /* renamed from: b */
    public static final C3056g f21690b = AbstractC5941v.m11888b("kotlinx.serialization.json.JsonElement", C3052c.f16387b, new InterfaceC3055f[0], new hq.d0(3));

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return x9.m11934b(interfaceC3366c).mo8990j();
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f21690b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        AbstractC4281m value = (AbstractC4281m) obj;
        AbstractC4154l.m8923f(value, "value");
        x9.m11933a(interfaceC3367d);
        if (value instanceof d0) {
            interfaceC3367d.mo7721o(e0.f21671a, value);
        } else if (value instanceof C4294z) {
            interfaceC3367d.mo7721o(b0.f21664a, value);
        } else {
            if (!(value instanceof C4273e)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3367d.mo7721o(C4275g.f21676a, value);
        }
    }
}
