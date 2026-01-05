package androidx.compose.foundation.layout;

import o1.s1;
import s4.C6750f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends a1 {

    /* renamed from: a */
    public final float f1960a;

    /* renamed from: b */
    public final float f1961b;

    public UnspecifiedConstraintsElement(float f6, float f10) {
        this.f1960a = f6;
        this.f1961b = f10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return C6750f.m12935a(this.f1960a, unspecifiedConstraintsElement.f1960a) && C6750f.m12935a(this.f1961b, unspecifiedConstraintsElement.f1961b);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        s1 s1Var = new s1();
        s1Var.f25846q = this.f1960a;
        s1Var.f25847r = this.f1961b;
        return s1Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1961b) + (Float.hashCode(this.f1960a) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        s1 s1Var = (s1) abstractC7878q;
        s1Var.f25846q = this.f1960a;
        s1Var.f25847r = this.f1961b;
    }
}
