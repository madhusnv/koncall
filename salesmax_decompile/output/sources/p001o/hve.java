package p001o;

import androidx.navigation.AbstractC2347n;
import java.util.List;
import java.util.Map;
import p001o.p9g;

/* loaded from: classes2.dex */
public abstract class hve {

    /* renamed from: o.hve$a */
    public static final class C14108a extends kf9 implements ql7 {

        /* renamed from: a */
        public final /* synthetic */ Map f27686a;

        /* renamed from: b */
        public final /* synthetic */ cve f27687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14108a(Map map, cve cveVar) {
            super(3);
            this.f27686a = map;
            this.f27687b = cveVar;
        }

        /* renamed from: a */
        public final void m31225a(int i, String str, AbstractC2347n abstractC2347n) {
            sq8.m48649h(str, "argName");
            sq8.m48649h(abstractC2347n, "navType");
            Object obj = this.f27686a.get(str);
            sq8.m48646e(obj);
            this.f27687b.m21878c(i, str, abstractC2347n, (List) obj);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m31225a(((Number) obj).intValue(), (String) obj2, (AbstractC2347n) obj3);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final void m31221a(dc9 dc9Var, Map map, ql7 ql7Var) {
        int iMo16762d = dc9Var.getDescriptor().mo16762d();
        for (int i = 0; i < iMo16762d; i++) {
            String strMo16763e = dc9Var.getDescriptor().mo16763e(i);
            AbstractC2347n abstractC2347n = (AbstractC2347n) map.get(strMo16763e);
            if (abstractC2347n == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strMo16763e + ']').toString());
            }
            ql7Var.invoke(Integer.valueOf(i), strMo16763e, abstractC2347n);
        }
    }

    /* renamed from: b */
    public static final int m31222b(dc9 dc9Var) {
        sq8.m48649h(dc9Var, "<this>");
        int iHashCode = dc9Var.getDescriptor().mo16766h().hashCode();
        int iMo16762d = dc9Var.getDescriptor().mo16762d();
        for (int i = 0; i < iMo16762d; i++) {
            iHashCode = (iHashCode * 31) + dc9Var.getDescriptor().mo16763e(i).hashCode();
        }
        return iHashCode;
    }

    /* renamed from: c */
    public static final String m31223c(Object obj, Map map) {
        sq8.m48649h(obj, "route");
        sq8.m48649h(map, "typeMap");
        dc9 dc9VarM51545a = uff.m51545a(kge.m35689b(obj.getClass()));
        Map mapM25646J = new eve(dc9VarM51545a, map).m25646J(obj);
        cve cveVar = new cve(dc9VarM51545a);
        m31221a(dc9VarM51545a, map, new C14108a(mapM25646J, cveVar));
        return cveVar.m21879d();
    }

    /* renamed from: d */
    public static final boolean m31224d(uef uefVar) {
        sq8.m48649h(uefVar, "<this>");
        return sq8.m48644c(uefVar.getKind(), p9g.C16037a.f39681a) && uefVar.isInline() && uefVar.mo16762d() == 1;
    }
}
