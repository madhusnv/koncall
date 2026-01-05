package p001o;

/* loaded from: classes6.dex */
public final class vb3 implements wb3 {

    /* renamed from: a */
    public final float f50085a;

    /* renamed from: b */
    public final float f50086b;

    public vb3(float f, float f2) {
        this.f50085a = f;
        this.f50086b = f2;
    }

    @Override // p001o.xb3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f50086b);
    }

    @Override // p001o.xb3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f50085a);
    }

    /* renamed from: c */
    public boolean m52503c(float f, float f2) {
        return f <= f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.wb3
    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo52504d(Comparable comparable, Comparable comparable2) {
        return m52503c(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vb3)) {
            return false;
        }
        if (!isEmpty() || !((vb3) obj).isEmpty()) {
            vb3 vb3Var = (vb3) obj;
            if (!(this.f50085a == vb3Var.f50085a)) {
                return false;
            }
            if (!(this.f50086b == vb3Var.f50086b)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f50085a) * 31) + Float.hashCode(this.f50086b);
    }

    @Override // p001o.wb3, p001o.xb3
    public boolean isEmpty() {
        return this.f50085a > this.f50086b;
    }

    public String toString() {
        return this.f50085a + ".." + this.f50086b;
    }
}
