package ou;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ou.a */
/* loaded from: classes3.dex */
public final class C5744a {

    /* renamed from: a */
    public final List f28301a;

    public C5744a(List troubleshootStepList) {
        AbstractC4154l.m8923f(troubleshootStepList, "troubleshootStepList");
        this.f28301a = troubleshootStepList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5744a) && AbstractC4154l.m8918a(this.f28301a, ((C5744a) obj).f28301a);
    }

    public final int hashCode() {
        return this.f28301a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("FeatureTroubleshootState(troubleshootStepList=", ")", this.f28301a);
    }
}
