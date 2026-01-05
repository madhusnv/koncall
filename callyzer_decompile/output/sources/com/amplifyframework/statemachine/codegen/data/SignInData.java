package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import android.app.Activity;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import i0.m0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SignInData {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class AutoSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String session;
        private final String userId;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoSignInData(String username, String str, Map<String, String> metadata, String str2) {
            super(null);
            AbstractC4154l.m8923f(username, "username");
            AbstractC4154l.m8923f(metadata, "metadata");
            this.username = username;
            this.session = str;
            this.metadata = metadata;
            this.userId = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoSignInData copy$default(AutoSignInData autoSignInData, String str, String str2, Map map, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = autoSignInData.username;
            }
            if ((i10 & 2) != 0) {
                str2 = autoSignInData.session;
            }
            if ((i10 & 4) != 0) {
                map = autoSignInData.metadata;
            }
            if ((i10 & 8) != 0) {
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

        public final AutoSignInData copy(String username, String str, Map<String, String> metadata, String str2) {
            AbstractC4154l.m8923f(username, "username");
            AbstractC4154l.m8923f(metadata, "metadata");
            return new AutoSignInData(username, str, metadata, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoSignInData)) {
                return false;
            }
            AutoSignInData autoSignInData = (AutoSignInData) obj;
            return AbstractC4154l.m8918a(this.username, autoSignInData.username) && AbstractC4154l.m8918a(this.session, autoSignInData.session) && AbstractC4154l.m8918a(this.metadata, autoSignInData.metadata) && AbstractC4154l.m8918a(this.userId, autoSignInData.userId);
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
            int iM7369b = m0.m7369b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.metadata);
            String str2 = this.userId;
            return iM7369b + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.username;
            String str2 = this.session;
            Map<String, String> map = this.metadata;
            String str3 = this.userId;
            StringBuilder sbM127r = AbstractC0030c.m127r("AutoSignInData(username=", str, ", session=", str2, ", metadata=");
            sbM127r.append(map);
            sbM127r.append(", userId=");
            sbM127r.append(str3);
            sbM127r.append(")");
            return sbM127r.toString();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CustomAuthSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAuthSignInData(String str, Map<String, String> metadata) {
            super(null);
            AbstractC4154l.m8923f(metadata, "metadata");
            this.username = str;
            this.metadata = metadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomAuthSignInData copy$default(CustomAuthSignInData customAuthSignInData, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = customAuthSignInData.username;
            }
            if ((i10 & 2) != 0) {
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

        public final CustomAuthSignInData copy(String str, Map<String, String> metadata) {
            AbstractC4154l.m8923f(metadata, "metadata");
            return new CustomAuthSignInData(str, metadata);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomAuthSignInData)) {
                return false;
            }
            CustomAuthSignInData customAuthSignInData = (CustomAuthSignInData) obj;
            return AbstractC4154l.m8918a(this.username, customAuthSignInData.username) && AbstractC4154l.m8918a(this.metadata, customAuthSignInData.metadata);
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            return this.metadata.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "CustomAuthSignInData(username=" + this.username + ", metadata=" + this.metadata + ")";
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class CustomSRPAuthSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomSRPAuthSignInData(String str, String str2, Map<String, String> metadata) {
            super(null);
            AbstractC4154l.m8923f(metadata, "metadata");
            this.username = str;
            this.password = str2;
            this.metadata = metadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomSRPAuthSignInData copy$default(CustomSRPAuthSignInData customSRPAuthSignInData, String str, String str2, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = customSRPAuthSignInData.username;
            }
            if ((i10 & 2) != 0) {
                str2 = customSRPAuthSignInData.password;
            }
            if ((i10 & 4) != 0) {
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

        public final CustomSRPAuthSignInData copy(String str, String str2, Map<String, String> metadata) {
            AbstractC4154l.m8923f(metadata, "metadata");
            return new CustomSRPAuthSignInData(str, str2, metadata);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomSRPAuthSignInData)) {
                return false;
            }
            CustomSRPAuthSignInData customSRPAuthSignInData = (CustomSRPAuthSignInData) obj;
            return AbstractC4154l.m8918a(this.username, customSRPAuthSignInData.username) && AbstractC4154l.m8918a(this.password, customSRPAuthSignInData.password) && AbstractC4154l.m8918a(this.metadata, customSRPAuthSignInData.metadata);
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
            return this.metadata.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.username;
            String str2 = this.password;
            Map<String, String> map = this.metadata;
            StringBuilder sbM127r = AbstractC0030c.m127r("CustomSRPAuthSignInData(username=", str, ", password=", str2, ", metadata=");
            sbM127r.append(map);
            sbM127r.append(")");
            return sbM127r.toString();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class HostedUISignInData extends SignInData {
        private final HostedUIOptions hostedUIOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HostedUISignInData(HostedUIOptions hostedUIOptions) {
            super(null);
            AbstractC4154l.m8923f(hostedUIOptions, "hostedUIOptions");
            this.hostedUIOptions = hostedUIOptions;
        }

        public static /* synthetic */ HostedUISignInData copy$default(HostedUISignInData hostedUISignInData, HostedUIOptions hostedUIOptions, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                hostedUIOptions = hostedUISignInData.hostedUIOptions;
            }
            return hostedUISignInData.copy(hostedUIOptions);
        }

        public final HostedUIOptions component1() {
            return this.hostedUIOptions;
        }

        public final HostedUISignInData copy(HostedUIOptions hostedUIOptions) {
            AbstractC4154l.m8923f(hostedUIOptions, "hostedUIOptions");
            return new HostedUISignInData(hostedUIOptions);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HostedUISignInData) && AbstractC4154l.m8918a(this.hostedUIOptions, ((HostedUISignInData) obj).hostedUIOptions);
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

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class MigrationAuthSignInData extends SignInData {
        private final AuthFlowType authFlowType;
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MigrationAuthSignInData(String str, String str2, Map<String, String> metadata, AuthFlowType authFlowType) {
            super(null);
            AbstractC4154l.m8923f(metadata, "metadata");
            AbstractC4154l.m8923f(authFlowType, "authFlowType");
            this.username = str;
            this.password = str2;
            this.metadata = metadata;
            this.authFlowType = authFlowType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MigrationAuthSignInData copy$default(MigrationAuthSignInData migrationAuthSignInData, String str, String str2, Map map, AuthFlowType authFlowType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = migrationAuthSignInData.username;
            }
            if ((i10 & 2) != 0) {
                str2 = migrationAuthSignInData.password;
            }
            if ((i10 & 4) != 0) {
                map = migrationAuthSignInData.metadata;
            }
            if ((i10 & 8) != 0) {
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

        public final MigrationAuthSignInData copy(String str, String str2, Map<String, String> metadata, AuthFlowType authFlowType) {
            AbstractC4154l.m8923f(metadata, "metadata");
            AbstractC4154l.m8923f(authFlowType, "authFlowType");
            return new MigrationAuthSignInData(str, str2, metadata, authFlowType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MigrationAuthSignInData)) {
                return false;
            }
            MigrationAuthSignInData migrationAuthSignInData = (MigrationAuthSignInData) obj;
            return AbstractC4154l.m8918a(this.username, migrationAuthSignInData.username) && AbstractC4154l.m8918a(this.password, migrationAuthSignInData.password) && AbstractC4154l.m8918a(this.metadata, migrationAuthSignInData.metadata) && this.authFlowType == migrationAuthSignInData.authFlowType;
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
            return this.authFlowType.hashCode() + m0.m7369b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.metadata);
        }

        public String toString() {
            String str = this.username;
            String str2 = this.password;
            Map<String, String> map = this.metadata;
            AuthFlowType authFlowType = this.authFlowType;
            StringBuilder sbM127r = AbstractC0030c.m127r("MigrationAuthSignInData(username=", str, ", password=", str2, ", metadata=");
            sbM127r.append(map);
            sbM127r.append(", authFlowType=");
            sbM127r.append(authFlowType);
            sbM127r.append(")");
            return sbM127r.toString();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class SRPSignInData extends SignInData {
        private final AuthFlowType authFlowType;
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SRPSignInData(String str, String str2, Map<String, String> metadata, AuthFlowType authFlowType) {
            super(null);
            AbstractC4154l.m8923f(metadata, "metadata");
            AbstractC4154l.m8923f(authFlowType, "authFlowType");
            this.username = str;
            this.password = str2;
            this.metadata = metadata;
            this.authFlowType = authFlowType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SRPSignInData copy$default(SRPSignInData sRPSignInData, String str, String str2, Map map, AuthFlowType authFlowType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sRPSignInData.username;
            }
            if ((i10 & 2) != 0) {
                str2 = sRPSignInData.password;
            }
            if ((i10 & 4) != 0) {
                map = sRPSignInData.metadata;
            }
            if ((i10 & 8) != 0) {
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

        public final SRPSignInData copy(String str, String str2, Map<String, String> metadata, AuthFlowType authFlowType) {
            AbstractC4154l.m8923f(metadata, "metadata");
            AbstractC4154l.m8923f(authFlowType, "authFlowType");
            return new SRPSignInData(str, str2, metadata, authFlowType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SRPSignInData)) {
                return false;
            }
            SRPSignInData sRPSignInData = (SRPSignInData) obj;
            return AbstractC4154l.m8918a(this.username, sRPSignInData.username) && AbstractC4154l.m8918a(this.password, sRPSignInData.password) && AbstractC4154l.m8918a(this.metadata, sRPSignInData.metadata) && this.authFlowType == sRPSignInData.authFlowType;
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
            return this.authFlowType.hashCode() + m0.m7369b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.metadata);
        }

        public String toString() {
            String str = this.username;
            String str2 = this.password;
            Map<String, String> map = this.metadata;
            AuthFlowType authFlowType = this.authFlowType;
            StringBuilder sbM127r = AbstractC0030c.m127r("SRPSignInData(username=", str, ", password=", str2, ", metadata=");
            sbM127r.append(map);
            sbM127r.append(", authFlowType=");
            sbM127r.append(authFlowType);
            sbM127r.append(")");
            return sbM127r.toString();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class UserAuthSignInData extends SignInData {
        private final WeakReference<Activity> callingActivity;
        private final Map<String, String> metadata;
        private final AuthFactorType preferredChallenge;
        private final String username;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAuthSignInData(String str, AuthFactorType authFactorType, WeakReference<Activity> callingActivity, Map<String, String> metadata) {
            super(null);
            AbstractC4154l.m8923f(callingActivity, "callingActivity");
            AbstractC4154l.m8923f(metadata, "metadata");
            this.username = str;
            this.preferredChallenge = authFactorType;
            this.callingActivity = callingActivity;
            this.metadata = metadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserAuthSignInData copy$default(UserAuthSignInData userAuthSignInData, String str, AuthFactorType authFactorType, WeakReference weakReference, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = userAuthSignInData.username;
            }
            if ((i10 & 2) != 0) {
                authFactorType = userAuthSignInData.preferredChallenge;
            }
            if ((i10 & 4) != 0) {
                weakReference = userAuthSignInData.callingActivity;
            }
            if ((i10 & 8) != 0) {
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

        public final UserAuthSignInData copy(String str, AuthFactorType authFactorType, WeakReference<Activity> callingActivity, Map<String, String> metadata) {
            AbstractC4154l.m8923f(callingActivity, "callingActivity");
            AbstractC4154l.m8923f(metadata, "metadata");
            return new UserAuthSignInData(str, authFactorType, callingActivity, metadata);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserAuthSignInData)) {
                return false;
            }
            UserAuthSignInData userAuthSignInData = (UserAuthSignInData) obj;
            return AbstractC4154l.m8918a(this.username, userAuthSignInData.username) && this.preferredChallenge == userAuthSignInData.preferredChallenge && AbstractC4154l.m8918a(this.callingActivity, userAuthSignInData.callingActivity) && AbstractC4154l.m8918a(this.metadata, userAuthSignInData.metadata);
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
            return this.metadata.hashCode() + ((this.callingActivity.hashCode() + ((iHashCode + (authFactorType != null ? authFactorType.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            return "UserAuthSignInData(username=" + this.username + ", preferredChallenge=" + this.preferredChallenge + ", callingActivity=" + this.callingActivity + ", metadata=" + this.metadata + ")";
        }
    }

    public /* synthetic */ SignInData(AbstractC4148f abstractC4148f) {
        this();
    }

    private SignInData() {
    }
}
