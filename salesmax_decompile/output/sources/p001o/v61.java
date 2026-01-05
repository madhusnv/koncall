package p001o;

/* loaded from: classes2.dex */
public final class v61 {

    /* renamed from: a */
    public final int f49910a;

    /* renamed from: b */
    public final float f49911b;

    public v61(int i, float f) {
        this.f49910a = i;
        this.f49911b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v61.class != obj.getClass()) {
            return false;
        }
        v61 v61Var = (v61) obj;
        return this.f49910a == v61Var.f49910a && Float.compare(v61Var.f49911b, this.f49911b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f49910a) * 31) + Float.floatToIntBits(this.f49911b);
    }
}
