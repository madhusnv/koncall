package com.amplifyframework.storage.s3;

import al.C0182j;
import c9.C0922q;
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
import d9.C1664i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import qw.C6361k;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import t8.C7059e;
import t8.C7062h;
import t8.C7064j;
import t8.C7079y;
import t8.EnumC7068n;
import t8.EnumC7078x;
import t8.g0;
import u8.C7365m;
import u8.C7368p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferOperations {
    public static final TransferOperations INSTANCE = new TransferOperations();

    private TransferOperations() {
    }

    private final C7079y completeRequest(TransferRecord transferRecord, String str, TransferStatusUpdater transferStatusUpdater) {
        C6361k[] c6361kArr = {new C6361k("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), new C6361k(RouterWorker.WORKER_CLASS_NAME, CompleteMultiPartUploadWorker.class.getName()), new C6361k("WORKER_ID", str)};
        C7062h c7062h = new C7062h(0);
        for (int i10 = 0; i10 < 3; i10++) {
            C6361k c6361k = c6361kArr[i10];
            c7062h.m13359b((String) c6361k.f30755a, c6361k.f30756b);
        }
        C7079y oneTimeWorkRequest = getOneTimeWorkRequest(transferRecord, c7062h.m13358a(), pe.m10834i(String.valueOf(transferRecord.getId()), str, String.format("COMPLETION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{String.valueOf(transferRecord.getId())}, 1))));
        String string = oneTimeWorkRequest.f34177a.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        transferStatusUpdater.addWorkRequest(string, transferRecord.getId(), true);
        return oneTimeWorkRequest;
    }

    private final void enqueueMultiPartUpload(TransferRecord transferRecord, String str, g0 g0Var, TransferWorkerObserver transferWorkerObserver, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) {
        if (transferRecord.getMultipartId() != null) {
            TransferOperations transferOperations = INSTANCE;
            List<C7079y> listPendingParts = transferOperations.pendingParts(transferRecord, str, transferDB);
            if (listPendingParts.size() > 0) {
                String strValueOf = String.valueOf(transferRecord.getId());
                EnumC7068n enumC7068n = EnumC7068n.KEEP;
                C7368p c7368p = (C7368p) g0Var;
                c7368p.getClass();
                if (listPendingParts.isEmpty()) {
                    throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
                }
                C7365m c7365m = new C7365m(c7368p, strValueOf, enumC7068n, listPendingParts, null);
                List listSingletonList = Collections.singletonList(transferOperations.completeRequest(transferRecord, str, transferStatusUpdater));
                if (!listSingletonList.isEmpty()) {
                    c7365m = new C7365m(c7368p, strValueOf, enumC7068n, listSingletonList, Collections.singletonList(c7365m));
                }
                c7365m.m13782c();
            } else {
                g0Var.m13355c(String.valueOf(transferRecord.getId()), EnumC7068n.KEEP, transferOperations.completeRequest(transferRecord, str, transferStatusUpdater));
            }
            transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.IN_PROGRESS);
            return;
        }
        String uniqueWorkName = String.valueOf(transferRecord.getId());
        EnumC7068n existingWorkPolicy = EnumC7068n.KEEP;
        C7079y request = initiateRequest(transferRecord, str, transferStatusUpdater);
        g0Var.getClass();
        AbstractC4154l.m8923f(uniqueWorkName, "uniqueWorkName");
        AbstractC4154l.m8923f(existingWorkPolicy, "existingWorkPolicy");
        AbstractC4154l.m8923f(request, "request");
        List listM10833h = pe.m10833h(request);
        C7368p c7368p2 = (C7368p) g0Var;
        if (listM10833h.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        C7365m c7365m2 = new C7365m(c7368p2, uniqueWorkName, existingWorkPolicy, listM10833h, null);
        List<C7079y> listPendingParts2 = pendingParts(transferRecord, str, transferDB);
        if (!listPendingParts2.isEmpty()) {
            c7365m2 = new C7365m(c7368p2, uniqueWorkName, existingWorkPolicy, listPendingParts2, Collections.singletonList(c7365m2));
        }
        List listSingletonList2 = Collections.singletonList(completeRequest(transferRecord, str, transferStatusUpdater));
        if (!listSingletonList2.isEmpty()) {
            c7365m2 = new C7365m(c7365m2.f35029b, c7365m2.f35030c, existingWorkPolicy, listSingletonList2, Collections.singletonList(c7365m2));
        }
        c7365m2.m13782c();
        transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.WAITING);
    }

    private final void enqueueTransfer(TransferRecord transferRecord, String str, g0 g0Var, TransferWorkerObserver transferWorkerObserver, TransferStatusUpdater transferStatusUpdater) {
        TransferType type = transferRecord.getType();
        if (type == null) {
            throw new IllegalStateException("Transfer type missing");
        }
        C6361k[] c6361kArr = {new C6361k("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), new C6361k(RouterWorker.WORKER_CLASS_NAME, type == TransferType.UPLOAD ? SinglePartUploadWorker.class.getName() : DownloadWorker.class.getName()), new C6361k("WORKER_ID", str)};
        C7062h c7062h = new C7062h(0);
        for (int i10 = 0; i10 < 3; i10++) {
            C6361k c6361k = c6361kArr[i10];
            c7062h.m13359b((String) c6361k.f30755a, c6361k.f30756b);
        }
        C7079y oneTimeWorkRequest = getOneTimeWorkRequest(transferRecord, c7062h.m13358a(), pe.m10834i(str, String.valueOf(transferRecord.getId())));
        g0Var.m13355c(String.valueOf(transferRecord.getId()), EnumC7068n.KEEP, oneTimeWorkRequest);
        String string = oneTimeWorkRequest.f34177a.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        transferStatusUpdater.addWorkRequest(string, transferRecord.getId(), false);
    }

    private final C7079y getOneTimeWorkRequest(TransferRecord transferRecord, C7064j c7064j, List<String> list) {
        TransferType type = transferRecord.getType();
        if (type == null) {
            throw new IllegalStateException("Transfer type missing");
        }
        C0182j c0182j = new C0182j(RouterWorker.class);
        c0182j.m425p(c7064j);
        EnumC7078x enumC7078x = EnumC7078x.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EnumC7078x networkType = EnumC7078x.CONNECTED;
        AbstractC4154l.m8923f(networkType, "networkType");
        ((C0922q) c0182j.f556c).f5631j = new C7059e(new C1664i(null), networkType, false, false, false, false, -1L, -1L, AbstractC6663m.g0(linkedHashSet));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            c0182j.m410a((String) it.next());
        }
        if (transferRecord.isMultipart() == 1) {
            c0182j.m410a("MULTIPART_UPLOAD");
        }
        c0182j.m410a(type.name());
        return c0182j.m411b();
    }

    private final C7079y initiateRequest(TransferRecord transferRecord, String str, TransferStatusUpdater transferStatusUpdater) {
        C6361k[] c6361kArr = {new C6361k("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), new C6361k(RouterWorker.WORKER_CLASS_NAME, InitiateMultiPartUploadTransferWorker.class.getName()), new C6361k("WORKER_ID", str)};
        C7062h c7062h = new C7062h(0);
        for (int i10 = 0; i10 < 3; i10++) {
            C6361k c6361k = c6361kArr[i10];
            c7062h.m13359b((String) c6361k.f30755a, c6361k.f30756b);
        }
        C7079y oneTimeWorkRequest = getOneTimeWorkRequest(transferRecord, c7062h.m13358a(), pe.m10834i(String.valueOf(transferRecord.getId()), String.format("INITIATION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{String.valueOf(transferRecord.getId())}, 1)), str));
        String string = oneTimeWorkRequest.f34177a.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        transferStatusUpdater.addWorkRequest(string, transferRecord.getId(), true);
        return oneTimeWorkRequest;
    }

    private final List<C7079y> pendingParts(TransferRecord transferRecord, String str, TransferDB transferDB) {
        List<Integer> nonCompletedPartRequestsFromDB = transferDB.getNonCompletedPartRequestsFromDB(transferRecord.getId());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = nonCompletedPartRequestsFromDB.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            TransferOperations transferOperations = INSTANCE;
            C6361k[] c6361kArr = {new C6361k("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), new C6361k("PART_RECORD_ID", Integer.valueOf(iIntValue)), new C6361k("multipartUploadId", transferRecord.getMultipartId()), new C6361k(RouterWorker.WORKER_CLASS_NAME, PartUploadTransferWorker.class.getName()), new C6361k("WORKER_ID", str)};
            C7062h c7062h = new C7062h(0);
            for (int i10 = 0; i10 < 5; i10++) {
                C6361k c6361k = c6361kArr[i10];
                c7062h.m13359b((String) c6361k.f30755a, c6361k.f30756b);
            }
            arrayList.add(transferOperations.getOneTimeWorkRequest(transferRecord, c7062h.m13358a(), pe.m10834i(String.valueOf(transferRecord.getId()), str, "PartUploadRequest")));
        }
        return arrayList;
    }

    public final void abortMultipartUploadRequest$aws_storage_s3_release(TransferRecord transferRecord, String pluginKey, g0 workManager) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(pluginKey, "pluginKey");
        AbstractC4154l.m8923f(workManager, "workManager");
        C7062h c7062h = new C7062h(0);
        c7062h.m13360c(AbstractC6674x.m12778f(new C6361k("TRANSFER_RECORD_ID", Integer.valueOf(transferRecord.getId())), new C6361k(RouterWorker.WORKER_CLASS_NAME, AbortMultiPartUploadWorker.class.getName()), new C6361k("WORKER_ID", pluginKey)));
        workManager.m13354b(getOneTimeWorkRequest(transferRecord, c7062h.m13358a(), pe.m10834i(String.valueOf(transferRecord.getId()), pluginKey, "AbortMultiPartUploadWorker")));
    }

    public final boolean cancel$aws_storage_s3_release(TransferRecord transferRecord, String pluginKey, TransferStatusUpdater transferStatusUpdater, g0 workManager) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(pluginKey, "pluginKey");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(workManager, "workManager");
        TransferState.Companion companion = TransferState.Companion;
        if (companion.isInTerminalState(transferRecord.getState())) {
            return false;
        }
        TransferState transferState = TransferState.PENDING_CANCEL;
        if (!companion.isPaused(transferRecord.getState())) {
            transferStatusUpdater.updateTransferState(transferRecord.getId(), transferState);
            workManager.mo13353a(String.valueOf(transferRecord.getId()));
            return true;
        }
        if (transferRecord.isMultipart() == 1) {
            abortMultipartUploadRequest$aws_storage_s3_release(transferRecord, pluginKey, workManager);
        } else {
            transferState = TransferState.CANCELED;
        }
        transferStatusUpdater.updateTransferState(transferRecord.getId(), transferState);
        return true;
    }

    public final boolean pause$aws_storage_s3_release(TransferRecord transferRecord, TransferStatusUpdater transferStatusUpdater, g0 workManager) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(workManager, "workManager");
        TransferState.Companion companion = TransferState.Companion;
        if (!companion.isStarted(transferRecord.getState()) || companion.isInTerminalState(transferRecord.getState())) {
            return false;
        }
        transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.PENDING_PAUSE);
        workManager.mo13353a(String.valueOf(transferRecord.getId()));
        return true;
    }

    public final boolean resume$aws_storage_s3_release(TransferRecord transferRecord, String pluginKey, TransferStatusUpdater transferStatusUpdater, g0 workManager, TransferWorkerObserver workerObserver, TransferDB transferDB) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(pluginKey, "pluginKey");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(workManager, "workManager");
        AbstractC4154l.m8923f(workerObserver, "workerObserver");
        AbstractC4154l.m8923f(transferDB, "transferDB");
        TransferState.Companion companion = TransferState.Companion;
        if (companion.isStarted(transferRecord.getState()) || companion.isInTerminalState(transferRecord.getState())) {
            return false;
        }
        start$aws_storage_s3_release(transferRecord, pluginKey, transferStatusUpdater, workManager, workerObserver, transferDB, null);
        if (transferRecord.isMultipart() != 0) {
            return true;
        }
        transferStatusUpdater.updateTransferState(transferRecord.getId(), TransferState.RESUMED_WAITING);
        return true;
    }

    public final TransferObserver start$aws_storage_s3_release(TransferRecord transferRecord, String pluginKey, TransferStatusUpdater transferStatusUpdater, g0 workManager, TransferWorkerObserver workerObserver, TransferDB transferDB, TransferListener transferListener) {
        AbstractC4154l.m8923f(transferRecord, "transferRecord");
        AbstractC4154l.m8923f(pluginKey, "pluginKey");
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(workManager, "workManager");
        AbstractC4154l.m8923f(workerObserver, "workerObserver");
        AbstractC4154l.m8923f(transferDB, "transferDB");
        if (transferRecord.isMultipart() == 1) {
            enqueueMultiPartUpload(transferRecord, pluginKey, workManager, workerObserver, transferStatusUpdater, transferDB);
            transferStatusUpdater.registerMultiPartTransferListener(transferRecord.getId(), new MultiPartUploadTaskListener(transferRecord, transferDB, transferStatusUpdater));
        } else {
            enqueueTransfer(transferRecord, pluginKey, workManager, workerObserver, transferStatusUpdater);
        }
        return new TransferObserver(transferRecord.getId(), transferStatusUpdater, transferRecord.getBucketName(), transferRecord.getRegion(), transferRecord.getKey(), transferRecord.getFile(), transferListener, null, 128, null);
    }
}
