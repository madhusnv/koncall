package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import d3.C1565s;
import j2.AbstractC3534n;
import j2.EnumC3525e;
import k2.C3966o;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a */
    public static final o1.i1 f11893a;

    /* renamed from: b */
    public static final o1.i1 f11894b;

    /* renamed from: c */
    public static final float f11895c;

    /* renamed from: d */
    public static final float f11896d;

    /* renamed from: e */
    public static final float f11897e;

    static {
        float f6 = 24;
        float f10 = 8;
        f11893a = new o1.i1(f6, f10, f6, f10);
        float f11 = 16;
        AbstractC0242a.m648b(f11, f10, f6, f10);
        float f12 = 12;
        f11894b = new o1.i1(f12, f10, f12, f10);
        AbstractC0242a.m648b(f12, f10, f11, f10);
        f11895c = 58;
        f11896d = 40;
        EnumC3525e enumC3525e = AbstractC3534n.f18667a;
        f11897e = f10;
    }

    /* renamed from: a */
    public static j0 m6190a(long j6, long j10, long j11, long j12, InterfaceC3962k interfaceC3962k, int i10) {
        if ((i10 & 1) != 0) {
            j6 = C1565s.f7817j;
        }
        long j13 = j6;
        if ((i10 & 2) != 0) {
            j10 = C1565s.f7817j;
        }
        return m6192c((v1) ((C3966o) interfaceC3962k).m8618k(y1.f13286a)).m6175a(j13, j10, (i10 & 4) != 0 ? C1565s.f7817j : j11, j12);
    }

    /* renamed from: b */
    public static o0 m6191b() {
        return new o0(AbstractC3534n.f18668b, AbstractC3534n.f18676j, AbstractC3534n.f18673g, AbstractC3534n.f18674h, AbstractC3534n.f18671e);
    }

    /* renamed from: c */
    public static j0 m6192c(v1 v1Var) {
        j0 j0Var = v1Var.f12938K;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(y1.m6344c(v1Var, AbstractC3534n.f18667a), y1.m6344c(v1Var, AbstractC3534n.f18675i), C1565s.m5186b(0.12f, 14, y1.m6344c(v1Var, AbstractC3534n.f18670d)), C1565s.m5186b(0.38f, 14, y1.m6344c(v1Var, AbstractC3534n.f18672f)));
        v1Var.f12938K = j0Var2;
        return j0Var2;
    }

    /* renamed from: d */
    public static j0 m6193d(v1 v1Var) {
        j0 j0Var = v1Var.f12940M;
        if (j0Var != null) {
            return j0Var;
        }
        long j6 = C1565s.f7816i;
        j0 j0Var2 = new j0(j6, y1.m6344c(v1Var, j2.l0.f18658c), j6, C1565s.m5186b(0.38f, 14, y1.m6344c(v1Var, j2.l0.f18657b)));
        v1Var.f12940M = j0Var2;
        return j0Var2;
    }

    /* renamed from: e */
    public static j0 m6194e(long j6, long j10, InterfaceC3962k interfaceC3962k, int i10) {
        if ((i10 & 1) != 0) {
            j6 = C1565s.f7817j;
        }
        long j11 = j6;
        long j12 = C1565s.f7817j;
        return m6193d((v1) ((C3966o) interfaceC3962k).m8618k(y1.f13286a)).m6175a(j11, j10, j12, j12);
    }
}
