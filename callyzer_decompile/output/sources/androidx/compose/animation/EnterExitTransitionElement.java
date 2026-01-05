package androidx.compose.animation;

import ex.InterfaceC2137a;
import g1.g0;
import g1.t0;
import g1.u0;
import g1.v0;
import h1.m1;
import h1.s1;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends a1 {

    /* renamed from: a */
    public final s1 f1873a;

    /* renamed from: b */
    public final m1 f1874b;

    /* renamed from: c */
    public final m1 f1875c;

    /* renamed from: d */
    public final m1 f1876d;

    /* renamed from: e */
    public final u0 f1877e;

    /* renamed from: f */
    public final v0 f1878f;

    /* renamed from: g */
    public final InterfaceC2137a f1879g;

    /* renamed from: h */
    public final g0 f1880h;

    public EnterExitTransitionElement(s1 s1Var, m1 m1Var, m1 m1Var2, m1 m1Var3, u0 u0Var, v0 v0Var, InterfaceC2137a interfaceC2137a, g0 g0Var) {
        this.f1873a = s1Var;
        this.f1874b = m1Var;
        this.f1875c = m1Var2;
        this.f1876d = m1Var3;
        this.f1877e = u0Var;
        this.f1878f = v0Var;
        this.f1879g = interfaceC2137a;
        this.f1880h = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return AbstractC4154l.m8918a(this.f1873a, enterExitTransitionElement.f1873a) && AbstractC4154l.m8918a(this.f1874b, enterExitTransitionElement.f1874b) && AbstractC4154l.m8918a(this.f1875c, enterExitTransitionElement.f1875c) && AbstractC4154l.m8918a(this.f1876d, enterExitTransitionElement.f1876d) && AbstractC4154l.m8918a(this.f1877e, enterExitTransitionElement.f1877e) && AbstractC4154l.m8918a(this.f1878f, enterExitTransitionElement.f1878f) && AbstractC4154l.m8918a(this.f1879g, enterExitTransitionElement.f1879g) && AbstractC4154l.m8918a(this.f1880h, enterExitTransitionElement.f1880h);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new t0(this.f1873a, this.f1874b, this.f1875c, this.f1876d, this.f1877e, this.f1878f, this.f1879g, this.f1880h);
    }

    public final int hashCode() {
        int iHashCode = this.f1873a.hashCode() * 31;
        m1 m1Var = this.f1874b;
        int iHashCode2 = (iHashCode + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        m1 m1Var2 = this.f1875c;
        int iHashCode3 = (iHashCode2 + (m1Var2 == null ? 0 : m1Var2.hashCode())) * 31;
        m1 m1Var3 = this.f1876d;
        return this.f1880h.hashCode() + ((this.f1879g.hashCode() + ((this.f1878f.f11104a.hashCode() + ((this.f1877e.f11095a.hashCode() + ((iHashCode3 + (m1Var3 != null ? m1Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        t0 t0Var = (t0) abstractC7878q;
        t0Var.f11076q = this.f1873a;
        t0Var.f11077r = this.f1874b;
        t0Var.f11078s = this.f1875c;
        t0Var.f11079t = this.f1876d;
        t0Var.f11080v = this.f1877e;
        t0Var.f11081w = this.f1878f;
        t0Var.f11082x = this.f1879g;
        t0Var.f11083y = this.f1880h;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f1873a + ", sizeAnimation=" + this.f1874b + ", offsetAnimation=" + this.f1875c + ", slideAnimation=" + this.f1876d + ", enter=" + this.f1877e + ", exit=" + this.f1878f + ", isEnabled=" + this.f1879g + ", graphicsLayerBlock=" + this.f1880h + ')';
    }
}
