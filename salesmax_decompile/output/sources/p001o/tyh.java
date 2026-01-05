package p001o;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class tyh implements uyh, Comparable, Serializable {

    /* renamed from: a */
    public final Object f48095a;

    /* renamed from: b */
    public final Object f48096b;

    /* renamed from: c */
    public final Object f48097c;

    /* renamed from: d */
    public final Object f48098d;

    /* renamed from: e */
    public final Object f48099e;

    public tyh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f48095a = obj;
        this.f48096b = obj2;
        this.f48097c = obj3;
        this.f48098d = obj4;
        this.f48099e = obj5;
    }

    /* renamed from: h */
    public static int m50789h(tyh tyhVar, tyh tyhVar2) {
        int iCompareTo = ((Comparable) tyhVar.f48095a).compareTo(tyhVar2.f48095a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = ((Comparable) tyhVar.f48096b).compareTo(tyhVar2.f48096b);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = ((Comparable) tyhVar.f48097c).compareTo(tyhVar2.f48097c);
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        int iCompareTo4 = ((Comparable) tyhVar.f48098d).compareTo(tyhVar2.f48098d);
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        int iCompareTo5 = ((Comparable) tyhVar.f48099e).compareTo(tyhVar2.f48099e);
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tyh)) {
            return false;
        }
        tyh tyhVar = (tyh) obj;
        return Objects.equals(this.f48095a, tyhVar.f48095a) && Objects.equals(this.f48096b, tyhVar.f48096b) && Objects.equals(this.f48097c, tyhVar.f48097c) && Objects.equals(this.f48098d, tyhVar.f48098d) && Objects.equals(this.f48099e, tyhVar.f48099e);
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(tyh tyhVar) {
        return m50789h(this, tyhVar);
    }

    public int hashCode() {
        return uyh.m52169d(this.f48095a, this.f48096b, this.f48097c, this.f48098d, this.f48099e);
    }

    public String toString() {
        return "(" + this.f48095a + ", " + this.f48096b + ", " + this.f48097c + ", " + this.f48098d + ", " + this.f48099e + ")";
    }
}
