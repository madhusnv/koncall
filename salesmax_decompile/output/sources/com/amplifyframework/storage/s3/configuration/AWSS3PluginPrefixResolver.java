package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;

/* loaded from: classes5.dex */
public interface AWSS3PluginPrefixResolver {
    void resolvePrefix(StorageAccessLevel storageAccessLevel, String str, Consumer<String> consumer, Consumer<StorageException> consumer2);
}
