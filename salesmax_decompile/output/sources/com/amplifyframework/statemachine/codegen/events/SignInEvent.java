package com.amplifyframework.statemachine.codegen.events;

import android.app.Activity;
import com.amplifyframework.auth.AuthFactorType;
import com.amplifyframework.auth.cognito.options.AuthFlowType;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.WebAuthnSignInContext;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignInEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;

    /* renamed from: type, reason: collision with root package name */
    private final String f58132type;

    public static abstract class EventType {

        public static final class ConfirmDevice extends EventType {
            private final DeviceMetadata.Metadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmDevice(DeviceMetadata.Metadata metadata, SignedInData signedInData) {
                super(null);
                sq8.m48649h(metadata, "deviceMetadata");
                sq8.m48649h(signedInData, "signedInData");
                this.deviceMetadata = metadata;
                this.signedInData = signedInData;
            }

            public static /* synthetic */ ConfirmDevice copy$default(ConfirmDevice confirmDevice, DeviceMetadata.Metadata metadata, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    metadata = confirmDevice.deviceMetadata;
                }
                if ((i & 2) != 0) {
                    signedInData = confirmDevice.signedInData;
                }
                return confirmDevice.copy(metadata, signedInData);
            }

            public final DeviceMetadata.Metadata component1() {
                return this.deviceMetadata;
            }

            public final SignedInData component2() {
                return this.signedInData;
            }

            public final ConfirmDevice copy(DeviceMetadata.Metadata metadata, SignedInData signedInData) {
                sq8.m48649h(metadata, "deviceMetadata");
                sq8.m48649h(signedInData, "signedInData");
                return new ConfirmDevice(metadata, signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmDevice)) {
                    return false;
                }
                ConfirmDevice confirmDevice = (ConfirmDevice) obj;
                return sq8.m48644c(this.deviceMetadata, confirmDevice.deviceMetadata) && sq8.m48644c(this.signedInData, confirmDevice.signedInData);
            }

            public final DeviceMetadata.Metadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return (this.deviceMetadata.hashCode() * 31) + this.signedInData.hashCode();
            }

            public String toString() {
                return "ConfirmDevice(deviceMetadata=" + this.deviceMetadata + ", signedInData=" + this.signedInData + ")";
            }
        }

        public static final class FinalizeSignIn extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public FinalizeSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = finalizeSignIn.id;
                }
                return finalizeSignIn.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final FinalizeSignIn copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new FinalizeSignIn(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && sq8.m48644c(this.id, ((FinalizeSignIn) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "FinalizeSignIn(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ FinalizeSignIn(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class InitiateAutoSignIn extends EventType {
            private final SignInData.AutoSignInData signInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateAutoSignIn(SignInData.AutoSignInData autoSignInData) {
                super(null);
                sq8.m48649h(autoSignInData, "signInData");
                this.signInData = autoSignInData;
            }

            public static /* synthetic */ InitiateAutoSignIn copy$default(InitiateAutoSignIn initiateAutoSignIn, SignInData.AutoSignInData autoSignInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    autoSignInData = initiateAutoSignIn.signInData;
                }
                return initiateAutoSignIn.copy(autoSignInData);
            }

            public final SignInData.AutoSignInData component1() {
                return this.signInData;
            }

            public final InitiateAutoSignIn copy(SignInData.AutoSignInData autoSignInData) {
                sq8.m48649h(autoSignInData, "signInData");
                return new InitiateAutoSignIn(autoSignInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateAutoSignIn) && sq8.m48644c(this.signInData, ((InitiateAutoSignIn) obj).signInData);
            }

            public final SignInData.AutoSignInData getSignInData() {
                return this.signInData;
            }

            public int hashCode() {
                return this.signInData.hashCode();
            }

            public String toString() {
                return "InitiateAutoSignIn(signInData=" + this.signInData + ")";
            }
        }

        public static final class InitiateCustomSignInWithSRP extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateCustomSignInWithSRP(String str, String str2, Map<String, String> map) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                this.username = str;
                this.password = str2;
                this.metadata = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateCustomSignInWithSRP copy$default(InitiateCustomSignInWithSRP initiateCustomSignInWithSRP, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateCustomSignInWithSRP.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateCustomSignInWithSRP.password;
                }
                if ((i & 4) != 0) {
                    map = initiateCustomSignInWithSRP.metadata;
                }
                return initiateCustomSignInWithSRP.copy(str, str2, map);
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

            public final InitiateCustomSignInWithSRP copy(String str, String str2, Map<String, String> map) {
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                return new InitiateCustomSignInWithSRP(str, str2, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateCustomSignInWithSRP)) {
                    return false;
                }
                InitiateCustomSignInWithSRP initiateCustomSignInWithSRP = (InitiateCustomSignInWithSRP) obj;
                return sq8.m48644c(this.username, initiateCustomSignInWithSRP.username) && sq8.m48644c(this.password, initiateCustomSignInWithSRP.password) && sq8.m48644c(this.metadata, initiateCustomSignInWithSRP.metadata);
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
                return (((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode();
            }

            public String toString() {
                return "InitiateCustomSignInWithSRP(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
            }
        }

        public static final class InitiateHostedUISignIn extends EventType {
            private final SignInData.HostedUISignInData hostedUISignInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateHostedUISignIn(SignInData.HostedUISignInData hostedUISignInData) {
                super(null);
                sq8.m48649h(hostedUISignInData, "hostedUISignInData");
                this.hostedUISignInData = hostedUISignInData;
            }

            public static /* synthetic */ InitiateHostedUISignIn copy$default(InitiateHostedUISignIn initiateHostedUISignIn, SignInData.HostedUISignInData hostedUISignInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    hostedUISignInData = initiateHostedUISignIn.hostedUISignInData;
                }
                return initiateHostedUISignIn.copy(hostedUISignInData);
            }

            public final SignInData.HostedUISignInData component1() {
                return this.hostedUISignInData;
            }

            public final InitiateHostedUISignIn copy(SignInData.HostedUISignInData hostedUISignInData) {
                sq8.m48649h(hostedUISignInData, "hostedUISignInData");
                return new InitiateHostedUISignIn(hostedUISignInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateHostedUISignIn) && sq8.m48644c(this.hostedUISignInData, ((InitiateHostedUISignIn) obj).hostedUISignInData);
            }

            public final SignInData.HostedUISignInData getHostedUISignInData() {
                return this.hostedUISignInData;
            }

            public int hashCode() {
                return this.hostedUISignInData.hashCode();
            }

            public String toString() {
                return "InitiateHostedUISignIn(hostedUISignInData=" + this.hostedUISignInData + ")";
            }
        }

        public static final class InitiateMigrateAuth extends EventType {
            private final AuthFlowType authFlowType;
            private final Map<String, String> metadata;
            private final String password;
            private final AuthChallenge respondToAuthChallenge;
            private final String username;

            public /* synthetic */ InitiateMigrateAuth(String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i, id5 id5Var) {
                this(str, str2, map, authFlowType, (i & 16) != 0 ? null : authChallenge);
            }

            public static /* synthetic */ InitiateMigrateAuth copy$default(InitiateMigrateAuth initiateMigrateAuth, String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateMigrateAuth.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateMigrateAuth.password;
                }
                String str3 = str2;
                if ((i & 4) != 0) {
                    map = initiateMigrateAuth.metadata;
                }
                Map map2 = map;
                if ((i & 8) != 0) {
                    authFlowType = initiateMigrateAuth.authFlowType;
                }
                AuthFlowType authFlowType2 = authFlowType;
                if ((i & 16) != 0) {
                    authChallenge = initiateMigrateAuth.respondToAuthChallenge;
                }
                return initiateMigrateAuth.copy(str, str3, map2, authFlowType2, authChallenge);
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

            public final AuthChallenge component5() {
                return this.respondToAuthChallenge;
            }

            public final InitiateMigrateAuth copy(String str, String str2, Map<String, String> map, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(authFlowType, "authFlowType");
                return new InitiateMigrateAuth(str, str2, map, authFlowType, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateMigrateAuth)) {
                    return false;
                }
                InitiateMigrateAuth initiateMigrateAuth = (InitiateMigrateAuth) obj;
                return sq8.m48644c(this.username, initiateMigrateAuth.username) && sq8.m48644c(this.password, initiateMigrateAuth.password) && sq8.m48644c(this.metadata, initiateMigrateAuth.metadata) && this.authFlowType == initiateMigrateAuth.authFlowType && sq8.m48644c(this.respondToAuthChallenge, initiateMigrateAuth.respondToAuthChallenge);
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

            public final AuthChallenge getRespondToAuthChallenge() {
                return this.respondToAuthChallenge;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                int iHashCode = ((((((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.authFlowType.hashCode()) * 31;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                return iHashCode + (authChallenge == null ? 0 : authChallenge.hashCode());
            }

            public String toString() {
                return "InitiateMigrateAuth(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ", authFlowType=" + this.authFlowType + ", respondToAuthChallenge=" + this.respondToAuthChallenge + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateMigrateAuth(String str, String str2, Map<String, String> map, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(authFlowType, "authFlowType");
                this.username = str;
                this.password = str2;
                this.metadata = map;
                this.authFlowType = authFlowType;
                this.respondToAuthChallenge = authChallenge;
            }
        }

        public static final class InitiateSignInWithCustom extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithCustom(String str, Map<String, String> map) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                this.username = str;
                this.metadata = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignInWithCustom copy$default(InitiateSignInWithCustom initiateSignInWithCustom, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSignInWithCustom.username;
                }
                if ((i & 2) != 0) {
                    map = initiateSignInWithCustom.metadata;
                }
                return initiateSignInWithCustom.copy(str, map);
            }

            public final String component1() {
                return this.username;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final InitiateSignInWithCustom copy(String str, Map<String, String> map) {
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                return new InitiateSignInWithCustom(str, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithCustom)) {
                    return false;
                }
                InitiateSignInWithCustom initiateSignInWithCustom = (InitiateSignInWithCustom) obj;
                return sq8.m48644c(this.username, initiateSignInWithCustom.username) && sq8.m48644c(this.metadata, initiateSignInWithCustom.metadata);
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return (this.username.hashCode() * 31) + this.metadata.hashCode();
            }

            public String toString() {
                return "InitiateSignInWithCustom(username=" + this.username + ", metadata=" + this.metadata + ")";
            }
        }

        public static final class InitiateSignInWithDeviceSRP extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithDeviceSRP(String str, Map<String, String> map) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                this.username = str;
                this.metadata = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignInWithDeviceSRP copy$default(InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSignInWithDeviceSRP.username;
                }
                if ((i & 2) != 0) {
                    map = initiateSignInWithDeviceSRP.metadata;
                }
                return initiateSignInWithDeviceSRP.copy(str, map);
            }

            public final String component1() {
                return this.username;
            }

            public final Map<String, String> component2() {
                return this.metadata;
            }

            public final InitiateSignInWithDeviceSRP copy(String str, Map<String, String> map) {
                sq8.m48649h(str, "username");
                sq8.m48649h(map, "metadata");
                return new InitiateSignInWithDeviceSRP(str, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithDeviceSRP)) {
                    return false;
                }
                InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP = (InitiateSignInWithDeviceSRP) obj;
                return sq8.m48644c(this.username, initiateSignInWithDeviceSRP.username) && sq8.m48644c(this.metadata, initiateSignInWithDeviceSRP.metadata);
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return (this.username.hashCode() * 31) + this.metadata.hashCode();
            }

            public String toString() {
                return "InitiateSignInWithDeviceSRP(username=" + this.username + ", metadata=" + this.metadata + ")";
            }
        }

        public static final class InitiateSignInWithSRP extends EventType {
            private final AuthFlowType authFlowType;
            private final Map<String, String> metadata;
            private final String password;
            private final AuthChallenge respondToAuthChallenge;
            private final String username;

            public /* synthetic */ InitiateSignInWithSRP(String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i, id5 id5Var) {
                this(str, str2, map, authFlowType, (i & 16) != 0 ? null : authChallenge);
            }

            public static /* synthetic */ InitiateSignInWithSRP copy$default(InitiateSignInWithSRP initiateSignInWithSRP, String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSignInWithSRP.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateSignInWithSRP.password;
                }
                String str3 = str2;
                if ((i & 4) != 0) {
                    map = initiateSignInWithSRP.metadata;
                }
                Map map2 = map;
                if ((i & 8) != 0) {
                    authFlowType = initiateSignInWithSRP.authFlowType;
                }
                AuthFlowType authFlowType2 = authFlowType;
                if ((i & 16) != 0) {
                    authChallenge = initiateSignInWithSRP.respondToAuthChallenge;
                }
                return initiateSignInWithSRP.copy(str, str3, map2, authFlowType2, authChallenge);
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

            public final AuthChallenge component5() {
                return this.respondToAuthChallenge;
            }

            public final InitiateSignInWithSRP copy(String str, String str2, Map<String, String> map, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(authFlowType, "authFlowType");
                return new InitiateSignInWithSRP(str, str2, map, authFlowType, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithSRP)) {
                    return false;
                }
                InitiateSignInWithSRP initiateSignInWithSRP = (InitiateSignInWithSRP) obj;
                return sq8.m48644c(this.username, initiateSignInWithSRP.username) && sq8.m48644c(this.password, initiateSignInWithSRP.password) && sq8.m48644c(this.metadata, initiateSignInWithSRP.metadata) && this.authFlowType == initiateSignInWithSRP.authFlowType && sq8.m48644c(this.respondToAuthChallenge, initiateSignInWithSRP.respondToAuthChallenge);
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

            public final AuthChallenge getRespondToAuthChallenge() {
                return this.respondToAuthChallenge;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                int iHashCode = ((((((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.authFlowType.hashCode()) * 31;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                return iHashCode + (authChallenge == null ? 0 : authChallenge.hashCode());
            }

            public String toString() {
                return "InitiateSignInWithSRP(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ", authFlowType=" + this.authFlowType + ", respondToAuthChallenge=" + this.respondToAuthChallenge + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithSRP(String str, String str2, Map<String, String> map, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(str2, "password");
                sq8.m48649h(map, "metadata");
                sq8.m48649h(authFlowType, "authFlowType");
                this.username = str;
                this.password = str2;
                this.metadata = map;
                this.authFlowType = authFlowType;
                this.respondToAuthChallenge = authChallenge;
            }
        }

        public static final class InitiateTOTPSetup extends EventType {
            private final Map<String, String> challengeParams;
            private final SignInMethod signInMethod;
            private final SignInTOTPSetupData signInTOTPSetupData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateTOTPSetup(SignInTOTPSetupData signInTOTPSetupData, Map<String, String> map, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(signInTOTPSetupData, "signInTOTPSetupData");
                sq8.m48649h(signInMethod, "signInMethod");
                this.signInTOTPSetupData = signInTOTPSetupData;
                this.challengeParams = map;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateTOTPSetup copy$default(InitiateTOTPSetup initiateTOTPSetup, SignInTOTPSetupData signInTOTPSetupData, Map map, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInTOTPSetupData = initiateTOTPSetup.signInTOTPSetupData;
                }
                if ((i & 2) != 0) {
                    map = initiateTOTPSetup.challengeParams;
                }
                if ((i & 4) != 0) {
                    signInMethod = initiateTOTPSetup.signInMethod;
                }
                return initiateTOTPSetup.copy(signInTOTPSetupData, map, signInMethod);
            }

            public final SignInTOTPSetupData component1() {
                return this.signInTOTPSetupData;
            }

            public final Map<String, String> component2() {
                return this.challengeParams;
            }

            public final SignInMethod component3() {
                return this.signInMethod;
            }

            public final InitiateTOTPSetup copy(SignInTOTPSetupData signInTOTPSetupData, Map<String, String> map, SignInMethod signInMethod) {
                sq8.m48649h(signInTOTPSetupData, "signInTOTPSetupData");
                sq8.m48649h(signInMethod, "signInMethod");
                return new InitiateTOTPSetup(signInTOTPSetupData, map, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateTOTPSetup)) {
                    return false;
                }
                InitiateTOTPSetup initiateTOTPSetup = (InitiateTOTPSetup) obj;
                return sq8.m48644c(this.signInTOTPSetupData, initiateTOTPSetup.signInTOTPSetupData) && sq8.m48644c(this.challengeParams, initiateTOTPSetup.challengeParams) && sq8.m48644c(this.signInMethod, initiateTOTPSetup.signInMethod);
            }

            public final Map<String, String> getChallengeParams() {
                return this.challengeParams;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public final SignInTOTPSetupData getSignInTOTPSetupData() {
                return this.signInTOTPSetupData;
            }

            public int hashCode() {
                int iHashCode = this.signInTOTPSetupData.hashCode() * 31;
                Map<String, String> map = this.challengeParams;
                return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "InitiateTOTPSetup(signInTOTPSetupData=" + this.signInTOTPSetupData + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public static final class InitiateUserAuth extends EventType {
            private final WeakReference<Activity> callingActivity;
            private final Map<String, String> metadata;
            private final AuthFactorType preferredChallenge;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateUserAuth(String str, AuthFactorType authFactorType, WeakReference<Activity> weakReference, Map<String, String> map) {
                super(null);
                sq8.m48649h(str, "username");
                sq8.m48649h(weakReference, "callingActivity");
                sq8.m48649h(map, "metadata");
                this.username = str;
                this.preferredChallenge = authFactorType;
                this.callingActivity = weakReference;
                this.metadata = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateUserAuth copy$default(InitiateUserAuth initiateUserAuth, String str, AuthFactorType authFactorType, WeakReference weakReference, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateUserAuth.username;
                }
                if ((i & 2) != 0) {
                    authFactorType = initiateUserAuth.preferredChallenge;
                }
                if ((i & 4) != 0) {
                    weakReference = initiateUserAuth.callingActivity;
                }
                if ((i & 8) != 0) {
                    map = initiateUserAuth.metadata;
                }
                return initiateUserAuth.copy(str, authFactorType, weakReference, map);
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

            public final InitiateUserAuth copy(String str, AuthFactorType authFactorType, WeakReference<Activity> weakReference, Map<String, String> map) {
                sq8.m48649h(str, "username");
                sq8.m48649h(weakReference, "callingActivity");
                sq8.m48649h(map, "metadata");
                return new InitiateUserAuth(str, authFactorType, weakReference, map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateUserAuth)) {
                    return false;
                }
                InitiateUserAuth initiateUserAuth = (InitiateUserAuth) obj;
                return sq8.m48644c(this.username, initiateUserAuth.username) && this.preferredChallenge == initiateUserAuth.preferredChallenge && sq8.m48644c(this.callingActivity, initiateUserAuth.callingActivity) && sq8.m48644c(this.metadata, initiateUserAuth.metadata);
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
                int iHashCode = this.username.hashCode() * 31;
                AuthFactorType authFactorType = this.preferredChallenge;
                return ((((iHashCode + (authFactorType == null ? 0 : authFactorType.hashCode())) * 31) + this.callingActivity.hashCode()) * 31) + this.metadata.hashCode();
            }

            public String toString() {
                return "InitiateUserAuth(username=" + this.username + ", preferredChallenge=" + this.preferredChallenge + ", callingActivity=" + this.callingActivity + ", metadata=" + this.metadata + ")";
            }
        }

        public static final class InitiateWebAuthnSignIn extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateWebAuthnSignIn(WebAuthnSignInContext webAuthnSignInContext) {
                super(null);
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                this.signInContext = webAuthnSignInContext;
            }

            public static /* synthetic */ InitiateWebAuthnSignIn copy$default(InitiateWebAuthnSignIn initiateWebAuthnSignIn, WebAuthnSignInContext webAuthnSignInContext, int i, Object obj) {
                if ((i & 1) != 0) {
                    webAuthnSignInContext = initiateWebAuthnSignIn.signInContext;
                }
                return initiateWebAuthnSignIn.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final InitiateWebAuthnSignIn copy(WebAuthnSignInContext webAuthnSignInContext) {
                sq8.m48649h(webAuthnSignInContext, "signInContext");
                return new InitiateWebAuthnSignIn(webAuthnSignInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateWebAuthnSignIn) && sq8.m48644c(this.signInContext, ((InitiateWebAuthnSignIn) obj).signInContext);
            }

            public final WebAuthnSignInContext getSignInContext() {
                return this.signInContext;
            }

            public int hashCode() {
                return this.signInContext.hashCode();
            }

            public String toString() {
                return "InitiateWebAuthnSignIn(signInContext=" + this.signInContext + ")";
            }
        }

        public static final class ReceivedChallenge extends EventType {
            private final AuthChallenge challenge;
            private final SignInMethod signInMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedChallenge(AuthChallenge authChallenge, SignInMethod signInMethod) {
                super(null);
                sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
                sq8.m48649h(signInMethod, "signInMethod");
                this.challenge = authChallenge;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ ReceivedChallenge copy$default(ReceivedChallenge receivedChallenge, AuthChallenge authChallenge, SignInMethod signInMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    authChallenge = receivedChallenge.challenge;
                }
                if ((i & 2) != 0) {
                    signInMethod = receivedChallenge.signInMethod;
                }
                return receivedChallenge.copy(authChallenge, signInMethod);
            }

            public final AuthChallenge component1() {
                return this.challenge;
            }

            public final SignInMethod component2() {
                return this.signInMethod;
            }

            public final ReceivedChallenge copy(AuthChallenge authChallenge, SignInMethod signInMethod) {
                sq8.m48649h(authChallenge, ClientData.KEY_CHALLENGE);
                sq8.m48649h(signInMethod, "signInMethod");
                return new ReceivedChallenge(authChallenge, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReceivedChallenge)) {
                    return false;
                }
                ReceivedChallenge receivedChallenge = (ReceivedChallenge) obj;
                return sq8.m48644c(this.challenge, receivedChallenge.challenge) && sq8.m48644c(this.signInMethod, receivedChallenge.signInMethod);
            }

            public final AuthChallenge getChallenge() {
                return this.challenge;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public int hashCode() {
                return (this.challenge.hashCode() * 31) + this.signInMethod.hashCode();
            }

            public String toString() {
                return "ReceivedChallenge(challenge=" + this.challenge + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        public static final class SignedIn extends EventType {
            private final String id;

            /* JADX WARN: Multi-variable type inference failed */
            public SignedIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = signedIn.id;
                }
                return signedIn.copy(str);
            }

            public final String component1() {
                return this.id;
            }

            public final SignedIn copy(String str) {
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                return new SignedIn(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignedIn) && sq8.m48644c(this.id, ((SignedIn) obj).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "SignedIn(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedIn(String str) {
                super(null);
                sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
                this.id = str;
            }

            public /* synthetic */ SignedIn(String str, int i, id5 id5Var) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exc) {
                super(null);
                sq8.m48649h(exc, "exception");
                this.exception = exc;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exc) {
                sq8.m48649h(exc, "exception");
                return new ThrowError(exc);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && sq8.m48644c(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrowError(exception=" + this.exception + ")";
            }
        }

        private EventType() {
        }

        public /* synthetic */ EventType(id5 id5Var) {
            this();
        }
    }

    public SignInEvent(EventType eventType, Date date) {
        sq8.m48649h(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        this.f58132type = simpleName;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.f58132type;
    }

    public /* synthetic */ SignInEvent(EventType eventType, Date date, int i, id5 id5Var) {
        this(eventType, (i & 2) != 0 ? null : date);
    }
}
