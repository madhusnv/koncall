package p001o;

import com.amazonaws.regions.ServiceAbbreviations;
import p001o.z81;

/* loaded from: classes3.dex */
public abstract class sgd {
    /* renamed from: c */
    public static final Object m48323c(final cxe cxeVar, wq7 wq7Var, v81 v81Var, final xk7 xk7Var, n64 n64Var) {
        jl6 jl6Var = new jl6();
        jl6Var.mo34002p(e7f.f21127a.m24497d(), "GetObject");
        jl6Var.mo34002p(s38.f44646a.m47571g(), wq7Var);
        return ngd.m40545a(new vq7().mo16700b(jl6Var, wq7Var), jl6Var, cxeVar.getConfig().m21983h(), new q86(cxeVar.getConfig()), v81Var, new xk7() { // from class: o.qgd
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return sgd.m48325e(cxeVar, xk7Var, (z81.C18572a) obj);
            }
        }, n64Var);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m48324d(cxe cxeVar, wq7 wq7Var, v81 v81Var, xk7 xk7Var, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            v81Var = cc5.m20837c();
        }
        return m48323c(cxeVar, wq7Var, v81Var, xk7Var, n64Var);
    }

    /* renamed from: e */
    public static final y3i m48325e(cxe cxeVar, xk7 xk7Var, z81.C18572a c18572a) {
        sq8.m48649h(c18572a, "$this$presignRequest");
        if (c18572a.m58910k() == null) {
            c18572a.m58924y(ServiceAbbreviations.S3);
        }
        if (c18572a.m58909j() == null) {
            c18572a.m58923x(cxeVar.getConfig().m21994s());
        }
        c18572a.m58900D(false);
        c18572a.m58921v(false);
        xk7Var.invoke(c18572a);
        return y3i.f54824a;
    }

    /* renamed from: f */
    public static final Object m48326f(cxe cxeVar, wq7 wq7Var, final long j, n64 n64Var) {
        return m48324d(cxeVar, wq7Var, null, new xk7() { // from class: o.ogd
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return sgd.m48327g(j, (z81.C18572a) obj);
            }
        }, n64Var, 2, null);
    }

    /* renamed from: g */
    public static final y3i m48327g(long j, z81.C18572a c18572a) {
        sq8.m48649h(c18572a, "$this$presignGetObject");
        c18572a.m58918s(k16.m34883h(j));
        return y3i.f54824a;
    }
}
