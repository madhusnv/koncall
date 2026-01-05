package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class jp3 {

    /* renamed from: o.jp3$a */
    public static final class C14624a extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ k2e[] f30891a;

        /* renamed from: b */
        public final /* synthetic */ nl7 f30892b;

        /* renamed from: c */
        public final /* synthetic */ int f30893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14624a(k2e[] k2eVarArr, nl7 nl7Var, int i) {
            super(2);
            this.f30891a = k2eVarArr;
            this.f30892b = nl7Var;
            this.f30893c = i;
        }

        /* renamed from: a */
        public final void m34196a(un3 un3Var, int i) {
            k2e[] k2eVarArr = this.f30891a;
            jp3.m34192a((k2e[]) Arrays.copyOf(k2eVarArr, k2eVarArr.length), this.f30892b, un3Var, see.m48284a(this.f30893c | 1));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m34196a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final void m34192a(k2e[] k2eVarArr, nl7 nl7Var, un3 un3Var, int i) {
        sq8.m48649h(k2eVarArr, "values");
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        un3 un3VarMo27200b = un3Var.mo27200b(-1390796515);
        if (go3.m29189I()) {
            go3.m29200T(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        un3VarMo27200b.mo27213o(k2eVarArr);
        nl7Var.invoke(un3VarMo27200b, Integer.valueOf((i >> 3) & 14));
        un3VarMo27200b.mo27212n();
        if (go3.m29189I()) {
            go3.m29199S();
        }
        g6f g6fVarMo27202d = un3VarMo27200b.mo27202d();
        if (g6fVarMo27202d == null) {
            return;
        }
        g6fVarMo27202d.mo28099a(new C14624a(k2eVarArr, nl7Var, i));
    }

    /* renamed from: b */
    public static final g2e m34193b(pxf pxfVar, uk7 uk7Var) {
        sq8.m48649h(pxfVar, "policy");
        sq8.m48649h(uk7Var, "defaultFactory");
        return new x16(pxfVar, uk7Var);
    }

    /* renamed from: c */
    public static /* synthetic */ g2e m34194c(pxf pxfVar, uk7 uk7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            pxfVar = qxf.m45957h();
        }
        return m34193b(pxfVar, uk7Var);
    }

    /* renamed from: d */
    public static final g2e m34195d(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "defaultFactory");
        return new m5g(uk7Var);
    }
}
