package com.amplifyframework.statemachine.codegen.events;

import a2.AbstractC0030c;
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
import i0.m0;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignInEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class EventType {

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ConfirmDevice extends EventType {
            private final DeviceMetadata.Metadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmDevice(DeviceMetadata.Metadata deviceMetadata, SignedInData signedInData) {
                super(null);
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
                AbstractC4154l.m8923f(signedInData, "signedInData");
                this.deviceMetadata = deviceMetadata;
                this.signedInData = signedInData;
            }

            public static /* synthetic */ ConfirmDevice copy$default(ConfirmDevice confirmDevice, DeviceMetadata.Metadata metadata, SignedInData signedInData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    metadata = confirmDevice.deviceMetadata;
                }
                if ((i10 & 2) != 0) {
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

            public final ConfirmDevice copy(DeviceMetadata.Metadata deviceMetadata, SignedInData signedInData) {
                AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
                AbstractC4154l.m8923f(signedInData, "signedInData");
                return new ConfirmDevice(deviceMetadata, signedInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmDevice)) {
                    return false;
                }
                ConfirmDevice confirmDevice = (ConfirmDevice) obj;
                return AbstractC4154l.m8918a(this.deviceMetadata, confirmDevice.deviceMetadata) && AbstractC4154l.m8918a(this.signedInData, confirmDevice.signedInData);
            }

            public final DeviceMetadata.Metadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            public int hashCode() {
                return this.signedInData.hashCode() + (this.deviceMetadata.hashCode() * 31);
            }

            public String toString() {
                return "ConfirmDevice(deviceMetadata=" + this.deviceMetadata + ", signedInData=" + this.signedInData + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class FinalizeSignIn extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43795id;

            /* JADX WARN: Multi-variable type inference failed */
            public FinalizeSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = finalizeSignIn.f43795id;
                }
                return finalizeSignIn.copy(str);
            }

            public final String component1() {
                return this.f43795id;
            }

            public final FinalizeSignIn copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new FinalizeSignIn(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && AbstractC4154l.m8918a(this.f43795id, ((FinalizeSignIn) obj).f43795id);
            }

            public final String getId() {
                return this.f43795id;
            }

            public int hashCode() {
                return this.f43795id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("FinalizeSignIn(id=", this.f43795id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43795id = id2;
            }

            public /* synthetic */ FinalizeSignIn(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateAutoSignIn extends EventType {
            private final SignInData.AutoSignInData signInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateAutoSignIn(SignInData.AutoSignInData signInData) {
                super(null);
                AbstractC4154l.m8923f(signInData, "signInData");
                this.signInData = signInData;
            }

            public static /* synthetic */ InitiateAutoSignIn copy$default(InitiateAutoSignIn initiateAutoSignIn, SignInData.AutoSignInData autoSignInData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    autoSignInData = initiateAutoSignIn.signInData;
                }
                return initiateAutoSignIn.copy(autoSignInData);
            }

            public final SignInData.AutoSignInData component1() {
                return this.signInData;
            }

            public final InitiateAutoSignIn copy(SignInData.AutoSignInData signInData) {
                AbstractC4154l.m8923f(signInData, "signInData");
                return new InitiateAutoSignIn(signInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateAutoSignIn) && AbstractC4154l.m8918a(this.signInData, ((InitiateAutoSignIn) obj).signInData);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateCustomSignInWithSRP extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateCustomSignInWithSRP(String username, String password, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.username = username;
                this.password = password;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateCustomSignInWithSRP copy$default(InitiateCustomSignInWithSRP initiateCustomSignInWithSRP, String str, String str2, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateCustomSignInWithSRP.username;
                }
                if ((i10 & 2) != 0) {
                    str2 = initiateCustomSignInWithSRP.password;
                }
                if ((i10 & 4) != 0) {
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

            public final InitiateCustomSignInWithSRP copy(String username, String password, Map<String, String> metadata) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new InitiateCustomSignInWithSRP(username, password, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateCustomSignInWithSRP)) {
                    return false;
                }
                InitiateCustomSignInWithSRP initiateCustomSignInWithSRP = (InitiateCustomSignInWithSRP) obj;
                return AbstractC4154l.m8918a(this.username, initiateCustomSignInWithSRP.username) && AbstractC4154l.m8918a(this.password, initiateCustomSignInWithSRP.password) && AbstractC4154l.m8918a(this.metadata, initiateCustomSignInWithSRP.metadata);
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
                return this.metadata.hashCode() + AbstractC0030c.m113d(this.username.hashCode() * 31, 31, this.password);
            }

            public String toString() {
                String str = this.username;
                String str2 = this.password;
                Map<String, String> map = this.metadata;
                StringBuilder sbM127r = AbstractC0030c.m127r("InitiateCustomSignInWithSRP(username=", str, ", password=", str2, ", metadata=");
                sbM127r.append(map);
                sbM127r.append(")");
                return sbM127r.toString();
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateHostedUISignIn extends EventType {
            private final SignInData.HostedUISignInData hostedUISignInData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateHostedUISignIn(SignInData.HostedUISignInData hostedUISignInData) {
                super(null);
                AbstractC4154l.m8923f(hostedUISignInData, "hostedUISignInData");
                this.hostedUISignInData = hostedUISignInData;
            }

            public static /* synthetic */ InitiateHostedUISignIn copy$default(InitiateHostedUISignIn initiateHostedUISignIn, SignInData.HostedUISignInData hostedUISignInData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    hostedUISignInData = initiateHostedUISignIn.hostedUISignInData;
                }
                return initiateHostedUISignIn.copy(hostedUISignInData);
            }

            public final SignInData.HostedUISignInData component1() {
                return this.hostedUISignInData;
            }

            public final InitiateHostedUISignIn copy(SignInData.HostedUISignInData hostedUISignInData) {
                AbstractC4154l.m8923f(hostedUISignInData, "hostedUISignInData");
                return new InitiateHostedUISignIn(hostedUISignInData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateHostedUISignIn) && AbstractC4154l.m8918a(this.hostedUISignInData, ((InitiateHostedUISignIn) obj).hostedUISignInData);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateMigrateAuth extends EventType {
            private final AuthFlowType authFlowType;
            private final Map<String, String> metadata;
            private final String password;
            private final AuthChallenge respondToAuthChallenge;
            private final String username;

            public /* synthetic */ InitiateMigrateAuth(String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i10, AbstractC4148f abstractC4148f) {
                this(str, str2, map, authFlowType, (i10 & 16) != 0 ? null : authChallenge);
            }

            public static /* synthetic */ InitiateMigrateAuth copy$default(InitiateMigrateAuth initiateMigrateAuth, String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateMigrateAuth.username;
                }
                if ((i10 & 2) != 0) {
                    str2 = initiateMigrateAuth.password;
                }
                if ((i10 & 4) != 0) {
                    map = initiateMigrateAuth.metadata;
                }
                if ((i10 & 8) != 0) {
                    authFlowType = initiateMigrateAuth.authFlowType;
                }
                if ((i10 & 16) != 0) {
                    authChallenge = initiateMigrateAuth.respondToAuthChallenge;
                }
                AuthChallenge authChallenge2 = authChallenge;
                Map map2 = map;
                return initiateMigrateAuth.copy(str, str2, map2, authFlowType, authChallenge2);
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

            public final InitiateMigrateAuth copy(String username, String password, Map<String, String> metadata, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(authFlowType, "authFlowType");
                return new InitiateMigrateAuth(username, password, metadata, authFlowType, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateMigrateAuth)) {
                    return false;
                }
                InitiateMigrateAuth initiateMigrateAuth = (InitiateMigrateAuth) obj;
                return AbstractC4154l.m8918a(this.username, initiateMigrateAuth.username) && AbstractC4154l.m8918a(this.password, initiateMigrateAuth.password) && AbstractC4154l.m8918a(this.metadata, initiateMigrateAuth.metadata) && this.authFlowType == initiateMigrateAuth.authFlowType && AbstractC4154l.m8918a(this.respondToAuthChallenge, initiateMigrateAuth.respondToAuthChallenge);
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
                int iHashCode = (this.authFlowType.hashCode() + m0.m7369b(AbstractC0030c.m113d(this.username.hashCode() * 31, 31, this.password), 31, this.metadata)) * 31;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                return iHashCode + (authChallenge == null ? 0 : authChallenge.hashCode());
            }

            public String toString() {
                String str = this.username;
                String str2 = this.password;
                Map<String, String> map = this.metadata;
                AuthFlowType authFlowType = this.authFlowType;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                StringBuilder sbM127r = AbstractC0030c.m127r("InitiateMigrateAuth(username=", str, ", password=", str2, ", metadata=");
                sbM127r.append(map);
                sbM127r.append(", authFlowType=");
                sbM127r.append(authFlowType);
                sbM127r.append(", respondToAuthChallenge=");
                sbM127r.append(authChallenge);
                sbM127r.append(")");
                return sbM127r.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateMigrateAuth(String username, String password, Map<String, String> metadata, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(authFlowType, "authFlowType");
                this.username = username;
                this.password = password;
                this.metadata = metadata;
                this.authFlowType = authFlowType;
                this.respondToAuthChallenge = authChallenge;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateSignInWithCustom extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithCustom(String username, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.username = username;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignInWithCustom copy$default(InitiateSignInWithCustom initiateSignInWithCustom, String str, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateSignInWithCustom.username;
                }
                if ((i10 & 2) != 0) {
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

            public final InitiateSignInWithCustom copy(String username, Map<String, String> metadata) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new InitiateSignInWithCustom(username, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithCustom)) {
                    return false;
                }
                InitiateSignInWithCustom initiateSignInWithCustom = (InitiateSignInWithCustom) obj;
                return AbstractC4154l.m8918a(this.username, initiateSignInWithCustom.username) && AbstractC4154l.m8918a(this.metadata, initiateSignInWithCustom.metadata);
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.metadata.hashCode() + (this.username.hashCode() * 31);
            }

            public String toString() {
                return "InitiateSignInWithCustom(username=" + this.username + ", metadata=" + this.metadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateSignInWithDeviceSRP extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithDeviceSRP(String username, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.username = username;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignInWithDeviceSRP copy$default(InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP, String str, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateSignInWithDeviceSRP.username;
                }
                if ((i10 & 2) != 0) {
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

            public final InitiateSignInWithDeviceSRP copy(String username, Map<String, String> metadata) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new InitiateSignInWithDeviceSRP(username, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithDeviceSRP)) {
                    return false;
                }
                InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP = (InitiateSignInWithDeviceSRP) obj;
                return AbstractC4154l.m8918a(this.username, initiateSignInWithDeviceSRP.username) && AbstractC4154l.m8918a(this.metadata, initiateSignInWithDeviceSRP.metadata);
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.metadata.hashCode() + (this.username.hashCode() * 31);
            }

            public String toString() {
                return "InitiateSignInWithDeviceSRP(username=" + this.username + ", metadata=" + this.metadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateSignInWithSRP extends EventType {
            private final AuthFlowType authFlowType;
            private final Map<String, String> metadata;
            private final String password;
            private final AuthChallenge respondToAuthChallenge;
            private final String username;

            public /* synthetic */ InitiateSignInWithSRP(String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i10, AbstractC4148f abstractC4148f) {
                this(str, str2, map, authFlowType, (i10 & 16) != 0 ? null : authChallenge);
            }

            public static /* synthetic */ InitiateSignInWithSRP copy$default(InitiateSignInWithSRP initiateSignInWithSRP, String str, String str2, Map map, AuthFlowType authFlowType, AuthChallenge authChallenge, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateSignInWithSRP.username;
                }
                if ((i10 & 2) != 0) {
                    str2 = initiateSignInWithSRP.password;
                }
                if ((i10 & 4) != 0) {
                    map = initiateSignInWithSRP.metadata;
                }
                if ((i10 & 8) != 0) {
                    authFlowType = initiateSignInWithSRP.authFlowType;
                }
                if ((i10 & 16) != 0) {
                    authChallenge = initiateSignInWithSRP.respondToAuthChallenge;
                }
                AuthChallenge authChallenge2 = authChallenge;
                Map map2 = map;
                return initiateSignInWithSRP.copy(str, str2, map2, authFlowType, authChallenge2);
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

            public final InitiateSignInWithSRP copy(String username, String password, Map<String, String> metadata, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(authFlowType, "authFlowType");
                return new InitiateSignInWithSRP(username, password, metadata, authFlowType, authChallenge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithSRP)) {
                    return false;
                }
                InitiateSignInWithSRP initiateSignInWithSRP = (InitiateSignInWithSRP) obj;
                return AbstractC4154l.m8918a(this.username, initiateSignInWithSRP.username) && AbstractC4154l.m8918a(this.password, initiateSignInWithSRP.password) && AbstractC4154l.m8918a(this.metadata, initiateSignInWithSRP.metadata) && this.authFlowType == initiateSignInWithSRP.authFlowType && AbstractC4154l.m8918a(this.respondToAuthChallenge, initiateSignInWithSRP.respondToAuthChallenge);
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
                int iHashCode = (this.authFlowType.hashCode() + m0.m7369b(AbstractC0030c.m113d(this.username.hashCode() * 31, 31, this.password), 31, this.metadata)) * 31;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                return iHashCode + (authChallenge == null ? 0 : authChallenge.hashCode());
            }

            public String toString() {
                String str = this.username;
                String str2 = this.password;
                Map<String, String> map = this.metadata;
                AuthFlowType authFlowType = this.authFlowType;
                AuthChallenge authChallenge = this.respondToAuthChallenge;
                StringBuilder sbM127r = AbstractC0030c.m127r("InitiateSignInWithSRP(username=", str, ", password=", str2, ", metadata=");
                sbM127r.append(map);
                sbM127r.append(", authFlowType=");
                sbM127r.append(authFlowType);
                sbM127r.append(", respondToAuthChallenge=");
                sbM127r.append(authChallenge);
                sbM127r.append(")");
                return sbM127r.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithSRP(String username, String password, Map<String, String> metadata, AuthFlowType authFlowType, AuthChallenge authChallenge) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(password, "password");
                AbstractC4154l.m8923f(metadata, "metadata");
                AbstractC4154l.m8923f(authFlowType, "authFlowType");
                this.username = username;
                this.password = password;
                this.metadata = metadata;
                this.authFlowType = authFlowType;
                this.respondToAuthChallenge = authChallenge;
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateTOTPSetup extends EventType {
            private final Map<String, String> challengeParams;
            private final SignInMethod signInMethod;
            private final SignInTOTPSetupData signInTOTPSetupData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateTOTPSetup(SignInTOTPSetupData signInTOTPSetupData, Map<String, String> map, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(signInTOTPSetupData, "signInTOTPSetupData");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.signInTOTPSetupData = signInTOTPSetupData;
                this.challengeParams = map;
                this.signInMethod = signInMethod;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateTOTPSetup copy$default(InitiateTOTPSetup initiateTOTPSetup, SignInTOTPSetupData signInTOTPSetupData, Map map, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signInTOTPSetupData = initiateTOTPSetup.signInTOTPSetupData;
                }
                if ((i10 & 2) != 0) {
                    map = initiateTOTPSetup.challengeParams;
                }
                if ((i10 & 4) != 0) {
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
                AbstractC4154l.m8923f(signInTOTPSetupData, "signInTOTPSetupData");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
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
                return AbstractC4154l.m8918a(this.signInTOTPSetupData, initiateTOTPSetup.signInTOTPSetupData) && AbstractC4154l.m8918a(this.challengeParams, initiateTOTPSetup.challengeParams) && AbstractC4154l.m8918a(this.signInMethod, initiateTOTPSetup.signInMethod);
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
                return this.signInMethod.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
            }

            public String toString() {
                return "InitiateTOTPSetup(signInTOTPSetupData=" + this.signInTOTPSetupData + ", challengeParams=" + this.challengeParams + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateUserAuth extends EventType {
            private final WeakReference<Activity> callingActivity;
            private final Map<String, String> metadata;
            private final AuthFactorType preferredChallenge;
            private final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateUserAuth(String username, AuthFactorType authFactorType, WeakReference<Activity> callingActivity, Map<String, String> metadata) {
                super(null);
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(callingActivity, "callingActivity");
                AbstractC4154l.m8923f(metadata, "metadata");
                this.username = username;
                this.preferredChallenge = authFactorType;
                this.callingActivity = callingActivity;
                this.metadata = metadata;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateUserAuth copy$default(InitiateUserAuth initiateUserAuth, String str, AuthFactorType authFactorType, WeakReference weakReference, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = initiateUserAuth.username;
                }
                if ((i10 & 2) != 0) {
                    authFactorType = initiateUserAuth.preferredChallenge;
                }
                if ((i10 & 4) != 0) {
                    weakReference = initiateUserAuth.callingActivity;
                }
                if ((i10 & 8) != 0) {
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

            public final InitiateUserAuth copy(String username, AuthFactorType authFactorType, WeakReference<Activity> callingActivity, Map<String, String> metadata) {
                AbstractC4154l.m8923f(username, "username");
                AbstractC4154l.m8923f(callingActivity, "callingActivity");
                AbstractC4154l.m8923f(metadata, "metadata");
                return new InitiateUserAuth(username, authFactorType, callingActivity, metadata);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateUserAuth)) {
                    return false;
                }
                InitiateUserAuth initiateUserAuth = (InitiateUserAuth) obj;
                return AbstractC4154l.m8918a(this.username, initiateUserAuth.username) && this.preferredChallenge == initiateUserAuth.preferredChallenge && AbstractC4154l.m8918a(this.callingActivity, initiateUserAuth.callingActivity) && AbstractC4154l.m8918a(this.metadata, initiateUserAuth.metadata);
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
                return this.metadata.hashCode() + ((this.callingActivity.hashCode() + ((iHashCode + (authFactorType == null ? 0 : authFactorType.hashCode())) * 31)) * 31);
            }

            public String toString() {
                return "InitiateUserAuth(username=" + this.username + ", preferredChallenge=" + this.preferredChallenge + ", callingActivity=" + this.callingActivity + ", metadata=" + this.metadata + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class InitiateWebAuthnSignIn extends EventType {
            private final WebAuthnSignInContext signInContext;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateWebAuthnSignIn(WebAuthnSignInContext signInContext) {
                super(null);
                AbstractC4154l.m8923f(signInContext, "signInContext");
                this.signInContext = signInContext;
            }

            public static /* synthetic */ InitiateWebAuthnSignIn copy$default(InitiateWebAuthnSignIn initiateWebAuthnSignIn, WebAuthnSignInContext webAuthnSignInContext, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    webAuthnSignInContext = initiateWebAuthnSignIn.signInContext;
                }
                return initiateWebAuthnSignIn.copy(webAuthnSignInContext);
            }

            public final WebAuthnSignInContext component1() {
                return this.signInContext;
            }

            public final InitiateWebAuthnSignIn copy(WebAuthnSignInContext signInContext) {
                AbstractC4154l.m8923f(signInContext, "signInContext");
                return new InitiateWebAuthnSignIn(signInContext);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateWebAuthnSignIn) && AbstractC4154l.m8918a(this.signInContext, ((InitiateWebAuthnSignIn) obj).signInContext);
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

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ReceivedChallenge extends EventType {
            private final AuthChallenge challenge;
            private final SignInMethod signInMethod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedChallenge(AuthChallenge challenge, SignInMethod signInMethod) {
                super(null);
                AbstractC4154l.m8923f(challenge, "challenge");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                this.challenge = challenge;
                this.signInMethod = signInMethod;
            }

            public static /* synthetic */ ReceivedChallenge copy$default(ReceivedChallenge receivedChallenge, AuthChallenge authChallenge, SignInMethod signInMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authChallenge = receivedChallenge.challenge;
                }
                if ((i10 & 2) != 0) {
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

            public final ReceivedChallenge copy(AuthChallenge challenge, SignInMethod signInMethod) {
                AbstractC4154l.m8923f(challenge, "challenge");
                AbstractC4154l.m8923f(signInMethod, "signInMethod");
                return new ReceivedChallenge(challenge, signInMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReceivedChallenge)) {
                    return false;
                }
                ReceivedChallenge receivedChallenge = (ReceivedChallenge) obj;
                return AbstractC4154l.m8918a(this.challenge, receivedChallenge.challenge) && AbstractC4154l.m8918a(this.signInMethod, receivedChallenge.signInMethod);
            }

            public final AuthChallenge getChallenge() {
                return this.challenge;
            }

            public final SignInMethod getSignInMethod() {
                return this.signInMethod;
            }

            public int hashCode() {
                return this.signInMethod.hashCode() + (this.challenge.hashCode() * 31);
            }

            public String toString() {
                return "ReceivedChallenge(challenge=" + this.challenge + ", signInMethod=" + this.signInMethod + ")";
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class SignedIn extends EventType {

            /* renamed from: id, reason: collision with root package name */
            private final String f43796id;

            /* JADX WARN: Multi-variable type inference failed */
            public SignedIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = signedIn.f43796id;
                }
                return signedIn.copy(str);
            }

            public final String component1() {
                return this.f43796id;
            }

            public final SignedIn copy(String id2) {
                AbstractC4154l.m8923f(id2, "id");
                return new SignedIn(id2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignedIn) && AbstractC4154l.m8918a(this.f43796id, ((SignedIn) obj).f43796id);
            }

            public final String getId() {
                return this.f43796id;
            }

            public int hashCode() {
                return this.f43796id.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11238i("SignedIn(id=", this.f43796id, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedIn(String id2) {
                super(null);
                AbstractC4154l.m8923f(id2, "id");
                this.f43796id = id2;
            }

            public /* synthetic */ SignedIn(String str, int i10, AbstractC4148f abstractC4148f) {
                this((i10 & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(Exception exception) {
                super(null);
                AbstractC4154l.m8923f(exception, "exception");
                this.exception = exception;
            }

            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            public final Exception component1() {
                return this.exception;
            }

            public final ThrowError copy(Exception exception) {
                AbstractC4154l.m8923f(exception, "exception");
                return new ThrowError(exception);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && AbstractC4154l.m8918a(this.exception, ((ThrowError) obj).exception);
            }

            public final Exception getException() {
                return this.exception;
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return AbstractC5601a.m11237h("ThrowError(exception=", ")", this.exception);
            }
        }

        public /* synthetic */ EventType(AbstractC4148f abstractC4148f) {
            this();
        }

        private EventType() {
        }
    }

    public SignInEvent(EventType eventType, Date date) {
        AbstractC4154l.m8923f(eventType, "eventType");
        this.eventType = eventType;
        this.time = date;
        this.type = eventType.getClass().getSimpleName();
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return super.getId();
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.type;
    }

    public /* synthetic */ SignInEvent(EventType eventType, Date date, int i10, AbstractC4148f abstractC4148f) {
        this(eventType, (i10 & 2) != 0 ? null : date);
    }
}
