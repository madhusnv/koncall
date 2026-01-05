package bp;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import og.g1;
import qw.a0;
import t3.j0;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bp.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0719c implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4538a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f4539b;

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f4538a) {
            case 0:
                num.getClass();
                g1.m10661a(this.f4539b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(C7876o.f37669a, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 12, 7);
                    j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
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
                    C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
                        AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    AbstractC1452a.m4576w(0, this.f4539b, c3966o, true);
                } else {
                    c3966o.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
