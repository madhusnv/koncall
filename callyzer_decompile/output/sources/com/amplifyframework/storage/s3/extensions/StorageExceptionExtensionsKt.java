package com.amplifyframework.storage.s3.extensions;

import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StorageFilePermissionException;
import com.amplifyframework.storage.StoragePathValidationException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageExceptionExtensionsKt {
    public static final StorageException invalidStoragePathException(StoragePathValidationException.Companion companion) {
        AbstractC4154l.m8923f(companion, "<this>");
        return new StorageException("Invalid StoragePath provided", new StoragePathValidationException("Invalid StoragePath provided", "Path must not be empty or start with /"), "Path must not be empty or start with /");
    }

    public static final StorageException unableToOverwriteFileException(StorageFilePermissionException.Companion companion) {
        AbstractC4154l.m8923f(companion, "<this>");
        return new StorageException("Unable to overwrite this file for download.", new StorageFilePermissionException("Unable to overwrite this file for download.", "Acquire write permission for this file before attempting to overwrite it."), "Acquire write permission for this file before attempting to overwrite it.");
    }

    public static final StorageException unsupportedStoragePathException(StoragePathValidationException.Companion companion) {
        AbstractC4154l.m8923f(companion, "<this>");
        return new StorageException("Unsupported StoragePath provided", new StoragePathValidationException("Unsupported StoragePath provided", "Provided StoragePath not supported by AWS S3 Storage Plugin"), "Provided StoragePath not supported by AWS S3 Storage Plugin");
    }
}
