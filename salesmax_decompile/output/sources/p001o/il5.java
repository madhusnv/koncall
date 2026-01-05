package p001o;

/* loaded from: classes2.dex */
public final class il5 implements g36 {

    /* renamed from: a */
    public final int f28794a;

    /* renamed from: b */
    public final int f28795b;

    public il5(int i, int i2) {
        this.f28794a = i;
        this.f28795b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il5)) {
            return false;
        }
        il5 il5Var = (il5) obj;
        return this.f28794a == il5Var.f28794a && this.f28795b == il5Var.f28795b;
    }

    public int hashCode() {
        return (this.f28794a * 31) + this.f28795b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f28794a + ", lengthAfterCursor=" + this.f28795b + ')';
    }
}
