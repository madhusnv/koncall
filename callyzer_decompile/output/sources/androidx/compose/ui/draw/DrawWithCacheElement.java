package androidx.compose.ui.draw;

import a3.C0044c;
import a3.C0046e;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class DrawWithCacheElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2090a;

    public DrawWithCacheElement(InterfaceC2139c interfaceC2139c) {
        this.f2090a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && AbstractC4154l.m8918a(this.f2090a, ((DrawWithCacheElement) obj).f2090a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C0044c(new C0046e(), this.f2090a);
    }

    public final int hashCode() {
        return this.f2090a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C0044c c0044c = (C0044c) abstractC7878q;
        c0044c.f198s = this.f2090a;
        c0044c.L0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f2090a + ')';
    }
}
