package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthVerifyTOTPSetupOptions extends AuthVerifyTOTPSetupOptions {
    public static final Companion Companion = new Companion(null);
    private final String friendlyDeviceName;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoBuilder extends AuthVerifyTOTPSetupOptions.Builder<CognitoBuilder> {
        private String friendlyDeviceName;

        public final CognitoBuilder friendlyDeviceName(String friendlyDeviceName) {
            AbstractC4154l.m8923f(friendlyDeviceName, "friendlyDeviceName");
            this.friendlyDeviceName = friendlyDeviceName;
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthVerifyTOTPSetupOptions invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            block.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AWSCognitoAuthVerifyTOTPSetupOptions(String str, AbstractC4148f abstractC4148f) {
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
