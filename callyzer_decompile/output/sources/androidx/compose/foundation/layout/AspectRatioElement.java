package androidx.compose.foundation.layout;

import o1.C5252k;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class AspectRatioElement extends a1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null) == null) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C5252k c5252k = new C5252k();
        c5252k.f25775q = 1.3f;
        return c5252k;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(1.3f) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C5252k) abstractC7878q).f25775q = 1.3f;
    }
}
