package p001o;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class s83 implements r83 {

    /* renamed from: a */
    public final RoomDatabase f44921a;

    /* renamed from: b */
    public final EntityInsertionAdapter f44922b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter f44923c;

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f44924d;

    /* renamed from: o.s83$a */
    public class C16768a extends EntityInsertionAdapter {
        public C16768a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, q83 q83Var) {
            pegVar.bindLong(1, q83Var.m44963d());
            if (q83Var.m44964e() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, q83Var.m44964e());
            }
            if (q83Var.m44962c() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, q83Var.m44962c());
            }
            if (q83Var.m44965f() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, q83Var.m44965f());
            }
            pegVar.bindLong(5, q83Var.m44966g());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `checkpoint` (`id`,`name`,`accountId`,`userId`,`value`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    /* renamed from: o.s83$b */
    public class C16769b extends EntityDeletionOrUpdateAdapter {
        public C16769b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, q83 q83Var) {
            pegVar.bindLong(1, q83Var.m44963d());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `checkpoint` WHERE `id` = ?";
        }
    }

    /* renamed from: o.s83$c */
    public class C16770c extends EntityDeletionOrUpdateAdapter {
        public C16770c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, q83 q83Var) {
            pegVar.bindLong(1, q83Var.m44963d());
            if (q83Var.m44964e() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, q83Var.m44964e());
            }
            if (q83Var.m44962c() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, q83Var.m44962c());
            }
            if (q83Var.m44965f() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, q83Var.m44965f());
            }
            pegVar.bindLong(5, q83Var.m44966g());
            pegVar.bindLong(6, q83Var.m44963d());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `checkpoint` SET `id` = ?,`name` = ?,`accountId` = ?,`userId` = ?,`value` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: o.s83$d */
    public class CallableC16771d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ q83 f44928a;

        public CallableC16771d(q83 q83Var) {
            this.f44928a = q83Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            s83.this.f44921a.beginTransaction();
            try {
                s83.this.f44922b.insert((EntityInsertionAdapter) this.f44928a);
                s83.this.f44921a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                s83.this.f44921a.endTransaction();
            }
        }
    }

    /* renamed from: o.s83$e */
    public class CallableC16772e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ q83 f44930a;

        public CallableC16772e(q83 q83Var) {
            this.f44930a = q83Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            s83.this.f44921a.beginTransaction();
            try {
                s83.this.f44924d.handle(this.f44930a);
                s83.this.f44921a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                s83.this.f44921a.endTransaction();
            }
        }
    }

    /* renamed from: o.s83$f */
    public class CallableC16773f implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f44932a;

        public CallableC16773f(RoomSQLiteQuery roomSQLiteQuery) {
            this.f44932a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q83 call() {
            q83 q83Var = null;
            Cursor cursorQuery = DBUtil.query(s83.this.f44921a, this.f44932a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "accountId");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                if (cursorQuery.moveToFirst()) {
                    q83Var = new q83(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5));
                }
                return q83Var;
            } finally {
                cursorQuery.close();
                this.f44932a.release();
            }
        }
    }

    public s83(RoomDatabase roomDatabase) {
        this.f44921a = roomDatabase;
        this.f44922b = new C16768a(roomDatabase);
        this.f44923c = new C16769b(roomDatabase);
        this.f44924d = new C16770c(roomDatabase);
    }

    /* renamed from: g */
    public static List m47972g() {
        return Collections.emptyList();
    }

    @Override // p001o.r83
    /* renamed from: a */
    public Object mo46337a(String str, String str2, String str3, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM checkpoint WHERE name = ? and accountId = ? and userId = ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        if (str3 == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, str3);
        }
        return CoroutinesRoom.execute(this.f44921a, false, DBUtil.createCancellationSignal(), new CallableC16773f(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.r83
    /* renamed from: b */
    public Object mo46338b(q83 q83Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f44921a, true, new CallableC16771d(q83Var), n64Var);
    }

    @Override // p001o.r83
    /* renamed from: c */
    public Object mo46339c(q83 q83Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f44921a, true, new CallableC16772e(q83Var), n64Var);
    }
}
