package ht;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g4.o0;
import java.util.List;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.C3998s;
import kr.AbstractC4189d;
import og.jd;
import or.C5440c;
import or.C5450m;
import pg.AbstractC5937r;
import pg.f9;
import pg.v8;
import pg.x8;
import ps.AbstractC6009i;
import qw.a0;
import r4.C6456k;
import sq.b1;
import sq.g2;
import sq.h3;
import sq.n3;
import ts.C7217d;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3028c implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16332a;

    /* renamed from: b */
    public final /* synthetic */ boolean f16333b;

    /* renamed from: c */
    public final /* synthetic */ Object f16334c;

    /* renamed from: d */
    public final /* synthetic */ Object f16335d;

    public /* synthetic */ C3028c(Object obj, Object obj2, boolean z6, int i10, int i11) {
        this.f16332a = i11;
        this.f16334c = obj;
        this.f16335d = obj2;
        this.f16333b = z6;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C6456k c6456k;
        switch (this.f16332a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5937r.m11839c((String) this.f16334c, (Integer) this.f16335d, this.f16333b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4189d.m8933a((C5440c) this.f16334c, this.f16333b, (InterfaceC2139c) this.f16335d, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4189d.m8946n((C5450m) this.f16334c, this.f16333b, (InterfaceC2139c) this.f16335d, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC6009i.m12042l((C7217d) this.f16334c, this.f16333b, (InterfaceC2139c) this.f16335d, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jd.m10714b((String) this.f16334c, this.f16333b, (InterfaceC7879r) this.f16335d, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                g2.m13147Y((InterfaceC7879r) this.f16334c, (List) this.f16335d, this.f16333b, (InterfaceC3962k) obj, C3953b.m8496A(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                g2.m13169u(this.f16333b, (InterfaceC7879r) this.f16334c, (InterfaceC2139c) this.f16335d, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 7:
                n3 n3Var = (n3) this.f16334c;
                o0 o0VarM6461a = (o0) this.f16335d;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strM11629c = f9.m11629c(c3966o, n3Var.f33088a);
                    if (this.f16333b) {
                        o0VarM6461a = o0.m6461a(o0VarM6461a, 0L, 0L, new C3998s(500), null, v8.m11898a(x8.m11932a(R.font.montserrat_bold)), 0L, 0L, null, 16777179);
                    }
                    b1.m13113q(strM11629c, C7876o.f37669a, 0L, null, new C6456k(3), 0, 0, 0L, null, o0VarM6461a, c3966o, 0, 492);
                } else {
                    c3966o.m8601S();
                }
                return a0.f30746a;
            default:
                h3 h3Var = (h3) this.f16334c;
                o0 o0VarM6461a2 = (o0) this.f16335d;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str = h3Var.f32940a;
                    C6456k c6456k2 = new C6456k(3);
                    if (this.f16333b) {
                        c6456k = c6456k2;
                        o0VarM6461a2 = o0.m6461a(o0VarM6461a2, 0L, 0L, new C3998s(500), null, v8.m11898a(x8.m11932a(R.font.montserrat_bold)), 0L, 0L, null, 16777179);
                    } else {
                        c6456k = c6456k2;
                    }
                    b1.m13113q(str, C7876o.f37669a, 0L, null, c6456k, 0, 0, 0L, null, o0VarM6461a2, c3966o2, 0, 492);
                } else {
                    c3966o2.m8601S();
                }
                return a0.f30746a;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C3028c(Object obj, boolean z6, Object obj2, int i10, int i11) {
        this.f16332a = i11;
        this.f16334c = obj;
        this.f16333b = z6;
        this.f16335d = obj2;
    }

    public /* synthetic */ C3028c(h3 h3Var, boolean z6, o0 o0Var) {
        this.f16332a = 8;
        this.f16334c = h3Var;
        this.f16333b = z6;
        this.f16335d = o0Var;
    }

    public /* synthetic */ C3028c(n3 n3Var, boolean z6, o0 o0Var) {
        this.f16332a = 7;
        this.f16334c = n3Var;
        this.f16333b = z6;
        this.f16335d = o0Var;
    }

    public /* synthetic */ C3028c(boolean z6, InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c, int i10) {
        this.f16332a = 6;
        this.f16333b = z6;
        this.f16334c = interfaceC7879r;
        this.f16335d = interfaceC2139c;
    }
}
