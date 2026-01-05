package com.amplifyframework.kotlin.storage;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.kotlin.storage.Storage;
import com.amplifyframework.storage.StorageCategoryBehavior;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.operation.StorageDownloadFileOperation;
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
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import qw.InterfaceC6353c;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.b1;
import wx.c1;
import wx.t0;
import wx.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinStorageFacade implements Storage {
    private final StorageCategoryBehavior delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinStorageFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$2(t0 t0Var, StorageTransferProgress it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$3(t0 t0Var, StorageDownloadFileResult it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$4(t0 t0Var, StorageException it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$5(t0 t0Var, StorageTransferProgress it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$6(t0 t0Var, StorageDownloadFileResult it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$7(t0 t0Var, StorageException it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadFile$lambda$10(t0 t0Var, StorageException it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadFile$lambda$11(t0 t0Var, StorageTransferProgress it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadFile$lambda$12(t0 t0Var, StorageUploadFileResult it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadFile$lambda$13(t0 t0Var, StorageException it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadFile$lambda$8(t0 t0Var, StorageTransferProgress it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadFile$lambda$9(t0 t0Var, StorageUploadFileResult it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadInputStream$lambda$14(t0 t0Var, StorageTransferProgress it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadInputStream$lambda$15(t0 t0Var, StorageUploadInputStreamResult it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadInputStream$lambda$16(t0 t0Var, StorageException it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadInputStream$lambda$17(t0 t0Var, StorageTransferProgress it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadInputStream$lambda$18(t0 t0Var, StorageUploadInputStreamResult it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadInputStream$lambda$19(t0 t0Var, StorageException it) {
        AbstractC4154l.m8923f(it, "it");
        t0Var.mo15352b(it);
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    @InterfaceC6353c
    public Storage.InProgressStorageOperation<StorageDownloadFileResult> downloadFile(String key, File local, StorageDownloadFileOptions options) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(local, "local");
        AbstractC4154l.m8923f(options, "options");
        b1 b1VarM15371b = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b2 = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b3 = c1.m15371b(1, 0, null, 6);
        StorageDownloadFileOperation<?> storageDownloadFileOperationDownloadFile = this.delegate.downloadFile(key, local, options, new C1218a(b1VarM15371b, 3), new C1218a(b1VarM15371b2, 4), new C1218a(b1VarM15371b3, 5));
        AbstractC4154l.m8922e(storageDownloadFileOperationDownloadFile, "downloadFile(...)");
        String transferId = storageDownloadFileOperationDownloadFile.getTransferId();
        AbstractC4154l.m8922e(transferId, "getTransferId(...)");
        return new Storage.InProgressStorageOperation<>(transferId, new v0(b1VarM15371b2), new v0(b1VarM15371b), new v0(b1VarM15371b3), storageDownloadFileOperationDownloadFile);
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    public Object getTransfer(String str, InterfaceC7559c<? super StorageTransferOperation<?, StorageTransferResult>> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.getTransfer(str, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$getTransfer$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageTransferOperation<?, ? extends StorageTransferResult> it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$getTransfer$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    @InterfaceC6353c
    public Object getUrl(String str, StorageGetUrlOptions storageGetUrlOptions, InterfaceC7559c<? super StorageGetUrlResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.getUrl(str, storageGetUrlOptions, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$getUrl$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageGetUrlResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$getUrl$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    @InterfaceC6353c
    public Object list(String str, StorageListOptions storageListOptions, InterfaceC7559c<? super StorageListResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.list(str, storageListOptions, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$list$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageListResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$list$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    @InterfaceC6353c
    public Object remove(String str, StorageRemoveOptions storageRemoveOptions, InterfaceC7559c<? super StorageRemoveResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.remove(str, storageRemoveOptions, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$remove$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageRemoveResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$remove$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    @InterfaceC6353c
    public Storage.InProgressStorageOperation<StorageUploadFileResult> uploadFile(String key, File local, StorageUploadFileOptions options) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(local, "local");
        AbstractC4154l.m8923f(options, "options");
        b1 b1VarM15371b = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b2 = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b3 = c1.m15371b(1, 0, null, 6);
        StorageUploadFileOperation<?> storageUploadFileOperationUploadFile = this.delegate.uploadFile(key, local, options, new C1218a(b1VarM15371b, 14), new C1218a(b1VarM15371b2, 15), new C1218a(b1VarM15371b3, 16));
        AbstractC4154l.m8922e(storageUploadFileOperationUploadFile, "uploadFile(...)");
        String transferId = storageUploadFileOperationUploadFile.getTransferId();
        AbstractC4154l.m8922e(transferId, "getTransferId(...)");
        return new Storage.InProgressStorageOperation<>(transferId, new v0(b1VarM15371b2), new v0(b1VarM15371b), new v0(b1VarM15371b3), storageUploadFileOperationUploadFile);
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    @InterfaceC6353c
    public Storage.InProgressStorageOperation<StorageUploadInputStreamResult> uploadInputStream(String key, InputStream local, StorageUploadInputStreamOptions options) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(local, "local");
        AbstractC4154l.m8923f(options, "options");
        b1 b1VarM15371b = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b2 = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b3 = c1.m15371b(1, 0, null, 6);
        StorageUploadInputStreamOperation<?> storageUploadInputStreamOperationUploadInputStream = this.delegate.uploadInputStream(key, local, options, new C1218a(b1VarM15371b, 6), new C1218a(b1VarM15371b2, 7), new C1218a(b1VarM15371b3, 8));
        AbstractC4154l.m8922e(storageUploadInputStreamOperationUploadInputStream, "uploadInputStream(...)");
        String transferId = storageUploadInputStreamOperationUploadInputStream.getTransferId();
        AbstractC4154l.m8922e(transferId, "getTransferId(...)");
        return new Storage.InProgressStorageOperation<>(transferId, new v0(b1VarM15371b2), new v0(b1VarM15371b), new v0(b1VarM15371b3), storageUploadInputStreamOperationUploadInputStream);
    }

    public KotlinStorageFacade(StorageCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinStorageFacade(StorageCategoryBehavior Storage, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            Storage = Amplify.Storage;
            AbstractC4154l.m8922e(Storage, "Storage");
        }
        this(Storage);
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    public Object getUrl(StoragePath storagePath, StorageGetUrlOptions storageGetUrlOptions, InterfaceC7559c<? super StorageGetUrlResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.getUrl(storagePath, storageGetUrlOptions, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$getUrl$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageGetUrlResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$getUrl$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    @InterfaceC6353c
    public Object list(String str, StoragePagedListOptions storagePagedListOptions, InterfaceC7559c<? super StorageListResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.list(str, storagePagedListOptions, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$list$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageListResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$list$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    public Object remove(StoragePath storagePath, StorageRemoveOptions storageRemoveOptions, InterfaceC7559c<? super StorageRemoveResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.remove(storagePath, storageRemoveOptions, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$remove$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageRemoveResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$remove$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    public Object list(StoragePath storagePath, StoragePagedListOptions storagePagedListOptions, InterfaceC7559c<? super StorageListResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.list(storagePath, storagePagedListOptions, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$list$6$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageListResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.storage.KotlinStorageFacade$list$6$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(StorageException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    public Storage.InProgressStorageOperation<StorageDownloadFileResult> downloadFile(StoragePath path, File local, StorageDownloadFileOptions options) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(local, "local");
        AbstractC4154l.m8923f(options, "options");
        b1 b1VarM15371b = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b2 = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b3 = c1.m15371b(1, 0, null, 6);
        StorageDownloadFileOperation<?> storageDownloadFileOperationDownloadFile = this.delegate.downloadFile(path, local, options, new C1218a(b1VarM15371b, 0), new C1218a(b1VarM15371b2, 9), new C1218a(b1VarM15371b3, 10));
        String transferId = storageDownloadFileOperationDownloadFile.getTransferId();
        AbstractC4154l.m8922e(transferId, "getTransferId(...)");
        return new Storage.InProgressStorageOperation<>(transferId, new v0(b1VarM15371b2), new v0(b1VarM15371b), new v0(b1VarM15371b3), storageDownloadFileOperationDownloadFile);
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    public Storage.InProgressStorageOperation<StorageUploadFileResult> uploadFile(StoragePath path, File local, StorageUploadFileOptions options) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(local, "local");
        AbstractC4154l.m8923f(options, "options");
        b1 b1VarM15371b = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b2 = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b3 = c1.m15371b(1, 0, null, 6);
        StorageUploadFileOperation<?> storageUploadFileOperationUploadFile = this.delegate.uploadFile(path, local, options, new C1218a(b1VarM15371b, 11), new C1218a(b1VarM15371b2, 12), new C1218a(b1VarM15371b3, 13));
        AbstractC4154l.m8922e(storageUploadFileOperationUploadFile, "uploadFile(...)");
        String transferId = storageUploadFileOperationUploadFile.getTransferId();
        AbstractC4154l.m8922e(transferId, "getTransferId(...)");
        return new Storage.InProgressStorageOperation<>(transferId, new v0(b1VarM15371b2), new v0(b1VarM15371b), new v0(b1VarM15371b3), storageUploadFileOperationUploadFile);
    }

    @Override // com.amplifyframework.kotlin.storage.Storage
    public Storage.InProgressStorageOperation<StorageUploadInputStreamResult> uploadInputStream(StoragePath path, InputStream local, StorageUploadInputStreamOptions options) {
        AbstractC4154l.m8923f(path, "path");
        AbstractC4154l.m8923f(local, "local");
        AbstractC4154l.m8923f(options, "options");
        b1 b1VarM15371b = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b2 = c1.m15371b(1, 0, null, 6);
        b1 b1VarM15371b3 = c1.m15371b(1, 0, null, 6);
        StorageUploadInputStreamOperation<?> storageUploadInputStreamOperationUploadInputStream = this.delegate.uploadInputStream(path, local, options, new C1218a(b1VarM15371b, 17), new C1218a(b1VarM15371b2, 1), new C1218a(b1VarM15371b3, 2));
        AbstractC4154l.m8922e(storageUploadInputStreamOperationUploadInputStream, "uploadInputStream(...)");
        String transferId = storageUploadInputStreamOperationUploadInputStream.getTransferId();
        AbstractC4154l.m8922e(transferId, "getTransferId(...)");
        return new Storage.InProgressStorageOperation<>(transferId, new v0(b1VarM15371b2), new v0(b1VarM15371b), new v0(b1VarM15371b3), storageUploadInputStreamOperationUploadInputStream);
    }
}
