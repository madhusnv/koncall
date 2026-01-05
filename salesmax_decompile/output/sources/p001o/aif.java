package p001o;

/* loaded from: classes2.dex */
public final class aif implements g36 {

    /* renamed from: a */
    public final int f14813a;

    /* renamed from: b */
    public final int f14814b;

    public aif(int i, int i2) {
        this.f14813a = i;
        this.f14814b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aif)) {
            return false;
        }
        aif aifVar = (aif) obj;
        return this.f14813a == aifVar.f14813a && this.f14814b == aifVar.f14814b;
    }

    public int hashCode() {
        return (this.f14813a * 31) + this.f14814b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f14813a + ", end=" + this.f14814b + ')';
    }
}
