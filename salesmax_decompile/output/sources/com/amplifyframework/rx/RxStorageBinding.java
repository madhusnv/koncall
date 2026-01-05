package com.amplifyframework.rx;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.async.NoOpCancelable;
import com.amplifyframework.core.async.Resumable;
import com.amplifyframework.rx.RxAdapters;
import com.amplifyframework.storage.StorageCategory;
import com.amplifyframework.storage.StorageCategoryBehavior;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.operation.StorageTransferOperation;
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
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import java.io.File;
import java.io.InputStream;
import java.util.Objects;
import p001o.auf;
import p001o.f3e;
import p001o.gu3;
import p001o.muf;
import p001o.uke;
import p001o.wtf;
import p001o.x6c;

/* loaded from: classes5.dex */
public final class RxStorageBinding implements RxStorageCategoryBehavior {
    private final StorageCategoryBehavior storage;

    public static final class RxProgressAwareSingleOperation<T> implements RxAdapters.RxSingleOperation<T>, Resumable {
        private final StorageTransferOperation<?, ?> amplifyOperation;
        private final f3e progressSubject;
        private final uke resultSubject;

        public RxProgressAwareSingleOperation(RxStorageTransferCallbackMapper<T> rxStorageTransferCallbackMapper) {
            final f3e f3eVarN0 = f3e.N0();
            this.progressSubject = f3eVarN0;
            final uke ukeVarN0 = uke.N0();
            this.resultSubject = ukeVarN0;
            Objects.requireNonNull(f3eVarN0);
            Consumer<StorageTransferProgress> consumer = new Consumer() { // from class: o.qwe
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    f3eVarN0.mo16560e((StorageTransferProgress) obj);
                }
            };
            Objects.requireNonNull(ukeVarN0);
            Consumer<T> consumer2 = new Consumer() { // from class: o.rwe
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    ukeVarN0.mo16560e(obj);
                }
            };
            Objects.requireNonNull(ukeVarN0);
            this.amplifyOperation = rxStorageTransferCallbackMapper.emitTo(consumer, consumer2, new Consumer() { // from class: o.swe
                @Override // com.amplifyframework.core.Consumer
                public final void accept(Object obj) {
                    ukeVarN0.onError((StorageException) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$observeResult$0(final auf aufVar) {
            uke ukeVar = this.resultSubject;
            Objects.requireNonNull(aufVar);
            aufVar.mo17849d(ukeVar.v0(new gu3() { // from class: o.owe
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    aufVar.onSuccess(obj);
                }
            }, new gu3() { // from class: o.pwe
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    aufVar.mo17847a((Throwable) obj);
                }
            }));
        }

        @Override // com.amplifyframework.core.async.Cancelable
        public void cancel() {
            this.amplifyOperation.cancel();
            this.resultSubject.onComplete();
            this.progressSubject.onComplete();
        }

        public String getTransferId() {
            return this.amplifyOperation.getTransferId();
        }

        public x6c observeProgress() {
            return this.progressSubject;
        }

        @Override // com.amplifyframework.rx.RxAdapters.RxSingleOperation
        public wtf observeResult() {
            return wtf.m55005e(new muf() { // from class: o.nwe
                @Override // p001o.muf
                /* renamed from: a */
                public final void mo12390a(auf aufVar) {
                    this.f37362a.lambda$observeResult$0(aufVar);
                }
            });
        }

        @Override // com.amplifyframework.core.async.Resumable
        public void pause() {
            this.amplifyOperation.pause();
        }

        @Override // com.amplifyframework.core.async.Resumable
        public void resume() {
            this.amplifyOperation.resume();
        }
    }

    public interface RxStorageTransferCallbackMapper<T> {
        StorageTransferOperation<?, ?> emitTo(Consumer<StorageTransferProgress> consumer, Consumer<T> consumer2, Consumer<StorageException> consumer3);
    }

    public RxStorageBinding() {
        this(Amplify.Storage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StorageTransferOperation lambda$downloadFile$4(String str, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer consumer, Consumer consumer2, Consumer consumer3) {
        return this.storage.downloadFile(str, file, storageDownloadFileOptions, (Consumer<StorageTransferProgress>) consumer, (Consumer<StorageDownloadFileResult>) consumer2, (Consumer<StorageException>) consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StorageTransferOperation lambda$downloadFile$5(StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions, Consumer consumer, Consumer consumer2, Consumer consumer3) {
        return this.storage.downloadFile(storagePath, file, storageDownloadFileOptions, (Consumer<StorageTransferProgress>) consumer, (Consumer<StorageDownloadFileResult>) consumer2, (Consumer<StorageException>) consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$getTransfer$18(String str, Consumer consumer, Consumer consumer2) {
        this.storage.getTransfer(str, consumer, consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$getUrl$0(String str, Consumer consumer, Consumer consumer2) {
        this.storage.getUrl(str, (Consumer<StorageGetUrlResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$getUrl$1(StoragePath storagePath, Consumer consumer, Consumer consumer2) {
        this.storage.getUrl(storagePath, (Consumer<StorageGetUrlResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$getUrl$2(String str, StorageGetUrlOptions storageGetUrlOptions, Consumer consumer, Consumer consumer2) {
        this.storage.getUrl(str, storageGetUrlOptions, (Consumer<StorageGetUrlResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$getUrl$3(StoragePath storagePath, StorageGetUrlOptions storageGetUrlOptions, Consumer consumer, Consumer consumer2) {
        this.storage.getUrl(storagePath, storageGetUrlOptions, (Consumer<StorageGetUrlResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$list$14(String str, Consumer consumer, Consumer consumer2) {
        this.storage.list(str, consumer, consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$list$15(String str, StorageListOptions storageListOptions, Consumer consumer, Consumer consumer2) {
        this.storage.list(str, storageListOptions, (Consumer<StorageListResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$list$16(String str, StoragePagedListOptions storagePagedListOptions, Consumer consumer, Consumer consumer2) {
        this.storage.list(str, storagePagedListOptions, (Consumer<StorageListResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$list$17(StoragePath storagePath, StoragePagedListOptions storagePagedListOptions, Consumer consumer, Consumer consumer2) {
        this.storage.list(storagePath, storagePagedListOptions, (Consumer<StorageListResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$remove$10(String str, Consumer consumer, Consumer consumer2) {
        this.storage.remove(str, (Consumer<StorageRemoveResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$remove$11(StoragePath storagePath, Consumer consumer, Consumer consumer2) {
        this.storage.remove(storagePath, (Consumer<StorageRemoveResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$remove$12(String str, StorageRemoveOptions storageRemoveOptions, Consumer consumer, Consumer consumer2) {
        this.storage.remove(str, storageRemoveOptions, (Consumer<StorageRemoveResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$remove$13(StoragePath storagePath, StorageRemoveOptions storageRemoveOptions, Consumer consumer, Consumer consumer2) {
        this.storage.remove(storagePath, storageRemoveOptions, (Consumer<StorageRemoveResult>) consumer, (Consumer<StorageException>) consumer2);
        return new NoOpCancelable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StorageTransferOperation lambda$uploadFile$6(String str, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer consumer, Consumer consumer2, Consumer consumer3) {
        return this.storage.uploadFile(str, file, storageUploadFileOptions, (Consumer<StorageTransferProgress>) consumer, (Consumer<StorageUploadFileResult>) consumer2, (Consumer<StorageException>) consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StorageTransferOperation lambda$uploadFile$7(StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions, Consumer consumer, Consumer consumer2, Consumer consumer3) {
        return this.storage.uploadFile(storagePath, file, storageUploadFileOptions, (Consumer<StorageTransferProgress>) consumer, (Consumer<StorageUploadFileResult>) consumer2, (Consumer<StorageException>) consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StorageTransferOperation lambda$uploadInputStream$8(String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer consumer, Consumer consumer2, Consumer consumer3) {
        return this.storage.uploadInputStream(str, inputStream, storageUploadInputStreamOptions, (Consumer<StorageTransferProgress>) consumer, (Consumer<StorageUploadInputStreamResult>) consumer2, (Consumer<StorageException>) consumer3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StorageTransferOperation lambda$uploadInputStream$9(StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, Consumer consumer, Consumer consumer2, Consumer consumer3) {
        return this.storage.uploadInputStream(storagePath, inputStream, storageUploadInputStreamOptions, (Consumer<StorageTransferProgress>) consumer, (Consumer<StorageUploadInputStreamResult>) consumer2, (Consumer<StorageException>) consumer3);
    }

    private <T> wtf toSingle(RxAdapters.CancelableBehaviors.ResultEmitter<T, StorageException> resultEmitter) {
        return RxAdapters.CancelableBehaviors.toSingle(resultEmitter);
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(String str, File file) {
        return downloadFile(str, file, StorageDownloadFileOptions.defaultInstance());
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf getTransfer(final String str) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.g4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10893a.lambda$getTransfer$18(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf getUrl(final String str) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.z3
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11128a.lambda$getUrl$0(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf list(final String str) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.b4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10825a.lambda$list$14(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf remove(final String str) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.c4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10834a.lambda$remove$10(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(String str, File file) {
        return uploadFile(str, file, StorageUploadFileOptions.defaultInstance());
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(String str, InputStream inputStream) {
        return uploadInputStream(str, inputStream, StorageUploadInputStreamOptions.defaultInstance());
    }

    public RxStorageBinding(StorageCategory storageCategory) {
        this.storage = storageCategory;
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(StoragePath storagePath, File file) {
        return downloadFile(storagePath, file, StorageDownloadFileOptions.defaultInstance());
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf getUrl(final StoragePath storagePath) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.x3
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11104a.lambda$getUrl$1(storagePath, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf list(final String str, final StorageListOptions storageListOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.h4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10907a.lambda$list$15(str, storageListOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf remove(final StoragePath storagePath) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.e4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10864a.lambda$remove$11(storagePath, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(StoragePath storagePath, File file) {
        return uploadFile(storagePath, file, StorageUploadFileOptions.defaultInstance());
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(StoragePath storagePath, InputStream inputStream) {
        return uploadInputStream(storagePath, inputStream, StorageUploadInputStreamOptions.defaultInstance());
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(final String str, final File file, final StorageDownloadFileOptions storageDownloadFileOptions) {
        return new RxProgressAwareSingleOperation<>(new RxStorageTransferCallbackMapper() { // from class: com.amplifyframework.rx.f4
            @Override // com.amplifyframework.rx.RxStorageBinding.RxStorageTransferCallbackMapper
            public final StorageTransferOperation emitTo(Consumer consumer, Consumer consumer2, Consumer consumer3) {
                return this.f10876a.lambda$downloadFile$4(str, file, storageDownloadFileOptions, consumer, consumer2, consumer3);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf getUrl(final String str, final StorageGetUrlOptions storageGetUrlOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.l4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10971a.lambda$getUrl$2(str, storageGetUrlOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf list(final String str, final StoragePagedListOptions storagePagedListOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.w3
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11090a.lambda$list$16(str, storagePagedListOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf remove(final String str, final StorageRemoveOptions storageRemoveOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.j4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10941a.lambda$remove$12(str, storageRemoveOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(final String str, final File file, final StorageUploadFileOptions storageUploadFileOptions) {
        return new RxProgressAwareSingleOperation<>(new RxStorageTransferCallbackMapper() { // from class: com.amplifyframework.rx.y3
            @Override // com.amplifyframework.rx.RxStorageBinding.RxStorageTransferCallbackMapper
            public final StorageTransferOperation emitTo(Consumer consumer, Consumer consumer2, Consumer consumer3) {
                return this.f11117a.lambda$uploadFile$6(str, file, storageUploadFileOptions, consumer, consumer2, consumer3);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(final String str, final InputStream inputStream, final StorageUploadInputStreamOptions storageUploadInputStreamOptions) {
        return new RxProgressAwareSingleOperation<>(new RxStorageTransferCallbackMapper() { // from class: com.amplifyframework.rx.i4
            @Override // com.amplifyframework.rx.RxStorageBinding.RxStorageTransferCallbackMapper
            public final StorageTransferOperation emitTo(Consumer consumer, Consumer consumer2, Consumer consumer3) {
                return this.f10920a.lambda$uploadInputStream$8(str, inputStream, storageUploadInputStreamOptions, consumer, consumer2, consumer3);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageDownloadFileResult> downloadFile(final StoragePath storagePath, final File file, final StorageDownloadFileOptions storageDownloadFileOptions) {
        return new RxProgressAwareSingleOperation<>(new RxStorageTransferCallbackMapper() { // from class: com.amplifyframework.rx.d4
            @Override // com.amplifyframework.rx.RxStorageBinding.RxStorageTransferCallbackMapper
            public final StorageTransferOperation emitTo(Consumer consumer, Consumer consumer2, Consumer consumer3) {
                return this.f10849a.lambda$downloadFile$5(storagePath, file, storageDownloadFileOptions, consumer, consumer2, consumer3);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf getUrl(final StoragePath storagePath, final StorageGetUrlOptions storageGetUrlOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.k4
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f10955a.lambda$getUrl$3(storagePath, storageGetUrlOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf list(final StoragePath storagePath, final StoragePagedListOptions storagePagedListOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.v3
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11076a.lambda$list$17(storagePath, storagePagedListOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public wtf remove(final StoragePath storagePath, final StorageRemoveOptions storageRemoveOptions) {
        return toSingle(new RxAdapters.CancelableBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.t3
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.ResultEmitter
            public final Cancelable emitTo(Consumer consumer, Consumer consumer2) {
                return this.f11055a.lambda$remove$13(storagePath, storageRemoveOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadFileResult> uploadFile(final StoragePath storagePath, final File file, final StorageUploadFileOptions storageUploadFileOptions) {
        return new RxProgressAwareSingleOperation<>(new RxStorageTransferCallbackMapper() { // from class: com.amplifyframework.rx.u3
            @Override // com.amplifyframework.rx.RxStorageBinding.RxStorageTransferCallbackMapper
            public final StorageTransferOperation emitTo(Consumer consumer, Consumer consumer2, Consumer consumer3) {
                return this.f11065a.lambda$uploadFile$7(storagePath, file, storageUploadFileOptions, consumer, consumer2, consumer3);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxStorageCategoryBehavior
    public RxProgressAwareSingleOperation<StorageUploadInputStreamResult> uploadInputStream(final StoragePath storagePath, final InputStream inputStream, final StorageUploadInputStreamOptions storageUploadInputStreamOptions) {
        return new RxProgressAwareSingleOperation<>(new RxStorageTransferCallbackMapper() { // from class: com.amplifyframework.rx.a4
            @Override // com.amplifyframework.rx.RxStorageBinding.RxStorageTransferCallbackMapper
            public final StorageTransferOperation emitTo(Consumer consumer, Consumer consumer2, Consumer consumer3) {
                return this.f10810a.lambda$uploadInputStream$9(storagePath, inputStream, storageUploadInputStreamOptions, consumer, consumer2, consumer3);
            }
        });
    }
}
