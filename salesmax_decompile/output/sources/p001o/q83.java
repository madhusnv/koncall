package p001o;

/* loaded from: classes.dex */
public final class q83 {

    /* renamed from: a */
    public final int f41451a;

    /* renamed from: b */
    public final String f41452b;

    /* renamed from: c */
    public final String f41453c;

    /* renamed from: d */
    public final String f41454d;

    /* renamed from: e */
    public final long f41455e;

    public q83(int i, String str, String str2, String str3, long j) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "userId");
        this.f41451a = i;
        this.f41452b = str;
        this.f41453c = str2;
        this.f41454d = str3;
        this.f41455e = j;
    }

    /* renamed from: b */
    public static /* synthetic */ q83 m44960b(q83 q83Var, int i, String str, String str2, String str3, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = q83Var.f41451a;
        }
        if ((i2 & 2) != 0) {
            str = q83Var.f41452b;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = q83Var.f41453c;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = q83Var.f41454d;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            j = q83Var.f41455e;
        }
        return q83Var.m44961a(i, str4, str5, str6, j);
    }

    /* renamed from: a */
    public final q83 m44961a(int i, String str, String str2, String str3, long j) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, "accountId");
        sq8.m48649h(str3, "userId");
        return new q83(i, str, str2, str3, j);
    }

    /* renamed from: c */
    public final String m44962c() {
        return this.f41453c;
    }

    /* renamed from: d */
    public final int m44963d() {
        return this.f41451a;
    }

    /* renamed from: e */
    public final String m44964e() {
        return this.f41452b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q83)) {
            return false;
        }
        q83 q83Var = (q83) obj;
        return this.f41451a == q83Var.f41451a && sq8.m48644c(this.f41452b, q83Var.f41452b) && sq8.m48644c(this.f41453c, q83Var.f41453c) && sq8.m48644c(this.f41454d, q83Var.f41454d) && this.f41455e == q83Var.f41455e;
    }

    /* renamed from: f */
    public final String m44965f() {
        return this.f41454d;
    }

    /* renamed from: g */
    public final long m44966g() {
        return this.f41455e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f41451a) * 31) + this.f41452b.hashCode()) * 31) + this.f41453c.hashCode()) * 31) + this.f41454d.hashCode()) * 31) + Long.hashCode(this.f41455e);
    }

    public String toString() {
        return "Checkpoint(id=" + this.f41451a + ", name=" + this.f41452b + ", accountId=" + this.f41453c + ", userId=" + this.f41454d + ", value=" + this.f41455e + ")";
    }

    public /* synthetic */ q83(int i, String str, String str2, String str3, long j, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 0 : i, str, str2, str3, j);
    }
}
