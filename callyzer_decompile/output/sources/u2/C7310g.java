package u2;

import ex.InterfaceC2139c;
import l4.C4367l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.g */
/* loaded from: classes.dex */
public final class C7310g extends AbstractC7311h {

    /* renamed from: e */
    public final InterfaceC2139c f34871e;

    /* renamed from: f */
    public int f34872f;

    public C7310g(long j6, C7315l c7315l, InterfaceC2139c interfaceC2139c) {
        super(j6, c7315l);
        this.f34871e = interfaceC2139c;
        this.f34872f = 1;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: c */
    public final void mo13641c() {
        if (this.f34875c) {
            return;
        }
        mo13643l();
        this.f34875c = true;
        synchronized (AbstractC7316m.f34890b) {
            m13670o();
        }
    }

    @Override // u2.AbstractC7311h
    /* renamed from: e */
    public final InterfaceC2139c mo13650e() {
        return this.f34871e;
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
        this.f34872f++;
    }

    @Override // u2.AbstractC7311h
    /* renamed from: l */
    public final void mo13643l() {
        int i10 = this.f34872f - 1;
        this.f34872f = i10;
        if (i10 == 0) {
            m13668a();
        }
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
        AbstractC7316m.m13679d(this);
        return new C7309f(this.f34874b, this.f34873a, AbstractC7316m.m13687l(interfaceC2139c, this.f34871e, true), this);
    }

    @Override // u2.AbstractC7311h
    /* renamed from: m */
    public final void mo13644m() {
    }
}
