package androidx.compose.foundation.layout;

import o1.b1;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends a1 {

    /* renamed from: a */
    public final o1.a1 f1945a;

    public IntrinsicWidthElement(o1.a1 a1Var) {
        this.f1945a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f1945a == intrinsicWidthElement.f1945a;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        b1 b1Var = new b1();
        b1Var.f25702q = this.f1945a;
        b1Var.f25703r = true;
        return b1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1945a.hashCode() * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        b1 b1Var = (b1) abstractC7878q;
        b1Var.f25702q = this.f1945a;
        b1Var.f25703r = true;
    }
}
