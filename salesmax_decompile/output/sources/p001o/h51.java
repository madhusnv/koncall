package p001o;

import java.util.Map;
import p001o.u0f;

/* loaded from: classes6.dex */
public final class h51 extends u0f.AbstractC17281c {

    /* renamed from: a */
    public final Map f26208a;

    /* renamed from: b */
    public final Map f26209b;

    public h51(Map map, Map map2) {
        if (map == null) {
            throw new NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.f26208a = map;
        if (map2 == null) {
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.f26209b = map2;
    }

    @Override // p001o.u0f.AbstractC17281c
    /* renamed from: b */
    public Map mo29818b() {
        return this.f26209b;
    }

    @Override // p001o.u0f.AbstractC17281c
    /* renamed from: c */
    public Map mo29819c() {
        return this.f26208a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0f.AbstractC17281c)) {
            return false;
        }
        u0f.AbstractC17281c abstractC17281c = (u0f.AbstractC17281c) obj;
        return this.f26208a.equals(abstractC17281c.mo29819c()) && this.f26209b.equals(abstractC17281c.mo29818b());
    }

    public int hashCode() {
        return ((this.f26208a.hashCode() ^ 1000003) * 1000003) ^ this.f26209b.hashCode();
    }

    public String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.f26208a + ", numbersOfErrorSampledSpans=" + this.f26209b + "}";
    }
}
