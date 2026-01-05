package hv;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hv.k */
/* loaded from: classes3.dex */
public final class C3046k extends AbstractC3049n {

    /* renamed from: a */
    public final List f16377a;

    public C3046k(List simUiModel) {
        AbstractC4154l.m8923f(simUiModel, "simUiModel");
        this.f16377a = simUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3046k) && AbstractC4154l.m8918a(this.f16377a, ((C3046k) obj).f16377a);
    }

    public final int hashCode() {
        return this.f16377a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("SetSIMDetail(simUiModel=", ")", this.f16377a);
    }
}
