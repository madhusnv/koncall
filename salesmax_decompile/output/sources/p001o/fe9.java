package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public class fe9 extends md9 {

    /* renamed from: o.fe9$a */
    public class C13409a extends md9.AbstractC15285b {
        public C13409a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(de9 de9Var) {
            String strM24847H = de9Var.m22853I().m24847H();
            return he9.m30303a(strM24847H).mo28512b(strM24847H);
        }
    }

    /* renamed from: o.fe9$b */
    public class C13410b extends md9.AbstractC15284a {
        public C13410b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public de9 mo20433a(ee9 ee9Var) {
            return (de9) de9.m22851K().m22857t(ee9Var).m22858u(fe9.this.m26506j()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public ee9 mo20434c(yq1 yq1Var) {
            return ee9.m24846I(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(ee9 ee9Var) {
        }
    }

    public fe9() {
        super(de9.class, new C13409a(p70.class));
    }

    /* renamed from: l */
    public static void m26505l(boolean z) {
        che.m21279q(new fe9(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C13410b(ee9.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.REMOTE;
    }

    /* renamed from: j */
    public int m26506j() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public de9 mo20425g(yq1 yq1Var) {
        return de9.m22852L(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20426i(de9 de9Var) throws GeneralSecurityException {
        sri.m48829c(de9Var.m22854J(), m26506j());
    }
}
