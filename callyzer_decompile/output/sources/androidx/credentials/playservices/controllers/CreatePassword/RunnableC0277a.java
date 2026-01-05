package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.exceptions.CreateCredentialException;
import h6.AbstractC2847c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePassword.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0277a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2263a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderCreatePasswordController f2264b;

    /* renamed from: c */
    public final /* synthetic */ Object f2265c;

    public /* synthetic */ RunnableC0277a(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Object obj, int i10) {
        this.f2263a = i10;
        this.f2264b = credentialProviderCreatePasswordController;
        this.f2265c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2263a) {
            case 0:
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(this.f2264b, (CreateCredentialException) this.f2265c);
                break;
            default:
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(this.f2264b, (AbstractC2847c) this.f2265c);
                break;
        }
    }
}
