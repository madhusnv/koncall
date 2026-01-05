package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URL;
import java.util.Map;
import p001o.w48;
import p001o.wx7;

/* loaded from: classes6.dex */
public final class ule {

    /* renamed from: a */
    public final w48 f49081a;

    /* renamed from: b */
    public final String f49082b;

    /* renamed from: c */
    public final wx7 f49083c;

    /* renamed from: d */
    public final xle f49084d;

    /* renamed from: e */
    public final w48 f49085e;

    /* renamed from: f */
    public final Map f49086f;

    /* renamed from: g */
    public wr1 f49087g;

    public ule(C17397a c17397a) {
        sq8.m48649h(c17397a, "builder");
        w48 w48VarM51755l = c17397a.m51755l();
        if (w48VarM51755l == null) {
            throw new IllegalStateException("url == null".toString());
        }
        this.f49081a = w48VarM51755l;
        this.f49082b = c17397a.m51753j();
        this.f49083c = c17397a.m51752i().m55340f();
        this.f49084d = c17397a.m51750g();
        this.f49085e = c17397a.m51751h();
        this.f49086f = isa.m32693t(c17397a.m51754k());
    }

    /* renamed from: a */
    public final xle m51730a() {
        return this.f49084d;
    }

    /* renamed from: b */
    public final wr1 m51731b() {
        wr1 wr1Var = this.f49087g;
        if (wr1Var != null) {
            return wr1Var;
        }
        wr1 wr1VarM54916a = wr1.f52536n.m54916a(this.f49083c);
        this.f49087g = wr1VarM54916a;
        return wr1VarM54916a;
    }

    /* renamed from: c */
    public final w48 m51732c() {
        return this.f49085e;
    }

    /* renamed from: d */
    public final Map m51733d() {
        return this.f49086f;
    }

    /* renamed from: e */
    public final String m51734e(String str) {
        sq8.m48649h(str, "name");
        return cgj.m21228f(this, str);
    }

    /* renamed from: f */
    public final wx7 m51735f() {
        return this.f49083c;
    }

    /* renamed from: g */
    public final boolean m51736g() {
        return this.f49081a.m53878i();
    }

    /* renamed from: h */
    public final String m51737h() {
        return this.f49082b;
    }

    /* renamed from: i */
    public final C17397a m51738i() {
        return new C17397a(this);
    }

    /* renamed from: j */
    public final Object m51739j(Class cls) {
        sq8.m48649h(cls, "type");
        return m51740k(hb9.m30152c(cls));
    }

