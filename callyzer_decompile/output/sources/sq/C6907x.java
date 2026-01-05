package sq;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import bt.C0770o;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import g2.AbstractC2465s;
import g2.e6;
import g2.p9;
import g2.vd;
import g2.xd;
import hq.C2997b;
import i3.AbstractC3166c;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5246e;
import o1.C5261t;
import o1.InterfaceC5262u;
import og.od;
import og.pe;
import pg.b9;
import qr.AbstractC6287k;
import qw.InterfaceC6355e;
import s2.AbstractC6740i;
import uv.AbstractC7554g;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import xt.C8457h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sq.x */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6907x implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f33343a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f33344b;

    /* renamed from: c */
    public final /* synthetic */ Object f33345c;

    /* renamed from: d */
    public final /* synthetic */ Object f33346d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6355e f33347e;

    public /* synthetic */ C6907x(int i10, List list, k2.w0 w0Var, InterfaceC2141e interfaceC2141e) {
        this.f33344b = i10;
        this.f33345c = list;
        this.f33346d = w0Var;
        this.f33347e = interfaceC2141e;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C7876o c7876o;
        C7876o c7876o2;
        switch (this.f33343a) {
            case 0:
                String str = (String) this.f33345c;
                ArrayList arrayList = (ArrayList) this.f33346d;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f33347e;
                InterfaceC5262u BottomSheet = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(BottomSheet, "$this$BottomSheet");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C7876o c7876o3 = C7876o.f37669a;
                    float f6 = 8;
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0237a.m633a(AbstractC0245d.m668e(c7876o3, 1.0f), ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12971r, d3.h0.f7748a), f6, DefinitionKt.NO_Float_VALUE, f6, f6, 2);
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
                    int i10 = c3966o.f20462P;
                    k2.i1 i1VarM8620m = c3966o.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o.c0();
                    if (c3966o.f20461O) {
                        c3966o.m8619l(c7637i);
                    } else {
                        c3966o.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    InterfaceC2139c interfaceC2139c2 = interfaceC2139c;
                    C7876o c7876o4 = c7876o3;
                    b1.m13113q(str, AbstractC0242a.m658l(c7876o3, 10, DefinitionKt.NO_Float_VALUE, 2), 0L, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13048d, c3966o, 48, 508);
                    c3966o.m8607Y(1262398490);
                    int size = arrayList.size();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < size) {
                        Object obj4 = arrayList.get(i11);
                        i11++;
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        String str2 = (String) obj4;
                        boolean z6 = i12 == this.f33344b;
                        InterfaceC2139c interfaceC2139c3 = interfaceC2139c2;
                        boolean zM8614g = c3966o.m8614g(interfaceC2139c3) | c3966o.m8612e(i12);
                        Object objM8596M = c3966o.m8596M();
                        if (zM8614g || objM8596M == C3961j.f20408a) {
                            objM8596M = new C2997b(i12, 1, interfaceC2139c3);
                            c3966o.j0(objM8596M);
                        }
                        AbstractC6287k.m12293j(0, (InterfaceC2137a) objM8596M, str2, c3966o, z6);
                        if (i12 < pe.m10832g(arrayList)) {
                            c3966o.m8607Y(-1868457194);
                            c7876o = c7876o4;
                            p9.m6245i(AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), 35, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 1, ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12928A, c3966o, 54, 0);
                        } else {
                            c7876o = c7876o4;
                            c3966o.m8607Y(-1885264588);
                        }
                        c3966o.m8623p(false);
                        i12 = i13;
                        interfaceC2139c2 = interfaceC2139c3;
                        c7876o4 = c7876o;
                    }
                    c3966o.m8623p(false);
                    c3966o.m8623p(true);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            default:
                List list = (List) this.f33345c;
                k2.w0 w0Var = (k2.w0) this.f33346d;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f33347e;
                InterfaceC5262u OutlinedCard = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(OutlinedCard, "$this$OutlinedCard");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C5246e c5246e = AbstractC5251j.f25761e;
                    C7870i c7870i = C7864c.f37652l;
                    C7876o c7876o5 = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(c7876o5, 4, 2);
                    o1.n1 n1VarM10357a = o1.m1.m10357a(c5246e, c7870i, c3966o2, 54);
                    int i14 = c3966o2.f20462P;
                    k2.i1 i1VarM8620m2 = c3966o2.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM657k);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i2 = C7638j.f36921b;
                    c3966o2.c0();
                    if (c3966o2.f20461O) {
                        c3966o2.m8619l(c7637i2);
                    } else {
                        c3966o2.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o2);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m2, c3966o2);
                    C7636h c7636h2 = C7638j.f36926g;
                    if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i14))) {
                        AbstractC1452a.m4577x(i14, c3966o2, i14, c7636h2);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c2, c3966o2);
                    int i15 = this.f33344b;
                    int i16 = -1;
                    if (i15 != -1) {
                        c3966o2.m8607Y(-1294602182);
                        int i17 = ((C4802m) list.get(i15)).f23893e;
                        if (i17 == 1) {
                            i16 = R.drawable.ic_in_active_sim_1;
                        } else if (i17 == 2) {
                            i16 = R.drawable.ic_in_active_sim_2;
                        }
                        AbstractC3166c abstractC3166cM11551a = b9.m11551a(i16, 0, c3966o2);
                        float f10 = 12;
                        InterfaceC7879r interfaceC7879rM682s = AbstractC0245d.m682s(AbstractC0245d.m670g(c7876o5, f10), f10);
                        c7876o2 = c7876o5;
                        pg.i0.m11693a(abstractC3166cM11551a, "", interfaceC7879rM682s, null, null, DefinitionKt.NO_Float_VALUE, null, c3966o2, 432, 120);
                        c3966o2 = c3966o2;
                    } else {
                        c7876o2 = c7876o5;
                        c3966o2.m8607Y(-1358701688);
                    }
                    c3966o2.m8623p(false);
                    e6.m6133b(od.m10797b(), null, AbstractC0245d.m678o(c7876o2, 16), AbstractC7554g.m14301b(c3966o2).f36375C, c3966o2, 432, 0);
                    boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
                    Object objM8596M2 = c3966o2.m8596M();
                    if (objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new C8457h(w0Var, 12);
                        c3966o2.j0(objM8596M2);
                    }
                    C3966o c3966o3 = c3966o2;
                    AbstractC2465s.m6298a(zBooleanValue, (InterfaceC2137a) objM8596M2, AbstractC0237a.m633a(c7876o2, AbstractC7554g.m14301b(c3966o2).f36409u, d3.h0.f7748a), 0L, null, null, null, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, AbstractC6740i.m12902d(-699239979, new C0770o(20, list, interfaceC2141e, w0Var), c3966o2), c3966o3, 48, 2040);
                    c3966o3.m8623p(true);
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ C6907x(String str, ArrayList arrayList, int i10, InterfaceC2139c interfaceC2139c) {
        this.f33345c = str;
        this.f33346d = arrayList;
        this.f33344b = i10;
        this.f33347e = interfaceC2139c;
    }
}
