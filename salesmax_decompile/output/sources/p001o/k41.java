package p001o;

import java.util.List;
import p001o.g16;

/* loaded from: classes2.dex */
public final class k41 extends g16.AbstractC13598b {

    /* renamed from: a */
    public final hfg f31448a;

    /* renamed from: b */
    public final hfg f31449b;

    /* renamed from: c */
    public final List f31450c;

    public k41(hfg hfgVar, hfg hfgVar2, List list) {
        if (hfgVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f31448a = hfgVar;
        if (hfgVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f31449b = hfgVar2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f31450c = list;
    }

    @Override // p001o.g16.AbstractC13598b
    /* renamed from: a */
    public List mo27914a() {
        return this.f31450c;
    }

    @Override // p001o.g16.AbstractC13598b
    /* renamed from: b */
    public hfg mo27915b() {
        return this.f31448a;
    }

    @Override // p001o.g16.AbstractC13598b
    /* renamed from: c */
    public hfg mo27916c() {
        return this.f31449b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g16.AbstractC13598b)) {
            return false;
        }
        g16.AbstractC13598b abstractC13598b = (g16.AbstractC13598b) obj;
        return this.f31448a.equals(abstractC13598b.mo27915b()) && this.f31449b.equals(abstractC13598b.mo27916c()) && this.f31450c.equals(abstractC13598b.mo27914a());
    }

    public int hashCode() {
        return ((((this.f31448a.hashCode() ^ 1000003) * 1000003) ^ this.f31449b.hashCode()) * 1000003) ^ this.f31450c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f31448a + ", secondarySurfaceEdge=" + this.f31449b + ", outConfigs=" + this.f31450c + "}";
    }
}
