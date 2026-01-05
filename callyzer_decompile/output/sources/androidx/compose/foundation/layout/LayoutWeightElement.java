package androidx.compose.foundation.layout;

import o1.d1;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends a1 {

    /* renamed from: a */
    public final float f1946a;

    /* renamed from: b */
    public final boolean f1947b;

    public LayoutWeightElement(float f6, boolean z6) {
        this.f1946a = f6;
        this.f1947b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f1946a == layoutWeightElement.f1946a && this.f1947b == layoutWeightElement.f1947b;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        d1 d1Var = new d1();
        d1Var.f25715q = this.f1946a;
        d1Var.f25716r = this.f1947b;
        return d1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1947b) + (Float.hashCode(this.f1946a) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        d1 d1Var = (d1) abstractC7878q;
        d1Var.f25715q = this.f1946a;
        d1Var.f25716r = this.f1947b;
    }
}
