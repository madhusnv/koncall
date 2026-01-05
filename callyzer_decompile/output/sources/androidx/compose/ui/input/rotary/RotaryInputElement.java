package androidx.compose.ui.input.rotary;

import r3.C6444a;
import v3.a1;
import w2.AbstractC7878q;
import w3.C7898p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class RotaryInputElement extends a1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        Object obj2 = C7898p.f37911d;
        return obj2.equals(obj2);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C7898p c7898p = C7898p.f37911d;
        C6444a c6444a = new C6444a();
        c6444a.f31099q = c7898p;
        return c6444a;
    }

    public final int hashCode() {
        return C7898p.f37911d.hashCode() * 31;
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C6444a) abstractC7878q).f31099q = C7898p.f37911d;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C7898p.f37911d + ", onPreRotaryScrollEvent=null)";
    }
}
