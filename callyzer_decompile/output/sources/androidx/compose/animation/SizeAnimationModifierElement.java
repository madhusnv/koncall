package androidx.compose.animation;

import g1.e1;
import v3.a1;
import w2.AbstractC7878q;
import w2.C7864c;
import w2.C7871j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends a1 {

    /* renamed from: a */
    public final h1.a1 f1881a;

    public SizeAnimationModifierElement(h1.a1 a1Var) {
        this.f1881a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement) || !this.f1881a.equals(((SizeAnimationModifierElement) obj).f1881a)) {
            return false;
        }
        C7871j c7871j = C7864c.f37642a;
        return c7871j.equals(c7871j);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new e1(this.f1881a);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f1881a.hashCode() * 31)) * 31;
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((e1) abstractC7878q).f10974q = this.f1881a;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f1881a + ", alignment=" + C7864c.f37642a + ", finishedListener=null)";
    }
}
