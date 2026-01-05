package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0291b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2270a;

    /* renamed from: b */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f2271b;

    /* renamed from: c */
    public final /* synthetic */ JSONException f2272c;

    public /* synthetic */ RunnableC0291b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i10) {
        this.f2270a = i10;
        this.f2271b = credentialProviderCreatePublicKeyCredentialController;
        this.f2272c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2270a) {
            case 0:
                C0283xb96e2c3a.invoke$lambda$0(this.f2271b, this.f2272c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.C02851.invoke$lambda$0(this.f2271b, this.f2272c);
                break;
        }
    }
}
