package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import android.util.Log;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.transfer.ProgressListener;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker;
import java.net.SocketException;
import java.util.Arrays;
import p001o.hwc;
import p001o.s3e;
import p001o.sq8;
import p001o.vre;
import p001o.vyh;
import p001o.wre;

/* loaded from: classes5.dex */
public abstract class BlockingTransferWorker extends Worker implements BaseTransferWorker {
    private final Logger logger;
    private int maxRetryCount;
    public Data outputData;
    private final TransferDB transferDB;
    public TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingTransferWorker(TransferStatusUpdater transferStatusUpdater, TransferDB transferDB, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
        sq8.m48649h(transferDB, "transferDB");
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.transferStatusUpdater = transferStatusUpdater;
        this.transferDB = transferDB;
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.STORAGE;
        String str = String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{getClass().getSimpleName()}, 1));
        sq8.m48648g(str, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str);
        sq8.m48648g(logger, "logger(...)");
        this.logger = logger;
    }

    private final boolean isRetryableError(Throwable th) {
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        return !isNetworkAvailable(applicationContext) || getRunAttemptCount() < getMaxRetryCount$aws_storage_s3_release() || (th instanceof SocketException);
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker
    public s3e createPutObjectRequest(TransferRecord transferRecord, ProgressListener progressListener) {
        return BaseTransferWorker.DefaultImpls.createPutObjectRequest(this, transferRecord, progressListener);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        Object objM53351b;
        ListenableWorker.Result resultFailure;
        TransferRecord transferRecordById;
        try {
            vre.C17665a c17665a = vre.f50797b;
            Object obj = getInputData().getKeyValueMap().get("PART_RECORD_ID");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num == null) {
                Object obj2 = getInputData().getKeyValueMap().get("TRANSFER_RECORD_ID");
                sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.Int");
                num = (Integer) obj2;
            }
            int iIntValue = num.intValue();
            Object obj3 = getInputData().getKeyValueMap().get("TRANSFER_RECORD_ID");
            sq8.m48647f(obj3, "null cannot be cast to non-null type kotlin.Int");
            hwc[] hwcVarArr = {vyh.m53620a("OUTPUT_TRANSFER_RECORD_ID", (Integer) obj3)};
            Data.Builder builder = new Data.Builder();
            hwc hwcVar = hwcVarArr[0];
            builder.put((String) hwcVar.m31229c(), hwcVar.m31230d());
            Data dataBuild = builder.build();
            sq8.m48648g(dataBuild, "dataBuilder.build()");
            setOutputData$aws_storage_s3_release(dataBuild);
            transferRecordById = this.transferDB.getTransferRecordById(iIntValue);
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (transferRecordById != null) {
            setTransferRecord$aws_storage_s3_release(transferRecordById);
            ListenableWorker.Result resultPerformWork = performWork();
            if (resultPerformWork != null) {
                objM53351b = vre.m53351b(resultPerformWork);
                if (vre.m53357h(objM53351b)) {
                    wre.m54934b(objM53351b);
                    return (ListenableWorker.Result) objM53351b;
                }
                Throwable thM53354e = vre.m53354e(objM53351b);
                this.logger.error(getClass().getSimpleName() + " failed with exception: " + Log.getStackTraceString(thM53354e));
                if (isRetryableError(thM53354e)) {
                    resultFailure = ListenableWorker.Result.retry();
                } else {
                    this.transferStatusUpdater.updateOnError(getTransferRecord$aws_storage_s3_release().getId(), new Exception(thM53354e));
                    this.transferStatusUpdater.updateTransferState(getTransferRecord$aws_storage_s3_release().getId(), TransferState.FAILED);
                    resultFailure = ListenableWorker.Result.failure(getOutputData$aws_storage_s3_release());
                }
                sq8.m48646e(resultFailure);
                return resultFailure;
            }
        }
        ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure(getOutputData$aws_storage_s3_release());
        sq8.m48648g(resultFailure2, "run(...)");
        return resultFailure2;
    }

    public int getMaxRetryCount$aws_storage_s3_release() {
        return this.maxRetryCount;
    }

    public final Data getOutputData$aws_storage_s3_release() {
        Data data = this.outputData;
        if (data != null) {
            return data;
        }
        sq8.m48667z("outputData");
        return null;
    }

    public final TransferRecord getTransferRecord$aws_storage_s3_release() {
        TransferRecord transferRecord = this.transferRecord;
        if (transferRecord != null) {
            return transferRecord;
        }
        sq8.m48667z("transferRecord");
        return null;
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker
    public boolean isNetworkAvailable(Context context) {
        return BaseTransferWorker.DefaultImpls.isNetworkAvailable(this, context);
    }

    public abstract ListenableWorker.Result performWork();

    public void setMaxRetryCount$aws_storage_s3_release(int i) {
        this.maxRetryCount = i;
    }

    public final void setOutputData$aws_storage_s3_release(Data data) {
        sq8.m48649h(data, "<set-?>");
        this.outputData = data;
    }

    public final void setTransferRecord$aws_storage_s3_release(TransferRecord transferRecord) {
        sq8.m48649h(transferRecord, "<set-?>");
        this.transferRecord = transferRecord;
    }
}
