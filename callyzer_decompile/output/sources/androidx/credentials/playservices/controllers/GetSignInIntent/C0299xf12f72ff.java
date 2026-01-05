package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4152j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C0299xf12f72ff extends AbstractC4152j implements InterfaceC2141e {
    public C0299xf12f72ff(Object obj) {
        super(2, 0, CredentialProviderBaseController.Companion.class, obj, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;");
    }

    @Override // ex.InterfaceC2141e
    public final GetCredentialException invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m800xd975db95(str, str2);
    }
}
