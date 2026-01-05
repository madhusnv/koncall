package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.io.Closeable;
import java.util.List;
import p001o.wx7;

/* loaded from: classes6.dex */
public final class zqe implements Closeable {

    /* renamed from: H */
    public final dl6 f57519H;

    /* renamed from: L */
    public uk7 f57520L;

    /* renamed from: M */
    public wr1 f57521M;

    /* renamed from: Q */
    public final boolean f57522Q;

    /* renamed from: X */
    public final boolean f57523X;

    /* renamed from: a */
    public final ule f57524a;

    /* renamed from: b */
    public final a2e f57525b;

    /* renamed from: c */
    public final String f57526c;

    /* renamed from: d */
    public final int f57527d;

    /* renamed from: e */
    public final ww7 f57528e;

    /* renamed from: f */
    public final wx7 f57529f;

    /* renamed from: g */
    public final cre f57530g;

    /* renamed from: h */
    public final zqe f57531h;

    /* renamed from: q */
    public final zqe f57532q;

    /* renamed from: s */
    public final zqe f57533s;

    /* renamed from: x */
    public final long f57534x;

    /* renamed from: y */
    public final long f57535y;

    public zqe(ule uleVar, a2e a2eVar, String str, int i, ww7 ww7Var, wx7 wx7Var, cre creVar, zqe zqeVar, zqe zqeVar2, zqe zqeVar3, long j, long j2, dl6 dl6Var, uk7 uk7Var) {
        sq8.m48649h(uleVar, "request");
        sq8.m48649h(a2eVar, "protocol");
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(wx7Var, "headers");
        sq8.m48649h(creVar, "body");
        sq8.m48649h(uk7Var, "trailersFn");
        this.f57524a = uleVar;
        this.f57525b = a2eVar;
        this.f57526c = str;
        this.f57527d = i;
        this.f57528e = ww7Var;
        this.f57529f = wx7Var;
        this.f57530g = creVar;
        this.f57531h = zqeVar;
        this.f57532q = zqeVar2;
        this.f57533s = zqeVar3;
        this.f57534x = j;
        this.f57535y = j2;
        this.f57519H = dl6Var;
        this.f57520L = uk7Var;
        this.f57522Q = egj.m25001t(this);
        this.f57523X = egj.m25000s(this);
    }

    /* renamed from: t */
    public static /* synthetic */ String m59725t(zqe zqeVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return zqeVar.m59743s(str, str2);
    }

    /* renamed from: C */
    public final String m59726C() {
        return this.f57526c;
    }

    /* renamed from: D */
    public final zqe m59727D() {
        return this.f57531h;
    }

    /* renamed from: H */
    public final C18696a m59728H() {
        return egj.m24993l(this);
    }

    /* renamed from: J */
    public final zqe m59729J() {
        return this.f57533s;
    }

    /* renamed from: K */
    public final a2e m59730K() {
        return this.f57525b;
    }

    /* renamed from: O */
    public final long m59731O() {
        return this.f57535y;
    }

    /* renamed from: Q */
    public final ule m59732Q() {
        return this.f57524a;
    }

    /* renamed from: S */
    public final long m59733S() {
        return this.f57534x;
    }

    /* renamed from: T */
    public final void m59734T(wr1 wr1Var) {
        this.f57521M = wr1Var;
    }

    public final boolean U0() {
        return this.f57522Q;
    }

    /* renamed from: c */
    public final cre m59735c() {
        return this.f57530g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        egj.m24986e(this);
    }

    /* renamed from: d */
    public final wr1 m59736d() {
        return egj.m24999r(this);
    }

    /* renamed from: f */
    public final zqe m59737f() {
        return this.f57532q;
    }

