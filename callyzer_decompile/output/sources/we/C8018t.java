package we;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.t */
/* loaded from: classes.dex */
public final class C8018t extends f0 {

    /* renamed from: a */
    public final long f38532a;

    /* renamed from: b */
    public final long f38533b;

    /* renamed from: c */
    public final C8012n f38534c;

    /* renamed from: d */
    public final Integer f38535d;

    /* renamed from: e */
    public final String f38536e;

    /* renamed from: f */
    public final ArrayList f38537f;

    /* renamed from: g */
    public final j0 f38538g;

    public C8018t(long j6, long j10, C8012n c8012n, Integer num, String str, ArrayList arrayList, j0 j0Var) {
        this.f38532a = j6;
        this.f38533b = j10;
        this.f38534c = c8012n;
        this.f38535d = num;
        this.f38536e = str;
        this.f38537f = arrayList;
        this.f38538g = j0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        C8018t c8018t = (C8018t) ((f0) obj);
        j0 j0Var = c8018t.f38538g;
        ArrayList arrayList = c8018t.f38537f;
        String str = c8018t.f38536e;
        Integer num = c8018t.f38535d;
        C8012n c8012n = c8018t.f38534c;
        if (this.f38532a != c8018t.f38532a || this.f38533b != c8018t.f38533b || !this.f38534c.equals(c8012n)) {
            return false;
        }
        Integer num2 = this.f38535d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f38536e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f38537f.equals(arrayList)) {
            return false;
        }
        j0 j0Var2 = this.f38538g;
        return j0Var2 == null ? j0Var == null : j0Var2.equals(j0Var);
    }

    public final int hashCode() {
        long j6 = this.f38532a;
        long j10 = this.f38533b;
        int iHashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f38534c.hashCode()) * 1000003;
        Integer num = this.f38535d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f38536e;
        int iHashCode3 = (((iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f38537f.hashCode()) * 1000003;
        j0 j0Var = this.f38538g;
        return iHashCode3 ^ (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f38532a + ", requestUptimeMs=" + this.f38533b + ", clientInfo=" + this.f38534c + ", logSource=" + this.f38535d + ", logSourceName=" + this.f38536e + ", logEvents=" + this.f38537f + ", qosTier=" + this.f38538g + "}";
    }
}
