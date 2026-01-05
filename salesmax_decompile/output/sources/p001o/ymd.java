package p001o;

/* loaded from: classes2.dex */
public final class ymd {

    /* renamed from: a */
    public final String f55702a;

    /* renamed from: b */
    public final String f55703b;

    /* renamed from: c */
    public final String f55704c;

    /* renamed from: d */
    public final String f55705d;

    /* renamed from: e */
    public final String f55706e;

    public ymd(String str, String str2, String str3, String str4, String str5) {
        this.f55702a = str;
        this.f55703b = str2;
        this.f55704c = str3;
        this.f55705d = str4;
        this.f55706e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymd)) {
            return false;
        }
        ymd ymdVar = (ymd) obj;
        return sqi.m48724c(this.f55702a, ymdVar.f55702a) && sqi.m48724c(this.f55703b, ymdVar.f55703b) && sqi.m48724c(this.f55704c, ymdVar.f55704c) && sqi.m48724c(this.f55705d, ymdVar.f55705d) && sqi.m48724c(this.f55706e, ymdVar.f55706e);
    }

    public int hashCode() {
        String str = this.f55702a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55703b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55704c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f55705d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f55706e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
