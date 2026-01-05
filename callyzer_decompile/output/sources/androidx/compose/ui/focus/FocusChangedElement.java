package androidx.compose.ui.focus;

import b3.C0571c;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class FocusChangedElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2102a;

    public FocusChangedElement(InterfaceC2139c interfaceC2139c) {
        this.f2102a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && AbstractC4154l.m8918a(this.f2102a, ((FocusChangedElement) obj).f2102a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0571c c0571c = new C0571c();
        c0571c.f3898q = this.f2102a;
        return c0571c;
    }

    public final int hashCode() {
        return this.f2102a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C0571c) abstractC7878q).f3898q = this.f2102a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f2102a + ')';
    }
}
