package p001o;

import p001o.pa2;

/* loaded from: classes2.dex */
public final class a41 extends pa2 {

    /* renamed from: a */
    public final pa2.EnumC16044b f14114a;

    /* renamed from: b */
    public final pa2.AbstractC16043a f14115b;

    public a41(pa2.EnumC16044b enumC16044b, pa2.AbstractC16043a abstractC16043a) {
        if (enumC16044b == null) {
            throw new NullPointerException("Null type");
        }
        this.f14114a = enumC16044b;
        this.f14115b = abstractC16043a;
    }

    @Override // p001o.pa2
    /* renamed from: c */
    public pa2.AbstractC16043a mo16401c() {
        return this.f14115b;
    }

    @Override // p001o.pa2
    /* renamed from: d */
    public pa2.EnumC16044b mo16402d() {
        return this.f14114a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa2)) {
            return false;
        }
        pa2 pa2Var = (pa2) obj;
        if (this.f14114a.equals(pa2Var.mo16402d())) {
            pa2.AbstractC16043a abstractC16043a = this.f14115b;
            if (abstractC16043a == null) {
                if (pa2Var.mo16401c() == null) {
                    return true;
                }
            } else if (abstractC16043a.equals(pa2Var.mo16401c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f14114a.hashCode() ^ 1000003) * 1000003;
        pa2.AbstractC16043a abstractC16043a = this.f14115b;
        return iHashCode ^ (abstractC16043a == null ? 0 : abstractC16043a.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f14114a + ", error=" + this.f14115b + "}";
    }
}
