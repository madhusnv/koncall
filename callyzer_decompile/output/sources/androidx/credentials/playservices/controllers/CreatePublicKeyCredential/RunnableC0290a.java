package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.CreateCredentialException;
import h6.AbstractC2847c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0290a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2267a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2268b;

    /* renamed from: c */
    public final /* synthetic */ Object f2269c;

    public /* synthetic */ RunnableC0290a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Object obj, int i10) {
        this.f2267a = i10;
        this.f2268b = credentialProviderCreatePublicKeyCredentialController;
        this.f2269c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2267a) {
            case 0:
                C0280xb96e2c36.invoke$lambda$0(this.f2268b, (CreateCredentialException) this.f2269c);
                break;
            case 1:
                C0281xb96e2c38.invoke$lambda$0(this.f2268b, (CreateCredentialException) this.f2269c);
                break;
            default:
                C0282xb96e2c39.invoke$lambda$0(this.f2268b, (AbstractC2847c) this.f2269c);
                break;
        }
    }
}
