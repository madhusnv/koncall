package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.AbstractC2145n;
import androidx.room.InvalidationTracker;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p001o.bh3;
import p001o.c0f;
import p001o.e9g;
import p001o.hh3;
import p001o.id5;
import p001o.isa;
import p001o.kh3;
import p001o.leg;
import p001o.mif;
import p001o.nif;
import p001o.peg;
import p001o.sq8;
import p001o.tb3;
import p001o.ttf;
import p001o.y3i;

/* loaded from: classes2.dex */
public class InvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    private AutoCloser autoCloser;
    private volatile peg cleanupStatement;
    private final RoomDatabase database;
    private volatile boolean initialized;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private final ObservedTableTracker observedTableTracker;
    private final c0f observerMap;
    private final AtomicBoolean pendingRefresh;
    public final Runnable refreshRunnable;
    private final Map<String, String> shadowTablesMap;
    private final Object syncTriggersLock;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;
    public static final Companion Companion = new Companion(null);
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public final void beginTransactionInternal$room_runtime_release(leg legVar) {
            sq8.m48649h(legVar, "database");
            if (legVar.isWriteAheadLoggingEnabled()) {
                legVar.beginTransactionNonExclusive();
            } else {
                legVar.beginTransaction();
            }
        }

        public final String getTriggerName$room_runtime_release(String str, String str2) {
            sq8.m48649h(str, "tableName");
            sq8.m48649h(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        public static final Companion Companion = new Companion(null);
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        private boolean needsSync;
        private final long[] tableObservers;
        private final int[] triggerStateChanges;
        private final boolean[] triggerStates;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(id5 id5Var) {
                this();
            }
        }

        public ObservedTableTracker(int i) {
            this.tableObservers = new long[i];
            this.triggerStates = new boolean[i];
            this.triggerStateChanges = new int[i];
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        public final int[] getTablesToSync() {
            synchronized (this) {
                if (!this.needsSync) {
                    return null;
                }
                long[] jArr = this.tableObservers;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = this.triggerStates;
                    if (z != zArr[i2]) {
                        int[] iArr = this.triggerStateChanges;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.triggerStateChanges[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.needsSync = false;
                return (int[]) this.triggerStateChanges.clone();
            }
        }

        public final boolean onAdded(int... iArr) {
            boolean z;
            sq8.m48649h(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                y3i y3iVar = y3i.f54824a;
            }
            return z;
        }

        public final boolean onRemoved(int... iArr) {
            boolean z;
            sq8.m48649h(iArr, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                y3i y3iVar = y3i.f54824a;
            }
            return z;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                y3i y3iVar = y3i.f54824a;
            }
        }

        public final void setNeedsSync(boolean z) {
            this.needsSync = z;
        }
    }

    public static abstract class Observer {
        private final String[] tables;

        public Observer(String[] strArr) {
            sq8.m48649h(strArr, "tables");
            this.tables = strArr;
        }

        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        public Observer(String str, String... strArr) {
            sq8.m48649h(str, "firstTable");
            sq8.m48649h(strArr, "rest");
            List listM18961c = bh3.m18961c();
            hh3.m30442B(listM18961c, strArr);
            listM18961c.add(str);
            this((String[]) bh3.m18959a(listM18961c).toArray(new String[0]));
        }
    }

    public static final class ObserverWrapper {
        private final Observer observer;
        private final Set<String> singleTableSet;
        private final int[] tableIds;
        private final String[] tableNames;

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            sq8.m48649h(observer, "observer");
            sq8.m48649h(iArr, "tableIds");
            sq8.m48649h(strArr, "tableNames");
            this.observer = observer;
            this.tableIds = iArr;
            this.tableNames = strArr;
            this.singleTableSet = (strArr.length == 0) ^ true ? mif.m39137d(strArr[0]) : nif.m40664e();
            if (!(iArr.length == strArr.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final Observer getObserver$room_runtime_release() {
            return this.observer;
        }

        public final int[] getTableIds$room_runtime_release() {
            return this.tableIds;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(Set<Integer> set) {
            Set<String> setM40664e;
            sq8.m48649h(set, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set setM39135b = mif.m39135b();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            setM39135b.add(this.tableNames[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    setM40664e = mif.m39134a(setM39135b);
                } else {
                    setM40664e = set.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : nif.m40664e();
                }
            } else {
                setM40664e = nif.m40664e();
            }
            if (!setM40664e.isEmpty()) {
                this.observer.onInvalidated(setM40664e);
            }
        }

        public final void notifyByTableNames$room_runtime_release(String[] strArr) {
            Set<String> setM40664e;
            sq8.m48649h(strArr, "tables");
            int length = this.tableNames.length;
            if (length != 0) {
                boolean z = false;
                if (length != 1) {
                    Set setM39135b = mif.m39135b();
                    for (String str : strArr) {
                        for (String str2 : this.tableNames) {
                            if (e9g.m24606x(str2, str, true)) {
                                setM39135b.add(str2);
                            }
                        }
                    }
                    setM40664e = mif.m39134a(setM39135b);
                } else {
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        if (e9g.m24606x(strArr[i], this.tableNames[0], true)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    setM40664e = z ? this.singleTableSet : nif.m40664e();
                }
            } else {
                setM40664e = nif.m40664e();
            }
            if (!setM40664e.isEmpty()) {
                this.observer.onInvalidated(setM40664e);
            }
        }
    }

    public static final class WeakObserver extends Observer {
        private final WeakReference<Observer> delegateRef;
        private final InvalidationTracker tracker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(InvalidationTracker invalidationTracker, Observer observer) {
            super(observer.getTables$room_runtime_release());
            sq8.m48649h(invalidationTracker, "tracker");
            sq8.m48649h(observer, "delegate");
            this.tracker = invalidationTracker;
            this.delegateRef = new WeakReference<>(observer);
        }

        public final WeakReference<Observer> getDelegateRef() {
            return this.delegateRef;
        }

        public final InvalidationTracker getTracker() {
            return this.tracker;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(Set<String> set) {
            sq8.m48649h(set, "tables");
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(set);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        String lowerCase;
        sq8.m48649h(roomDatabase, "database");
        sq8.m48649h(map, "shadowTablesMap");
        sq8.m48649h(map2, "viewTables");
        sq8.m48649h(strArr, "tableNames");
        this.database = roomDatabase;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new ObservedTableTracker(strArr.length);
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(roomDatabase);
        this.observerMap = new c0f();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            sq8.m48648g(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i));
            String str2 = this.shadowTablesMap.get(strArr[i]);
            if (str2 != null) {
                sq8.m48648g(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.tablesNames = strArr2;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            sq8.m48648g(locale2, "US");
            String lowerCase3 = value.toLowerCase(locale2);
            sq8.m48648g(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String key = entry.getKey();
                sq8.m48648g(locale2, "US");
                String lowerCase4 = key.toLowerCase(locale2);
                sq8.m48648g(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map3 = this.tableIdLookup;
                map3.put(lowerCase4, isa.m32682i(map3, lowerCase3));
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            private final Set<Integer> checkUpdatedTable() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                InvalidationTracker invalidationTracker = this.this$0;
                Set setM39135b = mif.m39135b();
                Cursor cursorQuery$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new ttf(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                while (cursorQuery$default.moveToNext()) {
                    try {
                        setM39135b.add(Integer.valueOf(cursorQuery$default.getInt(0)));
                    } finally {
                    }
                }
                y3i y3iVar = y3i.f54824a;
                tb3.m49666a(cursorQuery$default, null);
                Set<Integer> setM39134a = mif.m39134a(setM39135b);
                if (!setM39134a.isEmpty()) {
                    if (this.this$0.getCleanupStatement$room_runtime_release() == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    peg cleanupStatement$room_runtime_release = this.this$0.getCleanupStatement$room_runtime_release();
                    if (cleanupStatement$room_runtime_release == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    cleanupStatement$room_runtime_release.executeUpdateDelete();
                }
                return setM39134a;
            }

            @Override // java.lang.Runnable
            public void run() {
                Set<Integer> setM40664e;
                AutoCloser autoCloser;
                AutoCloser autoCloser2;
                Lock closeLock$room_runtime_release = this.this$0.getDatabase$room_runtime_release().getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        try {
                        } catch (IllegalStateException unused) {
                            setM40664e = nif.m40664e();
                            closeLock$room_runtime_release.unlock();
                            autoCloser = this.this$0.autoCloser;
                            if (autoCloser != null) {
                            }
                        }
                    } catch (SQLiteException unused2) {
                        setM40664e = nif.m40664e();
                        closeLock$room_runtime_release.unlock();
                        autoCloser = this.this$0.autoCloser;
                        if (autoCloser != null) {
                        }
                    }
                    if (!this.this$0.ensureInitialization$room_runtime_release()) {
                        if (autoCloser2 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (!this.this$0.getPendingRefresh().compareAndSet(true, false)) {
                        closeLock$room_runtime_release.unlock();
                        AutoCloser autoCloser3 = this.this$0.autoCloser;
                        if (autoCloser3 != null) {
                            autoCloser3.decrementCountAndScheduleClose();
                            return;
                        }
                        return;
                    }
                    if (this.this$0.getDatabase$room_runtime_release().inTransaction()) {
                        closeLock$room_runtime_release.unlock();
                        AutoCloser autoCloser4 = this.this$0.autoCloser;
                        if (autoCloser4 != null) {
                            autoCloser4.decrementCountAndScheduleClose();
                            return;
                        }
                        return;
                    }
                    leg writableDatabase = this.this$0.getDatabase$room_runtime_release().getOpenHelper().getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        setM40664e = checkUpdatedTable();
                        writableDatabase.setTransactionSuccessful();
                        closeLock$room_runtime_release.unlock();
                        autoCloser = this.this$0.autoCloser;
                        if (autoCloser != null) {
                            autoCloser.decrementCountAndScheduleClose();
                        }
                        if (!setM40664e.isEmpty()) {
                            c0f observerMap$room_runtime_release = this.this$0.getObserverMap$room_runtime_release();
                            InvalidationTracker invalidationTracker = this.this$0;
                            synchronized (observerMap$room_runtime_release) {
                                Iterator it = invalidationTracker.getObserverMap$room_runtime_release().iterator();
                                while (it.hasNext()) {
                                    ((InvalidationTracker.ObserverWrapper) ((Map.Entry) it.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(setM40664e);
                                }
                                y3i y3iVar = y3i.f54824a;
                            }
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                } finally {
                    closeLock$room_runtime_release.unlock();
                    autoCloser2 = this.this$0.autoCloser;
                    if (autoCloser2 != null) {
                        autoCloser2.decrementCountAndScheduleClose();
                    }
                }
            }
        };
    }

    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            peg pegVar = this.cleanupStatement;
            if (pegVar != null) {
                pegVar.close();
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    private final String[] resolveViews(String[] strArr) {
        Set setM39135b = mif.m39135b();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            Locale locale = Locale.US;
            sq8.m48648g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                sq8.m48648g(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                sq8.m48646e(set);
                setM39135b.addAll(set);
            } else {
                setM39135b.add(str);
            }
        }
        return (String[]) mif.m39134a(setM39135b).toArray(new String[0]);
    }

    private final void startTrackingTable(leg legVar, int i) {
        legVar.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.tablesNames[i];
        for (String str2 : TRIGGERS) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + UPDATE_TABLE_NAME + " SET " + INVALIDATED_COLUMN_NAME + " = 1 WHERE " + TABLE_ID_COLUMN_NAME + " = " + i + " AND " + INVALIDATED_COLUMN_NAME + " = 0; END";
            sq8.m48648g(str3, "StringBuilder().apply(builderAction).toString()");
            legVar.execSQL(str3);
        }
    }

    private final void stopTrackingTable(leg legVar, int i) {
        String str = this.tablesNames[i];
        for (String str2 : TRIGGERS) {
            String str3 = "DROP TRIGGER IF EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2);
            sq8.m48648g(str3, "StringBuilder().apply(builderAction).toString()");
            legVar.execSQL(str3);
        }
    }

    private final String[] validateAndResolveTableNames(String[] strArr) {
        String[] strArrResolveViews = resolveViews(strArr);
        for (String str : strArrResolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale locale = Locale.US;
            sq8.m48648g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return strArrResolveViews;
    }

    @SuppressLint({"RestrictedApi"})
    public void addObserver(Observer observer) {
        ObserverWrapper observerWrapper;
        sq8.m48649h(observer, "observer");
        String[] strArrResolveViews = resolveViews(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(strArrResolveViews.length);
        for (String str : strArrResolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale locale = Locale.US;
            sq8.m48648g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] iArrP0 = kh3.P0(arrayList);
        ObserverWrapper observerWrapper2 = new ObserverWrapper(observer, iArrP0, strArrResolveViews);
        synchronized (this.observerMap) {
            observerWrapper = (ObserverWrapper) this.observerMap.mo19712l(observer, observerWrapper2);
        }
        if (observerWrapper == null && this.observedTableTracker.onAdded(Arrays.copyOf(iArrP0, iArrP0.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    public void addWeakObserver(Observer observer) {
        sq8.m48649h(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    public <T> AbstractC2145n createLiveData(String[] strArr, Callable<T> callable) {
        sq8.m48649h(strArr, "tableNames");
        sq8.m48649h(callable, "computeFunction");
        return createLiveData(strArr, false, callable);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        return this.initialized;
    }

    public final peg getCleanupStatement$room_runtime_release() {
        return this.cleanupStatement;
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final c0f getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    public final String[] getTablesNames$room_runtime_release() {
        return this.tablesNames;
    }

    public final void internalInit$room_runtime_release(leg legVar) {
        sq8.m48649h(legVar, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                return;
            }
            legVar.execSQL("PRAGMA temp_store = MEMORY;");
            legVar.execSQL("PRAGMA recursive_triggers='ON';");
            legVar.execSQL(CREATE_TRACKING_TABLE_SQL);
            syncTriggers$room_runtime_release(legVar);
            this.cleanupStatement = legVar.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.initialized = true;
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void notifyObserversByTableNames(String... strArr) {
        sq8.m48649h(strArr, "tables");
        synchronized (this.observerMap) {
            for (Map.Entry entry : this.observerMap) {
                sq8.m48648g(entry, "(observer, wrapper)");
                Observer observer = (Observer) entry.getKey();
                ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                if (!observer.isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(strArr);
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    public void removeObserver(Observer observer) {
        ObserverWrapper observerWrapper;
        sq8.m48649h(observer, "observer");
        synchronized (this.observerMap) {
            observerWrapper = (ObserverWrapper) this.observerMap.mo19713m(observer);
        }
        if (observerWrapper != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds$room_runtime_release = observerWrapper.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        sq8.m48649h(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: o.mv8
            @Override // java.lang.Runnable
            public final void run() {
                this.f36031a.onAutoCloseCallback();
            }
        });
    }

    public final void setCleanupStatement$room_runtime_release(peg pegVar) {
        this.cleanupStatement = pegVar;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(Context context, String str, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "name");
        sq8.m48649h(intent, "serviceIntent");
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, str, intent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.multiInstanceInvalidationClient = null;
    }

    public final void syncTriggers$room_runtime_release(leg legVar) {
        sq8.m48649h(legVar, "database");
        if (legVar.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    Companion.beginTransactionInternal$room_runtime_release(legVar);
                    try {
                        int length = tablesToSync.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = tablesToSync[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                startTrackingTable(legVar, i2);
                            } else if (i3 == 2) {
                                stopTrackingTable(legVar, i2);
                            }
                            i++;
                            i2 = i4;
                        }
                        legVar.setTransactionSuccessful();
                        legVar.endTransaction();
                        y3i y3iVar = y3i.f54824a;
                    } catch (Throwable th) {
                        legVar.endTransaction();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    public <T> AbstractC2145n createLiveData(String[] strArr, boolean z, Callable<T> callable) {
        sq8.m48649h(strArr, "tableNames");
        sq8.m48649h(callable, "computeFunction");
        return this.invalidationLiveDataContainer.create(validateAndResolveTableNames(strArr), z, callable);
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, isa.m32681h(), isa.m32681h(), (String[]) Arrays.copyOf(strArr, strArr.length));
        sq8.m48649h(roomDatabase, "database");
        sq8.m48649h(strArr, "tableNames");
    }
}
