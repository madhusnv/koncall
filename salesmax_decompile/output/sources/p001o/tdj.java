package p001o;

/* loaded from: classes3.dex */
public final class tdj {

    /* renamed from: a */
    public final String f46914a;

    /* renamed from: b */
    public final String f46915b;

    /* renamed from: c */
    public final String f46916c;

    public tdj(String str, String str2, String str3) {
        this.f46914a = str;
        this.f46915b = str2;
        this.f46916c = str3;
    }

    /* renamed from: a */
    public String m49757a() {
        return this.f46915b;
    }

    /* renamed from: b */
    public String m49758b() {
        return this.f46916c;
    }

    /* renamed from: c */
    public String m49759c() {
        return this.f46914a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdj)) {
            return false;
        }
        tdj tdjVar = (tdj) obj;
        return sq8.m48644c(this.f46914a, tdjVar.f46914a) && sq8.m48644c(this.f46915b, tdjVar.f46915b) && sq8.m48644c(this.f46916c, tdjVar.f46916c);
    }

    public int hashCode() {
        String str = this.f46914a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f46915b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46916c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "XmlError(requestId=" + this.f46914a + ", code=" + this.f46915b + ", message=" + this.f46916c + ')';
    }
}
