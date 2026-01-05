package p001o;

import java.util.List;
import p001o.rfg;

/* loaded from: classes2.dex */
public final class s51 extends rfg.AbstractC16603b {

    /* renamed from: a */
    public final hfg f44823a;

    /* renamed from: b */
    public final List f44824b;

    public s51(hfg hfgVar, List list) {
        if (hfgVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f44823a = hfgVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f44824b = list;
    }

    @Override // p001o.rfg.AbstractC16603b
    /* renamed from: a */
    public List mo46674a() {
        return this.f44824b;
    }

    @Override // p001o.rfg.AbstractC16603b
    /* renamed from: b */
    public hfg mo46675b() {
        return this.f44823a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rfg.AbstractC16603b)) {
            return false;
        }
        rfg.AbstractC16603b abstractC16603b = (rfg.AbstractC16603b) obj;
        return this.f44823a.equals(abstractC16603b.mo46675b()) && this.f44824b.equals(abstractC16603b.mo46674a());
    }

    public int hashCode() {
        return ((this.f44823a.hashCode() ^ 1000003) * 1000003) ^ this.f44824b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f44823a + ", outConfigs=" + this.f44824b + "}";
    }
}
