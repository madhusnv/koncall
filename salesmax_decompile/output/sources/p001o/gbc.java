package p001o;

/* loaded from: classes2.dex */
public abstract class gbc {

    /* renamed from: o.gbc$a */
    public static final class C13666a extends dbc {

        /* renamed from: d */
        public final /* synthetic */ xk7 f24874d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13666a(boolean z, xk7 xk7Var) {
            super(z);
            this.f24874d = xk7Var;
        }

        @Override // p001o.dbc
        /* renamed from: d */
        public void mo940d() {
            this.f24874d.invoke(this);
        }
    }

    /* renamed from: a */
    public static final dbc m28312a(ebc ebcVar, xca xcaVar, boolean z, xk7 xk7Var) {
        sq8.m48649h(ebcVar, "<this>");
        sq8.m48649h(xk7Var, "onBackPressed");
        C13666a c13666a = new C13666a(z, xk7Var);
        if (xcaVar != null) {
            ebcVar.m24711h(xcaVar, c13666a);
        } else {
            ebcVar.m24712i(c13666a);
        }
        return c13666a;
    }

    /* renamed from: b */
    public static /* synthetic */ dbc m28313b(ebc ebcVar, xca xcaVar, boolean z, xk7 xk7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            xcaVar = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return m28312a(ebcVar, xcaVar, z, xk7Var);
    }
}
