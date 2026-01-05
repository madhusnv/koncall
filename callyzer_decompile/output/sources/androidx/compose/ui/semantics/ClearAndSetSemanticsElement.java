package androidx.compose.ui.semantics;

import d4.C1575c;
import d4.C1583k;
import d4.InterfaceC1585m;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends a1 implements InterfaceC1585m {

    /* renamed from: a */
    public final InterfaceC2139c f2141a;

    public ClearAndSetSemanticsElement(InterfaceC2139c interfaceC2139c) {
        this.f2141a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && AbstractC4154l.m8918a(this.f2141a, ((ClearAndSetSemanticsElement) obj).f2141a);
    }

    @Override // d4.InterfaceC1585m
    /* renamed from: g */
    public final C1583k mo727g() {
        C1583k c1583k = new C1583k();
        c1583k.f7870c = false;
        c1583k.f7871d = true;
        this.f2141a.invoke(c1583k);
        return c1583k;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C1575c(false, true, this.f2141a);
    }

    public final int hashCode() {
        return this.f2141a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C1575c) abstractC7878q).f7831s = this.f2141a;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f2141a + ')';
    }
}
