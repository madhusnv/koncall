package sq;

import a2.AbstractC0030c;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import aws.smithy.kotlin.runtime.time.ParseException;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import ex.InterfaceC2141e;
import g2.fb;
import g2.k9;
import g2.vd;
import g2.xd;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import og.af;
import r4.C6456k;
import s2.AbstractC6740i;
import td.AbstractC7136m;
import td.C7129f;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33375a;

    /* renamed from: b */
    public final /* synthetic */ String f33376b;

    public /* synthetic */ y1(String str, int i10) {
        this.f33375a = 1;
        this.f33376b = str;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C7129f c7129f;
        switch (this.f33375a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b1.m13113q(this.f33376b, null, C1565s.m5186b(0.5f, 14, ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12970q), null, new C6456k(5), 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13055k, c3966o, 0, 490);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 1:
                ((Integer) obj2).getClass();
                b1.m13088R(this.f33376b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return qw.a0.f30746a;
            case 2:
                String str = (String) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC4154l.m8923f(str, "str");
                String str2 = this.f33376b;
                AbstractC7136m.m13412b(iIntValue2, str2.length(), str);
                int length = str2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (str.charAt(iIntValue2 + i10) != str2.charAt(i10)) {
                        StringBuilder sbM7383p = i0.m0.m7383p("expected `", str2, "` found `");
                        String strSubstring = str.substring(iIntValue2, str2.length() + iIntValue2);
                        AbstractC4154l.m8922e(strSubstring, "substring(...)");
                        throw new ParseException(str, AbstractC0030c.m123n(sbM7383p, strSubstring, '`'), iIntValue2);
                    }
                }
                return new C7129f(str2.length() + iIntValue2, str2);
            case 3:
                String str3 = (String) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                AbstractC4154l.m8923f(str3, "str");
                AbstractC7136m.m13412b(iIntValue3, 1, str3);
                char cCharAt = str3.charAt(iIntValue3);
                String str4 = this.f33376b;
                int length2 = str4.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        c7129f = null;
                    } else {
                        char cCharAt2 = str4.charAt(i11);
                        if (cCharAt2 == cCharAt) {
                            c7129f = new C7129f(iIntValue3 + 1, Character.valueOf(cCharAt2));
                        } else {
                            i11++;
                        }
                    }
                }
                if (c7129f != null) {
                    return c7129f;
                }
                throw new ParseException(str3, "expected one of `" + str4 + "` found " + cCharAt, iIntValue3);
            case 4:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C7876o c7876o = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(AbstractC0242a.m658l(c7876o, DefinitionKt.NO_Float_VALUE, 20, 1), 1.0f);
                    o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25761e, C7864c.f37652l, c3966o2, 54);
                    int i12 = c3966o2.f20462P;
                    k2.i1 i1VarM8620m = c3966o2.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM668e);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o2.c0();
                    if (c3966o2.f20461O) {
                        c3966o2.m8619l(c7637i);
                    } else {
                        c3966o2.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o2);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i12))) {
                        AbstractC1452a.m4577x(i12, c3966o2, i12, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
                    k9.m6197b(AbstractC0245d.m678o(c7876o, 24), ((g2.v1) c3966o2.m8618k(g2.y1.f13286a)).f12954a, 3.0f, 0L, 0, c3966o2, 390, 24);
                    AbstractC5244c.m10322f(c3966o2, AbstractC0245d.m682s(c7876o, 16));
                    b1.m13113q(this.f33376b, null, 0L, null, null, 0, 0, 0L, null, new g4.o0(0L, af.m10534c(16), C3998s.f20698h, null, null, 0L, 0, 0L, 16777209), c3966o2, 0, 510);
                    c3966o2.m8623p(true);
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
            default:
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fb.m6164a(null, AbstractC7861e.m14841b(12), ((g2.v1) c3966o3.m8618k(g2.y1.f13286a)).f12969p, 0L, 8, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(-984727589, new y1(this.f33376b, 4, (byte) 0), c3966o3), c3966o3, 12607488, 105);
                } else {
                    c3966o3.m8601S();
                }
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ y1(String str, int i10, byte b10) {
        this.f33375a = i10;
        this.f33376b = str;
    }
}
