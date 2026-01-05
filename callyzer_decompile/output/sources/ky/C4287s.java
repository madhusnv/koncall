package ky;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import jy.j1;
import jy.t0;
import kotlin.jvm.internal.AbstractC4154l;
import ly.AbstractC4585i;
import nx.AbstractC5184v;
import nx.AbstractC5185w;
import og.fa;
import pg.AbstractC5941v;
import pg.x9;
import qw.C6372v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.s */
/* loaded from: classes3.dex */
public final class C4287s implements InterfaceC2401a {

    /* renamed from: a */
    public static final C4287s f21694a = new C4287s();

    /* renamed from: b */
    public static final t0 f21695b = AbstractC5941v.m11887a("kotlinx.serialization.json.JsonLiteral", C3053d.f16396j);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        AbstractC4281m abstractC4281mMo8990j = x9.m11934b(interfaceC3366c).mo8990j();
        if (abstractC4281mMo8990j instanceof C4286r) {
            return (C4286r) abstractC4281mMo8990j;
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mMo8990j.toString(), "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.a0.m8901a(abstractC4281mMo8990j.getClass()));
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f21695b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        C4286r value = (C4286r) obj;
        AbstractC4154l.m8923f(value, "value");
        String str = value.f21693b;
        x9.m11933a(interfaceC3367d);
        if (value.f21692a) {
            interfaceC3367d.mo7724r(str);
            return;
        }
        Long lM10141w = AbstractC5185w.m10141w(str);
        if (lM10141w != null) {
            interfaceC3367d.mo7723q(lM10141w.longValue());
            return;
        }
        C6372v c6372vM10645d = fa.m10645d(str);
        if (c6372vM10645d != null) {
            interfaceC3367d.mo7713e(j1.f19913b).mo7723q(c6372vM10645d.f30772a);
            return;
        }
        Boolean bool = null;
        Double dValueOf = AbstractC5184v.m10124f(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            interfaceC3367d.mo7714f(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            interfaceC3367d.mo7717j(bool.booleanValue());
        } else {
            interfaceC3367d.mo7724r(str);
        }
    }
}
