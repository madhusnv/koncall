package l5;

import k5.C4013h;
import k5.C4016k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.h */
/* loaded from: classes.dex */
public final class C4389h extends AbstractC4398q {
    @Override // l5.InterfaceC4385d
    /* renamed from: a */
    public final void mo9155a(InterfaceC4385d interfaceC4385d) {
        C4387f c4387f = this.f21988h;
        if (c4387f.f21962c && !c4387f.f21969j) {
            c4387f.mo9165d((int) ((((C4387f) c4387f.f21971l.get(0)).f21966g * ((C4016k) this.f21982b).f44404d0) + 0.5f));
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: d */
    public final void mo9156d() {
        C4013h c4013h = this.f21982b;
        C4016k c4016k = (C4016k) c4013h;
        int i10 = c4016k.f44405e0;
        int i11 = c4016k.f44406f0;
        int i12 = c4016k.f44408h0;
        C4387f c4387f = this.f21988h;
        if (i12 == 1) {
            if (i10 != -1) {
                c4387f.f21971l.add(c4013h.f20742J.f20762d.f21988h);
                this.f21982b.f20742J.f20762d.f21988h.f21970k.add(c4387f);
                c4387f.f21965f = i10;
            } else if (i11 != -1) {
                c4387f.f21971l.add(c4013h.f20742J.f20762d.f21989i);
                this.f21982b.f20742J.f20762d.f21989i.f21970k.add(c4387f);
                c4387f.f21965f = -i11;
            } else {
                c4387f.f21961b = true;
                c4387f.f21971l.add(c4013h.f20742J.f20762d.f21989i);
                this.f21982b.f20742J.f20762d.f21989i.f21970k.add(c4387f);
            }
            m9166m(this.f21982b.f20762d.f21988h);
            m9166m(this.f21982b.f20762d.f21989i);
            return;
        }
        if (i10 != -1) {
            c4387f.f21971l.add(c4013h.f20742J.f20763e.f21988h);
            this.f21982b.f20742J.f20763e.f21988h.f21970k.add(c4387f);
            c4387f.f21965f = i10;
        } else if (i11 != -1) {
            c4387f.f21971l.add(c4013h.f20742J.f20763e.f21989i);
            this.f21982b.f20742J.f20763e.f21989i.f21970k.add(c4387f);
            c4387f.f21965f = -i11;
        } else {
            c4387f.f21961b = true;
            c4387f.f21971l.add(c4013h.f20742J.f20763e.f21989i);
            this.f21982b.f20742J.f20763e.f21989i.f21970k.add(c4387f);
        }
        m9166m(this.f21982b.f20763e.f21988h);
        m9166m(this.f21982b.f20763e.f21989i);
    }

    @Override // l5.AbstractC4398q
    /* renamed from: e */
    public final void mo9157e() {
        C4013h c4013h = this.f21982b;
        int i10 = ((C4016k) c4013h).f44408h0;
        C4387f c4387f = this.f21988h;
        if (i10 == 1) {
            c4013h.f20747O = c4387f.f21966g;
        } else {
            c4013h.f20748P = c4387f.f21966g;
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: f */
    public final void mo9158f() {
        this.f21988h.m9164c();
    }

    @Override // l5.AbstractC4398q
    /* renamed from: k */
    public final boolean mo9160k() {
        return false;
    }

    /* renamed from: m */
    public final void m9166m(C4387f c4387f) {
        C4387f c4387f2 = this.f21988h;
        c4387f2.f21970k.add(c4387f);
        c4387f.f21971l.add(c4387f2);
    }
}
