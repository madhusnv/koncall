package p001o;

import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class gh9 {

    /* renamed from: a */
    public final List f25166a;

    /* renamed from: b */
    public final ama f25167b;

    /* renamed from: c */
    public final String f25168c;

    /* renamed from: d */
    public final long f25169d;

    /* renamed from: e */
    public final EnumC13715a f25170e;

    /* renamed from: f */
    public final long f25171f;

    /* renamed from: g */
    public final String f25172g;

    /* renamed from: h */
    public final List f25173h;

    /* renamed from: i */
    public final rg0 f25174i;

    /* renamed from: j */
    public final int f25175j;

    /* renamed from: k */
    public final int f25176k;

    /* renamed from: l */
    public final int f25177l;

    /* renamed from: m */
    public final float f25178m;

    /* renamed from: n */
    public final float f25179n;

    /* renamed from: o */
    public final int f25180o;

    /* renamed from: p */
    public final int f25181p;

    /* renamed from: q */
    public final og0 f25182q;

    /* renamed from: r */
    public final pg0 f25183r;

    /* renamed from: s */
    public final fg0 f25184s;

    /* renamed from: t */
    public final List f25185t;

    /* renamed from: u */
    public final EnumC13716b f25186u;

    /* renamed from: v */
    public final boolean f25187v;

    /* renamed from: w */
    public final yj1 f25188w;

    /* renamed from: x */
    public final tz5 f25189x;

    /* renamed from: o.gh9$a */
    public enum EnumC13715a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: o.gh9$b */
    public enum EnumC13716b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public gh9(List list, ama amaVar, String str, long j, EnumC13715a enumC13715a, long j2, String str2, List list2, rg0 rg0Var, int i, int i2, int i3, float f, float f2, int i4, int i5, og0 og0Var, pg0 pg0Var, List list3, EnumC13716b enumC13716b, fg0 fg0Var, boolean z, yj1 yj1Var, tz5 tz5Var) {
        this.f25166a = list;
        this.f25167b = amaVar;
        this.f25168c = str;
        this.f25169d = j;
        this.f25170e = enumC13715a;
        this.f25171f = j2;
        this.f25172g = str2;
        this.f25173h = list2;
        this.f25174i = rg0Var;
        this.f25175j = i;
        this.f25176k = i2;
        this.f25177l = i3;
        this.f25178m = f;
        this.f25179n = f2;
        this.f25180o = i4;
        this.f25181p = i5;
        this.f25182q = og0Var;
        this.f25183r = pg0Var;
        this.f25185t = list3;
        this.f25186u = enumC13716b;
        this.f25184s = fg0Var;
        this.f25187v = z;
        this.f25188w = yj1Var;
        this.f25189x = tz5Var;
    }

    /* renamed from: a */
    public yj1 m28675a() {
        return this.f25188w;
    }

    /* renamed from: b */
    public ama m28676b() {
        return this.f25167b;
    }

    /* renamed from: c */
    public tz5 m28677c() {
        return this.f25189x;
    }

    /* renamed from: d */
    public long m28678d() {
        return this.f25169d;
    }

    /* renamed from: e */
    public List m28679e() {
        return this.f25185t;
    }

    /* renamed from: f */
    public EnumC13715a m28680f() {
        return this.f25170e;
    }

    /* renamed from: g */
    public List m28681g() {
        return this.f25173h;
    }

    /* renamed from: h */
    public EnumC13716b m28682h() {
        return this.f25186u;
    }

    /* renamed from: i */
    public String m28683i() {
        return this.f25168c;
    }

    /* renamed from: j */
    public long m28684j() {
        return this.f25171f;
    }

    /* renamed from: k */
    public int m28685k() {
        return this.f25181p;
    }

    /* renamed from: l */
    public int m28686l() {
        return this.f25180o;
    }

    /* renamed from: m */
    public String m28687m() {
        return this.f25172g;
    }

    /* renamed from: n */
    public List m28688n() {
        return this.f25166a;
    }

    /* renamed from: o */
    public int m28689o() {
        return this.f25177l;
    }

    /* renamed from: p */
    public int m28690p() {
        return this.f25176k;
    }

    /* renamed from: q */
    public int m28691q() {
        return this.f25175j;
    }

    /* renamed from: r */
    public float m28692r() {
        return this.f25179n / this.f25167b.m17441e();
    }

    /* renamed from: s */
    public og0 m28693s() {
        return this.f25182q;
    }

    /* renamed from: t */
    public pg0 m28694t() {
        return this.f25183r;
    }

    public String toString() {
        return m28699y("");
    }

    /* renamed from: u */
    public fg0 m28695u() {
        return this.f25184s;
    }

    /* renamed from: v */
    public float m28696v() {
        return this.f25178m;
    }

    /* renamed from: w */
    public rg0 m28697w() {
        return this.f25174i;
    }

    /* renamed from: x */
    public boolean m28698x() {
        return this.f25187v;
    }

    /* renamed from: y */
    public String m28699y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m28683i());
        sb.append("\n");
        gh9 gh9VarM17456t = this.f25167b.m17456t(m28684j());
        if (gh9VarM17456t != null) {
            sb.append("\t\tParents: ");
            sb.append(gh9VarM17456t.m28683i());
            gh9 gh9VarM17456t2 = this.f25167b.m17456t(gh9VarM17456t.m28684j());
            while (gh9VarM17456t2 != null) {
                sb.append("->");
                sb.append(gh9VarM17456t2.m28683i());
                gh9VarM17456t2 = this.f25167b.m17456t(gh9VarM17456t2.m28684j());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!m28681g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(m28681g().size());
            sb.append("\n");
        }
        if (m28691q() != 0 && m28690p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m28691q()), Integer.valueOf(m28690p()), Integer.valueOf(m28689o())));
        }
        if (!this.f25166a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.f25166a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
