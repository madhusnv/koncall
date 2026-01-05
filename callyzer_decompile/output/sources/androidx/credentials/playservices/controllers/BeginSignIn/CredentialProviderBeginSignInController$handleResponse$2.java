package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$2 extends AbstractC4155m implements InterfaceC2139c {
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.this$0 = credentialProviderBeginSignInController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, GetCredentialException e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(e2, "$e");
        this$0.getCallback().mo5820a(e2);
    }

    @Override // ex.InterfaceC2139c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GetCredentialException) obj);
        return a0.f30746a;
    }

    public final void invoke(GetCredentialException e2) {
        AbstractC4154l.m8923f(e2, "e");
        this.this$0.getExecutor().execute(new RunnableC0272a(this.this$0, e2, 0));
    }
}