    /* renamed from: g */
    public final List m59738g() {
        String str;
        wx7 wx7Var = this.f57529f;
        int i = this.f57527d;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return ch3.m21246k();
            }
            str = "Proxy-Authenticate";
        }
        return k38.m34938a(wx7Var, str);
    }

    /* renamed from: h */
    public final int m59739h() {
        return this.f57527d;
    }

    /* renamed from: k */
    public final dl6 m59740k() {
        return this.f57519H;
    }

    /* renamed from: o */
    public final wr1 m59741o() {
        return this.f57521M;
    }

    /* renamed from: r */
    public final ww7 m59742r() {
        return this.f57528e;
    }

    /* renamed from: s */
    public final String m59743s(String str, String str2) {
        sq8.m48649h(str, "name");
        return egj.m24988g(this, str, str2);
    }

    public String toString() {
        return egj.m24997p(this);
    }

    /* renamed from: u */
    public final wx7 m59744u() {
        return this.f57529f;
    }

    /* renamed from: o.zqe$a */
    public static class C18696a {

        /* renamed from: a */
        public ule f57536a;

        /* renamed from: b */
        public a2e f57537b;

        /* renamed from: c */
        public int f57538c;

        /* renamed from: d */
        public String f57539d;

        /* renamed from: e */
        public ww7 f57540e;

        /* renamed from: f */
        public wx7.C17997a f57541f;

        /* renamed from: g */
        public cre f57542g;

        /* renamed from: h */
        public zqe f57543h;

        /* renamed from: i */
        public zqe f57544i;

        /* renamed from: j */
        public zqe f57545j;

        /* renamed from: k */
        public long f57546k;

        /* renamed from: l */
        public long f57547l;

        /* renamed from: m */
        public dl6 f57548m;

        /* renamed from: n */
        public uk7 f57549n;

        /* renamed from: o.zqe$a$a */
        public static final class a extends kf9 implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ dl6 f57550a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(dl6 dl6Var) {
                super(0);
                this.f57550a = dl6Var;
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wx7 invoke() {
                return this.f57550a.m23407v();
            }
        }

        /* renamed from: o.zqe$a$b */
        public static final class b extends kf9 implements uk7 {

            /* renamed from: a */
            public static final b f57551a = new b();

            public b() {
                super(0);
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wx7 invoke() {
                return wx7.f52834b.m55345b(new String[0]);
            }
        }

        public C18696a() {
            this.f57538c = -1;
            this.f57542g = ggj.m28633m();
            this.f57549n = b.f57551a;
            this.f57541f = new wx7.C17997a();
        }

        /* renamed from: A */
        public final void m59745A(ule uleVar) {
            this.f57536a = uleVar;
        }

        /* renamed from: B */
        public final void m59746B(uk7 uk7Var) {
            sq8.m48649h(uk7Var, "<set-?>");
            this.f57549n = uk7Var;
        }

        /* renamed from: C */
        public C18696a m59747C(uk7 uk7Var) {
            sq8.m48649h(uk7Var, "trailersFn");
            return egj.m24998q(this, uk7Var);
        }

        /* renamed from: a */
        public C18696a m59748a(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            return egj.m24983b(this, str, str2);
        }

        /* renamed from: b */
        public C18696a m59749b(cre creVar) {
            sq8.m48649h(creVar, "body");
            return egj.m24984c(this, creVar);
        }

        /* renamed from: c */
        public zqe m59750c() {
            int i = this.f57538c;
            if (!(i >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.f57538c).toString());
            }
            ule uleVar = this.f57536a;
            if (uleVar == null) {
                throw new IllegalStateException("request == null".toString());
            }
            a2e a2eVar = this.f57537b;
            if (a2eVar == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f57539d;
            if (str != null) {
                return new zqe(uleVar, a2eVar, str, i, this.f57540e, this.f57541f.m55340f(), this.f57542g, this.f57543h, this.f57544i, this.f57545j, this.f57546k, this.f57547l, this.f57548m, this.f57549n);
            }
            throw new IllegalStateException("message == null".toString());
        }

        /* renamed from: d */
        public C18696a m59751d(zqe zqeVar) {
            return egj.m24985d(this, zqeVar);
        }

        /* renamed from: e */
        public C18696a m59752e(int i) {
            return egj.m24987f(this, i);
        }

        /* renamed from: f */
        public final int m59753f() {
            return this.f57538c;
        }

        /* renamed from: g */
        public final wx7.C17997a m59754g() {
            return this.f57541f;
        }

        /* renamed from: h */
        public C18696a m59755h(ww7 ww7Var) {
            this.f57540e = ww7Var;
            return this;
        }

        /* renamed from: i */
        public C18696a m59756i(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            return egj.m24989h(this, str, str2);
        }

        /* renamed from: j */
        public C18696a m59757j(wx7 wx7Var) {
            sq8.m48649h(wx7Var, "headers");
            return egj.m24990i(this, wx7Var);
        }

        /* renamed from: k */
        public final void m59758k(dl6 dl6Var) {
            sq8.m48649h(dl6Var, "exchange");
            this.f57548m = dl6Var;
            this.f57549n = new a(dl6Var);
        }

        /* renamed from: l */
        public C18696a m59759l(String str) {
            sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            return egj.m24991j(this, str);
        }

        /* renamed from: m */
        public C18696a m59760m(zqe zqeVar) {
            return egj.m24992k(this, zqeVar);
        }

        /* renamed from: n */
        public C18696a m59761n(zqe zqeVar) {
            return egj.m24994m(this, zqeVar);
        }

        /* renamed from: o */
        public C18696a m59762o(a2e a2eVar) {
            sq8.m48649h(a2eVar, "protocol");
            return egj.m24995n(this, a2eVar);
        }

        /* renamed from: p */
        public C18696a m59763p(long j) {
            this.f57547l = j;
            return this;
        }

        /* renamed from: q */
        public C18696a m59764q(ule uleVar) {
            sq8.m48649h(uleVar, "request");
            return egj.m24996o(this, uleVar);
        }

        /* renamed from: r */
        public C18696a m59765r(long j) {
            this.f57546k = j;
            return this;
        }

        /* renamed from: s */
        public final void m59766s(cre creVar) {
            sq8.m48649h(creVar, "<set-?>");
            this.f57542g = creVar;
        }

        /* renamed from: t */
        public final void m59767t(zqe zqeVar) {
            this.f57544i = zqeVar;
        }

        /* renamed from: u */
        public final void m59768u(int i) {
            this.f57538c = i;
        }

        /* renamed from: v */
        public final void m59769v(wx7.C17997a c17997a) {
            sq8.m48649h(c17997a, "<set-?>");
            this.f57541f = c17997a;
        }

        /* renamed from: w */
        public final void m59770w(String str) {
            this.f57539d = str;
        }

        /* renamed from: x */
        public final void m59771x(zqe zqeVar) {
            this.f57543h = zqeVar;
        }

        /* renamed from: y */
        public final void m59772y(zqe zqeVar) {
            this.f57545j = zqeVar;
        }

        /* renamed from: z */
        public final void m59773z(a2e a2eVar) {
            this.f57537b = a2eVar;
        }

        public C18696a(zqe zqeVar) {
            sq8.m48649h(zqeVar, "response");
            this.f57538c = -1;
            this.f57542g = ggj.m28633m();
            this.f57549n = b.f57551a;
            this.f57536a = zqeVar.m59732Q();
            this.f57537b = zqeVar.m59730K();
            this.f57538c = zqeVar.m59739h();
            this.f57539d = zqeVar.m59726C();
            this.f57540e = zqeVar.m59742r();
            this.f57541f = zqeVar.m59744u().m55331o();
            this.f57542g = zqeVar.m59735c();
            this.f57543h = zqeVar.m59727D();
            this.f57544i = zqeVar.m59737f();
            this.f57545j = zqeVar.m59729J();
            this.f57546k = zqeVar.m59733S();
            this.f57547l = zqeVar.m59731O();
            this.f57548m = zqeVar.m59740k();
            this.f57549n = zqeVar.f57520L;
        }
    }
}
