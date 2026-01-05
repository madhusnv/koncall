package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import ex.InterfaceC2137a;
import h6.InterfaceC2855k;
import i6.C3172a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import org.json.JSONException;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$6 */
/* loaded from: classes.dex */
public final class C0283xb96e2c3a extends AbstractC4155m implements InterfaceC2137a {
    final /* synthetic */ JSONException $e;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283xb96e2c3a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e2) {
        AbstractC4154l.m8923f(this$0, "this$0");
        AbstractC4154l.m8923f(e2, "$e");
        InterfaceC2855k interfaceC2855k = this$0.callback;
        if (interfaceC2855k != null) {
            interfaceC2855k.mo5820a(new CreatePublicKeyCredentialDomException(new C3172a(3), e2.getMessage()));
        } else {
            AbstractC4154l.m8928k("callback");
            throw null;
        }
    }

    @Override // ex.InterfaceC2137a
    public /* bridge */ /* synthetic */ Object invoke() {
        m16535invoke();
        return a0.f30746a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16535invoke() {
        Executor executor = this.this$0.executor;
        if (executor != null) {
            executor.execute(new RunnableC0291b(this.this$0, this.$e, 0));
        } else {
            AbstractC4154l.m8928k("executor");
            throw null;
        }
    }
}
