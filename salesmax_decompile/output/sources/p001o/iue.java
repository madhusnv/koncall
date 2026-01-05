package p001o;

/* loaded from: classes2.dex */
public final class iue {

    /* renamed from: a */
    public final String f29244a;

    /* renamed from: b */
    public final String f29245b;

    /* renamed from: c */
    public final String f29246c;

    public iue(String str, String str2, String str3) {
        sq8.m48649h(str, "roleArn");
        this.f29244a = str;
        this.f29245b = str2;
        this.f29246c = str3;
    }

    /* renamed from: a */
    public final String m32850a() {
        return this.f29246c;
    }

    /* renamed from: b */
    public final String m32851b() {
        return this.f29244a;
    }

    /* renamed from: c */
    public final String m32852c() {
        return this.f29245b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iue)) {
            return false;
        }
        iue iueVar = (iue) obj;
        return sq8.m48644c(this.f29244a, iueVar.f29244a) && sq8.m48644c(this.f29245b, iueVar.f29245b) && sq8.m48644c(this.f29246c, iueVar.f29246c);
    }

    public int hashCode() {
        int iHashCode = this.f29244a.hashCode() * 31;
        String str = this.f29245b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29246c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RoleArn(roleArn=" + this.f29244a + ", sessionName=" + this.f29245b + ", externalId=" + this.f29246c + ')';
    }
}
