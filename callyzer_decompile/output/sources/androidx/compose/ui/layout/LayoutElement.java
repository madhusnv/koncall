package androidx.compose.ui.layout;

import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4154l;
import t3.C7036w;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class LayoutElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2142f f2128a;

    public LayoutElement(InterfaceC2142f interfaceC2142f) {
        this.f2128a = interfaceC2142f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC4154l.m8918a(this.f2128a, ((LayoutElement) obj).f2128a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C7036w c7036w = new C7036w();
        c7036w.f34029q = this.f2128a;
        return c7036w;
    }

    public final int hashCode() {
        return this.f2128a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C7036w) abstractC7878q).f34029q = this.f2128a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f2128a + ')';
    }
}
