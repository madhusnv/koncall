package p001o;

import p001o.pa2;

/* loaded from: classes2.dex */
public final class b41 extends pa2.AbstractC16043a {

    /* renamed from: a */
    public final int f15521a;

    /* renamed from: b */
    public final Throwable f15522b;

    public b41(int i, Throwable th) {
        this.f15521a = i;
        this.f15522b = th;
    }

    @Override // p001o.pa2.AbstractC16043a
    /* renamed from: c */
    public Throwable mo18143c() {
        return this.f15522b;
    }

    @Override // p001o.pa2.AbstractC16043a
    /* renamed from: d */
    public int mo18144d() {
        return this.f15521a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa2.AbstractC16043a)) {
            return false;
        }
        pa2.AbstractC16043a abstractC16043a = (pa2.AbstractC16043a) obj;
        if (this.f15521a == abstractC16043a.mo18144d()) {
            Throwable th = this.f15522b;
            if (th == null) {
                if (abstractC16043a.mo18143c() == null) {
                    return true;
                }
            } else if (th.equals(abstractC16043a.mo18143c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f15521a ^ 1000003) * 1000003;
        Throwable th = this.f15522b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f15521a + ", cause=" + this.f15522b + "}";
    }
}
