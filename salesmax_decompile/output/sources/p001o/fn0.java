package p001o;

/* loaded from: classes.dex */
public final class fn0 {

    /* renamed from: a */
    public final int f23684a;

    /* renamed from: b */
    public final String f23685b;

    /* renamed from: c */
    public final String f23686c;

    /* renamed from: d */
    public final String f23687d;

    /* renamed from: e */
    public final String f23688e;

    /* renamed from: f */
    public final Boolean f23689f;

    public fn0(int i, String str, String str2, String str3, String str4, Boolean bool) {
        this.f23684a = i;
        this.f23685b = str;
        this.f23686c = str2;
        this.f23687d = str3;
        this.f23688e = str4;
        this.f23689f = bool;
    }

    /* renamed from: b */
    public static /* synthetic */ fn0 m27110b(fn0 fn0Var, int i, String str, String str2, String str3, String str4, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fn0Var.f23684a;
        }
        if ((i2 & 2) != 0) {
            str = fn0Var.f23685b;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = fn0Var.f23686c;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = fn0Var.f23687d;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = fn0Var.f23688e;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            bool = fn0Var.f23689f;
        }
        return fn0Var.m27111a(i, str5, str6, str7, str8, bool);
    }

    /* renamed from: a */
    public final fn0 m27111a(int i, String str, String str2, String str3, String str4, Boolean bool) {
        return new fn0(i, str, str2, str3, str4, bool);
    }

    /* renamed from: c */
    public final String m27112c() {
        return this.f23688e;
    }

    /* renamed from: d */
    public final int m27113d() {
        return this.f23684a;
    }

    /* renamed from: e */
    public final String m27114e() {
        return this.f23687d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn0)) {
            return false;
        }
        fn0 fn0Var = (fn0) obj;
        return this.f23684a == fn0Var.f23684a && sq8.m48644c(this.f23685b, fn0Var.f23685b) && sq8.m48644c(this.f23686c, fn0Var.f23686c) && sq8.m48644c(this.f23687d, fn0Var.f23687d) && sq8.m48644c(this.f23688e, fn0Var.f23688e);
    }

    /* renamed from: f */
    public final String m27115f() {
        return this.f23686c;
    }

    /* renamed from: g */
    public final Boolean m27116g() {
        return this.f23689f;
    }

    /* renamed from: h */
    public final String m27117h() {
        return this.f23685b;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f23684a) * 31;
        String str = this.f23685b;
        int iHashCode2 = iHashCode + ((str != null ? str.hashCode() : 0) * 31);
        String str2 = this.f23686c;
        int iHashCode3 = iHashCode2 + ((str2 != null ? str2.hashCode() : 0) * 31);
        String str3 = this.f23687d;
        int iHashCode4 = iHashCode3 + ((str3 != null ? str3.hashCode() : 0) * 31);
        String str4 = this.f23688e;
        return iHashCode4 + ((str4 != null ? str4.hashCode() : 0) * 31);
    }

    public String toString() {
        return "AppVersion(id=" + this.f23684a + ", version=" + this.f23685b + ", model=" + this.f23686c + ", manufacturer=" + this.f23687d + ", androidVersion=" + this.f23688e + ", persisted=" + this.f23689f + ")";
    }

    public /* synthetic */ fn0(int i, String str, String str2, String str3, String str4, Boolean bool, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) == 0 ? bool : null);
    }
}
