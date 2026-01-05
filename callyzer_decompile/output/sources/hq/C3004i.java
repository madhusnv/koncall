package hq;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.google.android.gms.internal.measurement.k4;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import i3.AbstractC3166c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.o1;
import og.af;
import og.r0;
import og.t0;
import pg.b9;
import pr.C5998a;
import qr.AbstractC6287k;
import r4.C6456k;
import rr.AbstractC6601a;
import s2.AbstractC6740i;
import sq.b1;
import t3.C7022i;
import uv.AbstractC7554g;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import wr.C8147c;
import ys.AbstractC8768a;
import zq.AbstractC9018a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3004i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f16207a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f16208b;

    public /* synthetic */ C3004i(int i10, InterfaceC2137a interfaceC2137a) {
        this.f16207a = i10;
        this.f16208b = interfaceC2137a;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        switch (this.f16207a) {
            case 0:
                o1 DialogWithPositiveAndNegativeButtons = (o1) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(DialogWithPositiveAndNegativeButtons, "$this$DialogWithPositiveAndNegativeButtons");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p9.m6248l(this.f16208b, null, false, null, null, null, null, a0.f16151e, c3966o, 805306368, 510);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                o1 AppBar = (o1) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AppBar, "$this$AppBar");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p9.m6251o(this.f16208b, null, false, null, null, null, AbstractC6287k.f30563b, c3966o2, 805306368, 510);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                o1 AppBar2 = (o1) obj;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AppBar2, "$this$AppBar");
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p9.m6251o(this.f16208b, null, false, null, null, null, AbstractC6287k.f30564c, c3966o3, 805306368, 510);
                } else {
                    c3966o3.m8601S();
                }
                break;
            case 3:
                o1 AppBar3 = (o1) obj;
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AppBar3, "$this$AppBar");
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p9.m6251o(this.f16208b, null, false, null, null, null, AbstractC6601a.f31721d, c3966o4, 805306368, 510);
                } else {
                    c3966o4.m8601S();
                }
                break;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((C3966o) interfaceC3962k5).m8615h(zBooleanValue) ? 4 : 2;
                }
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    if (zBooleanValue) {
                        c3966o5.m8607Y(1520920077);
                        i10 = R.drawable.icon_mic_listening;
                    } else {
                        c3966o5.m8607Y(1520921325);
                        i10 = R.drawable.icon_mic;
                    }
                    AbstractC3166c abstractC3166cM11551a = b9.m11551a(i10, 0, c3966o5);
                    c3966o5.m8623p(false);
                    InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(k4.m3470a(AbstractC0245d.m678o(AbstractC0242a.m656j(C7876o.f37669a, 12), 28), 8, AbstractC7861e.m14840a(50), 28), AbstractC7554g.m14301b(c3966o5).f36409u, AbstractC7861e.m14840a(50));
                    InterfaceC2137a interfaceC2137a = this.f16208b;
                    boolean zM8614g = c3966o5.m8614g(interfaceC2137a);
                    Object objM8596M = c3966o5.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C5998a(15, interfaceC2137a);
                        c3966o5.j0(objM8596M);
                    }
                    pg.i0.m11693a(abstractC3166cM11551a, "Mic for speech to text", AbstractC0242a.m656j(AbstractC0237a.m637e(interfaceC7879rM633a, false, null, null, (InterfaceC2137a) objM8596M, 7), zBooleanValue ? 0 : 4), null, C7022i.f34006b, DefinitionKt.NO_Float_VALUE, null, c3966o5, 24624, 104);
                } else {
                    c3966o5.m8601S();
                }
                break;
            case 5:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((C3966o) interfaceC3962k6).m8615h(zBooleanValue2) ? 4 : 2;
                }
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    if (zBooleanValue2) {
                        c3966o6.m8607Y(-1638585719);
                        i11 = R.drawable.icon_mic_listening;
                    } else {
                        c3966o6.m8607Y(-1638584471);
                        i11 = R.drawable.icon_mic;
                    }
                    AbstractC3166c abstractC3166cM11551a2 = b9.m11551a(i11, 0, c3966o6);
                    c3966o6.m8623p(false);
                    InterfaceC7879r interfaceC7879rM633a2 = AbstractC0237a.m633a(k4.m3470a(AbstractC0245d.m678o(C7876o.f37669a, 28), 8, AbstractC7861e.m14840a(50), 28), AbstractC7554g.m14301b(c3966o6).f36409u, AbstractC7861e.m14840a(50));
                    InterfaceC2137a interfaceC2137a2 = this.f16208b;
                    boolean zM8614g2 = c3966o6.m8614g(interfaceC2137a2);
                    Object objM8596M2 = c3966o6.m8596M();
                    if (zM8614g2 || objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new C5998a(17, interfaceC2137a2);
                        c3966o6.j0(objM8596M2);
                    }
                    pg.i0.m11693a(abstractC3166cM11551a2, "Mic for speech to text", AbstractC0242a.m656j(AbstractC0237a.m637e(interfaceC7879rM633a2, false, null, null, (InterfaceC2137a) objM8596M2, 7), zBooleanValue2 ? 0 : 4), null, C7022i.f34006b, DefinitionKt.NO_Float_VALUE, null, c3966o6, 24624, 104);
                } else {
                    c3966o6.m8601S();
                }
                break;
            case 6:
                InterfaceC5262u BottomSheet = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(BottomSheet, "$this$BottomSheet");
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    p9.m6240d(null, null, null, null, null, AbstractC6740i.m12902d(-97374663, new C3004i(7, this.f16208b), c3966o7), c3966o7, 196608, 31);
                } else {
                    c3966o7.m8601S();
                }
                break;
            case 7:
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k8 = (InterfaceC3962k) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card, "$this$Card");
                C3966o c3966o8 = (C3966o) interfaceC3962k8;
                if (c3966o8.m8598P(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    C7876o c7876o = C7876o.f37669a;
                    float f6 = 20;
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37655p, c3966o8, 48);
                    int i12 = c3966o8.f20462P;
                    i1 i1VarM8620m = c3966o8.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o8, interfaceC7879rM660n);
                    InterfaceC7639k.V0.getClass();
                    InterfaceC2137a interfaceC2137a3 = C7638j.f36921b;
                    c3966o8.c0();
                    if (c3966o8.f20461O) {
                        c3966o8.m8619l(interfaceC2137a3);
                    } else {
                        c3966o8.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o8);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o8);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o8.f20461O || !AbstractC4154l.m8918a(c3966o8.m8596M(), Integer.valueOf(i12))) {
                        AbstractC1452a.m4577x(i12, c3966o8, i12, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o8);
                    float f10 = 12;
                    pg.i0.m11693a(r0.m10866b(R.drawable.ic_delete_template, 0, c3966o8), "Delete Icon", AbstractC0242a.m660n(AbstractC0245d.m678o(c7876o, 100), DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, f10, 5), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o8, 432, 120);
                    b1.m13113q(t0.m10920c(c3966o8, R.string.no_templates_available_to_delete), AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 5, 5), 0L, null, new C6456k(5), 0, 0, 0L, null, o0.m6461a(((vd) c3966o8.m8618k(xd.f13268a)).f13056l, 0L, af.m10534c(15), C3998s.f20698h, null, null, 0L, 0L, null, 16777209), c3966o8, 48, 492);
                    InterfaceC2137a interfaceC2137a4 = this.f16208b;
                    boolean zM8614g3 = c3966o8.m8614g(interfaceC2137a4);
                    Object objM8596M3 = c3966o8.m8596M();
                    if (zM8614g3 || objM8596M3 == C3961j.f20408a) {
                        objM8596M3 = new C8147c(14, interfaceC2137a4);
                        c3966o8.j0(objM8596M3);
                    }
                    float f11 = 15;
                    p9.m6238b((InterfaceC2137a) objM8596M3, AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o, f11, DefinitionKt.NO_Float_VALUE, f11, f11, 2), 1.0f), false, null, null, null, null, null, AbstractC8768a.f42386a, c3966o8, 805306416, 508);
                    c3966o8.m8623p(true);
                } else {
                    c3966o8.m8601S();
                }
                break;
            default:
                o1 DialogWithPositiveAndNegativeButtons2 = (o1) obj;
                InterfaceC3962k interfaceC3962k9 = (InterfaceC3962k) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(DialogWithPositiveAndNegativeButtons2, "$this$DialogWithPositiveAndNegativeButtons");
                C3966o c3966o9 = (C3966o) interfaceC3962k9;
                if (c3966o9.m8598P(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p9.m6248l(this.f16208b, null, false, AbstractC7861e.f37635a, null, pg.d0.m11579a(1, ((v1) c3966o9.m8618k(y1.f13286a)).f12954a), null, AbstractC9018a.f43438d, c3966o9, 805306368, 438);
                } else {
                    c3966o9.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
