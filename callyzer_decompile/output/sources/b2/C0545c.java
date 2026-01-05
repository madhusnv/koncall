package b2;

import androidx.compose.foundation.layout.AbstractC0245d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import hz.AbstractC3063b;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import o1.AbstractC5244c;
import o1.C5243b;
import o1.m1;
import o1.n1;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.c */
/* loaded from: classes.dex */
public final class C0545c extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ long f3700a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3701b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f3702c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC0557o f3703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0545c(long j6, boolean z6, InterfaceC7879r interfaceC7879r, InterfaceC0557o interfaceC0557o) {
        super(2);
        this.f3700a = j6;
        this.f3701b = z6;
        this.f3702c = interfaceC7879r;
        this.f3703d = interfaceC0557o;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Number) obj2).intValue();
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j6 = this.f3700a;
            k2.s0 s0Var = C3961j.f20408a;
            InterfaceC0557o interfaceC0557o = this.f3703d;
            boolean z6 = this.f3701b;
            if (j6 != 9205357640488583168L) {
                c3966o.m8607Y(-837626688);
                C5243b c5243b = z6 ? AbstractC5244c.f25707b : AbstractC5244c.f25706a;
                InterfaceC7879r interfaceC7879rM676m = AbstractC0245d.m676m(this.f3702c, Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 12);
                n1 n1VarM10357a = m1.m10357a(c5243b, C7864c.f37651k, c3966o, 0);
                int i10 = c3966o.f20462P;
                k2.i1 i1VarM8620m = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM676m);
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
                boolean zM8616i = c3966o.m8616i(interfaceC0557o);
                Object objM8596M = c3966o.m8596M();
                if (zM8616i || objM8596M == s0Var) {
                    objM8596M = new C0544b(interfaceC0557o, 0);
                    c3966o.j0(objM8596M);
                }
                AbstractC3063b.m7289c(C7876o.f37669a, (InterfaceC2137a) objM8596M, z6, c3966o, 6);
                c3966o.m8623p(true);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-836697680);
                boolean zM8616i2 = c3966o.m8616i(interfaceC0557o);
                Object objM8596M2 = c3966o.m8596M();
                if (zM8616i2 || objM8596M2 == s0Var) {
                    objM8596M2 = new C0544b(interfaceC0557o, 1);
                    c3966o.j0(objM8596M2);
                }
                AbstractC3063b.m7289c(this.f3702c, (InterfaceC2137a) objM8596M2, z6, c3966o, 0);
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        return qw.a0.f30746a;
    }
}
