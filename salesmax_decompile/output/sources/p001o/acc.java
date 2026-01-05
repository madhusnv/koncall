package p001o;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class acc {

    /* renamed from: b */
    public static final C12140a f14503b = new C12140a(null);

    /* renamed from: a */
    public final fqb f14504a = new fqb(new zh9[16], 0);

    /* renamed from: o.acc$a */
    public static final class C12140a {

        /* renamed from: o.acc$a$a */
        public static final class a implements Comparator {

            /* renamed from: a */
            public static final a f14505a = new a();

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(zh9 zh9Var, zh9 zh9Var2) {
                sq8.m48649h(zh9Var, "a");
                sq8.m48649h(zh9Var2, "b");
                int iM48651j = sq8.m48651j(zh9Var2.m59448z(), zh9Var.m59448z());
                return iM48651j != 0 ? iM48651j : sq8.m48651j(zh9Var.hashCode(), zh9Var2.hashCode());
            }
        }

        public C12140a() {
        }

        public /* synthetic */ C12140a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: a */
    public final void m16870a() {
        this.f14504a.m27365z(C12140a.a.f14505a);
        fqb fqbVar = this.f14504a;
        int iM27354o = fqbVar.m27354o();
        if (iM27354o > 0) {
            int i = iM27354o - 1;
            Object[] objArrM27353n = fqbVar.m27353n();
            do {
                zh9 zh9Var = (zh9) objArrM27353n[i];
                if (zh9Var.m59427T()) {
                    m16871b(zh9Var);
                }
                i--;
            } while (i >= 0);
        }
        this.f14504a.m27349i();
    }

    /* renamed from: b */
    public final void m16871b(zh9 zh9Var) {
        zh9Var.m59439p();
        int i = 0;
        zh9Var.e1(false);
        fqb fqbVarE0 = zh9Var.e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            do {
                m16871b((zh9) objArrM27353n[i]);
                i++;
            } while (i < iM27354o);
        }
    }

    /* renamed from: c */
    public final boolean m16872c() {
        return this.f14504a.m27357r();
    }

    /* renamed from: d */
    public final void m16873d(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        this.f14504a.m27344c(zh9Var);
        zh9Var.e1(true);
    }

    /* renamed from: e */
    public final void m16874e(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "rootNode");
        this.f14504a.m27349i();
        this.f14504a.m27344c(zh9Var);
        zh9Var.e1(true);
    }
}
