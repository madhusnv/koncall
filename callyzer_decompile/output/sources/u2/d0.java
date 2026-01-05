package u2;

import ex.InterfaceC2139c;
import l4.C4367l;
import s2.AbstractC6740i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends AbstractC7311h {

    /* renamed from: e */
    public final AbstractC7311h f34863e;

    /* renamed from: f */
    public final boolean f34864f;

    /* renamed from: g */
    public InterfaceC2139c f34865g;

    /* renamed from: h */
    public final long f34866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(AbstractC7311h abstractC7311h, InterfaceC2139c interfaceC2139c, boolean z6) {
        InterfaceC2139c interfaceC2139cMo13650e;
        super(0L, C7315l.f34884e);
        C4367l c4367l = AbstractC7316m.f34889a;
        this.f34863e = abstractC7311h;
        this.f34864f = z6;
        this.f34865g = AbstractC7316m.m13687l(interfaceC2139c, (abstractC7311h == null || (interfaceC2139cMo13650e = abstractC7311h.mo13650e()) == null) ? AbstractC7316m.f34897i.f34854e : interfaceC2139cMo13650e, false);
        this.f34866h = AbstractC6740i.m12900b();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: c */
    public final void mo13641c() {
        AbstractC7311h abstractC7311h;
        this.f34875c = true;
        if (!this.f34864f || (abstractC7311h = this.f34863e) == null) {
            return;
        }
        abstractC7311h.mo13641c();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: d */
    public final C7315l mo13649d() {
        return m13666v().mo13649d();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: e */
    public final InterfaceC2139c mo13650e() {
        return this.f34865g;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: f */
    public final boolean mo13651f() {
        return m13666v().mo13651f();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: g */
    public final long mo13652g() {
        return m13666v().mo13652g();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: i */
    public final InterfaceC2139c mo13654i() {
        return null;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: k */
    public final void mo13642k() {
        AbstractC7321r.m13710g();
        throw null;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: l */
    public final void mo13643l() {
        AbstractC7321r.m13710g();
        throw null;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: m */
    public final void mo13644m() {
        m13666v().mo13644m();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: n */
    public final void mo13655n(InterfaceC7328y interfaceC7328y) {
        m13666v().mo13655n(interfaceC7328y);
    }

    @Override // u2.AbstractC7311h
    /* renamed from: u */
    public final AbstractC7311h mo13645u(InterfaceC2139c interfaceC2139c) {
        return AbstractC7316m.m13683h(m13666v().mo13645u(null), AbstractC7316m.m13687l(interfaceC2139c, this.f34865g, true), true);
    }

    /* renamed from: v */
    public final AbstractC7311h m13666v() {
        AbstractC7311h abstractC7311h = this.f34863e;
        return abstractC7311h == null ? AbstractC7316m.f34897i : abstractC7311h;
    }
}
