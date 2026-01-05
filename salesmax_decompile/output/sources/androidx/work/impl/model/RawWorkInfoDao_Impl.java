package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.AbstractC2145n;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001o.oeg;
import p001o.vo0;

/* loaded from: classes2.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
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

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(oeg oegVar) {
        Data dataFromByteArray;
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, oegVar, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, OutcomeConstants.OUTCOME_ID);
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
            int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "generation");
            vo0 vo0Var = new vo0();
            vo0 vo0Var2 = new vo0();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndex);
                if (((ArrayList) vo0Var.get(string)) == null) {
                    vo0Var.put(string, new ArrayList());
                }
                String string2 = cursorQuery.getString(columnIndex);
                if (((ArrayList) vo0Var2.get(string2)) == null) {
                    vo0Var2.put(string2, new ArrayList());
                }
            }
            cursorQuery.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(vo0Var);
            __fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string3 = (columnIndex == -1 || cursorQuery.isNull(columnIndex)) ? null : cursorQuery.getString(columnIndex);
                WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                if (columnIndex3 == -1) {
                    dataFromByteArray = null;
                } else {
                    dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndex3) ? null : cursorQuery.getBlob(columnIndex3));
                }
                int i = columnIndex4 == -1 ? 0 : cursorQuery.getInt(columnIndex4);
                int i2 = columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 0;
                ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(columnIndex));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(columnIndex));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i, i2, arrayList3, arrayList4));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public AbstractC2145n getWorkInfoPojosLiveData(final oeg oegVar) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                Data dataFromByteArray;
                Cursor cursorQuery = DBUtil.query(RawWorkInfoDao_Impl.this.__db, oegVar, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(cursorQuery, OutcomeConstants.OUTCOME_ID);
                    int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                    int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                    vo0 vo0Var = new vo0();
                    vo0 vo0Var2 = new vo0();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        if (((ArrayList) vo0Var.get(string)) == null) {
                            vo0Var.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (((ArrayList) vo0Var2.get(string2)) == null) {
                            vo0Var2.put(string2, new ArrayList());
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(vo0Var);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(vo0Var2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = (columnIndex == -1 || cursorQuery.isNull(columnIndex)) ? null : cursorQuery.getString(columnIndex);
                        WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                        if (columnIndex3 == -1) {
                            dataFromByteArray = null;
                        } else {
                            dataFromByteArray = Data.fromByteArray(cursorQuery.isNull(columnIndex3) ? null : cursorQuery.getBlob(columnIndex3));
                        }
                        int i = columnIndex4 == -1 ? 0 : cursorQuery.getInt(columnIndex4);
                        int i2 = columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 0;
                        ArrayList arrayList2 = (ArrayList) vo0Var.get(cursorQuery.getString(columnIndex));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) vo0Var2.get(cursorQuery.getString(columnIndex));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, i, i2, arrayList3, arrayList4));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }
        });
    }
}
