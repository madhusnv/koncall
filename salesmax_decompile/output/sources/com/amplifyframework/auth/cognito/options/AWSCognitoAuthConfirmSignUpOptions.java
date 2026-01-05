package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> clientMetadata;

    public static final class CognitoBuilder extends AuthConfirmSignUpOptions.Builder<CognitoBuilder> {
        private Map<String, String> clientMetadata = isa.m32681h();

        public final CognitoBuilder clientMetadata(Map<String, String> map) {
            sq8.m48649h(map, "clientMetadata");
            this.clientMetadata = map;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignUpOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignUpOptions.Builder
        public AWSCognitoAuthConfirmSignUpOptions build() {
            return new AWSCognitoAuthConfirmSignUpOptions(this.clientMetadata);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthConfirmSignUpOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            xk7Var.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public AWSCognitoAuthConfirmSignUpOptions(Map<String, String> map) {
        sq8.m48649h(map, "clientMetadata");
        this.clientMetadata = map;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthConfirmSignUpOptions copy$default(AWSCognitoAuthConfirmSignUpOptions aWSCognitoAuthConfirmSignUpOptions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aWSCognitoAuthConfirmSignUpOptions.clientMetadata;
        }
        return aWSCognitoAuthConfirmSignUpOptions.copy(map);
    }

    public final Map<String, String> component1() {
        return this.clientMetadata;
    }

    public final AWSCognitoAuthConfirmSignUpOptions copy(Map<String, String> map) {
        sq8.m48649h(map, "clientMetadata");
        return new AWSCognitoAuthConfirmSignUpOptions(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSCognitoAuthConfirmSignUpOptions) && sq8.m48644c(this.clientMetadata, ((AWSCognitoAuthConfirmSignUpOptions) obj).clientMetadata);
    }

    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public int hashCode() {
        return this.clientMetadata.hashCode();
    }

    public String toString() {
        return "AWSCognitoAuthConfirmSignUpOptions(clientMetadata=" + this.clientMetadata + ")";
    }
}
