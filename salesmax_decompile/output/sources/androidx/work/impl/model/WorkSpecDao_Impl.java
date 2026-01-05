package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.AbstractC2145n;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001o.peg;
import p001o.vo0;

/* loaded from: classes2.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<WorkSpec> __insertionAdapterOfWorkSpec;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfIncrementGeneration;
    private final SharedSQLiteStatement __preparedStmtOfIncrementPeriodCount;
    private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;

    /* renamed from: __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast */
    private final SharedSQLiteStatement f10574xd91a9514;
    private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfSetLastEnqueuedTime;
    private final SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final SharedSQLiteStatement __preparedStmtOfSetState;
    private final EntityDeletionOrUpdateAdapter<WorkSpec> __updateAdapterOfWorkSpec;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter<WorkSpec>(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(peg pegVar, WorkSpec workSpec) throws Throwable {
                String str = workSpec.id;
                if (str == null) {
                    pegVar.bindNull(1);
                } else {
                    pegVar.bindString(1, str);
                }
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                pegVar.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                String str2 = workSpec.workerClassName;
                if (str2 == null) {
                    pegVar.bindNull(3);
                } else {
                    pegVar.bindString(3, str2);
                }
                String str3 = workSpec.inputMergerClassName;
                if (str3 == null) {
                    pegVar.bindNull(4);
                } else {
                    pegVar.bindString(4, str3);
                }
                byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec.input);
                if (byteArrayInternal == null) {
                    pegVar.bindNull(5);
                } else {
                    pegVar.bindBlob(5, byteArrayInternal);
                }
                byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec.output);
                if (byteArrayInternal2 == null) {
                    pegVar.bindNull(6);
                } else {
                    pegVar.bindBlob(6, byteArrayInternal2);
                }
                pegVar.bindLong(7, workSpec.initialDelay);
                pegVar.bindLong(8, workSpec.intervalDuration);
                pegVar.bindLong(9, workSpec.flexDuration);
                pegVar.bindLong(10, workSpec.runAttemptCount);
                pegVar.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                pegVar.bindLong(12, workSpec.backoffDelayDuration);
                pegVar.bindLong(13, workSpec.lastEnqueueTime);
                pegVar.bindLong(14, workSpec.minimumRetentionDuration);
                pegVar.bindLong(15, workSpec.scheduleRequestedAt);
                pegVar.bindLong(16, workSpec.expedited ? 1L : 0L);
                pegVar.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                pegVar.bindLong(18, workSpec.getPeriodCount());
                pegVar.bindLong(19, workSpec.getGeneration());
                Constraints constraints = workSpec.constraints;
                if (constraints == null) {
                    pegVar.bindNull(20);
                    pegVar.bindNull(21);
                    pegVar.bindNull(22);
                    pegVar.bindNull(23);
                    pegVar.bindNull(24);
                    pegVar.bindNull(25);
                    pegVar.bindNull(26);
                    pegVar.bindNull(27);
                    return;
                }
                pegVar.bindLong(20, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                pegVar.bindLong(21, constraints.requiresCharging() ? 1L : 0L);
                pegVar.bindLong(22, constraints.requiresDeviceIdle() ? 1L : 0L);
                pegVar.bindLong(23, constraints.requiresBatteryNotLow() ? 1L : 0L);
                pegVar.bindLong(24, constraints.requiresStorageNotLow() ? 1L : 0L);
                pegVar.bindLong(25, constraints.getContentTriggerUpdateDelayMillis());
                pegVar.bindLong(26, constraints.getContentTriggerMaxDelayMillis());
                byte[] ofTriggersToByteArray = WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                if (ofTriggersToByteArray == null) {
                    pegVar.bindNull(27);
                } else {
                    pegVar.bindBlob(27, ofTriggersToByteArray);
                }
            }
        };
        this.__updateAdapterOfWorkSpec = new EntityDeletionOrUpdateAdapter<WorkSpec>(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(peg pegVar, WorkSpec workSpec) throws Throwable {
                String str = workSpec.id;
                if (str == null) {
                    pegVar.bindNull(1);
                } else {
                    pegVar.bindString(1, str);
                }
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                pegVar.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                String str2 = workSpec.workerClassName;
                if (str2 == null) {
                    pegVar.bindNull(3);
                } else {
                    pegVar.bindString(3, str2);
                }
                String str3 = workSpec.inputMergerClassName;
                if (str3 == null) {
                    pegVar.bindNull(4);
                } else {
                    pegVar.bindString(4, str3);
                }
                byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec.input);
                if (byteArrayInternal == null) {
                    pegVar.bindNull(5);
                } else {
                    pegVar.bindBlob(5, byteArrayInternal);
                }
                byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec.output);
                if (byteArrayInternal2 == null) {
                    pegVar.bindNull(6);
                } else {
                    pegVar.bindBlob(6, byteArrayInternal2);
                }
                pegVar.bindLong(7, workSpec.initialDelay);
                pegVar.bindLong(8, workSpec.intervalDuration);
                pegVar.bindLong(9, workSpec.flexDuration);
                pegVar.bindLong(10, workSpec.runAttemptCount);
                pegVar.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                pegVar.bindLong(12, workSpec.backoffDelayDuration);
                pegVar.bindLong(13, workSpec.lastEnqueueTime);
                pegVar.bindLong(14, workSpec.minimumRetentionDuration);
                pegVar.bindLong(15, workSpec.scheduleRequestedAt);
                pegVar.bindLong(16, workSpec.expedited ? 1L : 0L);
                pegVar.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                pegVar.bindLong(18, workSpec.getPeriodCount());
                pegVar.bindLong(19, workSpec.getGeneration());
                Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    pegVar.bindLong(20, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    pegVar.bindLong(21, constraints.requiresCharging() ? 1L : 0L);
                    pegVar.bindLong(22, constraints.requiresDeviceIdle() ? 1L : 0L);
                    pegVar.bindLong(23, constraints.requiresBatteryNotLow() ? 1L : 0L);
                    pegVar.bindLong(24, constraints.requiresStorageNotLow() ? 1L : 0L);
                    pegVar.bindLong(25, constraints.getContentTriggerUpdateDelayMillis());
                    pegVar.bindLong(26, constraints.getContentTriggerMaxDelayMillis());
                    byte[] ofTriggersToByteArray = WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                    if (ofTriggersToByteArray == null) {
                        pegVar.bindNull(27);
                    } else {
                        pegVar.bindBlob(27, ofTriggersToByteArray);
                    }
                } else {
                    pegVar.bindNull(20);
                    pegVar.bindNull(21);
                    pegVar.bindNull(22);
                    pegVar.bindNull(23);
                    pegVar.bindNull(24);
                    pegVar.bindNull(25);
                    pegVar.bindNull(26);
                    pegVar.bindNull(27);
                }
                String str4 = workSpec.id;
                if (str4 == null) {
                    pegVar.bindNull(28);
                } else {
                    pegVar.bindString(28, str4);
                }
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetState = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementPeriodCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetLastEnqueuedTime = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.10
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.11
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.f10574xd91a9514 = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.12
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.__preparedStmtOfIncrementGeneration = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.13
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(vo0 vo0Var) {
        Set<String> setKeySet = vo0Var.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (vo0Var.size() > 999) {
            vo0 vo0Var2 = new vo0(999);
            int size = vo0Var.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                vo0Var2.put((String) vo0Var.m36227g(i), (ArrayList) vo0Var.m36228o(i));
                i++;
                i2++;
                if (i2 == 999) {
                    __fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                    vo0Var2 = new vo0(999);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size2 + 0);
        int i3 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i3);
            } else {
                roomSQLiteQueryAcquire.bindString(i3, str);
            }
            i3++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList arrayList = (ArrayList) vo0Var.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(cursorQuery.isNull(0) ? null : cursorQuery.getBlob(0)));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(vo0 vo0Var) {
        Set<String> setKeySet = vo0Var.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (vo0Var.size() > 999) {
            vo0 vo0Var2 = new vo0(999);
            int size = vo0Var.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                vo0Var2.put((String) vo0Var.m36227g(i), (ArrayList) vo0Var.m36228o(i));
                i++;
                i2++;
                if (i2 == 999) {
                    __fetchRelationshipWorkTagAsjavaLangString(vo0Var2);
                    vo0Var2 = new vo0(999);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(vo0Var2);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size2 + 0);
        int i3 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i3);
            } else {
                roomSQLiteQueryAcquire.bindString(i3, str);
            }
            i3++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList arrayList = (ArrayList) vo0Var.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            pegVarAcquire.bindNull(1);
        } else {
            pegVarAcquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getBlob(columnIndexOrThrow6));
                    long j = cursorQuery.getLong(columnIndexOrThrow7);
                    long j2 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i8 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j4 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j5 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i9 = i7;
                    long j6 = cursorQuery.getLong(i9);
                    int i10 = columnIndexOrThrow;
                    int i11 = columnIndexOrThrow15;
                    long j7 = cursorQuery.getLong(i11);
                    columnIndexOrThrow15 = i11;
                    int i12 = columnIndexOrThrow16;
                    if (cursorQuery.getInt(i12) != 0) {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i2));
                    columnIndexOrThrow17 = i2;
                    int i13 = columnIndexOrThrow18;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow18 = i13;
                    int i15 = columnIndexOrThrow19;
                    int i16 = cursorQuery.getInt(i15);
                    columnIndexOrThrow19 = i15;
                    int i17 = columnIndexOrThrow20;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i17));
                    columnIndexOrThrow20 = i17;
                    int i18 = columnIndexOrThrow21;
                    if (cursorQuery.getInt(i18) != 0) {
                        columnIndexOrThrow21 = i18;
                        i3 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i18;
                        i3 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (cursorQuery.getInt(i3) != 0) {
                        columnIndexOrThrow22 = i3;
                        i4 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i3;
                        i4 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (cursorQuery.getInt(i4) != 0) {
                        columnIndexOrThrow23 = i4;
                        i5 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i4;
                        i5 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (cursorQuery.getInt(i5) != 0) {
                        columnIndexOrThrow24 = i5;
                        i6 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i5;
                        i6 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = cursorQuery.getLong(i6);
                    columnIndexOrThrow25 = i6;
                    int i19 = columnIndexOrThrow26;
                    long j9 = cursorQuery.getLong(i19);
                    columnIndexOrThrow26 = i19;
                    int i20 = columnIndexOrThrow27;
                    columnIndexOrThrow27 = i20;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j2, j3, new Constraints(networkTypeIntToNetworkType, z2, z3, z4, z5, j8, j9, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.isNull(i20) ? null : cursorQuery.getBlob(i20))), i8, backoffPolicyIntToBackoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i14, i16));
                    columnIndexOrThrow = i10;
                    i7 = i9;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public AbstractC2145n getAllWorkSpecIdsLiveData() {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new Callable<List<String>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.14
            public void finalize() {
                roomSQLiteQueryAcquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<String> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorQuery = DBUtil.query(WorkSpecDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        cursorQuery.close();
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getBlob(columnIndexOrThrow6));
                    long j = cursorQuery.getLong(columnIndexOrThrow7);
                    long j2 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i8 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j4 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j5 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i9 = i7;
                    long j6 = cursorQuery.getLong(i9);
                    int i10 = columnIndexOrThrow;
                    int i11 = columnIndexOrThrow15;
                    long j7 = cursorQuery.getLong(i11);
                    columnIndexOrThrow15 = i11;
                    int i12 = columnIndexOrThrow16;
                    if (cursorQuery.getInt(i12) != 0) {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i2));
                    columnIndexOrThrow17 = i2;
                    int i13 = columnIndexOrThrow18;
                    int i14 = cursorQuery.getInt(i13);
                    columnIndexOrThrow18 = i13;
                    int i15 = columnIndexOrThrow19;
                    int i16 = cursorQuery.getInt(i15);
                    columnIndexOrThrow19 = i15;
                    int i17 = columnIndexOrThrow20;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i17));
                    columnIndexOrThrow20 = i17;
                    int i18 = columnIndexOrThrow21;
                    if (cursorQuery.getInt(i18) != 0) {
                        columnIndexOrThrow21 = i18;
                        i3 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i18;
                        i3 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (cursorQuery.getInt(i3) != 0) {
                        columnIndexOrThrow22 = i3;
                        i4 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i3;
                        i4 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (cursorQuery.getInt(i4) != 0) {
                        columnIndexOrThrow23 = i4;
                        i5 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i4;
                        i5 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (cursorQuery.getInt(i5) != 0) {
                        columnIndexOrThrow24 = i5;
                        i6 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i5;
                        i6 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = cursorQuery.getLong(i6);
                    columnIndexOrThrow25 = i6;
                    int i19 = columnIndexOrThrow26;
                    long j9 = cursorQuery.getLong(i19);
                    columnIndexOrThrow26 = i19;
                    int i20 = columnIndexOrThrow27;
                    columnIndexOrThrow27 = i20;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j2, j3, new Constraints(networkTypeIntToNetworkType, z2, z3, z4, z5, j8, j9, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.isNull(i20) ? null : cursorQuery.getBlob(i20))), i8, backoffPolicyIntToBackoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i14, i16));
                    columnIndexOrThrow = i10;
                    i7 = i9;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(Data.fromByteArray(cursorQuery.isNull(0) ? null : cursorQuery.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(long j) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getBlob(columnIndexOrThrow6));
                    long j2 = cursorQuery.getLong(columnIndexOrThrow7);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j4 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j5 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j6 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i8 = i6;
                    long j7 = cursorQuery.getLong(i8);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    long j8 = cursorQuery.getLong(i10);
                    columnIndexOrThrow15 = i10;
                    int i11 = columnIndexOrThrow16;
                    if (cursorQuery.getInt(i11) != 0) {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i));
                    columnIndexOrThrow17 = i;
                    int i12 = columnIndexOrThrow18;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow18 = i12;
                    int i14 = columnIndexOrThrow19;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow19 = i14;
                    int i16 = columnIndexOrThrow20;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i16));
                    columnIndexOrThrow20 = i16;
                    int i17 = columnIndexOrThrow21;
                    if (cursorQuery.getInt(i17) != 0) {
                        columnIndexOrThrow21 = i17;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i17;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (cursorQuery.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (cursorQuery.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (cursorQuery.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j9 = cursorQuery.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i18 = columnIndexOrThrow26;
                    long j10 = cursorQuery.getLong(i18);
                    columnIndexOrThrow26 = i18;
                    int i19 = columnIndexOrThrow27;
                    columnIndexOrThrow27 = i19;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkTypeIntToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.isNull(i19) ? null : cursorQuery.getBlob(i19))), i7, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i13, i15));
                    columnIndexOrThrow = i9;
                    i6 = i8;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getBlob(columnIndexOrThrow6));
                    long j = cursorQuery.getLong(columnIndexOrThrow7);
                    long j2 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j4 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j5 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i8 = i6;
                    long j6 = cursorQuery.getLong(i8);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    long j7 = cursorQuery.getLong(i10);
                    columnIndexOrThrow15 = i10;
                    int i11 = columnIndexOrThrow16;
                    if (cursorQuery.getInt(i11) != 0) {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i));
                    columnIndexOrThrow17 = i;
                    int i12 = columnIndexOrThrow18;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow18 = i12;
                    int i14 = columnIndexOrThrow19;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow19 = i14;
                    int i16 = columnIndexOrThrow20;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i16));
                    columnIndexOrThrow20 = i16;
                    int i17 = columnIndexOrThrow21;
                    if (cursorQuery.getInt(i17) != 0) {
                        columnIndexOrThrow21 = i17;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i17;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (cursorQuery.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (cursorQuery.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (cursorQuery.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = cursorQuery.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i18 = columnIndexOrThrow26;
                    long j9 = cursorQuery.getLong(i18);
                    columnIndexOrThrow26 = i18;
                    int i19 = columnIndexOrThrow27;
                    columnIndexOrThrow27 = i19;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j2, j3, new Constraints(networkTypeIntToNetworkType, z2, z3, z4, z5, j8, j9, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.isNull(i19) ? null : cursorQuery.getBlob(i19))), i7, backoffPolicyIntToBackoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i13, i15));
                    columnIndexOrThrow = i9;
                    i6 = i8;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public AbstractC2145n getScheduleRequestedAtLiveData(String str) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new Callable<Long>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.18
            public void finalize() {
                roomSQLiteQueryAcquire.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                Cursor cursorQuery = DBUtil.query(WorkSpecDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    return Long.valueOf(cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L);
                } finally {
                    cursorQuery.close();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getBlob(columnIndexOrThrow6));
                    long j = cursorQuery.getLong(columnIndexOrThrow7);
                    long j2 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j4 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j5 = cursorQuery.getLong(columnIndexOrThrow13);
                    int i8 = i6;
                    long j6 = cursorQuery.getLong(i8);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    long j7 = cursorQuery.getLong(i10);
                    columnIndexOrThrow15 = i10;
                    int i11 = columnIndexOrThrow16;
                    if (cursorQuery.getInt(i11) != 0) {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i));
                    columnIndexOrThrow17 = i;
                    int i12 = columnIndexOrThrow18;
                    int i13 = cursorQuery.getInt(i12);
                    columnIndexOrThrow18 = i12;
                    int i14 = columnIndexOrThrow19;
                    int i15 = cursorQuery.getInt(i14);
                    columnIndexOrThrow19 = i14;
                    int i16 = columnIndexOrThrow20;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i16));
                    columnIndexOrThrow20 = i16;
                    int i17 = columnIndexOrThrow21;
                    if (cursorQuery.getInt(i17) != 0) {
                        columnIndexOrThrow21 = i17;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i17;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (cursorQuery.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (cursorQuery.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (cursorQuery.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = cursorQuery.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i18 = columnIndexOrThrow26;
                    long j9 = cursorQuery.getLong(i18);
                    columnIndexOrThrow26 = i18;
                    int i19 = columnIndexOrThrow27;
                    columnIndexOrThrow27 = i19;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j2, j3, new Constraints(networkTypeIntToNetworkType, z2, z3, z4, z5, j8, j9, WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.isNull(i19) ? null : cursorQuery.getBlob(i19))), i7, backoffPolicyIntToBackoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i13, i15));
                    columnIndexOrThrow = i9;
                    i6 = i8;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        WorkInfo.State stateIntToState = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                Integer numValueOf = cursorQuery.isNull(0) ? null : Integer.valueOf(cursorQuery.getInt(0));
                if (numValueOf != null) {
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    stateIntToState = WorkTypeConverters.intToState(numValueOf.intValue());
                }
            }
            return stateIntToState;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getBlob(columnIndexOrThrow5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getBlob(columnIndexOrThrow6));
                    long j = cursorQuery.getLong(columnIndexOrThrow7);
                    long j2 = cursorQuery.getLong(columnIndexOrThrow8);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow9);
                    int i6 = cursorQuery.getInt(columnIndexOrThrow10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow11));
                    long j4 = cursorQuery.getLong(columnIndexOrThrow12);
                    long j5 = cursorQuery.getLong(columnIndexOrThrow13);
                    long j6 = cursorQuery.getLong(columnIndexOrThrow14);
                    long j7 = cursorQuery.getLong(columnIndexOrThrow15);
                    if (cursorQuery.getInt(columnIndexOrThrow16) != 0) {
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i));
                    int i7 = cursorQuery.getInt(columnIndexOrThrow18);
                    int i8 = cursorQuery.getInt(columnIndexOrThrow19);
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow20));
                    if (cursorQuery.getInt(columnIndexOrThrow21) != 0) {
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (cursorQuery.getInt(i2) != 0) {
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (cursorQuery.getInt(i3) != 0) {
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (cursorQuery.getInt(i4) != 0) {
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    workSpec = new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j2, j3, new Constraints(networkTypeIntToNetworkType, z2, z3, z4, z5, cursorQuery.getLong(i5), cursorQuery.getLong(columnIndexOrThrow26), WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.isNull(columnIndexOrThrow27) ? null : cursorQuery.getBlob(columnIndexOrThrow27))), i6, backoffPolicyIntToBackoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i7, i8);
                } else {
                    workSpec = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new WorkSpec.IdAndState(cursorQuery.isNull(0) ? null : cursorQuery.getString(0), WorkTypeConverters.intToState(cursorQuery.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            WorkSpec.WorkInfoPojo workInfoPojo = null;
            byte[] blob = null;
            Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, true, null);
            try {
                vo0 vo0Var = new vo0();
                vo0 vo0Var2 = new vo0();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var.get(string)) == null) {
                        vo0Var.put(string, new ArrayList());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var2.get(string2)) == null) {
                        vo0Var2.put(string2, new ArrayList());
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                if (cursorQuery.moveToFirst()) {
                    String string3 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                    if (!cursorQuery.isNull(2)) {
                        blob = cursorQuery.getBlob(2);
                    }
                    Data dataFromByteArray = Data.fromByteArray(blob);
                    int i = cursorQuery.getInt(3);
                    int i2 = cursorQuery.getInt(4);
                    ArrayList arrayList = (ArrayList) vo0Var.get(cursorQuery.getString(0));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = (ArrayList) vo0Var2.get(cursorQuery.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    workInfoPojo = new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i, i2, arrayList2, arrayList3);
                }
                this.__db.setTransactionSuccessful();
                return workInfoPojo;
            } finally {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindString(i, str);
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, true, null);
            try {
                vo0 vo0Var = new vo0();
                vo0 vo0Var2 = new vo0();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var.get(string)) == null) {
                        vo0Var.put(string, new ArrayList());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var2.get(string2)) == null) {
                        vo0Var2.put(string2, new ArrayList());
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string3 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(2) ? null : cursorQuery.getBlob(2));
                    int i2 = cursorQuery.getInt(3);
                    int i3 = cursorQuery.getInt(4);
                    ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i2, i3, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, true, null);
            try {
                vo0 vo0Var = new vo0();
                vo0 vo0Var2 = new vo0();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var.get(string)) == null) {
                        vo0Var.put(string, new ArrayList());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var2.get(string2)) == null) {
                        vo0Var2.put(string2, new ArrayList());
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string3 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(2) ? null : cursorQuery.getBlob(2));
                    int i = cursorQuery.getInt(3);
                    int i2 = cursorQuery.getInt(4);
                    ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i, i2, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, true, null);
            try {
                vo0 vo0Var = new vo0();
                vo0 vo0Var2 = new vo0();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var.get(string)) == null) {
                        vo0Var.put(string, new ArrayList());
                    }
                    String string2 = cursorQuery.getString(0);
                    if (((ArrayList) vo0Var2.get(string2)) == null) {
                        vo0Var2.put(string2, new ArrayList());
                    }
                }
                cursorQuery.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                __fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string3 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(2) ? null : cursorQuery.getBlob(2));
                    int i = cursorQuery.getInt(3);
                    int i2 = cursorQuery.getInt(4);
                    ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i, i2, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public AbstractC2145n getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindString(i, str);
            }
            i++;
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.15
            public void finalize() {
                roomSQLiteQueryAcquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorQuery = DBUtil.query(WorkSpecDao_Impl.this.__db, roomSQLiteQueryAcquire, true, null);
                    try {
                        vo0 vo0Var = new vo0();
                        vo0 vo0Var2 = new vo0();
                        while (cursorQuery.moveToNext()) {
                            String string = cursorQuery.getString(0);
                            if (((ArrayList) vo0Var.get(string)) == null) {
                                vo0Var.put(string, new ArrayList());
                            }
                            String string2 = cursorQuery.getString(0);
                            if (((ArrayList) vo0Var2.get(string2)) == null) {
                                vo0Var2.put(string2, new ArrayList());
                            }
                        }
                        cursorQuery.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            String string3 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(2) ? null : cursorQuery.getBlob(2));
                            int i2 = cursorQuery.getInt(3);
                            int i3 = cursorQuery.getInt(4);
                            ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i2, i3, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        cursorQuery.close();
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public AbstractC2145n getWorkStatusPojoLiveDataForName(String str) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.17
            public void finalize() {
                roomSQLiteQueryAcquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorQuery = DBUtil.query(WorkSpecDao_Impl.this.__db, roomSQLiteQueryAcquire, true, null);
                    try {
                        vo0 vo0Var = new vo0();
                        vo0 vo0Var2 = new vo0();
                        while (cursorQuery.moveToNext()) {
                            String string = cursorQuery.getString(0);
                            if (((ArrayList) vo0Var.get(string)) == null) {
                                vo0Var.put(string, new ArrayList());
                            }
                            String string2 = cursorQuery.getString(0);
                            if (((ArrayList) vo0Var2.get(string2)) == null) {
                                vo0Var2.put(string2, new ArrayList());
                            }
                        }
                        cursorQuery.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            String string3 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(2) ? null : cursorQuery.getBlob(2));
                            int i = cursorQuery.getInt(3);
                            int i2 = cursorQuery.getInt(4);
                            ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i, i2, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        cursorQuery.close();
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public AbstractC2145n getWorkStatusPojoLiveDataForTag(String str) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.16
            public void finalize() {
                roomSQLiteQueryAcquire.release();
            }

            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorQuery = DBUtil.query(WorkSpecDao_Impl.this.__db, roomSQLiteQueryAcquire, true, null);
                    try {
                        vo0 vo0Var = new vo0();
                        vo0 vo0Var2 = new vo0();
                        while (cursorQuery.moveToNext()) {
                            String string = cursorQuery.getString(0);
                            if (((ArrayList) vo0Var.get(string)) == null) {
                                vo0Var.put(string, new ArrayList());
                            }
                            String string2 = cursorQuery.getString(0);
                            if (((ArrayList) vo0Var2.get(string2)) == null) {
                                vo0Var2.put(string2, new ArrayList());
                            }
                        }
                        cursorQuery.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            String string3 = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorQuery.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(2) ? null : cursorQuery.getBlob(2));
                            int i = cursorQuery.getInt(3);
                            int i2 = cursorQuery.getInt(4);
                            ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i, i2, arrayList3, arrayList4));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        cursorQuery.close();
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
        boolean z = false;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(String str) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfIncrementGeneration.acquire();
        if (str == null) {
            pegVarAcquire.bindNull(1);
        } else {
            pegVarAcquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementGeneration.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfIncrementPeriodCount.acquire();
        if (str == null) {
            pegVarAcquire.bindNull(1);
        } else {
            pegVarAcquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementPeriodCount.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            pegVarAcquire.bindNull(1);
        } else {
            pegVarAcquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert((EntityInsertionAdapter<WorkSpec>) workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        pegVarAcquire.bindLong(1, j);
        if (str == null) {
            pegVarAcquire.bindNull(2);
        } else {
            pegVarAcquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.f10574xd91a9514.acquire();
        this.__db.beginTransaction();
        try {
            pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.f10574xd91a9514.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfResetScheduledState.acquire();
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            pegVarAcquire.bindNull(1);
        } else {
            pegVarAcquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueuedTime(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfSetLastEnqueuedTime.acquire();
        pegVarAcquire.bindLong(1, j);
        if (str == null) {
            pegVarAcquire.bindNull(2);
        } else {
            pegVarAcquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetLastEnqueuedTime.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) throws Throwable {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfSetOutput.acquire();
        byte[] byteArrayInternal = Data.toByteArrayInternal(data);
        if (byteArrayInternal == null) {
            pegVarAcquire.bindNull(1);
        } else {
            pegVarAcquire.bindBlob(1, byteArrayInternal);
        }
        if (str == null) {
            pegVarAcquire.bindNull(2);
        } else {
            pegVarAcquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String str) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfSetState.acquire();
        pegVarAcquire.bindLong(1, WorkTypeConverters.stateToInt(state));
        if (str == null) {
            pegVarAcquire.bindNull(2);
        } else {
            pegVarAcquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetState.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfWorkSpec.handle(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
