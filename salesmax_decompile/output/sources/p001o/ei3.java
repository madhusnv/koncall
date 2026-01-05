package p001o;

/* loaded from: classes2.dex */
public abstract class ei3 {

    /* renamed from: d */
    public static final C13198a f21725d = new C13198a(null);

    /* renamed from: a */
    public final String f21726a;

    /* renamed from: b */
    public final long f21727b;

    /* renamed from: c */
    public final int f21728c;

    /* renamed from: o.ei3$a */
    public static final class C13198a {
        public C13198a() {
        }

        public /* synthetic */ C13198a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ei3(String str, long j, int i, id5 id5Var) {
        this(str, j, i);
    }

    /* renamed from: a */
    public final int m25092a() {
        return th3.m49874f(this.f21727b);
    }

    /* renamed from: b */
    public final int m25093b() {
        return this.f21728c;
    }

    /* renamed from: c */
    public abstract float mo17011c(int i);

    /* renamed from: d */
    public abstract float mo17012d(int i);

    /* renamed from: e */
    public final long m25094e() {
        return this.f21727b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ei3 ei3Var = (ei3) obj;
        if (this.f21728c == ei3Var.f21728c && sq8.m48644c(this.f21726a, ei3Var.f21726a)) {
            return th3.m49873e(this.f21727b, ei3Var.f21727b);
        }
        return false;
    }

    /* renamed from: f */
    public final String m25095f() {
        return this.f21726a;
    }

    /* renamed from: g */
    public boolean mo25096g() {
        return false;
    }

    /* renamed from: h */
    public abstract long mo17013h(float f, float f2, float f3);

    public int hashCode() {
        return (((this.f21726a.hashCode() * 31) + th3.m49875g(this.f21727b)) * 31) + this.f21728c;
    }

    /* renamed from: i */
    public abstract float mo17014i(float f, float f2, float f3);

    /* renamed from: j */
    public abstract long mo17015j(float f, float f2, float f3, float f4, ei3 ei3Var);

    public String toString() {
        return this.f21726a + " (id=" + this.f21728c + ", model=" + ((Object) th3.m49876h(this.f21727b)) + ')';
    }

    public ei3(String str, long j, int i) {
        sq8.m48649h(str, "name");
        this.f21726a = str;
        this.f21727b = j;
        this.f21728c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
