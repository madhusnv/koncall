package com.amplifyframework.auth.cognito.options;

import android.app.Activity;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.util.Immutable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthSignInOptions extends AuthSignInOptions {
    private final AuthFlowType authFlowType;
    private final WeakReference<Activity> callingActivity;
    private final Map<String, String> metadata;
    private final AuthFactorType preferredFirstFactor;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CognitoBuilder extends AuthSignInOptions.Builder<CognitoBuilder> {
        private AuthFlowType authFlowType;
        private WeakReference<Activity> callingActivity = new WeakReference<>(null);
        private final Map<String, String> metadata = new HashMap();
        private AuthFactorType preferredFirstFactor;

        public CognitoBuilder authFlowType(AuthFlowType authFlowType) {
            this.authFlowType = authFlowType;
            return getThis();
        }

        public CognitoBuilder callingActivity(Activity activity) {
            this.callingActivity = new WeakReference<>(activity);
            return getThis();
        }

        @Override // com.amplifyframework.auth.options.AuthSignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder metadata(Map<String, String> map) {
            Objects.requireNonNull(map);
            this.metadata.clear();
            this.metadata.putAll(map);
            return getThis();
        }

        public CognitoBuilder preferredFirstFactor(AuthFactorType authFactorType) {
            this.preferredFirstFactor = authFactorType;
            return getThis();
        }

        @Override // com.amplifyframework.auth.options.AuthSignInOptions.Builder
        public AWSCognitoAuthSignInOptions build() {
            return new AWSCognitoAuthSignInOptions(Immutable.of(this.metadata), this.authFlowType, this.preferredFirstFactor, this.callingActivity);
        }
    }

    public AWSCognitoAuthSignInOptions(Map<String, String> map, AuthFlowType authFlowType, AuthFactorType authFactorType, WeakReference<Activity> weakReference) {
        this.metadata = map;
        this.authFlowType = authFlowType;
        this.preferredFirstFactor = authFactorType;
        this.callingActivity = weakReference;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AWSCognitoAuthSignInOptions.class == obj.getClass()) {
            AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions = (AWSCognitoAuthSignInOptions) obj;
            if (Objects.equals(getMetadata(), aWSCognitoAuthSignInOptions.getMetadata()) && Objects.equals(getAuthFlowType(), aWSCognitoAuthSignInOptions.getAuthFlowType()) && Objects.equals(getPreferredFirstFactor(), aWSCognitoAuthSignInOptions.getPreferredFirstFactor()) && Objects.equals(getCallingActivity(), aWSCognitoAuthSignInOptions.getCallingActivity())) {
                return true;
            }
        }
        return false;
    }

    public AuthFlowType getAuthFlowType() {
        return this.authFlowType;
    }

    public WeakReference<Activity> getCallingActivity() {
        return this.callingActivity;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public AuthFactorType getPreferredFirstFactor() {
        return this.preferredFirstFactor;
    }

    public int hashCode() {
        return Objects.hash(getMetadata(), getAuthFlowType(), getPreferredFirstFactor(), getCallingActivity());
    }

    public String toString() {
        return "AWSCognitoAuthSignInOptions{metadata=" + getMetadata() + ", authFlowType=" + getAuthFlowType() + ", preferredFirstFactor=" + getPreferredFirstFactor() + ", callingActivity=" + getCallingActivity() + '}';
    }
}
