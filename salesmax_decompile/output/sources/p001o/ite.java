package p001o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ite extends mfc implements Serializable {

    /* renamed from: a */
    public final mfc f29220a;

    public ite(mfc mfcVar) {
        this.f29220a = (mfc) dgd.m23062o(mfcVar);
    }

    @Override // p001o.mfc, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f29220a.compare(obj2, obj);
    }

    @Override // p001o.mfc
    /* renamed from: e */
    public mfc mo29478e() {
        return this.f29220a;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ite) {
            return this.f29220a.equals(((ite) obj).f29220a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f29220a.hashCode();
    }

    public String toString() {
        return this.f29220a + ".reverse()";
    }
}
