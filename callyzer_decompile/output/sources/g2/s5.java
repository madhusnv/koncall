package g2;

import d3.C1565s;
import i1.C3138q;
import j2.AbstractC3538r;
import j2.EnumC3525e;
import k2.C3966o;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class s5 {

    /* renamed from: a */
    public static final float f12676a = AbstractC3538r.f18772a;

    /* renamed from: a */
    public static C3138q m6302a(boolean z6, long j6, long j10, InterfaceC3962k interfaceC3962k, int i10) {
        if ((i10 & 4) != 0) {
            j6 = y1.m6345d(AbstractC3538r.f18786o, interfaceC3962k);
        }
        if ((i10 & 8) != 0) {
            j10 = C1565s.f7816i;
        }
        C1565s.m5186b(AbstractC3538r.f18780i, 14, y1.m6345d(AbstractC3538r.f18779h, interfaceC3962k));
        int i11 = C1565s.f7818k;
        float f6 = AbstractC3538r.f18787p;
        float f10 = AbstractC3538r.f18784m;
        if (z6) {
            j6 = j10;
        }
        if (z6) {
            f6 = f10;
        }
        return pg.d0.m11579a(f6, j6);
    }

    /* renamed from: b */
    public static x9 m6303b(long j6, long j10, long j11, long j12, InterfaceC3962k interfaceC3962k, int i10) {
        long j13 = (i10 & 1) != 0 ? C1565s.f7817j : j6;
        long j14 = (i10 & 2) != 0 ? C1565s.f7817j : j10;
        long j15 = C1565s.f7817j;
        long j16 = (i10 & 512) != 0 ? j15 : j12;
        v1 v1Var = (v1) ((C3966o) interfaceC3962k).m8618k(y1.f13286a);
        x9 x9Var = v1Var.f12944Q;
        if (x9Var == null) {
            long j17 = C1565s.f7816i;
            long jM6344c = y1.m6344c(v1Var, AbstractC3538r.f18790s);
            EnumC3525e enumC3525e = AbstractC3538r.f18794w;
            long jM6344c2 = y1.m6344c(v1Var, enumC3525e);
            long jM6344c3 = y1.m6344c(v1Var, enumC3525e);
            long jM5186b = C1565s.m5186b(AbstractC3538r.f18774c, 14, y1.m6344c(v1Var, AbstractC3538r.f18773b));
            EnumC3525e enumC3525e2 = AbstractC3538r.f18791t;
            long jM6344c4 = y1.m6344c(v1Var, enumC3525e2);
            float f6 = AbstractC3538r.f18792u;
            long jM5186b2 = C1565s.m5186b(f6, 14, jM6344c4);
            long jM5186b3 = C1565s.m5186b(f6, 14, y1.m6344c(v1Var, enumC3525e2));
            long jM6344c5 = y1.m6344c(v1Var, AbstractC3538r.f18781j);
            long jM5186b4 = C1565s.m5186b(AbstractC3538r.f18778g, 14, y1.m6344c(v1Var, AbstractC3538r.f18777f));
            long jM6344c6 = y1.m6344c(v1Var, AbstractC3538r.f18789r);
            EnumC3525e enumC3525e3 = AbstractC3538r.f18793v;
            x9Var = new x9(j17, jM6344c, jM6344c2, jM6344c3, j17, jM5186b, jM5186b2, jM5186b3, jM6344c5, jM5186b4, jM6344c6, y1.m6344c(v1Var, enumC3525e3), y1.m6344c(v1Var, enumC3525e3));
            v1Var.f12944Q = x9Var;
        }
        return x9Var.m6340a(j13, j14, j15, j15, j15, j15, j15, j15, j11, j15, j16, j15, j15);
    }
}
