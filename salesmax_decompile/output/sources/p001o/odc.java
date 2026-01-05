package p001o;

/* loaded from: classes3.dex */
public final class odc {

    /* renamed from: a */
    public final ofc f38157a;

    /* renamed from: b */
    public final String f38158b;

    public odc(ofc ofcVar, String str) {
        sq8.m48649h(ofcVar, "family");
        this.f38157a = ofcVar;
        this.f38158b = str;
    }

    /* renamed from: a */
    public final ofc m42086a() {
        return this.f38157a;
    }

    /* renamed from: b */
    public final String m42087b() {
        return this.f38158b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odc)) {
            return false;
        }
        odc odcVar = (odc) obj;
        return this.f38157a == odcVar.f38157a && sq8.m48644c(this.f38158b, odcVar.f38158b);
    }

    public int hashCode() {
        int iHashCode = this.f38157a.hashCode() * 31;
        String str = this.f38158b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OperatingSystem(family=" + this.f38157a + ", version=" + this.f38158b + ')';
    }
}
