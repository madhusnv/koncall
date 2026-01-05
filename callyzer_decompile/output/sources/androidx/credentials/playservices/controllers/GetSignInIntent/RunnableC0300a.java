package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.exceptions.GetCredentialException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0300a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2278a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f2279b;

    /* renamed from: c */
    public final /* synthetic */ GetCredentialException f2280c;

    public /* synthetic */ RunnableC0300a(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i10) {
        this.f2278a = i10;
        this.f2279b = credentialProviderGetSignInIntentController;
        this.f2280c = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2278a) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(this.f2279b, this.f2280c);
                break;
            default:
                CredentialProviderGetSignInIntentController$handleResponse$5.invoke$lambda$0(this.f2279b, this.f2280c);
                break;
        }
    }
}
