package com.amplifyframework.auth.cognito.options;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FederateToIdentityPoolOptions {
    public static final Companion Companion = new Companion(null);
    private final String developerProvidedIdentityId;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoBuilder {
        private String developerProvidedIdentityId;

        public final FederateToIdentityPoolOptions build() {
            return new FederateToIdentityPoolOptions(this.developerProvidedIdentityId);
        }

        public final CognitoBuilder developerProvidedIdentityId(String developerProvidedIdentityId) {
            AbstractC4154l.m8923f(developerProvidedIdentityId, "developerProvidedIdentityId");
            this.developerProvidedIdentityId = developerProvidedIdentityId;
            return this;
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

        public final FederateToIdentityPoolOptions invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            block.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }

        private Companion() {
        }
    }

    public FederateToIdentityPoolOptions(String str) {
        this.developerProvidedIdentityId = str;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    public static /* synthetic */ FederateToIdentityPoolOptions copy$aws_auth_cognito_release$default(FederateToIdentityPoolOptions federateToIdentityPoolOptions, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = federateToIdentityPoolOptions.developerProvidedIdentityId;
        }
        return federateToIdentityPoolOptions.copy$aws_auth_cognito_release(str);
    }

    public final String component1() {
        return this.developerProvidedIdentityId;
    }

    public final FederateToIdentityPoolOptions copy$aws_auth_cognito_release(String str) {
        return new FederateToIdentityPoolOptions(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FederateToIdentityPoolOptions) && AbstractC4154l.m8918a(this.developerProvidedIdentityId, ((FederateToIdentityPoolOptions) obj).developerProvidedIdentityId);
    }

    public final String getDeveloperProvidedIdentityId() {
        return this.developerProvidedIdentityId;
    }

    public int hashCode() {
        String str = this.developerProvidedIdentityId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC5601a.m11238i("FederateToIdentityPoolOptions(developerProvidedIdentityId=", this.developerProvidedIdentityId, ")");
    }
}
