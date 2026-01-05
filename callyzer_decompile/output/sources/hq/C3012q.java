package hq;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import c0.AbstractC0810c;
import com.amplifyframework.core.store.EncryptedKeyValueRepository;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.response.ExcludeNumber;
import d3.C1559m;
import d3.C1565s;
import ex.InterfaceC2141e;
import g2.e6;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import hr.AbstractC3024c;
import java.io.File;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;
import ls.AbstractC4510a;
import ng.AbstractC5068s;
import ns.C5136b;
import og.af;
import og.ic;
import og.r0;
import op.AbstractC5432a;
import or.C5454q;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import pg.b9;
import pg.f9;
import ps.AbstractC6009i;
import pu.C6040h;
import pu.EnumC6039g;
import sq.b1;
import uv.AbstractC7556i;
import w2.C7876o;
import zp.C9008h;
import zp.C9011k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.q */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3012q implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16273a;

    public /* synthetic */ C3012q(int i10) {
        this.f16273a = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16273a) {
            case 0:
                ((Integer) obj).intValue();
                C4181k item = (C4181k) obj2;
                AbstractC4154l.m8923f(item, "item");
                return item.f21189C;
            case 1:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p9.m6245i(null, DefinitionKt.NO_Float_VALUE, C1565s.f7816i, c3966o, KyberEngine.KyberPolyBytes, 3);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                AbstractC4154l.m8923f((C9008h) obj2, "<unused var>");
                return num;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC3024c.m7273a((InterfaceC3962k) obj, C3953b.m8496A(1));
                return qw.a0.f30746a;
            case 4:
                Integer num2 = (Integer) obj;
                num2.intValue();
                AbstractC4154l.m8923f((C9011k) obj2, "<unused var>");
                return num2;
            case 5:
                Integer num3 = (Integer) obj;
                num3.intValue();
                AbstractC4154l.m8923f((C5454q) obj2, "<unused var>");
                return num3;
            case 6:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (!c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
            case 7:
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (!c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c3966o3.m8601S();
                }
                return qw.a0.f30746a;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC4510a.m9346e((InterfaceC3962k) obj, C3953b.m8496A(1));
                return qw.a0.f30746a;
            case 9:
                ((Integer) obj).intValue();
                C5136b item2 = (C5136b) obj2;
                AbstractC4154l.m8923f(item2, "item");
                return item2.f25145h + "_" + item2.f25141d;
            case 10:
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e6.m6132a(r0.m10866b(R.drawable.ic_troubleshoot_retry, 0, c3966o4), "Refresh", null, 0L, c3966o4, 48, 12);
                } else {
                    c3966o4.m8601S();
                }
                return qw.a0.f30746a;
            case 11:
                int iIntValue5 = ((Integer) obj).intValue();
                C6040h model = (C6040h) obj2;
                AbstractC4154l.m8923f(model, "model");
                EnumC6039g enumC6039g = model.f29492e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iIntValue5);
                sb2.append(enumC6039g);
                return sb2.toString();
            case 12:
                Integer num4 = (Integer) obj;
                num4.intValue();
                AbstractC4154l.m8923f((C9011k) obj2, "<unused var>");
                return num4;
            case 13:
                return ((l7.a0) obj2).m9190j();
            case 14:
                return EncryptedKeyValueRepository._init_$lambda$0((File) obj, (String) obj2);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Integer num5 = (Integer) obj;
                num5.intValue();
                AbstractC4154l.m8923f((C9008h) obj2, "<unused var>");
                return num5;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC5432a.m11141f((InterfaceC3962k) obj, C3953b.m8496A(1));
                return qw.a0.f30746a;
            case 17:
                Integer num6 = (Integer) obj;
                num6.intValue();
                AbstractC4154l.m8923f((ExcludeNumber) obj2, "<unused var>");
                return num6;
            case 18:
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e6.m6132a(b9.m11551a(R.drawable.icon_call_dialer, 0, c3966o5), "Dialer Icon", AbstractC0245d.m678o(C7876o.f37669a, 24), C1565s.f7812e, c3966o5, 3504, 0);
                } else {
                    c3966o5.m8601S();
                }
                return qw.a0.f30746a;
            case 19:
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e6.m6133b(ic.m10699a(), "More", null, 0L, c3966o6, 48, 12);
                } else {
                    c3966o6.m8601S();
                }
                return qw.a0.f30746a;
            case 20:
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    b1.m13113q(f9.m11629c(c3966o7, R.string.frequently_talked), null, 0L, null, null, 0, 0, 0L, null, o0.m6461a(((vd) c3966o7.m8618k(xd.f13268a)).f13050f, 0L, af.m10534c(12), null, null, null, 0L, 0L, null, 16777213), c3966o7, 0, 510);
                } else {
                    c3966o7.m8601S();
                }
                return qw.a0.f30746a;
            case 21:
                InterfaceC3962k interfaceC3962k8 = (InterfaceC3962k) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                C3966o c3966o8 = (C3966o) interfaceC3962k8;
                if (c3966o8.m8598P(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    b1.m13113q(f9.m11629c(c3966o8, R.string.a_to_z), null, 0L, null, null, 0, 0, 0L, null, AbstractC7556i.f36430c, c3966o8, 805306368, 510);
                } else {
                    c3966o8.m8601S();
                }
                return qw.a0.f30746a;
            case 22:
                InterfaceC3962k interfaceC3962k9 = (InterfaceC3962k) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                C3966o c3966o9 = (C3966o) interfaceC3962k9;
                if (c3966o9.m8598P(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    b1.m13113q(f9.m11629c(c3966o9, R.string.refresh), null, 0L, null, null, 0, 0, 0L, null, ((vd) c3966o9.m8618k(xd.f13268a)).f13050f, c3966o9, 0, 510);
                } else {
                    c3966o9.m8601S();
                }
                return qw.a0.f30746a;
            case 23:
                InterfaceC3962k interfaceC3962k10 = (InterfaceC3962k) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                C3966o c3966o10 = (C3966o) interfaceC3962k10;
                if (c3966o10.m8598P(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pg.i0.m11693a(b9.m11551a(R.drawable.ic_wp, 0, c3966o10), "", AbstractC0245d.m678o(C7876o.f37669a, 30), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o10, 432, 120);
                } else {
                    c3966o10.m8601S();
                }
                return qw.a0.f30746a;
            case 24:
                InterfaceC3962k interfaceC3962k11 = (InterfaceC3962k) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                C3966o c3966o11 = (C3966o) interfaceC3962k11;
                if (c3966o11.m8598P(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    float f6 = 25;
                    pg.i0.m11693a(b9.m11551a(R.drawable.icon_tab_all_calls_filled, 0, c3966o11), "", AbstractC0245d.m682s(AbstractC0245d.m670g(AbstractC0242a.m656j(C7876o.f37669a, 10), f6), f6), null, null, DefinitionKt.NO_Float_VALUE, new C1559m(5, ((v1) c3966o11.m8618k(y1.f13286a)).f12969p), c3966o11, 432, 56);
                } else {
                    c3966o11.m8601S();
                }
                return qw.a0.f30746a;
            case 25:
                InterfaceC3962k interfaceC3962k12 = (InterfaceC3962k) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                C3966o c3966o12 = (C3966o) interfaceC3962k12;
                if (c3966o12.m8598P(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    pg.i0.m11693a(b9.m11551a(R.drawable.icon_call_dialer, 0, c3966o12), "", AbstractC0810c.m2176a(AbstractC0245d.m678o(C7876o.f37669a, 24), 0.5f), null, null, DefinitionKt.NO_Float_VALUE, new C1559m(5, AbstractC5068s.m9996a(c3966o12, R.color.placeholder_color)), c3966o12, 432, 56);
                } else {
                    c3966o12.m8601S();
                }
                return qw.a0.f30746a;
            case 26:
                InterfaceC3962k interfaceC3962k13 = (InterfaceC3962k) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                C3966o c3966o13 = (C3966o) interfaceC3962k13;
                if (c3966o13.m8598P(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e6.m6132a(b9.m11551a(R.drawable.ic_copy, 0, c3966o13), "", AbstractC0245d.m678o(C7876o.f37669a, 22), ((v1) c3966o13.m8618k(y1.f13286a)).f12970q, c3966o13, 432, 0);
                } else {
                    c3966o13.m8601S();
                }
                return qw.a0.f30746a;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC6009i.m12038h((InterfaceC3962k) obj, C3953b.m8496A(1));
                return qw.a0.f30746a;
            case 28:
                Integer num7 = (Integer) obj;
                num7.intValue();
                AbstractC4154l.m8923f((String) obj2, "<unused var>");
                return num7;
            default:
                Integer num8 = (Integer) obj;
                num8.intValue();
                AbstractC4154l.m8923f((ur.k0) obj2, "<unused var>");
                return num8;
        }
    }

    public /* synthetic */ C3012q(int i10, int i11) {
        this.f16273a = i11;
    }
}
