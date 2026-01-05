package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AuthCredentialStore {
    void deleteASFDevice();

    void deleteCredential();

    void deleteDeviceKeyCredential(String str);

    AmplifyCredential.ASFDevice retrieveASFDevice();

    AmplifyCredential retrieveCredential();

    DeviceMetadata retrieveDeviceMetadata(String str);

    void saveASFDevice(AmplifyCredential.ASFDevice aSFDevice);

    void saveCredential(AmplifyCredential amplifyCredential);

    void saveDeviceMetadata(String str, DeviceMetadata deviceMetadata);
}
