package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.StateChangeListenerToken;
import p001o.kf9;
import p001o.vre;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$credentialStoreStateListener$1 */
/* loaded from: classes5.dex */
public final class C10387xd9b9a9fc extends kf9 implements xk7 {
    final /* synthetic */ xk7 $onSuccess;
    final /* synthetic */ StateChangeListenerToken $token;
    final /* synthetic */ CredentialStoreClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10387xd9b9a9fc(CredentialStoreClient credentialStoreClient, StateChangeListenerToken stateChangeListenerToken, xk7 xk7Var) {
        super(1);
        this.this$0 = credentialStoreClient;
        this.$token = stateChangeListenerToken;
        this.$onSuccess = xk7Var;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m68716invoke(((vre) obj).m53359j());
        return y3i.f54824a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m68716invoke(Object obj) {
        this.this$0.credentialStoreStateMachine.cancel(this.$token);
        this.$onSuccess.invoke(vre.m53350a(obj));
    }
}
