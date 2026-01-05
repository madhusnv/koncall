package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.cg3;
import p001o.kg3;
import p001o.sq8;

/* loaded from: classes5.dex */
public interface AWSCognitoAuthService {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AWSCognitoAuthService fromConfiguration$aws_auth_cognito_release(AuthConfiguration authConfiguration) {
            sq8.m48649h(authConfiguration, "configuration");
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            UserPoolConfiguration userPool = authConfiguration.getUserPool();
            final kg3 kg3Var = userPool != null ? (kg3) kg3.f32169m.m38580c(new C10380x48365ca(userPool, linkedHashMap)) : null;
            IdentityPoolConfiguration identityPool = authConfiguration.getIdentityPool();
            final cg3 cg3Var = identityPool != null ? (cg3) cg3.f18087l.m38580c(new C10379x287790f9(identityPool, linkedHashMap)) : null;
            return new AWSCognitoAuthService(kg3Var, cg3Var, linkedHashMap) { // from class: com.amplifyframework.auth.cognito.AWSCognitoAuthService$Companion$fromConfiguration$1
                private final cg3 cognitoIdentityClient;
                private final kg3 cognitoIdentityProviderClient;
                private final Map<String, String> customUserAgentPairs;

                {
                    this.cognitoIdentityProviderClient = kg3Var;
                    this.cognitoIdentityClient = cg3Var;
                    this.customUserAgentPairs = linkedHashMap;
                }

                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public cg3 getCognitoIdentityClient() {
                    return this.cognitoIdentityClient;
                }

                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public kg3 getCognitoIdentityProviderClient() {
                    return this.cognitoIdentityProviderClient;
                }

                @Override // com.amplifyframework.auth.cognito.AWSCognitoAuthService
                public Map<String, String> getCustomUserAgentPairs() {
                    return this.customUserAgentPairs;
                }
            };
        }
    }

    cg3 getCognitoIdentityClient();

    kg3 getCognitoIdentityProviderClient();

    Map<String, String> getCustomUserAgentPairs();
}
