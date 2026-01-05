package com.amplifyframework.datastore.storage.sqlite;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.query.ObserveQueryOptions;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.DataStoreConfiguration;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.datastore.DataStoreQuerySnapshot;
import com.amplifyframework.datastore.storage.ItemChangeMapper;
import com.amplifyframework.datastore.storage.StorageItemChange;
import com.amplifyframework.datastore.storage.sqlite.ObserveQueryExecutor;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p001o.f9c;
import p001o.ggd;
import p001o.gu3;
import p001o.l2;
import p001o.lag;
import p001o.su5;
import p001o.x6c;

/* loaded from: classes5.dex */
public class ObserveQueryExecutor<T extends Model> implements Cancelable {
    private su5 disposable;
    private final lag itemChangeSubject;
    private final int maxRecords;
    private final long maxTimeSec;
    private final ModelSorter<T> modelSorter;
    private final SqlQueryProcessor sqlQueryProcessor;
    private final SyncStatus syncStatus;
    private final ExecutorService threadPool;
    private Timer timer;
    private final List<DataStoreItemChange<T>> changedItemList = new ArrayList();
    private boolean isCanceled = false;
    private boolean isSynced = false;
    private final Map<String, T> completeItemMap = new ConcurrentHashMap();

    public ObserveQueryExecutor(lag lagVar, SqlQueryProcessor sqlQueryProcessor, ExecutorService executorService, SyncStatus syncStatus, ModelSorter<T> modelSorter, DataStoreConfiguration dataStoreConfiguration) {
        this.itemChangeSubject = lagVar;
        this.sqlQueryProcessor = sqlQueryProcessor;
        this.threadPool = executorService;
        this.syncStatus = syncStatus;
        this.maxRecords = dataStoreConfiguration.getObserveQueryMaxRecords().intValue();
        this.maxTimeSec = dataStoreConfiguration.getMaxTimeLapseForObserveQuery().longValue();
        this.modelSorter = modelSorter;
    }

    private void callOnQuerySnapshot(Consumer<DataStoreQuerySnapshot<T>> consumer, Class<T> cls, Consumer<DataStoreException> consumer2, List<T> list) {
        boolean z = this.syncStatus.get(cls.getSimpleName(), consumer2);
        this.isSynced = z;
        getListConsumer(consumer).accept(new DataStoreQuerySnapshot<>(list, z));
        this.changedItemList.clear();
    }

    private void collect(StorageItemChange<T> storageItemChange, Consumer<DataStoreQuerySnapshot<T>> consumer, Class<T> cls, ObserveQueryOptions observeQueryOptions, Consumer<DataStoreException> consumer2) {
        try {
            this.changedItemList.add(ItemChangeMapper.map(storageItemChange));
            setTimerIfNeeded(consumer, cls, observeQueryOptions, consumer2);
            if (this.changedItemList.size() >= this.maxRecords || this.isSynced) {
                resetTimer();
                processQuerySnapshot(consumer, cls, observeQueryOptions, consumer2);
                this.changedItemList.clear();
            }
        } catch (DataStoreException e) {
            consumer2.accept(e);
        }
    }

