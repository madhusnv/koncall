package p001o;

import ai.salesmax.model.LeadsSummary;

/* loaded from: classes.dex */
public final class vw9 {

    /* renamed from: a */
    public final boolean f50955a;

    /* renamed from: b */
    public final String f50956b;

    /* renamed from: c */
    public final boolean f50957c;

    /* renamed from: d */
    public final LeadsSummary f50958d;

    public vw9(boolean z, String str, boolean z2, LeadsSummary leadsSummary) {
        this.f50955a = z;
        this.f50956b = str;
        this.f50957c = z2;
        this.f50958d = leadsSummary;
    }

    /* renamed from: a */
    public final boolean m53506a() {
        return this.f50957c;
    }

    /* renamed from: b */
    public final LeadsSummary m53507b() {
        return this.f50958d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw9)) {
            return false;
        }
        vw9 vw9Var = (vw9) obj;
        return this.f50955a == vw9Var.f50955a && sq8.m48644c(this.f50956b, vw9Var.f50956b) && this.f50957c == vw9Var.f50957c && sq8.m48644c(this.f50958d, vw9Var.f50958d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.f50955a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.f50956b;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.f50957c;
        int i2 = (iHashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        LeadsSummary leadsSummary = this.f50958d;
        return i2 + (leadsSummary != null ? leadsSummary.hashCode() : 0);
    }

    public String toString() {
        return "LeadSummaryWrapped(doNotTrack=" + this.f50955a + ", error=" + this.f50956b + ", hasError=" + this.f50957c + ", leadsSummary=" + this.f50958d + ")";
    }
}
