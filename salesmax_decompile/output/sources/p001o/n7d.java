package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public class n7d implements Serializable {

    /* renamed from: H */
    public boolean f36524H;

    /* renamed from: M */
    public boolean f36526M;

    /* renamed from: a */
    public boolean f36528a;

    /* renamed from: c */
    public boolean f36530c;

    /* renamed from: e */
    public boolean f36532e;

    /* renamed from: g */
    public boolean f36534g;

    /* renamed from: q */
    public boolean f36536q;

    /* renamed from: x */
    public boolean f36538x;

    /* renamed from: b */
    public int f36529b = 0;

    /* renamed from: d */
    public long f36531d = 0;

    /* renamed from: f */
    public String f36533f = "";

    /* renamed from: h */
    public boolean f36535h = false;

    /* renamed from: s */
    public int f36537s = 1;

    /* renamed from: y */
    public String f36539y = "";

    /* renamed from: Q */
    public String f36527Q = "";

    /* renamed from: L */
    public EnumC15525a f36525L = EnumC15525a.UNSPECIFIED;

    /* renamed from: o.n7d$a */
    public enum EnumC15525a {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY,
        UNSPECIFIED
    }

    /* renamed from: A */
    public n7d m40206A(String str) {
        str.getClass();
        this.f36538x = true;
        this.f36539y = str;
        return this;
    }

    /* renamed from: a */
    public n7d m40207a() {
        this.f36524H = false;
        this.f36525L = EnumC15525a.UNSPECIFIED;
        return this;
    }

    /* renamed from: b */
    public boolean m40208b(n7d n7dVar) {
        if (n7dVar == null) {
            return false;
        }
        if (this == n7dVar) {
            return true;
        }
        return this.f36529b == n7dVar.f36529b && this.f36531d == n7dVar.f36531d && this.f36533f.equals(n7dVar.f36533f) && this.f36535h == n7dVar.f36535h && this.f36537s == n7dVar.f36537s && this.f36539y.equals(n7dVar.f36539y) && this.f36525L == n7dVar.f36525L && this.f36527Q.equals(n7dVar.f36527Q) && m40220o() == n7dVar.m40220o();
    }

    /* renamed from: c */
    public int m40209c() {
        return this.f36529b;
    }

    /* renamed from: d */
    public EnumC15525a m40210d() {
        return this.f36525L;
    }

    /* renamed from: e */
    public String m40211e() {
        return this.f36533f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n7d) && m40208b((n7d) obj);
    }

    /* renamed from: f */
    public long m40212f() {
        return this.f36531d;
    }

    /* renamed from: g */
    public int m40213g() {
        return this.f36537s;
    }

    /* renamed from: h */
    public String m40214h() {
        return this.f36527Q;
    }

    public int hashCode() {
        return ((((((((((((((((2173 + m40209c()) * 53) + Long.valueOf(m40212f()).hashCode()) * 53) + m40211e().hashCode()) * 53) + (m40222q() ? 1231 : 1237)) * 53) + m40213g()) * 53) + m40215i().hashCode()) * 53) + m40210d().hashCode()) * 53) + m40214h().hashCode()) * 53) + (m40220o() ? 1231 : 1237);
    }

    /* renamed from: i */
    public String m40215i() {
        return this.f36539y;
    }

    /* renamed from: j */
    public boolean m40216j() {
        return this.f36524H;
    }

    /* renamed from: k */
    public boolean m40217k() {
        return this.f36532e;
    }

    /* renamed from: l */
    public boolean m40218l() {
        return this.f36534g;
    }

    /* renamed from: m */
    public boolean m40219m() {
        return this.f36536q;
    }

    /* renamed from: o */
    public boolean m40220o() {
        return this.f36526M;
    }

    /* renamed from: p */
    public boolean m40221p() {
        return this.f36538x;
    }

    /* renamed from: q */
    public boolean m40222q() {
        return this.f36535h;
    }

    /* renamed from: r */
    public n7d m40223r(int i) {
        this.f36528a = true;
        this.f36529b = i;
        return this;
    }

    /* renamed from: s */
    public n7d m40224s(EnumC15525a enumC15525a) {
        enumC15525a.getClass();
        this.f36524H = true;
        this.f36525L = enumC15525a;
        return this;
    }

    /* renamed from: t */
    public n7d m40225t(String str) {
        str.getClass();
        this.f36532e = true;
        this.f36533f = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.f36529b);
        sb.append(" National Number: ");
        sb.append(this.f36531d);
        if (m40218l() && m40222q()) {
            sb.append(" Leading Zero(s): true");
        }
        if (m40219m()) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.f36537s);
        }
        if (m40217k()) {
            sb.append(" Extension: ");
            sb.append(this.f36533f);
        }
        if (m40216j()) {
            sb.append(" Country Code Source: ");
            sb.append(this.f36525L);
        }
        if (m40220o()) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.f36527Q);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public n7d m40226u(boolean z) {
        this.f36534g = true;
        this.f36535h = z;
        return this;
    }

    /* renamed from: x */
    public n7d m40227x(long j) {
        this.f36530c = true;
        this.f36531d = j;
        return this;
    }

    /* renamed from: y */
    public n7d m40228y(int i) {
        this.f36536q = true;
        this.f36537s = i;
        return this;
    }

    /* renamed from: z */
    public n7d m40229z(String str) {
        str.getClass();
        this.f36526M = true;
        this.f36527Q = str;
        return this;
    }
}
