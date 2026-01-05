package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import h6.C2864t;
import kotlin.jvm.internal.C4168z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0301b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2281a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f2282b;

    /* renamed from: c */
    public final /* synthetic */ Object f2283c;

    public /* synthetic */ RunnableC0301b(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Object obj, int i10) {
        this.f2281a = i10;
        this.f2282b = credentialProviderGetSignInIntentController;
        this.f2283c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2281a) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(this.f2282b, (C2864t) this.f2283c);
                break;
            case 1:
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(this.f2282b, (C4168z) this.f2283c);
                break;
            case 2:
                CredentialProviderGetSignInIntentController$handleResponse$6.invoke$lambda$0(this.f2282b, (GetCredentialUnknownException) this.f2283c);
                break;
            default:
                CredentialProviderGetSignInIntentController.C02971.invoke$lambda$0(this.f2282b, (Exception) this.f2283c);
                break;
        }
    }
}
