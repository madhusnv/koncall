package com.amplifyframework.statemachine.codegen.data;

import a2.AbstractC0030c;
import aw.C0466f;
import fy.C2403c;
import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import java.lang.annotation.Annotation;
import jy.C3884u;
import jy.a1;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4564c;
import ly.C4597u;
import og.nd;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.EnumC6359i;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class AmplifyCredential {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC6357g $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(25));

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ASFDevice extends AmplifyCredential {
        public static final Companion Companion = new Companion(null);

        /* renamed from: id, reason: collision with root package name */
        private final String f43783id;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyCredential$ASFDevice$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ASFDevice(int i10, String str, w0 w0Var) {
            super(i10, w0Var);
            if (1 != (i10 & 1)) {
                n0.m8426g(i10, 1, AmplifyCredential$ASFDevice$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f43783id = str;
        }

        public static /* synthetic */ ASFDevice copy$default(ASFDevice aSFDevice, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aSFDevice.f43783id;
            }
            return aSFDevice.copy(str);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(ASFDevice aSFDevice, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            AmplifyCredential.write$Self(aSFDevice, interfaceC3365b, interfaceC3055f);
            interfaceC3365b.mo7695n(interfaceC3055f, 0, a1.f19869a, aSFDevice.f43783id);
        }

        public final String component1() {
            return this.f43783id;
        }

        public final ASFDevice copy(String str) {
            return new ASFDevice(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ASFDevice) && AbstractC4154l.m8918a(this.f43783id, ((ASFDevice) obj).f43783id);
        }

        public final String getId() {
            return this.f43783id;
        }

        public int hashCode() {
            String str = this.f43783id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC5601a.m11238i("ASFDevice(id=", this.f43783id, ")");
        }

        public ASFDevice(String str) {
            super(null);
            this.f43783id = str;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
            return (InterfaceC2401a) AmplifyCredential.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC2401a serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DeviceData extends AmplifyCredential implements DeviceMetaDataTypeCredential {
        private final DeviceMetadata deviceMetadata;
        public static final Companion Companion = new Companion(null);
        private static final InterfaceC6357g[] $childSerializers = {nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(26))};

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyCredential$DeviceData$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceData(int i10, DeviceMetadata deviceMetadata, w0 w0Var) {
            super(i10, w0Var);
            if (1 != (i10 & 1)) {
                n0.m8426g(i10, 1, AmplifyCredential$DeviceData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.deviceMetadata = deviceMetadata;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _childSerializers$_anonymous_() {
            return DeviceMetadata.Companion.serializer();
        }

        public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, DeviceMetadata deviceMetadata, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deviceMetadata = deviceData.deviceMetadata;
            }
            return deviceData.copy(deviceMetadata);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(DeviceData deviceData, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            AmplifyCredential.write$Self(deviceData, interfaceC3365b, interfaceC3055f);
            ((C4597u) interfaceC3365b).m9443v(interfaceC3055f, 0, (InterfaceC2401a) $childSerializers[0].getValue(), deviceData.getDeviceMetadata());
        }

        public final DeviceMetadata component1() {
            return this.deviceMetadata;
        }

        public final DeviceData copy(DeviceMetadata deviceMetadata) {
            AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
            return new DeviceData(deviceMetadata);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceData) && AbstractC4154l.m8918a(this.deviceMetadata, ((DeviceData) obj).deviceMetadata);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.DeviceMetaDataTypeCredential
        public DeviceMetadata getDeviceMetadata() {
            return this.deviceMetadata;
        }

        public int hashCode() {
            return this.deviceMetadata.hashCode();
        }

        public String toString() {
            return "DeviceData(deviceMetadata=" + this.deviceMetadata + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceData(DeviceMetadata deviceMetadata) {
            super(null);
            AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
            this.deviceMetadata = deviceMetadata;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface DeviceMetaDataTypeCredential {
        DeviceMetadata getDeviceMetadata();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Empty extends AmplifyCredential {
        public static final Empty INSTANCE = new Empty();
        private static final /* synthetic */ InterfaceC6357g $cachedSerializer$delegate = nd.m10781b(EnumC6359i.PUBLICATION, new C0466f(27));

        private Empty() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
            return new C3884u(INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ InterfaceC2401a get$cachedSerializer() {
            return (InterfaceC2401a) $cachedSerializer$delegate.getValue();
        }

        public final InterfaceC2401a serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class IdentityPool extends AmplifyCredential implements IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final String identityId;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyCredential$IdentityPool$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IdentityPool(int i10, String str, AWSCredentials aWSCredentials, w0 w0Var) {
            super(i10, w0Var);
            if (3 != (i10 & 3)) {
                n0.m8426g(i10, 3, AmplifyCredential$IdentityPool$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static /* synthetic */ IdentityPool copy$default(IdentityPool identityPool, String str, AWSCredentials aWSCredentials, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = identityPool.identityId;
            }
            if ((i10 & 2) != 0) {
                aWSCredentials = identityPool.credentials;
            }
            return identityPool.copy(str, aWSCredentials);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(IdentityPool identityPool, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            AmplifyCredential.write$Self(identityPool, interfaceC3365b, interfaceC3055f);
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9444w(interfaceC3055f, 0, identityPool.getIdentityId());
            c4597u.m9443v(interfaceC3055f, 1, AWSCredentials$$serializer.INSTANCE, identityPool.getCredentials());
        }

        public final String component1() {
            return this.identityId;
        }

        public final AWSCredentials component2() {
            return this.credentials;
        }

        public final IdentityPool copy(String identityId, AWSCredentials credentials) {
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(credentials, "credentials");
            return new IdentityPool(identityId, credentials);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityPool)) {
                return false;
            }
            IdentityPool identityPool = (IdentityPool) obj;
            return AbstractC4154l.m8918a(this.identityId, identityPool.identityId) && AbstractC4154l.m8918a(this.credentials, identityPool.credentials);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public AWSCredentials getCredentials() {
            return this.credentials;
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public String getIdentityId() {
            return this.identityId;
        }

        public int hashCode() {
            return this.credentials.hashCode() + (this.identityId.hashCode() * 31);
        }

        public String toString() {
            return "IdentityPool(identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityPool(String identityId, AWSCredentials credentials) {
            super(null);
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(credentials, "credentials");
            this.identityId = identityId;
            this.credentials = credentials;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class IdentityPoolFederated extends AmplifyCredential implements IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final FederatedToken federatedToken;
        private final String identityId;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IdentityPoolFederated(int i10, FederatedToken federatedToken, String str, AWSCredentials aWSCredentials, w0 w0Var) {
            super(i10, w0Var);
            if (7 != (i10 & 7)) {
                n0.m8426g(i10, 7, AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.federatedToken = federatedToken;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static /* synthetic */ IdentityPoolFederated copy$default(IdentityPoolFederated identityPoolFederated, FederatedToken federatedToken, String str, AWSCredentials aWSCredentials, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                federatedToken = identityPoolFederated.federatedToken;
            }
            if ((i10 & 2) != 0) {
                str = identityPoolFederated.identityId;
            }
            if ((i10 & 4) != 0) {
                aWSCredentials = identityPoolFederated.credentials;
            }
            return identityPoolFederated.copy(federatedToken, str, aWSCredentials);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(IdentityPoolFederated identityPoolFederated, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            AmplifyCredential.write$Self(identityPoolFederated, interfaceC3365b, interfaceC3055f);
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9443v(interfaceC3055f, 0, FederatedToken$$serializer.INSTANCE, identityPoolFederated.federatedToken);
            c4597u.m9444w(interfaceC3055f, 1, identityPoolFederated.getIdentityId());
            c4597u.m9443v(interfaceC3055f, 2, AWSCredentials$$serializer.INSTANCE, identityPoolFederated.getCredentials());
        }

        public final FederatedToken component1() {
            return this.federatedToken;
        }

        public final String component2() {
            return this.identityId;
        }

        public final AWSCredentials component3() {
            return this.credentials;
        }

        public final IdentityPoolFederated copy(FederatedToken federatedToken, String identityId, AWSCredentials credentials) {
            AbstractC4154l.m8923f(federatedToken, "federatedToken");
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(credentials, "credentials");
            return new IdentityPoolFederated(federatedToken, identityId, credentials);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityPoolFederated)) {
                return false;
            }
            IdentityPoolFederated identityPoolFederated = (IdentityPoolFederated) obj;
            return AbstractC4154l.m8918a(this.federatedToken, identityPoolFederated.federatedToken) && AbstractC4154l.m8918a(this.identityId, identityPoolFederated.identityId) && AbstractC4154l.m8918a(this.credentials, identityPoolFederated.credentials);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public AWSCredentials getCredentials() {
            return this.credentials;
        }

        public final FederatedToken getFederatedToken() {
            return this.federatedToken;
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public String getIdentityId() {
            return this.identityId;
        }

        public int hashCode() {
            return this.credentials.hashCode() + AbstractC0030c.m113d(this.federatedToken.hashCode() * 31, 31, this.identityId);
        }

        public String toString() {
            return "IdentityPoolFederated(federatedToken=" + this.federatedToken + ", identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityPoolFederated(FederatedToken federatedToken, String identityId, AWSCredentials credentials) {
            super(null);
            AbstractC4154l.m8923f(federatedToken, "federatedToken");
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(credentials, "credentials");
            this.federatedToken = federatedToken;
            this.identityId = identityId;
            this.credentials = credentials;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface IdentityPoolTypeCredential {
        AWSCredentials getCredentials();

        String getIdentityId();
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class UserAndIdentityPool extends AmplifyCredential implements UserPoolTypeCredential, IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final String identityId;
        private final SignedInData signedInData;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserAndIdentityPool(int i10, SignedInData signedInData, String str, AWSCredentials aWSCredentials, w0 w0Var) {
            super(i10, w0Var);
            if (7 != (i10 & 7)) {
                n0.m8426g(i10, 7, AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.signedInData = signedInData;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static /* synthetic */ UserAndIdentityPool copy$default(UserAndIdentityPool userAndIdentityPool, SignedInData signedInData, String str, AWSCredentials aWSCredentials, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = userAndIdentityPool.signedInData;
            }
            if ((i10 & 2) != 0) {
                str = userAndIdentityPool.identityId;
            }
            if ((i10 & 4) != 0) {
                aWSCredentials = userAndIdentityPool.credentials;
            }
            return userAndIdentityPool.copy(signedInData, str, aWSCredentials);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(UserAndIdentityPool userAndIdentityPool, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            AmplifyCredential.write$Self(userAndIdentityPool, interfaceC3365b, interfaceC3055f);
            C4597u c4597u = (C4597u) interfaceC3365b;
            c4597u.m9443v(interfaceC3055f, 0, SignedInData$$serializer.INSTANCE, userAndIdentityPool.getSignedInData());
            c4597u.m9444w(interfaceC3055f, 1, userAndIdentityPool.getIdentityId());
            c4597u.m9443v(interfaceC3055f, 2, AWSCredentials$$serializer.INSTANCE, userAndIdentityPool.getCredentials());
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final String component2() {
            return this.identityId;
        }

        public final AWSCredentials component3() {
            return this.credentials;
        }

        public final UserAndIdentityPool copy(SignedInData signedInData, String identityId, AWSCredentials credentials) {
            AbstractC4154l.m8923f(signedInData, "signedInData");
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(credentials, "credentials");
            return new UserAndIdentityPool(signedInData, identityId, credentials);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserAndIdentityPool)) {
                return false;
            }
            UserAndIdentityPool userAndIdentityPool = (UserAndIdentityPool) obj;
            return AbstractC4154l.m8918a(this.signedInData, userAndIdentityPool.signedInData) && AbstractC4154l.m8918a(this.identityId, userAndIdentityPool.identityId) && AbstractC4154l.m8918a(this.credentials, userAndIdentityPool.credentials);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public AWSCredentials getCredentials() {
            return this.credentials;
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.IdentityPoolTypeCredential
        public String getIdentityId() {
            return this.identityId;
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.UserPoolTypeCredential
        public SignedInData getSignedInData() {
            return this.signedInData;
        }

        public int hashCode() {
            return this.credentials.hashCode() + AbstractC0030c.m113d(this.signedInData.hashCode() * 31, 31, this.identityId);
        }

        public String toString() {
            return "UserAndIdentityPool(signedInData=" + this.signedInData + ", identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAndIdentityPool(SignedInData signedInData, String identityId, AWSCredentials credentials) {
            super(null);
            AbstractC4154l.m8923f(signedInData, "signedInData");
            AbstractC4154l.m8923f(identityId, "identityId");
            AbstractC4154l.m8923f(credentials, "credentials");
            this.signedInData = signedInData;
            this.identityId = identityId;
            this.credentials = credentials;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class UserPool extends AmplifyCredential implements UserPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final SignedInData signedInData;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC2401a serializer() {
                return AmplifyCredential$UserPool$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserPool(int i10, SignedInData signedInData, w0 w0Var) {
            super(i10, w0Var);
            if (1 != (i10 & 1)) {
                n0.m8426g(i10, 1, AmplifyCredential$UserPool$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.signedInData = signedInData;
        }

        public static /* synthetic */ UserPool copy$default(UserPool userPool, SignedInData signedInData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                signedInData = userPool.signedInData;
            }
            return userPool.copy(signedInData);
        }

        public static final /* synthetic */ void write$Self$aws_auth_cognito_release(UserPool userPool, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
            AmplifyCredential.write$Self(userPool, interfaceC3365b, interfaceC3055f);
            ((C4597u) interfaceC3365b).m9443v(interfaceC3055f, 0, SignedInData$$serializer.INSTANCE, userPool.getSignedInData());
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final UserPool copy(SignedInData signedInData) {
            AbstractC4154l.m8923f(signedInData, "signedInData");
            return new UserPool(signedInData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserPool) && AbstractC4154l.m8918a(this.signedInData, ((UserPool) obj).signedInData);
        }

        @Override // com.amplifyframework.statemachine.codegen.data.AmplifyCredential.UserPoolTypeCredential
        public SignedInData getSignedInData() {
            return this.signedInData;
        }

        public int hashCode() {
            return this.signedInData.hashCode();
        }

        public String toString() {
            return "UserPool(signedInData=" + this.signedInData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserPool(SignedInData signedInData) {
            super(null);
            AbstractC4154l.m8923f(signedInData, "signedInData");
            this.signedInData = signedInData;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface UserPoolTypeCredential {
        SignedInData getSignedInData();
    }

    public /* synthetic */ AmplifyCredential(AbstractC4148f abstractC4148f) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC2401a _init_$_anonymous_() {
        return new C2403c("com.amplifyframework.statemachine.codegen.data.AmplifyCredential", a0.m8901a(AmplifyCredential.class), new InterfaceC4564c[]{a0.m8901a(ASFDevice.class), a0.m8901a(DeviceData.class), a0.m8901a(Empty.class), a0.m8901a(IdentityPool.class), a0.m8901a(IdentityPoolFederated.class), a0.m8901a(UserAndIdentityPool.class), a0.m8901a(UserPool.class)}, new InterfaceC2401a[]{AmplifyCredential$ASFDevice$$serializer.INSTANCE, AmplifyCredential$DeviceData$$serializer.INSTANCE, new C3884u(Empty.INSTANCE, new Annotation[0]), AmplifyCredential$IdentityPool$$serializer.INSTANCE, AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE, AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE, AmplifyCredential$UserPool$$serializer.INSTANCE}, new Annotation[0]);
    }

    private AmplifyCredential() {
    }

    public /* synthetic */ AmplifyCredential(int i10, w0 w0Var) {
    }

    public static final /* synthetic */ void write$Self(AmplifyCredential amplifyCredential, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
    }
}
