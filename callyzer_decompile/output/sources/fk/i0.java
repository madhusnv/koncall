package fk;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Map;
import jy.InterfaceC3888y;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import ly.C4597u;
import pb.AbstractC5870b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements InterfaceC3888y {

    /* renamed from: a */
    public static final i0 f10435a;
    private static final InterfaceC3055f descriptor;

    static {
        i0 i0Var = new i0();
        f10435a = i0Var;
        jy.p0 p0Var = new jy.p0("com.google.firebase.sessions.SessionData", i0Var, 3);
        p0Var.m8428k("sessionDetails", false);
        p0Var.m8428k("backgroundTime", true);
        p0Var.m8428k("processDataMap", true);
        descriptor = p0Var;
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{n0.f10461a, AbstractC5870b.m11498a(j1.f10443a), AbstractC5870b.m11498a(k0.f10447d[2])};
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = interfaceC3366c.mo7699c(interfaceC3055f);
        InterfaceC2401a[] interfaceC2401aArr = k0.f10447d;
        p0 p0Var = null;
        boolean z6 = true;
        int i10 = 0;
        l1 l1Var = null;
        Map map = null;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                p0Var = (p0) interfaceC3364aMo7699c.mo7689u(interfaceC3055f, 0, n0.f10461a, p0Var);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                l1Var = (l1) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 1, j1.f10443a, l1Var);
                i10 |= 2;
            } else {
                if (iMo7685o != 2) {
                    throw new UnknownFieldException(iMo7685o);
                }
                map = (Map) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, interfaceC2401aArr[2], map);
                i10 |= 4;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new k0(i10, p0Var, l1Var, map);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        k0 value = (k0) obj;
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = interfaceC3367d.mo7711c(interfaceC3055f);
        InterfaceC2401a[] interfaceC2401aArr = k0.f10447d;
        n0 n0Var = n0.f10461a;
        p0 p0Var = value.f10448a;
        Map map = value.f10450c;
        l1 l1Var = value.f10449b;
        C4597u c4597u = (C4597u) interfaceC3365bMo7711c;
        c4597u.m9443v(interfaceC3055f, 0, n0Var, p0Var);
        if (c4597u.mo7694i(interfaceC3055f) || l1Var != null) {
            c4597u.mo7695n(interfaceC3055f, 1, j1.f10443a, l1Var);
        }
        if (c4597u.mo7694i(interfaceC3055f) || map != null) {
            c4597u.mo7695n(interfaceC3055f, 2, interfaceC2401aArr[2], map);
        }
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] typeParametersSerializers() {
        return jy.n0.f19931b;
    }
}
