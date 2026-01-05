package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* renamed from: com.amplifyframework.auth.cognito.actions.AuthCognitoActions$initializeAuthorizationConfigurationAction$1$handleEvent$1 */
/* loaded from: classes5.dex */
public final class C10440xf03b8d3b extends kf9 implements xk7 {
    public static final C10440xf03b8d3b INSTANCE = new C10440xf03b8d3b();

    public C10440xf03b8d3b() {
        super(1);
    }

    @Override // p001o.xk7
    public final AuthorizationEvent invoke(AmplifyCredential amplifyCredential) {
        sq8.m48649h(amplifyCredential, "credentials");
        return sq8.m48644c(amplifyCredential, AmplifyCredential.Empty.INSTANCE) ? new AuthorizationEvent(AuthorizationEvent.EventType.Configure.INSTANCE, null, 2, null) : new AuthorizationEvent(new AuthorizationEvent.EventType.CachedCredentialsAvailable(amplifyCredential), null, 2, null);
    }
}
