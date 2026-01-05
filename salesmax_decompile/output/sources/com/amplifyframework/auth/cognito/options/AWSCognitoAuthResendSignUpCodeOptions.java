package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthResendSignUpCodeOptions extends AuthResendSignUpCodeOptions {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> metadata;

    public static final class CognitoBuilder extends AuthResendSignUpCodeOptions.Builder<CognitoBuilder> {
        private Map<String, String> metadata = isa.m32681h();

        @Override // com.amplifyframework.auth.options.AuthResendSignUpCodeOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public final CognitoBuilder metadata(Map<String, String> map) {
            sq8.m48649h(map, "metadata");
            this.metadata = map;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthResendSignUpCodeOptions.Builder
        public AWSCognitoAuthResendSignUpCodeOptions build() {
            return new AWSCognitoAuthResendSignUpCodeOptions(this.metadata);
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

        public final AWSCognitoAuthResendSignUpCodeOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            xk7Var.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public AWSCognitoAuthResendSignUpCodeOptions(Map<String, String> map) {
        sq8.m48649h(map, "metadata");
        this.metadata = map;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthResendSignUpCodeOptions copy$default(AWSCognitoAuthResendSignUpCodeOptions aWSCognitoAuthResendSignUpCodeOptions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aWSCognitoAuthResendSignUpCodeOptions.metadata;
        }
        return aWSCognitoAuthResendSignUpCodeOptions.copy(map);
    }

    public final Map<String, String> component1() {
        return this.metadata;
    }

    public final AWSCognitoAuthResendSignUpCodeOptions copy(Map<String, String> map) {
        sq8.m48649h(map, "metadata");
        return new AWSCognitoAuthResendSignUpCodeOptions(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSCognitoAuthResendSignUpCodeOptions) && sq8.m48644c(this.metadata, ((AWSCognitoAuthResendSignUpCodeOptions) obj).metadata);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode();
    }

    public String toString() {
        return "AWSCognitoAuthResendSignUpCodeOptions(metadata=" + this.metadata + ")";
    }
}
