package ik;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import jy.C3869f;
import jy.C3880q;
import jy.InterfaceC3888y;
import jy.d0;
import jy.j0;
import jy.n0;
import jy.p0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.UnknownFieldException;
import pb.AbstractC5870b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C3282f implements InterfaceC3888y {

    /* renamed from: a */
    public static final C3282f f17492a;
    private static final InterfaceC3055f descriptor;

    static {
        C3282f c3282f = new C3282f();
        f17492a = c3282f;
        p0 p0Var = new p0("com.google.firebase.sessions.settings.SessionConfigs", c3282f, 5);
        p0Var.m8428k("sessionsEnabled", false);
        p0Var.m8428k("sessionSamplingRate", false);
        p0Var.m8428k("sessionTimeoutSeconds", false);
        p0Var.m8428k("cacheDurationSeconds", false);
        p0Var.m8428k("cacheUpdatedTimeSeconds", false);
        descriptor = p0Var;
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] childSerializers() {
        InterfaceC2401a interfaceC2401aM11498a = AbstractC5870b.m11498a(C3869f.f19891a);
        InterfaceC2401a interfaceC2401aM11498a2 = AbstractC5870b.m11498a(C3880q.f19952a);
        d0 d0Var = d0.f19882a;
        return new InterfaceC2401a[]{interfaceC2401aM11498a, interfaceC2401aM11498a2, AbstractC5870b.m11498a(d0Var), AbstractC5870b.m11498a(d0Var), AbstractC5870b.m11498a(j0.f19910a)};
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3364a interfaceC3364aMo7699c = interfaceC3366c.mo7699c(interfaceC3055f);
        int i10 = 0;
        Boolean bool = null;
        Double d2 = null;
        Integer num = null;
        Integer num2 = null;
        Long l9 = null;
        boolean z6 = true;
        while (z6) {
            int iMo7685o = interfaceC3364aMo7699c.mo7685o(interfaceC3055f);
            if (iMo7685o == -1) {
                z6 = false;
            } else if (iMo7685o == 0) {
                bool = (Boolean) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 0, C3869f.f19891a, bool);
                i10 |= 1;
            } else if (iMo7685o == 1) {
                d2 = (Double) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 1, C3880q.f19952a, d2);
                i10 |= 2;
            } else if (iMo7685o == 2) {
                num = (Integer) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 2, d0.f19882a, num);
                i10 |= 4;
            } else if (iMo7685o == 3) {
                num2 = (Integer) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 3, d0.f19882a, num2);
                i10 |= 8;
            } else {
                if (iMo7685o != 4) {
                    throw new UnknownFieldException(iMo7685o);
                }
                l9 = (Long) interfaceC3364aMo7699c.mo7687s(interfaceC3055f, 4, j0.f19910a, l9);
                i10 |= 16;
            }
        }
        interfaceC3364aMo7699c.mo7680b(interfaceC3055f);
        return new C3284h(i10, bool, d2, num, num2, l9);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return descriptor;
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        C3284h value = (C3284h) obj;
        AbstractC4154l.m8923f(value, "value");
        InterfaceC3055f interfaceC3055f = descriptor;
        InterfaceC3365b interfaceC3365bMo7711c = interfaceC3367d.mo7711c(interfaceC3055f);
        interfaceC3365bMo7711c.mo7695n(interfaceC3055f, 0, C3869f.f19891a, value.f17493a);
        interfaceC3365bMo7711c.mo7695n(interfaceC3055f, 1, C3880q.f19952a, value.f17494b);
        d0 d0Var = d0.f19882a;
        interfaceC3365bMo7711c.mo7695n(interfaceC3055f, 2, d0Var, value.f17495c);
        interfaceC3365bMo7711c.mo7695n(interfaceC3055f, 3, d0Var, value.f17496d);
        interfaceC3365bMo7711c.mo7695n(interfaceC3055f, 4, j0.f19910a, value.f17497e);
        interfaceC3365bMo7711c.mo7693b(interfaceC3055f);
    }

    @Override // jy.InterfaceC3888y
    public final InterfaceC2401a[] typeParametersSerializers() {
        return n0.f19931b;
    }
}
