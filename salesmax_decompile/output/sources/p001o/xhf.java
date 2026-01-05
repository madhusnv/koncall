package p001o;

/* loaded from: classes2.dex */
public final class xhf implements g36 {

    /* renamed from: a */
    public final int f53793a;

    /* renamed from: b */
    public final int f53794b;

    public xhf(int i, int i2) {
        this.f53793a = i;
        this.f53794b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhf)) {
            return false;
        }
        xhf xhfVar = (xhf) obj;
        return this.f53793a == xhfVar.f53793a && this.f53794b == xhfVar.f53794b;
    }

    public int hashCode() {
        return (this.f53793a * 31) + this.f53794b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f53793a + ", end=" + this.f53794b + ')';
    }
}
