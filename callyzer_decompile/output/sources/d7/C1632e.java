package d7;

import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.e */
/* loaded from: classes.dex */
public final class C1632e implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ int f8097a;

    /* renamed from: b */
    public final Object f8098b;

    public /* synthetic */ C1632e(int i10, Object obj) {
        this.f8097a = i10;
        this.f8098b = obj;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        switch (this.f8097a) {
            case 0:
                new HashMap();
                InterfaceC1636i[] interfaceC1636iArr = (InterfaceC1636i[]) this.f8098b;
                if (interfaceC1636iArr.length > 0) {
                    InterfaceC1636i interfaceC1636i = interfaceC1636iArr[0];
                    throw null;
                }
                if (interfaceC1636iArr.length <= 0) {
                    return;
                }
                InterfaceC1636i interfaceC1636i2 = interfaceC1636iArr[0];
                throw null;
            default:
                if (enumC1644p == EnumC1644p.ON_CREATE) {
                    interfaceC1649u.getLifecycle().mo5346d(this);
                    ((r0) this.f8098b).m5347b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1644p).toString());
                }
        }
    }
}
