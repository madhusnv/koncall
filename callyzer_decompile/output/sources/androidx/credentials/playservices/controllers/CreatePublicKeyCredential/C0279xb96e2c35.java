package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$1 */
/* loaded from: classes.dex */
public final class C0279xb96e2c35 extends AbstractC4155m implements InterfaceC2141e {
    public static final C0279xb96e2c35 INSTANCE = new C0279xb96e2c35();

    public C0279xb96e2c35() {
        super(2);
    }

    @Override // ex.InterfaceC2141e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (InterfaceC2137a) obj2);
        return a0.f30746a;
    }

    public final void invoke(CancellationSignal cancellationSignal, InterfaceC2137a f6) {
        AbstractC4154l.m8923f(f6, "f");
        CredentialProviderController.Companion companion = CredentialProviderController.Companion;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, f6);
    }
}
