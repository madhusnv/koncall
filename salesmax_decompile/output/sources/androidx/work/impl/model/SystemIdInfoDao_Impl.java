package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.work.impl.model.SystemIdInfoDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001o.peg;

/* loaded from: classes2.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<SystemIdInfo> __insertionAdapterOfSystemIdInfo;
    private final SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo;
    private final SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo_1;

    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSystemIdInfo = new EntityInsertionAdapter<SystemIdInfo>(roomDatabase) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(peg pegVar, SystemIdInfo systemIdInfo) {
                String str = systemIdInfo.workSpecId;
                if (str == null) {
                    pegVar.bindNull(1);
                } else {
                    pegVar.bindString(1, str);
                }
                pegVar.bindLong(2, systemIdInfo.getGeneration());
                pegVar.bindLong(3, systemIdInfo.systemId);
            }
        };
        this.__preparedStmtOfRemoveSystemIdInfo = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.__preparedStmtOfRemoveSystemIdInfo_1 = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(String str, int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        this.__db.assertNotSuspendingTransaction();
        SystemIdInfo systemIdInfo = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "work_spec_id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "system_id");
            if (cursorQuery.moveToFirst()) {
                if (!cursorQuery.isNull(columnIndexOrThrow)) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
                systemIdInfo = new SystemIdInfo(string, cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3));
            }
            return systemIdInfo;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List<String> getWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(SystemIdInfo systemIdInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSystemIdInfo.insert((EntityInsertionAdapter<SystemIdInfo>) systemIdInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str, int i) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfRemoveSystemIdInfo.acquire();
        if (str == null) {
            pegVarAcquire.bindNull(1);
        } else {
            pegVarAcquire.bindString(1, str);
        }
        pegVarAcquire.bindLong(2, i);
        this.__db.beginTransaction();
        try {
            pegVarAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveSystemIdInfo.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str) {
        this.__db.assertNotSuspendingTransaction();
        peg pegVarAcquire = this.__preparedStmtOfRemoveSystemIdInfo_1.acquire();
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
            this.__preparedStmtOfRemoveSystemIdInfo_1.release(pegVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(WorkGenerationalId workGenerationalId) {
        return SystemIdInfoDao.DefaultImpls.getSystemIdInfo(this, workGenerationalId);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(WorkGenerationalId workGenerationalId) {
        SystemIdInfoDao.DefaultImpls.removeSystemIdInfo(this, workGenerationalId);
    }
}
