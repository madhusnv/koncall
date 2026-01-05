package androidx.credentials.playservices.controllers.BeginSignIn;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$4 extends AbstractC4155m implements InterfaceC2137a {
    final /* synthetic */ C4168z $exception;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C4168z c4168z) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$exception = c4168z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, C4168z exception) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(exception, "$exception");
        this$0.getCallback().mo5820a(exception.f21164a);
    }

    @Override // ex.InterfaceC2137a
    public /* bridge */ /* synthetic */ Object invoke() {
        m16526invoke();
        return a0.f30746a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16526invoke() {
        this.this$0.getExecutor().execute(new RunnableC0273b(this.this$0, this.$exception, 1));
    }
}
