package p001o;

/* loaded from: classes2.dex */
public final class rm5 {

    /* renamed from: a */
    public final String f43794a;

    /* renamed from: b */
    public final String f43795b;

    /* renamed from: c */
    public final String f43796c;

    public rm5(String str, String str2, String str3) {
        this.f43794a = str;
        this.f43795b = str2;
        this.f43796c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rm5.class != obj.getClass()) {
            return false;
        }
        rm5 rm5Var = (rm5) obj;
        return sqi.m48724c(this.f43794a, rm5Var.f43794a) && sqi.m48724c(this.f43795b, rm5Var.f43795b) && sqi.m48724c(this.f43796c, rm5Var.f43796c);
    }

    public int hashCode() {
        int iHashCode = this.f43794a.hashCode() * 31;
        String str = this.f43795b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f43796c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
