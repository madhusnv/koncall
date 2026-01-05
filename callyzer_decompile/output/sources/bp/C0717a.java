package bp;

import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import ex.InterfaceC2141e;
import k2.w0;
import vv.AbstractC7791c;
import vv.AbstractC7793e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bp.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0717a implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ int f4533a;

    /* renamed from: b */
    public final /* synthetic */ w0 f4534b;

    public /* synthetic */ C0717a(w0 w0Var, int i10) {
        this.f4533a = i10;
        this.f4534b = w0Var;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        switch (this.f4533a) {
            case 0:
                ((InterfaceC2141e) this.f4534b.getValue()).invoke(interfaceC1649u, enumC1644p);
                break;
            case 1:
                if (AbstractC7791c.f37463a[enumC1644p.ordinal()] == 1) {
                    this.f4534b.setValue(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (AbstractC7793e.f37465a[enumC1644p.ordinal()] == 1) {
                    this.f4534b.setValue(Boolean.TRUE);
                    break;
                }
                break;
        }
    }
}
