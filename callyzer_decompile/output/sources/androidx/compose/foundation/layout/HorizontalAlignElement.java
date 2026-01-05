package androidx.compose.foundation.layout;

import o1.v0;
import v3.a1;
import w2.AbstractC7878q;
import w2.C7869h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends a1 {

    /* renamed from: a */
    public final C7869h f1944a;

    public HorizontalAlignElement(C7869h c7869h) {
        this.f1944a = c7869h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f1944a.equals(horizontalAlignElement.f1944a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        v0 v0Var = new v0();
        v0Var.f25856q = this.f1944a;
        return v0Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1944a.f37660a);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((v0) abstractC7878q).f25856q = this.f1944a;
    }
}
