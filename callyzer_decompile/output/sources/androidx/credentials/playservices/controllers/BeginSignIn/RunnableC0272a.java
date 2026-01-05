package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.BeginSignIn.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0272a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2256a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderBeginSignInController f2257b;

    /* renamed from: c */
    public final /* synthetic */ GetCredentialException f2258c;

    public /* synthetic */ RunnableC0272a(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i10) {
        this.f2256a = i10;
        this.f2257b = credentialProviderBeginSignInController;
        this.f2258c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2256a) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$2.invoke$lambda$0(this.f2257b, this.f2258c);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(this.f2257b, this.f2258c);
                break;
        }
    }
}
