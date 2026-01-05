package i9;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f17156a;

    /* renamed from: b */
    public final /* synthetic */ l0 f17157b;

    public /* synthetic */ e0(l0 l0Var, int i10) {
        this.f17156a = i10;
        this.f17157b = l0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f17156a) {
            case 0:
                return "using cached token for sso-session: " + this.f17157b.f17201a;
            default:
                return "attempting to refresh token for sso-session: " + this.f17157b.f17201a;
        }
    }
}
