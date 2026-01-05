package com.amplifyframework.rx;

import com.amplifyframework.rx.RxStorageBinding;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import com.amplifyframework.storage.options.StorageGetUrlOptions;
import com.amplifyframework.storage.options.StorageListOptions;
import com.amplifyframework.storage.options.StoragePagedListOptions;
import com.amplifyframework.storage.options.StorageRemoveOptions;
import com.amplifyframework.storage.options.StorageUploadFileOptions;
import com.amplifyframework.storage.options.StorageUploadInputStreamOptions;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import java.io.File;
import java.io.InputStream;
import p001o.wtf;

/* loaded from: classes5.dex */
public interface RxStorageCategoryBehavior {
    RxStorageBinding.RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(StoragePath storagePath, File file);

    RxStorageBinding.RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions);

    @Deprecated
    RxStorageBinding.RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(String str, File file);

    @Deprecated
    RxStorageBinding.RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(String str, File file, StorageDownloadFileOptions storageDownloadFileOptions);

    wtf getTransfer(String str);

    wtf getUrl(StoragePath storagePath);

    wtf getUrl(StoragePath storagePath, StorageGetUrlOptions storageGetUrlOptions);

    @Deprecated
    wtf getUrl(String str);

    @Deprecated
    wtf getUrl(String str, StorageGetUrlOptions storageGetUrlOptions);

    wtf list(StoragePath storagePath, StoragePagedListOptions storagePagedListOptions);

    @Deprecated
    wtf list(String str);

    @Deprecated
    wtf list(String str, StorageListOptions storageListOptions);

    @Deprecated
    wtf list(String str, StoragePagedListOptions storagePagedListOptions);

    wtf remove(StoragePath storagePath);

    wtf remove(StoragePath storagePath, StorageRemoveOptions storageRemoveOptions);

    @Deprecated
    wtf remove(String str);

    @Deprecated
    wtf remove(String str, StorageRemoveOptions storageRemoveOptions);

    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(StoragePath storagePath, File file);

    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions);

    @Deprecated
    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(String str, File file);

    @Deprecated
    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(String str, File file, StorageUploadFileOptions storageUploadFileOptions);

    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(StoragePath storagePath, InputStream inputStream);

    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions);

    @Deprecated
    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(String str, InputStream inputStream);

    @Deprecated
    RxStorageBinding.RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions);
}
