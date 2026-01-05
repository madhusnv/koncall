package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import java.util.List;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthSignUpOptions extends AuthSignUpOptions {
    public static final Companion Companion = new Companion(null);
    private final List<AuthUserAttribute> attributes;
    private final Map<String, String> clientMetadata;
    private final Map<String, String> validationData;

    public static final class CognitoBuilder extends AuthSignUpOptions.Builder<CognitoBuilder> {
        private Map<String, String> validationData = isa.m32681h();
        private Map<String, String> clientMetadata = isa.m32681h();

        public final CognitoBuilder clientMetadata(Map<String, String> map) {
            sq8.m48649h(map, "clientMetadata");
            this.clientMetadata = map;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public final CognitoBuilder validationData(Map<String, String> map) {
            sq8.m48649h(map, "validationData");
            this.validationData = map;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public AWSCognitoAuthSignUpOptions build() {
            List<AuthUserAttribute> userAttributes = super.getUserAttributes();
            sq8.m48648g(userAttributes, "getUserAttributes(...)");
            return new AWSCognitoAuthSignUpOptions(userAttributes, this.validationData, this.clientMetadata);
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

        public final AWSCognitoAuthSignUpOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            xk7Var.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoAuthSignUpOptions(List<AuthUserAttribute> list, Map<String, String> map, Map<String, String> map2) {
        super(list);
        sq8.m48649h(list, "attributes");
        sq8.m48649h(map, "validationData");
        sq8.m48649h(map2, "clientMetadata");
        this.attributes = list;
        this.validationData = map;
        this.clientMetadata = map2;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    private final List<AuthUserAttribute> component1() {
        return this.attributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthSignUpOptions copy$default(AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions, List list, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aWSCognitoAuthSignUpOptions.attributes;
        }
        if ((i & 2) != 0) {
            map = aWSCognitoAuthSignUpOptions.validationData;
        }
        if ((i & 4) != 0) {
            map2 = aWSCognitoAuthSignUpOptions.clientMetadata;
        }
        return aWSCognitoAuthSignUpOptions.copy(list, map, map2);
    }

    public final Map<String, String> component2() {
        return this.validationData;
    }

    public final Map<String, String> component3() {
        return this.clientMetadata;
    }

    public final AWSCognitoAuthSignUpOptions copy(List<AuthUserAttribute> list, Map<String, String> map, Map<String, String> map2) {
        sq8.m48649h(list, "attributes");
        sq8.m48649h(map, "validationData");
        sq8.m48649h(map2, "clientMetadata");
        return new AWSCognitoAuthSignUpOptions(list, map, map2);
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthSignUpOptions)) {
            return false;
        }
        AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions = (AWSCognitoAuthSignUpOptions) obj;
        return sq8.m48644c(this.attributes, aWSCognitoAuthSignUpOptions.attributes) && sq8.m48644c(this.validationData, aWSCognitoAuthSignUpOptions.validationData) && sq8.m48644c(this.clientMetadata, aWSCognitoAuthSignUpOptions.clientMetadata);
    }

    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public final Map<String, String> getValidationData() {
        return this.validationData;
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public int hashCode() {
        return (((this.attributes.hashCode() * 31) + this.validationData.hashCode()) * 31) + this.clientMetadata.hashCode();
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public String toString() {
        return "AWSCognitoAuthSignUpOptions(attributes=" + this.attributes + ", validationData=" + this.validationData + ", clientMetadata=" + this.clientMetadata + ")";
    }
}
