package fk;

import com.sun.mail.imap.IMAPStore;
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
public final /* synthetic */ class j1 implements InterfaceC3888y {

    /* renamed from: a */
    public static final j1 f10443a;
    private static final InterfaceC3055f descriptor;

    static {
        j1 j1Var = new j1();
        f10443a = j1Var;
        jy.p0 p0Var = new jy.p0("com.google.firebase.sessions.Time", j1Var, 3);
        p0Var.m8428k("ms", false);
        p0Var.m8428k("us", true);
        p0Var.m8428k("seconds", true);
        descriptor = p0Var;
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        jy.j0 j0Var = jy.j0.f19910a;
        return new InterfaceC2401a[]{j0Var, j0Var, j0Var};
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = interfaceC3366c.mo7699c(interfaceC3055f);
        int i10 = 0;
        long jMo7691y = 0;
        long jMo7691y2 = 0;
        long jMo7691y3 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                jMo7691y = interfaceC3364aMo7699c.mo7691y(interfaceC3055f, 0);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                jMo7691y2 = interfaceC3364aMo7699c.mo7691y(interfaceC3055f, 1);
                i10 |= 2;
            } else {
                if (iMo7685o != 2) {
                    throw new UnknownFieldException(iMo7685o);
                }
                jMo7691y3 = interfaceC3364aMo7699c.mo7691y(interfaceC3055f, 2);
                i10 |= 4;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new l1(i10, jMo7691y, jMo7691y2, jMo7691y3);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        l1 value = (l1) obj;
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = interfaceC3367d.mo7711c(interfaceC3055f);
        long j6 = value.f10453a;
        long j10 = value.f10455c;
        long j11 = value.f10454b;
        C4597u c4597u = (C4597u) interfaceC3365bMo7711c;
        c4597u.m9442u(interfaceC3055f, 0, j6);
        if (c4597u.mo7694i(interfaceC3055f) || j11 != IMAPStore.RESPONSE * j6) {
            c4597u.m9442u(interfaceC3055f, 1, j11);
        }
        if (c4597u.mo7694i(interfaceC3055f) || j10 != j6 / IMAPStore.RESPONSE) {
            c4597u.m9442u(interfaceC3055f, 2, j10);
        }
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] typeParametersSerializers() {
        return jy.n0.f19931b;
    }
}
