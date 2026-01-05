package ds;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g4.o0;
import java.util.List;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.C3998s;
import og.ie;
import pg.v8;
import pg.x8;
import qr.AbstractC6287k;
import qr.C6302z;
import qw.InterfaceC6355e;
import qw.a0;
import r4.C6456k;
import sq.b1;
import sq.g3;
import w2.InterfaceC7879r;
import xu.AbstractC8463b;
import yu.AbstractC8775a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1788l implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8677a;

    /* renamed from: b */
    public final /* synthetic */ boolean f8678b;

    /* renamed from: c */
    public final /* synthetic */ Object f8679c;

    /* renamed from: d */
    public final /* synthetic */ Object f8680d;

    /* renamed from: e */
    public final /* synthetic */ Object f8681e;

    public /* synthetic */ C1788l(Object obj, boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC6355e interfaceC6355e, int i10, int i11) {
        this.f8677a = i11;
        this.f8680d = obj;
        this.f8678b = z6;
        this.f8679c = interfaceC2137a;
        this.f8681e = interfaceC6355e;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8677a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5461a((InterfaceC2139c) this.f8680d, this.f8678b, (InterfaceC2137a) this.f8679c, (InterfaceC2137a) this.f8681e, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC6287k.m12300q((String) this.f8680d, this.f8678b, (InterfaceC2137a) this.f8679c, (C6302z) this.f8681e, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ie.m10700a((String) this.f8680d, (String) this.f8681e, this.f8678b, (InterfaceC2137a) this.f8679c, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 3:
                g3 g3Var = (g3) this.f8680d;
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f8679c;
                o0 o0VarM6461a = (o0) this.f8681e;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = g3Var.f32921a;
                    C6456k c6456k = new C6456k(3);
                    if (this.f8678b) {
                        o0VarM6461a = o0.m6461a(o0VarM6461a, 0L, 0L, new C3998s(500), null, v8.m11898a(x8.m11932a(R.font.montserrat_bold)), 0L, 0L, null, 16777179);
                    }
                    b1.m13113q(str, interfaceC7879r, 0L, null, c6456k, 0, 0, 0L, null, o0VarM6461a, c3966o, 0, 492);
                } else {
                    c3966o.m8601S();
                }
                return a0.f30746a;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC8463b.m15769b((String) this.f8679c, (List) this.f8681e, (InterfaceC2139c) this.f8680d, this.f8678b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8775a.m16144o(this.f8678b, (InterfaceC2137a) this.f8679c, (InterfaceC2137a) this.f8681e, (InterfaceC2137a) this.f8680d, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C1788l(String str, String str2, boolean z6, InterfaceC2137a interfaceC2137a, int i10) {
        this.f8677a = 2;
        this.f8680d = str;
        this.f8681e = str2;
        this.f8678b = z6;
        this.f8679c = interfaceC2137a;
    }

    public /* synthetic */ C1788l(String str, List list, InterfaceC2139c interfaceC2139c, boolean z6, int i10) {
        this.f8677a = 4;
        this.f8679c = str;
        this.f8681e = list;
        this.f8680d = interfaceC2139c;
        this.f8678b = z6;
    }

    public /* synthetic */ C1788l(g3 g3Var, InterfaceC7879r interfaceC7879r, boolean z6, o0 o0Var) {
        this.f8677a = 3;
        this.f8680d = g3Var;
        this.f8679c = interfaceC7879r;
        this.f8678b = z6;
        this.f8681e = o0Var;
    }

    public /* synthetic */ C1788l(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, InterfaceC2137a interfaceC2137a3, int i10) {
        this.f8677a = 5;
        this.f8678b = z6;
        this.f8679c = interfaceC2137a;
        this.f8681e = interfaceC2137a2;
        this.f8680d = interfaceC2137a3;
    }
}