    /* renamed from: k */
    public final Object m51740k(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "type");
        return hb9.m30150a(ob9Var).cast(this.f49086f.get(ob9Var));
    }

    /* renamed from: l */
    public final w48 m51741l() {
        return this.f49081a;
    }

    public String toString() {
        return cgj.m21237o(this);
    }

    /* renamed from: o.ule$a */
    public static class C17397a {

        /* renamed from: a */
        public w48 f49088a;

        /* renamed from: b */
        public String f49089b;

        /* renamed from: c */
        public wx7.C17997a f49090c;

        /* renamed from: d */
        public xle f49091d;

        /* renamed from: e */
        public w48 f49092e;

        /* renamed from: f */
        public Map f49093f;

        public C17397a() {
            this.f49093f = isa.m32681h();
            this.f49089b = "GET";
            this.f49090c = new wx7.C17997a();
        }

        /* renamed from: e */
        public static /* synthetic */ C17397a m51742e(C17397a c17397a, xle xleVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                xleVar = ggj.m28632l();
            }
            return c17397a.m51748d(xleVar);
        }

        /* renamed from: A */
        public C17397a m51743A(URL url) {
            sq8.m48649h(url, ImagesContract.URL);
            w48.C17775b c17775b = w48.f51415j;
            String string = url.toString();
            sq8.m48648g(string, "toString(...)");
            return m51744B(c17775b.m53926c(string));
        }

        /* renamed from: B */
        public C17397a m51744B(w48 w48Var) {
            sq8.m48649h(w48Var, ImagesContract.URL);
            this.f49088a = w48Var;
            return this;
        }

        /* renamed from: a */
        public C17397a m51745a(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            return cgj.m21224b(this, str, str2);
        }

        /* renamed from: b */
        public ule m51746b() {
            return new ule(this);
        }

        /* renamed from: c */
        public final C17397a m51747c() {
            return m51742e(this, null, 1, null);
        }

        /* renamed from: d */
        public C17397a m51748d(xle xleVar) {
            return cgj.m21225c(this, xleVar);
        }

        /* renamed from: f */
        public C17397a m51749f() {
            return cgj.m21226d(this);
        }

        /* renamed from: g */
        public final xle m51750g() {
            return this.f49091d;
        }

        /* renamed from: h */
        public final w48 m51751h() {
            return this.f49092e;
        }

        /* renamed from: i */
        public final wx7.C17997a m51752i() {
            return this.f49090c;
        }

        /* renamed from: j */
        public final String m51753j() {
            return this.f49089b;
        }

        /* renamed from: k */
        public final Map m51754k() {
            return this.f49093f;
        }

        /* renamed from: l */
        public final w48 m51755l() {
            return this.f49088a;
        }

        /* renamed from: m */
        public C17397a m51756m() {
            return cgj.m21227e(this);
        }

        /* renamed from: n */
        public C17397a m51757n(String str, String str2) {
            sq8.m48649h(str, "name");
            sq8.m48649h(str2, "value");
            return cgj.m21229g(this, str, str2);
        }

        /* renamed from: o */
        public C17397a m51758o(wx7 wx7Var) {
            sq8.m48649h(wx7Var, "headers");
            return cgj.m21230h(this, wx7Var);
        }

        /* renamed from: p */
        public C17397a m51759p(String str, xle xleVar) {
            sq8.m48649h(str, FirebaseAnalytics.Param.METHOD);
            return cgj.m21231i(this, str, xleVar);
        }

        /* renamed from: q */
        public C17397a m51760q(xle xleVar) {
            sq8.m48649h(xleVar, "body");
            return cgj.m21232j(this, xleVar);
        }

        /* renamed from: r */
        public C17397a m51761r(xle xleVar) {
            sq8.m48649h(xleVar, "body");
            return cgj.m21233k(this, xleVar);
        }

        /* renamed from: s */
        public C17397a m51762s(xle xleVar) {
            sq8.m48649h(xleVar, "body");
            return cgj.m21234l(this, xleVar);
        }

        /* renamed from: t */
        public C17397a m51763t(String str) {
            sq8.m48649h(str, "name");
            return cgj.m21235m(this, str);
        }

        /* renamed from: u */
        public final void m51764u(xle xleVar) {
            this.f49091d = xleVar;
        }

        /* renamed from: v */
        public final void m51765v(wx7.C17997a c17997a) {
            sq8.m48649h(c17997a, "<set-?>");
            this.f49090c = c17997a;
        }

        /* renamed from: w */
        public final void m51766w(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f49089b = str;
        }

        /* renamed from: x */
        public final void m51767x(Map map) {
            sq8.m48649h(map, "<set-?>");
            this.f49093f = map;
        }

        /* renamed from: y */
        public C17397a m51768y(Class cls, Object obj) {
            sq8.m48649h(cls, "type");
            return cgj.m21236n(this, hb9.m30152c(cls), obj);
        }

        /* renamed from: z */
        public C17397a m51769z(String str) {
            sq8.m48649h(str, ImagesContract.URL);
            return m51744B(w48.f51415j.m53926c(cgj.m21223a(str)));
        }

        public C17397a(ule uleVar) {
            sq8.m48649h(uleVar, "request");
            this.f49093f = isa.m32681h();
            this.f49088a = uleVar.m51741l();
            this.f49089b = uleVar.m51737h();
            this.f49091d = uleVar.m51730a();
            this.f49093f = uleVar.m51733d().isEmpty() ? isa.m32681h() : isa.m32696w(uleVar.m51733d());
            this.f49090c = uleVar.m51735f().m55331o();
            this.f49092e = uleVar.m51732c();
        }
    }
}
