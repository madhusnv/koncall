package l2;

import b2.C0558p;
import ex.InterfaceC2137a;
import k2.C3952a;
import k2.InterfaceC3954c;
import k2.n1;
import k2.s1;
import k2.y1;
import m2.C4640e;
import s2.C6739h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l2.r */
/* loaded from: classes.dex */
public final class C4345r extends i0 {

    /* renamed from: d */
    public static final C4345r f21834d;

    /* renamed from: e */
    public static final C4345r f21835e;

    /* renamed from: f */
    public static final C4345r f21836f;

    /* renamed from: g */
    public static final C4345r f21837g;

    /* renamed from: c */
    public final /* synthetic */ int f21838c;

    static {
        int i10 = 1;
        f21834d = new C4345r(i10, 2, 0);
        int i11 = 1;
        f21835e = new C4345r(i11, i11, 1);
        f21836f = new C4345r(i10, 2, 2);
        int i12 = 1;
        f21837g = new C4345r(i12, i12, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4345r(int i10, int i11, int i12) {
        super(i10, i11);
        this.f21838c = i12;
    }

    @Override // l2.i0
    /* renamed from: a */
    public final void mo9056a(C0558p c0558p, InterfaceC3954c interfaceC3954c, y1 y1Var, C6739h c6739h) {
        int iM8734c;
        int iM8745o;
        switch (this.f21838c) {
            case 0:
                Object objInvoke = ((InterfaceC2137a) c0558p.m1659g(0)).invoke();
                C3952a c3952a = (C3952a) c0558p.m1659g(1);
                int iM1658f = c0558p.m1658f(0);
                c3952a.getClass();
                y1Var.m8731S(y1Var.m8734c(c3952a), objInvoke);
                interfaceC3954c.mo2741j(iM1658f, objInvoke);
                interfaceC3954c.mo2736d(objInvoke);
                break;
            case 1:
                C3952a c3952a2 = (C3952a) c0558p.m1659g(0);
                int iM1658f2 = c0558p.m1658f(0);
                interfaceC3954c.mo2740i();
                c3952a2.getClass();
                interfaceC3954c.mo2735c(iM1658f2, y1Var.m8714B(y1Var.m8734c(c3952a2)));
                break;
            case 2:
                Object objM1659g = c0558p.m1659g(0);
                C3952a c3952a3 = (C3952a) c0558p.m1659g(1);
                int iM1658f3 = c0558p.m1658f(0);
                if (objM1659g instanceof s1) {
                    ((C4640e) c6739h.f32182c).m9506b((s1) objM1659g);
                }
                int iM8734c2 = y1Var.m8734c(c3952a3);
                int iM8738g = y1Var.m8738g(y1Var.m8724L(iM8734c2, iM1658f3));
                Object[] objArr = y1Var.f20612c;
                Object obj = objArr[iM8738g];
                objArr[iM8738g] = objM1659g;
                if (!(obj instanceof s1)) {
                    if (obj instanceof n1) {
                        ((n1) obj).m8579d();
                        break;
                    }
                } else {
                    int iM8745o2 = y1Var.m8745o() - y1Var.m8724L(iM8734c2, iM1658f3);
                    s1 s1Var = (s1) obj;
                    C3952a c3952a4 = s1Var.f20550b;
                    if (c3952a4 == null || !c3952a4.m8486a()) {
                        iM8734c = -1;
                        iM8745o = -1;
                    } else {
                        iM8734c = y1Var.m8734c(c3952a4);
                        iM8745o = y1Var.m8745o() - y1Var.m8725M(iM8734c);
                    }
                    c6739h.m12898f(s1Var, iM8745o2, iM8734c, iM8745o);
                    break;
                }
                break;
            default:
                Object objM1659g2 = c0558p.m1659g(0);
                int iM1658f4 = c0558p.m1658f(0);
                if (objM1659g2 instanceof s1) {
                    ((C4640e) c6739h.f32182c).m9506b((s1) objM1659g2);
                }
                int iM8738g2 = y1Var.m8738g(y1Var.m8724L(y1Var.f20629t, iM1658f4));
                Object[] objArr2 = y1Var.f20612c;
                Object obj2 = objArr2[iM8738g2];
                objArr2[iM8738g2] = objM1659g2;
                if (!(obj2 instanceof s1)) {
                    if (obj2 instanceof n1) {
                        ((n1) obj2).m8579d();
                        break;
                    }
                } else {
                    c6739h.m12898f((s1) obj2, y1Var.m8745o() - y1Var.m8724L(y1Var.f20629t, iM1658f4), -1, -1);
                    break;
                }
                break;
        }
    }
}
