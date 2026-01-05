package p001o;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class ryh implements uyh, Comparable, Serializable {

    /* renamed from: a */
    public final Object f44265a;

    /* renamed from: b */
    public final Object f44266b;

    public ryh(Object obj, Object obj2) {
        this.f44265a = obj;
        this.f44266b = obj2;
    }

    /* renamed from: m */
    public static int m47299m(ryh ryhVar, ryh ryhVar2) {
        int iCompareTo = ((Comparable) ryhVar.f44265a).compareTo(ryhVar2.f44265a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = ((Comparable) ryhVar.f44266b).compareTo(ryhVar2.f44266b);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ryh)) {
            return false;
        }
        ryh ryhVar = (ryh) obj;
        return Objects.equals(this.f44265a, ryhVar.f44265a) && Objects.equals(this.f44266b, ryhVar.f44266b);
    }

    /* renamed from: g */
    public Object m47300g() {
        return this.f44265a;
    }

    /* renamed from: h */
    public Object m47301h() {
        return this.f44266b;
    }

    public int hashCode() {
        return uyh.m52167a(this.f44265a, this.f44266b);
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(ryh ryhVar) {
        return m47299m(this, ryhVar);
    }

    public String toString() {
        return "(" + this.f44265a + ", " + this.f44266b + ")";
    }
}
