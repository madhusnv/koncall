package com.amplifyframework.storage.s3;

import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.transfer.MultiPartUploadTaskListener;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferListener;
import com.amplifyframework.storage.s3.transfer.TransferObserver;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.storage.s3.transfer.TransferType;
import com.amplifyframework.storage.s3.transfer.TransferWorkerObserver;
import com.amplifyframework.storage.s3.transfer.worker.AbortMultiPartUploadWorker;
import com.amplifyframework.storage.s3.transfer.worker.CompleteMultiPartUploadWorker;
import com.amplifyframework.storage.s3.transfer.worker.DownloadWorker;
import com.amplifyframework.storage.s3.transfer.worker.InitiateMultiPartUploadTransferWorker;
import com.amplifyframework.storage.s3.transfer.worker.PartUploadTransferWorker;
import com.amplifyframework.storage.s3.transfer.worker.RouterWorker;
import com.amplifyframework.storage.s3.transfer.worker.SinglePartUploadWorker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001o.ch3;
import p001o.hwc;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class TransferOperations {
    public static final TransferOperations INSTANCE = new TransferOperations();

    private TransferOperations() {
    }

    private final OneTimeWorkRequest completeRequest(TransferRecord transferRecord, String str, TransferStatusUpdater transferStatusUpdater) throws Throwable {
        hwc[] hwcVarArr = {vyh.m53620a("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), vyh.m53620a(RouterWorker.WORKER_CLASS_NAME, CompleteMultiPartUploadWorker.class.getName()), vyh.m53620a("WORKER_ID", str)};
        Data.Builder builder = new Data.Builder();
        int i = 0;
        while (i < 3) {
            hwc hwcVar = hwcVarArr[i];
            i++;
            builder.put((String) hwcVar.m31229c(), hwcVar.m31230d());
        }
        Data dataBuild = builder.build();
        sq8.m48648g(dataBuild, "dataBuilder.build()");
        String strValueOf = String.valueOf(transferRecord.getId());
        String str2 = String.format("COMPLETION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{String.valueOf(transferRecord.getId())}, 1));
        sq8.m48648g(str2, "format(...)");
        OneTimeWorkRequest oneTimeWorkRequest = getOneTimeWorkRequest(transferRecord, dataBuild, ch3.m21249n(strValueOf, str, str2));
        String string = oneTimeWorkRequest.getId().toString();
        sq8.m48648g(string, "toString(...)");
        transferStatusUpdater.addWorkRequest(string, transferRecord.getId(), true);
        return oneTimeWorkRequest;
    }

    private final void enqueueMultiPartUpload(TransferRecord transferRecord, String str, WorkManager workManager, TransferWorkerObserver transferWorkerObserver, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) throws Throwable {
        y3i y3iVar;
        if (transferRecord.getMultipartId() != null) {
            TransferOperations transferOperations = INSTANCE;
            List<OneTimeWorkRequest> listPendingParts = transferOperations.pendingParts(transferRecord, str, transferDB);
            if (listPendingParts.size() > 0) {
                workManager.beginUniqueWork(String.valueOf(transferRecord.getId()), ExistingWorkPolicy.KEEP, listPendingParts).then(transferOperations.completeRequest(transferRecord, str, transferStatusUpdater)).enqueue();
            } else {
                workManager.enqueueUniqueWork(String.valueOf(transferRecord.getId()), ExistingWorkPolicy.KEEP, transferOperations.completeRequest(transferRecord, str, transferStatusUpdater));
            }
            transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.IN_PROGRESS);
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            workManager.beginUniqueWork(String.valueOf(transferRecord.getId()), ExistingWorkPolicy.KEEP, initiateRequest(transferRecord, str, transferStatusUpdater)).then(pendingParts(transferRecord, str, transferDB)).then(completeRequest(transferRecord, str, transferStatusUpdater)).enqueue();
            transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.WAITING);
        }
    }

    private final void enqueueTransfer(TransferRecord transferRecord, String str, WorkManager workManager, TransferWorkerObserver transferWorkerObserver, TransferStatusUpdater transferStatusUpdater) throws Throwable {
        TransferType type2 = transferRecord.getType();
        if (type2 == null) {
            throw new IllegalStateException("Transfer type missing");
        }
        hwc[] hwcVarArr = {vyh.m53620a("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), vyh.m53620a(RouterWorker.WORKER_CLASS_NAME, type2 == TransferType.UPLOAD ? SinglePartUploadWorker.class.getName() : DownloadWorker.class.getName()), vyh.m53620a("WORKER_ID", str)};
        Data.Builder builder = new Data.Builder();
        int i = 0;
        while (i < 3) {
            hwc hwcVar = hwcVarArr[i];
            i++;
            builder.put((String) hwcVar.m31229c(), hwcVar.m31230d());
        }
        Data dataBuild = builder.build();
        sq8.m48648g(dataBuild, "dataBuilder.build()");
        OneTimeWorkRequest oneTimeWorkRequest = getOneTimeWorkRequest(transferRecord, dataBuild, ch3.m21249n(str, String.valueOf(transferRecord.getId())));
        workManager.enqueueUniqueWork(String.valueOf(transferRecord.getId()), ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
        String string = oneTimeWorkRequest.getId().toString();
        sq8.m48648g(string, "toString(...)");
        transferStatusUpdater.addWorkRequest(string, transferRecord.getId(), false);
    }

    private final OneTimeWorkRequest getOneTimeWorkRequest(TransferRecord transferRecord, Data data, List<String> list) {
        TransferType type2 = transferRecord.getType();
        if (type2 == null) {
            throw new IllegalStateException("Transfer type missing");
        }
        OneTimeWorkRequest.Builder constraints = new OneTimeWorkRequest.Builder(RouterWorker.class).setInputData(data).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            constraints.addTag((String) it.next());
        }
        if (transferRecord.isMultipart() == 1) {
            constraints.addTag("MULTIPART_UPLOAD");
        }
        OneTimeWorkRequest oneTimeWorkRequestBuild = constraints.addTag(type2.name()).build();
        sq8.m48648g(oneTimeWorkRequestBuild, "build(...)");
        return oneTimeWorkRequestBuild;
    }

    private final OneTimeWorkRequest initiateRequest(TransferRecord transferRecord, String str, TransferStatusUpdater transferStatusUpdater) throws Throwable {
        hwc[] hwcVarArr = {vyh.m53620a("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), vyh.m53620a(RouterWorker.WORKER_CLASS_NAME, InitiateMultiPartUploadTransferWorker.class.getName()), vyh.m53620a("WORKER_ID", str)};
        Data.Builder builder = new Data.Builder();
        int i = 0;
        while (i < 3) {
            hwc hwcVar = hwcVarArr[i];
            i++;
            builder.put((String) hwcVar.m31229c(), hwcVar.m31230d());
        }
        Data dataBuild = builder.build();
        sq8.m48648g(dataBuild, "dataBuilder.build()");
        String strValueOf = String.valueOf(transferRecord.getId());
        String str2 = String.format("INITIATION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{String.valueOf(transferRecord.getId())}, 1));
        sq8.m48648g(str2, "format(...)");
        OneTimeWorkRequest oneTimeWorkRequest = getOneTimeWorkRequest(transferRecord, dataBuild, ch3.m21249n(strValueOf, str2, str));
        String string = oneTimeWorkRequest.getId().toString();
        sq8.m48648g(string, "toString(...)");
        transferStatusUpdater.addWorkRequest(string, transferRecord.getId(), true);
        return oneTimeWorkRequest;
    }

    private final List<OneTimeWorkRequest> pendingParts(TransferRecord transferRecord, String str, TransferDB transferDB) throws Throwable {
        List<Integer> nonCompletedPartRequestsFromDB = transferDB.getNonCompletedPartRequestsFromDB(transferRecord.getId());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = nonCompletedPartRequestsFromDB.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            TransferOperations transferOperations = INSTANCE;
            hwc[] hwcVarArr = {vyh.m53620a("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), vyh.m53620a("PART_RECORD_ID", Integer.valueOf(iIntValue)), vyh.m53620a("multipartUploadId", transferRecord.getMultipartId()), vyh.m53620a(RouterWorker.WORKER_CLASS_NAME, PartUploadTransferWorker.class.getName()), vyh.m53620a("WORKER_ID", str)};
            Data.Builder builder = new Data.Builder();
            int i = 0;
            while (i < 5) {
                hwc hwcVar = hwcVarArr[i];
                i++;
                builder.put((String) hwcVar.m31229c(), hwcVar.m31230d());
            }
            Data dataBuild = builder.build();
            sq8.m48648g(dataBuild, "dataBuilder.build()");
            arrayList.add(transferOperations.getOneTimeWorkRequest(transferRecord, dataBuild, ch3.m21249n(String.valueOf(transferRecord.getId()), str, "PartUploadRequest")));
        }
        return arrayList;
    }

    public final void abortMultipartUploadRequest$aws_storage_s3_release(TransferRecord transferRecord, String str, WorkManager workManager) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(str, "pluginKey");
        sq8.m48649h(workManager, "workManager");
        Data dataBuild = new Data.Builder().putAll(isa.m32684k(vyh.m53620a("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), vyh.m53620a(RouterWorker.WORKER_CLASS_NAME, AbortMultiPartUploadWorker.class.getName()), vyh.m53620a("WORKER_ID", str))).build();
        sq8.m48648g(dataBuild, "build(...)");
        workManager.enqueue(getOneTimeWorkRequest(transferRecord, dataBuild, ch3.m21249n(String.valueOf(transferRecord.getId()), str, AbortMultiPartUploadWorker.class.getSimpleName())));
    }

    public final boolean cancel$aws_storage_s3_release(TransferRecord transferRecord, String str, TransferStatusUpdater transferStatusUpdater, WorkManager workManager) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(str, "pluginKey");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(workManager, "workManager");
        TransferState.Companion companion = TransferState.Companion;
        if (companion.isInTerminalState(transferRecord.getState())) {
            return false;
        }
        TransferState transferState = TransferState.PENDING_CANCEL;
        if (companion.isPaused(transferRecord.getState())) {
            if (transferRecord.isMultipart() == 1) {
                abortMultipartUploadRequest$aws_storage_s3_release(transferRecord, str, workManager);
            } else {
                transferState = TransferState.CANCELED;
            }
            transferStatusUpdater.updateTransferState(transferRecord.getId(), transferState);
        } else {
            transferStatusUpdater.updateTransferState(transferRecord.getId(), transferState);
            workManager.cancelUniqueWork(String.valueOf(transferRecord.getId()));
        }
        return true;
    }

    public final boolean pause$aws_storage_s3_release(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater, WorkManager workManager) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(workManager, "workManager");
        TransferState.Companion companion = TransferState.Companion;
        if (!companion.isStarted(transferRecord.getState()) || companion.isInTerminalState(transferRecord.getState())) {
            return false;
        }
        transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.PENDING_PAUSE);
        workManager.cancelUniqueWork(String.valueOf(transferRecord.getId()));
        return true;
    }

    public final boolean resume$aws_storage_s3_release(TransferRecord transferRecord, String str, TransferStatusUpdater transferStatusUpdater, WorkManager workManager, TransferWorkerObserver transferWorkerObserver, TransferDB transferDB) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(str, "pluginKey");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(workManager, "workManager");
        sq8.m48649h(transferWorkerObserver, "workerObserver");
        sq8.m48649h(transferDB, "transferDB");
        TransferState.Companion companion = TransferState.Companion;
        if (companion.isStarted(transferRecord.getState()) || companion.isInTerminalState(transferRecord.getState())) {
            return false;
        }
        start$aws_storage_s3_release(transferRecord, str, transferStatusUpdater, workManager, transferWorkerObserver, transferDB, null);
        if (transferRecord.isMultipart() != 0) {
            return true;
        }
        transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.RESUMED_WAITING);
        return true;
    }

    public final TransferObserver start$aws_storage_s3_release(TransferRecord transferRecord, String str, TransferStatusUpdater transferStatusUpdater, WorkManager workManager, TransferWorkerObserver transferWorkerObserver, TransferDB transferDB, TransferListener transferListener) {
        sq8.m48649h(transferRecord, "transferRecord");
        sq8.m48649h(str, "pluginKey");
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(workManager, "workManager");
        sq8.m48649h(transferWorkerObserver, "workerObserver");
        sq8.m48649h(transferDB, "transferDB");
        if (transferRecord.isMultipart() == 1) {
            enqueueMultiPartUpload(transferRecord, str, workManager, transferWorkerObserver, transferStatusUpdater, transferDB);
            transferStatusUpdater.registerMultiPartTransferListener(transferRecord.getId(), new MultiPartUploadTaskListener(transferRecord, transferDB, transferStatusUpdater));
        } else {
            enqueueTransfer(transferRecord, str, workManager, transferWorkerObserver, transferStatusUpdater);
        }
        return new TransferObserver(transferRecord.getId(), transferStatusUpdater, transferRecord.getBucketName(), transferRecord.getRegion(), transferRecord.getKey(), transferRecord.getFile(), transferListener, null, 128, null);
    }
}
