package com.amplifyframework.kotlin.storage;

import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.async.Resumable;
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
import com.amplifyframework.storage.result.StorageTransferResult;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import f9.C2222e;
import java.io.File;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6353c;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;
import wx.C8219t;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Storage {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class InProgressStorageOperation<T> implements Cancelable, Resumable {
        private final StorageTransferOperation<?, ?> delegate;
        private final InterfaceC8209j errors;
        private final InterfaceC8209j progress;
        private final InterfaceC8209j results;
        private final String transferId;

        public InProgressStorageOperation(String transferId, InterfaceC8209j results, InterfaceC8209j progress, InterfaceC8209j errors, StorageTransferOperation<?, ?> storageTransferOperation) {
            AbstractC4154l.m8923f(transferId, "transferId");
            AbstractC4154l.m8923f(results, "results");
            AbstractC4154l.m8923f(progress, "progress");
            AbstractC4154l.m8923f(errors, "errors");
            this.transferId = transferId;
            this.results = results;
            this.progress = progress;
            this.errors = errors;
            this.delegate = storageTransferOperation;
        }

        private final InterfaceC8209j component2() {
            return this.results;
        }

        private final InterfaceC8209j component3() {
            return this.progress;
        }

        private final InterfaceC8209j component4() {
            return this.errors;
        }

        private final StorageTransferOperation<?, ?> component5() {
            return this.delegate;
        }

        public static /* synthetic */ InProgressStorageOperation copy$default(InProgressStorageOperation inProgressStorageOperation, String str, InterfaceC8209j interfaceC8209j, InterfaceC8209j interfaceC8209j2, InterfaceC8209j interfaceC8209j3, StorageTransferOperation storageTransferOperation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inProgressStorageOperation.transferId;
            }
            if ((i10 & 2) != 0) {
                interfaceC8209j = inProgressStorageOperation.results;
            }
            if ((i10 & 4) != 0) {
                interfaceC8209j2 = inProgressStorageOperation.progress;
            }
            if ((i10 & 8) != 0) {
                interfaceC8209j3 = inProgressStorageOperation.errors;
            }
            if ((i10 & 16) != 0) {
                storageTransferOperation = inProgressStorageOperation.delegate;
            }
            StorageTransferOperation storageTransferOperation2 = storageTransferOperation;
            InterfaceC8209j interfaceC8209j4 = interfaceC8209j2;
            return inProgressStorageOperation.copy(str, interfaceC8209j, interfaceC8209j4, interfaceC8209j3, storageTransferOperation2);
        }

        @Override // com.amplifyframework.core.async.Cancelable
        public void cancel() {
            StorageTransferOperation<?, ?> storageTransferOperation = this.delegate;
            if (storageTransferOperation != null) {
                storageTransferOperation.cancel();
            }
        }

        public final String component1() {
            return this.transferId;
        }

        public final InProgressStorageOperation<T> copy(String transferId, InterfaceC8209j results, InterfaceC8209j progress, InterfaceC8209j errors, StorageTransferOperation<?, ?> storageTransferOperation) {
            AbstractC4154l.m8923f(transferId, "transferId");
            AbstractC4154l.m8923f(results, "results");
            AbstractC4154l.m8923f(progress, "progress");
            AbstractC4154l.m8923f(errors, "errors");
            return new InProgressStorageOperation<>(transferId, results, progress, errors, storageTransferOperation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InProgressStorageOperation)) {
                return false;
            }
            InProgressStorageOperation inProgressStorageOperation = (InProgressStorageOperation) obj;
            return AbstractC4154l.m8918a(this.transferId, inProgressStorageOperation.transferId) && AbstractC4154l.m8918a(this.results, inProgressStorageOperation.results) && AbstractC4154l.m8918a(this.progress, inProgressStorageOperation.progress) && AbstractC4154l.m8918a(this.errors, inProgressStorageOperation.errors) && AbstractC4154l.m8918a(this.delegate, inProgressStorageOperation.delegate);
        }

        public final String getTransferId() {
            return this.transferId;
        }

        public int hashCode() {
            int iHashCode = (this.errors.hashCode() + ((this.progress.hashCode() + ((this.results.hashCode() + (this.transferId.hashCode() * 31)) * 31)) * 31)) * 31;
            StorageTransferOperation<?, ?> storageTransferOperation = this.delegate;
            return iHashCode + (storageTransferOperation == null ? 0 : storageTransferOperation.hashCode());
        }

        @Override // com.amplifyframework.core.async.Resumable
        public void pause() {
            StorageTransferOperation<?, ?> storageTransferOperation = this.delegate;
            if (storageTransferOperation != null) {
                storageTransferOperation.pause();
            }
        }

        public final InterfaceC8209j progress() {
            return this.progress;
        }

        public final Object result(InterfaceC7559c<? super T> interfaceC7559c) {
            final C8219t c8219t = new C8219t(c1.m15387r(new C2222e(2, new InterfaceC8209j[]{this.errors, this.results})), new Storage$InProgressStorageOperation$result$2(null), 4);
            return c1.m15385p(new InterfaceC8209j() { // from class: com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1

                /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
                /* renamed from: com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1$2 */
                public static final class C12172<T> implements InterfaceC8210k {
                    final /* synthetic */ InterfaceC8210k $this_unsafeFlow;

                    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
                    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1$2", m15344f = "Storage.kt", m15345l = {223}, m15346m = "emit")
                    /* renamed from: com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends AbstractC8193c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC7559c interfaceC7559c) {
                            super(interfaceC7559c);
                        }

                        @Override // ww.AbstractC8191a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C12172.this.emit(null, this);
                        }
                    }

                    public C12172(InterfaceC8210k interfaceC8210k) {
                        this.$this_unsafeFlow = interfaceC8210k;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // wx.InterfaceC8210k
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, uw.InterfaceC7559c r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1.C12172.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1$2$1 r0 = (com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1.C12172.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1$2$1 r0 = new com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L37
                            if (r2 != r3) goto L2f
                            java.lang.Object r5 = r0.L$3
                            wx.k r5 = (wx.InterfaceC8210k) r5
                            java.lang.Object r5 = r0.L$1
                            com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1$2$1 r5 = (com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1.C12172.AnonymousClass1) r5
                            og.od.m10798c(r6)
                            goto L51
                        L2f:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L37:
                            og.od.m10798c(r6)
                            wx.k r6 = r4.$this_unsafeFlow
                            r2 = 0
                            r0.L$0 = r2
                            r0.L$1 = r2
                            r0.L$2 = r2
                            r0.L$3 = r2
                            r2 = 0
                            r0.I$0 = r2
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L51
                            return r1
                        L51:
                            qw.a0 r5 = qw.a0.f30746a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$$inlined$map$1.C12172.emit(java.lang.Object, uw.c):java.lang.Object");
                    }
                }

                @Override // wx.InterfaceC8209j
                public Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c2) {
                    Object objCollect = c8219t.collect(new C12172(interfaceC8210k), interfaceC7559c2);
                    return objCollect == EnumC7794a.COROUTINE_SUSPENDED ? objCollect : a0.f30746a;
                }
            }, interfaceC7559c);
        }

        @Override // com.amplifyframework.core.async.Resumable
        public void resume() {
            StorageTransferOperation<?, ?> storageTransferOperation = this.delegate;
            if (storageTransferOperation != null) {
                storageTransferOperation.resume();
            }
        }

        public String toString() {
            return "InProgressStorageOperation(transferId=" + this.transferId + ", results=" + this.results + ", progress=" + this.progress + ", errors=" + this.errors + ", delegate=" + this.delegate + ")";
        }
    }

    static /* synthetic */ InProgressStorageOperation downloadFile$default(Storage storage, String str, File file, StorageDownloadFileOptions storageDownloadFileOptions, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadFile");
        }
        if ((i10 & 4) != 0) {
            storageDownloadFileOptions = StorageDownloadFileOptions.defaultInstance();
            AbstractC4154l.m8922e(storageDownloadFileOptions, "defaultInstance(...)");
        }
        return storage.downloadFile(str, file, storageDownloadFileOptions);
    }

    static /* synthetic */ Object getUrl$default(Storage storage, String str, StorageGetUrlOptions storageGetUrlOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUrl");
        }
        if ((i10 & 2) != 0) {
            storageGetUrlOptions = StorageGetUrlOptions.defaultInstance();
            AbstractC4154l.m8922e(storageGetUrlOptions, "defaultInstance(...)");
        }
        return storage.getUrl(str, storageGetUrlOptions, (InterfaceC7559c<? super StorageGetUrlResult>) interfaceC7559c);
    }

    static /* synthetic */ Object list$default(Storage storage, String str, StorageListOptions storageListOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: list");
        }
        if ((i10 & 2) != 0) {
            storageListOptions = StorageListOptions.defaultInstance();
            AbstractC4154l.m8922e(storageListOptions, "defaultInstance(...)");
        }
        return storage.list(str, storageListOptions, (InterfaceC7559c<? super StorageListResult>) interfaceC7559c);
    }

    static /* synthetic */ Object remove$default(Storage storage, String str, StorageRemoveOptions storageRemoveOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
        }
        if ((i10 & 2) != 0) {
            storageRemoveOptions = StorageRemoveOptions.defaultInstance();
            AbstractC4154l.m8922e(storageRemoveOptions, "defaultInstance(...)");
        }
        return storage.remove(str, storageRemoveOptions, (InterfaceC7559c<? super StorageRemoveResult>) interfaceC7559c);
    }

    static /* synthetic */ InProgressStorageOperation uploadFile$default(Storage storage, String str, File file, StorageUploadFileOptions storageUploadFileOptions, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFile");
        }
        if ((i10 & 4) != 0) {
            storageUploadFileOptions = StorageUploadFileOptions.defaultInstance();
            AbstractC4154l.m8922e(storageUploadFileOptions, "defaultInstance(...)");
        }
        return storage.uploadFile(str, file, storageUploadFileOptions);
    }

    static /* synthetic */ InProgressStorageOperation uploadInputStream$default(Storage storage, String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadInputStream");
        }
        if ((i10 & 4) != 0) {
            storageUploadInputStreamOptions = StorageUploadInputStreamOptions.defaultInstance();
            AbstractC4154l.m8922e(storageUploadInputStreamOptions, "defaultInstance(...)");
        }
        return storage.uploadInputStream(str, inputStream, storageUploadInputStreamOptions);
    }

    InProgressStorageOperation<StorageDownloadFileResult> downloadFile(StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions);

    @InterfaceC6353c
    InProgressStorageOperation<StorageDownloadFileResult> downloadFile(String str, File file, StorageDownloadFileOptions storageDownloadFileOptions);

    Object getTransfer(String str, InterfaceC7559c<? super StorageTransferOperation<?, StorageTransferResult>> interfaceC7559c);

    Object getUrl(StoragePath storagePath, StorageGetUrlOptions storageGetUrlOptions, InterfaceC7559c<? super StorageGetUrlResult> interfaceC7559c);

    @InterfaceC6353c
    Object getUrl(String str, StorageGetUrlOptions storageGetUrlOptions, InterfaceC7559c<? super StorageGetUrlResult> interfaceC7559c);

    Object list(StoragePath storagePath, StoragePagedListOptions storagePagedListOptions, InterfaceC7559c<? super StorageListResult> interfaceC7559c);

    @InterfaceC6353c
    Object list(String str, StorageListOptions storageListOptions, InterfaceC7559c<? super StorageListResult> interfaceC7559c);

    @InterfaceC6353c
    Object list(String str, StoragePagedListOptions storagePagedListOptions, InterfaceC7559c<? super StorageListResult> interfaceC7559c);

    Object remove(StoragePath storagePath, StorageRemoveOptions storageRemoveOptions, InterfaceC7559c<? super StorageRemoveResult> interfaceC7559c);

    @InterfaceC6353c
    Object remove(String str, StorageRemoveOptions storageRemoveOptions, InterfaceC7559c<? super StorageRemoveResult> interfaceC7559c);

    InProgressStorageOperation<StorageUploadFileResult> uploadFile(StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions);

    @InterfaceC6353c
    InProgressStorageOperation<StorageUploadFileResult> uploadFile(String str, File file, StorageUploadFileOptions storageUploadFileOptions);

    InProgressStorageOperation<StorageUploadInputStreamResult> uploadInputStream(StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions);

    @InterfaceC6353c
    InProgressStorageOperation<StorageUploadInputStreamResult> uploadInputStream(String str, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions);

    static /* synthetic */ InProgressStorageOperation downloadFile$default(Storage storage, StoragePath storagePath, File file, StorageDownloadFileOptions storageDownloadFileOptions, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadFile");
        }
        if ((i10 & 4) != 0) {
            storageDownloadFileOptions = StorageDownloadFileOptions.defaultInstance();
            AbstractC4154l.m8922e(storageDownloadFileOptions, "defaultInstance(...)");
        }
        return storage.downloadFile(storagePath, file, storageDownloadFileOptions);
    }

    static /* synthetic */ Object getUrl$default(Storage storage, StoragePath storagePath, StorageGetUrlOptions storageGetUrlOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUrl");
        }
        if ((i10 & 2) != 0) {
            storageGetUrlOptions = StorageGetUrlOptions.defaultInstance();
            AbstractC4154l.m8922e(storageGetUrlOptions, "defaultInstance(...)");
        }
        return storage.getUrl(storagePath, storageGetUrlOptions, (InterfaceC7559c<? super StorageGetUrlResult>) interfaceC7559c);
    }

    static /* synthetic */ Object remove$default(Storage storage, StoragePath storagePath, StorageRemoveOptions storageRemoveOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
        }
        if ((i10 & 2) != 0) {
            storageRemoveOptions = StorageRemoveOptions.defaultInstance();
            AbstractC4154l.m8922e(storageRemoveOptions, "defaultInstance(...)");
        }
        return storage.remove(storagePath, storageRemoveOptions, (InterfaceC7559c<? super StorageRemoveResult>) interfaceC7559c);
    }

    static /* synthetic */ InProgressStorageOperation uploadFile$default(Storage storage, StoragePath storagePath, File file, StorageUploadFileOptions storageUploadFileOptions, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFile");
        }
        if ((i10 & 4) != 0) {
            storageUploadFileOptions = StorageUploadFileOptions.defaultInstance();
            AbstractC4154l.m8922e(storageUploadFileOptions, "defaultInstance(...)");
        }
        return storage.uploadFile(storagePath, file, storageUploadFileOptions);
    }

    static /* synthetic */ InProgressStorageOperation uploadInputStream$default(Storage storage, StoragePath storagePath, InputStream inputStream, StorageUploadInputStreamOptions storageUploadInputStreamOptions, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadInputStream");
        }
        if ((i10 & 4) != 0) {
            storageUploadInputStreamOptions = StorageUploadInputStreamOptions.defaultInstance();
            AbstractC4154l.m8922e(storageUploadInputStreamOptions, "defaultInstance(...)");
        }
        return storage.uploadInputStream(storagePath, inputStream, storageUploadInputStreamOptions);
    }
}
