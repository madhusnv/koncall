package com.amplifyframework.statemachine.codegen.data;

import java.lang.annotation.Annotation;
import p001o.cj9;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.gi9;
import p001o.id5;
import p001o.kf9;
import p001o.kge;
import p001o.l8f;
import p001o.lo3;
import p001o.o6c;
import p001o.ob9;
import p001o.p8g;
import p001o.si9;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;
import p001o.uk7;

@dff
/* loaded from: classes5.dex */
public abstract class AmplifyCredential {
    public static final Companion Companion = new Companion(null);
    private static final gi9 $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, Companion.C106781.INSTANCE);

    @dff
    public static final class ASFDevice extends AmplifyCredential {
        public static final Companion Companion = new Companion(null);
        private final String id;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyCredential$ASFDevice$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ASFDevice(int i, String str, fff fffVar) {
            super(i, fffVar);
            if (1 != (i & 1)) {
                tbd.m49692a(i, 1, AmplifyCredential$ASFDevice$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
        }

        public static /* synthetic */ ASFDevice copy$default(ASFDevice aSFDevice, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aSFDevice.id;
            }
            return aSFDevice.copy(str);
        }

        public static final /* synthetic */ void write$Self(ASFDevice aSFDevice, lo3 lo3Var, uef uefVar) {
            AmplifyCredential.write$Self(aSFDevice, lo3Var, uefVar);
            lo3Var.mo37571z(uefVar, 0, p8g.f39602a, aSFDevice.id);
        }

        public final String component1() {
            return this.id;
        }

        public final ASFDevice copy(String str) {
            return new ASFDevice(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ASFDevice) && sq8.m48644c(this.id, ((ASFDevice) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ASFDevice(id=" + this.id + ")";
        }

        public ASFDevice(String str) {
            super(null);
            this.id = str;
        }
    }

    public static final class Companion {

        /* renamed from: com.amplifyframework.statemachine.codegen.data.AmplifyCredential$Companion$1 */
        public static final class C106781 extends kf9 implements uk7 {
            public static final C106781 INSTANCE = new C106781();

            public C106781() {
                super(0);
            }

            @Override // p001o.uk7
            public final dc9 invoke() {
                return new l8f("com.amplifyframework.statemachine.codegen.data.AmplifyCredential", kge.m35689b(AmplifyCredential.class), new ob9[]{kge.m35689b(ASFDevice.class), kge.m35689b(DeviceData.class), kge.m35689b(Empty.class), kge.m35689b(IdentityPool.class), kge.m35689b(IdentityPoolFederated.class), kge.m35689b(UserAndIdentityPool.class), kge.m35689b(UserPool.class)}, new dc9[]{AmplifyCredential$ASFDevice$$serializer.INSTANCE, AmplifyCredential$DeviceData$$serializer.INSTANCE, new o6c("empty", Empty.INSTANCE, new Annotation[0]), AmplifyCredential$IdentityPool$$serializer.INSTANCE, AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE, AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE, AmplifyCredential$UserPool$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        private final /* synthetic */ dc9 get$cachedSerializer() {
            return (dc9) AmplifyCredential.$cachedSerializer$delegate.getValue();
        }

        public final dc9 serializer() {
            return get$cachedSerializer();
        }
    }

    @dff
    public static final class DeviceData extends AmplifyCredential implements DeviceMetaDataTypeCredential {
        private final DeviceMetadata deviceMetadata;
        public static final Companion Companion = new Companion(null);
        private static final dc9[] $childSerializers = {DeviceMetadata.Companion.serializer()};

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyCredential$DeviceData$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceData(int i, DeviceMetadata deviceMetadata, fff fffVar) {
            super(i, fffVar);
            if (1 != (i & 1)) {
                tbd.m49692a(i, 1, AmplifyCredential$DeviceData$$serializer.INSTANCE.getDescriptor());
            }
            this.deviceMetadata = deviceMetadata;
        }

        public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, DeviceMetadata deviceMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceMetadata = deviceData.deviceMetadata;
            }
            return deviceData.copy(deviceMetadata);
        }

        public static final /* synthetic */ void write$Self(DeviceData deviceData, lo3 lo3Var, uef uefVar) {
            AmplifyCredential.write$Self(deviceData, lo3Var, uefVar);
            lo3Var.mo37566l(uefVar, 0, $childSerializers[0], deviceData.getDeviceMetadata());
        }

        public final DeviceMetadata component1() {
            return this.deviceMetadata;
        }

        public final DeviceData copy(DeviceMetadata deviceMetadata) {
            sq8.m48649h(deviceMetadata, "deviceMetadata");
            return new DeviceData(deviceMetadata);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceData) && sq8.m48644c(this.deviceMetadata, ((DeviceData) obj).deviceMetadata);
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
            sq8.m48649h(deviceMetadata, "deviceMetadata");
            this.deviceMetadata = deviceMetadata;
        }
    }

    public interface DeviceMetaDataTypeCredential {
        DeviceMetadata getDeviceMetadata();
    }

    @dff
    public static final class Empty extends AmplifyCredential {
        public static final Empty INSTANCE = new Empty();
        private static final /* synthetic */ gi9 $cachedSerializer$delegate = si9.m48361b(cj9.PUBLICATION, C106791.INSTANCE);

        /* renamed from: com.amplifyframework.statemachine.codegen.data.AmplifyCredential$Empty$1 */
        public static final class C106791 extends kf9 implements uk7 {
            public static final C106791 INSTANCE = new C106791();

            public C106791() {
                super(0);
            }

            @Override // p001o.uk7
            public final dc9 invoke() {
                return new o6c("empty", Empty.INSTANCE, new Annotation[0]);
            }
        }

        private Empty() {
            super(null);
        }

        private final /* synthetic */ dc9 get$cachedSerializer() {
            return (dc9) $cachedSerializer$delegate.getValue();
        }

        public final dc9 serializer() {
            return get$cachedSerializer();
        }
    }

    @dff
    public static final class IdentityPool extends AmplifyCredential implements IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final String identityId;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyCredential$IdentityPool$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IdentityPool(int i, String str, AWSCredentials aWSCredentials, fff fffVar) {
            super(i, fffVar);
            if (3 != (i & 3)) {
                tbd.m49692a(i, 3, AmplifyCredential$IdentityPool$$serializer.INSTANCE.getDescriptor());
            }
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static /* synthetic */ IdentityPool copy$default(IdentityPool identityPool, String str, AWSCredentials aWSCredentials, int i, Object obj) {
            if ((i & 1) != 0) {
                str = identityPool.identityId;
            }
            if ((i & 2) != 0) {
                aWSCredentials = identityPool.credentials;
            }
            return identityPool.copy(str, aWSCredentials);
        }

        public static final /* synthetic */ void write$Self(IdentityPool identityPool, lo3 lo3Var, uef uefVar) {
            AmplifyCredential.write$Self(identityPool, lo3Var, uefVar);
            lo3Var.mo37568p(uefVar, 0, identityPool.getIdentityId());
            lo3Var.mo37566l(uefVar, 1, AWSCredentials$$serializer.INSTANCE, identityPool.getCredentials());
        }

        public final String component1() {
            return this.identityId;
        }

        public final AWSCredentials component2() {
            return this.credentials;
        }

        public final IdentityPool copy(String str, AWSCredentials aWSCredentials) {
            sq8.m48649h(str, "identityId");
            sq8.m48649h(aWSCredentials, "credentials");
            return new IdentityPool(str, aWSCredentials);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityPool)) {
                return false;
            }
            IdentityPool identityPool = (IdentityPool) obj;
            return sq8.m48644c(this.identityId, identityPool.identityId) && sq8.m48644c(this.credentials, identityPool.credentials);
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
            return (this.identityId.hashCode() * 31) + this.credentials.hashCode();
        }

        public String toString() {
            return "IdentityPool(identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityPool(String str, AWSCredentials aWSCredentials) {
            super(null);
            sq8.m48649h(str, "identityId");
            sq8.m48649h(aWSCredentials, "credentials");
            this.identityId = str;
            this.credentials = aWSCredentials;
        }
    }

    @dff
    public static final class IdentityPoolFederated extends AmplifyCredential implements IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final FederatedToken federatedToken;
        private final String identityId;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IdentityPoolFederated(int i, FederatedToken federatedToken, String str, AWSCredentials aWSCredentials, fff fffVar) {
            super(i, fffVar);
            if (7 != (i & 7)) {
                tbd.m49692a(i, 7, AmplifyCredential$IdentityPoolFederated$$serializer.INSTANCE.getDescriptor());
            }
            this.federatedToken = federatedToken;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static /* synthetic */ IdentityPoolFederated copy$default(IdentityPoolFederated identityPoolFederated, FederatedToken federatedToken, String str, AWSCredentials aWSCredentials, int i, Object obj) {
            if ((i & 1) != 0) {
                federatedToken = identityPoolFederated.federatedToken;
            }
            if ((i & 2) != 0) {
                str = identityPoolFederated.identityId;
            }
            if ((i & 4) != 0) {
                aWSCredentials = identityPoolFederated.credentials;
            }
            return identityPoolFederated.copy(federatedToken, str, aWSCredentials);
        }

        public static final /* synthetic */ void write$Self(IdentityPoolFederated identityPoolFederated, lo3 lo3Var, uef uefVar) {
            AmplifyCredential.write$Self(identityPoolFederated, lo3Var, uefVar);
            lo3Var.mo37566l(uefVar, 0, FederatedToken$$serializer.INSTANCE, identityPoolFederated.federatedToken);
            lo3Var.mo37568p(uefVar, 1, identityPoolFederated.getIdentityId());
            lo3Var.mo37566l(uefVar, 2, AWSCredentials$$serializer.INSTANCE, identityPoolFederated.getCredentials());
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

        public final IdentityPoolFederated copy(FederatedToken federatedToken, String str, AWSCredentials aWSCredentials) {
            sq8.m48649h(federatedToken, "federatedToken");
            sq8.m48649h(str, "identityId");
            sq8.m48649h(aWSCredentials, "credentials");
            return new IdentityPoolFederated(federatedToken, str, aWSCredentials);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityPoolFederated)) {
                return false;
            }
            IdentityPoolFederated identityPoolFederated = (IdentityPoolFederated) obj;
            return sq8.m48644c(this.federatedToken, identityPoolFederated.federatedToken) && sq8.m48644c(this.identityId, identityPoolFederated.identityId) && sq8.m48644c(this.credentials, identityPoolFederated.credentials);
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
            return (((this.federatedToken.hashCode() * 31) + this.identityId.hashCode()) * 31) + this.credentials.hashCode();
        }

        public String toString() {
            return "IdentityPoolFederated(federatedToken=" + this.federatedToken + ", identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdentityPoolFederated(FederatedToken federatedToken, String str, AWSCredentials aWSCredentials) {
            super(null);
            sq8.m48649h(federatedToken, "federatedToken");
            sq8.m48649h(str, "identityId");
            sq8.m48649h(aWSCredentials, "credentials");
            this.federatedToken = federatedToken;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }
    }

    public interface IdentityPoolTypeCredential {
        AWSCredentials getCredentials();

        String getIdentityId();
    }

    @dff
    public static final class UserAndIdentityPool extends AmplifyCredential implements UserPoolTypeCredential, IdentityPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final AWSCredentials credentials;
        private final String identityId;
        private final SignedInData signedInData;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserAndIdentityPool(int i, SignedInData signedInData, String str, AWSCredentials aWSCredentials, fff fffVar) {
            super(i, fffVar);
            if (7 != (i & 7)) {
                tbd.m49692a(i, 7, AmplifyCredential$UserAndIdentityPool$$serializer.INSTANCE.getDescriptor());
            }
            this.signedInData = signedInData;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }

        public static /* synthetic */ UserAndIdentityPool copy$default(UserAndIdentityPool userAndIdentityPool, SignedInData signedInData, String str, AWSCredentials aWSCredentials, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = userAndIdentityPool.signedInData;
            }
            if ((i & 2) != 0) {
                str = userAndIdentityPool.identityId;
            }
            if ((i & 4) != 0) {
                aWSCredentials = userAndIdentityPool.credentials;
            }
            return userAndIdentityPool.copy(signedInData, str, aWSCredentials);
        }

        public static final /* synthetic */ void write$Self(UserAndIdentityPool userAndIdentityPool, lo3 lo3Var, uef uefVar) {
            AmplifyCredential.write$Self(userAndIdentityPool, lo3Var, uefVar);
            lo3Var.mo37566l(uefVar, 0, SignedInData$$serializer.INSTANCE, userAndIdentityPool.getSignedInData());
            lo3Var.mo37568p(uefVar, 1, userAndIdentityPool.getIdentityId());
            lo3Var.mo37566l(uefVar, 2, AWSCredentials$$serializer.INSTANCE, userAndIdentityPool.getCredentials());
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

        public final UserAndIdentityPool copy(SignedInData signedInData, String str, AWSCredentials aWSCredentials) {
            sq8.m48649h(signedInData, "signedInData");
            sq8.m48649h(str, "identityId");
            sq8.m48649h(aWSCredentials, "credentials");
            return new UserAndIdentityPool(signedInData, str, aWSCredentials);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserAndIdentityPool)) {
                return false;
            }
            UserAndIdentityPool userAndIdentityPool = (UserAndIdentityPool) obj;
            return sq8.m48644c(this.signedInData, userAndIdentityPool.signedInData) && sq8.m48644c(this.identityId, userAndIdentityPool.identityId) && sq8.m48644c(this.credentials, userAndIdentityPool.credentials);
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
            return (((this.signedInData.hashCode() * 31) + this.identityId.hashCode()) * 31) + this.credentials.hashCode();
        }

        public String toString() {
            return "UserAndIdentityPool(signedInData=" + this.signedInData + ", identityId=" + this.identityId + ", credentials=" + this.credentials + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAndIdentityPool(SignedInData signedInData, String str, AWSCredentials aWSCredentials) {
            super(null);
            sq8.m48649h(signedInData, "signedInData");
            sq8.m48649h(str, "identityId");
            sq8.m48649h(aWSCredentials, "credentials");
            this.signedInData = signedInData;
            this.identityId = str;
            this.credentials = aWSCredentials;
        }
    }

    @dff
    public static final class UserPool extends AmplifyCredential implements UserPoolTypeCredential {
        public static final Companion Companion = new Companion(null);
        private final SignedInData signedInData;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }

            public final dc9 serializer() {
                return AmplifyCredential$UserPool$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserPool(int i, SignedInData signedInData, fff fffVar) {
            super(i, fffVar);
            if (1 != (i & 1)) {
                tbd.m49692a(i, 1, AmplifyCredential$UserPool$$serializer.INSTANCE.getDescriptor());
            }
            this.signedInData = signedInData;
        }

        public static /* synthetic */ UserPool copy$default(UserPool userPool, SignedInData signedInData, int i, Object obj) {
            if ((i & 1) != 0) {
                signedInData = userPool.signedInData;
            }
            return userPool.copy(signedInData);
        }

        public static final /* synthetic */ void write$Self(UserPool userPool, lo3 lo3Var, uef uefVar) {
            AmplifyCredential.write$Self(userPool, lo3Var, uefVar);
            lo3Var.mo37566l(uefVar, 0, SignedInData$$serializer.INSTANCE, userPool.getSignedInData());
        }

        public final SignedInData component1() {
            return this.signedInData;
        }

        public final UserPool copy(SignedInData signedInData) {
            sq8.m48649h(signedInData, "signedInData");
            return new UserPool(signedInData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserPool) && sq8.m48644c(this.signedInData, ((UserPool) obj).signedInData);
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
            sq8.m48649h(signedInData, "signedInData");
            this.signedInData = signedInData;
        }
    }

    public interface UserPoolTypeCredential {
        SignedInData getSignedInData();
    }

    public /* synthetic */ AmplifyCredential(int i, fff fffVar) {
    }

    public /* synthetic */ AmplifyCredential(id5 id5Var) {
        this();
    }

    public static final /* synthetic */ void write$Self(AmplifyCredential amplifyCredential, lo3 lo3Var, uef uefVar) {
    }

    private AmplifyCredential() {
    }
}
