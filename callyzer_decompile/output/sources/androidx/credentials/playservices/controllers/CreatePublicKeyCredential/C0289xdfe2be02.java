package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4152j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C0289xdfe2be02 extends AbstractC4152j implements InterfaceC2141e {
    public C0289xdfe2be02(Object obj) {
        super(2, 0, CredentialProviderBaseController.Companion.class, obj, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;");
    }

    @Override // ex.InterfaceC2141e
    public final CreateCredentialException invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m799x5e74af(str, str2);
    }
}
