package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public final class h80 extends md9 {

    /* renamed from: o.h80$a */
    public class C13893a extends md9.AbstractC15285b {
        public C13893a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(f80 f80Var) {
            return new e80(f80Var.m26271J().m58086E(), f80Var.m26272K().m31706H());
        }
    }

    /* renamed from: o.h80$b */
    public class C13894b extends md9.AbstractC15284a {
        public C13894b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f80 mo20433a(g80 g80Var) {
            return (f80) f80.m26269M().m26277t(yq1.m58080j(ube.m51350c(g80Var.m28160G()))).m26278u(g80Var.m28161H()).m26279v(h80.this.m29962j()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g80 mo20434c(yq1 yq1Var) {
            return g80.m28159I(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(g80 g80Var) throws GeneralSecurityException {
            sri.m48827a(g80Var.m28160G());
            if (g80Var.m28161H().m31706H() != 12 && g80Var.m28161H().m31706H() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public h80() {
        super(f80.class, new C13893a(p70.class));
    }

    /* renamed from: l */
    public static void m29961l(boolean z) {
        che.m21279q(new h80(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C13894b(g80.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: j */
    public int m29962j() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public f80 mo20425g(yq1 yq1Var) {
        return f80.m26270N(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20426i(f80 f80Var) throws GeneralSecurityException {
        sri.m48829c(f80Var.m26273L(), m29962j());
        sri.m48827a(f80Var.m26271J().size());
        if (f80Var.m26272K().m31706H() != 12 && f80Var.m26272K().m31706H() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
