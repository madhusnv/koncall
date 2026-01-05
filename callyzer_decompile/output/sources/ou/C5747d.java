package ou;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ou.d */
/* loaded from: classes3.dex */
public final class C5747d extends AbstractC5748e {

    /* renamed from: a */
    public final List f28305a;

    public C5747d(List list) {
        this.f28305a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5747d) && AbstractC4154l.m8918a(this.f28305a, ((C5747d) obj).f28305a);
    }

    public final int hashCode() {
        return this.f28305a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("Running(steps=", ")", this.f28305a);
    }
}
