package p001o;

import p001o.aff;
import p001o.tej;

/* loaded from: classes3.dex */
public abstract class qej {
    /* renamed from: e */
    public static final boolean m45348e(h7f h7fVar) {
        return sq8.m48644c(h7fVar.m29947b(), aff.C12160g.f14619a) || sq8.m48644c(h7fVar.m29947b(), aff.C12162i.f14621a);
    }

    /* renamed from: f */
    public static final void m45349f(tej tejVar, String str, aa aaVar) {
        if (aaVar != null) {
            tejVar.mo35895c(aaVar.m16708b(), aaVar.m16707a());
        }
        tej.C17073a.m49797b(tejVar, str, null, 2, null);
    }

    /* renamed from: g */
    public static final void m45350g(tej tejVar, String str, aa aaVar, xk7 xk7Var) {
        m45349f(tejVar, str, aaVar);
        xk7Var.invoke(tejVar);
        tej.C17073a.m49796a(tejVar, str, null, 2, null);
    }

    /* renamed from: h */
    public static /* synthetic */ void m45351h(tej tejVar, String str, aa aaVar, xk7 xk7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            aaVar = null;
        }
        if ((i & 4) != 0) {
            xk7Var = new xk7() { // from class: o.pej
                @Override // p001o.xk7
                public final Object invoke(Object obj2) {
                    return qej.m45352i((tej) obj2);
                }
            };
        }
        m45350g(tejVar, str, aaVar, xk7Var);
    }

    /* renamed from: i */
    public static final y3i m45352i(tej tejVar) {
        sq8.m48649h(tejVar, "<this>");
        return y3i.f54824a;
    }
}
