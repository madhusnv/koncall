package fk;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import jy.InterfaceC3888y;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements InterfaceC3888y {

    /* renamed from: a */
    public static final b0 f10342a;
    private static final InterfaceC3055f descriptor;

    static {
        b0 b0Var = new b0();
        f10342a = b0Var;
        jy.p0 p0Var = new jy.p0("com.google.firebase.sessions.ProcessData", b0Var, 2);
        p0Var.m8428k("pid", false);
        p0Var.m8428k("uuid", false);
        descriptor = p0Var;
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        return new InterfaceC2401a[]{jy.d0.f19882a, jy.a1.f19869a};
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = interfaceC3366c.mo7699c(interfaceC3055f);
        String strMo7681d = null;
        boolean z6 = true;
        int i10 = 0;
        int iMo7684m = 0;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                iMo7684m = interfaceC3364aMo7699c.mo7684m(interfaceC3055f, 0);
                i10 |= 1;
            } else {
                if (iMo7685o != 1) {
                    throw new UnknownFieldException(iMo7685o);
                }
                strMo7681d = interfaceC3364aMo7699c.mo7681d(interfaceC3055f, 1);
                i10 |= 2;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new d0(i10, iMo7684m, strMo7681d);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        d0 value = (d0) obj;
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = interfaceC3367d.mo7711c(interfaceC3055f);
        int i10 = value.f10365a;
        C4597u c4597u = (C4597u) interfaceC3365bMo7711c;
        c4597u.m9440s(interfaceC3055f, 0);
        c4597u.mo7722p(i10);
        c4597u.m9444w(interfaceC3055f, 1, value.f10366b);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] typeParametersSerializers() {
        return jy.n0.f19931b;
    }
}
