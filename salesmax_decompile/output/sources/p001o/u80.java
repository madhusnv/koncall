package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import p001o.hd9;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public final class u80 extends md9 {

    /* renamed from: o.u80$a */
    public class C17332a extends md9.AbstractC15285b {
        public C17332a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public yp5 mo20431a(s80 s80Var) {
            return new r80(s80Var.m47956I().m58086E());
        }
    }

    /* renamed from: o.u80$b */
    public class C17333b extends md9.AbstractC15284a {
        public C17333b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public s80 mo20433a(t80 t80Var) {
            return (s80) s80.m47954K().m47960t(yq1.m58080j(ube.m51350c(t80Var.m49553H()))).m47961u(u80.this.m51190l()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t80 mo20434c(yq1 yq1Var) {
            return t80.m49552J(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(t80 t80Var) throws InvalidAlgorithmParameterException {
            if (t80Var.m49553H() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + t80Var.m49553H() + ". Valid keys must have 64 bytes.");
        }
    }

    public u80() {
        super(s80.class, new C17332a(yp5.class));
    }

    /* renamed from: j */
    public static final hd9 m51187j() {
        return m51188k(64, hd9.EnumC13917b.TINK);
    }

    /* renamed from: k */
    public static hd9 m51188k(int i, hd9.EnumC13917b enumC13917b) {
        return hd9.m30253a(new u80().mo20422c(), ((t80) t80.m49551I().m49555t(i).m53060i()).mo44940a(), enumC13917b);
    }

    /* renamed from: n */
    public static void m51189n(boolean z) {
        che.m21279q(new u80(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C17333b(t80.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: l */
    public int m51190l() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public s80 mo20425g(yq1 yq1Var) {
        return s80.m47955L(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo20426i(s80 s80Var) throws GeneralSecurityException {
        sri.m48829c(s80Var.m47957J(), m51190l());
        if (s80Var.m47956I().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + s80Var.m47956I().size() + ". Valid keys must have 64 bytes.");
    }
}
