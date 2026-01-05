package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class hwc implements Serializable {

    /* renamed from: a */
    public final Object f27701a;

    /* renamed from: b */
    public final Object f27702b;

    public hwc(Object obj, Object obj2) {
        this.f27701a = obj;
        this.f27702b = obj2;
    }

    /* renamed from: a */
    public final Object m31227a() {
        return this.f27701a;
    }

    /* renamed from: b */
    public final Object m31228b() {
        return this.f27702b;
    }

    /* renamed from: c */
    public final Object m31229c() {
        return this.f27701a;
    }

    /* renamed from: d */
    public final Object m31230d() {
        return this.f27702b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwc)) {
            return false;
        }
        hwc hwcVar = (hwc) obj;
        return sq8.m48644c(this.f27701a, hwcVar.f27701a) && sq8.m48644c(this.f27702b, hwcVar.f27702b);
    }

    public int hashCode() {
        Object obj = this.f27701a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f27702b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f27701a + ", " + this.f27702b + ')';
    }
}
