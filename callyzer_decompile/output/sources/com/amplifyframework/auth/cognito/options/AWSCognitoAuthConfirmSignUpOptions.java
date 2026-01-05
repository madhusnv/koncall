package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import ex.InterfaceC2139c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> clientMetadata;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoBuilder extends AuthConfirmSignUpOptions.Builder<CognitoBuilder> {
        private Map<String, String> clientMetadata = C6669s.f31944a;

        public final CognitoBuilder clientMetadata(Map<String, String> clientMetadata) {
            AbstractC4154l.m8923f(clientMetadata, "clientMetadata");
            this.clientMetadata = clientMetadata;
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthConfirmSignUpOptions invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            block.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }

        private Companion() {
        }
    }

    public AWSCognitoAuthConfirmSignUpOptions(Map<String, String> clientMetadata) {
        AbstractC4154l.m8923f(clientMetadata, "clientMetadata");
        this.clientMetadata = clientMetadata;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthConfirmSignUpOptions copy$aws_auth_cognito_release$default(AWSCognitoAuthConfirmSignUpOptions aWSCognitoAuthConfirmSignUpOptions, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = aWSCognitoAuthConfirmSignUpOptions.clientMetadata;
        }
        return aWSCognitoAuthConfirmSignUpOptions.copy$aws_auth_cognito_release(map);
    }

    public final Map<String, String> component1() {
        return this.clientMetadata;
    }

    public final AWSCognitoAuthConfirmSignUpOptions copy$aws_auth_cognito_release(Map<String, String> clientMetadata) {
        AbstractC4154l.m8923f(clientMetadata, "clientMetadata");
        return new AWSCognitoAuthConfirmSignUpOptions(clientMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSCognitoAuthConfirmSignUpOptions) && AbstractC4154l.m8918a(this.clientMetadata, ((AWSCognitoAuthConfirmSignUpOptions) obj).clientMetadata);
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
