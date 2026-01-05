package androidx.credentials.playservices;

import ex.InterfaceC2139c;
import yg.InterfaceC8648e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0267a implements InterfaceC8648e {

    /* renamed from: a */
    public final /* synthetic */ int f2249a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f2250b;

    public /* synthetic */ C0267a(int i10, InterfaceC2139c interfaceC2139c) {
        this.f2249a = i10;
        this.f2250b = interfaceC2139c;
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public final void mo27g(Object obj) {
        switch (this.f2249a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(this.f2250b, obj);
                break;
            case 1:
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(this.f2250b, obj);
                break;
            case 2:
                HiddenActivity.handleCreatePassword$lambda$14$lambda$12(this.f2250b, obj);
                break;
            case 3:
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(this.f2250b, obj);
                break;
            default:
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(this.f2250b, obj);
                break;
        }
    }
}
