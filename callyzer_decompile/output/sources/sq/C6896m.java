package sq;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import g2.sc;
import g2.vd;
import g2.xd;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import r4.C6456k;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import vs.AbstractC7766h;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sq.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6896m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33048a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f33049b;

    /* renamed from: c */
    public final /* synthetic */ String f33050c;

    public /* synthetic */ C6896m(String str, String str2) {
        this.f33049b = str;
        this.f33050c = str2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33048a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
                    int i10 = c3966o.f20462P;
                    k2.i1 i1VarM8620m = c3966o.m8620m();
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
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    float f6 = 0;
                    InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 1.0f);
                    k2.i2 i2Var = xd.f13268a;
                    g4.o0 o0Var = ((vd) c3966o.m8618k(i2Var)).f13048d;
                    k2.i2 i2Var2 = g2.y1.f13286a;
                    sc.m6307b(this.f33049b, interfaceC7879rM668e, ((g2.v1) c3966o.m8618k(i2Var2)).f12970q, 0L, null, null, 0L, null, new C6456k(5), 0L, 2, false, 1, 0, null, o0Var, c3966o, 48, 3120, 54776);
                    sc.m6307b(this.f33050c, AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 1.0f), ((g2.v1) c3966o.m8618k(i2Var2)).f12970q, 0L, null, null, 0L, null, new C6456k(5), 0L, 2, false, 1, 0, null, ((vd) c3966o.m8618k(i2Var)).f13056l, c3966o, 48, 3120, 54776);
                    c3966o.m8623p(true);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC7766h.m14746e(this.f33049b, this.f33050c, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6896m(String str, String str2, int i10) {
        this.f33049b = str;
        this.f33050c = str2;
    }
}
