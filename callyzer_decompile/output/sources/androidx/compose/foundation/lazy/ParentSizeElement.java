package androidx.compose.foundation.lazy;

import k2.b1;
import kotlin.jvm.internal.AbstractC4154l;
import q1.c0;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class ParentSizeElement extends a1 {

    /* renamed from: a */
    public final b1 f1978a;

    public ParentSizeElement(b1 b1Var) {
        this.f1978a = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParentSizeElement) && AbstractC4154l.m8918a(this.f1978a, ((ParentSizeElement) obj).f1978a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        c0 c0Var = new c0();
        c0Var.f29641q = 1.0f;
        c0Var.f29642r = this.f1978a;
        return c0Var;
    }

    public final int hashCode() {
        b1 b1Var = this.f1978a;
        return Float.hashCode(1.0f) + ((b1Var != null ? b1Var.hashCode() : 0) * 961);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        c0 c0Var = (c0) abstractC7878q;
        c0Var.f29641q = 1.0f;
        c0Var.f29642r = this.f1978a;
    }
}
