package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;

/* loaded from: classes5.dex */
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
