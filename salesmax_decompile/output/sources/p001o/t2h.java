package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t2h {

    /* renamed from: a */
    public final String f46265a;

    /* renamed from: b */
    public final String f46266b;

    /* renamed from: c */
    public final String f46267c;

    /* renamed from: d */
    public final List f46268d;

    /* renamed from: e */
    public final List f46269e;

    /* renamed from: f */
    public final boolean f46270f;

    public t2h(String str, String str2, String str3, List list, List list2, boolean z) {
        sq8.m48649h(str, "teamId");
        sq8.m48649h(list, "managers");
        sq8.m48649h(list2, "reportee");
        this.f46265a = str;
        this.f46266b = str2;
        this.f46267c = str3;
        this.f46268d = list;
        this.f46269e = list2;
        this.f46270f = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2h)) {
            return false;
        }
        t2h t2hVar = (t2h) obj;
        return sq8.m48644c(this.f46265a, t2hVar.f46265a) && sq8.m48644c(this.f46266b, t2hVar.f46266b) && sq8.m48644c(this.f46267c, t2hVar.f46267c) && sq8.m48644c(this.f46268d, t2hVar.f46268d) && sq8.m48644c(this.f46269e, t2hVar.f46269e) && this.f46270f == t2hVar.f46270f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f46265a.hashCode() * 31;
        String str = this.f46266b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46267c;
        int iHashCode3 = (((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f46268d.hashCode()) * 31) + this.f46269e.hashCode()) * 31;
        boolean z = this.f46270f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode3 + i;
    }

    public String toString() {
        return "Team(teamId=" + this.f46265a + ", name=" + this.f46266b + ", description=" + this.f46267c + ", managers=" + this.f46268d + ", reportee=" + this.f46269e + ", isTeamLeader=" + this.f46270f + ")";
    }

    public /* synthetic */ t2h(String str, String str2, String str3, List list, List list2, boolean z, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? new ArrayList() : list2, (i & 32) != 0 ? false : z);
    }
}
