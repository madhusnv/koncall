package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.zqe;

/* loaded from: classes6.dex */
public abstract class egj {
    /* renamed from: a */
    public static final void m24982a(String str, zqe zqeVar) {
        if (zqeVar != null) {
            if (!(zqeVar.m59727D() == null)) {
                throw new IllegalArgumentException((str + ".networkResponse != null").toString());
            }
            if (!(zqeVar.m59737f() == null)) {
                throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
            }
            if (zqeVar.m59729J() == null) {
                return;
            }
            throw new IllegalArgumentException((str + ".priorResponse != null").toString());
        }
    }

    /* renamed from: b */
    public static final zqe.C18696a m24983b(zqe.C18696a c18696a, String str, String str2) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        c18696a.m59754g().m55335a(str, str2);
        return c18696a;
    }

    /* renamed from: c */
    public static final zqe.C18696a m24984c(zqe.C18696a c18696a, cre creVar) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(creVar, "body");
        c18696a.m59766s(creVar);
        return c18696a;
    }

    /* renamed from: d */
    public static final zqe.C18696a m24985d(zqe.C18696a c18696a, zqe zqeVar) {
        sq8.m48649h(c18696a, "<this>");
        m24982a("cacheResponse", zqeVar);
        c18696a.m59767t(zqeVar);
        return c18696a;
    }

    /* renamed from: e */
    public static final void m24986e(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        zqeVar.m59735c().close();
    }

    /* renamed from: f */
    public static final zqe.C18696a m24987f(zqe.C18696a c18696a, int i) {
        sq8.m48649h(c18696a, "<this>");
        c18696a.m59768u(i);
        return c18696a;
    }

    /* renamed from: g */
    public static final String m24988g(zqe zqeVar, String str, String str2) {
        sq8.m48649h(zqeVar, "<this>");
        sq8.m48649h(str, "name");
        String strM55327d = zqeVar.m59744u().m55327d(str);
        return strM55327d == null ? str2 : strM55327d;
    }

    /* renamed from: h */
    public static final zqe.C18696a m24989h(zqe.C18696a c18696a, String str, String str2) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "value");
        c18696a.m59754g().m55343i(str, str2);
        return c18696a;
    }

    /* renamed from: i */
    public static final zqe.C18696a m24990i(zqe.C18696a c18696a, wx7 wx7Var) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(wx7Var, "headers");
        c18696a.m59769v(wx7Var.m55331o());
        return c18696a;
    }

    /* renamed from: j */
    public static final zqe.C18696a m24991j(zqe.C18696a c18696a, String str) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        c18696a.m59770w(str);
        return c18696a;
    }

    /* renamed from: k */
    public static final zqe.C18696a m24992k(zqe.C18696a c18696a, zqe zqeVar) {
        sq8.m48649h(c18696a, "<this>");
        m24982a("networkResponse", zqeVar);
        c18696a.m59771x(zqeVar);
        return c18696a;
    }

    /* renamed from: l */
    public static final zqe.C18696a m24993l(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        return new zqe.C18696a(zqeVar);
    }

    /* renamed from: m */
    public static final zqe.C18696a m24994m(zqe.C18696a c18696a, zqe zqeVar) {
        sq8.m48649h(c18696a, "<this>");
        c18696a.m59772y(zqeVar);
        return c18696a;
    }

    /* renamed from: n */
    public static final zqe.C18696a m24995n(zqe.C18696a c18696a, a2e a2eVar) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(a2eVar, "protocol");
        c18696a.m59773z(a2eVar);
        return c18696a;
    }

    /* renamed from: o */
    public static final zqe.C18696a m24996o(zqe.C18696a c18696a, ule uleVar) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(uleVar, "request");
        c18696a.m59745A(uleVar);
        return c18696a;
    }

    /* renamed from: p */
    public static final String m24997p(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        return "Response{protocol=" + zqeVar.m59730K() + ", code=" + zqeVar.m59739h() + ", message=" + zqeVar.m59726C() + ", url=" + zqeVar.m59732Q().m51741l() + '}';
    }

    /* renamed from: q */
    public static final zqe.C18696a m24998q(zqe.C18696a c18696a, uk7 uk7Var) {
        sq8.m48649h(c18696a, "<this>");
        sq8.m48649h(uk7Var, "trailersFn");
        c18696a.m59746B(uk7Var);
        return c18696a;
    }

    /* renamed from: r */
    public static final wr1 m24999r(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        wr1 wr1VarM59741o = zqeVar.m59741o();
        if (wr1VarM59741o != null) {
            return wr1VarM59741o;
        }
        wr1 wr1VarM54916a = wr1.f52536n.m54916a(zqeVar.m59744u());
        zqeVar.m59734T(wr1VarM54916a);
        return wr1VarM54916a;
    }

    /* renamed from: s */
    public static final boolean m25000s(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        int iM59739h = zqeVar.m59739h();
        if (iM59739h != 307 && iM59739h != 308) {
            switch (iM59739h) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public static final boolean m25001t(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        int iM59739h = zqeVar.m59739h();
        return 200 <= iM59739h && iM59739h < 300;
    }

    /* renamed from: u */
    public static final zqe m25002u(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        return zqeVar.m59728H().m59749b(new w4i(zqeVar.m59735c().mo21618h(), zqeVar.m59735c().mo21617g())).m59750c();
    }
}
