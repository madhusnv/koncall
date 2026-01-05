package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthVerifyTOTPSetupOptions extends AuthVerifyTOTPSetupOptions {
    public static final Companion Companion = new Companion(null);
    private final String friendlyDeviceName;

    public static final class CognitoBuilder extends AuthVerifyTOTPSetupOptions.Builder<CognitoBuilder> {
        private String friendlyDeviceName;

        public final CognitoBuilder friendlyDeviceName(String str) {
            sq8.m48649h(str, "friendlyDeviceName");
            this.friendlyDeviceName = str;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions.Builder
        public AWSCognitoAuthVerifyTOTPSetupOptions build() {
            return new AWSCognitoAuthVerifyTOTPSetupOptions(this.friendlyDeviceName, null);
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

        public final AWSCognitoAuthVerifyTOTPSetupOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            xk7Var.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public /* synthetic */ AWSCognitoAuthVerifyTOTPSetupOptions(String str, id5 id5Var) {
        this(str);
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    public final String getFriendlyDeviceName() {
        return this.friendlyDeviceName;
    }

    private AWSCognitoAuthVerifyTOTPSetupOptions(String str) {
        this.friendlyDeviceName = str;
    }
}
