package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public class c80 extends md9 {

    /* renamed from: o.c80$a */
    public class C12587a extends md9.AbstractC15285b {
        public C12587a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public sh8 mo20431a(a80 a80Var) {
            return new z70(a80Var.m16630K().m58086E(), a80Var.m16631L().m22492H());
        }
    }

    /* renamed from: o.c80$b */
    public class C12588b extends md9.AbstractC15284a {
        public C12588b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a80 mo20433a(b80 b80Var) {
            return (a80) a80.m16628N().m16638u(b80Var.m18270I()).m16637t(yq1.m58080j(ube.m51350c(b80Var.m18269H()))).m16639v(c80.this.m20427k()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b80 mo20434c(yq1 yq1Var) {
            return b80.m18268J(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(b80 b80Var) throws GeneralSecurityException {
            sri.m48827a(b80Var.m18269H());
            c80.this.m20430n(b80Var.m18270I());
        }
    }

    public c80() {
        super(a80.class, new C12587a(sh8.class));
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C12588b(b80.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m20427k() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a80 mo20425g(yq1 yq1Var) {
        return a80.m16629O(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20426i(a80 a80Var) throws GeneralSecurityException {
        sri.m48829c(a80Var.m16632M(), m20427k());
        sri.m48827a(a80Var.m16630K().size());
        m20430n(a80Var.m16631L());
    }

    /* renamed from: n */
    public final void m20430n(d80 d80Var) throws GeneralSecurityException {
        if (d80Var.m22492H() < 12 || d80Var.m22492H() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
