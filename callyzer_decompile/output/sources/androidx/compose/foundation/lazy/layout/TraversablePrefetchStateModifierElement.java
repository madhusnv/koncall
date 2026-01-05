package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.AbstractC4154l;
import s1.h0;
import s1.z0;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends a1 {

    /* renamed from: a */
    public final h0 f1987a;

    public TraversablePrefetchStateModifierElement(h0 h0Var) {
        this.f1987a = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && AbstractC4154l.m8918a(this.f1987a, ((TraversablePrefetchStateModifierElement) obj).f1987a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        z0 z0Var = new z0();
        z0Var.f32171q = this.f1987a;
        return z0Var;
    }

    public final int hashCode() {
        return this.f1987a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((z0) abstractC7878q).f32171q = this.f1987a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f1987a + ')';
    }
}