    private Consumer<DataStoreQuerySnapshot<T>> getListConsumer(final Consumer<DataStoreQuerySnapshot<T>> consumer) {
        return new Consumer() { // from class: o.h9c
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f26452a.lambda$getListConsumer$6(consumer, (DataStoreQuerySnapshot) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getListConsumer$6(Consumer consumer, DataStoreQuerySnapshot dataStoreQuerySnapshot) {
        if (this.isCanceled) {
            return;
        }
        consumer.accept(dataStoreQuerySnapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeQuery$0(ObserveQueryOptions observeQueryOptions, Consumer consumer, Class cls, Consumer consumer2, Object obj) {
        StorageItemChange<T> storageItemChange = (StorageItemChange) obj;
        try {
            if (this.sqlQueryProcessor.modelExists(storageItemChange.item(), observeQueryOptions.getQueryPredicate())) {
                updateCompleteItemMap(storageItemChange);
            } else if (storageItemChange.type() == StorageItemChange.Type.UPDATE || storageItemChange.type() == StorageItemChange.Type.DELETE) {
                this.completeItemMap.remove(storageItemChange.item().getPrimaryKeyString());
            }
            collect(storageItemChange, consumer, cls, observeQueryOptions, consumer2);
        } catch (DataStoreException e) {
            consumer2.accept(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$observeQuery$1(Class cls, StorageItemChange storageItemChange) {
        return storageItemChange.item().getClass().isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$observeQuery$2(Consumer consumer, Throwable th) {
        if (th instanceof DataStoreException) {
            consumer.accept((DataStoreException) th);
        } else {
            consumer.accept(new DataStoreException("Failed to observe items in storage adapter.", th, "Inspect the failure details."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeQuery$3(final Class cls, Consumer consumer, final Consumer consumer2, Action action, Consumer consumer3, Consumer consumer4, DataStoreQuerySnapshot dataStoreQuerySnapshot) {
        x6c x6cVarM55714J = this.itemChangeSubject.m55714J(new ggd() { // from class: o.e9c
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return ObserveQueryExecutor.lambda$observeQuery$1(cls, (StorageItemChange) obj);
            }
        });
        Objects.requireNonNull(consumer);
        f9c f9cVar = new f9c(consumer);
        gu3 gu3Var = new gu3() { // from class: o.g9c
            @Override // p001o.gu3
            public final void accept(Object obj) {
                ObserveQueryExecutor.lambda$observeQuery$2(consumer2, (Throwable) obj);
            }
        };
        Objects.requireNonNull(action);
        this.disposable = x6cVarM55714J.w0(f9cVar, gu3Var, new l2(action));
        consumer3.accept(this);
        consumer4.accept(dataStoreQuerySnapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observeQuery$4(final Class cls, ObserveQueryOptions observeQueryOptions, final Consumer consumer, final Consumer consumer2, final Action action, final Consumer consumer3, final Consumer consumer4) {
        queryLocalData(cls, observeQueryOptions, new Consumer() { // from class: o.i9c
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f28281a.lambda$observeQuery$3(cls, consumer, consumer2, action, consumer3, consumer4, (DataStoreQuerySnapshot) obj);
            }
        }, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryLocalData$5(Consumer consumer, DataStoreException dataStoreException) {
        cancel();
        consumer.accept(dataStoreException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processQuerySnapshot(Consumer<DataStoreQuerySnapshot<T>> consumer, Class<T> cls, ObserveQueryOptions observeQueryOptions, Consumer<DataStoreException> consumer2) {
        ArrayList arrayList = new ArrayList(this.completeItemMap.values());
        sortIfNeeded(observeQueryOptions, arrayList, cls, consumer2);
        callOnQuerySnapshot(consumer, cls, consumer2, arrayList);
    }

    private void queryLocalData(Class<T> cls, ObserveQueryOptions observeQueryOptions, Consumer<DataStoreQuerySnapshot<T>> consumer, final Consumer<DataStoreException> consumer2) {
        List<T> listQueryOfflineData = this.sqlQueryProcessor.queryOfflineData(cls, Where.matchesAndSorts(observeQueryOptions.getQueryPredicate(), observeQueryOptions.getSortBy()), consumer2);
        Consumer<DataStoreException> consumer3 = new Consumer() { // from class: o.l9c
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f33510a.lambda$queryLocalData$5(consumer2, (DataStoreException) obj);
            }
        };
        for (T t : listQueryOfflineData) {
            this.completeItemMap.put(t.getPrimaryKeyString(), t);
        }
        callOnQuerySnapshot(consumer, cls, consumer3, listQueryOfflineData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.purge();
        }
        this.timer = null;
    }

    private void setTimerIfNeeded(final Consumer<DataStoreQuerySnapshot<T>> consumer, final Class<T> cls, final ObserveQueryOptions observeQueryOptions, final Consumer<DataStoreException> consumer2) {
        if (this.timer == null) {
            Timer timer = new Timer();
            this.timer = timer;
            timer.schedule(new TimerTask() { // from class: com.amplifyframework.datastore.storage.sqlite.ObserveQueryExecutor.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    ObserveQueryExecutor.this.processQuerySnapshot(consumer, cls, observeQueryOptions, consumer2);
                    ObserveQueryExecutor.this.resetTimer();
                }
            }, TimeUnit.SECONDS.toMillis(this.maxTimeSec));
        }
    }

    private void sortIfNeeded(ObserveQueryOptions observeQueryOptions, List<T> list, Class<T> cls, Consumer<DataStoreException> consumer) {
        if (observeQueryOptions == null || observeQueryOptions.getSortBy() == null || observeQueryOptions.getSortBy().size() <= 0) {
            return;
        }
        this.modelSorter.sort(observeQueryOptions, list, cls, consumer);
    }

    private void updateCompleteItemMap(StorageItemChange<T> storageItemChange) {
        Model modelItem = storageItemChange.item();
        if (storageItemChange.type() == StorageItemChange.Type.DELETE) {
            this.completeItemMap.remove(modelItem.getPrimaryKeyString());
        } else {
            this.completeItemMap.put(modelItem.getPrimaryKeyString(), modelItem);
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        this.isCanceled = true;
        resetTimer();
        this.completeItemMap.clear();
        this.changedItemList.clear();
        su5 su5Var = this.disposable;
        if (su5Var != null) {
            su5Var.dispose();
        }
    }

    public List<DataStoreItemChange<T>> getChangeList() {
        return Immutable.of(this.changedItemList);
    }

    public Map<String, T> getCompleteMap() {
        return Immutable.of(this.completeItemMap);
    }

    public boolean getIsCancelled() {
        return this.isCanceled;
    }

    public void observeQuery(final Class<T> cls, final ObserveQueryOptions observeQueryOptions, final Consumer<Cancelable> consumer, final Consumer<DataStoreQuerySnapshot<T>> consumer2, final Consumer<DataStoreException> consumer3, final Action action) {
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(consumer3);
        Objects.requireNonNull(action);
        final Consumer consumer4 = new Consumer() { // from class: o.j9c
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f29989a.lambda$observeQuery$0(observeQueryOptions, consumer2, cls, consumer3, obj);
            }
        };
        this.threadPool.submit(new Runnable() { // from class: o.k9c
            @Override // java.lang.Runnable
            public final void run() {
                this.f31703a.lambda$observeQuery$4(cls, observeQueryOptions, consumer4, consumer3, action, consumer, consumer2);
            }
        });
    }

    public ObserveQueryExecutor(lag lagVar, SqlQueryProcessor sqlQueryProcessor, ExecutorService executorService, SyncStatus syncStatus, ModelSorter<T> modelSorter, int i, int i2) {
        this.itemChangeSubject = lagVar;
        this.sqlQueryProcessor = sqlQueryProcessor;
        this.threadPool = executorService;
        this.syncStatus = syncStatus;
        this.modelSorter = modelSorter;
        this.maxRecords = i;
        this.maxTimeSec = i2;
    }
}
