package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import qw.InterfaceC6353c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC6353c
/* loaded from: classes.dex */
public interface AWSS3PluginPrefixResolver {
    void resolvePrefix(StorageAccessLevel storageAccessLevel, String str, Consumer<String> consumer, Consumer<StorageException> consumer2);
}
