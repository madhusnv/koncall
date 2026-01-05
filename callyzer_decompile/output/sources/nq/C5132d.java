package nq;

import androidx.compose.foundation.lazy.InterfaceC0246a;
import aw.C0471k;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import java.util.List;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import mm.C4791b;
import pq.C5996a;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nq.d */
/* loaded from: classes3.dex */
public final class C5132d extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ List f25132a;

    /* renamed from: b */
    public final /* synthetic */ int f25133b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f25134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5132d(int i10, InterfaceC2139c interfaceC2139c, List list) {
        super(4);
        this.f25132a = list;
        this.f25133b = i10;
        this.f25134c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c3966o.m8598P(i10 & 1, (i10 & 147) != 146)) {
            C5996a c5996a = (C5996a) this.f25132a.get(iIntValue);
            c3966o.m8607Y(-1401291527);
            C4791b c4791b = c5996a.f29313b;
            boolean z6 = c4791b.f23832a == this.f25133b;
            InterfaceC2139c interfaceC2139c = this.f25134c;
            boolean zM8614g = c3966o.m8614g(interfaceC2139c) | c3966o.m8616i(c5996a);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C0471k(5, interfaceC2139c, c5996a);
                c3966o.j0(objM8596M);
            }
            AbstractC5133e.m10053a(c4791b, z6, (InterfaceC2137a) objM8596M, c3966o, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        return a0.f30746a;
    }
}
