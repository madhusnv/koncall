package com.amplifyframework.storage.s3.transfer;

import android.content.Context;
import android.database.Cursor;
import ay.C0496f;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.TransferOperations;
import d7.h0;
import ex.InterfaceC2141e;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import og.q1;
import qw.C6361k;
import qw.a0;
import rw.AbstractC6674x;
import t8.C7064j;
import t8.e0;
import t8.f0;
import t8.g0;
import tx.InterfaceC7266z;
import tx.c0;
import tx.m0;
import tx.y0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import yx.AbstractC8819m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferWorkerObserver implements h0 {
    public static final Companion Companion = new Companion(null);
    private static TransferWorkerObserver instance;
    private final InterfaceC7266z coroutineScope;
    private final Logger logger;
    private final ConcurrentHashMap.KeySetView<String, Boolean> observedTags;
    private final String pluginKey;
    private final TransferDB transferDB;
    private final TransferStatusUpdater transferStatusUpdater;
    private final g0 workManager;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final TransferWorkerObserver getInstance(Context context, String pluginKey, g0 workManager, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) {
            AbstractC4154l.m8923f(context, "context");
            AbstractC4154l.m8923f(pluginKey, "pluginKey");
            AbstractC4154l.m8923f(workManager, "workManager");
            AbstractC4154l.m8923f(transferStatusUpdater, "transferStatusUpdater");
            AbstractC4154l.m8923f(transferDB, "transferDB");
            TransferWorkerObserver transferWorkerObserver = TransferWorkerObserver.instance;
            if (transferWorkerObserver != null) {
                return transferWorkerObserver;
            }
            TransferWorkerObserver transferWorkerObserver2 = new TransferWorkerObserver(context, pluginKey, workManager, transferStatusUpdater, transferDB, null);
            TransferWorkerObserver.instance = transferWorkerObserver2;
            return transferWorkerObserver2;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserver$2", m15344f = "TransferWorkerObserver.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserver$2 */
    public static final class C12502 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12502(String str, InterfaceC7559c<? super C12502> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$tag = str;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return TransferWorkerObserver.this.new C12502(this.$tag, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            boolean zAdd = TransferWorkerObserver.this.observedTags.add(this.$tag);
            a0 a0Var = a0.f30746a;
            if (!zAdd) {
                return a0Var;
            }
            TransferWorkerObserver.this.workManager.mo13356d(this.$tag).m5316f(TransferWorkerObserver.this);
            return a0Var;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12502) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserverForPendingTransfer$1", m15344f = "TransferWorkerObserver.kt", m15345l = {181}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$attachObserverForPendingTransfer$1 */
    public static final class C12511 extends AbstractC8199i implements InterfaceC2141e {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C12511(InterfaceC7559c<? super C12511> interfaceC7559c) {
            super(2, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return TransferWorkerObserver.this.new C12511(interfaceC7559c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v7 */
        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            Closeable closeable;
            TransferWorkerObserver transferWorkerObserver;
            int i10;
            ?? r32;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                od.m10798c(obj);
                Cursor cursorQueryTransfersWithTypeAndStates = TransferWorkerObserver.this.transferDB.queryTransfersWithTypeAndStates(TransferType.ANY, new TransferState[]{TransferState.IN_PROGRESS, TransferState.WAITING});
                if (cursorQueryTransfersWithTypeAndStates != null) {
                    closeable = cursorQueryTransfersWithTypeAndStates;
                    transferWorkerObserver = TransferWorkerObserver.this;
                    i10 = 0;
                    r32 = closeable;
                }
                return a0.f30746a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            Cursor cursor = (Cursor) this.L$2;
            transferWorkerObserver = (TransferWorkerObserver) this.L$1;
            closeable = (Closeable) this.L$0;
            try {
                od.m10798c(obj);
                r32 = cursor;
            } finally {
            }
            while (r32.moveToNext()) {
                int i12 = r32.getInt(r32.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                String strValueOf = String.valueOf(i12);
                this.L$0 = closeable;
                this.L$1 = transferWorkerObserver;
                this.L$2 = r32;
                this.I$0 = i10;
                this.I$1 = i12;
                this.label = 1;
                if (transferWorkerObserver.attachObserver(strValueOf, this) == enumC7794a) {
                    return enumC7794a;
                }
            }
            q1.m10844a(closeable, null);
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12511) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$onChanged$1", m15344f = "TransferWorkerObserver.kt", m15345l = {94, 96}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$onChanged$1 */
    public static final class C12521 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ List<f0> $workInfoList;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ TransferWorkerObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12521(List<f0> list, TransferWorkerObserver transferWorkerObserver, InterfaceC7559c<? super C12521> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$workInfoList = list;
            this.this$0 = transferWorkerObserver;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C12521(this.$workInfoList, this.this$0, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            TransferWorkerObserver transferWorkerObserver;
            int i10;
            int iIntValue;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                od.m10798c(obj);
                List<f0> list = this.$workInfoList;
                if (list != null) {
                    TransferWorkerObserver transferWorkerObserver2 = this.this$0;
                    it = list.iterator();
                    transferWorkerObserver = transferWorkerObserver2;
                    i10 = 0;
                }
                return a0.f30746a;
            }
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            it = (Iterator) this.L$2;
            transferWorkerObserver = (TransferWorkerObserver) this.L$1;
            od.m10798c(obj);
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                TransferStatusUpdater transferStatusUpdater = transferWorkerObserver.transferStatusUpdater;
                String string = f0Var.f34140a.toString();
                AbstractC4154l.m8922e(string, "toString(...)");
                Integer transferRecordIdForWorkInfo = transferStatusUpdater.getTransferRecordIdForWorkInfo(string);
                if (transferRecordIdForWorkInfo != null) {
                    iIntValue = transferRecordIdForWorkInfo.intValue();
                } else {
                    C7064j c7064j = f0Var.f34143d;
                    c7064j.getClass();
                    Object obj2 = c7064j.f34160a.get("OUTPUT_TRANSFER_RECORD_ID");
                    iIntValue = ((Number) (obj2 instanceof Integer ? obj2 : -1)).intValue();
                }
                Integer num = new Integer(iIntValue);
                if (num.intValue() == -1) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    TransferRecord transferRecord = (TransferRecord) transferWorkerObserver.transferStatusUpdater.getActiveTransferMap().get(new Integer(iIntValue));
                    if (transferRecord != null && !TransferState.Companion.isInTerminalState(transferRecord.getState())) {
                        if (f0Var.f34142c.contains("MULTIPART_UPLOAD")) {
                            this.L$0 = null;
                            this.L$1 = transferWorkerObserver;
                            this.L$2 = it;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.I$0 = i10;
                            this.I$1 = 0;
                            this.I$2 = iIntValue;
                            this.I$3 = iIntValue2;
                            this.I$4 = 0;
                            this.I$5 = 0;
                            this.label = 1;
                            if (transferWorkerObserver.handleMultipartUploadStatusUpdate(f0Var, transferRecord, this) == enumC7794a) {
                                return enumC7794a;
                            }
                        } else {
                            this.L$0 = null;
                            this.L$1 = transferWorkerObserver;
                            this.L$2 = it;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.I$0 = i10;
                            this.I$1 = 0;
                            this.I$2 = iIntValue;
                            this.I$3 = iIntValue2;
                            this.I$4 = 0;
                            this.I$5 = 0;
                            this.label = 2;
                            if (transferWorkerObserver.handleTransferStatusUpdate(f0Var, transferRecord, this) == enumC7794a) {
                                return enumC7794a;
                            }
                        }
                    }
                }
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12521) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$removeObserver$2", m15344f = "TransferWorkerObserver.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.storage.s3.transfer.TransferWorkerObserver$removeObserver$2 */
    public static final class C12532 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ String $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12532(String str, InterfaceC7559c<? super C12532> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$tag = str;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return TransferWorkerObserver.this.new C12532(this.$tag, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            boolean zRemove = TransferWorkerObserver.this.observedTags.remove(this.$tag);
            a0 a0Var = a0.f30746a;
            if (!zRemove) {
                return a0Var;
            }
            TransferWorkerObserver.this.workManager.mo13356d(this.$tag).mo5320j(TransferWorkerObserver.this);
            return a0Var;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C12532) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    public /* synthetic */ TransferWorkerObserver(Context context, String str, g0 g0Var, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB, AbstractC4148f abstractC4148f) {
        this(context, str, g0Var, transferStatusUpdater, transferDB);
    }

    private final boolean abortRequest(TransferRecord transferRecord, e0 e0Var) {
        if (transferRecord.isMultipart() == 1) {
            return transferRecord.getState() == TransferState.PENDING_CANCEL || e0Var == e0.FAILED;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object attachObserver(String str, InterfaceC7559c<? super a0> interfaceC7559c) throws Throwable {
        C0496f c0496f = m0.f34659a;
        Object objM13475K = c0.m13475K(AbstractC8819m.f42514a, new C12502(str, null), interfaceC7559c);
        return objM13475K == EnumC7794a.COROUTINE_SUSPENDED ? objM13475K : a0.f30746a;
    }

    private final void attachObserverForPendingTransfer() {
        c0.m13502y(this.coroutineScope, null, null, new C12511(null), 3);
    }

    public static final TransferWorkerObserver getInstance(Context context, String str, g0 g0Var, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) {
        return Companion.getInstance(context, str, g0Var, transferStatusUpdater, transferDB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleMultipartUploadStatusUpdate(f0 f0Var, TransferRecord transferRecord, InterfaceC7559c<? super a0> interfaceC7559c) throws Throwable {
        e0 e0Var = e0.ENQUEUED;
        TransferState transferState = TransferState.WAITING;
        Map mapM12778f = AbstractC6674x.m12778f(new C6361k(e0Var, transferState), new C6361k(e0.BLOCKED, transferState), new C6361k(e0.RUNNING, TransferState.IN_PROGRESS), new C6361k(e0.CANCELLED, TransferState.PENDING_CANCEL), new C6361k(e0.FAILED, TransferState.PENDING_FAILED), new C6361k(e0.SUCCEEDED, TransferState.COMPLETED));
        String.format("INITIATION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{new Integer(transferRecord.getId())}, 1));
        String str = String.format("COMPLETION_REQUEST_TAG_%s", Arrays.copyOf(new Object[]{new Integer(transferRecord.getId())}, 1));
        HashSet hashSet = f0Var.f34142c;
        e0 e0Var2 = f0Var.f34141b;
        if (hashSet.contains(str)) {
            if (abortRequest(transferRecord, e0Var2)) {
                TransferOperations.INSTANCE.abortMultipartUploadRequest$aws_storage_s3_release(transferRecord, this.pluginKey, this.workManager);
            }
            if (e0Var2.isFinished()) {
                int id2 = transferRecord.getId();
                TransferState transferState2 = (TransferState) mapM12778f.get(e0Var2);
                String string = f0Var.f34140a.toString();
                AbstractC4154l.m8922e(string, "toString(...)");
                updateTransferState(id2, transferState2, string);
                this.logger.debug("remove observer for " + transferRecord.getId());
                Object objRemoveObserver = removeObserver(String.valueOf(transferRecord.getId()), interfaceC7559c);
                if (objRemoveObserver == EnumC7794a.COROUTINE_SUSPENDED) {
                    return objRemoveObserver;
                }
            }
        }
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleTransferStatusUpdate(f0 f0Var, TransferRecord transferRecord, InterfaceC7559c<? super a0> interfaceC7559c) throws Throwable {
        e0 e0Var = e0.ENQUEUED;
        TransferState transferState = TransferState.WAITING;
        Map mapM12778f = AbstractC6674x.m12778f(new C6361k(e0Var, transferState), new C6361k(e0.BLOCKED, transferState), new C6361k(e0.RUNNING, TransferState.IN_PROGRESS), new C6361k(e0.CANCELLED, TransferState.CANCELED), new C6361k(e0.FAILED, TransferState.FAILED), new C6361k(e0.SUCCEEDED, TransferState.COMPLETED));
        int id2 = transferRecord.getId();
        TransferState transferState2 = (TransferState) mapM12778f.get(f0Var.f34141b);
        String string = f0Var.f34140a.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        updateTransferState(id2, transferState2, string);
        boolean zIsFinished = f0Var.f34141b.isFinished();
        a0 a0Var = a0.f30746a;
        if (!zIsFinished && transferRecord.getState() != TransferState.PAUSED) {
            return a0Var;
        }
        this.logger.debug("remove observer for " + transferRecord.getId());
        Object objRemoveObserver = removeObserver(String.valueOf(transferRecord.getId()), interfaceC7559c);
        return objRemoveObserver == EnumC7794a.COROUTINE_SUSPENDED ? objRemoveObserver : a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeObserver(String str, InterfaceC7559c<? super a0> interfaceC7559c) throws Throwable {
        C0496f c0496f = m0.f34659a;
        Object objM13475K = c0.m13475K(AbstractC8819m.f42514a, new C12532(str, null), interfaceC7559c);
        return objM13475K == EnumC7794a.COROUTINE_SUSPENDED ? objM13475K : a0.f30746a;
    }

    private final void updateTransferState(int i10, TransferState transferState, String str) {
        TransferState state;
        TransferRecord transferRecord = (TransferRecord) this.transferStatusUpdater.getActiveTransferMap().get(Integer.valueOf(i10));
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
        this.transferStatusUpdater.updateTransferState(i10, transferState);
    }

    private TransferWorkerObserver(Context context, String str, g0 g0Var, TransferStatusUpdater transferStatusUpdater, TransferDB transferDB) {
        this.pluginKey = str;
        this.workManager = g0Var;
        this.transferStatusUpdater = transferStatusUpdater;
        this.transferDB = transferDB;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC4154l.m8922e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.coroutineScope = c0.m13479b(new y0(executorServiceNewSingleThreadExecutor));
        Logger logger = Amplify.Logging.logger(CategoryType.STORAGE, String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{"TransferWorkerObserver"}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        this.logger = logger;
        this.observedTags = ConcurrentHashMap.newKeySet();
        attachObserverForPendingTransfer();
    }

    @Override // d7.h0
    public void onChanged(List<f0> list) {
        c0.m13502y(this.coroutineScope, null, null, new C12521(list, this, null), 3);
    }
}
