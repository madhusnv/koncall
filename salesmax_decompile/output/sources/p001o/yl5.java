package p001o;

/* loaded from: classes2.dex */
public final class yl5 {

    /* renamed from: a */
    public int f55678a;

    public yl5(int i) {
        this.f55678a = i;
    }

    /* renamed from: a */
    public final int m57984a() {
        return this.f55678a;
    }

    /* renamed from: b */
    public final void m57985b(int i) {
        this.f55678a += i;
    }

    /* renamed from: c */
    public final void m57986c(int i) {
        this.f55678a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl5) && this.f55678a == ((yl5) obj).f55678a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f55678a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f55678a + ')';
    }

    public /* synthetic */ yl5(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
