package p001o;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class ek3 extends mfc implements Serializable {

    /* renamed from: a */
    public final Comparator f21783a;

    public ek3(Comparator comparator) {
        this.f21783a = (Comparator) dgd.m23062o(comparator);
    }

    @Override // p001o.mfc, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f21783a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ek3) {
            return this.f21783a.equals(((ek3) obj).f21783a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21783a.hashCode();
    }

    public String toString() {
        return this.f21783a.toString();
    }
}
