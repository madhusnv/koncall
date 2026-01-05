package ky;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.C3056g;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;
import ly.AbstractC4585i;
import pg.AbstractC5941v;
import pg.x9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 implements InterfaceC2401a {

    /* renamed from: a */
    public static final e0 f21671a = new e0();

    /* renamed from: b */
    public static final C3056g f21672b = AbstractC5941v.m11889c("kotlinx.serialization.json.JsonPrimitive", C3053d.f16396j, new InterfaceC3055f[0]);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        AbstractC4281m abstractC4281mMo8990j = x9.m11934b(interfaceC3366c).mo8990j();
        if (abstractC4281mMo8990j instanceof d0) {
            return (d0) abstractC4281mMo8990j;
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mMo8990j.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.a0.m8901a(abstractC4281mMo8990j.getClass()));
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f21672b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        d0 value = (d0) obj;
        AbstractC4154l.m8923f(value, "value");
        x9.m11933a(interfaceC3367d);
        if (value instanceof C4291w) {
            interfaceC3367d.mo7721o(C4292x.f21697a, C4291w.INSTANCE);
        } else {
            interfaceC3367d.mo7721o(C4287s.f21694a, (C4286r) value);
        }
    }
}
