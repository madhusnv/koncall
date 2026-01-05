package k2;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements k2 {

    /* renamed from: a */
    public final AbstractC4155m f20344a;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(InterfaceC2139c interfaceC2139c) {
        this.f20344a = (AbstractC4155m) interfaceC2139c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // k2.k2
    /* renamed from: a */
    public final Object mo8487a(i1 i1Var) {
        return this.f20344a.invoke(i1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.f20344a.equals(((a0) obj).f20344a);
    }

    public final int hashCode() {
        return this.f20344a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f20344a + ')';
    }
}
