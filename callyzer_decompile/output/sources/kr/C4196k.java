package kr;

import androidx.compose.foundation.AbstractC0237a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import i0.m0;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.k */
/* loaded from: classes3.dex */
public final class C4196k implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f21268a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21269b;

    /* renamed from: c */
    public final /* synthetic */ Object f21270c;

    public /* synthetic */ C4196k(boolean z6, Object obj, int i10) {
        this.f21268a = i10;
        this.f21269b = z6;
        this.f21270c = obj;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f21268a) {
            case 0:
                InterfaceC7879r composed = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                AbstractC4154l.m8923f(composed, "$this$composed");
                C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
                c3966o.m8607Y(1312612516);
                Object objM8596M = c3966o.m8596M();
                if (objM8596M == C3961j.f20408a) {
                    objM8596M = m0.m7389v(c3966o);
                }
                InterfaceC7879r interfaceC7879rM635c = AbstractC0237a.m635c(composed, (InterfaceC4630l) objM8596M, null, true, null, null, new C4195j(this.f21269b, (w0) this.f21270c, 0));
                c3966o.m8623p(false);
                return interfaceC7879rM635c;
            case 1:
                InterfaceC7879r composed2 = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                AbstractC4154l.m8923f(composed2, "$this$composed");
                C3966o c3966o2 = (C3966o) ((InterfaceC3962k) obj2);
                c3966o2.m8607Y(1312612516);
                Object objM8596M2 = c3966o2.m8596M();
                if (objM8596M2 == C3961j.f20408a) {
                    objM8596M2 = m0.m7389v(c3966o2);
                }
                InterfaceC7879r interfaceC7879rM635c2 = AbstractC0237a.m635c(composed2, (InterfaceC4630l) objM8596M2, null, true, null, null, new C4195j(this.f21269b, (InterfaceC2139c) this.f21270c, 1));
                c3966o2.m8623p(false);
                return interfaceC7879rM635c2;
            default:
                InterfaceC7879r composed3 = (InterfaceC7879r) obj;
                ((Number) obj3).intValue();
                AbstractC4154l.m8923f(composed3, "$this$composed");
                C3966o c3966o3 = (C3966o) ((InterfaceC3962k) obj2);
                c3966o3.m8607Y(1312612516);
                Object objM8596M3 = c3966o3.m8596M();
                if (objM8596M3 == C3961j.f20408a) {
                    objM8596M3 = m0.m7389v(c3966o3);
                }
                InterfaceC7879r interfaceC7879rM635c3 = AbstractC0237a.m635c(composed3, (InterfaceC4630l) objM8596M3, null, true, null, null, new C4195j(this.f21269b, (InterfaceC2137a) this.f21270c, 2));
                c3966o3.m8623p(false);
                return interfaceC7879rM635c3;
        }
    }
}
