package com.amplifyframework.storage.s3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum ServerSideEncryption {
    MANAGED_KEYS("AES256"),
    KMS_KEYS("aws:kms"),
    NONE("");

    private final String name;

    ServerSideEncryption(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
