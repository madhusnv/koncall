package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public class o7d implements Serializable {

    /* renamed from: H */
    public boolean f37861H;

    /* renamed from: M */
    public boolean f37863M;

    /* renamed from: a */
    public boolean f37865a;

    /* renamed from: c */
    public boolean f37867c;

    /* renamed from: e */
    public boolean f37869e;

    /* renamed from: g */
    public boolean f37871g;

    /* renamed from: q */
    public boolean f37873q;

    /* renamed from: x */
    public boolean f37875x;

    /* renamed from: b */
    public int f37866b = 0;

    /* renamed from: d */
    public long f37868d = 0;

    /* renamed from: f */
    public String f37870f = "";

    /* renamed from: h */
    public boolean f37872h = false;

    /* renamed from: s */
    public int f37874s = 1;

    /* renamed from: y */
    public String f37876y = "";

    /* renamed from: Q */
    public String f37864Q = "";

    /* renamed from: L */
    public EnumC15723a f37862L = EnumC15723a.UNSPECIFIED;

    /* renamed from: o.o7d$a */
    public enum EnumC15723a {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY,
        UNSPECIFIED
    }

    /* renamed from: A */
    public o7d m41689A(String str) {
        str.getClass();
        this.f37875x = true;
        this.f37876y = str;
        return this;
    }

    /* renamed from: a */
    public o7d m41690a() {
        this.f37861H = false;
        this.f37862L = EnumC15723a.UNSPECIFIED;
        return this;
    }

    /* renamed from: b */
    public boolean m41691b(o7d o7dVar) {
        if (o7dVar == null) {
            return false;
        }
        if (this == o7dVar) {
            return true;
        }
        return this.f37866b == o7dVar.f37866b && this.f37868d == o7dVar.f37868d && this.f37870f.equals(o7dVar.f37870f) && this.f37872h == o7dVar.f37872h && this.f37874s == o7dVar.f37874s && this.f37876y.equals(o7dVar.f37876y) && this.f37862L == o7dVar.f37862L && this.f37864Q.equals(o7dVar.f37864Q) && m41703o() == o7dVar.m41703o();
    }

    /* renamed from: c */
    public int m41692c() {
        return this.f37866b;
    }

    /* renamed from: d */
    public EnumC15723a m41693d() {
        return this.f37862L;
    }

    /* renamed from: e */
    public String m41694e() {
        return this.f37870f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o7d) && m41691b((o7d) obj);
    }

    /* renamed from: f */
    public long m41695f() {
        return this.f37868d;
    }

    /* renamed from: g */
    public int m41696g() {
        return this.f37874s;
    }

    /* renamed from: h */
    public String m41697h() {
        return this.f37864Q;
    }

    public int hashCode() {
        return ((((((((((((((((2173 + m41692c()) * 53) + Long.valueOf(m41695f()).hashCode()) * 53) + m41694e().hashCode()) * 53) + (m41705q() ? 1231 : 1237)) * 53) + m41696g()) * 53) + m41698i().hashCode()) * 53) + m41693d().hashCode()) * 53) + m41697h().hashCode()) * 53) + (m41703o() ? 1231 : 1237);
    }

    /* renamed from: i */
    public String m41698i() {
        return this.f37876y;
    }

    /* renamed from: j */
    public boolean m41699j() {
        return this.f37861H;
    }

    /* renamed from: k */
    public boolean m41700k() {
        return this.f37869e;
    }

    /* renamed from: l */
    public boolean m41701l() {
        return this.f37871g;
    }

    /* renamed from: m */
    public boolean m41702m() {
        return this.f37873q;
    }

    /* renamed from: o */
    public boolean m41703o() {
        return this.f37863M;
    }

    /* renamed from: p */
    public boolean m41704p() {
        return this.f37875x;
    }

    /* renamed from: q */
    public boolean m41705q() {
        return this.f37872h;
    }

    /* renamed from: r */
    public o7d m41706r(int i) {
        this.f37865a = true;
        this.f37866b = i;
        return this;
    }

    /* renamed from: s */
    public o7d m41707s(EnumC15723a enumC15723a) {
        enumC15723a.getClass();
        this.f37861H = true;
        this.f37862L = enumC15723a;
        return this;
    }

    /* renamed from: t */
    public o7d m41708t(String str) {
        str.getClass();
        this.f37869e = true;
        this.f37870f = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.f37866b);
        sb.append(" National Number: ");
        sb.append(this.f37868d);
        if (m41701l() && m41705q()) {
            sb.append(" Leading Zero(s): true");
        }
        if (m41702m()) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.f37874s);
        }
        if (m41700k()) {
            sb.append(" Extension: ");
            sb.append(this.f37870f);
        }
        if (m41699j()) {
            sb.append(" Country Code Source: ");
            sb.append(this.f37862L);
        }
        if (m41703o()) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.f37864Q);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public o7d m41709u(boolean z) {
        this.f37871g = true;
        this.f37872h = z;
        return this;
    }

    /* renamed from: x */
    public o7d m41710x(long j) {
        this.f37867c = true;
        this.f37868d = j;
        return this;
    }

    /* renamed from: y */
    public o7d m41711y(int i) {
        this.f37873q = true;
        this.f37874s = i;
        return this;
    }

    /* renamed from: z */
    public o7d m41712z(String str) {
        str.getClass();
        this.f37863M = true;
        this.f37864Q = str;
        return this;
    }
}
