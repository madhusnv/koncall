package p001o;

/* loaded from: classes2.dex */
public class iwc {

    /* renamed from: a */
    public final Object f29291a;

    /* renamed from: b */
    public final Object f29292b;

    public iwc(Object obj, Object obj2) {
        this.f29291a = obj;
        this.f29292b = obj2;
    }

    /* renamed from: a */
    public static iwc m32868a(Object obj, Object obj2) {
        return new iwc(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iwc)) {
            return false;
        }
        iwc iwcVar = (iwc) obj;
        return s6c.m47909a(iwcVar.f29291a, this.f29291a) && s6c.m47909a(iwcVar.f29292b, this.f29292b);
    }

    public int hashCode() {
        Object obj = this.f29291a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f29292b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f29291a + " " + this.f29292b + "}";
    }
}
