package com.amplifyframework.auth.cognito.options;

import android.app.Activity;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6668r;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthConfirmSignInOptions extends AuthConfirmSignInOptions {
    public static final Companion Companion = new Companion(null);
    private final WeakReference<Activity> callingActivity;
    private final String friendlyDeviceName;
    private final Map<String, String> metadata;
    private final List<AuthUserAttribute> userAttributes;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoBuilder extends AuthConfirmSignInOptions.Builder<CognitoBuilder> {
        private String friendlyDeviceName;
        private Map<String, String> metadata = C6669s.f31944a;
        private List<AuthUserAttribute> userAttributes = C6668r.f31943a;
        private WeakReference<Activity> callingActivity = new WeakReference<>(null);

        public final CognitoBuilder callingActivity(Activity callingActivity) {
            AbstractC4154l.m8923f(callingActivity, "callingActivity");
            this.callingActivity = new WeakReference<>(callingActivity);
            return this;
        }

        public final CognitoBuilder friendlyDeviceName(String friendlyDeviceName) {
            AbstractC4154l.m8923f(friendlyDeviceName, "friendlyDeviceName");
            this.friendlyDeviceName = friendlyDeviceName;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public final CognitoBuilder metadata(Map<String, String> metadata) {
            AbstractC4154l.m8923f(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public final CognitoBuilder userAttributes(List<AuthUserAttribute> userAttributes) {
            AbstractC4154l.m8923f(userAttributes, "userAttributes");
            this.userAttributes = userAttributes;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public AWSCognitoAuthConfirmSignInOptions build() {
            return new AWSCognitoAuthConfirmSignInOptions(this.metadata, this.userAttributes, this.friendlyDeviceName, this.callingActivity);
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

        public final AWSCognitoAuthConfirmSignInOptions invoke(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            block.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }

        private Companion() {
        }
    }

    public AWSCognitoAuthConfirmSignInOptions(Map<String, String> metadata, List<AuthUserAttribute> userAttributes, String str, WeakReference<Activity> callingActivity) {
        AbstractC4154l.m8923f(metadata, "metadata");
        AbstractC4154l.m8923f(userAttributes, "userAttributes");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        this.metadata = metadata;
        this.userAttributes = userAttributes;
        this.friendlyDeviceName = str;
        this.callingActivity = callingActivity;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthConfirmSignInOptions copy$aws_auth_cognito_release$default(AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions, Map map, List list, String str, WeakReference weakReference, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = aWSCognitoAuthConfirmSignInOptions.metadata;
        }
        if ((i10 & 2) != 0) {
            list = aWSCognitoAuthConfirmSignInOptions.userAttributes;
        }
        if ((i10 & 4) != 0) {
            str = aWSCognitoAuthConfirmSignInOptions.friendlyDeviceName;
        }
        if ((i10 & 8) != 0) {
            weakReference = aWSCognitoAuthConfirmSignInOptions.callingActivity;
        }
        return aWSCognitoAuthConfirmSignInOptions.copy$aws_auth_cognito_release(map, list, str, weakReference);
    }

    public final Map<String, String> component1() {
        return this.metadata;
    }

    public final List<AuthUserAttribute> component2() {
        return this.userAttributes;
    }

    public final String component3() {
        return this.friendlyDeviceName;
    }

    public final WeakReference<Activity> component4() {
        return this.callingActivity;
    }

    public final AWSCognitoAuthConfirmSignInOptions copy$aws_auth_cognito_release(Map<String, String> metadata, List<AuthUserAttribute> userAttributes, String str, WeakReference<Activity> callingActivity) {
        AbstractC4154l.m8923f(metadata, "metadata");
        AbstractC4154l.m8923f(userAttributes, "userAttributes");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        return new AWSCognitoAuthConfirmSignInOptions(metadata, userAttributes, str, callingActivity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthConfirmSignInOptions)) {
            return false;
        }
        AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions = (AWSCognitoAuthConfirmSignInOptions) obj;
        return AbstractC4154l.m8918a(this.metadata, aWSCognitoAuthConfirmSignInOptions.metadata) && AbstractC4154l.m8918a(this.userAttributes, aWSCognitoAuthConfirmSignInOptions.userAttributes) && AbstractC4154l.m8918a(this.friendlyDeviceName, aWSCognitoAuthConfirmSignInOptions.friendlyDeviceName) && AbstractC4154l.m8918a(this.callingActivity, aWSCognitoAuthConfirmSignInOptions.callingActivity);
    }

    public final WeakReference<Activity> getCallingActivity() {
        return this.callingActivity;
    }

    public final String getFriendlyDeviceName() {
        return this.friendlyDeviceName;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final List<AuthUserAttribute> getUserAttributes() {
        return this.userAttributes;
    }

    public int hashCode() {
        int iM4559f = AbstractC1452a.m4559f(this.userAttributes, this.metadata.hashCode() * 31, 31);
        String str = this.friendlyDeviceName;
        return this.callingActivity.hashCode() + ((iM4559f + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "AWSCognitoAuthConfirmSignInOptions(metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ", friendlyDeviceName=" + this.friendlyDeviceName + ", callingActivity=" + this.callingActivity + ")";
    }
}
