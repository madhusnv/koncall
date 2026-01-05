package vs;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import g2.e6;
import g2.sc;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.InterfaceC5262u;
import o1.m1;
import o1.n1;
import o1.o1;
import og.af;
import og.r0;
import og.t0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import pg.f9;
import qw.a0;
import r4.C6456k;
import sq.b1;
import sq.g2;
import t3.j0;
import uv.AbstractC7548a;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import xp.AbstractC8420a;
import zq.AbstractC9018a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vs.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7759a implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f37395a;

    public /* synthetic */ C7759a(int i10) {
        this.f37395a = i10;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f37395a) {
            case 0:
                InterfaceC0246a item = (InterfaceC0246a) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(item, "$this$item");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    FillElement fillElement = AbstractC0245d.f1971c;
                    j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, false);
                    int i10 = c3966o.f20462P;
                    i1 i1VarM8620m = c3966o.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, fillElement);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o.c0();
                    if (c3966o.f20461O) {
                        c3966o.m8619l(c7637i);
                    } else {
                        c3966o.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    g2.c0(c3966o, 0);
                    c3966o.m8623p(true);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                o1 CommonCheckBox = (o1) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(CommonCheckBox, "$this$CommonCheckBox");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b1.m13113q(f9.m11629c(c3966o2, R.string.apply_same_sim_number), null, 0L, null, null, 0, 0, 0L, null, o0.m6461a(((vd) c3966o2.m8618k(xd.f13268a)).f13054j, 0L, af.m10534c(12), null, null, AbstractC7766h.f37417a, 0L, 0L, null, 16777181), c3966o2, 0, 510);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                o1 CommonCheckBox2 = (o1) obj;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(CommonCheckBox2, "$this$CommonCheckBox");
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b1.m13113q(f9.m11629c(c3966o3, R.string.skip_all_other_call_log), null, 0L, null, null, 0, 0, 0L, null, o0.m6461a(((vd) c3966o3.m8618k(xd.f13268a)).f13054j, 0L, af.m10534c(12), null, null, AbstractC7766h.f37417a, 0L, 0L, null, 16777181), c3966o3, 0, 510);
                } else {
                    c3966o3.m8601S();
                }
                break;
            case 3:
                InterfaceC5262u Card = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card, "$this$Card");
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    float f6 = 3;
                    InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0245d.f1971c, f6);
                    j0 j0VarM10361d2 = AbstractC5256o.m10361d(C7864c.f37642a, false);
                    int i11 = c3966o4.f20462P;
                    i1 i1VarM8620m2 = c3966o4.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM656j);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i2 = C7638j.f36921b;
                    c3966o4.c0();
                    if (c3966o4.f20461O) {
                        c3966o4.m8619l(c7637i2);
                    } else {
                        c3966o4.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, j0VarM10361d2, c3966o4);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m2, c3966o4);
                    C7636h c7636h2 = C7638j.f36926g;
                    if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i11))) {
                        AbstractC1452a.m4577x(i11, c3966o4, i11, c7636h2);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c2, c3966o4);
                    e6.m6132a(r0.m10866b(R.drawable.ic_close, 0, c3966o4), "Close Icon", C0243b.f1966a.mo662a(AbstractC0242a.m656j(AbstractC0245d.m678o(C7876o.f37669a, 24), f6), C7864c.f37646e), 0L, c3966o4, 48, 8);
                    c3966o4.m8623p(true);
                } else {
                    c3966o4.m8601S();
                }
                break;
            case 4:
                o1 OutlinedButton = (o1) obj;
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(OutlinedButton, "$this$OutlinedButton");
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    sc.m6307b(f9.m11629c(c3966o5, R.string.skip), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3966o5, 0, 0, 131070);
                } else {
                    c3966o5.m8601S();
                }
                break;
            case 5:
                o1 TextButton = (o1) obj;
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(TextButton, "$this$TextButton");
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b1.m13113q(f9.m11629c(c3966o6, R.string.retry), null, ((v1) c3966o6.m8618k(y1.f13286a)).f12954a, null, new C6456k(3), 0, 0, 0L, null, ((vd) c3966o6.m8618k(xd.f13268a)).f13054j, c3966o6, 0, 490);
                } else {
                    c3966o6.m8601S();
                }
                break;
            case 6:
                o1 TextButton2 = (o1) obj;
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(TextButton2, "$this$TextButton");
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    b1.m13113q(f9.m11629c(c3966o7, R.string.done), null, ((v1) c3966o7.m8618k(y1.f13286a)).f12954a, null, null, 0, 0, 0L, null, ((vd) c3966o7.m8618k(xd.f13268a)).f13054j, c3966o7, 0, 506);
                } else {
                    c3966o7.m8601S();
                }
                break;
            case 7:
                o1 TextButton3 = (o1) obj;
                InterfaceC3962k interfaceC3962k8 = (InterfaceC3962k) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(TextButton3, "$this$TextButton");
                C3966o c3966o8 = (C3966o) interfaceC3962k8;
                if (c3966o8.m8598P(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    b1.m13113q(f9.m11629c(c3966o8, R.string.done), null, ((v1) c3966o8.m8618k(y1.f13286a)).f12954a, null, null, 0, 0, 0L, null, ((vd) c3966o8.m8618k(xd.f13268a)).f13054j, c3966o8, 0, 506);
                } else {
                    c3966o8.m8601S();
                }
                break;
            case 8:
                InterfaceC0246a item2 = (InterfaceC0246a) obj;
                InterfaceC3962k interfaceC3962k9 = (InterfaceC3962k) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(item2, "$this$item");
                C3966o c3966o9 = (C3966o) interfaceC3962k9;
                if (c3966o9.m8598P(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC8420a.m15725b(c3966o9, 0);
                } else {
                    c3966o9.m8601S();
                }
                break;
            case 9:
                o1 OutlinedButton2 = (o1) obj;
                InterfaceC3962k interfaceC3962k10 = (InterfaceC3962k) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(OutlinedButton2, "$this$OutlinedButton");
                C3966o c3966o10 = (C3966o) interfaceC3962k10;
                if (c3966o10.m8598P(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    b1.m13113q(t0.m10920c(c3966o10, R.string.cancel), null, 0L, null, null, 0, 0, 0L, null, o0.m6461a(((vd) c3966o10.m8618k(xd.f13268a)).f13058n, 0L, af.m10534c(15), null, null, null, 0L, 0L, null, 16777213), c3966o10, 0, 510);
                } else {
                    c3966o10.m8601S();
                }
                break;
            case 10:
                o1 OutlinedButton3 = (o1) obj;
                InterfaceC3962k interfaceC3962k11 = (InterfaceC3962k) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(OutlinedButton3, "$this$OutlinedButton");
                C3966o c3966o11 = (C3966o) interfaceC3962k11;
                if (c3966o11.m8598P(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    b1.m13113q(t0.m10920c(c3966o11, R.string.reset), null, 0L, null, null, 0, 0, 0L, null, o0.m6461a(((vd) c3966o11.m8618k(xd.f13268a)).f13058n, 0L, af.m10534c(15), null, null, null, 0L, 0L, null, 16777213), c3966o11, 0, 510);
                } else {
                    c3966o11.m8601S();
                }
                break;
            case 11:
                InterfaceC0246a item3 = (InterfaceC0246a) obj;
                InterfaceC3962k interfaceC3962k12 = (InterfaceC3962k) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(item3, "$this$item");
                C3966o c3966o12 = (C3966o) interfaceC3962k12;
                if (c3966o12.m8598P(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC5244c.m10322f(c3966o12, AbstractC0245d.m670g(C7876o.f37669a, 80));
                } else {
                    c3966o12.m8601S();
                }
                break;
            case 12:
                InterfaceC5262u Card2 = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k13 = (InterfaceC3962k) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Card2, "$this$Card");
                C3966o c3966o13 = (C3966o) interfaceC3962k13;
                if (!c3966o13.m8598P(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    c3966o13.m8601S();
                }
                break;
            case 13:
                o1 Button = (o1) obj;
                InterfaceC3962k interfaceC3962k14 = (InterfaceC3962k) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Button, "$this$Button");
                C3966o c3966o14 = (C3966o) interfaceC3962k14;
                if (c3966o14.m8598P(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    b1.m13113q(t0.m10920c(c3966o14, R.string.okay), null, AbstractC7548a.f36357k, null, new C6456k(3), 0, 0, 0L, null, ((vd) c3966o14.m8618k(xd.f13268a)).f13055k, c3966o14, KyberEngine.KyberPolyBytes, 490);
                } else {
                    c3966o14.m8601S();
                }
                break;
            case 14:
                InterfaceC2141e innerTextField = (InterfaceC2141e) obj;
                InterfaceC3962k interfaceC3962k15 = (InterfaceC3962k) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(innerTextField, "innerTextField");
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((C3966o) interfaceC3962k15).m8616i(innerTextField) ? 4 : 2;
                }
                C3966o c3966o15 = (C3966o) interfaceC3962k15;
                if (c3966o15.m8598P(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(C7876o.f37669a, 24);
                    n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25761e, C7864c.f37652l, c3966o15, 54);
                    int i12 = c3966o15.f20462P;
                    i1 i1VarM8620m3 = c3966o15.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o15, interfaceC7879rM678o);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i3 = C7638j.f36921b;
                    c3966o15.c0();
                    if (c3966o15.f20461O) {
                        c3966o15.m8619l(c7637i3);
                    } else {
                        c3966o15.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o15);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m3, c3966o15);
                    C7636h c7636h3 = C7638j.f36926g;
                    if (c3966o15.f20461O || !AbstractC4154l.m8918a(c3966o15.m8596M(), Integer.valueOf(i12))) {
                        AbstractC1452a.m4577x(i12, c3966o15, i12, c7636h3);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c3, c3966o15);
                    AbstractC1452a.m4576w(iIntValue15 & 14, innerTextField, c3966o15, true);
                } else {
                    c3966o15.m8601S();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                InterfaceC0246a item4 = (InterfaceC0246a) obj;
                InterfaceC3962k interfaceC3962k16 = (InterfaceC3962k) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(item4, "$this$item");
                C3966o c3966o16 = (C3966o) interfaceC3962k16;
                if (c3966o16.m8598P(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC9018a.m16491k(c3966o16, 0);
                } else {
                    c3966o16.m8601S();
                }
                break;
            case 16:
                InterfaceC5262u DialogWithPositiveAndNegativeButtons = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k17 = (InterfaceC3962k) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(DialogWithPositiveAndNegativeButtons, "$this$DialogWithPositiveAndNegativeButtons");
                C3966o c3966o17 = (C3966o) interfaceC3962k17;
                if (c3966o17.m8598P(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    sc.m6307b(t0.m10920c(c3966o17, R.string.download_recording_alert), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3966o17, 0, 0, 131070);
                } else {
                    c3966o17.m8601S();
                }
                break;
            case 17:
                o1 Button2 = (o1) obj;
                InterfaceC3962k interfaceC3962k18 = (InterfaceC3962k) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Button2, "$this$Button");
                C3966o c3966o18 = (C3966o) interfaceC3962k18;
                if (c3966o18.m8598P(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    sc.m6307b("Download", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3966o18, 6, 0, 131070);
                } else {
                    c3966o18.m8601S();
                }
                break;
            case 18:
                o1 OutlinedButton4 = (o1) obj;
                InterfaceC3962k interfaceC3962k19 = (InterfaceC3962k) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(OutlinedButton4, "$this$OutlinedButton");
                C3966o c3966o19 = (C3966o) interfaceC3962k19;
                if (c3966o19.m8598P(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    b1.m13113q(t0.m10920c(c3966o19, R.string.close), null, 0L, null, null, 0, 0, 0L, null, null, c3966o19, 0, 1022);
                } else {
                    c3966o19.m8601S();
                }
                break;
            case 19:
                InterfaceC5262u AlertDialogWithPositiveAndNegativeButton = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k20 = (InterfaceC3962k) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AlertDialogWithPositiveAndNegativeButton, "$this$AlertDialogWithPositiveAndNegativeButton");
                C3966o c3966o20 = (C3966o) interfaceC3962k20;
                if (c3966o20.m8598P(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    b1.m13113q(f9.m11629c(c3966o20, R.string.log_file_send_info), null, 0L, null, null, 0, 0, 0L, null, null, c3966o20, 0, 1022);
                } else {
                    c3966o20.m8601S();
                }
                break;
            case 20:
                o1 Button3 = (o1) obj;
                InterfaceC3962k interfaceC3962k21 = (InterfaceC3962k) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(Button3, "$this$Button");
                C3966o c3966o21 = (C3966o) interfaceC3962k21;
                if (c3966o21.m8598P(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    b1.m13113q(t0.m10920c(c3966o21, R.string.yes), null, ((v1) c3966o21.m8618k(y1.f13286a)).f12955b, null, null, 0, 0, 0L, null, null, c3966o21, 0, 1018);
                } else {
                    c3966o21.m8601S();
                }
                break;
            case 21:
                o1 OutlinedButton5 = (o1) obj;
                InterfaceC3962k interfaceC3962k22 = (InterfaceC3962k) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(OutlinedButton5, "$this$OutlinedButton");
                C3966o c3966o22 = (C3966o) interfaceC3962k22;
                if (c3966o22.m8598P(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    b1.m13113q(t0.m10920c(c3966o22, R.string.no), null, 0L, null, null, 0, 0, 0L, null, null, c3966o22, 0, 1022);
                } else {
                    c3966o22.m8601S();
                }
                break;
            default:
                InterfaceC5262u AlertDialogWithPositiveAndNegativeButton2 = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k23 = (InterfaceC3962k) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AlertDialogWithPositiveAndNegativeButton2, "$this$AlertDialogWithPositiveAndNegativeButton");
                C3966o c3966o23 = (C3966o) interfaceC3962k23;
                if (c3966o23.m8598P(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    sc.m6307b(t0.m10920c(c3966o23, R.string.storage_permission_disallow_on_CR), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c3966o23, 0, 0, 131070);
                } else {
                    c3966o23.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
