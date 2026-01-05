package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import ex.InterfaceC2139c;
import i0.m0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthSignUpOptions extends AuthSignUpOptions {
    public static final Companion Companion = new Companion(null);
    private final List<AuthUserAttribute> attributes;
    private final Map<String, String> clientMetadata;
    private final Map<String, String> validationData;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoBuilder extends AuthSignUpOptions.Builder<CognitoBuilder> {
        private Map<String, String> clientMetadata;
        private Map<String, String> validationData;

        public CognitoBuilder() {
            C6669s c6669s = C6669s.f31944a;
            this.validationData = c6669s;
            this.clientMetadata = c6669s;
        }

        public final CognitoBuilder clientMetadata(Map<String, String> clientMetadata) {
            AbstractC4154l.m8923f(clientMetadata, "clientMetadata");
            this.clientMetadata = clientMetadata;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public final CognitoBuilder validationData(Map<String, String> validationData) {
            AbstractC4154l.m8923f(validationData, "validationData");
            this.validationData = validationData;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public AWSCognitoAuthSignUpOptions build() {
            List<AuthUserAttribute> userAttributes = super.getUserAttributes();
            AbstractC4154l.m8922e(userAttributes, "getUserAttributes(...)");
            return new AWSCognitoAuthSignUpOptions(userAttributes, this.validationData, this.clientMetadata);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthSignUpOptions invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            block.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoAuthSignUpOptions(List<AuthUserAttribute> attributes, Map<String, String> validationData, Map<String, String> clientMetadata) {
        super(attributes);
        AbstractC4154l.m8923f(attributes, "attributes");
        AbstractC4154l.m8923f(validationData, "validationData");
        AbstractC4154l.m8923f(clientMetadata, "clientMetadata");
        this.attributes = attributes;
        this.validationData = validationData;
        this.clientMetadata = clientMetadata;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    private final List<AuthUserAttribute> component1() {
        return this.attributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthSignUpOptions copy$aws_auth_cognito_release$default(AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions, List list, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = aWSCognitoAuthSignUpOptions.attributes;
        }
        if ((i10 & 2) != 0) {
            map = aWSCognitoAuthSignUpOptions.validationData;
        }
        if ((i10 & 4) != 0) {
            map2 = aWSCognitoAuthSignUpOptions.clientMetadata;
        }
        return aWSCognitoAuthSignUpOptions.copy$aws_auth_cognito_release(list, map, map2);
    }

    public final Map<String, String> component2() {
        return this.validationData;
    }

    public final Map<String, String> component3() {
        return this.clientMetadata;
    }

    public final AWSCognitoAuthSignUpOptions copy$aws_auth_cognito_release(List<AuthUserAttribute> attributes, Map<String, String> validationData, Map<String, String> clientMetadata) {
        AbstractC4154l.m8923f(attributes, "attributes");
        AbstractC4154l.m8923f(validationData, "validationData");
        AbstractC4154l.m8923f(clientMetadata, "clientMetadata");
        return new AWSCognitoAuthSignUpOptions(attributes, validationData, clientMetadata);
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
        return AbstractC4154l.m8918a(this.attributes, aWSCognitoAuthSignUpOptions.attributes) && AbstractC4154l.m8918a(this.validationData, aWSCognitoAuthSignUpOptions.validationData) && AbstractC4154l.m8918a(this.clientMetadata, aWSCognitoAuthSignUpOptions.clientMetadata);
    }

    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    public final Map<String, String> getValidationData() {
        return this.validationData;
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public int hashCode() {
        return this.clientMetadata.hashCode() + m0.m7369b(this.attributes.hashCode() * 31, 31, this.validationData);
    }

    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public String toString() {
        return "AWSCognitoAuthSignUpOptions(attributes=" + this.attributes + ", validationData=" + this.validationData + ", clientMetadata=" + this.clientMetadata + ")";
    }
}
