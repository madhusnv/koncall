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
public final class AppendedSemanticsElement extends a1 implements InterfaceC1585m {

    /* renamed from: a */
    public final boolean f2139a;

    /* renamed from: b */
    public final InterfaceC2139c f2140b;

    public AppendedSemanticsElement(InterfaceC2139c interfaceC2139c, boolean z6) {
        this.f2139a = z6;
        this.f2140b = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f2139a == appendedSemanticsElement.f2139a && AbstractC4154l.m8918a(this.f2140b, appendedSemanticsElement.f2140b);
    }

    @Override // d4.InterfaceC1585m
    /* renamed from: g */
    public final C1583k mo727g() {
        C1583k c1583k = new C1583k();
        c1583k.f7870c = this.f2139a;
        this.f2140b.invoke(c1583k);
        return c1583k;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C1575c(this.f2139a, false, this.f2140b);
    }

    public final int hashCode() {
        return this.f2140b.hashCode() + (Boolean.hashCode(this.f2139a) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C1575c c1575c = (C1575c) abstractC7878q;
        c1575c.f7829q = this.f2139a;
        c1575c.f7831s = this.f2140b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f2139a + ", properties=" + this.f2140b + ')';
    }
}
