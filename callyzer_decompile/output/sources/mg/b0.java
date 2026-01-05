package mg;

import java.io.Serializable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractC4745x implements Serializable {

    /* renamed from: a */
    public final AbstractC4745x f23632a;

    public b0(AbstractC4745x abstractC4745x) {
        this.f23632a = abstractC4745x;
    }

    @Override // mg.AbstractC4745x
    /* renamed from: a */
    public final AbstractC4745x mo9613a() {
        return this.f23632a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f23632a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f23632a.equals(((b0) obj).f23632a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f23632a.hashCode();
    }

    public final String toString() {
        return this.f23632a.toString().concat(".reverse()");
    }
}
