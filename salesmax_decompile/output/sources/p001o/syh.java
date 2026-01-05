package p001o;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class syh implements uyh, Comparable, Serializable {

    /* renamed from: a */
    public final Object f46121a;

    /* renamed from: b */
    public final Object f46122b;

    /* renamed from: c */
    public final Object f46123c;

    public syh(Object obj, Object obj2, Object obj3) {
        this.f46121a = obj;
        this.f46122b = obj2;
        this.f46123c = obj3;
    }

    /* renamed from: h */
    public static int m49084h(syh syhVar, syh syhVar2) {
        int iCompareTo = ((Comparable) syhVar.f46121a).compareTo(syhVar2.f46121a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = ((Comparable) syhVar.f46122b).compareTo(syhVar2.f46122b);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = ((Comparable) syhVar.f46123c).compareTo(syhVar2.f46123c);
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof syh)) {
            return false;
        }
        syh syhVar = (syh) obj;
        return Objects.equals(this.f46121a, syhVar.f46121a) && Objects.equals(this.f46122b, syhVar.f46122b) && Objects.equals(this.f46123c, syhVar.f46123c);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(syh syhVar) {
        return m49084h(this, syhVar);
    }

    public int hashCode() {
        return uyh.m52170e(this.f46121a, this.f46122b, this.f46123c);
    }

    public String toString() {
        return "(" + this.f46121a + ", " + this.f46122b + ", " + this.f46123c + ")";
    }
}
