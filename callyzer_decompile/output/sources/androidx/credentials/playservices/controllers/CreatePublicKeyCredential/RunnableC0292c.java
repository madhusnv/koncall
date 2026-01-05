package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0292c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2273a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2274b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f2275c;

    public /* synthetic */ RunnableC0292c(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2, int i10) {
        this.f2273a = i10;
        this.f2274b = credentialProviderCreatePublicKeyCredentialController;
        this.f2275c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2273a) {
            case 0:
                C0284xb96e2c3b.invoke$lambda$0(this.f2274b, this.f2275c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.C02862.invoke$lambda$0(this.f2274b, this.f2275c);
                break;
        }
    }
}
