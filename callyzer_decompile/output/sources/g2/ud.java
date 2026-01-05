package g2;

import d3.C1565s;
import j2.EnumC3525e;
import k2.C3966o;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ud {

    /* renamed from: a */
    public static final float f12911a = j2.q0.f18766b;

    static {
        EnumC3525e enumC3525e = j2.p0.f18724a;
        int i10 = j2.o0.f18715a;
    }

    /* renamed from: a */
    public static td m6325a(v1 v1Var) {
        td tdVar = v1Var.f12946S;
        if (tdVar != null) {
            return tdVar;
        }
        td tdVar2 = new td(y1.m6344c(v1Var, j2.q0.f18765a), y1.m6344c(v1Var, j2.q0.f18770f), y1.m6344c(v1Var, j2.q0.f18769e), y1.m6344c(v1Var, j2.q0.f18767c), y1.m6344c(v1Var, j2.q0.f18771g));
        v1Var.f12946S = tdVar2;
        return tdVar2;
    }

    /* renamed from: b */
    public static td m6326b(long j6, InterfaceC3962k interfaceC3962k) {
        long j10 = C1565s.f7817j;
        return m6325a((v1) ((C3966o) interfaceC3962k).m8618k(y1.f13286a)).m6314a(j6, j10, j10, j10, j10);
    }
}
