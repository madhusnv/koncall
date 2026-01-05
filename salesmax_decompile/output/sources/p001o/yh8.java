package p001o;

/* loaded from: classes6.dex */
public final class yh8 {

    /* renamed from: a */
    public final int f55518a;

    /* renamed from: b */
    public final Object f55519b;

    public yh8(int i, Object obj) {
        this.f55518a = i;
        this.f55519b = obj;
    }

    /* renamed from: a */
    public final int m57816a() {
        return this.f55518a;
    }

    /* renamed from: b */
    public final Object m57817b() {
        return this.f55519b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh8)) {
            return false;
        }
        yh8 yh8Var = (yh8) obj;
        return this.f55518a == yh8Var.f55518a && sq8.m48644c(this.f55519b, yh8Var.f55519b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f55518a) * 31;
        Object obj = this.f55519b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f55518a + ", value=" + this.f55519b + ')';
    }
}
