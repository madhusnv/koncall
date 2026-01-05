package com.amplifyframework.storage.result;

import java.io.File;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageDownloadFileResult extends StorageTransferResult {
    private final File file;

    private StorageDownloadFileResult(File file) {
        this.file = file;
    }

    public static StorageDownloadFileResult fromFile(File file) {
        Objects.requireNonNull(file);
        return new StorageDownloadFileResult(file);
    }

    public File getFile() {
        return this.file;
    }
}
