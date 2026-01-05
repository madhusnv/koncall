package com.amplifyframework.auth.cognito.options;

import android.app.Activity;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p001o.ch3;
import p001o.id5;
import p001o.isa;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthConfirmSignInOptions extends AuthConfirmSignInOptions {
    public static final Companion Companion = new Companion(null);
    private final WeakReference<Activity> callingActivity;
    private final String friendlyDeviceName;
    private final Map<String, String> metadata;
    private final List<AuthUserAttribute> userAttributes;

    public static final class CognitoBuilder extends AuthConfirmSignInOptions.Builder<CognitoBuilder> {
        private String friendlyDeviceName;
        private Map<String, String> metadata = isa.m32681h();
        private List<AuthUserAttribute> userAttributes = ch3.m21246k();
        private WeakReference<Activity> callingActivity = new WeakReference<>(null);

        public final CognitoBuilder callingActivity(Activity activity) {
            sq8.m48649h(activity, "callingActivity");
            this.callingActivity = new WeakReference<>(activity);
            return this;
        }

        public final CognitoBuilder friendlyDeviceName(String str) {
            sq8.m48649h(str, "friendlyDeviceName");
            this.friendlyDeviceName = str;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public final CognitoBuilder metadata(Map<String, String> map) {
            sq8.m48649h(map, "metadata");
            this.metadata = map;
            return this;
        }

        public final CognitoBuilder userAttributes(List<AuthUserAttribute> list) {
            sq8.m48649h(list, "userAttributes");
            this.userAttributes = list;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public AWSCognitoAuthConfirmSignInOptions build() {
            return new AWSCognitoAuthConfirmSignInOptions(this.metadata, this.userAttributes, this.friendlyDeviceName, this.callingActivity);
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

        public final AWSCognitoAuthConfirmSignInOptions invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            xk7Var.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public AWSCognitoAuthConfirmSignInOptions(Map<String, String> map, List<AuthUserAttribute> list, String str, WeakReference<Activity> weakReference) {
        sq8.m48649h(map, "metadata");
        sq8.m48649h(list, "userAttributes");
        sq8.m48649h(weakReference, "callingActivity");
        this.metadata = map;
        this.userAttributes = list;
        this.friendlyDeviceName = str;
        this.callingActivity = weakReference;
    }

    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthConfirmSignInOptions copy$default(AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions, Map map, List list, String str, WeakReference weakReference, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aWSCognitoAuthConfirmSignInOptions.metadata;
        }
        if ((i & 2) != 0) {
            list = aWSCognitoAuthConfirmSignInOptions.userAttributes;
        }
        if ((i & 4) != 0) {
            str = aWSCognitoAuthConfirmSignInOptions.friendlyDeviceName;
        }
        if ((i & 8) != 0) {
            weakReference = aWSCognitoAuthConfirmSignInOptions.callingActivity;
        }
        return aWSCognitoAuthConfirmSignInOptions.copy(map, list, str, weakReference);
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

    public final AWSCognitoAuthConfirmSignInOptions copy(Map<String, String> map, List<AuthUserAttribute> list, String str, WeakReference<Activity> weakReference) {
        sq8.m48649h(map, "metadata");
        sq8.m48649h(list, "userAttributes");
        sq8.m48649h(weakReference, "callingActivity");
        return new AWSCognitoAuthConfirmSignInOptions(map, list, str, weakReference);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthConfirmSignInOptions)) {
            return false;
        }
        AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions = (AWSCognitoAuthConfirmSignInOptions) obj;
        return sq8.m48644c(this.metadata, aWSCognitoAuthConfirmSignInOptions.metadata) && sq8.m48644c(this.userAttributes, aWSCognitoAuthConfirmSignInOptions.userAttributes) && sq8.m48644c(this.friendlyDeviceName, aWSCognitoAuthConfirmSignInOptions.friendlyDeviceName) && sq8.m48644c(this.callingActivity, aWSCognitoAuthConfirmSignInOptions.callingActivity);
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
        int iHashCode = ((this.metadata.hashCode() * 31) + this.userAttributes.hashCode()) * 31;
        String str = this.friendlyDeviceName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callingActivity.hashCode();
    }

    public String toString() {
        return "AWSCognitoAuthConfirmSignInOptions(metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ", friendlyDeviceName=" + this.friendlyDeviceName + ", callingActivity=" + this.callingActivity + ")";
    }
}
