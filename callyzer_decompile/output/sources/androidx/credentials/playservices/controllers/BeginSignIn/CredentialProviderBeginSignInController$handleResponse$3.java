package androidx.credentials.playservices.controllers.BeginSignIn;

import ex.InterfaceC2137a;
import h6.C2864t;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$3 extends AbstractC4155m implements InterfaceC2137a {
    final /* synthetic */ C2864t $response;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C2864t c2864t) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = c2864t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, C2864t response) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(response, "$response");
        this$0.getCallback().onResult(response);
    }

    @Override // ex.InterfaceC2137a
    public /* bridge */ /* synthetic */ Object invoke() {
        m16525invoke();
        return a0.f30746a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16525invoke() {
        this.this$0.getExecutor().execute(new RunnableC0273b(this.this$0, this.$response, 0));
    }
}
