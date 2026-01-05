package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthUpdateUserAttributesOptions extends AuthUpdateUserAttributesOptions {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> metadata;

    public static final class CognitoBuilder extends AuthUpdateUserAttributesOptions.Builder<CognitoBuilder> {
        private Map<String, String> metadata = isa.m32681h();

        @Override // com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public final CognitoBuilder metadata(Map<String, String> map) {
            sq8.m48649h(map, "metadata");
            this.metadata = map;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions.Builder
        public AWSCognitoAuthUpdateUserAttributesOptions build() {
            return new AWSCognitoAuthUpdateUserAttributesOptions(this.metadata);
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

        public final AWSCognitoAuthUpdateUserAttributesOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            xk7Var.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public AWSCognitoAuthUpdateUserAttributesOptions(Map<String, String> map) {
        sq8.m48649h(map, "metadata");
        this.metadata = map;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthUpdateUserAttributesOptions copy$default(AWSCognitoAuthUpdateUserAttributesOptions aWSCognitoAuthUpdateUserAttributesOptions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aWSCognitoAuthUpdateUserAttributesOptions.metadata;
        }
        return aWSCognitoAuthUpdateUserAttributesOptions.copy(map);
    }

    public final Map<String, String> component1() {
        return this.metadata;
    }

    public final AWSCognitoAuthUpdateUserAttributesOptions copy(Map<String, String> map) {
        sq8.m48649h(map, "metadata");
        return new AWSCognitoAuthUpdateUserAttributesOptions(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSCognitoAuthUpdateUserAttributesOptions) && sq8.m48644c(this.metadata, ((AWSCognitoAuthUpdateUserAttributesOptions) obj).metadata);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode();
    }

    public String toString() {
        return "AWSCognitoAuthUpdateUserAttributesOptions(metadata=" + this.metadata + ")";
    }
}
