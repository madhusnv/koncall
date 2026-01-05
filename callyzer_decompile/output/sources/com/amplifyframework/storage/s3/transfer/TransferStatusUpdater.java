package com.amplifyframework.storage.s3.transfer;

import a1.RunnableC0025x;
import android.os.Handler;
import android.os.Looper;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.codegen.data.C1226a;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.nd;
import qw.InterfaceC6357g;
import rw.AbstractC6657g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferStatusUpdater {
    public static final Companion Companion = new Companion(null);
    public static final String TEMP_FILE_PREFIX = "aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002";
    private final AbstractC6657g activeTransferMap;
    private final Logger logger;
    private final Handler mainHandler;
    private final InterfaceC6357g multiPartTransferStatusListener$delegate;
    private final TransferDB transferDB;
    private final InterfaceC6357g transferStatusListenerMap$delegate;
    private final InterfaceC6357g transferWorkInfoIdMap$delegate;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    public TransferStatusUpdater(TransferDB transferDB) {
        AbstractC4154l.m8923f(transferDB, "transferDB");
        this.transferDB = transferDB;
        Logger logger = Amplify.Logging.logger(CategoryType.STORAGE, String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{"TransferStatusUpdater"}, 1)));
        AbstractC4154l.m8922e(logger, "logger(...)");
        this.logger = logger;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.transferStatusListenerMap$delegate = nd.m10782c(new C1226a(7));
        this.transferWorkInfoIdMap$delegate = nd.m10782c(new C1226a(8));
        this.multiPartTransferStatusListener$delegate = nd.m10782c(new C1226a(9));
        this.activeTransferMap = new AbstractC6657g() { // from class: com.amplifyframework.storage.s3.transfer.TransferStatusUpdater$activeTransferMap$1
            private final ConcurrentHashMap<Integer, TransferRecord> transferRecordMap = new ConcurrentHashMap<>();

            public /* bridge */ boolean containsKey(int i10) {
                return super.containsKey(Integer.valueOf(i10));
            }

            public /* bridge */ boolean containsValue(TransferRecord transferRecord) {
                return super.containsValue((Object) transferRecord);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final /* bridge */ TransferRecord get(Object obj) {
                if (obj instanceof Integer) {
                    return get(((Number) obj).intValue());
                }
                return null;
            }

            @Override // rw.AbstractC6657g
            public Set<Map.Entry<Integer, TransferRecord>> getEntries() {
                Set<Map.Entry<Integer, TransferRecord>> setEntrySet = this.transferRecordMap.entrySet();
                AbstractC4154l.m8922e(setEntrySet, "<get-entries>(...)");
                return setEntrySet;
            }

            public /* bridge */ TransferRecord getOrDefault(int i10, TransferRecord transferRecord) {
                return (TransferRecord) super.getOrDefault((Object) Integer.valueOf(i10), (Integer) transferRecord);
            }

            public final ConcurrentHashMap<Integer, TransferRecord> getTransferRecordMap() {
                return this.transferRecordMap;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return put(((Number) obj).intValue(), (TransferRecord) obj2);
            }

            public /* bridge */ TransferRecord remove(int i10) {
                return (TransferRecord) super.remove((Object) Integer.valueOf(i10));
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (obj instanceof Integer) {
                    return containsKey(((Number) obj).intValue());
                }
                return false;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (obj instanceof TransferRecord) {
                    return containsValue((TransferRecord) obj);
                }
                return false;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (obj instanceof Integer) {
                    return get(((Number) obj).intValue());
                }
                return null;
            }

            public final /* bridge */ TransferRecord getOrDefault(Object obj, TransferRecord transferRecord) {
                return !(obj instanceof Integer) ? transferRecord : getOrDefault(((Number) obj).intValue(), transferRecord);
            }

            public TransferRecord put(int i10, TransferRecord value) {
                AbstractC4154l.m8923f(value, "value");
                return this.transferRecordMap.put(Integer.valueOf(i10), value);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final /* bridge */ TransferRecord remove(Object obj) {
                if (obj instanceof Integer) {
                    return remove(((Number) obj).intValue());
                }
                return null;
            }

            public TransferRecord get(int i10) {
                TransferRecord transferRecordById;
                if (!this.transferRecordMap.containsKey(Integer.valueOf(i10)) && (transferRecordById = this.this$0.transferDB.getTransferRecordById(i10)) != null) {
                    put(i10, transferRecordById);
                }
                return (TransferRecord) super.get((Object) Integer.valueOf(i10));
            }

            @Override // java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                return !(obj instanceof Integer) ? obj2 : getOrDefault(((Number) obj).intValue(), (TransferRecord) obj2);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (obj instanceof Integer) {
                    return remove(((Number) obj).intValue());
                }
                return null;
            }

            public /* bridge */ boolean remove(int i10, TransferRecord transferRecord) {
                return super.remove(Integer.valueOf(i10), transferRecord);
            }

            @Override // java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if ((obj instanceof Integer) && (obj2 instanceof TransferRecord)) {
                    return remove(((Number) obj).intValue(), (TransferRecord) obj2);
                }
                return false;
            }
        };
    }

    private final ConcurrentHashMap<Integer, MultiPartUploadTaskListener> getMultiPartTransferStatusListener() {
        return (ConcurrentHashMap) this.multiPartTransferStatusListener$delegate.getValue();
    }

    private final ConcurrentHashMap<Integer, ConcurrentHashMap.KeySetView<TransferListener, Boolean>> getTransferStatusListenerMap() {
        return (ConcurrentHashMap) this.transferStatusListenerMap$delegate.getValue();
    }

    private final ConcurrentHashMap<String, Integer> getTransferWorkInfoIdMap() {
        return (ConcurrentHashMap) this.transferWorkInfoIdMap$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap multiPartTransferStatusListener_delegate$lambda$2() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap transferStatusListenerMap_delegate$lambda$0() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap transferWorkInfoIdMap_delegate$lambda$1() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterAllListener$lambda$19(TransferStatusUpdater transferStatusUpdater, int i10) {
        transferStatusUpdater.getTransferStatusListenerMap().remove(Integer.valueOf(i10));
        transferStatusUpdater.getMultiPartTransferStatusListener().remove(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterListener$lambda$18(TransferStatusUpdater transferStatusUpdater, int i10, TransferListener transferListener) {
        ConcurrentHashMap.KeySetView<TransferListener, Boolean> keySetView = transferStatusUpdater.getTransferStatusListenerMap().get(Integer.valueOf(i10));
        if (keySetView != null) {
            keySetView.remove(transferListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTransferState$lambda$9$lambda$8$lambda$7(TransferRecord transferRecord, TransferListener transferListener, TransferState transferState) {
        String key = transferRecord.getKey();
        if (key != null) {
            transferListener.onStateChanged(transferRecord.getId(), transferState, key);
        }
    }

    public final synchronized void addWorkRequest(String workRequestId, int i10, boolean z6) {
        try {
            AbstractC4154l.m8923f(workRequestId, "workRequestId");
            getTransferWorkInfoIdMap().put(workRequestId, Integer.valueOf(i10));
            if (!z6) {
                TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i10));
                if (transferRecord != null) {
                    transferRecord.setWorkManagerRequestId(workRequestId);
                }
                this.transferDB.updateWorkManagerRequestId(i10, workRequestId);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final AbstractC6657g getActiveTransferMap() {
        return this.activeTransferMap;
    }

    public final MultiPartUploadTaskListener getMultiPartTransferListener(int i10) {
        return getMultiPartTransferStatusListener().get(Integer.valueOf(i10));
    }

    public final Integer getTransferRecordIdForWorkInfo(String workInfoId) {
        AbstractC4154l.m8923f(workInfoId, "workInfoId");
        return getTransferWorkInfoIdMap().get(workInfoId);
    }

    public final synchronized void registerListener(int i10, TransferListener transferListener) {
        try {
            AbstractC4154l.m8923f(transferListener, "transferListener");
            ConcurrentHashMap.KeySetView<TransferListener, Boolean> keySetView = getTransferStatusListenerMap().get(Integer.valueOf(i10));
            if (keySetView != null) {
                keySetView.add(transferListener);
            } else {
                ConcurrentHashMap.KeySetView<TransferListener, Boolean> keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
                keySetViewNewKeySet.add(transferListener);
                getTransferStatusListenerMap().put(Integer.valueOf(i10), keySetViewNewKeySet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void registerMultiPartTransferListener(int i10, MultiPartUploadTaskListener transferListener) {
        AbstractC4154l.m8923f(transferListener, "transferListener");
        getMultiPartTransferStatusListener().put(Integer.valueOf(i10), transferListener);
    }

    public final synchronized void removeTransferRecord(int i10) {
        TransferRecord transferRecordById = this.transferDB.getTransferRecordById(i10);
        if (transferRecordById != null) {
            if (!transferRecordById.isMainRecord$aws_storage_s3_release()) {
                return;
            }
            File file = new File(transferRecordById.getFile());
            String name = file.getName();
            AbstractC4154l.m8920c(name);
            if (!AbstractC5185w.m10138t(name, TEMP_FILE_PREFIX, false)) {
                name = null;
            }
            if (name != null) {
                try {
                    file.delete();
                } catch (Exception e2) {
                    this.logger.error("Failed to delete temp file: " + file.getName() + " " + e2);
                }
            }
            if (transferRecordById.isMultipart() == 1) {
                this.transferDB.deletePartTransferRecords(i10);
            }
            this.transferDB.deleteTransferRecords(i10);
        }
    }

    public final void removeWorkInfoId(String workInfoId) {
        AbstractC4154l.m8923f(workInfoId, "workInfoId");
        getTransferWorkInfoIdMap().remove(workInfoId);
    }

    public final synchronized void unregisterAllListener(int i10) {
        this.mainHandler.post(new RunnableC1257d(this, i10, 0));
    }

    public final synchronized void unregisterListener(int i10, TransferListener transferListener) {
        AbstractC4154l.m8923f(transferListener, "transferListener");
        this.mainHandler.post(new RunnableC1255b(this, i10, transferListener));
    }

    public final synchronized void updateMultipartId(int i10, String str) {
        this.transferDB.updateMultipartId(i10, str);
        TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i10));
        if (transferRecord != null) {
            transferRecord.setMultipartId(str);
        }
    }

    public final synchronized void updateOnError(int i10, Exception exception) {
        AbstractC4154l.m8923f(exception, "exception");
        ConcurrentHashMap.KeySetView<TransferListener, Boolean> keySetView = getTransferStatusListenerMap().get(Integer.valueOf(i10));
        if (keySetView != null) {
            Iterator<T> it = keySetView.iterator();
            while (it.hasNext()) {
                this.mainHandler.post(new RunnableC1255b((TransferListener) it.next(), i10, exception, 0));
            }
        }
    }

    public final synchronized void updateProgress(int i10, long j6, long j10, boolean z6, boolean z10) {
        long j11;
        final long j12;
        final int i11;
        ConcurrentHashMap.KeySetView<TransferListener, Boolean> keySetView;
        try {
            TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i10));
            if (transferRecord != null) {
                transferRecord.setBytesCurrent(j6);
                transferRecord.setBytesTotal(j10);
            }
            if (z10) {
                j11 = j10;
                this.transferDB.updateBytesTransferred(i10, j6, j11);
                i11 = i10;
                j12 = j6;
            } else {
                j11 = j10;
                j12 = j6;
                i11 = i10;
            }
            if (z6 && (keySetView = getTransferStatusListenerMap().get(Integer.valueOf(i11))) != null) {
                Iterator<T> it = keySetView.iterator();
                while (it.hasNext()) {
                    final TransferListener transferListener = (TransferListener) it.next();
                    final long j13 = j11;
                    j11 = j13;
                    this.mainHandler.post(new Runnable() { // from class: com.amplifyframework.storage.s3.transfer.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            transferListener.onProgressChanged(i11, j12, j13);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void updateTransferState(int i10, TransferState newState) {
        try {
            AbstractC4154l.m8923f(newState, "newState");
            TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i10));
            if (transferRecord != null) {
                if (transferRecord.getState() != newState && !TransferState.Companion.isInTerminalState(transferRecord.getState())) {
                    transferRecord.setState(newState);
                    this.transferDB.updateState(transferRecord.getId(), newState);
                    if (TransferState.COMPLETED == newState) {
                        removeTransferRecord(transferRecord.getId());
                    }
                    ConcurrentHashMap.KeySetView<TransferListener, Boolean> keySetView = getTransferStatusListenerMap().get(Integer.valueOf(transferRecord.getId()));
                    if (keySetView != null) {
                        Iterator<T> it = keySetView.iterator();
                        while (it.hasNext()) {
                            this.mainHandler.post(new RunnableC0025x(5, transferRecord, (TransferListener) it.next(), newState));
                        }
                    }
                    if (TransferState.Companion.isInTerminalState(newState)) {
                        unregisterAllListener(transferRecord.getId());
                    }
                }
            }
        } finally {
        }
    }
}
