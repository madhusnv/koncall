package androidx.compose.ui.focus;

import b3.C0589u;
import b3.C0591w;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class FocusPropertiesElement extends a1 {

    /* renamed from: a */
    public final C0589u f2104a;

    public FocusPropertiesElement(C0589u c0589u) {
        this.f2104a = c0589u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && AbstractC4154l.m8918a(this.f2104a, ((FocusPropertiesElement) obj).f2104a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0591w c0591w = new C0591w();
        c0591w.f3964q = this.f2104a;
        return c0591w;
    }

    public final int hashCode() {
        return this.f2104a.f3963a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C0591w) abstractC7878q).f3964q = this.f2104a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f2104a + ')';
    }
}
