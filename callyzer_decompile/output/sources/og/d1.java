package og;

import a2.AbstractC0030c;
import aa.C0080g;
import al.C0182j;
import an.u1;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.material3.AbstractC0256a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bm.C0696g;
import c9.C0919n;
import com.google.android.gms.internal.measurement.d4;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.C1565s;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import g2.gb;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mv.C4887a;
import mv.C4888b;
import nv.C5149a;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.m1;
import o1.n1;
import og.d1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p005f.C2162k;
import p1.AbstractC5788a;
import pg.b9;
import pg.i0;
import qw.C6364n;
import qw.a0;
import s2.AbstractC6740i;
import sq.b1;
import td.C7124a;
import td.C7126c;
import td.EnumC7143t;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d1 {
    /* renamed from: a */
    public static final void m10595a(final C5149a data, final InterfaceC2139c onEvent, final int i10, final boolean z6, InterfaceC3962k interfaceC3962k, final int i11) {
        int i12;
        int i13;
        boolean z10;
        AbstractC4154l.m8923f(data, "data");
        AbstractC4154l.m8923f(onEvent, "onEvent");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1668766680);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8616i(data) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8616i(onEvent) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 = i10;
            i12 |= c3966o.m8612e(i13) ? 256 : 128;
        } else {
            i13 = i10;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o.m8615h(z6) ? NewHope.SENDB_BYTES : 1024;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 1171) != 1170)) {
            final Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M);
            }
            k2.w0 w0Var = (k2.w0) objM8596M;
            androidx.fragment.app.d1 d1Var = new androidx.fragment.app.d1(4);
            boolean z11 = (i12 & 112) == 32;
            Object objM8596M2 = c3966o.m8596M();
            if (z11 || objM8596M2 == s0Var) {
                objM8596M2 = new C4887a(0, onEvent, w0Var);
                c3966o.j0(objM8596M2);
            }
            final C2162k c2162kM10719c = je.m10719c(d1Var, (InterfaceC2139c) objM8596M2, c3966o, 0);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                c3966o.m8607Y(19134800);
                String strM11629c = pg.f9.m11629c(c3966o, R.string.permission_denied);
                Object objM8596M3 = c3966o.m8596M();
                if (objM8596M3 == s0Var) {
                    objM8596M3 = new C0696g(w0Var, 28);
                    c3966o.j0(objM8596M3);
                }
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M3;
                String strM11629c2 = pg.f9.m11629c(c3966o, R.string.permission_allowed_dialog_description);
                String strM11629c3 = pg.f9.m11629c(c3966o, R.string.go_to_settings);
                boolean zM8616i = c3966o.m8616i(context);
                Object objM8596M4 = c3966o.m8596M();
                if (zM8616i || objM8596M4 == s0Var) {
                    objM8596M4 = new C4888b(context, w0Var, 0);
                    c3966o.j0(objM8596M4);
                }
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M4;
                String strM11629c4 = pg.f9.m11629c(c3966o, R.string.cancel);
                Object objM8596M5 = c3966o.m8596M();
                if (objM8596M5 == s0Var) {
                    objM8596M5 = new C0696g(w0Var, 29);
                    c3966o.j0(objM8596M5);
                }
                InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) objM8596M5;
                z10 = false;
                sq.g2.m13150b(strM11629c, interfaceC2137a, strM11629c2, strM11629c3, interfaceC2137a2, strM11629c4, interfaceC2137a3, c3966o, 1572912);
                c3966o = c3966o;
            } else {
                z10 = false;
                c3966o.m8607Y(12569434);
            }
            c3966o.m8623p(z10);
            float f6 = 8;
            final int i14 = i13;
            g2.p9.m6240d(AbstractC0245d.m668e(AbstractC0242a.m656j(C7876o.f37669a, 10), 1.0f), AbstractC7861e.m14841b(f6), null, g2.p9.m6254r(f6, 62), null, AbstractC6740i.m12902d(-1815784678, new InterfaceC2142f() { // from class: mv.c
                @Override // ex.InterfaceC2142f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z12;
                    boolean z13;
                    InterfaceC5262u Card = (InterfaceC5262u) obj;
                    InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    AbstractC4154l.m8923f(Card, "$this$Card");
                    C3966o c3966o2 = (C3966o) interfaceC3962k2;
                    if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                        C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
                        int i15 = c3966o2.f20462P;
                        i1 i1VarM8620m = c3966o2.m8620m();
                        C7876o c7876o = C7876o.f37669a;
                        InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, c7876o);
                        InterfaceC7639k.V0.getClass();
                        C7637i c7637i = C7638j.f36921b;
                        c3966o2.c0();
                        if (c3966o2.f20461O) {
                            c3966o2.m8619l(c7637i);
                        } else {
                            c3966o2.m0();
                        }
                        C7636h c7636h = C7638j.f36925f;
                        C3953b.m8521x(c7636h, c5261tM10367a, c3966o2);
                        C7636h c7636h2 = C7638j.f36924e;
                        C3953b.m8521x(c7636h2, i1VarM8620m, c3966o2);
                        C7636h c7636h3 = C7638j.f36926g;
                        if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i15))) {
                            AbstractC1452a.m4577x(i15, c3966o2, i15, c7636h3);
                        }
                        C7636h c7636h4 = C7638j.f36923d;
                        C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o2);
                        C7870i c7870i = C7864c.f37652l;
                        float f10 = 15;
                        InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o, f10, DefinitionKt.NO_Float_VALUE, 2);
                        n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o2, 48);
                        int i16 = c3966o2.f20462P;
                        i1 i1VarM8620m2 = c3966o2.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM658l);
                        c3966o2.c0();
                        if (c3966o2.f20461O) {
                            c3966o2.m8619l(c7637i);
                        } else {
                            c3966o2.m0();
                        }
                        C3953b.m8521x(c7636h, n1VarM10357a, c3966o2);
                        C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o2);
                        if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i16))) {
                            AbstractC1452a.m4577x(i16, c3966o2, i16, c7636h3);
                        }
                        C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o2);
                        C5149a c5149a = data;
                        i0.m11693a(b9.m11551a(c5149a.f25213a, 0, c3966o2), "", AbstractC0245d.m678o(c7876o, 25), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o2, 432, 120);
                        String str = c5149a.f25214b;
                        i2 i2Var = xd.f13268a;
                        o0 o0Var = ((vd) c3966o2.m8618k(i2Var)).f13049e;
                        InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(c7876o, f10);
                        if (1.0f <= 0.0d) {
                            AbstractC5788a.m11338a("invalid weight; must be greater than zero");
                        }
                        b1.m13113q(str, AbstractC4801l.m9747u(1.0f, interfaceC7879rM656j, true), 0L, null, null, 0, 0, 0L, null, o0Var, c3966o2, 0, 508);
                        C3966o c3966o3 = c3966o2;
                        if (c5149a.f25215c) {
                            z12 = false;
                            c3966o3.m8607Y(1298888206);
                        } else {
                            c3966o3.m8607Y(1307192145);
                            InterfaceC7879r interfaceC7879rM3228b = d4.m3228b(c7876o, 0.75f);
                            boolean z14 = c5149a.f25215c;
                            i2 i2Var2 = y1.f13286a;
                            gb gbVarM6256t = p9.m6256t(((v1) c3966o3.m8618k(i2Var2)).f12969p, C1565s.m5186b(0.4f, 14, ((v1) c3966o3.m8618k(i2Var2)).f12970q), C1565s.m5186b(DefinitionKt.NO_Float_VALUE, 14, ((v1) c3966o3.m8618k(i2Var2)).f12970q), c3966o3, 65423);
                            c3966o3 = c3966o3;
                            boolean z15 = z6;
                            boolean zM8615h = c3966o3.m8615h(z15);
                            InterfaceC2139c interfaceC2139c = onEvent;
                            boolean zM8614g = zM8615h | c3966o3.m8614g(interfaceC2139c);
                            int i17 = i14;
                            boolean zM8612e = zM8614g | c3966o3.m8612e(i17) | c3966o3.m8616i(c5149a);
                            Context context2 = context;
                            boolean zM8616i2 = zM8612e | c3966o3.m8616i(context2);
                            C2162k c2162k = c2162kM10719c;
                            boolean zM8616i3 = zM8616i2 | c3966o3.m8616i(c2162k);
                            Object objM8596M6 = c3966o3.m8596M();
                            if (zM8616i3 || objM8596M6 == C3961j.f20408a) {
                                z13 = z14;
                                u1 u1Var = new u1(i17, context2, interfaceC2139c, c2162k, c5149a, z15);
                                c3966o3.j0(u1Var);
                                objM8596M6 = u1Var;
                            } else {
                                z13 = z14;
                            }
                            AbstractC0256a.m702a(z13, (InterfaceC2139c) objM8596M6, interfaceC7879rM3228b, false, gbVarM6256t, c3966o3, KyberEngine.KyberPolyBytes);
                            z12 = false;
                        }
                        c3966o3.m8623p(z12);
                        c3966o3.m8623p(true);
                        C3966o c3966o4 = c3966o3;
                        p9.m6245i(null, DefinitionKt.NO_Float_VALUE, ((v1) c3966o3.m8618k(y1.f13286a)).f12928A, c3966o4, 0, 3);
                        b1.m13113q(c5149a.f25216d, AbstractC0242a.m656j(c7876o, f10), 0L, null, null, 0, 0, 0L, null, ((vd) c3966o4.m8618k(i2Var)).f13056l, c3966o4, 48, 508);
                        c3966o4.m8623p(true);
                    } else {
                        c3966o2.m8601S();
                    }
                    return a0.f30746a;
                }
            }, c3966o), c3966o, 196614, 20);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e() { // from class: mv.d
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d1.m10595a(data, onEvent, i10, z6, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                    return a0.f30746a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0265  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10596b(ex.InterfaceC2137a r28, k2.InterfaceC3962k r29, int r30) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.d1.m10596b(ex.a, k2.k, int):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: c */
    public static final C0080g m10597c(C0182j c0182j) {
        Object objM10796a;
        Object objM10796a2;
        Serializable serializableM10796a;
        Object objM10796a3;
        C0919n c0919n = new C0919n();
        while (true) {
            C0182j c0182jM418i = c0182j.m418i();
            if (c0182jM418i == null) {
                if (((String) c0919n.f5598a) == null) {
                    c0919n.f5598a = "";
                }
                if (((C7126c) c0919n.f5599b) == null) {
                    DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
                    c0919n.f5599b = C7124a.m13403a(0, 0L);
                }
                if (((String) c0919n.f5600c) == null) {
                    c0919n.f5600c = "";
                }
                if (((String) c0919n.f5601d) == null) {
                    c0919n.f5601d = "";
                }
                return new C0080g(c0919n);
            }
            String strM415f = c0182jM418i.m415f();
            switch (strM415f.hashCode()) {
                case -532231901:
                    if (!strM415f.equals("SessionToken")) {
                        break;
                    } else {
                        try {
                            objM10796a = pg.l6.m11757a(c0182jM418i);
                        } catch (Throwable th2) {
                            objM10796a = od.m10796a(th2);
                        }
                        Throwable thM12363a = C6364n.m12363a(objM10796a);
                        if (thM12363a != null) {
                            objM10796a = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#tokenType`)", thM12363a);
                        }
                        od.m10798c(objM10796a);
                        c0919n.f5601d = (String) objM10796a;
                        break;
                    }
                case 616582326:
                    if (!strM415f.equals("AccessKeyId")) {
                        break;
                    } else {
                        try {
                            objM10796a2 = pg.l6.m11757a(c0182jM418i);
                        } catch (Throwable th3) {
                            objM10796a2 = od.m10796a(th3);
                        }
                        Throwable thM12363a2 = C6364n.m12363a(objM10796a2);
                        if (thM12363a2 != null) {
                            objM10796a2 = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#accessKeyIdType`)", thM12363a2);
                        }
                        od.m10798c(objM10796a2);
                        c0919n.f5598a = (String) objM10796a2;
                        break;
                    }
                case 1155999439:
                    if (!strM415f.equals("Expiration")) {
                        break;
                    } else {
                        try {
                            serializableM10796a = pg.l6.m11757a(c0182jM418i);
                        } catch (Throwable th4) {
                            serializableM10796a = od.m10796a(th4);
                        }
                        Object objM10633c = ef.m10633c(serializableM10796a, EnumC7143t.ISO_8601);
                        Throwable thM12363a3 = C6364n.m12363a(objM10633c);
                        if (thM12363a3 != null) {
                            objM10633c = AbstractC0030c.m128s("expected (timestamp: `com.amazonaws.sts#dateType`)", thM12363a3);
                        }
                        od.m10798c(objM10633c);
                        c0919n.f5599b = (C7126c) objM10633c;
                        break;
                    }
                case 1364055403:
                    if (!strM415f.equals("SecretAccessKey")) {
                        break;
                    } else {
                        try {
                            objM10796a3 = pg.l6.m11757a(c0182jM418i);
                        } catch (Throwable th5) {
                            objM10796a3 = od.m10796a(th5);
                        }
                        Throwable thM12363a4 = C6364n.m12363a(objM10796a3);
                        if (thM12363a4 != null) {
                            objM10796a3 = AbstractC0030c.m128s("expected (string: `com.amazonaws.sts#accessKeySecretType`)", thM12363a4);
                        }
                        od.m10798c(objM10796a3);
                        c0919n.f5600c = (String) objM10796a3;
                        break;
                    }
            }
            c0182jM418i.m413d();
        }
    }
}
