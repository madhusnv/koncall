package bt;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import at.C0430a;
import au.C0448l;
import aw.C0471k;
import com.skydoves.balloon.internals.DefinitionKt;
import ct.C1502a;
import dt.C1804j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2143g;
import fp.AbstractC2365e;
import fp.C2363c;
import fp.C2364d;
import g2.p9;
import g2.v1;
import g2.x9;
import g2.y1;
import gv.C2735f;
import gv.C2736g;
import i9.C3183a;
import java.util.ArrayList;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.b1;
import k2.h2;
import kotlin.jvm.internal.AbstractC4155m;
import ls.AbstractC4510a;
import ls.C4511b;
import lu.AbstractC4515a;
import lx.InterfaceC4566e;
import mm.C4798i;
import mw.C4899g;
import ns.C5136b;
import nv.C5149a;
import nv.C5150b;
import og.d1;
import og.pe;
import ov.C5757h;
import qp.C6266c;
import qp.C6273j;
import qr.AbstractC6287k;
import qr.AbstractC6297u;
import qr.C6301y;
import qr.C6302z;
import s2.AbstractC6740i;
import sq.m1;
import tq.EnumC7204p;
import tu.C7226b;
import u2.C7320q;
import vs.AbstractC7766h;
import w2.C7876o;
import wq.C8142a;
import ws.C8176q;
import wt.C8183a;
import xp.AbstractC8420a;
import xq.AbstractC8436j;
import xs.C8449k;
import xt.AbstractC8450a;
import yq.C8741f;
import zp.C9005e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f4769a;

    /* renamed from: b */
    public final /* synthetic */ List f4770b;

    /* renamed from: c */
    public final /* synthetic */ Object f4771c;

    /* renamed from: d */
    public final /* synthetic */ Object f4772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(List list, Object obj, Object obj2, int i10) {
        super(4);
        this.f4769a = i10;
        this.f4770b = list;
        this.f4771c = obj;
        this.f4772d = obj2;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        switch (this.f4769a) {
            case 0:
                C1804j c1804j = (C1804j) this.f4772d;
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
                    C1502a c1502a = (C1502a) this.f4770b.get(iIntValue);
                    c3966o.m8607Y(-335658658);
                    Object objM8596M = c3966o.m8596M();
                    Object obj5 = C3961j.f20408a;
                    if (objM8596M == obj5) {
                        objM8596M = C0781z.f4956a;
                        c3966o.j0(objM8596M);
                    }
                    InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
                    C0430a c0430a = (C0430a) this.f4771c;
                    boolean zM8616i = c3966o.m8616i(c1804j) | c3966o.m8616i(c1502a);
                    Object objM8596M2 = c3966o.m8596M();
                    if (zM8616i || objM8596M2 == obj5) {
                        objM8596M2 = new C0471k(1, c1804j, c1502a);
                        c3966o.j0(objM8596M2);
                    }
                    b0.m2074m(c1502a, interfaceC2137a, c0430a, c1804j, (InterfaceC2137a) objM8596M2, c3966o, 48);
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
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f4772d;
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
                    C9005e c9005e = (C9005e) this.f4770b.get(iIntValue3);
                    c3966o2.m8607Y(-251135785);
                    EnumC7204p enumC7204p = ((C6266c) this.f4771c).f30379f;
                    boolean zM8614g = c3966o2.m8614g(interfaceC2141e);
                    Object objM8596M3 = c3966o2.m8596M();
                    if (zM8614g || objM8596M3 == C3961j.f20408a) {
                        objM8596M3 = new C2364d(interfaceC2141e, 0);
                        c3966o2.j0(objM8596M3);
                    }
                    AbstractC2365e.m6049a(c9005e, enumC7204p, (InterfaceC2141e) objM8596M3, c3966o2, 0);
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                InterfaceC0246a interfaceC0246a3 = (InterfaceC0246a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f4772d;
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
                    C5136b c5136b = (C5136b) this.f4770b.get(iIntValue5);
                    c3966o3.m8607Y(1819978110);
                    C4511b c4511b = (C4511b) this.f4771c;
                    boolean zM8614g2 = c3966o3.m8614g(interfaceC2139c) | c3966o3.m8616i(c5136b);
                    Object objM8596M4 = c3966o3.m8596M();
                    if (zM8614g2 || objM8596M4 == C3961j.f20408a) {
                        objM8596M4 = new C0471k(4, interfaceC2139c, c5136b);
                        c3966o3.j0(objM8596M4);
                    }
                    AbstractC4510a.m9343b(c5136b, c4511b, (InterfaceC2137a) objM8596M4, c3966o3, 0);
                    c3966o3.m8623p(false);
                } else {
                    c3966o3.m8601S();
                }
                break;
            case 3:
                InterfaceC0246a interfaceC0246a4 = (InterfaceC0246a) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f4772d;
                Context context = (Context) this.f4771c;
                if ((iIntValue8 & 6) == 0) {
                    i13 = (((C3966o) interfaceC3962k4).m8614g(interfaceC0246a4) ? 4 : 2) | iIntValue8;
                } else {
                    i13 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i13 |= ((C3966o) interfaceC3962k4).m8612e(iIntValue7) ? 32 : 16;
                }
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(i13 & 1, (i13 & 147) != 146)) {
                    C7226b c7226b = (C7226b) this.f4770b.get(iIntValue7);
                    c3966o4.m8607Y(1324699692);
                    boolean zM8614g3 = c3966o4.m8614g(interfaceC2139c2) | c3966o4.m8614g(c7226b) | c3966o4.m8616i(context);
                    Object objM8596M5 = c3966o4.m8596M();
                    if (zM8614g3 || objM8596M5 == C3961j.f20408a) {
                        objM8596M5 = new C0448l(3, interfaceC2139c2, c7226b, context);
                        c3966o4.j0(objM8596M5);
                    }
                    AbstractC4515a.m9362a(c7226b, context, (InterfaceC2137a) objM8596M5, c3966o4, 0);
                    c3966o4.m8623p(false);
                } else {
                    c3966o4.m8601S();
                }
                break;
            case 4:
                C5757h c5757h = (C5757h) this.f4771c;
                InterfaceC0246a interfaceC0246a5 = (InterfaceC0246a) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i14 = (((C3966o) interfaceC3962k5).m8614g(interfaceC0246a5) ? 4 : 2) | iIntValue10;
                } else {
                    i14 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i14 |= ((C3966o) interfaceC3962k5).m8612e(iIntValue9) ? 32 : 16;
                }
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(i14 & 1, (i14 & 147) != 146)) {
                    int i23 = i14 & 126;
                    C5149a c5149a = (C5149a) this.f4770b.get(iIntValue9);
                    c3966o5.m8607Y(2018083910);
                    boolean zM8616i2 = c3966o5.m8616i(c5757h);
                    Object objM8596M6 = c3966o5.m8596M();
                    if (zM8616i2 || objM8596M6 == C3961j.f20408a) {
                        C3183a c3183a = new C3183a(1, c5757h, C5757h.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/permissionsScreen/model/PermissionHandlerViewModel$PermissionEvents;)V", 0, 11);
                        c3966o5.j0(c3183a);
                        objM8596M6 = c3183a;
                    }
                    d1.m10595a(c5149a, (InterfaceC2139c) ((InterfaceC4566e) objM8596M6), iIntValue9, ((C5150b) ((k2.w0) this.f4772d).getValue()).f25219b, c3966o5, (i23 << 3) & 896);
                    c3966o5.m8623p(false);
                } else {
                    c3966o5.m8601S();
                }
                break;
            case 5:
                InterfaceC0246a interfaceC0246a6 = (InterfaceC0246a) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i15 = (((C3966o) interfaceC3962k6).m8614g(interfaceC0246a6) ? 4 : 2) | iIntValue12;
                } else {
                    i15 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i15 |= ((C3966o) interfaceC3962k6).m8612e(iIntValue11) ? 32 : 16;
                }
                boolean z6 = true;
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(i15 & 1, (i15 & 147) != 146)) {
                    AbstractC6297u abstractC6297u = (AbstractC6297u) this.f4770b.get(iIntValue11);
                    c3966o6.m8607Y(-1180904119);
                    String str = abstractC6297u.f30614a;
                    boolean zMo12308k = abstractC6297u.mo12308k();
                    if ((((i15 & 112) ^ 48) <= 32 || !c3966o6.m8612e(iIntValue11)) && (i15 & 48) != 32) {
                        z6 = false;
                    }
                    Object objM8596M7 = c3966o6.m8596M();
                    if (z6 || objM8596M7 == C3961j.f20408a) {
                        objM8596M7 = new C6301y(iIntValue11, (b1) this.f4771c);
                        c3966o6.j0(objM8596M7);
                    }
                    AbstractC6287k.m12300q(str, zMo12308k, (InterfaceC2137a) objM8596M7, new C6302z((C4899g) this.f4772d, iIntValue11), c3966o6, 0);
                    c3966o6.m8623p(false);
                } else {
                    c3966o6.m8601S();
                }
                break;
            case 6:
                InterfaceC0246a interfaceC0246a7 = (InterfaceC0246a) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                C7320q c7320q = (C7320q) this.f4771c;
                if ((iIntValue14 & 6) == 0) {
                    i16 = (((C3966o) interfaceC3962k7).m8614g(interfaceC0246a7) ? 4 : 2) | iIntValue14;
                } else {
                    i16 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i16 |= ((C3966o) interfaceC3962k7).m8612e(iIntValue13) ? 32 : 16;
                }
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(i16 & 1, (i16 & 147) != 146)) {
                    ur.k0 k0Var = (ur.k0) ((ArrayList) this.f4770b).get(iIntValue13);
                    c3966o7.m8607Y(312703193);
                    boolean zContains = c7320q.contains(Integer.valueOf(iIntValue13));
                    boolean zM8614g4 = ((((i16 & 112) ^ 48) > 32 && c3966o7.m8612e(iIntValue13)) || (i16 & 48) == 32) | c3966o7.m8614g(c7320q);
                    Object objM8596M8 = c3966o7.m8596M();
                    if (zM8614g4 || objM8596M8 == C3961j.f20408a) {
                        objM8596M8 = new C6301y(c7320q, iIntValue13);
                        c3966o7.j0(objM8596M8);
                    }
                    AbstractC6287k.m12295l(k0Var, zContains, (InterfaceC2137a) objM8596M8, c3966o7, 0);
                    if (iIntValue13 < pe.m10832g((ArrayList) this.f4772d)) {
                        c3966o7.m8607Y(313108734);
                        p9.m6245i(AbstractC0242a.m660n(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 35, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 1, ((v1) c3966o7.m8618k(y1.f13286a)).f12928A, c3966o7, 54, 0);
                    } else {
                        c3966o7.m8607Y(304947612);
                    }
                    c3966o7.m8623p(false);
                    c3966o7.m8623p(false);
                } else {
                    c3966o7.m8601S();
                }
                break;
            case 7:
                InterfaceC0246a interfaceC0246a8 = (InterfaceC0246a) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k8 = (InterfaceC3962k) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i17 = (((C3966o) interfaceC3962k8).m8614g(interfaceC0246a8) ? 4 : 2) | iIntValue16;
                } else {
                    i17 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i17 |= ((C3966o) interfaceC3962k8).m8612e(iIntValue15) ? 32 : 16;
                }
                C3966o c3966o8 = (C3966o) interfaceC3962k8;
                if (c3966o8.m8598P(i17 & 1, (i17 & 147) != 146)) {
                    AbstractC6297u abstractC6297u2 = (AbstractC6297u) this.f4770b.get(iIntValue15);
                    c3966o8.m8607Y(605132312);
                    sq.b1.m13075E(abstractC6297u2.mo12302e(), abstractC6297u2.mo12308k(), (x9) this.f4771c, null, abstractC6297u2.f30615b, AbstractC6740i.m12902d(-919682514, new C2363c(2, abstractC6297u2, (InterfaceC2139c) this.f4772d), c3966o8), c3966o8, 196608, 8);
                    c3966o8.m8623p(false);
                } else {
                    c3966o8.m8601S();
                }
                break;
            case 8:
                InterfaceC0246a interfaceC0246a9 = (InterfaceC0246a) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k9 = (InterfaceC3962k) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) this.f4772d;
                InterfaceC2139c interfaceC2139c4 = (InterfaceC2139c) this.f4771c;
                if ((iIntValue18 & 6) == 0) {
                    i18 = (((C3966o) interfaceC3962k9).m8614g(interfaceC0246a9) ? 4 : 2) | iIntValue18;
                } else {
                    i18 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i18 |= ((C3966o) interfaceC3962k9).m8612e(iIntValue17) ? 32 : 16;
                }
                C3966o c3966o9 = (C3966o) interfaceC3962k9;
                if (c3966o9.m8598P(i18 & 1, (i18 & 147) != 146)) {
                    C1502a c1502a2 = (C1502a) this.f4770b.get(iIntValue17);
                    c3966o9.m8607Y(370541727);
                    boolean zM8614g5 = c3966o9.m8614g(interfaceC2139c4) | c3966o9.m8616i(c1502a2) | c3966o9.m8614g(interfaceC2139c3);
                    Object objM8596M9 = c3966o9.m8596M();
                    if (zM8614g5 || objM8596M9 == C3961j.f20408a) {
                        objM8596M9 = new C0448l(5, interfaceC2139c4, c1502a2, interfaceC2139c3);
                        c3966o9.j0(objM8596M9);
                    }
                    m1.m13176b(c1502a2, (InterfaceC2137a) objM8596M9, c3966o9, 0);
                    c3966o9.m8623p(false);
                } else {
                    c3966o9.m8601S();
                }
                break;
            case 9:
                InterfaceC0246a interfaceC0246a10 = (InterfaceC0246a) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k10 = (InterfaceC3962k) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                C8449k c8449k = (C8449k) this.f4771c;
                if ((iIntValue20 & 6) == 0) {
                    i19 = (((C3966o) interfaceC3962k10).m8614g(interfaceC0246a10) ? 4 : 2) | iIntValue20;
                } else {
                    i19 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i19 |= ((C3966o) interfaceC3962k10).m8612e(iIntValue19) ? 32 : 16;
                }
                C3966o c3966o10 = (C3966o) interfaceC3962k10;
                if (c3966o10.m8598P(i19 & 1, (i19 & 147) != 146)) {
                    C8176q c8176q = (C8176q) this.f4770b.get(iIntValue19);
                    c3966o10.m8607Y(1454861673);
                    boolean zM8616i3 = c3966o10.m8616i(c8449k) | c3966o10.m8616i(c8176q);
                    Object objM8596M10 = c3966o10.m8596M();
                    if (zM8616i3 || objM8596M10 == C3961j.f20408a) {
                        objM8596M10 = new C0448l(6, (Object) c8449k, (Object) c8176q, (k2.w0) this.f4772d);
                        c3966o10.j0(objM8596M10);
                    }
                    AbstractC7766h.m14745d(c8176q, (InterfaceC2137a) objM8596M10, c3966o10, 0);
                    c3966o10.m8623p(false);
                } else {
                    c3966o10.m8601S();
                }
                break;
            case 10:
                InterfaceC0246a interfaceC0246a11 = (InterfaceC0246a) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k11 = (InterfaceC3962k) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i20 = (((C3966o) interfaceC3962k11).m8614g(interfaceC0246a11) ? 4 : 2) | iIntValue22;
                } else {
                    i20 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i20 |= ((C3966o) interfaceC3962k11).m8612e(iIntValue21) ? 32 : 16;
                }
                C3966o c3966o11 = (C3966o) interfaceC3962k11;
                if (c3966o11.m8598P(i20 & 1, (i20 & 147) != 146)) {
                    C9005e c9005e2 = (C9005e) this.f4770b.get(iIntValue21);
                    c3966o11.m8607Y(-1208899603);
                    AbstractC8420a.m15729f(c9005e2, ((C6273j) this.f4771c).f30456m, (InterfaceC2139c) this.f4772d, c3966o11, 0);
                    c3966o11.m8623p(false);
                } else {
                    c3966o11.m8601S();
                }
                break;
            case 11:
                InterfaceC0246a interfaceC0246a12 = (InterfaceC0246a) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k12 = (InterfaceC3962k) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                C8741f c8741f = (C8741f) this.f4771c;
                if ((iIntValue24 & 6) == 0) {
                    i21 = (((C3966o) interfaceC3962k12).m8614g(interfaceC0246a12) ? 4 : 2) | iIntValue24;
                } else {
                    i21 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i21 |= ((C3966o) interfaceC3962k12).m8612e(iIntValue23) ? 32 : 16;
                }
                C3966o c3966o12 = (C3966o) interfaceC3962k12;
                if (c3966o12.m8598P(i21 & 1, (i21 & 147) != 146)) {
                    C4798i c4798i = (C4798i) this.f4770b.get(iIntValue23);
                    c3966o12.m8607Y(57047613);
                    List list = ((C8142a) ((h2) this.f4772d).getValue()).f38999e;
                    boolean zM8616i4 = c3966o12.m8616i(c8741f) | c3966o12.m8616i(c4798i);
                    Object objM8596M11 = c3966o12.m8596M();
                    if (zM8616i4 || objM8596M11 == C3961j.f20408a) {
                        objM8596M11 = new C2735f(7, c8741f, c4798i);
                        c3966o12.j0(objM8596M11);
                    }
                    AbstractC8436j.m15737f(c4798i, list, (InterfaceC2139c) objM8596M11, c3966o12, 0);
                    c3966o12.m8623p(false);
                } else {
                    c3966o12.m8601S();
                }
                break;
            default:
                InterfaceC0246a interfaceC0246a13 = (InterfaceC0246a) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k13 = (InterfaceC3962k) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) this.f4772d;
                InterfaceC2139c interfaceC2139c5 = (InterfaceC2139c) this.f4771c;
                if ((iIntValue26 & 6) == 0) {
                    i22 = (((C3966o) interfaceC3962k13).m8614g(interfaceC0246a13) ? 4 : 2) | iIntValue26;
                } else {
                    i22 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i22 |= ((C3966o) interfaceC3962k13).m8612e(iIntValue25) ? 32 : 16;
                }
                C3966o c3966o13 = (C3966o) interfaceC3962k13;
                if (c3966o13.m8598P(i22 & 1, (i22 & 147) != 146)) {
                    C8183a c8183a = (C8183a) this.f4770b.get(iIntValue25);
                    c3966o13.m8607Y(1568177295);
                    boolean zM8614g6 = c3966o13.m8614g(interfaceC2139c5);
                    Object objM8596M12 = c3966o13.m8596M();
                    k2.s0 s0Var = C3961j.f20408a;
                    if (zM8614g6 || objM8596M12 == s0Var) {
                        objM8596M12 = new C2736g(3, interfaceC2139c5);
                        c3966o13.j0(objM8596M12);
                    }
                    InterfaceC2139c interfaceC2139c6 = (InterfaceC2139c) objM8596M12;
                    boolean zM8614g7 = c3966o13.m8614g(interfaceC2141e2);
                    Object objM8596M13 = c3966o13.m8596M();
                    if (zM8614g7 || objM8596M13 == s0Var) {
                        objM8596M13 = new C2364d(interfaceC2141e2, 1);
                        c3966o13.j0(objM8596M13);
                    }
                    AbstractC8450a.m15755b(c8183a, interfaceC2139c6, (InterfaceC2141e) objM8596M13, c3966o13, 0);
                    c3966o13.m8623p(false);
                } else {
                    c3966o13.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
