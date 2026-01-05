package ky;

import fy.InterfaceC2401a;
import hy.C3056g;
import hy.C3059j;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.json.internal.JsonDecodingException;
import pg.AbstractC5941v;
import pg.x9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.x */
/* loaded from: classes3.dex */
public final class C4292x implements InterfaceC2401a {

    /* renamed from: a */
    public static final C4292x f21697a = new C4292x();

    /* renamed from: b */
    public static final C3056g f21698b = AbstractC5941v.m11889c("kotlinx.serialization.json.JsonNull", C3059j.f16412b, new InterfaceC3055f[0]);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        x9.m11934b(interfaceC3366c);
        if (interfaceC3366c.mo7707q()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return C4291w.INSTANCE;
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f21698b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        C4291w value = (C4291w) obj;
        AbstractC4154l.m8923f(value, "value");
        x9.m11933a(interfaceC3367d);
        interfaceC3367d.mo7712d();
    }
}
