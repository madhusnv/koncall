package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC2145n;
import androidx.room.InvalidationTracker;
import androidx.room.RoomTrackingLiveData;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.eo0;
import p001o.sq8;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class RoomTrackingLiveData<T> extends AbstractC2145n {
    private final Callable<T> computeFunction;
    private final AtomicBoolean computing;
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final AtomicBoolean invalid;
    private final Runnable invalidationRunnable;
    private final InvalidationTracker.Observer observer;
    private final Runnable refreshRunnable;
    private final AtomicBoolean registeredObserver;

    public RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, Callable<T> callable, final String[] strArr) {
        sq8.m48649h(roomDatabase, "database");
        sq8.m48649h(invalidationLiveDataContainer, "container");
        sq8.m48649h(callable, "computeFunction");
        sq8.m48649h(strArr, "tableNames");
        this.database = roomDatabase;
        this.container = invalidationLiveDataContainer;
        this.inTransaction = z;
        this.computeFunction = callable;
        this.observer = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> set) {
                sq8.m48649h(set, "tables");
                eo0.m25356h().m43993b(this.getInvalidationRunnable());
            }
        };
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: o.lue
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.refreshRunnable$lambda$0(this.f34377a);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: o.mue
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.invalidationRunnable$lambda$1(this.f36003a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(RoomTrackingLiveData roomTrackingLiveData) {
        sq8.m48649h(roomTrackingLiveData, "this$0");
        boolean zHasActiveObservers = roomTrackingLiveData.hasActiveObservers();
        if (roomTrackingLiveData.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            roomTrackingLiveData.getQueryExecutor().execute(roomTrackingLiveData.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(RoomTrackingLiveData roomTrackingLiveData) {
        boolean z;
        sq8.m48649h(roomTrackingLiveData, "this$0");
        if (roomTrackingLiveData.registeredObserver.compareAndSet(false, true)) {
            roomTrackingLiveData.database.getInvalidationTracker().addWeakObserver(roomTrackingLiveData.observer);
        }
        do {
            if (roomTrackingLiveData.computing.compareAndSet(false, true)) {
                T tCall = null;
                z = false;
                while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                    try {
                        try {
                            tCall = roomTrackingLiveData.computeFunction.call();
                            z = true;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        }
                    } finally {
                        roomTrackingLiveData.computing.set(false);
                    }
                }
                if (z) {
                    roomTrackingLiveData.postValue(tCall);
                }
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        } while (roomTrackingLiveData.invalid.get());
    }

    public final Callable<T> getComputeFunction() {
        return this.computeFunction;
    }

    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }

    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    public final Executor getQueryExecutor() {
        return this.inTransaction ? this.database.getTransactionExecutor() : this.database.getQueryExecutor();
    }

    public final Runnable getRefreshRunnable() {
        return this.refreshRunnable;
    }

    public final AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    @Override // androidx.lifecycle.AbstractC2145n
    public void onActive() {
        super.onActive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        sq8.m48647f(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onActive(this);
        getQueryExecutor().execute(this.refreshRunnable);
    }

    @Override // androidx.lifecycle.AbstractC2145n
    public void onInactive() {
        super.onInactive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        sq8.m48647f(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onInactive(this);
    }
}
