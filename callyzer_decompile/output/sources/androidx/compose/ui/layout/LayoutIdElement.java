package androidx.compose.ui.layout;

import kotlin.jvm.internal.AbstractC4154l;
import t3.C7034u;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class LayoutIdElement extends a1 {

    /* renamed from: a */
    public final Object f2129a;

    public LayoutIdElement(Object obj) {
        this.f2129a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && AbstractC4154l.m8918a(this.f2129a, ((LayoutIdElement) obj).f2129a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C7034u c7034u = new C7034u();
        c7034u.f34026q = this.f2129a;
        return c7034u;
    }

    public final int hashCode() {
        return this.f2129a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C7034u) abstractC7878q).f34026q = this.f2129a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f2129a + ')';
    }
}
