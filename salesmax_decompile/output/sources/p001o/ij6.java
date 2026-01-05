package p001o;

/* loaded from: classes3.dex */
public final class ij6 implements b81 {

    /* renamed from: a */
    public final String f28738a;

    /* renamed from: b */
    public final String f28739b;

    /* renamed from: c */
    public final String f28740c;

    public ij6(String str, String str2, String str3) {
        this.f28738a = str;
        this.f28739b = str2;
        this.f28740c = str3;
    }

    @Override // p001o.b81
    /* renamed from: a */
    public String mo18271a() {
        return this.f28738a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij6)) {
            return false;
        }
        ij6 ij6Var = (ij6) obj;
        return sq8.m48644c(this.f28738a, ij6Var.f28738a) && sq8.m48644c(this.f28739b, ij6Var.f28739b) && sq8.m48644c(this.f28740c, ij6Var.f28740c);
    }

    @Override // p001o.b81
    public String getMessage() {
        return this.f28739b;
    }

    public int hashCode() {
        String str = this.f28738a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28739b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28740c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ErrorDetails(code=" + this.f28738a + ", message=" + this.f28739b + ", requestId=" + this.f28740c + ')';
    }
}
