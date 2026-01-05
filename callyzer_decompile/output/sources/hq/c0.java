package hq;

import androidx.compose.foundation.layout.AbstractC0242a;
import bm.C0692c;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.e6;
import g2.p9;
import g2.v1;
import g2.y1;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5251j;
import o1.m1;
import o1.n1;
import og.ac;
import og.bc;
import op.AbstractC5432a;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16165a;

    /* renamed from: b */
    public final /* synthetic */ w0 f16166b;

    public /* synthetic */ c0(w0 w0Var, int i10) {
        this.f16165a = i10;
        this.f16166b = w0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16165a) {
            case 0:
                ((Integer) obj2).getClass();
                a0.m7272r(this.f16166b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 1:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(C7876o.f37669a, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 5, DefinitionKt.NO_Float_VALUE, 11);
                    n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37652l, c3966o, 48);
                    int i10 = c3966o.f20462P;
                    i1 i1VarM8620m = c3966o.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o.c0();
                    if (c3966o.f20461O) {
                        c3966o.m8619l(c7637i);
                    } else {
                        c3966o.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    e6.m6133b(((Boolean) this.f16166b.getValue()).booleanValue() ? bc.m10554a() : ac.m10528d(), null, null, 0L, c3966o, 48, 12);
                    c3966o.m8623p(true);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 2:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w0 w0Var = this.f16166b;
                    boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
                    Object objM8596M = c3966o2.m8596M();
                    if (objM8596M == C3961j.f20408a) {
                        objM8596M = new C0692c(w0Var, 9);
                        c3966o2.j0(objM8596M);
                    }
                    g2.i1.m6172a(zBooleanValue, (InterfaceC2139c) objM8596M, C7876o.f37669a, false, p9.m6255s(((v1) c3966o2.m8618k(y1.f13286a)).f12954a, 0L, 0L, 0L, 0L, 0L, c3966o2, 62), c3966o2, 432);
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC5432a.m11145j(this.f16166b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            default:
                ((Integer) obj2).getClass();
                b1.m13076F(this.f16166b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ c0(w0 w0Var, int i10, int i11) {
        this.f16165a = i11;
        this.f16166b = w0Var;
    }
}
