package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialUnknownException;
import h6.C2864t;
import kotlin.jvm.internal.C4168z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.BeginSignIn.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0273b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2259a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderBeginSignInController f2260b;

    /* renamed from: c */
    public final /* synthetic */ Object f2261c;

    public /* synthetic */ RunnableC0273b(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Object obj, int i10) {
        this.f2259a = i10;
        this.f2260b = credentialProviderBeginSignInController;
        this.f2261c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2259a) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(this.f2260b, (C2864t) this.f2261c);
                break;
            case 1:
                CredentialProviderBeginSignInController$handleResponse$4.invoke$lambda$0(this.f2260b, (C4168z) this.f2261c);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$6.invoke$lambda$0(this.f2260b, (GetCredentialUnknownException) this.f2261c);
                break;
        }
    }
}
