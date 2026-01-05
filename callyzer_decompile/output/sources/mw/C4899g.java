package mw;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b2.d0;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.data.model.response.ExcludeNumber;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import g2.sc;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import js.C3845a;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.b1;
import k2.i2;
import kotlin.jvm.internal.AbstractC4154l;
import o1.InterfaceC5262u;
import o1.o1;
import og.ac;
import p3.b0;
import qw.a0;
import r4.C6456k;
import sv.C6954b;
import uv.AbstractC7548a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mw.g */
/* loaded from: classes3.dex */
public final class C4899g implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f24430a;

    /* renamed from: b */
    public final /* synthetic */ Object f24431b;

    public /* synthetic */ C4899g(int i10, Object obj) {
        this.f24430a = i10;
        this.f24431b = obj;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j6;
        switch (this.f24430a) {
            case 0:
                InterfaceC7879r composed = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                AbstractC4154l.m8923f(composed, "$this$composed");
                C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
                c3966o.m8607Y(-1409388715);
                c3966o.m8607Y(5004770);
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f24431b;
                boolean zM8614g = c3966o.m8614g(interfaceC2139c);
                Object objM8596M = c3966o.m8596M();
                if (zM8614g || objM8596M == C3961j.f20408a) {
                    objM8596M = new d0(2, interfaceC2139c);
                    c3966o.j0(objM8596M);
                }
                c3966o.m8623p(false);
                InterfaceC7879r interfaceC7879rM11373a = b0.m11373a(C7876o.f37669a, a0.f30746a, (PointerInputEventHandler) objM8596M);
                c3966o.m8623p(false);
                break;
            case 1:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC4154l.m8923f((InterfaceC5262u) obj, "$this$Card");
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ac.m10525a((ExcludeNumber) this.f24431b, c3966o2, 0);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                ((Number) obj3).intValue();
                C3966o c3966o3 = (C3966o) ((InterfaceC3962k) obj2);
                c3966o3.m8607Y(1973463606);
                if (iIntValue2 == ((b1) this.f24431b).m8526f()) {
                    c3966o3.m8607Y(1941987184);
                    j6 = ((v1) c3966o3.m8618k(y1.f13286a)).f12967n;
                    c3966o3.m8623p(false);
                } else {
                    c3966o3.m8607Y(1942052563);
                    j6 = ((v1) c3966o3.m8618k(y1.f13286a)).f12928A;
                    c3966o3.m8623p(false);
                }
                c3966o3.m8623p(false);
                break;
            case 3:
                o1 Button = (o1) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC4154l.m8923f(Button, "$this$Button");
                C3966o c3966o4 = (C3966o) interfaceC3962k2;
                if (c3966o4.m8598P(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    sc.m6307b(String.valueOf(((C6954b) this.f24431b).f33668o), AbstractC0242a.m656j(C7876o.f37669a, 10), AbstractC7548a.f36357k, 0L, null, null, 0L, null, new C6456k(3), 0L, 0, false, 0, 0, null, ((vd) c3966o4.m8618k(xd.f13268a)).f13049e, c3966o4, 432, 0, 65016);
                } else {
                    c3966o4.m8601S();
                }
                break;
            default:
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                C3845a c3845a = (C3845a) this.f24431b;
                AbstractC4154l.m8923f(Card, "$this$Card");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((C3966o) interfaceC3962k3).m8614g(Card) ? 4 : 2;
                }
                C3966o c3966o5 = (C3966o) interfaceC3962k3;
                if (c3966o5.m8598P(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    String strValueOf = String.valueOf(c3845a.f19801a);
                    float f6 = 8;
                    C7876o c7876o = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(c7876o, f6);
                    i2 i2Var = xd.f13268a;
                    sq.b1.m13113q(strValueOf, interfaceC7879rM656j, 0L, null, new C6456k(5), 2, 3, 0L, null, ((vd) c3966o5.m8618k(i2Var)).f13050f, c3966o5, 1769520, 396);
                    sq.b1.m13113q(String.valueOf(c3845a.f19802b), Card.mo10337a(AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, f6, f6, 2), true), 0L, null, new C6456k(5), 2, 3, 0L, null, ((vd) c3966o5.m8618k(i2Var)).f13056l, c3966o5, 1769472, 396);
                } else {
                    c3966o5.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
