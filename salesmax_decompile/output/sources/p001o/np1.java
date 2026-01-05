package p001o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class np1 extends mfc implements Serializable {

    /* renamed from: a */
    public final ol7 f37126a;

    /* renamed from: b */
    public final mfc f37127b;

    public np1(ol7 ol7Var, mfc mfcVar) {
        this.f37126a = (ol7) dgd.m23062o(ol7Var);
        this.f37127b = (mfc) dgd.m23062o(mfcVar);
    }

    @Override // p001o.mfc, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f37127b.compare(this.f37126a.apply(obj), this.f37126a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof np1)) {
            return false;
        }
        np1 np1Var = (np1) obj;
        return this.f37126a.equals(np1Var.f37126a) && this.f37127b.equals(np1Var.f37127b);
    }

    public int hashCode() {
        return r6c.m46256b(this.f37126a, this.f37127b);
    }

    public String toString() {
        return this.f37127b + ".onResultOf(" + this.f37126a + ")";
    }
}
