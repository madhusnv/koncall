package jy;

import fy.InterfaceC2401a;
import hy.C3053d;
import hy.InterfaceC3055f;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import kotlin.jvm.internal.AbstractC4154l;
import og.bb;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import ox.C5770a;
import ox.EnumC5772c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.r */
/* loaded from: classes3.dex */
public final class C3881r implements InterfaceC2401a {

    /* renamed from: a */
    public static final C3881r f19954a = new C3881r();

    /* renamed from: b */
    public static final t0 f19955b = new t0("kotlin.time.Duration", C3053d.f16396j);

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        int i10 = C5770a.f28335d;
        String value = interfaceC3366c.mo7705n();
        AbstractC4154l.m8923f(value, "value");
        try {
            return new C5770a(bb.m10545a(value));
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(AbstractC5601a.m11238i("Invalid ISO duration string format: '", value, "'."), e2);
        }
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return f19955b;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        long j6 = ((C5770a) obj).f28336a;
        int i10 = C5770a.f28335d;
        StringBuilder sb2 = new StringBuilder();
        if (C5770a.m11298i(j6)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM11304o = C5770a.m11298i(j6) ? C5770a.m11304o(j6) : j6;
        long jM11302m = C5770a.m11302m(jM11304o, EnumC5772c.HOURS);
        boolean z6 = false;
        int iM11302m = C5770a.m11297h(jM11304o) ? 0 : (int) (C5770a.m11302m(jM11304o, EnumC5772c.MINUTES) % 60);
        int iM11302m2 = C5770a.m11297h(jM11304o) ? 0 : (int) (C5770a.m11302m(jM11304o, EnumC5772c.SECONDS) % 60);
        int iM11295f = C5770a.m11295f(jM11304o);
        if (C5770a.m11297h(j6)) {
            jM11302m = 9999999999999L;
        }
        boolean z10 = jM11302m != 0;
        boolean z11 = (iM11302m2 == 0 && iM11295f == 0) ? false : true;
        if (iM11302m != 0 || (z11 && z10)) {
            z6 = true;
        }
        if (z10) {
            sb2.append(jM11302m);
            sb2.append('H');
        }
        if (z6) {
            sb2.append(iM11302m);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z6)) {
            C5770a.m11291b(sb2, iM11302m2, iM11295f, 9, "S", true);
        }
        interfaceC3367d.mo7724r(sb2.toString());
    }
}
