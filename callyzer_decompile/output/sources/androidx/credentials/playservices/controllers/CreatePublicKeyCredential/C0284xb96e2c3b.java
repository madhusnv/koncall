package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import ex.InterfaceC2137a;
import h6.InterfaceC2855k;
import i6.C3172a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$7 */
/* loaded from: classes.dex */
public final class C0284xb96e2c3b extends AbstractC4155m implements InterfaceC2137a {
    final /* synthetic */ Throwable $t;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0284xb96e2c3b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, Throwable t7) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(t7, "$t");
        InterfaceC2855k interfaceC2855k = this$0.callback;
        if (interfaceC2855k != null) {
            interfaceC2855k.mo5820a(new CreatePublicKeyCredentialDomException(new C3172a(22), t7.getMessage()));
        } else {
            AbstractC4154l.m8928k("callback");
            throw null;
        }
    }

    @Override // ex.InterfaceC2137a
    public /* bridge */ /* synthetic */ Object invoke() {
        m16536invoke();
        return a0.f30746a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16536invoke() {
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new RunnableC0292c(this.this$0, this.$t, 0));
        } else {
            AbstractC4154l.m8928k("executor");
            throw null;
        }
    }
}
