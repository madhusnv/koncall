package p001o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class pp3 extends mfc implements Serializable {

    /* renamed from: a */
    public final Comparator[] f40364a;

    public pp3(Comparator comparator, Comparator comparator2) {
        this.f40364a = new Comparator[]{comparator, comparator2};
    }

    @Override // p001o.mfc, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f40364a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pp3) {
            return Arrays.equals(this.f40364a, ((pp3) obj).f40364a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f40364a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f40364a) + ")";
    }
}
