package qv;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.q */
/* loaded from: classes3.dex */
public final class C6342q extends AbstractC6349x {

    /* renamed from: a */
    public final List f30736a;

    public C6342q(List simList) {
        AbstractC4154l.m8923f(simList, "simList");
        this.f30736a = simList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6342q) && AbstractC4154l.m8918a(this.f30736a, ((C6342q) obj).f30736a);
    }

    public final int hashCode() {
        return this.f30736a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("AddSIMList(simList=", ")", this.f30736a);
    }
}
