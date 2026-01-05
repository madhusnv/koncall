package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.transfer.ProgressListener;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import java.net.SocketException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import mb.z1;
import t8.AbstractC7075u;
import t8.C7064j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class BlockingTransferWorker extends Worker implements BaseTransferWorker {
    private final Logger logger;
    private int maxRetryCount;
    public C7064j outputData;
    private final TransferDB transferDB;
    public TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingTransferWorker(TransferStatusUpdater transferStatusUpdater, TransferDB transferDB, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
        AbstractC4154l.m8923f(transferDB, "transferDB");
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(workerParameters, "workerParameters");
        this.transferStatusUpdater = transferStatusUpdater;
        this.transferDB = transferDB;
        Logger logger = Amplify.Logging.logger(CategoryType.STORAGE, String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{getClass().getSimpleName()}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        this.logger = logger;
    }

    private final boolean isRetryableError(Throwable th2) {
        Context applicationContext = getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "getApplicationContext(...)");
        return !isNetworkAvailable(applicationContext) || getRunAttemptCount() < getMaxRetryCount$aws_storage_s3_release() || (th2 instanceof SocketException);
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker
    public z1 createPutObjectRequest(TransferRecord transferRecord, ProgressListener progressListener) {
        return super.createPutObjectRequest(transferRecord, progressListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r0 == null) goto L17;
     */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t8.AbstractC7075u doWork() {
        /*
            r5 = this;
            t8.j r0 = r5.getInputData()     // Catch: java.lang.Throwable -> L15
            java.util.Map r0 = r0.m13366c()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "PART_RECORD_ID"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L15
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            goto L85
        L17:
            r0 = 0
        L18:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            java.lang.String r2 = "TRANSFER_RECORD_ID"
            if (r0 == 0) goto L23
        L1e:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L15
            goto L35
        L23:
            t8.j r0 = r5.getInputData()     // Catch: java.lang.Throwable -> L15
            java.util.Map r0 = r0.m13366c()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.AbstractC4154l.m8921d(r0, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L15
            goto L1e
        L35:
            java.lang.String r3 = "OUTPUT_TRANSFER_RECORD_ID"
            t8.j r4 = r5.getInputData()     // Catch: java.lang.Throwable -> L15
            java.util.Map r4 = r4.m13366c()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.AbstractC4154l.m8921d(r2, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L15
            qw.k r1 = new qw.k     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L15
            qw.k[] r1 = new qw.C6361k[]{r1}     // Catch: java.lang.Throwable -> L15
            t8.h r2 = new t8.h     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r1.f30755a     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.f30756b     // Catch: java.lang.Throwable -> L15
            r2.m13359b(r3, r1)     // Catch: java.lang.Throwable -> L15
            t8.j r1 = r2.m13358a()     // Catch: java.lang.Throwable -> L15
            r5.setOutputData$aws_storage_s3_release(r1)     // Catch: java.lang.Throwable -> L15
            com.amplifyframework.storage.s3.transfer.TransferDB r1 = r5.transferDB     // Catch: java.lang.Throwable -> L15
            com.amplifyframework.storage.s3.transfer.TransferRecord r0 = r1.getTransferRecordById(r0)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L7b
            r5.setTransferRecord$aws_storage_s3_release(r0)     // Catch: java.lang.Throwable -> L15
            t8.u r0 = r5.performWork()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L89
        L7b:
            t8.j r0 = r5.getOutputData$aws_storage_s3_release()     // Catch: java.lang.Throwable -> L15
            t8.r r1 = new t8.r     // Catch: java.lang.Throwable -> L15
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L85:
            qw.m r0 = og.od.m10796a(r0)
        L89:
            boolean r1 = r0 instanceof qw.C6363m
            if (r1 != 0) goto L93
            og.od.m10798c(r0)
            t8.u r0 = (t8.AbstractC7075u) r0
            goto Lf3
        L93:
            java.lang.Throwable r0 = qw.C6364n.m12363a(r0)
            com.amplifyframework.logging.Logger r1 = r5.logger
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = android.util.Log.getStackTraceString(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " failed with exception: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.error(r2)
            boolean r1 = r5.isRetryableError(r0)
            if (r1 == 0) goto Lc8
            t8.s r0 = new t8.s
            r0.<init>()
            goto Lf3
        Lc8:
            com.amplifyframework.storage.s3.transfer.TransferStatusUpdater r1 = r5.transferStatusUpdater
            com.amplifyframework.storage.s3.transfer.TransferRecord r2 = r5.getTransferRecord$aws_storage_s3_release()
            int r2 = r2.getId()
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>(r0)
            r1.updateOnError(r2, r3)
            com.amplifyframework.storage.s3.transfer.TransferStatusUpdater r0 = r5.transferStatusUpdater
            com.amplifyframework.storage.s3.transfer.TransferRecord r1 = r5.getTransferRecord$aws_storage_s3_release()
            int r1 = r1.getId()
            com.amplifyframework.storage.TransferState r2 = com.amplifyframework.storage.TransferState.FAILED
            r0.updateTransferState(r1, r2)
            t8.j r0 = r5.getOutputData$aws_storage_s3_release()
            t8.r r1 = new t8.r
            r1.<init>(r0)
            r0 = r1
        Lf3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.storage.s3.transfer.worker.BlockingTransferWorker.doWork():t8.u");
    }

    public int getMaxRetryCount$aws_storage_s3_release() {
        return this.maxRetryCount;
    }

    public final C7064j getOutputData$aws_storage_s3_release() {
        C7064j c7064j = this.outputData;
        if (c7064j != null) {
            return c7064j;
        }
        AbstractC4154l.m8928k("outputData");
        throw null;
    }

    public final TransferRecord getTransferRecord$aws_storage_s3_release() {
        TransferRecord transferRecord = this.transferRecord;
        if (transferRecord != null) {
            return transferRecord;
        }
        AbstractC4154l.m8928k("transferRecord");
        throw null;
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker
    public boolean isNetworkAvailable(Context context) {
        return super.isNetworkAvailable(context);
    }

    public abstract AbstractC7075u performWork();

    public void setMaxRetryCount$aws_storage_s3_release(int i10) {
        this.maxRetryCount = i10;
    }

    public final void setOutputData$aws_storage_s3_release(C7064j c7064j) {
        AbstractC4154l.m8923f(c7064j, "<set-?>");
        this.outputData = c7064j;
    }

    public final void setTransferRecord$aws_storage_s3_release(TransferRecord transferRecord) {
        AbstractC4154l.m8923f(transferRecord, "<set-?>");
        this.transferRecord = transferRecord;
    }
}
