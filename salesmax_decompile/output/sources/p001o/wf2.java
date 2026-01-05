package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public class wf2 extends md9 {

    /* renamed from: o.wf2$a */
    public class C17834a extends md9.AbstractC15285b {
        public C17834a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(uf2 uf2Var) {
            return new sf2(uf2Var.m51510I().m58086E());
        }
    }

    /* renamed from: o.wf2$b */
    public class C17835b extends md9.AbstractC15284a {
        public C17835b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public uf2 mo20433a(vf2 vf2Var) {
            return (uf2) uf2.m51508K().m51515u(wf2.this.m54288j()).m51514t(yq1.m58080j(ube.m51350c(32))).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public vf2 mo20434c(yq1 yq1Var) {
            return vf2.m52695G(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(vf2 vf2Var) {
        }
    }

    public wf2() {
        super(uf2.class, new C17834a(p70.class));
    }

    /* renamed from: l */
    public static void m54287l(boolean z) {
        che.m21279q(new wf2(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C17835b(vf2.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: j */
    public int m54288j() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public uf2 mo20425g(yq1 yq1Var) {
        return uf2.m51509L(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20426i(uf2 uf2Var) throws GeneralSecurityException {
        sri.m48829c(uf2Var.m51511J(), m54288j());
        if (uf2Var.m51510I().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
