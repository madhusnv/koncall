package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class sz0 {

    /* renamed from: a */
    public static final C16937c f46127a = new C16937c(null);

    /* renamed from: b */
    public static final List f46128b = ch3.m21249n(C16935a.f46129c, C16936b.f46131c, C16938d.f46133c, C16939e.f46135c, C16940f.f46137c, C16941g.f46139c, C16942h.f46141c, C16943i.f46143c);

    /* renamed from: o.sz0$a */
    public static final class C16935a extends sz0 {

        /* renamed from: c */
        public static final C16935a f46129c = new C16935a();

        /* renamed from: d */
        public static final String f46130d = "ADMIN_NO_SRP_AUTH";

        public C16935a() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46130d;
        }

        public String toString() {
            return "AdminNoSrpAuth";
        }
    }

    /* renamed from: o.sz0$b */
    public static final class C16936b extends sz0 {

        /* renamed from: c */
        public static final C16936b f46131c = new C16936b();

        /* renamed from: d */
        public static final String f46132d = "ADMIN_USER_PASSWORD_AUTH";

        public C16936b() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46132d;
        }

        public String toString() {
            return "AdminUserPasswordAuth";
        }
    }

    /* renamed from: o.sz0$c */
    public static final class C16937c {
        public C16937c() {
        }

        public /* synthetic */ C16937c(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.sz0$d */
    public static final class C16938d extends sz0 {

        /* renamed from: c */
        public static final C16938d f46133c = new C16938d();

        /* renamed from: d */
        public static final String f46134d = "CUSTOM_AUTH";

        public C16938d() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46134d;
        }

        public String toString() {
            return "CustomAuth";
        }
    }

    /* renamed from: o.sz0$e */
    public static final class C16939e extends sz0 {

        /* renamed from: c */
        public static final C16939e f46135c = new C16939e();

        /* renamed from: d */
        public static final String f46136d = "REFRESH_TOKEN";

        public C16939e() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46136d;
        }

        public String toString() {
            return "RefreshToken";
        }
    }

    /* renamed from: o.sz0$f */
    public static final class C16940f extends sz0 {

        /* renamed from: c */
        public static final C16940f f46137c = new C16940f();

        /* renamed from: d */
        public static final String f46138d = "REFRESH_TOKEN_AUTH";

        public C16940f() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46138d;
        }

        public String toString() {
            return "RefreshTokenAuth";
        }
    }

    /* renamed from: o.sz0$g */
    public static final class C16941g extends sz0 {

        /* renamed from: c */
        public static final C16941g f46139c = new C16941g();

        /* renamed from: d */
        public static final String f46140d = "USER_AUTH";

        public C16941g() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46140d;
        }

        public String toString() {
            return "UserAuth";
        }
    }

    /* renamed from: o.sz0$h */
    public static final class C16942h extends sz0 {

        /* renamed from: c */
        public static final C16942h f46141c = new C16942h();

        /* renamed from: d */
        public static final String f46142d = "USER_PASSWORD_AUTH";

        public C16942h() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46142d;
        }

        public String toString() {
            return "UserPasswordAuth";
        }
    }

    /* renamed from: o.sz0$i */
    public static final class C16943i extends sz0 {

        /* renamed from: c */
        public static final C16943i f46143c = new C16943i();

        /* renamed from: d */
        public static final String f46144d = "USER_SRP_AUTH";

        public C16943i() {
            super(null);
        }

        @Override // p001o.sz0
        /* renamed from: a */
        public String mo49086a() {
            return f46144d;
        }

        public String toString() {
            return "UserSrpAuth";
        }
    }

    public sz0() {
    }

    public /* synthetic */ sz0(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo49086a();
}
