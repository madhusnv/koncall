package androidx.compose.ui.focus;

import b3.C0592x;
import b3.C0594z;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class FocusRequesterElement extends a1 {

    /* renamed from: a */
    public final C0592x f2105a;

    public FocusRequesterElement(C0592x c0592x) {
        this.f2105a = c0592x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && AbstractC4154l.m8918a(this.f2105a, ((FocusRequesterElement) obj).f2105a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0594z c0594z = new C0594z();
        c0594z.f3969q = this.f2105a;
        return c0594z;
    }

    public final int hashCode() {
        return this.f2105a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C0594z c0594z = (C0594z) abstractC7878q;
        c0594z.f3969q.f3968a.m9514l(c0594z);
        C0592x c0592x = this.f2105a;
        c0594z.f3969q = c0592x;
        c0592x.f3968a.m9506b(c0594z);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f2105a + ')';
    }
}
