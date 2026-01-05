package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthCredentialStore;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import p001o.id5;
import p001o.p79;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthCredentialStore implements AuthCredentialStore {
    public static final Companion Companion = new Companion(null);
    private static final String Key_ASFDevice = "asfDevice";
    private static final String Key_DeviceMetadata = "deviceMetadata";
    private static final String Key_Session = "session";
    public static final String awsKeyValueStoreIdentifier = "com.amplify.credentialStore";
    private final AuthConfiguration authConfiguration;
    private final Context context;
    private KeyValueRepository keyValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public AWSCognitoAuthCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepositoryFactory) {
        sq8.m48649h(context, "context");
        sq8.m48649h(authConfiguration, "authConfiguration");
        sq8.m48649h(keyValueRepositoryFactory, "keyValueRepoFactory");
        this.context = context;
        this.authConfiguration = authConfiguration;
        this.keyValue = keyValueRepositoryFactory.create(context, awsKeyValueStoreIdentifier);
    }

    private final AmplifyCredential.ASFDevice deserializeASFDevice(String str) {
        AmplifyCredential.ASFDevice aSFDevice;
        if (str != null) {
            try {
                p79.C16009a c16009a = p79.f39513d;
                c16009a.mo43085a();
                Object objM43086c = c16009a.m43086c(AmplifyCredential.ASFDevice.Companion.serializer(), str);
                sq8.m48647f(objM43086c, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.data.AmplifyCredential.ASFDevice");
                aSFDevice = (AmplifyCredential.ASFDevice) objM43086c;
            } catch (Exception unused) {
                return new AmplifyCredential.ASFDevice(null);
            }
        } else {
            aSFDevice = null;
        }
        return aSFDevice == null ? new AmplifyCredential.ASFDevice(null) : aSFDevice;
    }

    private final AmplifyCredential deserializeCredential(String str) {
        AmplifyCredential amplifyCredential;
        if (str != null) {
            try {
                p79.C16009a c16009a = p79.f39513d;
                c16009a.mo43085a();
                Object objM43086c = c16009a.m43086c(AmplifyCredential.Companion.serializer(), str);
                sq8.m48647f(objM43086c, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.data.AmplifyCredential");
                amplifyCredential = (AmplifyCredential) objM43086c;
            } catch (Exception unused) {
                return AmplifyCredential.Empty.INSTANCE;
            }
        } else {
            amplifyCredential = null;
        }
        return amplifyCredential == null ? AmplifyCredential.Empty.INSTANCE : amplifyCredential;
    }

    private final DeviceMetadata deserializeMetadata(String str) {
        DeviceMetadata deviceMetadata;
        if (str != null) {
            try {
                p79.C16009a c16009a = p79.f39513d;
                c16009a.mo43085a();
                Object objM43086c = c16009a.m43086c(DeviceMetadata.Companion.serializer(), str);
                sq8.m48647f(objM43086c, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.data.DeviceMetadata");
                deviceMetadata = (DeviceMetadata) objM43086c;
            } catch (Exception unused) {
                return DeviceMetadata.Empty.INSTANCE;
            }
        } else {
            deviceMetadata = null;
        }
        return deviceMetadata == null ? DeviceMetadata.Empty.INSTANCE : deviceMetadata;
    }

    private final String generateKey(String str) {
        UserPoolConfiguration userPool = this.authConfiguration.getUserPool();
        String str2 = "amplify";
        if (userPool != null) {
            str2 = ((Object) "amplify") + "." + userPool.getPoolId();
        }
        IdentityPoolConfiguration identityPool = this.authConfiguration.getIdentityPool();
        if (identityPool != null) {
            str2 = ((Object) str2) + "." + identityPool.getPoolId();
        }
        return ((Object) str2) + "." + str;
    }

    private final String serializeASFDevice(AmplifyCredential.ASFDevice aSFDevice) {
        p79.C16009a c16009a = p79.f39513d;
        c16009a.mo43085a();
        return c16009a.mo31740b(AmplifyCredential.ASFDevice.Companion.serializer(), aSFDevice);
    }

    private final String serializeCredential(AmplifyCredential amplifyCredential) {
        p79.C16009a c16009a = p79.f39513d;
        c16009a.mo43085a();
        return c16009a.mo31740b(AmplifyCredential.Companion.serializer(), amplifyCredential);
    }

    private final String serializeMetaData(DeviceMetadata deviceMetadata) {
        p79.C16009a c16009a = p79.f39513d;
        c16009a.mo43085a();
        return c16009a.mo31740b(DeviceMetadata.Companion.serializer(), deviceMetadata);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteASFDevice() {
        this.keyValue.remove(generateKey(Key_ASFDevice));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteCredential() {
        this.keyValue.remove(generateKey("session"));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteDeviceKeyCredential(String str) {
        sq8.m48649h(str, "username");
        this.keyValue.remove(generateKey(str + ".deviceMetadata"));
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential.ASFDevice retrieveASFDevice() {
        return deserializeASFDevice(this.keyValue.get(generateKey(Key_ASFDevice)));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential retrieveCredential() {
        return deserializeCredential(this.keyValue.get(generateKey("session")));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public DeviceMetadata retrieveDeviceMetadata(String str) {
        sq8.m48649h(str, "username");
        return deserializeMetadata(this.keyValue.get(generateKey(str + ".deviceMetadata")));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveASFDevice(AmplifyCredential.ASFDevice aSFDevice) {
        sq8.m48649h(aSFDevice, "device");
        this.keyValue.put(generateKey(Key_ASFDevice), serializeASFDevice(aSFDevice));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveCredential(AmplifyCredential amplifyCredential) {
        sq8.m48649h(amplifyCredential, "credential");
        this.keyValue.put(generateKey("session"), serializeCredential(amplifyCredential));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveDeviceMetadata(String str, DeviceMetadata deviceMetadata) {
        sq8.m48649h(str, "username");
        sq8.m48649h(deviceMetadata, Key_DeviceMetadata);
        this.keyValue.put(generateKey(str + ".deviceMetadata"), serializeMetaData(deviceMetadata));
    }

    public /* synthetic */ AWSCognitoAuthCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepositoryFactory, int i, id5 id5Var) {
        this(context, authConfiguration, (i & 4) != 0 ? new KeyValueRepositoryFactory() : keyValueRepositoryFactory);
    }
}
