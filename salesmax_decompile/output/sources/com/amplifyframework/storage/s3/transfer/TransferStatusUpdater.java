package com.amplifyframework.storage.s3.transfer;

import android.os.Handler;
import android.os.Looper;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amplifyframework.storage.s3.transfer.TransferStatusUpdater;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p001o.ch3;
import p001o.e9g;
import p001o.gi9;
import p001o.id5;
import p001o.si9;
import p001o.sq8;
import p001o.y3i;
import p001o.y8;

/* loaded from: classes5.dex */
public final class TransferStatusUpdater {
    public static final Companion Companion = new Companion(null);
    public static final String TEMP_FILE_PREFIX = "aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002";
    private final y8 activeTransferMap;
    private final Logger logger;
    private final Handler mainHandler;
    private final gi9 multiPartTransferStatusListener$delegate;
    private final TransferDB transferDB;
    private final gi9 transferStatusListenerMap$delegate;
    private final gi9 transferWorkInfoIdMap$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public TransferStatusUpdater(TransferDB transferDB) {
        sq8.m48649h(transferDB, "transferDB");
        this.transferDB = transferDB;
        LoggingCategory loggingCategory = Amplify.Logging;
        CategoryType categoryType = CategoryType.STORAGE;
        String str = String.format(AWSS3StoragePlugin.AWS_S3_STORAGE_LOG_NAMESPACE, Arrays.copyOf(new Object[]{TransferStatusUpdater.class.getSimpleName()}, 1));
        sq8.m48648g(str, "format(...)");
        Logger logger = loggingCategory.logger(categoryType, str);
        sq8.m48648g(logger, "logger(...)");
        this.logger = logger;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.transferStatusListenerMap$delegate = si9.m48360a(TransferStatusUpdater$transferStatusListenerMap$2.INSTANCE);
        this.transferWorkInfoIdMap$delegate = si9.m48360a(TransferStatusUpdater$transferWorkInfoIdMap$2.INSTANCE);
        this.multiPartTransferStatusListener$delegate = si9.m48360a(TransferStatusUpdater$multiPartTransferStatusListener$2.INSTANCE);
        this.activeTransferMap = new y8() { // from class: com.amplifyframework.storage.s3.transfer.TransferStatusUpdater$activeTransferMap$1
            private final ConcurrentHashMap<Integer, TransferRecord> transferRecordMap = new ConcurrentHashMap<>();

            public /* bridge */ boolean containsKey(int i) {
                return super.containsKey(Integer.valueOf(i));
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

            @Override // p001o.y8
            public Set<Map.Entry<Integer, TransferRecord>> getEntries() {
                Set<Map.Entry<Integer, TransferRecord>> setEntrySet = this.transferRecordMap.entrySet();
                sq8.m48648g(setEntrySet, "<get-entries>(...)");
                return setEntrySet;
            }

            public /* bridge */ TransferRecord getOrDefault(int i, TransferRecord transferRecord) {
                return (TransferRecord) super.getOrDefault((Object) Integer.valueOf(i), (Integer) transferRecord);
            }

            public final ConcurrentHashMap<Integer, TransferRecord> getTransferRecordMap() {
                return this.transferRecordMap;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return put(((Number) obj).intValue(), (TransferRecord) obj2);
            }

            public /* bridge */ TransferRecord remove(int i) {
                return (TransferRecord) super.remove((Object) Integer.valueOf(i));
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

            public TransferRecord put(int i, TransferRecord transferRecord) {
                sq8.m48649h(transferRecord, "value");
                return this.transferRecordMap.put(Integer.valueOf(i), transferRecord);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public final /* bridge */ TransferRecord remove(Object obj) {
                if (obj instanceof Integer) {
                    return remove(((Number) obj).intValue());
                }
                return null;
            }

            public TransferRecord get(int i) {
                TransferRecord transferRecordById;
                if (!this.transferRecordMap.containsKey(Integer.valueOf(i)) && (transferRecordById = this.this$0.transferDB.getTransferRecordById(i)) != null) {
                    put(i, transferRecordById);
                }
                return (TransferRecord) super.get((Object) Integer.valueOf(i));
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

            public /* bridge */ boolean remove(int i, TransferRecord transferRecord) {
                return super.remove(Integer.valueOf(i), transferRecord);
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

    private final Map<Integer, MultiPartUploadTaskListener> getMultiPartTransferStatusListener() {
        return (Map) this.multiPartTransferStatusListener$delegate.getValue();
    }

    private final Map<Integer, List<TransferListener>> getTransferStatusListenerMap() {
        return (Map) this.transferStatusListenerMap$delegate.getValue();
    }

    private final Map<String, Integer> getTransferWorkInfoIdMap() {
        return (Map) this.transferWorkInfoIdMap$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterAllListener$lambda$16(TransferStatusUpdater transferStatusUpdater, int i) {
        sq8.m48649h(transferStatusUpdater, "this$0");
        transferStatusUpdater.getTransferStatusListenerMap().remove(Integer.valueOf(i));
        transferStatusUpdater.getMultiPartTransferStatusListener().remove(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterListener$lambda$15(TransferStatusUpdater transferStatusUpdater, int i, TransferListener transferListener) {
        sq8.m48649h(transferStatusUpdater, "this$0");
        sq8.m48649h(transferListener, "$transferListener");
        List<TransferListener> list = transferStatusUpdater.getTransferStatusListenerMap().get(Integer.valueOf(i));
        if (list != null) {
            list.remove(transferListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateOnError$lambda$11$lambda$10(TransferListener transferListener, int i, Exception exc) {
        sq8.m48649h(transferListener, "$it");
        sq8.m48649h(exc, "$exception");
        transferListener.onError(i, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProgress$lambda$9$lambda$8(TransferListener transferListener, int i, long j, long j2) {
        sq8.m48649h(transferListener, "$it");
        transferListener.onProgressChanged(i, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTransferState$lambda$6$lambda$5$lambda$4(TransferRecord transferRecord, TransferListener transferListener, TransferState transferState) {
        sq8.m48649h(transferRecord, "$transferRecord");
        sq8.m48649h(transferListener, "$listener");
        sq8.m48649h(transferState, "$newState");
        String key = transferRecord.getKey();
        if (key != null) {
            transferListener.onStateChanged(transferRecord.getId(), transferState, key);
        }
    }

    public final synchronized void addWorkRequest(String str, int i, boolean z) {
        sq8.m48649h(str, "workRequestId");
        getTransferWorkInfoIdMap().put(str, Integer.valueOf(i));
        if (!z) {
            TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i));
            if (transferRecord != null) {
                transferRecord.setWorkManagerRequestId(str);
            }
            this.transferDB.updateWorkManagerRequestId(i, str);
        }
    }

    public final y8 getActiveTransferMap() {
        return this.activeTransferMap;
    }

    public final MultiPartUploadTaskListener getMultiPartTransferListener(int i) {
        return getMultiPartTransferStatusListener().get(Integer.valueOf(i));
    }

    public final Integer getTransferRecordIdForWorkInfo(String str) {
        sq8.m48649h(str, "workInfoId");
        return getTransferWorkInfoIdMap().get(str);
    }

    public final synchronized void registerListener(int i, TransferListener transferListener) {
        y3i y3iVar;
        sq8.m48649h(transferListener, "transferListener");
        List<TransferListener> list = getTransferStatusListenerMap().get(Integer.valueOf(i));
        if (list != null) {
            if (!list.contains(transferListener)) {
                list.add(transferListener);
            }
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            getTransferStatusListenerMap().put(Integer.valueOf(i), ch3.m21252q(transferListener));
        }
    }

    public final synchronized void registerMultiPartTransferListener(int i, MultiPartUploadTaskListener multiPartUploadTaskListener) {
        sq8.m48649h(multiPartUploadTaskListener, "transferListener");
        getMultiPartTransferStatusListener().put(Integer.valueOf(i), multiPartUploadTaskListener);
    }

    public final synchronized void removeTransferRecord(int i) {
        TransferRecord transferRecordById = this.transferDB.getTransferRecordById(i);
        if (transferRecordById != null) {
            if (!transferRecordById.isMainRecord$aws_storage_s3_release()) {
                return;
            }
            File file = new File(transferRecordById.getFile());
            String name = file.getName();
            sq8.m48646e(name);
            if (!e9g.m24597K(name, TEMP_FILE_PREFIX, false, 2, null)) {
                name = null;
            }
            if (name != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    this.logger.error("Failed to delete temp file: " + file.getName() + " " + e);
                    y3i y3iVar = y3i.f54824a;
                }
            }
            if (transferRecordById.isMultipart() == 1) {
                this.transferDB.deletePartTransferRecords(i);
            }
            this.transferDB.deleteTransferRecords(i);
        }
    }

    public final void removeWorkInfoId(String str) {
        sq8.m48649h(str, "workInfoId");
        getTransferWorkInfoIdMap().remove(str);
    }

    public final synchronized void unregisterAllListener(final int i) {
        this.mainHandler.post(new Runnable() { // from class: o.suh
            @Override // java.lang.Runnable
            public final void run() {
                TransferStatusUpdater.unregisterAllListener$lambda$16(this.f45985a, i);
            }
        });
    }

    public final synchronized void unregisterListener(final int i, final TransferListener transferListener) {
        sq8.m48649h(transferListener, "transferListener");
        this.mainHandler.post(new Runnable() { // from class: o.puh
            @Override // java.lang.Runnable
            public final void run() {
                TransferStatusUpdater.unregisterListener$lambda$15(this.f40639a, i, transferListener);
            }
        });
    }

    public final synchronized void updateMultipartId(int i, String str) {
        this.transferDB.updateMultipartId(i, str);
        TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.setMultipartId(str);
        }
    }

    public final synchronized void updateOnError(final int i, final Exception exc) {
        sq8.m48649h(exc, "exception");
        List<TransferListener> list = getTransferStatusListenerMap().get(Integer.valueOf(i));
        if (list != null) {
            for (final TransferListener transferListener : list) {
                this.mainHandler.post(new Runnable() { // from class: o.ruh
                    @Override // java.lang.Runnable
                    public final void run() {
                        TransferStatusUpdater.updateOnError$lambda$11$lambda$10(transferListener, i, exc);
                    }
                });
            }
        }
    }

    public final synchronized void updateProgress(final int i, final long j, final long j2, boolean z, boolean z2) {
        List<TransferListener> list;
        TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.setBytesCurrent(j);
            transferRecord.setBytesTotal(j2);
        }
        if (z2) {
            this.transferDB.updateBytesTransferred(i, j, j2);
        }
        if (z && (list = getTransferStatusListenerMap().get(Integer.valueOf(i))) != null) {
            for (final TransferListener transferListener : list) {
                this.mainHandler.post(new Runnable() { // from class: o.quh
                    @Override // java.lang.Runnable
                    public final void run() {
                        TransferStatusUpdater.updateProgress$lambda$9$lambda$8(transferListener, i, j, j2);
                    }
                });
            }
        }
    }

    public final synchronized void updateTransferState(int i, final TransferState transferState) {
        sq8.m48649h(transferState, "newState");
        final TransferRecord transferRecord = (TransferRecord) this.activeTransferMap.get(Integer.valueOf(i));
        if (transferRecord != null) {
            if (transferRecord.getState() != transferState && !TransferState.Companion.isInTerminalState(transferRecord.getState())) {
                transferRecord.setState(transferState);
                this.transferDB.updateState(transferRecord.getId(), transferState);
                if (TransferState.COMPLETED == transferState) {
                    removeTransferRecord(transferRecord.getId());
                }
                List<TransferListener> list = getTransferStatusListenerMap().get(Integer.valueOf(transferRecord.getId()));
                if (list != null) {
                    for (final TransferListener transferListener : list) {
                        this.mainHandler.post(new Runnable() { // from class: o.ouh
                            @Override // java.lang.Runnable
                            public final void run() {
                                TransferStatusUpdater.updateTransferState$lambda$6$lambda$5$lambda$4(transferRecord, transferListener, transferState);
                            }
                        });
                    }
                }
                if (TransferState.Companion.isInTerminalState(transferState)) {
                    unregisterAllListener(transferRecord.getId());
                }
            }
        }
    }
}
