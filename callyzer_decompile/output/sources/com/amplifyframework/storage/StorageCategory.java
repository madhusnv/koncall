package com.amplifyframework.storage;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.storage.operation.StorageDownloadFileOperation;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.operation.StorageListOperation;
import com.amplifyframework.storage.operation.StorageRemoveOperation;
import com.amplifyframework.storage.operation.StorageTransferOperation;
import com.amplifyframework.storage.operation.StorageUploadFileOperation;
import com.amplifyframework.storage.operation.StorageUploadInputStreamOperation;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import com.amplifyframework.storage.options.StorageGetUrlOptions;
import com.amplifyframework.storage.options.StorageListOptions;
import com.amplifyframework.storage.options.StoragePagedListOptions;
import com.amplifyframework.storage.options.StorageRemoveOptions;
import com.amplifyframework.storage.options.StorageUploadFileOptions;
import com.amplifyframework.storage.options.StorageUploadInputStreamOptions;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.result.StorageListResult;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageTransferResult;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import java.io.File;
import java.io.InputStream;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StorageCategory extends Category<StoragePlugin<?>> implements StorageCategoryBehavior {
    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageDownloadFileOperation<?> downloadFile(String str, File file, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().downloadFile(str, file, consumer, consumer2);
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.STORAGE;
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public void getTransfer(String str, Consumer<StorageTransferOperation<?, ? extends StorageTransferResult>> consumer, Consumer<StorageException> consumer2) {
        getSelectedPlugin().getTransfer(str, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageGetUrlOperation<?> getUrl(String str, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().getUrl(str, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageListOperation<?> list(String str, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().list(str, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageRemoveOperation<?> remove(String str, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().remove(str, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageUploadFileOperation<?> uploadFile(String str, File file, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadFile(str, file, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageUploadInputStreamOperation<?> uploadInputStream(String str, InputStream inputStream, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadInputStream(str, inputStream, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(StoragePath storagePath, File file, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().downloadFile(storagePath, file, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageGetUrlOperation<?> getUrl(StoragePath storagePath, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().getUrl(storagePath, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageListOperation<?> list(String str, StorageListOptions storageListOptions, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().list(str, storageListOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageRemoveOperation<?> remove(StoragePath storagePath, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().remove(storagePath, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(StoragePath storagePath, File file, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadFile(storagePath, file, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(StoragePath storagePath, InputStream inputStream, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadInputStream(storagePath, inputStream, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageDownloadFileOperation<?> downloadFile(String str, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().downloadFile(str, file, storageDownloadFileOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageGetUrlOperation<?> getUrl(String str, StorageGetUrlOptions storageGetUrlOptions, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().getUrl(str, storageGetUrlOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageListOperation<?> list(String str, StoragePagedListOptions storagePagedListOptions, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().list(str, storagePagedListOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageRemoveOperation<?> remove(String str, StorageRemoveOptions storageRemoveOptions, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().remove(str, storageRemoveOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageUploadFileOperation<?> uploadFile(String str, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadFile(str, file, storageUploadFileOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageUploadInputStreamOperation<?> uploadInputStream(String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadInputStream(str, inputStream, storageUploadInputStreamOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageDownloadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().downloadFile(storagePath, file, storageDownloadFileOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageGetUrlOperation<?> getUrl(StoragePath storagePath, StorageGetUrlOptions storageGetUrlOptions, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().getUrl(storagePath, storageGetUrlOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageListOperation<?> list(StoragePath storagePath, StoragePagedListOptions storagePagedListOptions, Consumer<StorageListResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().list(storagePath, storagePagedListOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageRemoveOperation<?> remove(StoragePath storagePath, StorageRemoveOptions storageRemoveOptions, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().remove(storagePath, storageRemoveOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageUploadFileResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadFile(storagePath, file, storageUploadFileOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageUploadInputStreamResult> consumer, Consumer<StorageException> consumer2) {
        return getSelectedPlugin().uploadInputStream(storagePath, inputStream, storageUploadInputStreamOptions, consumer, consumer2);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageDownloadFileOperation<?> downloadFile(String str, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        return getSelectedPlugin().downloadFile(str, file, storageDownloadFileOptions, consumer, consumer2, consumer3);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageUploadFileOperation<?> uploadFile(String str, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        return getSelectedPlugin().uploadFile(str, file, storageUploadFileOptions, consumer, consumer2, consumer3);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    @Deprecated
    public StorageUploadInputStreamOperation<?> uploadInputStream(String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
        return getSelectedPlugin().uploadInputStream(str, inputStream, storageUploadInputStreamOptions, consumer, consumer2, consumer3);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageDownloadFileOperation<?> downloadFile(StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        return getSelectedPlugin().downloadFile(storagePath, file, storageDownloadFileOptions, consumer, consumer2, consumer3);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadFileOperation<?> uploadFile(StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        return getSelectedPlugin().uploadFile(storagePath, file, storageUploadFileOptions, consumer, consumer2, consumer3);
    }

    @Override // com.amplifyframework.storage.StorageCategoryBehavior
    public StorageUploadInputStreamOperation<?> uploadInputStream(StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
        return getSelectedPlugin().uploadInputStream(storagePath, inputStream, storageUploadInputStreamOptions, consumer, consumer2, consumer3);
    }
}
