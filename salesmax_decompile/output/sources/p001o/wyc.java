package p001o;

/* loaded from: classes2.dex */
public final class wyc {

    /* renamed from: a */
    public final String f52891a;

    /* renamed from: b */
    public final String f52892b;

    /* renamed from: c */
    public final String f52893c;

    /* renamed from: d */
    public final Boolean f52894d;

    /* renamed from: e */
    public final Boolean f52895e;

    /* renamed from: f */
    public final String f52896f;

    public wyc(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4) {
        this.f52891a = str;
        this.f52892b = str2;
        this.f52893c = str3;
        this.f52894d = bool;
        this.f52895e = bool2;
        this.f52896f = str4;
    }

    /* renamed from: a */
    public final String m55421a() {
        return this.f52892b;
    }

    /* renamed from: b */
    public final String m55422b() {
        return this.f52893c;
    }

    /* renamed from: c */
    public final String m55423c() {
        return this.f52891a;
    }

    /* renamed from: d */
    public final Boolean m55424d() {
        return this.f52895e;
    }

    /* renamed from: e */
    public final Boolean m55425e() {
        return this.f52894d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyc)) {
            return false;
        }
        wyc wycVar = (wyc) obj;
        return sq8.m48644c(this.f52891a, wycVar.f52891a) && sq8.m48644c(this.f52892b, wycVar.f52892b) && sq8.m48644c(this.f52893c, wycVar.f52893c) && sq8.m48644c(this.f52894d, wycVar.f52894d) && sq8.m48644c(this.f52895e, wycVar.f52895e) && sq8.m48644c(this.f52896f, wycVar.f52896f);
    }

    /* renamed from: f */
    public final wyc m55426f(wyc wycVar) {
        sq8.m48649h(wycVar, "other");
        String str = wycVar.f52891a;
        if (str == null) {
            str = this.f52891a;
        }
        String str2 = str;
        String str3 = wycVar.f52892b;
        if (str3 == null) {
            str3 = this.f52892b;
        }
        String str4 = str3;
        String str5 = wycVar.f52893c;
        if (str5 == null) {
            str5 = this.f52893c;
        }
        String str6 = str5;
        Boolean bool = wycVar.f52894d;
        if (bool == null) {
            bool = this.f52894d;
        }
        Boolean bool2 = bool;
        Boolean bool3 = wycVar.f52895e;
        if (bool3 == null) {
            bool3 = this.f52895e;
        }
        Boolean bool4 = bool3;
        String str7 = wycVar.f52896f;
        if (str7 == null) {
            str7 = this.f52896f;
        }
        return new wyc(str2, str4, str6, bool2, bool4, str7);
    }

    public int hashCode() {
        String str = this.f52891a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f52892b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f52893c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f52894d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f52895e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f52896f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "PartitionConfig(name=" + this.f52891a + ", dnsSuffix=" + this.f52892b + ", dualStackDnsSuffix=" + this.f52893c + ", supportsFIPS=" + this.f52894d + ", supportsDualStack=" + this.f52895e + ", implicitGlobalRegion=" + this.f52896f + ')';
    }

    public /* synthetic */ wyc(String str, String str2, String str3, Boolean bool, Boolean bool2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }

    public wyc(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this(str, str2, str3, bool, bool2, null);
    }
}
