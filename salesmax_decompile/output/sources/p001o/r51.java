package p001o;

import p001o.ifg;

/* loaded from: classes2.dex */
public final class r51 extends ifg.AbstractC14282b {

    /* renamed from: a */
    public final int f43002a;

    /* renamed from: b */
    public final ifg f43003b;

    public r51(int i, ifg ifgVar) {
        this.f43002a = i;
        if (ifgVar == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f43003b = ifgVar;
    }

    @Override // p001o.ifg.AbstractC14282b
    /* renamed from: a */
    public int mo32086a() {
        return this.f43002a;
    }

    @Override // p001o.ifg.AbstractC14282b
    /* renamed from: b */
    public ifg mo32087b() {
        return this.f43003b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ifg.AbstractC14282b)) {
            return false;
        }
        ifg.AbstractC14282b abstractC14282b = (ifg.AbstractC14282b) obj;
        return this.f43002a == abstractC14282b.mo32086a() && this.f43003b.equals(abstractC14282b.mo32087b());
    }

    public int hashCode() {
        return ((this.f43002a ^ 1000003) * 1000003) ^ this.f43003b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f43002a + ", surfaceOutput=" + this.f43003b + "}";
    }
}
