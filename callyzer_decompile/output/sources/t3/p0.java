package t3;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import v3.AbstractC7634f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 implements j0 {

    /* renamed from: a */
    public final o0 f34015a;

    public p0(o0 o0Var) {
        this.f34015a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && AbstractC4154l.m8918a(this.f34015a, ((p0) obj).f34015a);
    }

    public final int hashCode() {
        return this.f34015a.hashCode();
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return this.f34015a.maxIntrinsicHeight(interfaceC7028o, AbstractC7634f.m14550k(interfaceC7028o), i10);
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return this.f34015a.maxIntrinsicWidth(interfaceC7028o, AbstractC7634f.m14550k(interfaceC7028o), i10);
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final k0 mo16554measure3p2s80s(l0 l0Var, List list, long j6) {
        return this.f34015a.mo16690measure3p2s80s(l0Var, AbstractC7634f.m14550k(l0Var), j6);
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return this.f34015a.minIntrinsicHeight(interfaceC7028o, AbstractC7634f.m14550k(interfaceC7028o), i10);
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        return this.f34015a.minIntrinsicWidth(interfaceC7028o, AbstractC7634f.m14550k(interfaceC7028o), i10);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f34015a + ')';
    }
}
