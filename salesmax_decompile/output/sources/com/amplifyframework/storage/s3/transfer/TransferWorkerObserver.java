package com.amplifyframework.storage.s3.transfer;

import android.content.Context;
import android.database.Cursor;
import androidx.lifecycle.AbstractC2145n;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.TransferOperations;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.objectweb.asm.Opcodes;
import p001o.eu5;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.isa;
import p001o.jgg;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.n9c;
import p001o.nl7;
import p001o.pm1;
import p001o.rm1;
import p001o.sq8;
import p001o.tb3;
import p001o.uq8;
import p001o.vl6;
import p001o.vyh;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class TransferWorkerObserver implements n9c {
    public static final Companion Companion = new Companion(null);
    private static TransferWorkerObserver INSTANCE;
    private final h84 coroutineScope;
    private final Logger logger;
    private final ConcurrentHashMap.KeySetView<String, Boolean> observedTags;
    private final String pluginKey;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;
    private final WorkManager workManager;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final TransferWorkerObserver getInstance(Context context, String str, WorkManager workManager, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) {
            sq8.m48649h(context, "context");
            sq8.m48649h(str, "pluginKey");
            sq8.m48649h(workManager, "workManager");
            sq8.m48649h(transferStatusUpdater, "transferStatusUpdater");
            sq8.m48649h(transferDB, "transferDB");
            TransferWorkerObserver transferWorkerObserver = TransferWorkerObserver.INSTANCE;
            if (transferWorkerObserver != null) {
                return transferWorkerObserver;
            }
            TransferWorkerObserver transferWorkerObserver2 = new TransferWorkerObserver(context, str, workManager, transferStatusUpdater, transferDB, null);
            TransferWorkerObserver.INSTANCE = transferWorkerObserver2;
            return transferWorkerObserver2;
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserver$2", m36648f = "TransferWorkerObserver.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserver$2 */
    public static final class C106982 extends jgg implements nl7 {
        final /* synthetic */ String $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106982(String str, n64 n64Var) {
            super(2, n64Var);
            this.$tag = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return TransferWorkerObserver.this.new C106982(this.$tag, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            if (!TransferWorkerObserver.this.observedTags.add(this.$tag)) {
                return y3i.f54824a;
            }
            AbstractC2145n workInfosByTagLiveData = TransferWorkerObserver.this.workManager.getWorkInfosByTagLiveData(this.$tag);
            sq8.m48648g(workInfosByTagLiveData, "getWorkInfosByTagLiveData(...)");
            workInfosByTagLiveData.observeForever(TransferWorkerObserver.this);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106982) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserverForPendingTransfer$1", m36648f = "TransferWorkerObserver.kt", m36649l = {Opcodes.INSTANCEOF}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserverForPendingTransfer$1 */
    public static final class C106991 extends jgg implements nl7 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C106991(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return TransferWorkerObserver.this.new C106991(n64Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            Closeable closeable;
            TransferWorkerObserver transferWorkerObserver;
            C106991 c106991;
            ?? r1;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                Cursor cursorQueryTransfersWithTypeAndStates = TransferWorkerObserver.this.transferDB.queryTransfersWithTypeAndStates(TransferType.ANY, new TransferState[]{TransferState.IN_PROGRESS, TransferState.WAITING});
                if (cursorQueryTransfersWithTypeAndStates != null) {
                    closeable = cursorQueryTransfersWithTypeAndStates;
                    transferWorkerObserver = TransferWorkerObserver.this;
                    c106991 = this;
                    r1 = closeable;
                }
                return y3i.f54824a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Cursor cursor = (Cursor) this.L$2;
            transferWorkerObserver = (TransferWorkerObserver) this.L$1;
            closeable = (Closeable) this.L$0;
            try {
                wre.m54934b(obj);
                c106991 = this;
                r1 = cursor;
            } finally {
            }
            while (r1.moveToNext()) {
                String strValueOf = String.valueOf(r1.getInt(r1.getColumnIndexOrThrow("_id")));
                c106991.L$0 = closeable;
                c106991.L$1 = transferWorkerObserver;
                c106991.L$2 = r1;
                c106991.label = 1;
                if (transferWorkerObserver.attachObserver(strValueOf, c106991) == objM51918f) {
                    return objM51918f;
                }
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(closeable, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C106991) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$onChanged$1", m36648f = "TransferWorkerObserver.kt", m36649l = {96, Opcodes.FADD}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$onChanged$1 */
    public static final class C107001 extends jgg implements nl7 {
        final /* synthetic */ List<WorkInfo> $workInfoList;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ TransferWorkerObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107001(List<WorkInfo> list, TransferWorkerObserver transferWorkerObserver, n64 n64Var) {
            super(2, n64Var);
            this.$workInfoList = list;
            this.this$0 = transferWorkerObserver;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C107001(this.$workInfoList, this.this$0, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            TransferWorkerObserver transferWorkerObserver;
            Iterator it;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                List<WorkInfo> list = this.$workInfoList;
                if (list != null) {
                    transferWorkerObserver = this.this$0;
                    it = list.iterator();
                }
                return y3i.f54824a;
            }
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            transferWorkerObserver = (TransferWorkerObserver) this.L$0;
            wre.m54934b(obj);
            while (it.hasNext()) {
                WorkInfo workInfo = (WorkInfo) it.next();
                TransferStatusUpdater transferStatusUpdater = transferWorkerObserver.transferStatusUpdater;
                String string = workInfo.getId().toString();
                sq8.m48648g(string, "toString(...)");
                Integer transferRecordIdForWorkInfo = transferStatusUpdater.getTransferRecordIdForWorkInfo(string);
                int iIntValue = transferRecordIdForWorkInfo != null ? transferRecordIdForWorkInfo.intValue() : workInfo.getOutputData().getInt("OUTPUT_TRANSFER_RECORD_ID", -1);
                Integer numM39304d = ml1.m39304d(iIntValue);
                if (!(numM39304d.intValue() != -1)) {
                    numM39304d = null;
                }
                if (numM39304d != null) {
                    numM39304d.intValue();
                    TransferRecord transferRecord = (TransferRecord) transferWorkerObserver.transferStatusUpdater.getActiveTransferMap().get(ml1.m39304d(iIntValue));
                    if (transferRecord != null && !TransferState.Companion.isInTerminalState(transferRecord.getState())) {
                        if (workInfo.getTags().contains("MULTIPART_UPLOAD")) {
                            this.L$0 = transferWorkerObserver;
                            this.L$1 = it;
                            this.label = 1;
                            if (transferWorkerObserver.handleMultipartUploadStatusUpdate(workInfo, transferRecord, this) == objM51918f) {
                                return objM51918f;
                            }
                        } else {
                            this.L$0 = transferWorkerObserver;
                            this.L$1 = it;
                            this.label = 2;
                            if (transferWorkerObserver.handleTransferStatusUpdate(workInfo, transferRecord, this) == objM51918f) {
                                return objM51918f;
                            }
                        }
                    }
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C107001) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$removeObserver$2", m36648f = "TransferWorkerObserver.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$removeObserver$2 */
    public static final class C107012 extends jgg implements nl7 {
        final /* synthetic */ String $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107012(String str, n64 n64Var) {
            super(2, n64Var);
            this.$tag = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return TransferWorkerObserver.this.new C107012(this.$tag, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            if (!TransferWorkerObserver.this.observedTags.remove(this.$tag)) {
                return y3i.f54824a;
            }
            TransferWorkerObserver.this.workManager.getWorkInfosByTagLiveData(this.$tag).removeObserver(TransferWorkerObserver.this);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C107012) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public /* synthetic */ TransferWorkerObserver(Context context, String str, WorkManager workManager, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB, id5 id5Var) {
        this(context, str, workManager, transferStatusUpdater, transferDB);
    }

    private final boolean abortRequest(TransferRecord transferRecord, WorkInfo.State state) {
        return transferRecord.isMultipart() == 1 && (transferRecord.getState() == TransferState.PENDING_CANCEL || state == WorkInfo.State.FAILED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object attachObserver(String str, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C106982(str, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    private final void attachObserverForPendingTransfer() {
        rm1.m46952d(this.coroutineScope, null, null, new C106991(null), 3, null);
    }

    public static final TransferWorkerObserver getInstance(Context context, String str, WorkManager workManager, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) {
        return Companion.getInstance(context, str, workManager, transferStatusUpdater, transferDB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleMultipartUploadStatusUpdate(WorkInfo workInfo, TransferRecord transferRecord, n64 n64Var) {
        WorkInfo.State state = WorkInfo.State.ENQUEUED;
        TransferState transferState = TransferState.WAITING;
        Map mapM32684k = isa.m32684k(vyh.m53620a(state, transferState), vyh.m53620a(WorkInfo.State.BLOCKED, transferState), vyh.m53620a(WorkInfo.State.RUNNING, TransferState.IN_PROGRESS), vyh.m53620a(WorkInfo.State.CANCELLED, TransferState.PENDING_CANCEL), vyh.m53620a(WorkInfo.State.FAILED, TransferState.PENDING_FAILED), vyh.m53620a(WorkInfo.State.SUCCEEDED, TransferState.COMPLETED));
        sq8.m48648g(String.format("INITIATION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{ml1.m39304d(transferRecord.getId())}, 1)), "format(...)");
        String str = String.format("COMPLETION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{ml1.m39304d(transferRecord.getId())}, 1));
        sq8.m48648g(str, "format(...)");
        if (workInfo.getTags().contains(str)) {
            WorkInfo.State state2 = workInfo.getState();
            sq8.m48648g(state2, "getState(...)");
            if (abortRequest(transferRecord, state2)) {
                TransferOperations.INSTANCE.abortMultipartUploadRequest$aws_storage_s3_release(transferRecord, this.pluginKey, this.workManager);
            }
            if (workInfo.getState().isFinished()) {
                int id = transferRecord.getId();
                TransferState transferState2 = (TransferState) mapM32684k.get(workInfo.getState());
                String string = workInfo.getId().toString();
                sq8.m48648g(string, "toString(...)");
                updateTransferState(id, transferState2, string);
                this.logger.debug("remove observer for " + transferRecord.getId());
                Object objRemoveObserver = removeObserver(String.valueOf(transferRecord.getId()), n64Var);
                return objRemoveObserver == uq8.m51918f() ? objRemoveObserver : y3i.f54824a;
            }
        }
        return y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleTransferStatusUpdate(WorkInfo workInfo, TransferRecord transferRecord, n64 n64Var) {
        WorkInfo.State state = WorkInfo.State.ENQUEUED;
        TransferState transferState = TransferState.WAITING;
        Map mapM32684k = isa.m32684k(vyh.m53620a(state, transferState), vyh.m53620a(WorkInfo.State.BLOCKED, transferState), vyh.m53620a(WorkInfo.State.RUNNING, TransferState.IN_PROGRESS), vyh.m53620a(WorkInfo.State.CANCELLED, TransferState.CANCELED), vyh.m53620a(WorkInfo.State.FAILED, TransferState.FAILED), vyh.m53620a(WorkInfo.State.SUCCEEDED, TransferState.COMPLETED));
        int id = transferRecord.getId();
        TransferState transferState2 = (TransferState) mapM32684k.get(workInfo.getState());
        String string = workInfo.getId().toString();
        sq8.m48648g(string, "toString(...)");
        updateTransferState(id, transferState2, string);
        if (!workInfo.getState().isFinished() && transferRecord.getState() != TransferState.PAUSED) {
            return y3i.f54824a;
        }
        this.logger.debug("remove observer for " + transferRecord.getId());
        Object objRemoveObserver = removeObserver(String.valueOf(transferRecord.getId()), n64Var);
        return objRemoveObserver == uq8.m51918f() ? objRemoveObserver : y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeObserver(String str, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C107012(str, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    private final void updateTransferState(int i, TransferState transferState, String str) {
        TransferState state;
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i));
        if (transferRecord == null || (state = transferRecord.getState()) == null) {
            return;
        }
        if (transferState == null) {
            transferState = TransferState.UNKNOWN;
        }
        TransferState.Companion companion = TransferState.Companion;
        if (companion.isPaused(state)) {
            transferState = TransferState.PAUSED;
            this.transferStatusUpdater.removeWorkInfoId(str);
        }
        if (companion.isCancelled(state)) {
            transferState = TransferState.CANCELED;
            this.transferStatusUpdater.removeWorkInfoId(str);
        }
        if (companion.isInTerminalState(state)) {
            return;
        }
        this.transferStatusUpdater.updateTransferState(i, transferState);
    }

    private TransferWorkerObserver(Context context, String str, WorkManager workManager, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) {
        this.pluginKey = str;
        this.workManager = workManager;
        this.transferStatusUpdater = transferStatusUpdater;
        this.transferDB = transferDB;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        sq8.m48648g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.coroutineScope = i84.m31707a(vl6.m52909b(executorServiceNewSingleThreadExecutor));
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.STORAGE;
        String str2 = String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{TransferWorkerObserver.class.getSimpleName()}, 1));
        sq8.m48648g(str2, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str2);
        sq8.m48648g(logger, "logger(...)");
        this.logger = logger;
        this.observedTags = ConcurrentHashMap.newKeySet();
        attachObserverForPendingTransfer();
    }

    @Override // p001o.n9c
    public void onChanged(List<WorkInfo> list) {
        rm1.m46952d(this.coroutineScope, null, null, new C107001(list, this, null), 3, null);
    }
}
