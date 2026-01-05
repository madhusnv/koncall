package com.amplifyframework.storage.s3.transfer.worker;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.C1228R;
import com.amplifyframework.storage.s3.transfer.ProgressListener;
import com.amplifyframework.storage.s3.transfer.TransferDB;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import java.net.SocketException;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4154l;
import mb.z1;
import q5.C6118k;
import t8.AbstractC7075u;
import t8.C7064j;
import t8.C7069o;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SuspendingTransferWorker extends CoroutineWorker implements BaseTransferWorker {
    private final Logger logger;
    private int maxRetryCount;
    public C7064j outputData;
    private final TransferDB transferDB;
    public TransferRecord transferRecord;
    private final TransferStatusUpdater transferStatusUpdater;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker", m15344f = "SuspendingTransferWorker.kt", m15345l = {72, 80}, m15346m = "doWork$suspendImpl")
    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker$doWork$1 */
    public static final class C12661 extends AbstractC8193c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C12661(InterfaceC7559c<? super C12661> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendingTransferWorker.doWork$suspendImpl(SuspendingTransferWorker.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingTransferWorker(TransferStatusUpdater transferStatusUpdater, TransferDB transferDB, Context context, WorkerParameters workerParameters) {
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

    private final void createChannel() {
        Object systemService = getApplicationContext().getSystemService("notification");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel(getApplicationContext().getString(C1228R.string.amplify_storage_notification_channel_id), getApplicationContext().getString(C1228R.string.amplify_storage_notification_channel_name), 3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(7:12|67|13|47|(3:49|51|52)|54|(2:56|71)(4:57|(1:59)|60|(2:65|66)(2:64|72)))(2:17|18))(1:19))(5:20|(1:22)|23|(2:25|(1:28))(8:69|30|(1:32)(1:36)|37|(1:40)|39|41|(2:43|(5:46|47|(0)|54|(0)(0)))(3:50|51|52))|45)|29|69|30|(0)(0)|37|(0)|39|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        r1 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:30:0x0088, B:32:0x009b, B:39:0x00aa, B:41:0x00c1, B:43:0x00fe, B:40:0x00af), top: B:69:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:30:0x0088, B:32:0x009b, B:39:0x00aa, B:41:0x00c1, B:43:0x00fe, B:40:0x00af), top: B:69:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:30:0x0088, B:32:0x009b, B:39:0x00aa, B:41:0x00c1, B:43:0x00fe, B:40:0x00af), top: B:69:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object doWork$suspendImpl(com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker r10, uw.InterfaceC7559c<? super t8.AbstractC7075u> r11) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker.doWork$suspendImpl(com.amplifyframework.storage.s3.transfer.worker.SuspendingTransferWorker, uw.c):java.lang.Object");
    }

    public static Object getForegroundInfo$suspendImpl(SuspendingTransferWorker suspendingTransferWorker, InterfaceC7559c<? super C7069o> interfaceC7559c) {
        if (Build.VERSION.SDK_INT >= 26) {
            suspendingTransferWorker.createChannel();
        }
        int i10 = C1228R.drawable.amplify_storage_transfer_notification_icon;
        C6118k c6118k = new C6118k(suspendingTransferWorker.getApplicationContext(), suspendingTransferWorker.getApplicationContext().getString(C1228R.string.amplify_storage_notification_channel_id));
        c6118k.f29852w.icon = i10;
        c6118k.f29834e = C6118k.m12150b(suspendingTransferWorker.getApplicationContext().getString(C1228R.string.amplify_storage_notification_title));
        return new C7069o(1, c6118k.m12151a(), 0);
    }

    private final boolean isRetryableError(Throwable th2) {
        Context applicationContext = getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "getApplicationContext(...)");
        return !isNetworkAvailable(applicationContext) || getRunAttemptCount() < getMaxRetryCount$aws_storage_s3_release() || (th2 instanceof CancellationException) || (th2 instanceof SocketException);
    }

    @Override // com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker
    public z1 createPutObjectRequest(TransferRecord transferRecord, ProgressListener progressListener) {
        return super.createPutObjectRequest(transferRecord, progressListener);
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC7559c<? super AbstractC7075u> interfaceC7559c) {
        return doWork$suspendImpl(this, interfaceC7559c);
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(InterfaceC7559c<? super C7069o> interfaceC7559c) {
        return getForegroundInfo$suspendImpl(this, interfaceC7559c);
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

    public abstract Object performWork(InterfaceC7559c<? super AbstractC7075u> interfaceC7559c);

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
