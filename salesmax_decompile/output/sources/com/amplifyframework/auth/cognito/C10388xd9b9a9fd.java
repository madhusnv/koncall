package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.StateChangeListenerToken;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$credentialStoreStateListener$2 */
/* loaded from: classes5.dex */
public final class C10388xd9b9a9fd extends kf9 implements xk7 {
    final /* synthetic */ xk7 $onError;
    final /* synthetic */ StateChangeListenerToken $token;
    final /* synthetic */ CredentialStoreClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10388xd9b9a9fd(CredentialStoreClient credentialStoreClient, StateChangeListenerToken stateChangeListenerToken, xk7 xk7Var) {
        super(1);
        this.this$0 = credentialStoreClient;
        this.$token = stateChangeListenerToken;
        this.$onError = xk7Var;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return y3i.f54824a;
    }

    public final void invoke(Exception exc) {
        sq8.m48649h(exc, "it");
        this.this$0.credentialStoreStateMachine.cancel(this.$token);
        this.$onError.invoke(exc);
    }
}
