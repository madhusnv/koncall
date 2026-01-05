package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public final class u70 extends md9 {

    /* renamed from: o.u70$a */
    public class C17310a extends md9.AbstractC15285b {
        public C17310a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public hna mo20431a(s70 s70Var) {
            return new qhd(new ohd(s70Var.m47925J().m58086E()), s70Var.m47926K().m52394H());
        }
    }

    /* renamed from: o.u70$b */
    public class C17311b extends md9.AbstractC15284a {
        public C17311b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public s70 mo20433a(t70 t70Var) {
            return (s70) s70.m47923M().m47933v(0).m47931t(yq1.m58080j(ube.m51350c(t70Var.m49499G()))).m47932u(t70Var.m49500H()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t70 mo20434c(yq1 yq1Var) {
            return t70.m49498I(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(t70 t70Var) throws GeneralSecurityException {
            u70.m51062p(t70Var.m49500H());
            u70.m51063q(t70Var.m49499G());
        }
    }

    public u70() {
        super(s70.class, new C17310a(hna.class));
    }

    /* renamed from: n */
    public static void m51061n(boolean z) {
        che.m21279q(new u70(), z);
    }

    /* renamed from: p */
    public static void m51062p(v70 v70Var) throws GeneralSecurityException {
        if (v70Var.m52394H() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (v70Var.m52394H() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: q */
    public static void m51063q(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C17311b(t70.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: l */
    public int m51064l() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public s70 mo20425g(yq1 yq1Var) {
        return s70.m47924N(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo20426i(s70 s70Var) throws GeneralSecurityException {
        sri.m48829c(s70Var.m47927L(), m51064l());
        m51063q(s70Var.m47925J().size());
        m51062p(s70Var.m47926K());
    }
}
