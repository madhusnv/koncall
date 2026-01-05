package p001o;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes.dex */
public final class vha {

    /* renamed from: a */
    public final String f50335a;

    /* renamed from: b */
    public final double f50336b;

    /* renamed from: c */
    public final double f50337c;

    /* renamed from: d */
    public final String f50338d;

    /* renamed from: e */
    public final long f50339e;

    /* renamed from: f */
    public final boolean f50340f;

    /* renamed from: g */
    public final String f50341g;

    public vha(String str, double d, double d2, String str2, long j, boolean z, String str3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        this.f50335a = str;
        this.f50336b = d;
        this.f50337c = d2;
        this.f50338d = str2;
        this.f50339e = j;
        this.f50340f = z;
        this.f50341g = str3;
    }

    /* renamed from: a */
    public final vha m52771a(String str, double d, double d2, String str2, long j, boolean z, String str3) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return new vha(str, d, d2, str2, j, z, str3);
    }

    /* renamed from: c */
    public final String m52772c() {
        return this.f50341g;
    }

    /* renamed from: d */
    public final long m52773d() {
        return this.f50339e;
    }

    /* renamed from: e */
    public final String m52774e() {
        return this.f50335a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vha)) {
            return false;
        }
        vha vhaVar = (vha) obj;
        return sq8.m48644c(this.f50335a, vhaVar.f50335a) && Double.compare(this.f50336b, vhaVar.f50336b) == 0 && Double.compare(this.f50337c, vhaVar.f50337c) == 0 && sq8.m48644c(this.f50338d, vhaVar.f50338d) && this.f50339e == vhaVar.f50339e && this.f50340f == vhaVar.f50340f && sq8.m48644c(this.f50341g, vhaVar.f50341g);
    }

    /* renamed from: f */
    public final double m52775f() {
        return this.f50337c;
    }

    /* renamed from: g */
    public final double m52776g() {
        return this.f50336b;
    }

    /* renamed from: h */
    public final boolean m52777h() {
        return this.f50340f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.f50335a.hashCode() * 31) + Double.hashCode(this.f50336b)) * 31) + Double.hashCode(this.f50337c)) * 31;
        String str = this.f50338d;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f50339e)) * 31;
        boolean z = this.f50340f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        String str2 = this.f50341g;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m52778i() {
        return this.f50338d;
    }

    public String toString() {
        return "Location(id=" + this.f50335a + ", longitude=" + this.f50336b + ", latitude=" + this.f50337c + ", provider=" + this.f50338d + ", createdAt=" + this.f50339e + ", persisted=" + this.f50340f + ", activityLocationId=" + this.f50341g + ")";
    }

    public /* synthetic */ vha(String str, double d, double d2, String str2, long j, boolean z, String str3, int i, id5 id5Var) {
        this(str, d, d2, str2, j, z, (i & 64) != 0 ? null : str3);
    }
}
