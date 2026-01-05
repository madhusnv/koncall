package p001o;

/* loaded from: classes3.dex */
public final class gxe implements b81 {

    /* renamed from: a */
    public final String f25923a;

    /* renamed from: b */
    public final String f25924b;

    /* renamed from: c */
    public final String f25925c;

    /* renamed from: d */
    public final String f25926d;

    public gxe(String str, String str2, String str3, String str4) {
        this.f25923a = str;
        this.f25924b = str2;
        this.f25925c = str3;
        this.f25926d = str4;
    }

    @Override // p001o.b81
    /* renamed from: a */
    public String mo18271a() {
        return this.f25923a;
    }

    /* renamed from: b */
    public String m29629b() {
        return this.f25925c;
    }

    /* renamed from: c */
    public final String m29630c() {
        return this.f25926d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxe)) {
            return false;
        }
        gxe gxeVar = (gxe) obj;
        return sq8.m48644c(this.f25923a, gxeVar.f25923a) && sq8.m48644c(this.f25924b, gxeVar.f25924b) && sq8.m48644c(this.f25925c, gxeVar.f25925c) && sq8.m48644c(this.f25926d, gxeVar.f25926d);
    }

    @Override // p001o.b81
    public String getMessage() {
        return this.f25924b;
    }

    public int hashCode() {
        String str = this.f25923a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25924b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25925c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25926d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "S3ErrorDetails(code=" + this.f25923a + ", message=" + this.f25924b + ", requestId=" + this.f25925c + ", requestId2=" + this.f25926d + ')';
    }

    public /* synthetic */ gxe(String str, String str2, String str3, String str4, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
