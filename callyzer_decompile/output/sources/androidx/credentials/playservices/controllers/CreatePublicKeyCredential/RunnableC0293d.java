package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0293d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2276a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2277b;

    public /* synthetic */ RunnableC0293d(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, int i10) {
        this.f2276a = i10;
        this.f2277b = credentialProviderCreatePublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2276a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.C02873.invoke$lambda$0(this.f2277b);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(this.f2277b);
                break;
        }
    }
}
