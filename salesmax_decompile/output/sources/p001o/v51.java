package p001o;

import android.util.Size;
import java.util.Map;

/* loaded from: classes2.dex */
public final class v51 extends cgg {

    /* renamed from: a */
    public final Size f49879a;

    /* renamed from: b */
    public final Map f49880b;

    /* renamed from: c */
    public final Size f49881c;

    /* renamed from: d */
    public final Map f49882d;

    /* renamed from: e */
    public final Size f49883e;

    /* renamed from: f */
    public final Map f49884f;

    /* renamed from: g */
    public final Map f49885g;

    public v51(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f49879a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f49880b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f49881c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f49882d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f49883e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f49884f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f49885g = map4;
    }

    @Override // p001o.cgg
    /* renamed from: b */
    public Size mo21212b() {
        return this.f49879a;
    }

    @Override // p001o.cgg
    /* renamed from: d */
    public Map mo21214d() {
        return this.f49884f;
    }

    @Override // p001o.cgg
    /* renamed from: e */
    public Size mo21215e() {
        return this.f49881c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cgg)) {
            return false;
        }
        cgg cggVar = (cgg) obj;
        return this.f49879a.equals(cggVar.mo21212b()) && this.f49880b.equals(cggVar.mo21220j()) && this.f49881c.equals(cggVar.mo21215e()) && this.f49882d.equals(cggVar.mo21218h()) && this.f49883e.equals(cggVar.mo21216f()) && this.f49884f.equals(cggVar.mo21214d()) && this.f49885g.equals(cggVar.mo21222l());
    }

    @Override // p001o.cgg
    /* renamed from: f */
    public Size mo21216f() {
        return this.f49883e;
    }

    @Override // p001o.cgg
    /* renamed from: h */
    public Map mo21218h() {
        return this.f49882d;
    }

    public int hashCode() {
        return ((((((((((((this.f49879a.hashCode() ^ 1000003) * 1000003) ^ this.f49880b.hashCode()) * 1000003) ^ this.f49881c.hashCode()) * 1000003) ^ this.f49882d.hashCode()) * 1000003) ^ this.f49883e.hashCode()) * 1000003) ^ this.f49884f.hashCode()) * 1000003) ^ this.f49885g.hashCode();
    }

    @Override // p001o.cgg
    /* renamed from: j */
    public Map mo21220j() {
        return this.f49880b;
    }

    @Override // p001o.cgg
    /* renamed from: l */
    public Map mo21222l() {
        return this.f49885g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f49879a + ", s720pSizeMap=" + this.f49880b + ", previewSize=" + this.f49881c + ", s1440pSizeMap=" + this.f49882d + ", recordSize=" + this.f49883e + ", maximumSizeMap=" + this.f49884f + ", ultraMaximumSizeMap=" + this.f49885g + "}";
    }
}
