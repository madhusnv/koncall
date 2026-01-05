package mg;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.h */
/* loaded from: classes.dex */
public final class C4729h extends AbstractC4745x implements Serializable {

    /* renamed from: a */
    public final Comparator f23645a;

    public C4729h(Comparator comparator) {
        comparator.getClass();
        this.f23645a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f23645a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4729h) {
            return this.f23645a.equals(((C4729h) obj).f23645a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23645a.hashCode();
    }

    public final String toString() {
        return this.f23645a.toString();
    }
}
