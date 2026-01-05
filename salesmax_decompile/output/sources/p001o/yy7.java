package p001o;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import p001o.md9;
import p001o.nc9;

/* loaded from: classes4.dex */
public final class yy7 extends md9 {

    /* renamed from: o.yy7$a */
    public class C18521a extends md9.AbstractC15285b {
        public C18521a(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15285b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public hna mo20431a(wy7 wy7Var) throws GeneralSecurityException {
            ex7 ex7VarM18038H = wy7Var.m55392L().m18038H();
            SecretKeySpec secretKeySpec = new SecretKeySpec(wy7Var.m55391K().m58086E(), "HMAC");
            int iM18039I = wy7Var.m55392L().m18039I();
            int i = C18523c.f56276a[ex7VarM18038H.ordinal()];
            if (i == 1) {
                return new qhd(new phd("HMACSHA1", secretKeySpec), iM18039I);
            }
            if (i == 2) {
                return new qhd(new phd("HMACSHA256", secretKeySpec), iM18039I);
            }
            if (i == 3) {
                return new qhd(new phd("HMACSHA512", secretKeySpec), iM18039I);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: o.yy7$b */
    public class C18522b extends md9.AbstractC15284a {
        public C18522b(Class cls) {
            super(cls);
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public wy7 mo20433a(xy7 xy7Var) {
            return (wy7) wy7.m55389N().m55399v(yy7.this.m58487k()).m55398u(xy7Var.m56963I()).m55397t(yq1.m58080j(ube.m51350c(xy7Var.m56962H()))).m53060i();
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public xy7 mo20434c(yq1 yq1Var) {
            return xy7.m56961J(yq1Var, pp6.m44004b());
        }

        @Override // p001o.md9.AbstractC15284a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo20435d(xy7 xy7Var) throws GeneralSecurityException {
            if (xy7Var.m56962H() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            yy7.m58486o(xy7Var.m56963I());
        }
    }

    /* renamed from: o.yy7$c */
    public static /* synthetic */ class C18523c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56276a;

        static {
            int[] iArr = new int[ex7.values().length];
            f56276a = iArr;
            try {
                iArr[ex7.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56276a[ex7.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56276a[ex7.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public yy7() {
        super(wy7.class, new C18521a(hna.class));
    }

    /* renamed from: m */
    public static void m58485m(boolean z) {
        che.m21279q(new yy7(), z);
    }

    /* renamed from: o */
    public static void m58486o(az7 az7Var) throws GeneralSecurityException {
        if (az7Var.m18039I() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = C18523c.f56276a[az7Var.m18038H().ordinal()];
        if (i == 1) {
            if (az7Var.m18039I() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (az7Var.m18039I() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (az7Var.m18039I() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // p001o.md9
    /* renamed from: c */
    public String mo20422c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // p001o.md9
    /* renamed from: e */
    public md9.AbstractC15284a mo20423e() {
        return new C18522b(xy7.class);
    }

    @Override // p001o.md9
    /* renamed from: f */
    public nc9.EnumC15545c mo20424f() {
        return nc9.EnumC15545c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m58487k() {
        return 0;
    }

    @Override // p001o.md9
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public wy7 mo20425g(yq1 yq1Var) {
        return wy7.m55390O(yq1Var, pp6.m44004b());
    }

    @Override // p001o.md9
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo20426i(wy7 wy7Var) throws GeneralSecurityException {
        sri.m48829c(wy7Var.m55393M(), m58487k());
        if (wy7Var.m55391K().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m58486o(wy7Var.m55392L());
    }
}
