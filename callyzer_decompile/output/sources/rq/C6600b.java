package rq;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import aw.C0471k;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import g2.e6;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import i3.AbstractC3166c;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.l1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.m1;
import o1.n1;
import og.he;
import og.ie;
import og.pe;
import og.r0;
import og.w1;
import p1.AbstractC5788a;
import pg.f9;
import qr.C6280d;
import qw.a0;
import ru.C6623a;
import ru.C6624b;
import sq.b1;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rq.b */
/* loaded from: classes3.dex */
public final class C6600b extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f31714a;

    /* renamed from: b */
    public final /* synthetic */ List f31715b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f31716c;

    /* renamed from: d */
    public final /* synthetic */ List f31717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6600b(List list, InterfaceC2139c interfaceC2139c, List list2, int i10) {
        super(4);
        this.f31714a = i10;
        this.f31715b = list;
        this.f31716c = interfaceC2139c;
        this.f31717d = list2;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        switch (this.f31714a) {
            case 0:
                InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i10 = (((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(i10 & 1, (i10 & 147) != 146)) {
                    C6624b c6624b = (C6624b) this.f31715b.get(iIntValue);
                    c3966o.m8607Y(-1319236430);
                    String strM11629c = f9.m11629c(c3966o, c6624b.f31815a);
                    boolean z6 = c6624b.f31816b;
                    InterfaceC2139c interfaceC2139c = this.f31716c;
                    boolean zM8614g = ((((i10 & 112) ^ 48) > 32 && c3966o.m8612e(iIntValue)) || (i10 & 48) == 32) | c3966o.m8614g(interfaceC2139c);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C6280d(iIntValue, 2, interfaceC2139c);
                        c3966o.j0(objM8596M);
                    }
                    he.m10685b(0, (InterfaceC2137a) objM8596M, strM11629c, c3966o, z6);
                    if (iIntValue < pe.m10832g(this.f31717d)) {
                        c3966o.m8607Y(-1319057685);
                        p9.m6245i(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 1, 0L, c3966o, 54, 4);
                    } else {
                        c3966o.m8607Y(-1320982413);
                    }
                    c3966o.m8623p(false);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                InterfaceC0246a interfaceC0246a2 = (InterfaceC0246a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i11 = (((C3966o) interfaceC3962k2).m8614g(interfaceC0246a2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= ((C3966o) interfaceC3962k2).m8612e(iIntValue3) ? 32 : 16;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(i11 & 1, (i11 & 147) != 146)) {
                    C6623a c6623a = (C6623a) this.f31715b.get(iIntValue3);
                    c3966o2.m8607Y(383173632);
                    String strM11629c2 = f9.m11629c(c3966o2, c6623a.f31812a);
                    String strM11629c3 = f9.m11629c(c3966o2, c6623a.f31813b);
                    boolean z10 = c6623a.f31814c;
                    InterfaceC2139c interfaceC2139c2 = this.f31716c;
                    boolean zM8614g2 = ((((i11 & 112) ^ 48) > 32 && c3966o2.m8612e(iIntValue3)) || (i11 & 48) == 32) | c3966o2.m8614g(interfaceC2139c2);
                    Object objM8596M2 = c3966o2.m8596M();
                    if (zM8614g2 || objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new C6280d(iIntValue3, 3, interfaceC2139c2);
                        c3966o2.j0(objM8596M2);
                    }
                    ie.m10700a(strM11629c2, strM11629c3, z10, (InterfaceC2137a) objM8596M2, c3966o2, 0);
                    if (iIntValue3 < pe.m10832g(this.f31717d)) {
                        c3966o2.m8607Y(383456165);
                        p9.m6245i(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 1, 0L, c3966o2, 54, 4);
                    } else {
                        c3966o2.m8607Y(381508528);
                    }
                    c3966o2.m8623p(false);
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
            default:
                InterfaceC0246a interfaceC0246a3 = (InterfaceC0246a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i12 = (((C3966o) interfaceC3962k3).m8614g(interfaceC0246a3) ? 4 : 2) | iIntValue6;
                } else {
                    i12 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i12 |= ((C3966o) interfaceC3962k3).m8612e(iIntValue5) ? 32 : 16;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(i12 & 1, (i12 & 147) != 146)) {
                    String str = (String) this.f31715b.get(iIntValue5);
                    c3966o3.m8607Y(-1183282334);
                    C7876o c7876o = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
                    Object obj5 = this.f31716c;
                    boolean zM8614g3 = c3966o3.m8614g(obj5) | c3966o3.m8614g(str);
                    Object objM8596M3 = c3966o3.m8596M();
                    if (zM8614g3 || objM8596M3 == C3961j.f20408a) {
                        objM8596M3 = new C0471k(10, obj5, str);
                        c3966o3.j0(objM8596M3);
                    }
                    float f6 = 12;
                    InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(AbstractC0237a.m637e(interfaceC7879rM668e, false, null, null, (InterfaceC2137a) objM8596M3, 7), 4, f6);
                    n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37652l, c3966o3, 48);
                    int i13 = c3966o3.f20462P;
                    i1 i1VarM8620m = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM657k);
                    InterfaceC7639k.V0.getClass();
                    InterfaceC2137a interfaceC2137a = C7638j.f36921b;
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(interfaceC2137a);
                    } else {
                        c3966o3.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o3);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o3);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i13))) {
                        AbstractC1452a.m4577x(i13, c3966o3, i13, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o3);
                    AbstractC3166c abstractC3166cM10866b = r0.m10866b(R.drawable.ic_folder, 0, c3966o3);
                    InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o, 24);
                    l1 l1Var = y1.f13286a;
                    e6.m6132a(abstractC3166cM10866b, "", interfaceC7879rM678o, ((v1) c3966o3.m8618k(l1Var)).f12970q, c3966o3, 432, 0);
                    AbstractC5244c.m10322f(c3966o3, AbstractC0245d.m678o(c7876o, f6));
                    o0 o0Var = ((vd) c3966o3.m8618k(xd.f13268a)).f13054j;
                    if (1.0f <= 0.0d) {
                        AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                    }
                    b1.m13113q(str, new LayoutWeightElement(1.0f, true), 0L, null, null, 0, 0, 0L, null, o0Var, c3966o3, 0, 508);
                    C3966o c3966o4 = c3966o3;
                    e6.m6133b(w1.m11021a(), "", null, ((v1) c3966o4.m8618k(l1Var)).f12970q, c3966o4, 48, 4);
                    c3966o4.m8623p(true);
                    if (iIntValue5 < pe.m10832g(this.f31717d)) {
                        c3966o4.m8607Y(-1181957116);
                        p9.m6245i(null, DefinitionKt.NO_Float_VALUE, 0L, c3966o4, 0, 7);
                        c3966o4 = c3966o4;
                    } else {
                        c3966o4.m8607Y(-1203917361);
                    }
                    c3966o4.m8623p(false);
                    c3966o4.m8623p(false);
                } else {
                    c3966o3.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
