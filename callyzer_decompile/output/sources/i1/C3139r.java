package i1;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.AbstractC0240d;
import d4.C1580h;
import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import m1.InterfaceC4630l;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.r */
/* loaded from: classes.dex */
public final class C3139r extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ boolean f16976a;

    /* renamed from: b */
    public final /* synthetic */ String f16977b;

    /* renamed from: c */
    public final /* synthetic */ C1580h f16978c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f16979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3139r(boolean z6, String str, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        super(3);
        this.f16976a = z6;
        this.f16977b = str;
        this.f16978c = c1580h;
        this.f16979d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC4630l interfaceC4630l;
        ((Number) obj3).intValue();
        C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
        c3966o.m8607Y(-756081143);
        p0 p0Var = (p0) c3966o.m8618k(AbstractC0240d.f1925a);
        if (p0Var instanceof u0) {
            c3966o.m8607Y(617653824);
            c3966o.m8623p(false);
            interfaceC4630l = null;
        } else {
            c3966o.m8607Y(617786442);
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = i0.m0.m7389v(c3966o);
            }
            interfaceC4630l = (InterfaceC4630l) objM8596M;
            c3966o.m8623p(false);
        }
        InterfaceC4630l interfaceC4630l2 = interfaceC4630l;
        InterfaceC7879r interfaceC7879rM635c = AbstractC0237a.m635c(C7876o.f37669a, interfaceC4630l2, p0Var, this.f16976a, this.f16977b, this.f16978c, this.f16979d);
        c3966o.m8623p(false);
        return interfaceC7879rM635c;
    }
}
