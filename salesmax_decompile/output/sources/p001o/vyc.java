package p001o;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vyc {

    /* renamed from: a */
    public final String f51043a;

    /* renamed from: b */
    public final Map f51044b;

    /* renamed from: c */
    public final mge f51045c;

    /* renamed from: d */
    public final wyc f51046d;

    public vyc(String str, Map map, mge mgeVar, wyc wycVar) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(map, "regions");
        sq8.m48649h(mgeVar, "regionRegex");
        sq8.m48649h(wycVar, "baseConfig");
        this.f51043a = str;
        this.f51044b = map;
        this.f51045c = mgeVar;
        this.f51046d = wycVar;
    }

    /* renamed from: a */
    public final wyc m53615a() {
        return this.f51046d;
    }

    /* renamed from: b */
    public final String m53616b() {
        return this.f51043a;
    }

    /* renamed from: c */
    public final mge m53617c() {
        return this.f51045c;
    }

    /* renamed from: d */
    public final Map m53618d() {
        return this.f51044b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyc)) {
            return false;
        }
        vyc vycVar = (vyc) obj;
        return sq8.m48644c(this.f51043a, vycVar.f51043a) && sq8.m48644c(this.f51044b, vycVar.f51044b) && sq8.m48644c(this.f51045c, vycVar.f51045c) && sq8.m48644c(this.f51046d, vycVar.f51046d);
    }

    public int hashCode() {
        return (((((this.f51043a.hashCode() * 31) + this.f51044b.hashCode()) * 31) + this.f51045c.hashCode()) * 31) + this.f51046d.hashCode();
    }

    public String toString() {
        return "Partition(id=" + this.f51043a + ", regions=" + this.f51044b + ", regionRegex=" + this.f51045c + ", baseConfig=" + this.f51046d + ')';
    }
}
