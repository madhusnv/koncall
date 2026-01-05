package androidx.compose.foundation;

import i1.f0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class FocusableElement extends a1 {

    /* renamed from: a */
    public final InterfaceC4630l f1900a;

    public FocusableElement(InterfaceC4630l interfaceC4630l) {
        this.f1900a = interfaceC4630l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return AbstractC4154l.m8918a(this.f1900a, ((FocusableElement) obj).f1900a);
        }
        return false;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new f0(this.f1900a, 1, null);
    }

    public final int hashCode() {
        InterfaceC4630l interfaceC4630l = this.f1900a;
        if (interfaceC4630l != null) {
            return interfaceC4630l.hashCode();
        }
        return 0;
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((f0) abstractC7878q).Q0(this.f1900a);
    }
}
