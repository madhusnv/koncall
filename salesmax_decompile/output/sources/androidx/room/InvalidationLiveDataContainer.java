package androidx.room;

import androidx.lifecycle.AbstractC2145n;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<AbstractC2145n> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        sq8.m48649h(roomDatabase, "database");
        this.database = roomDatabase;
        Set<AbstractC2145n> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        sq8.m48648g(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.liveDataSet = setNewSetFromMap;
    }

    public final <T> AbstractC2145n create(String[] strArr, boolean z, Callable<T> callable) {
        sq8.m48649h(strArr, "tableNames");
        sq8.m48649h(callable, "computeFunction");
        return new RoomTrackingLiveData(this.database, this, z, callable, strArr);
    }

    public final Set<AbstractC2145n> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final void onActive(AbstractC2145n abstractC2145n) {
        sq8.m48649h(abstractC2145n, "liveData");
        this.liveDataSet.add(abstractC2145n);
    }

    public final void onInactive(AbstractC2145n abstractC2145n) {
        sq8.m48649h(abstractC2145n, "liveData");
        this.liveDataSet.remove(abstractC2145n);
    }
}
