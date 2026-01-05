package p001o;

/* loaded from: classes2.dex */
public final class ef1 {

    /* renamed from: a */
    public final String f21518a;

    /* renamed from: b */
    public final String f21519b;

    /* renamed from: c */
    public final int f21520c;

    /* renamed from: d */
    public final int f21521d;

    public ef1(String str, String str2, int i, int i2) {
        this.f21518a = str;
        this.f21519b = str2;
        this.f21520c = i;
        this.f21521d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef1)) {
            return false;
        }
        ef1 ef1Var = (ef1) obj;
        return this.f21520c == ef1Var.f21520c && this.f21521d == ef1Var.f21521d && r6c.m46255a(this.f21518a, ef1Var.f21518a) && r6c.m46255a(this.f21519b, ef1Var.f21519b);
    }

    public int hashCode() {
        return r6c.m46256b(this.f21518a, this.f21519b, Integer.valueOf(this.f21520c), Integer.valueOf(this.f21521d));
    }
}
