package qv;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.w */
/* loaded from: classes3.dex */
public final class C6348w extends AbstractC6349x {

    /* renamed from: a */
    public final List f30742a;

    public C6348w(List simUiModel) {
        AbstractC4154l.m8923f(simUiModel, "simUiModel");
        this.f30742a = simUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6348w) && AbstractC4154l.m8918a(this.f30742a, ((C6348w) obj).f30742a);
    }

    public final int hashCode() {
        return this.f30742a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("UpdateSIM(simUiModel=", ")", this.f30742a);
    }
}
