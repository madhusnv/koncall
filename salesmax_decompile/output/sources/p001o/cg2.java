package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class cg2 {

    /* renamed from: a */
    public static final C12657b f18052a = new C12657b(null);

    /* renamed from: b */
    public static final List f18053b = ch3.m21249n(C12656a.f18054c, C12658c.f18056c, C12659d.f18058c, C12660e.f18060c, C12661f.f18062c, C12662g.f18064c, C12663h.f18066c, C12664i.f18068c, C12665j.f18070c, C12666k.f18072c, C12668m.f18075c, C12669n.f18077c, C12670o.f18079c, C12671p.f18081c, C12672q.f18083c, C12673r.f18085c);

    /* renamed from: o.cg2$a */
    public static final class C12656a extends cg2 {

        /* renamed from: c */
        public static final C12656a f18054c = new C12656a();

        /* renamed from: d */
        public static final String f18055d = "ADMIN_NO_SRP_AUTH";

        public C12656a() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18055d;
        }

        public String toString() {
            return "AdminNoSrpAuth";
        }
    }

    /* renamed from: o.cg2$b */
    public static final class C12657b {
        public C12657b() {
        }

        public /* synthetic */ C12657b(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final cg2 m21139a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1737337862:
                    if (str.equals("PASSWORD_VERIFIER")) {
                        return C12666k.f18072c;
                    }
                    break;
                case -1409329619:
                    if (str.equals("PASSWORD_SRP")) {
                        return C12665j.f18070c;
                    }
                    break;
                case -1406772517:
                    if (str.equals("WEB_AUTHN")) {
                        return C12673r.f18085c;
                    }
                    break;
                case -1362602558:
                    if (str.equals("SMS_MFA")) {
                        return C12670o.f18079c;
                    }
                    break;
                case -1362600187:
                    if (str.equals("SMS_OTP")) {
                        return C12671p.f18081c;
                    }
                    break;
                case 161754570:
                    if (str.equals("SOFTWARE_TOKEN_MFA")) {
                        return C12672q.f18083c;
                    }
                    break;
                case 325396255:
                    if (str.equals("DEVICE_SRP_AUTH")) {
                        return C12660e.f18060c;
                    }
                    break;
                case 338106308:
                    if (str.equals("NEW_PASSWORD_REQUIRED")) {
                        return C12663h.f18066c;
                    }
                    break;
                case 359356710:
                    if (str.equals("MFA_SETUP")) {
                        return C12662g.f18064c;
                    }
                    break;
                case 613324744:
                    if (str.equals("EMAIL_OTP")) {
                        return C12661f.f18062c;
                    }
                    break;
                case 645737717:
                    if (str.equals("CUSTOM_CHALLENGE")) {
                        return C12658c.f18056c;
                    }
                    break;
                case 823370944:
                    if (str.equals("SELECT_CHALLENGE")) {
                        return C12668m.f18075c;
                    }
                    break;
                case 872896308:
                    if (str.equals("SELECT_MFA_TYPE")) {
                        return C12669n.f18077c;
                    }
                    break;
                case 1330737924:
                    if (str.equals("ADMIN_NO_SRP_AUTH")) {
                        return C12656a.f18054c;
                    }
                    break;
                case 1362077265:
                    if (str.equals("DEVICE_PASSWORD_VERIFIER")) {
                        return C12659d.f18058c;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        return C12664i.f18068c;
                    }
                    break;
            }
            return new C12667l(str);
        }
    }

    /* renamed from: o.cg2$c */
    public static final class C12658c extends cg2 {

        /* renamed from: c */
        public static final C12658c f18056c = new C12658c();

        /* renamed from: d */
        public static final String f18057d = "CUSTOM_CHALLENGE";

        public C12658c() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18057d;
        }

        public String toString() {
            return "CustomChallenge";
        }
    }

    /* renamed from: o.cg2$d */
    public static final class C12659d extends cg2 {

        /* renamed from: c */
        public static final C12659d f18058c = new C12659d();

        /* renamed from: d */
        public static final String f18059d = "DEVICE_PASSWORD_VERIFIER";

        public C12659d() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18059d;
        }

        public String toString() {
            return "DevicePasswordVerifier";
        }
    }

    /* renamed from: o.cg2$e */
    public static final class C12660e extends cg2 {

        /* renamed from: c */
        public static final C12660e f18060c = new C12660e();

        /* renamed from: d */
        public static final String f18061d = "DEVICE_SRP_AUTH";

        public C12660e() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18061d;
        }

        public String toString() {
            return "DeviceSrpAuth";
        }
    }

    /* renamed from: o.cg2$f */
    public static final class C12661f extends cg2 {

        /* renamed from: c */
        public static final C12661f f18062c = new C12661f();

        /* renamed from: d */
        public static final String f18063d = "EMAIL_OTP";

        public C12661f() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18063d;
        }

        public String toString() {
            return "EmailOtp";
        }
    }

    /* renamed from: o.cg2$g */
    public static final class C12662g extends cg2 {

        /* renamed from: c */
        public static final C12662g f18064c = new C12662g();

        /* renamed from: d */
        public static final String f18065d = "MFA_SETUP";

        public C12662g() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18065d;
        }

        public String toString() {
            return "MfaSetup";
        }
    }

    /* renamed from: o.cg2$h */
    public static final class C12663h extends cg2 {

        /* renamed from: c */
        public static final C12663h f18066c = new C12663h();

        /* renamed from: d */
        public static final String f18067d = "NEW_PASSWORD_REQUIRED";

        public C12663h() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18067d;
        }

        public String toString() {
            return "NewPasswordRequired";
        }
    }

    /* renamed from: o.cg2$i */
    public static final class C12664i extends cg2 {

        /* renamed from: c */
        public static final C12664i f18068c = new C12664i();

        /* renamed from: d */
        public static final String f18069d = "PASSWORD";

        public C12664i() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18069d;
        }

        public String toString() {
            return "Password";
        }
    }

    /* renamed from: o.cg2$j */
    public static final class C12665j extends cg2 {

        /* renamed from: c */
        public static final C12665j f18070c = new C12665j();

        /* renamed from: d */
        public static final String f18071d = "PASSWORD_SRP";

        public C12665j() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18071d;
        }

        public String toString() {
            return "PasswordSrp";
        }
    }

    /* renamed from: o.cg2$k */
    public static final class C12666k extends cg2 {

        /* renamed from: c */
        public static final C12666k f18072c = new C12666k();

        /* renamed from: d */
        public static final String f18073d = "PASSWORD_VERIFIER";

        public C12666k() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18073d;
        }

        public String toString() {
            return "PasswordVerifier";
        }
    }

    /* renamed from: o.cg2$l */
    public static final class C12667l extends cg2 {

        /* renamed from: c */
        public final String f18074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12667l(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f18074c = str;
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return this.f18074c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12667l) && sq8.m48644c(this.f18074c, ((C12667l) obj).f18074c);
        }

        public int hashCode() {
            return this.f18074c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo21138a() + ')';
        }
    }

    /* renamed from: o.cg2$m */
    public static final class C12668m extends cg2 {

        /* renamed from: c */
        public static final C12668m f18075c = new C12668m();

        /* renamed from: d */
        public static final String f18076d = "SELECT_CHALLENGE";

        public C12668m() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18076d;
        }

        public String toString() {
            return "SelectChallenge";
        }
    }

    /* renamed from: o.cg2$n */
    public static final class C12669n extends cg2 {

        /* renamed from: c */
        public static final C12669n f18077c = new C12669n();

        /* renamed from: d */
        public static final String f18078d = "SELECT_MFA_TYPE";

        public C12669n() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18078d;
        }

        public String toString() {
            return "SelectMfaType";
        }
    }

    /* renamed from: o.cg2$o */
    public static final class C12670o extends cg2 {

        /* renamed from: c */
        public static final C12670o f18079c = new C12670o();

        /* renamed from: d */
        public static final String f18080d = "SMS_MFA";

        public C12670o() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18080d;
        }

        public String toString() {
            return "SmsMfa";
        }
    }

    /* renamed from: o.cg2$p */
    public static final class C12671p extends cg2 {

        /* renamed from: c */
        public static final C12671p f18081c = new C12671p();

        /* renamed from: d */
        public static final String f18082d = "SMS_OTP";

        public C12671p() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18082d;
        }

        public String toString() {
            return "SmsOtp";
        }
    }

    /* renamed from: o.cg2$q */
    public static final class C12672q extends cg2 {

        /* renamed from: c */
        public static final C12672q f18083c = new C12672q();

        /* renamed from: d */
        public static final String f18084d = "SOFTWARE_TOKEN_MFA";

        public C12672q() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18084d;
        }

        public String toString() {
            return "SoftwareTokenMfa";
        }
    }

    /* renamed from: o.cg2$r */
    public static final class C12673r extends cg2 {

        /* renamed from: c */
        public static final C12673r f18085c = new C12673r();

        /* renamed from: d */
        public static final String f18086d = "WEB_AUTHN";

        public C12673r() {
            super(null);
        }

        @Override // p001o.cg2
        /* renamed from: a */
        public String mo21138a() {
            return f18086d;
        }

        public String toString() {
            return "WebAuthn";
        }
    }

    public cg2() {
    }

    public /* synthetic */ cg2(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo21138a();
}
