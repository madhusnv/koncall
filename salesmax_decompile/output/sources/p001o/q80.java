package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public final class q80 extends md9 {

    /* renamed from: o.q80$a */
    public class C16320a extends md9.AbstractC15285b {
        public C16320a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(o80 o80Var) {
            return new n80(o80Var.m41722I().m58086E());
        }
    }

    /* renamed from: o.q80$b */
    public class C16321b extends md9.AbstractC15284a {
        public C16321b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public o80 mo20433a(p80 p80Var) {
            return (o80) o80.m41720K().m41726t(yq1.m58080j(ube.m51350c(p80Var.m43156G()))).m41727u(q80.this.m44952k()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p80 mo20434c(yq1 yq1Var) {
            return p80.m43155H(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(p80 p80Var) throws InvalidAlgorithmParameterException {
            sri.m48827a(p80Var.m43156G());
        }
    }

    public q80() {
        super(o80.class, new C16320a(p70.class));
    }

    /* renamed from: j */
    public static boolean m44950j() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static void m44951m(boolean z) {
        if (m44950j()) {
            che.m21279q(new q80(), z);
        }
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C16321b(p80.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m44952k() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public o80 mo20425g(yq1 yq1Var) {
        return o80.m41721L(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo20426i(o80 o80Var) throws GeneralSecurityException {
        sri.m48829c(o80Var.m41723J(), m44952k());
        sri.m48827a(o80Var.m41722I().size());
    }
}
