package com.amplifyframework.auth.cognito;

import p001o.kf9;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthPlugin$queueFacade$2 extends kf9 implements uk7 {
    final /* synthetic */ AWSCognitoAuthPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoAuthPlugin$queueFacade$2(AWSCognitoAuthPlugin aWSCognitoAuthPlugin) {
        super(0);
        this.this$0 = aWSCognitoAuthPlugin;
    }

    @Override // p001o.uk7
    public final KotlinAuthFacadeInternal invoke() {
        return new KotlinAuthFacadeInternal(this.this$0.getRealPlugin$aws_auth_cognito_release());
    }
}
