package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p001o.hd9;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public final class m80 extends md9 {

    /* renamed from: o.m80$a */
    public class C15244a extends md9.AbstractC15285b {
        public C15244a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(k80 k80Var) {
            return new j80(k80Var.m35152I().m58086E());
        }
    }

    /* renamed from: o.m80$b */
    public class C15245b extends md9.AbstractC15284a {
        public C15245b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public k80 mo20433a(l80 l80Var) {
            return (k80) k80.m35150K().m35156t(yq1.m58080j(ube.m51350c(l80Var.m36729H()))).m35157u(m80.this.m38517l()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public l80 mo20434c(yq1 yq1Var) {
            return l80.m36728J(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(l80 l80Var) throws InvalidAlgorithmParameterException {
            sri.m48827a(l80Var.m36729H());
        }
    }

    public m80() {
        super(k80.class, new C15244a(p70.class));
    }

    /* renamed from: j */
    public static final hd9 m38514j() {
        return m38515k(32, hd9.EnumC13917b.TINK);
    }

    /* renamed from: k */
    public static hd9 m38515k(int i, hd9.EnumC13917b enumC13917b) {
        return hd9.m30253a(new m80().mo20422c(), ((l80) l80.m36727I().m36731t(i).m53060i()).mo44940a(), enumC13917b);
    }

    /* renamed from: n */
    public static void m38516n(boolean z) {
        che.m21279q(new m80(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C15245b(l80.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: l */
    public int m38517l() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public k80 mo20425g(yq1 yq1Var) {
        return k80.m35151L(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo20426i(k80 k80Var) throws GeneralSecurityException {
        sri.m48829c(k80Var.m35153J(), m38517l());
        sri.m48827a(k80Var.m35152I().size());
    }
}
