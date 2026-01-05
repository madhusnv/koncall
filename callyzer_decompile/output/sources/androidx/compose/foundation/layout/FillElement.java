package androidx.compose.foundation.layout;

import o1.EnumC5267z;
import o1.b0;
import v3.a1;
import w2.AbstractC7878q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FillElement extends a1 {

    /* renamed from: a */
    public final EnumC5267z f1942a;

    /* renamed from: b */
    public final float f1943b;

    public FillElement(EnumC5267z enumC5267z, float f6) {
        this.f1942a = enumC5267z;
        this.f1943b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f1942a == fillElement.f1942a && this.f1943b == fillElement.f1943b;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        b0 b0Var = new b0();
        b0Var.f25700q = this.f1942a;
        b0Var.f25701r = this.f1943b;
        return b0Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1943b) + (this.f1942a.hashCode() * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        b0 b0Var = (b0) abstractC7878q;
        b0Var.f25700q = this.f1942a;
        b0Var.f25701r = this.f1943b;
    }
}
