package fp;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import as.C0429b;
import aw.C0471k;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import hq.C3009n;
import i0.m0;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import mw.C4902j;
import mw.C4903k;
import p3.b0;
import qr.AbstractC6297u;
import qw.a0;
import w2.C7876o;
import w2.InterfaceC7879r;
import zp.C9005e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fp.c */
/* loaded from: classes3.dex */
public final class C2363c implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f10756a;

    /* renamed from: b */
    public final /* synthetic */ Object f10757b;

    /* renamed from: c */
    public final /* synthetic */ Object f10758c;

    public /* synthetic */ C2363c(int i10, Object obj, Object obj2) {
        this.f10756a = i10;
        this.f10757b = obj;
        this.f10758c = obj2;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10756a) {
            case 0:
                InterfaceC7879r composed = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                AbstractC4154l.m8923f(composed, "$this$composed");
                C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
                c3966o.m8607Y(1312612516);
                Object objM8596M = c3966o.m8596M();
                if (objM8596M == C3961j.f20408a) {
                    objM8596M = m0.m7389v(c3966o);
                }
                InterfaceC7879r interfaceC7879rM635c = AbstractC0237a.m635c(composed, (InterfaceC4630l) objM8596M, null, true, null, null, new C0471k(2, (InterfaceC2141e) this.f10757b, (C9005e) this.f10758c));
                c3966o.m8623p(false);
                return interfaceC7879rM635c;
            case 1:
                ((Number) obj3).intValue();
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f10757b;
                C4903k c4903k = (C4903k) this.f10758c;
                AbstractC4154l.m8923f((InterfaceC7879r) obj, "$this$composed");
                C3966o c3966o2 = (C3966o) ((InterfaceC3962k) obj2);
                c3966o2.m8607Y(1399531788);
                c3966o2.m8607Y(1849434622);
                Object objM8596M2 = c3966o2.m8596M();
                s0 s0Var = C3961j.f20408a;
                if (objM8596M2 == s0Var) {
                    objM8596M2 = m0.m7389v(c3966o2);
                }
                InterfaceC4630l interfaceC4630l = (InterfaceC4630l) objM8596M2;
                c3966o2.m8623p(false);
                c3966o2.m8607Y(1849434622);
                Object objM8596M3 = c3966o2.m8596M();
                if (objM8596M3 == s0Var) {
                    objM8596M3 = C3953b.m8517t(null);
                    c3966o2.j0(objM8596M3);
                }
                w0 w0Var = (w0) objM8596M3;
                c3966o2.m8623p(false);
                c3966o2.m8607Y(-1633490746);
                boolean zM8614g = c3966o2.m8614g(c4903k) | c3966o2.m8614g(interfaceC2141e);
                Object objM8596M4 = c3966o2.m8596M();
                if (zM8614g || objM8596M4 == s0Var) {
                    objM8596M4 = new C3009n(11, c4903k, interfaceC2141e);
                    c3966o2.j0(objM8596M4);
                }
                c3966o2.m8623p(false);
                C3953b.m8500c(interfaceC4630l, (InterfaceC2139c) objM8596M4, c3966o2);
                c3966o2.m8607Y(-1746271574);
                boolean zM8614g2 = c3966o2.m8614g(c4903k) | c3966o2.m8614g(interfaceC2141e);
                Object objM8596M5 = c3966o2.m8596M();
                if (zM8614g2 || objM8596M5 == s0Var) {
                    objM8596M5 = new C4902j(c4903k, interfaceC2141e, w0Var);
                    c3966o2.j0(objM8596M5);
                }
                c3966o2.m8623p(false);
                InterfaceC7879r interfaceC7879rM11373a = b0.m11373a(C7876o.f37669a, interfaceC4630l, (PointerInputEventHandler) objM8596M5);
                c3966o2.m8623p(false);
                return interfaceC7879rM11373a;
            case 2:
                InterfaceC2137a closeSheet = (InterfaceC2137a) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC4154l.m8923f(closeSheet, "closeSheet");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C3966o) interfaceC3962k).m8616i(closeSheet) ? 4 : 2;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k;
                if (c3966o3.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ((AbstractC6297u) this.f10757b).m12326b((iIntValue << 3) & 112, closeSheet, (InterfaceC2139c) this.f10758c, c3966o3);
                } else {
                    c3966o3.m8601S();
                }
                return a0.f30746a;
            case 3:
                InterfaceC7879r composed2 = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                AbstractC4154l.m8923f(composed2, "$this$composed");
                C3966o c3966o4 = (C3966o) ((InterfaceC3962k) obj2);
                c3966o4.m8607Y(1312612516);
                Object objM8596M6 = c3966o4.m8596M();
                if (objM8596M6 == C3961j.f20408a) {
                    objM8596M6 = m0.m7389v(c3966o4);
                }
                InterfaceC7879r interfaceC7879rM635c2 = AbstractC0237a.m635c(composed2, (InterfaceC4630l) objM8596M6, null, true, null, null, new C0471k(14, (InterfaceC2139c) this.f10757b, (C0429b) this.f10758c));
                c3966o4.m8623p(false);
                return interfaceC7879rM635c2;
            default:
                InterfaceC7879r composed3 = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                AbstractC4154l.m8923f(composed3, "$this$composed");
                C3966o c3966o5 = (C3966o) ((InterfaceC3962k) obj2);
                c3966o5.m8607Y(1312612516);
                Object objM8596M7 = c3966o5.m8596M();
                if (objM8596M7 == C3961j.f20408a) {
                    objM8596M7 = m0.m7389v(c3966o5);
                }
                InterfaceC7879r interfaceC7879rM635c3 = AbstractC0237a.m635c(composed3, (InterfaceC4630l) objM8596M7, null, true, null, null, new C0471k(15, (InterfaceC2139c) this.f10757b, (C9005e) this.f10758c));
                c3966o5.m8623p(false);
                return interfaceC7879rM635c3;
        }
    }

    public C2363c(C4903k c4903k, InterfaceC2141e interfaceC2141e) {
        this.f10756a = 1;
        this.f10758c = c4903k;
        this.f10757b = interfaceC2141e;
    }
}
