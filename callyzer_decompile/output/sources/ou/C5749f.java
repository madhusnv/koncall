package ou;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ou.f */
/* loaded from: classes3.dex */
public final class C5749f {

    /* renamed from: a */
    public final List f28306a;

    public C5749f(List featureList) {
        AbstractC4154l.m8923f(featureList, "featureList");
        this.f28306a = featureList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5749f) && AbstractC4154l.m8918a(this.f28306a, ((C5749f) obj).f28306a);
    }

    public final int hashCode() {
        return this.f28306a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("TroubleshootingState(featureList=", ")", this.f28306a);
    }
}
