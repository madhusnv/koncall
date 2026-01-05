package androidx.compose.foundation.layout;

import o1.u1;
import v3.a1;
import w2.AbstractC7878q;
import w2.C7870i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class VerticalAlignElement extends a1 {

    /* renamed from: a */
    public final C7870i f1962a;

    public VerticalAlignElement(C7870i c7870i) {
        this.f1962a = c7870i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return this.f1962a.equals(verticalAlignElement.f1962a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        u1 u1Var = new u1();
        u1Var.f25854q = this.f1962a;
        return u1Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1962a.f37661a);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((u1) abstractC7878q).f25854q = this.f1962a;
    }
}
