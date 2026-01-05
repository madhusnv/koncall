package x1;

import androidx.compose.ui.draw.AbstractC0258a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.c */
/* loaded from: classes.dex */
public final class C8253c extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: b */
    public static final C8253c f39448b;

    /* renamed from: c */
    public static final C8253c f39449c;

    /* renamed from: d */
    public static final C8253c f39450d;

    /* renamed from: a */
    public final /* synthetic */ int f39451a;

    static {
        int i10 = 3;
        f39448b = new C8253c(i10, 0);
        f39449c = new C8253c(i10, 1);
        f39450d = new C8253c(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8253c(int i10, int i11) {
        super(i10);
        this.f39451a = i11;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f39451a) {
            case 0:
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
                c3966o.m8607Y(-2126899193);
                long j6 = ((b2.h1) c3966o.m8618k(b2.i1.f3765a)).f3758a;
                boolean zM8613f = c3966o.m8613f(j6);
                Object objM8596M = c3966o.m8596M();
                if (zM8613f || objM8596M == C3961j.f20408a) {
                    objM8596M = new C8252b(0, j6);
                    c3966o.j0(objM8596M);
                }
                InterfaceC7879r interfaceC7879rMo14852e = interfaceC7879r.mo14852e(AbstractC0258a.m708b(C7876o.f37669a, (InterfaceC2139c) objM8596M));
                c3966o.m8623p(false);
                break;
            case 1:
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C3966o) interfaceC3962k).m8616i(interfaceC2141e) ? 4 : 2;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 19) != 18)) {
                    interfaceC2141e.invoke(c3966o2, Integer.valueOf(iIntValue & 14));
                } else {
                    c3966o2.m8601S();
                }
                break;
            default:
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C3966o) interfaceC3962k2).m8616i(interfaceC2141e2) ? 4 : 2;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k2;
                if (c3966o3.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    interfaceC2141e2.invoke(c3966o3, Integer.valueOf(iIntValue2 & 14));
                } else {
                    c3966o3.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
