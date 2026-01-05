package com.amplifyframework.statemachine.codegen.data;

import android.app.Activity;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import java.lang.ref.WeakReference;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class SignInData {

    public static final class AutoSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String session;
        private final String userId;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoSignInData(String str, String str2, Map<String, String> map, String str3) {
            super(null);
            sq8.m48649h(str, "username");
            sq8.m48649h(map, "metadata");
            this.username = str;
            this.session = str2;
            this.metadata = map;
            this.userId = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoSignInData copy$default(AutoSignInData autoSignInData, String str, String str2, Map map, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autoSignInData.username;
            }
            if ((i & 2) != 0) {
                str2 = autoSignInData.session;
            }
            if ((i & 4) != 0) {
                map = autoSignInData.metadata;
            }
            if ((i & 8) != 0) {
                str3 = autoSignInData.userId;
            }
            return autoSignInData.copy(str, str2, map, str3);
        }

        public final String component1() {
            return this.username;
        }

        public final String component2() {
            return this.session;
        }

        public final Map<String, String> component3() {
            return this.metadata;
        }

        public final String component4() {
            return this.userId;
        }

        public final AutoSignInData copy(String str, String str2, Map<String, String> map, String str3) {
            sq8.m48649h(str, "username");
            sq8.m48649h(map, "metadata");
            return new AutoSignInData(str, str2, map, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoSignInData)) {
                return false;
            }
            AutoSignInData autoSignInData = (AutoSignInData) obj;
            return sq8.m48644c(this.username, autoSignInData.username) && sq8.m48644c(this.session, autoSignInData.session) && sq8.m48644c(this.metadata, autoSignInData.metadata) && sq8.m48644c(this.userId, autoSignInData.userId);
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final String getSession() {
            return this.session;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            int iHashCode = this.username.hashCode() * 31;
            String str = this.session;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.metadata.hashCode()) * 31;
            String str2 = this.userId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AutoSignInData(username=" + this.username + ", session=" + this.session + ", metadata=" + this.metadata + ", userId=" + this.userId + ")";
        }
    }

    public static final class CustomAuthSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAuthSignInData(String str, Map<String, String> map) {
            super(null);
            sq8.m48649h(map, "metadata");
            this.username = str;
            this.metadata = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomAuthSignInData copy$default(CustomAuthSignInData customAuthSignInData, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customAuthSignInData.username;
            }
            if ((i & 2) != 0) {
                map = customAuthSignInData.metadata;
            }
            return customAuthSignInData.copy(str, map);
        }

        public final String component1() {
            return this.username;
        }

        public final Map<String, String> component2() {
            return this.metadata;
        }

        public final CustomAuthSignInData copy(String str, Map<String, String> map) {
            sq8.m48649h(map, "metadata");
            return new CustomAuthSignInData(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomAuthSignInData)) {
                return false;
            }
            CustomAuthSignInData customAuthSignInData = (CustomAuthSignInData) obj;
            return sq8.m48644c(this.username, customAuthSignInData.username) && sq8.m48644c(this.metadata, customAuthSignInData.metadata);
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.metadata.hashCode();
        }

        public String toString() {
            return "CustomAuthSignInData(username=" + this.username + ", metadata=" + this.metadata + ")";
        }
    }

    public static final class CustomSRPAuthSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomSRPAuthSignInData(String str, String str2, Map<String, String> map) {
            super(null);
            sq8.m48649h(map, "metadata");
            this.username = str;
            this.password = str2;
            this.metadata = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomSRPAuthSignInData copy$default(CustomSRPAuthSignInData customSRPAuthSignInData, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customSRPAuthSignInData.username;
            }
            if ((i & 2) != 0) {
                str2 = customSRPAuthSignInData.password;
            }
            if ((i & 4) != 0) {
                map = customSRPAuthSignInData.metadata;
            }
            return customSRPAuthSignInData.copy(str, str2, map);
        }

        public final String component1() {
            return this.username;
        }

        public final String component2() {
            return this.password;
        }

        public final Map<String, String> component3() {
            return this.metadata;
        }

        public final CustomSRPAuthSignInData copy(String str, String str2, Map<String, String> map) {
            sq8.m48649h(map, "metadata");
            return new CustomSRPAuthSignInData(str, str2, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomSRPAuthSignInData)) {
                return false;
            }
            CustomSRPAuthSignInData customSRPAuthSignInData = (CustomSRPAuthSignInData) obj;
            return sq8.m48644c(this.username, customSRPAuthSignInData.username) && sq8.m48644c(this.password, customSRPAuthSignInData.password) && sq8.m48644c(this.metadata, customSRPAuthSignInData.metadata);
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.password;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.metadata.hashCode();
        }

        public String toString() {
            return "CustomSRPAuthSignInData(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
        }
    }

    public static final class HostedUISignInData extends SignInData {
        private final HostedUIOptions hostedUIOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HostedUISignInData(HostedUIOptions hostedUIOptions) {
            super(null);
            sq8.m48649h(hostedUIOptions, "hostedUIOptions");
            this.hostedUIOptions = hostedUIOptions;
        }

        public static /* synthetic */ HostedUISignInData copy$default(HostedUISignInData hostedUISignInData, HostedUIOptions hostedUIOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUIOptions = hostedUISignInData.hostedUIOptions;
            }
            return hostedUISignInData.copy(hostedUIOptions);
        }

        public final HostedUIOptions component1() {
            return this.hostedUIOptions;
        }

        public final HostedUISignInData copy(HostedUIOptions hostedUIOptions) {
            sq8.m48649h(hostedUIOptions, "hostedUIOptions");
            return new HostedUISignInData(hostedUIOptions);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HostedUISignInData) && sq8.m48644c(this.hostedUIOptions, ((HostedUISignInData) obj).hostedUIOptions);
        }

        public final HostedUIOptions getHostedUIOptions() {
            return this.hostedUIOptions;
        }

        public int hashCode() {
            return this.hostedUIOptions.hashCode();
        }

        public String toString() {
            return "HostedUISignInData(hostedUIOptions=" + this.hostedUIOptions + ")";
        }
    }

    public static final class MigrationAuthSignInData extends SignInData {
        private final AuthFlowType authFlowType;
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MigrationAuthSignInData(String str, String str2, Map<String, String> map, AuthFlowType authFlowType) {
            super(null);
            sq8.m48649h(map, "metadata");
            sq8.m48649h(authFlowType, "authFlowType");
            this.username = str;
            this.password = str2;
            this.metadata = map;
            this.authFlowType = authFlowType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MigrationAuthSignInData copy$default(MigrationAuthSignInData migrationAuthSignInData, String str, String str2, Map map, AuthFlowType authFlowType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = migrationAuthSignInData.username;
            }
            if ((i & 2) != 0) {
                str2 = migrationAuthSignInData.password;
            }
            if ((i & 4) != 0) {
                map = migrationAuthSignInData.metadata;
            }
            if ((i & 8) != 0) {
                authFlowType = migrationAuthSignInData.authFlowType;
            }
            return migrationAuthSignInData.copy(str, str2, map, authFlowType);
        }

        public final String component1() {
            return this.username;
        }

        public final String component2() {
            return this.password;
        }

        public final Map<String, String> component3() {
            return this.metadata;
        }

        public final AuthFlowType component4() {
            return this.authFlowType;
        }

        public final MigrationAuthSignInData copy(String str, String str2, Map<String, String> map, AuthFlowType authFlowType) {
            sq8.m48649h(map, "metadata");
            sq8.m48649h(authFlowType, "authFlowType");
            return new MigrationAuthSignInData(str, str2, map, authFlowType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MigrationAuthSignInData)) {
                return false;
            }
            MigrationAuthSignInData migrationAuthSignInData = (MigrationAuthSignInData) obj;
            return sq8.m48644c(this.username, migrationAuthSignInData.username) && sq8.m48644c(this.password, migrationAuthSignInData.password) && sq8.m48644c(this.metadata, migrationAuthSignInData.metadata) && this.authFlowType == migrationAuthSignInData.authFlowType;
        }

        public final AuthFlowType getAuthFlowType() {
            return this.authFlowType;
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.password;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.metadata.hashCode()) * 31) + this.authFlowType.hashCode();
        }

        public String toString() {
            return "MigrationAuthSignInData(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ", authFlowType=" + this.authFlowType + ")";
        }
    }

    public static final class SRPSignInData extends SignInData {
        private final AuthFlowType authFlowType;
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SRPSignInData(String str, String str2, Map<String, String> map, AuthFlowType authFlowType) {
            super(null);
            sq8.m48649h(map, "metadata");
            sq8.m48649h(authFlowType, "authFlowType");
            this.username = str;
            this.password = str2;
            this.metadata = map;
            this.authFlowType = authFlowType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SRPSignInData copy$default(SRPSignInData sRPSignInData, String str, String str2, Map map, AuthFlowType authFlowType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sRPSignInData.username;
            }
            if ((i & 2) != 0) {
                str2 = sRPSignInData.password;
            }
            if ((i & 4) != 0) {
                map = sRPSignInData.metadata;
            }
            if ((i & 8) != 0) {
                authFlowType = sRPSignInData.authFlowType;
            }
            return sRPSignInData.copy(str, str2, map, authFlowType);
        }

        public final String component1() {
            return this.username;
        }

        public final String component2() {
            return this.password;
        }

        public final Map<String, String> component3() {
            return this.metadata;
        }

        public final AuthFlowType component4() {
            return this.authFlowType;
        }

        public final SRPSignInData copy(String str, String str2, Map<String, String> map, AuthFlowType authFlowType) {
            sq8.m48649h(map, "metadata");
            sq8.m48649h(authFlowType, "authFlowType");
            return new SRPSignInData(str, str2, map, authFlowType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SRPSignInData)) {
                return false;
            }
            SRPSignInData sRPSignInData = (SRPSignInData) obj;
            return sq8.m48644c(this.username, sRPSignInData.username) && sq8.m48644c(this.password, sRPSignInData.password) && sq8.m48644c(this.metadata, sRPSignInData.metadata) && this.authFlowType == sRPSignInData.authFlowType;
        }

        public final AuthFlowType getAuthFlowType() {
            return this.authFlowType;
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.password;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.metadata.hashCode()) * 31) + this.authFlowType.hashCode();
        }

        public String toString() {
            return "SRPSignInData(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ", authFlowType=" + this.authFlowType + ")";
        }
    }

    public static final class UserAuthSignInData extends SignInData {
        private final WeakReference<Activity> callingActivity;
        private final Map<String, String> metadata;
        private final AuthFactorType preferredChallenge;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAuthSignInData(String str, AuthFactorType authFactorType, WeakReference<Activity> weakReference, Map<String, String> map) {
            super(null);
            sq8.m48649h(weakReference, "callingActivity");
            sq8.m48649h(map, "metadata");
            this.username = str;
            this.preferredChallenge = authFactorType;
            this.callingActivity = weakReference;
            this.metadata = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserAuthSignInData copy$default(UserAuthSignInData userAuthSignInData, String str, AuthFactorType authFactorType, WeakReference weakReference, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userAuthSignInData.username;
            }
            if ((i & 2) != 0) {
                authFactorType = userAuthSignInData.preferredChallenge;
            }
            if ((i & 4) != 0) {
                weakReference = userAuthSignInData.callingActivity;
            }
            if ((i & 8) != 0) {
                map = userAuthSignInData.metadata;
            }
            return userAuthSignInData.copy(str, authFactorType, weakReference, map);
        }

        public final String component1() {
            return this.username;
        }

        public final AuthFactorType component2() {
            return this.preferredChallenge;
        }

        public final WeakReference<Activity> component3() {
            return this.callingActivity;
        }

        public final Map<String, String> component4() {
            return this.metadata;
        }

        public final UserAuthSignInData copy(String str, AuthFactorType authFactorType, WeakReference<Activity> weakReference, Map<String, String> map) {
            sq8.m48649h(weakReference, "callingActivity");
            sq8.m48649h(map, "metadata");
            return new UserAuthSignInData(str, authFactorType, weakReference, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserAuthSignInData)) {
                return false;
            }
            UserAuthSignInData userAuthSignInData = (UserAuthSignInData) obj;
            return sq8.m48644c(this.username, userAuthSignInData.username) && this.preferredChallenge == userAuthSignInData.preferredChallenge && sq8.m48644c(this.callingActivity, userAuthSignInData.callingActivity) && sq8.m48644c(this.metadata, userAuthSignInData.metadata);
        }

        public final WeakReference<Activity> getCallingActivity() {
            return this.callingActivity;
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final AuthFactorType getPreferredChallenge() {
            return this.preferredChallenge;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AuthFactorType authFactorType = this.preferredChallenge;
            return ((((iHashCode + (authFactorType != null ? authFactorType.hashCode() : 0)) * 31) + this.callingActivity.hashCode()) * 31) + this.metadata.hashCode();
        }

        public String toString() {
            return "UserAuthSignInData(username=" + this.username + ", preferredChallenge=" + this.preferredChallenge + ", callingActivity=" + this.callingActivity + ", metadata=" + this.metadata + ")";
        }
    }

    private SignInData() {
    }

    public /* synthetic */ SignInData(id5 id5Var) {
        this();
    }
}
