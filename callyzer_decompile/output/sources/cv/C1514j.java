package cv;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.response.LeadRecentNoteResponse;
import d3.C1559m;
import ev.C2136a;
import ex.InterfaceC2142f;
import java.util.List;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.InterfaceC5262u;
import og.u0;
import pg.i0;
import qw.a0;
import uv.C7555h;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1514j implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f7644a = 1;

    /* renamed from: b */
    public final /* synthetic */ int f7645b;

    /* renamed from: c */
    public final /* synthetic */ Object f7646c;

    public /* synthetic */ C1514j(int i10, C7555h c7555h) {
        this.f7645b = i10;
        this.f7646c = c7555h;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f7644a;
        a0 a0Var = a0.f30746a;
        Object obj4 = this.f7646c;
        int i11 = this.f7645b;
        switch (i10) {
            case 0:
                C2136a c2136a = (C2136a) obj4;
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card, "$this$Card");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c3966o.m8601S();
                    break;
                } else {
                    InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(C7876o.f37669a, 14);
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
                    int i12 = c3966o.f20462P;
                    i1 i1VarM8620m = c3966o.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM656j);
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
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                        AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    List list = c2136a.f9971c;
                    AbstractC1505a.m5073m((LeadRecentNoteResponse) list.get(i11), c3966o, 0);
                    C8791f c8791f = C8791f.f42457a;
                    if (C8791f.m16171d(((LeadRecentNoteResponse) list.get(i11)).m4817g())) {
                        c3966o.m8607Y(2079021520);
                        AbstractC1505a.m5074n((LeadRecentNoteResponse) list.get(i11), c3966o, 0);
                    } else {
                        c3966o.m8607Y(2043018182);
                    }
                    c3966o.m8623p(false);
                    c3966o.m8623p(true);
                    break;
                }
            default:
                C7555h c7555h = (C7555h) obj4;
                InterfaceC5262u Card2 = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card2, "$this$Card");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (!c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c3966o2.m8601S();
                    break;
                } else {
                    i0.m11694b(u0.m10941c(i11, 6, c3966o2), "", AbstractC0242a.m656j(AbstractC0245d.f1971c, 10), new C1559m(5, c7555h.f36427c), c3966o2, 432, 56);
                    break;
                }
        }
        return a0Var;
    }

    public /* synthetic */ C1514j(C2136a c2136a, int i10) {
        this.f7646c = c2136a;
        this.f7645b = i10;
    }
}
