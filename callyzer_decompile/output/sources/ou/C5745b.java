package ou;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ou.b */
/* loaded from: classes3.dex */
public final class C5745b extends AbstractC5748e {

    /* renamed from: a */
    public final List f28302a;

    public C5745b(List list) {
        this.f28302a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5745b) && AbstractC4154l.m8918a(this.f28302a, ((C5745b) obj).f28302a);
    }

    public final int hashCode() {
        return this.f28302a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("Completed(steps=", ")", this.f28302a);
    }
}
