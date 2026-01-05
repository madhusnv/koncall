package androidx.credentials.playservices;

import yg.InterfaceC8647d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0305e implements InterfaceC8647d {

    /* renamed from: a */
    public final /* synthetic */ int f2289a;

    /* renamed from: b */
    public final /* synthetic */ HiddenActivity f2290b;

    public /* synthetic */ C0305e(HiddenActivity hiddenActivity, int i10) {
        this.f2289a = i10;
        this.f2290b = hiddenActivity;
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public final void mo780n(Exception exc) {
        switch (this.f2289a) {
            case 0:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.f2290b, exc);
                break;
            case 1:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.f2290b, exc);
                break;
            case 2:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.f2290b, exc);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.f2290b, exc);
                break;
        }
    }
}
