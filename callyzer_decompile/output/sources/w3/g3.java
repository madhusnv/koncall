package w3;

import com.websoptimization.callyzerbiz.R;
import d7.AbstractC1646r;
import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import ex.InterfaceC2141e;
import k2.C3972u;
import k2.InterfaceC3968q;
import r1.C6431p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g3 implements InterfaceC3968q, InterfaceC1647s {

    /* renamed from: a */
    public final C7904v f37798a;

    /* renamed from: b */
    public final C3972u f37799b;

    /* renamed from: c */
    public boolean f37800c;

    /* renamed from: d */
    public AbstractC1646r f37801d;

    /* renamed from: e */
    public InterfaceC2141e f37802e = i1.f37808a;

    public g3(C7904v c7904v, C3972u c3972u) {
        this.f37798a = c7904v;
        this.f37799b = c3972u;
    }

    /* renamed from: a */
    public final void m14954a(InterfaceC2141e interfaceC2141e) {
        this.f37798a.setOnViewTreeOwnersAvailable(new C6431p(28, this, interfaceC2141e));
    }

    @Override // k2.InterfaceC3968q
    public final void dispose() {
        if (!this.f37800c) {
            this.f37800c = true;
            this.f37798a.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC1646r abstractC1646r = this.f37801d;
            if (abstractC1646r != null) {
                abstractC1646r.mo5346d(this);
            }
        }
        this.f37799b.dispose();
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        if (enumC1644p == EnumC1644p.ON_DESTROY) {
            dispose();
        } else {
            if (enumC1644p != EnumC1644p.ON_CREATE || this.f37800c) {
                return;
            }
            m14954a(this.f37802e);
        }
    }
}
