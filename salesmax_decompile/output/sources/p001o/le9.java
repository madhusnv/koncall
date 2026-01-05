package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public class le9 extends md9 {

    /* renamed from: o.le9$a */
    public class C15064a extends md9.AbstractC15285b {
        public C15064a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(je9 je9Var) {
            String strM35545I = je9Var.m33637I().m35545I();
            return new ie9(je9Var.m33637I().m35544H(), he9.m30303a(strM35545I).mo28512b(strM35545I));
        }
    }

    /* renamed from: o.le9$b */
    public class C15065b extends md9.AbstractC15284a {
        public C15065b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public je9 mo20433a(ke9 ke9Var) {
            return (je9) je9.m33635K().m33641t(ke9Var).m33642u(le9.this.m37029j()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public ke9 mo20434c(yq1 yq1Var) {
            return ke9.m35543J(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(ke9 ke9Var) {
        }
    }

    public le9() {
        super(je9.class, new C15064a(p70.class));
    }

    /* renamed from: l */
    public static void m37028l(boolean z) {
        che.m21279q(new le9(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C15065b(ke9.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.REMOTE;
    }

    /* renamed from: j */
    public int m37029j() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public je9 mo20425g(yq1 yq1Var) {
        return je9.m33636L(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20426i(je9 je9Var) throws GeneralSecurityException {
        sri.m48829c(je9Var.m33638J(), m37029j());
    }
}
