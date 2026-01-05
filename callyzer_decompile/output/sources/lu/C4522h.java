package lu;

import d7.q0;
import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import h6.C2856l;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import mu.C4884b;
import o1.o1;
import og.kc;
import pu.C6033a;
import pu.C6035c;
import pu.C6040h;
import qu.C6321b;
import qu.C6324e;
import qw.a0;
import sq.g2;
import tx.c0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lu.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4522h implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f22487a;

    /* renamed from: b */
    public final /* synthetic */ C6324e f22488b;

    public /* synthetic */ C4522h(C6324e c6324e, int i10) {
        this.f22487a = i10;
        this.f22488b = c6324e;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f22487a) {
            case 0:
                o1 AppBar = (o1) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AppBar, "$this$AppBar");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    final C6324e c6324e = this.f22488b;
                    boolean zM8616i = c3966o.m8616i(c6324e);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8616i || objM8596M == C3961j.f20408a) {
                        final int i10 = 0;
                        objM8596M = new InterfaceC2137a() { // from class: lu.i
                            @Override // ex.InterfaceC2137a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        c6324e.m12335i(C4884b.f24398a);
                                        break;
                                    case 1:
                                        ((C2856l) c6324e.f30662b.f17616h).m6987c();
                                        break;
                                    case 2:
                                        C6324e c6324e2 = c6324e;
                                        c0.m13502y(q0.m5340g(c6324e2), null, null, new C4032f(c6324e2, (InterfaceC7559c) null, 11), 3);
                                        break;
                                    case 3:
                                        c6324e.m12334h("note_popup_screen");
                                        break;
                                    default:
                                        c6324e.m12334h("permission_not_granted");
                                        break;
                                }
                                return a0.f30746a;
                            }
                        };
                        c3966o.j0(objM8596M);
                    }
                    g2.m13131I((InterfaceC2137a) objM8596M, null, false, null, null, AbstractC4515a.f22473a, c3966o, 196608, 30);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f((C6040h) obj, "$this$TroubleshootStepUiModel");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    final C6324e c6324e2 = this.f22488b;
                    boolean zM8616i2 = c3966o2.m8616i(c6324e2);
                    Object objM8596M2 = c3966o2.m8596M();
                    if (zM8616i2 || objM8596M2 == C3961j.f20408a) {
                        final int i11 = 3;
                        objM8596M2 = new InterfaceC2137a() { // from class: lu.i
                            @Override // ex.InterfaceC2137a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        c6324e2.m12335i(C4884b.f24398a);
                                        break;
                                    case 1:
                                        ((C2856l) c6324e2.f30662b.f17616h).m6987c();
                                        break;
                                    case 2:
                                        C6324e c6324e22 = c6324e2;
                                        c0.m13502y(q0.m5340g(c6324e22), null, null, new C4032f(c6324e22, (InterfaceC7559c) null, 11), 3);
                                        break;
                                    case 3:
                                        c6324e2.m12334h("note_popup_screen");
                                        break;
                                    default:
                                        c6324e2.m12334h("permission_not_granted");
                                        break;
                                }
                                return a0.f30746a;
                            }
                        };
                        c3966o2.j0(objM8596M2);
                    }
                    AbstractC4518d.m9366c((InterfaceC2137a) objM8596M2, c3966o2, 0);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                C6040h TroubleshootStepUiModel = (C6040h) obj;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(TroubleshootStepUiModel, "$this$TroubleshootStepUiModel");
                kc kcVar = TroubleshootStepUiModel.f29494g;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C3966o) interfaceC3962k3).m8614g(TroubleshootStepUiModel) ? 4 : 2;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    if (kcVar instanceof C6033a) {
                        c3966o3.m8607Y(2060886707);
                        boolean z6 = ((C6033a) kcVar).f29482b;
                        C6324e c6324e3 = this.f22488b;
                        boolean zM8616i3 = c3966o3.m8616i(c6324e3) | ((iIntValue3 & 14) == 4);
                        Object objM8596M3 = c3966o3.m8596M();
                        if (zM8616i3 || objM8596M3 == C3961j.f20408a) {
                            objM8596M3 = new C6321b(c6324e3, TroubleshootStepUiModel);
                            c3966o3.j0(objM8596M3);
                        }
                        AbstractC4518d.m9365b(z6, (InterfaceC2137a) objM8596M3, c3966o3, 0);
                    } else {
                        c3966o3.m8607Y(2049510420);
                    }
                    c3966o3.m8623p(false);
                } else {
                    c3966o3.m8601S();
                }
                break;
            case 3:
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f((C6040h) obj, "$this$TroubleshootStepUiModel");
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    final C6324e c6324e4 = this.f22488b;
                    boolean zM8616i4 = c3966o4.m8616i(c6324e4);
                    Object objM8596M4 = c3966o4.m8596M();
                    if (zM8616i4 || objM8596M4 == C3961j.f20408a) {
                        final int i12 = 4;
                        objM8596M4 = new InterfaceC2137a() { // from class: lu.i
                            @Override // ex.InterfaceC2137a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        c6324e4.m12335i(C4884b.f24398a);
                                        break;
                                    case 1:
                                        ((C2856l) c6324e4.f30662b.f17616h).m6987c();
                                        break;
                                    case 2:
                                        C6324e c6324e22 = c6324e4;
                                        c0.m13502y(q0.m5340g(c6324e22), null, null, new C4032f(c6324e22, (InterfaceC7559c) null, 11), 3);
                                        break;
                                    case 3:
                                        c6324e4.m12334h("note_popup_screen");
                                        break;
                                    default:
                                        c6324e4.m12334h("permission_not_granted");
                                        break;
                                }
                                return a0.f30746a;
                            }
                        };
                        c3966o4.j0(objM8596M4);
                    }
                    AbstractC4518d.m9367d((InterfaceC2137a) objM8596M4, c3966o4, 0);
                } else {
                    c3966o4.m8601S();
                }
                break;
            case 4:
                C6040h TroubleshootStepUiModel2 = (C6040h) obj;
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(TroubleshootStepUiModel2, "$this$TroubleshootStepUiModel");
                kc kcVar2 = TroubleshootStepUiModel2.f29494g;
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((C3966o) interfaceC3962k5).m8614g(TroubleshootStepUiModel2) ? 4 : 2;
                }
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    if (kcVar2 instanceof C6035c) {
                        c3966o5.m8607Y(-1986051196);
                        C6035c c6035c = (C6035c) kcVar2;
                        final C6324e c6324e5 = this.f22488b;
                        boolean zM8616i5 = c3966o5.m8616i(c6324e5);
                        Object objM8596M5 = c3966o5.m8596M();
                        if (zM8616i5 || objM8596M5 == C3961j.f20408a) {
                            final int i13 = 2;
                            objM8596M5 = new InterfaceC2137a() { // from class: lu.i
                                @Override // ex.InterfaceC2137a
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            c6324e5.m12335i(C4884b.f24398a);
                                            break;
                                        case 1:
                                            ((C2856l) c6324e5.f30662b.f17616h).m6987c();
                                            break;
                                        case 2:
                                            C6324e c6324e22 = c6324e5;
                                            c0.m13502y(q0.m5340g(c6324e22), null, null, new C4032f(c6324e22, (InterfaceC7559c) null, 11), 3);
                                            break;
                                        case 3:
                                            c6324e5.m12334h("note_popup_screen");
                                            break;
                                        default:
                                            c6324e5.m12334h("permission_not_granted");
                                            break;
                                    }
                                    return a0.f30746a;
                                }
                            };
                            c3966o5.j0(objM8596M5);
                        }
                        AbstractC4518d.m9368e(c6035c, (InterfaceC2137a) objM8596M5, c3966o5, 0);
                    } else {
                        c3966o5.m8607Y(-1996244833);
                    }
                    c3966o5.m8623p(false);
                } else {
                    c3966o5.m8601S();
                }
                break;
            case 5:
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f((C6040h) obj, "$this$TroubleshootStepUiModel");
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    final C6324e c6324e6 = this.f22488b;
                    boolean zM8616i6 = c3966o6.m8616i(c6324e6);
                    Object objM8596M6 = c3966o6.m8596M();
                    if (zM8616i6 || objM8596M6 == C3961j.f20408a) {
                        final int i14 = 1;
                        objM8596M6 = new InterfaceC2137a() { // from class: lu.i
                            @Override // ex.InterfaceC2137a
                            public final Object invoke() {
                                switch (i14) {
                                    case 0:
                                        c6324e6.m12335i(C4884b.f24398a);
                                        break;
                                    case 1:
                                        ((C2856l) c6324e6.f30662b.f17616h).m6987c();
                                        break;
                                    case 2:
                                        C6324e c6324e22 = c6324e6;
                                        c0.m13502y(q0.m5340g(c6324e22), null, null, new C4032f(c6324e22, (InterfaceC7559c) null, 11), 3);
                                        break;
                                    case 3:
                                        c6324e6.m12334h("note_popup_screen");
                                        break;
                                    default:
                                        c6324e6.m12334h("permission_not_granted");
                                        break;
                                }
                                return a0.f30746a;
                            }
                        };
                        c3966o6.j0(objM8596M6);
                    }
                    AbstractC4518d.m9364a((InterfaceC2137a) objM8596M6, c3966o6, 0);
                } else {
                    c3966o6.m8601S();
                }
                break;
            default:
                C6040h TroubleshootStepUiModel3 = (C6040h) obj;
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(TroubleshootStepUiModel3, "$this$TroubleshootStepUiModel");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((C3966o) interfaceC3962k7).m8614g(TroubleshootStepUiModel3) ? 4 : 2;
                }
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    boolean z10 = (iIntValue7 & 14) == 4;
                    C6324e c6324e7 = this.f22488b;
                    boolean zM8616i7 = c3966o7.m8616i(c6324e7) | z10;
                    Object objM8596M7 = c3966o7.m8596M();
                    if (zM8616i7 || objM8596M7 == C3961j.f20408a) {
                        objM8596M7 = new C6321b(TroubleshootStepUiModel3, c6324e7);
                        c3966o7.j0(objM8596M7);
                    }
                    AbstractC4518d.m9367d((InterfaceC2137a) objM8596M7, c3966o7, 0);
                } else {
                    c3966o7.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
