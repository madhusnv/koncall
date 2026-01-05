package com.amplifyframework.storage.s3.transfer.worker;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.C10684R;
import com.amplifyframework.storage.s3.transfer.ProgressListener;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.net.SocketException;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import org.objectweb.asm.TypeReference;
import p001o.hwc;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.o2c;
import p001o.o64;
import p001o.pc7;
import p001o.qc7;
import p001o.s3e;
import p001o.sq8;
import p001o.uq8;
import p001o.vre;
import p001o.vyh;
import p001o.wre;
import p001o.z69;

/* loaded from: classes5.dex */
public abstract class SuspendingTransferWorker extends CoroutineWorker implements BaseTransferWorker {
    private final Logger logger;
    private int maxRetryCount;
    public Data outputData;
    private final TransferDB transferDB;
    public TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker", m36648f = "SuspendingTransferWorker.kt", m36649l = {TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT, 80}, m36650m = "doWork$suspendImpl")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker$doWork$1 */
    public static final class C107171 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C107171(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendingTransferWorker.doWork$suspendImpl(SuspendingTransferWorker.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingTransferWorker(TransferStatusUpdater transferStatusUpdater, TransferDB transferDB, Context context, WorkerParameters workerParameters) {
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

    private final void createChannel() {
        Object systemService = getApplicationContext().getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        qc7.m45085a();
        ((NotificationManager) systemService).createNotificationChannel(pc7.m43335a(getApplicationContext().getString(C10684R.string.amplify_storage_notification_channel_id), getApplicationContext().getString(C10684R.string.amplify_storage_notification_channel_name), 3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(5:12|71|13|45|(3:47|50|51)(3:48|55|(2:57|72)(6:58|(1:60)|61|(1:66)(1:65)|67|68)))(2:17|18))(1:19))(12:20|(1:22)|23|(2:25|(1:27)(1:28))|69|30|(1:32)(1:34)|35|(1:38)|37|39|(2:41|(1:43)(3:44|45|(0)(0)))(3:49|50|51))|29|69|30|(0)(0)|35|(0)|37|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        r1 = r9;
        r9 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #0 {all -> 0x0122, blocks: (B:30:0x0080, B:32:0x0094, B:37:0x009e, B:39:0x00b5, B:41:0x00f8, B:38:0x00a3), top: B:69:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:30:0x0080, B:32:0x0094, B:37:0x009e, B:39:0x00b5, B:41:0x00f8, B:38:0x00a3), top: B:69:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8 A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #0 {all -> 0x0122, blocks: (B:30:0x0080, B:32:0x0094, B:37:0x009e, B:39:0x00b5, B:41:0x00f8, B:38:0x00a3), top: B:69:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0031, B:45:0x0109, B:50:0x0114, B:48:0x010e), top: B:71:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object doWork$suspendImpl(SuspendingTransferWorker suspendingTransferWorker, n64 n64Var) {
        C107171 c107171;
        SuspendingTransferWorker suspendingTransferWorker2;
        SuspendingTransferWorker suspendingTransferWorker3;
        Integer num;
        TransferRecord transferRecordById;
        Object objM53351b;
        ListenableWorker.Result resultFailure;
        ListenableWorker.Result result;
        if (n64Var instanceof C107171) {
            c107171 = (C107171) n64Var;
            int i = c107171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c107171.label = i - Integer.MIN_VALUE;
            } else {
                c107171 = suspendingTransferWorker.new C107171(n64Var);
            }
        }
        Object foregroundInfo = c107171.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c107171.label;
        if (i2 == 0) {
            wre.m54934b(foregroundInfo);
            Object objM39301a = suspendingTransferWorker.getInputData().getKeyValueMap().get("RUN_AS_FOREGROUND_TASK");
            if (objM39301a == null) {
                objM39301a = ml1.m39301a(false);
            }
            if (((Boolean) objM39301a).booleanValue()) {
                c107171.L$0 = suspendingTransferWorker;
                c107171.L$1 = suspendingTransferWorker;
                c107171.label = 1;
                foregroundInfo = suspendingTransferWorker.getForegroundInfo(c107171);
                if (foregroundInfo == objM51918f) {
                    return objM51918f;
                }
                suspendingTransferWorker2 = suspendingTransferWorker;
            }
            vre.C17665a c17665a = vre.f50797b;
            Object obj = suspendingTransferWorker.getInputData().getKeyValueMap().get("PART_RECORD_ID");
            num = !(obj instanceof Integer) ? (Integer) obj : null;
            if (num == null) {
                Object obj2 = suspendingTransferWorker.getInputData().getKeyValueMap().get("TRANSFER_RECORD_ID");
                sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.Int");
                num = (Integer) obj2;
            }
            int iIntValue = num.intValue();
            Object obj3 = suspendingTransferWorker.getInputData().getKeyValueMap().get("TRANSFER_RECORD_ID");
            sq8.m48647f(obj3, "null cannot be cast to non-null type kotlin.Int");
            hwc[] hwcVarArr = {vyh.m53620a("OUTPUT_TRANSFER_RECORD_ID", (Integer) obj3)};
            Data.Builder builder = new Data.Builder();
            hwc hwcVar = hwcVarArr[0];
            builder.put((String) hwcVar.m31229c(), hwcVar.m31230d());
            Data dataBuild = builder.build();
            sq8.m48648g(dataBuild, "dataBuilder.build()");
            suspendingTransferWorker.setOutputData$aws_storage_s3_release(dataBuild);
            transferRecordById = suspendingTransferWorker.transferDB.getTransferRecordById(iIntValue);
            if (transferRecordById != null) {
                ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure(suspendingTransferWorker.getOutputData$aws_storage_s3_release());
                sq8.m48648g(resultFailure2, "run(...)");
                return resultFailure2;
            }
            suspendingTransferWorker.setTransferRecord$aws_storage_s3_release(transferRecordById);
            c107171.L$0 = suspendingTransferWorker;
            c107171.L$1 = suspendingTransferWorker;
            c107171.label = 2;
            foregroundInfo = suspendingTransferWorker.performWork(c107171);
            if (foregroundInfo == objM51918f) {
                return objM51918f;
            }
            suspendingTransferWorker3 = suspendingTransferWorker;
            result = (ListenableWorker.Result) foregroundInfo;
            if (result != null) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                suspendingTransferWorker = (SuspendingTransferWorker) c107171.L$1;
                suspendingTransferWorker3 = (SuspendingTransferWorker) c107171.L$0;
                try {
                    wre.m54934b(foregroundInfo);
                    result = (ListenableWorker.Result) foregroundInfo;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    vre.C17665a c17665a2 = vre.f50797b;
                    objM53351b = vre.m53351b(wre.m54933a(th2));
                    if (vre.m53357h(objM53351b)) {
                    }
                }
                if (result != null) {
                    ListenableWorker.Result resultFailure22 = ListenableWorker.Result.failure(suspendingTransferWorker.getOutputData$aws_storage_s3_release());
                    sq8.m48648g(resultFailure22, "run(...)");
                    return resultFailure22;
                }
                objM53351b = vre.m53351b(result);
                if (vre.m53357h(objM53351b)) {
                    wre.m54934b(objM53351b);
                    return (ListenableWorker.Result) objM53351b;
                }
                Throwable thM53354e = vre.m53354e(objM53351b);
                if (z69.m58849n(c107171.getContext())) {
                    suspendingTransferWorker3.logger.error(suspendingTransferWorker3.getClass().getSimpleName() + " failed with exception: " + Log.getStackTraceString(thM53354e));
                }
                if (z69.m58849n(c107171.getContext()) || !suspendingTransferWorker3.isRetryableError(thM53354e)) {
                    suspendingTransferWorker3.transferStatusUpdater.updateOnError(suspendingTransferWorker3.getTransferRecord$aws_storage_s3_release().getId(), new Exception(thM53354e));
                    suspendingTransferWorker3.transferStatusUpdater.updateTransferState(suspendingTransferWorker3.getTransferRecord$aws_storage_s3_release().getId(), TransferState.FAILED);
                    resultFailure = ListenableWorker.Result.failure(suspendingTransferWorker3.getOutputData$aws_storage_s3_release());
                } else {
                    resultFailure = ListenableWorker.Result.retry();
                }
                sq8.m48646e(resultFailure);
                return resultFailure;
            }
            suspendingTransferWorker = (SuspendingTransferWorker) c107171.L$1;
            suspendingTransferWorker2 = (SuspendingTransferWorker) c107171.L$0;
            wre.m54934b(foregroundInfo);
        }
        suspendingTransferWorker.setForegroundAsync((ForegroundInfo) foregroundInfo);
        suspendingTransferWorker = suspendingTransferWorker2;
        vre.C17665a c17665a3 = vre.f50797b;
        Object obj4 = suspendingTransferWorker.getInputData().getKeyValueMap().get("PART_RECORD_ID");
        if (!(obj4 instanceof Integer)) {
        }
        if (num == null) {
        }
        int iIntValue2 = num.intValue();
        Object obj32 = suspendingTransferWorker.getInputData().getKeyValueMap().get("TRANSFER_RECORD_ID");
        sq8.m48647f(obj32, "null cannot be cast to non-null type kotlin.Int");
        hwc[] hwcVarArr2 = {vyh.m53620a("OUTPUT_TRANSFER_RECORD_ID", (Integer) obj32)};
        Data.Builder builder2 = new Data.Builder();
        hwc hwcVar2 = hwcVarArr2[0];
        builder2.put((String) hwcVar2.m31229c(), hwcVar2.m31230d());
        Data dataBuild2 = builder2.build();
        sq8.m48648g(dataBuild2, "dataBuilder.build()");
        suspendingTransferWorker.setOutputData$aws_storage_s3_release(dataBuild2);
        transferRecordById = suspendingTransferWorker.transferDB.getTransferRecordById(iIntValue2);
        if (transferRecordById != null) {
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(SuspendingTransferWorker suspendingTransferWorker, n64 n64Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            suspendingTransferWorker.createChannel();
        }
        return new ForegroundInfo(1, new o2c.C15694f(suspendingTransferWorker.getApplicationContext(), suspendingTransferWorker.getApplicationContext().getString(C10684R.string.amplify_storage_notification_channel_id)).m41399C(C10684R.drawable.amplify_storage_transfer_notification_icon).m41418m(suspendingTransferWorker.getApplicationContext().getString(C10684R.string.amplify_storage_notification_title)).m41409c());
    }

    private final boolean isRetryableError(Throwable th) {
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        return !isNetworkAvailable(applicationContext) || getRunAttemptCount() < getMaxRetryCount$aws_storage_s3_release() || (th instanceof CancellationException) || (th instanceof SocketException);
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker
    public s3e createPutObjectRequest(TransferRecord transferRecord, ProgressListener progressListener) {
        return BaseTransferWorker.DefaultImpls.createPutObjectRequest(this, transferRecord, progressListener);
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(n64 n64Var) {
        return doWork$suspendImpl(this, n64Var);
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(n64 n64Var) {
        return getForegroundInfo$suspendImpl(this, n64Var);
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

    public abstract Object performWork(n64 n64Var);

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
