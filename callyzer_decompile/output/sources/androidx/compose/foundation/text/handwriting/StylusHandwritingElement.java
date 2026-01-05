package androidx.compose.foundation.text.handwriting;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;
import y1.C8529a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class StylusHandwritingElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2137a f2029a;

    public StylusHandwritingElement(InterfaceC2137a interfaceC2137a) {
        this.f2029a = interfaceC2137a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && AbstractC4154l.m8918a(this.f2029a, ((StylusHandwritingElement) obj).f2029a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C8529a(this.f2029a);
    }

    public final int hashCode() {
        return this.f2029a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C8529a) abstractC7878q).f41452s = this.f2029a;
    }

    public final String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.f2029a + ')';
    }
}
