package p001o;

/* loaded from: classes3.dex */
public class rpb {

    /* renamed from: a */
    public Object f43933a;

    /* renamed from: b */
    public Object f43934b;

    /* renamed from: a */
    public static boolean m47065a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void m47066b(Object obj, Object obj2) {
        this.f43933a = obj;
        this.f43934b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iwc)) {
            return false;
        }
        iwc iwcVar = (iwc) obj;
        return m47065a(iwcVar.f29291a, this.f43933a) && m47065a(iwcVar.f29292b, this.f43934b);
    }

    public int hashCode() {
        Object obj = this.f43933a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f43934b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f43933a + " " + this.f43934b + "}";
    }
}
