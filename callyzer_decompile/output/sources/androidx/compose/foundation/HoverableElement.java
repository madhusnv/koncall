package androidx.compose.foundation;

import i1.n0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class HoverableElement extends a1 {

    /* renamed from: a */
    public final InterfaceC4630l f1901a;

    public HoverableElement(InterfaceC4630l interfaceC4630l) {
        this.f1901a = interfaceC4630l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && AbstractC4154l.m8918a(((HoverableElement) obj).f1901a, this.f1901a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        n0 n0Var = new n0();
        n0Var.f16933q = this.f1901a;
        return n0Var;
    }

    public final int hashCode() {
        return this.f1901a.hashCode() * 31;
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        n0 n0Var = (n0) abstractC7878q;
        InterfaceC4630l interfaceC4630l = n0Var.f16933q;
        InterfaceC4630l interfaceC4630l2 = this.f1901a;
        if (AbstractC4154l.m8918a(interfaceC4630l, interfaceC4630l2)) {
            return;
        }
        n0Var.N0();
        n0Var.f16933q = interfaceC4630l2;
    }
}
