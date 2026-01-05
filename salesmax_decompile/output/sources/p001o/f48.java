package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import p001o.m18;

/* loaded from: classes3.dex */
public abstract class f48 {
    /* renamed from: a */
    public static final y38 m26051a(o38 o38Var, l8i l8iVar, ux7 ux7Var, m18 m18Var, ek5 ek5Var) {
        sq8.m48649h(o38Var, FirebaseAnalytics.Param.METHOD);
        sq8.m48649h(l8iVar, ImagesContract.URL);
        sq8.m48649h(ux7Var, "headers");
        sq8.m48649h(m18Var, "body");
        sq8.m48649h(ek5Var, "trailingHeaders");
        return new bde(o38Var, l8iVar, ux7Var, m18Var, ek5Var);
    }

    /* renamed from: b */
    public static /* synthetic */ y38 m26052b(o38 o38Var, l8i l8iVar, ux7 ux7Var, m18 m18Var, ek5 ek5Var, int i, Object obj) {
        if ((i & 4) != 0) {
            ux7Var = ux7.f49593b.m52099a();
        }
        if ((i & 8) != 0) {
            m18Var = m18.C15196d.f34631a;
        }
        if ((i & 16) != 0) {
            ek5Var = ek5.f21784a.m25185a();
        }
        return m26051a(o38Var, l8iVar, ux7Var, m18Var, ek5Var);
    }

    /* renamed from: c */
    public static final z38 m26053c(y38 y38Var) {
        sq8.m48649h(y38Var, "<this>");
        if (y38Var instanceof e48) {
            e48 e48Var = (e48) y38Var;
            if (e48Var.m24295d()) {
                return e48Var.m24296e();
            }
            throw new IllegalStateException("This is an immutable HttpRequest that should not be converted to a builder".toString());
        }
        if (!(y38Var instanceof bde)) {
            throw new szb();
        }
        z38 z38Var = new z38();
        bde bdeVar = (bde) y38Var;
        z38Var.m58673j(bdeVar.getMethod());
        z38Var.m58668e().m59798e(bdeVar.getHeaders());
        a48.m16411g(z38Var, bdeVar.getUrl());
        z38Var.m58672i(bdeVar.getBody());
        z38Var.m58670g().m59798e(bdeVar.m18665a());
        return z38Var;
    }
}
