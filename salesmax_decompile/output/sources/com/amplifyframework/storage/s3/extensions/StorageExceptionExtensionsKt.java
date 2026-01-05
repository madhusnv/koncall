package com.amplifyframework.storage.s3.extensions;

import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StoragePathValidationException;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class StorageExceptionExtensionsKt {
    public static final StorageException invalidStoragePathException(StoragePathValidationException.Companion companion) {
        sq8.m48649h(companion, "<this>");
        return new StorageException("Invalid StoragePath provided", new StoragePathValidationException("Invalid StoragePath provided", "Path must not be empty or start with /"), "Path must not be empty or start with /");
    }

    public static final StorageException unsupportedStoragePathException(StoragePathValidationException.Companion companion) {
        sq8.m48649h(companion, "<this>");
        return new StorageException("Unsupported StoragePath provided", new StoragePathValidationException("Unsupported StoragePath provided", "Provided StoragePath not supported by AWS S3 Storage Plugin"), "Provided StoragePath not supported by AWS S3 Storage Plugin");
    }
}
