package u2;

import ex.InterfaceC2139c;
import l4.C4367l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.f */
/* loaded from: classes.dex */
public final class C7309f extends AbstractC7311h {

    /* renamed from: e */
    public final InterfaceC2139c f34869e;

    /* renamed from: f */
    public final AbstractC7311h f34870f;

    public C7309f(long j6, C7315l c7315l, InterfaceC2139c interfaceC2139c, AbstractC7311h abstractC7311h) {
        super(j6, c7315l);
        this.f34869e = interfaceC2139c;
        this.f34870f = abstractC7311h;
        abstractC7311h.mo13642k();
    }

    @Override // u2.AbstractC7311h
    /* renamed from: c */
    public final void mo13641c() {
        AbstractC7311h abstractC7311h = this.f34870f;
        if (this.f34875c) {
            return;
        }
        if (this.f34874b != abstractC7311h.mo13652g()) {
            m13668a();
        }
        abstractC7311h.mo13643l();
        this.f34875c = true;
        synchronized (AbstractC7316m.f34890b) {
            m13670o();
        }
    }

    @Override // u2.AbstractC7311h
    /* renamed from: e */
    public final InterfaceC2139c mo13650e() {
        return this.f34869e;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: f */
    public final boolean mo13651f() {
        return true;
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
    /* renamed from: n */
    public final void mo13655n(InterfaceC7328y interfaceC7328y) {
        C4367l c4367l = AbstractC7316m.f34889a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // u2.AbstractC7311h
    /* renamed from: u */
    public final AbstractC7311h mo13645u(InterfaceC2139c interfaceC2139c) {
        return new C7309f(this.f34874b, this.f34873a, AbstractC7316m.m13687l(interfaceC2139c, this.f34869e, true), this.f34870f);
    }

    @Override // u2.AbstractC7311h
    /* renamed from: m */
    public final void mo13644m() {
    }
}
