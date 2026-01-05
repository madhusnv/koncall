package p001o;

/* loaded from: classes2.dex */
public final class hl5 implements g36 {

    /* renamed from: a */
    public final int f27102a;

    /* renamed from: b */
    public final int f27103b;

    public hl5(int i, int i2) {
        this.f27102a = i;
        this.f27103b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl5)) {
            return false;
        }
        hl5 hl5Var = (hl5) obj;
        return this.f27102a == hl5Var.f27102a && this.f27103b == hl5Var.f27103b;
    }

    public int hashCode() {
        return (this.f27102a * 31) + this.f27103b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f27102a + ", lengthAfterCursor=" + this.f27103b + ')';
    }
}
