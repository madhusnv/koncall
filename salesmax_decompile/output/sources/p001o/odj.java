package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public class odj extends md9 {

    /* renamed from: o.odj$a */
    public class C15765a extends md9.AbstractC15285b {
        public C15765a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(mdj mdjVar) {
            return new ldj(mdjVar.m38800I().m58086E());
        }
    }

    /* renamed from: o.odj$b */
    public class C15766b extends md9.AbstractC15284a {
        public C15766b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public mdj mo20433a(ndj ndjVar) {
            return (mdj) mdj.m38798K().m38805u(odj.this.m42089j()).m38804t(yq1.m58080j(ube.m51350c(32))).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public ndj mo20434c(yq1 yq1Var) {
            return ndj.m40395G(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(ndj ndjVar) {
        }
    }

    public odj() {
        super(mdj.class, new C15765a(p70.class));
    }

    /* renamed from: l */
    public static void m42088l(boolean z) {
        che.m21279q(new odj(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C15766b(ndj.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: j */
    public int m42089j() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public mdj mo20425g(yq1 yq1Var) {
        return mdj.m38799L(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20426i(mdj mdjVar) throws GeneralSecurityException {
        sri.m48829c(mdjVar.m38801J(), m42089j());
        if (mdjVar.m38800I().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
