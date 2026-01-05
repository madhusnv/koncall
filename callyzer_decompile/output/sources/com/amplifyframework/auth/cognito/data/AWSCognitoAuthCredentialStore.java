package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthCredentialStore;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import i0.m0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.C4270b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthCredentialStore implements AuthCredentialStore {
    public static final String AWS_KEY_VALUE_STORE_IDENTIFIER = "com.amplify.credentialStore";
    public static final Companion Companion = new Companion(null);
    private static final String KEY_ASF_DEVICE = "asfDevice";
    private static final String KEY_DEVICE_METADATA = "deviceMetadata";
    private static final String KEY_SESSION = "session";
    private final AuthConfiguration authConfiguration;
    private final Context context;
    private KeyValueRepository keyValue;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public AWSCognitoAuthCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepoFactory) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(authConfiguration, "authConfiguration");
        AbstractC4154l.m8923f(keyValueRepoFactory, "keyValueRepoFactory");
        this.context = context;
        this.authConfiguration = authConfiguration;
        this.keyValue = keyValueRepoFactory.create(context, AWS_KEY_VALUE_STORE_IDENTIFIER);
    }

    private final AmplifyCredential.ASFDevice deserializeASFDevice(String str) {
        AmplifyCredential.ASFDevice aSFDevice;
        if (str != null) {
            try {
                C4270b c4270b = AbstractC4271c.f21666d;
                c4270b.getClass();
                Object objM8987a = c4270b.m8987a(AmplifyCredential.ASFDevice.Companion.serializer(), str);
                AbstractC4154l.m8921d(objM8987a, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.data.AmplifyCredential.ASFDevice");
                aSFDevice = (AmplifyCredential.ASFDevice) objM8987a;
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
                C4270b c4270b = AbstractC4271c.f21666d;
                c4270b.getClass();
                Object objM8987a = c4270b.m8987a(AmplifyCredential.Companion.serializer(), str);
                AbstractC4154l.m8921d(objM8987a, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.data.AmplifyCredential");
                amplifyCredential = (AmplifyCredential) objM8987a;
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
                C4270b c4270b = AbstractC4271c.f21666d;
                c4270b.getClass();
                Object objM8987a = c4270b.m8987a(DeviceMetadata.Companion.serializer(), str);
                AbstractC4154l.m8921d(objM8987a, "null cannot be cast to non-null type com.amplifyframework.statemachine.codegen.data.DeviceMetadata");
                deviceMetadata = (DeviceMetadata) objM8987a;
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
        String strM7378k = userPool != null ? m0.m7378k("amplify.", userPool.getPoolId()) : "amplify";
        IdentityPoolConfiguration identityPool = this.authConfiguration.getIdentityPool();
        if (identityPool != null) {
            strM7378k = ((Object) strM7378k) + "." + identityPool.getPoolId();
        }
        return ((Object) strM7378k) + "." + str;
    }

    private final String serializeASFDevice(AmplifyCredential.ASFDevice aSFDevice) {
        C4270b c4270b = AbstractC4271c.f21666d;
        c4270b.getClass();
        return c4270b.m8988b(AmplifyCredential.ASFDevice.Companion.serializer(), aSFDevice);
    }

    private final String serializeCredential(AmplifyCredential amplifyCredential) {
        C4270b c4270b = AbstractC4271c.f21666d;
        c4270b.getClass();
        return c4270b.m8988b(AmplifyCredential.Companion.serializer(), amplifyCredential);
    }

    private final String serializeMetaData(DeviceMetadata deviceMetadata) {
        C4270b c4270b = AbstractC4271c.f21666d;
        c4270b.getClass();
        return c4270b.m8988b(DeviceMetadata.Companion.serializer(), deviceMetadata);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteASFDevice() {
        this.keyValue.remove(generateKey(KEY_ASF_DEVICE));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteCredential() {
        this.keyValue.remove(generateKey(KEY_SESSION));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteDeviceKeyCredential(String username) {
        AbstractC4154l.m8923f(username, "username");
        this.keyValue.remove(generateKey(username.concat(".deviceMetadata")));
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential.ASFDevice retrieveASFDevice() {
        return deserializeASFDevice(this.keyValue.get(generateKey(KEY_ASF_DEVICE)));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential retrieveCredential() {
        return deserializeCredential(this.keyValue.get(generateKey(KEY_SESSION)));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public DeviceMetadata retrieveDeviceMetadata(String username) {
        AbstractC4154l.m8923f(username, "username");
        return deserializeMetadata(this.keyValue.get(generateKey(username.concat(".deviceMetadata"))));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveASFDevice(AmplifyCredential.ASFDevice device) {
        AbstractC4154l.m8923f(device, "device");
        this.keyValue.put(generateKey(KEY_ASF_DEVICE), serializeASFDevice(device));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveCredential(AmplifyCredential credential) {
        AbstractC4154l.m8923f(credential, "credential");
        this.keyValue.put(generateKey(KEY_SESSION), serializeCredential(credential));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveDeviceMetadata(String username, DeviceMetadata deviceMetadata) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(deviceMetadata, "deviceMetadata");
        this.keyValue.put(generateKey(username.concat(".deviceMetadata")), serializeMetaData(deviceMetadata));
    }

    public /* synthetic */ AWSCognitoAuthCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepositoryFactory, int i10, AbstractC4148f abstractC4148f) {
        this(context, authConfiguration, (i10 & 4) != 0 ? new KeyValueRepositoryFactory() : keyValueRepositoryFactory);
    }
}
