package bm;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g2.p9;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import qw.a0;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.b1;
import sq.g2;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bm.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0703n implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4437a;

    /* renamed from: b */
    public final /* synthetic */ long f4438b;

    /* renamed from: c */
    public final /* synthetic */ Object f4439c;

    public /* synthetic */ C0703n(int i10, long j6, Object obj) {
        this.f4437a = i10;
        this.f4439c = obj;
        this.f4438b = j6;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4437a) {
            case 0:
                w0 w0Var = (w0) this.f4439c;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((String) w0Var.getValue()).length() > 0) {
                        c3966o.m8607Y(-724670361);
                        Object objM8596M = c3966o.m8596M();
                        if (objM8596M == C3961j.f20408a) {
                            objM8596M = new C0696g(w0Var, 0);
                            c3966o.j0(objM8596M);
                        }
                        p9.m6246j((InterfaceC2137a) objM8596M, AbstractC0242a.m658l(C7876o.f37669a, 5, DefinitionKt.NO_Float_VALUE, 2), false, null, null, AbstractC6740i.m12902d(-1424523792, new C0694e(this.f4438b, 1, (byte) 0), c3966o), c3966o, 196662, 28);
                    } else {
                        c3966o.m8607Y(-999470854);
                    }
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                g2.m13163o(this.f4438b, (C6734c) this.f4439c, (InterfaceC3962k) obj, C3953b.m8496A(49));
                break;
            default:
                String str = (String) this.f4439c;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b1.m13113q(str, null, this.f4438b, null, null, 0, 0, 0L, null, null, c3966o2, 0, 1018);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C0703n(long j6, C6734c c6734c, int i10) {
        this.f4437a = 1;
        this.f4438b = j6;
        this.f4439c = c6734c;
    }
}
