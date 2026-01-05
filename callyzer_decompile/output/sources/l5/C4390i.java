package l5;

import java.util.ArrayList;
import k5.C4006a;
import k5.C4013h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.i */
/* loaded from: classes.dex */
public final class C4390i extends AbstractC4398q {
    @Override // l5.InterfaceC4385d
    /* renamed from: a */
    public final void mo9155a(InterfaceC4385d interfaceC4385d) {
        C4006a c4006a = (C4006a) this.f21982b;
        int i10 = c4006a.f44383f0;
        C4387f c4387f = this.f21988h;
        ArrayList arrayList = c4387f.f21971l;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            int i14 = ((C4387f) obj).f21966g;
            if (i12 == -1 || i14 < i12) {
                i12 = i14;
            }
            if (i11 < i14) {
                i11 = i14;
            }
        }
        if (i10 == 0 || i10 == 2) {
            c4387f.mo9165d(i12 + c4006a.f44385h0);
        } else {
            c4387f.mo9165d(i11 + c4006a.f44385h0);
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: d */
    public final void mo9156d() {
        C4013h c4013h = this.f21982b;
        if (c4013h instanceof C4006a) {
            C4387f c4387f = this.f21988h;
            c4387f.f21961b = true;
            ArrayList arrayList = c4387f.f21971l;
            C4006a c4006a = (C4006a) c4013h;
            int i10 = c4006a.f44383f0;
            boolean z6 = c4006a.f44384g0;
            int i11 = 0;
            if (i10 == 0) {
                c4387f.f21964e = EnumC4386e.LEFT;
                while (i11 < c4006a.f44382e0) {
                    C4013h c4013h2 = c4006a.f44381d0[i11];
                    if (z6 || c4013h2.f20755W != 8) {
                        C4387f c4387f2 = c4013h2.f20762d.f21988h;
                        c4387f2.f21970k.add(c4387f);
                        arrayList.add(c4387f2);
                    }
                    i11++;
                }
                m9167m(this.f21982b.f20762d.f21988h);
                m9167m(this.f21982b.f20762d.f21989i);
                return;
            }
            if (i10 == 1) {
                c4387f.f21964e = EnumC4386e.RIGHT;
                while (i11 < c4006a.f44382e0) {
                    C4013h c4013h3 = c4006a.f44381d0[i11];
                    if (z6 || c4013h3.f20755W != 8) {
                        C4387f c4387f3 = c4013h3.f20762d.f21989i;
                        c4387f3.f21970k.add(c4387f);
                        arrayList.add(c4387f3);
                    }
                    i11++;
                }
                m9167m(this.f21982b.f20762d.f21988h);
                m9167m(this.f21982b.f20762d.f21989i);
                return;
            }
            if (i10 == 2) {
                c4387f.f21964e = EnumC4386e.TOP;
                while (i11 < c4006a.f44382e0) {
                    C4013h c4013h4 = c4006a.f44381d0[i11];
                    if (z6 || c4013h4.f20755W != 8) {
                        C4387f c4387f4 = c4013h4.f20763e.f21988h;
                        c4387f4.f21970k.add(c4387f);
                        arrayList.add(c4387f4);
                    }
                    i11++;
                }
                m9167m(this.f21982b.f20763e.f21988h);
                m9167m(this.f21982b.f20763e.f21989i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            c4387f.f21964e = EnumC4386e.BOTTOM;
            while (i11 < c4006a.f44382e0) {
                C4013h c4013h5 = c4006a.f44381d0[i11];
                if (z6 || c4013h5.f20755W != 8) {
                    C4387f c4387f5 = c4013h5.f20763e.f21989i;
                    c4387f5.f21970k.add(c4387f);
                    arrayList.add(c4387f5);
                }
                i11++;
            }
            m9167m(this.f21982b.f20763e.f21988h);
            m9167m(this.f21982b.f20763e.f21989i);
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: e */
    public final void mo9157e() {
        C4013h c4013h = this.f21982b;
        if (c4013h instanceof C4006a) {
            int i10 = ((C4006a) c4013h).f44383f0;
            C4387f c4387f = this.f21988h;
            if (i10 == 0 || i10 == 1) {
                c4013h.f20747O = c4387f.f21966g;
            } else {
                c4013h.f20748P = c4387f.f21966g;
            }
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: f */
    public final void mo9158f() {
        this.f21983c = null;
        this.f21988h.m9164c();
    }

    @Override // l5.AbstractC4398q
    /* renamed from: k */
    public final boolean mo9160k() {
        return false;
    }

    /* renamed from: m */
    public final void m9167m(C4387f c4387f) {
        C4387f c4387f2 = this.f21988h;
        c4387f2.f21970k.add(c4387f);
        c4387f.f21971l.add(c4387f2);
    }
}
