package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions;
import ex.InterfaceC2139c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthResendUserAttributeConfirmationCodeOptions extends AuthResendUserAttributeConfirmationCodeOptions {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> metadata;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoBuilder extends AuthResendUserAttributeConfirmationCodeOptions.Builder<CognitoBuilder> {
        private Map<String, String> metadata = C6669s.f31944a;

        @Override // com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public final CognitoBuilder metadata(Map<String, String> metadata) {
            AbstractC4154l.m8923f(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions.Builder
        public AWSCognitoAuthResendUserAttributeConfirmationCodeOptions build() {
            return new AWSCognitoAuthResendUserAttributeConfirmationCodeOptions(this.metadata);
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

        public final AWSCognitoAuthResendUserAttributeConfirmationCodeOptions invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            block.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }

        private Companion() {
        }
    }

    public AWSCognitoAuthResendUserAttributeConfirmationCodeOptions(Map<String, String> metadata) {
        AbstractC4154l.m8923f(metadata, "metadata");
        this.metadata = metadata;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthResendUserAttributeConfirmationCodeOptions copy$aws_auth_cognito_release$default(AWSCognitoAuthResendUserAttributeConfirmationCodeOptions aWSCognitoAuthResendUserAttributeConfirmationCodeOptions, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = aWSCognitoAuthResendUserAttributeConfirmationCodeOptions.metadata;
        }
        return aWSCognitoAuthResendUserAttributeConfirmationCodeOptions.copy$aws_auth_cognito_release(map);
    }

    public final Map<String, String> component1() {
        return this.metadata;
    }

    public final AWSCognitoAuthResendUserAttributeConfirmationCodeOptions copy$aws_auth_cognito_release(Map<String, String> metadata) {
        AbstractC4154l.m8923f(metadata, "metadata");
        return new AWSCognitoAuthResendUserAttributeConfirmationCodeOptions(metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSCognitoAuthResendUserAttributeConfirmationCodeOptions) && AbstractC4154l.m8918a(this.metadata, ((AWSCognitoAuthResendUserAttributeConfirmationCodeOptions) obj).metadata);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode();
    }

    public String toString() {
        return "AWSCognitoAuthResendUserAttributeConfirmationCodeOptions(metadata=" + this.metadata + ")";
    }
}
