package p001o;

/* loaded from: classes2.dex */
public final class idc implements jdc {

    /* renamed from: a */
    public final float f28494a;

    /* renamed from: b */
    public final float f28495b;

    public idc(float f, float f2) {
        this.f28494a = f;
        this.f28495b = f2;
    }

    @Override // p001o.jdc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float mo31936a() {
        return Float.valueOf(this.f28495b);
    }

    @Override // p001o.jdc
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f28494a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof idc)) {
            return false;
        }
        if (!isEmpty() || !((idc) obj).isEmpty()) {
            idc idcVar = (idc) obj;
            if (!(this.f28494a == idcVar.f28494a)) {
                return false;
            }
            if (!(this.f28495b == idcVar.f28495b)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f28494a) * 31) + Float.hashCode(this.f28495b);
    }

    @Override // p001o.jdc
    public boolean isEmpty() {
        return this.f28494a >= this.f28495b;
    }

    public String toString() {
        return this.f28494a + "..<" + this.f28495b;
    }
}
