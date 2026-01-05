package qs;

import androidx.compose.foundation.layout.AbstractC0245d;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import kr.AbstractC4189d;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import pg.f9;
import pg.x8;
import qw.a0;
import sq.b1;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qs.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6303a implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30630a;

    /* renamed from: b */
    public final /* synthetic */ Integer f30631b;

    public /* synthetic */ C6303a(Integer num, int i10) {
        this.f30630a = i10;
        this.f30631b = num;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        String strM11629c;
        int i10 = this.f30630a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
                    int i11 = c3966o.f20462P;
                    i1 i1VarM8620m = c3966o.m8620m();
                    C7876o c7876o = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, c7876o);
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
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i11))) {
                        AbstractC1452a.m4577x(i11, c3966o, i11, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    Integer num = this.f30631b;
                    if (num == null) {
                        c3966o.m8607Y(69081777);
                        c3966o.m8623p(false);
                        strM11629c = null;
                    } else {
                        c3966o.m8607Y(-413413552);
                        strM11629c = f9.m11629c(c3966o, num.intValue());
                        c3966o.m8623p(false);
                    }
                    if (strM11629c == null) {
                        strM11629c = "";
                    }
                    b1.m13077G(strM11629c, AbstractC0245d.m668e(c7876o, 1.0f), 5, new C3998s(700), 24, x8.m11932a(R.font.montserrat_bold), c3966o, 27696);
                    c3966o.m8623p(true);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Integer num2 = this.f30631b;
                    if (num2 == null) {
                        c3966o2.m8607Y(2145707080);
                    } else {
                        c3966o2.m8607Y(2145707081);
                        AbstractC4189d.m8939g(0, 2, f9.m11629c(c3966o2, num2.intValue()), c3966o2, null);
                    }
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
