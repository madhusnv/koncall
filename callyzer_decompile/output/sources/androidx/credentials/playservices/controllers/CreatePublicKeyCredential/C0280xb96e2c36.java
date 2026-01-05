package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.CreateCredentialException;
import ex.InterfaceC2139c;
import h6.InterfaceC2855k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$2 */
/* loaded from: classes.dex */
public final class C0280xb96e2c36 extends AbstractC4155m implements InterfaceC2139c {
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280xb96e2c36(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(1);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, CreateCredentialException e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(e2, "$e");
        InterfaceC2855k interfaceC2855k = this$0.callback;
        if (interfaceC2855k != null) {
            interfaceC2855k.mo5820a(e2);
        } else {
            AbstractC4154l.m8928k("callback");
            throw null;
        }
    }

    @Override // ex.InterfaceC2139c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CreateCredentialException) obj);
        return a0.f30746a;
    }

    public final void invoke(CreateCredentialException e2) {
        AbstractC4154l.m8923f(e2, "e");
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new RunnableC0290a(this.this$0, e2, 0));
        } else {
            AbstractC4154l.m8928k("executor");
            throw null;
        }
    }
}
