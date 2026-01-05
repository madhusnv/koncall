package p001o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public final class y70 extends md9 {

    /* renamed from: o.y70$a */
    public class C18345a extends md9.AbstractC15285b {
        public C18345a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p70 mo20431a(w70 w70Var) {
            return new r76((sh8) new c80().m38756d(w70Var.m54023J(), sh8.class), (hna) new yy7().m38756d(w70Var.m54024K(), hna.class), w70Var.m54024K().m55392L().m18039I());
        }
    }

    /* renamed from: o.y70$b */
    public class C18346b extends md9.AbstractC15284a {
        public C18346b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public w70 mo20433a(x70 x70Var) {
            a80 a80Var = (a80) new c80().mo20423e().mo20433a(x70Var.m55758G());
            return (w70) w70.m54021M().m54029t(a80Var).m54030u((wy7) new yy7().mo20423e().mo20433a(x70Var.m55759H())).m54031v(y70.this.m57326j()).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public x70 mo20434c(yq1 yq1Var) {
            return x70.m55757I(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(x70 x70Var) throws InvalidAlgorithmParameterException {
            new c80().mo20423e().mo20435d(x70Var.m55758G());
            new yy7().mo20423e().mo20435d(x70Var.m55759H());
            sri.m48827a(x70Var.m55758G().m18269H());
        }
    }

    public y70() {
        super(w70.class, new C18345a(p70.class));
    }

    /* renamed from: l */
    public static void m57325l(boolean z) {
        che.m21279q(new y70(), z);
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C18346b(x70.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: j */
    public int m57326j() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public w70 mo20425g(yq1 yq1Var) {
        return w70.m54022N(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20426i(w70 w70Var) throws GeneralSecurityException {
        sri.m48829c(w70Var.m54025L(), m57326j());
        new c80().mo20426i(w70Var.m54023J());
        new yy7().mo20426i(w70Var.m54024K());
    }
}
