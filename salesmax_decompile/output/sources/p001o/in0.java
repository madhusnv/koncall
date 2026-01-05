package p001o;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.http.cookie.ClientCookie;
import p001o.gn0;

/* loaded from: classes.dex */
public final class in0 implements gn0 {

    /* renamed from: a */
    public final RoomDatabase f28933a;

    /* renamed from: b */
    public final EntityInsertionAdapter f28934b;

    /* renamed from: c */
    public final SharedSQLiteStatement f28935c;

    /* renamed from: o.in0$a */
    public class C14329a extends EntityInsertionAdapter {
        public C14329a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, fn0 fn0Var) {
            pegVar.bindLong(1, fn0Var.m27113d());
            if (fn0Var.m27117h() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, fn0Var.m27117h());
            }
            if (fn0Var.m27115f() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, fn0Var.m27115f());
            }
            if (fn0Var.m27114e() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, fn0Var.m27114e());
            }
            if (fn0Var.m27112c() == null) {
                pegVar.bindNull(5);
            } else {
                pegVar.bindString(5, fn0Var.m27112c());
            }
            if ((fn0Var.m27116g() == null ? null : Integer.valueOf(fn0Var.m27116g().booleanValue() ? 1 : 0)) == null) {
                pegVar.bindNull(6);
            } else {
                pegVar.bindLong(6, r5.intValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `app_version` (`id`,`version`,`model`,`manufacturer`,`androidVersion`,`persisted`) VALUES (?,?,?,?,?,?)";
        }
    }

    /* renamed from: o.in0$b */
    public class C14330b extends SharedSQLiteStatement {
        public C14330b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "\n        UPDATE app_version SET persisted = ? WHERE id = ?\n    ";
        }
    }

    /* renamed from: o.in0$c */
    public class CallableC14331c implements Callable {

        /* renamed from: a */
        public final /* synthetic */ fn0 f28938a;

        public CallableC14331c(fn0 fn0Var) {
            this.f28938a = fn0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            in0.this.f28933a.beginTransaction();
            try {
                in0.this.f28934b.insert((EntityInsertionAdapter) this.f28938a);
                in0.this.f28933a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                in0.this.f28933a.endTransaction();
            }
        }
    }

    /* renamed from: o.in0$d */
    public class CallableC14332d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ boolean f28940a;

        /* renamed from: b */
        public final /* synthetic */ int f28941b;

        public CallableC14332d(boolean z, int i) {
            this.f28940a = z;
            this.f28941b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            peg pegVarAcquire = in0.this.f28935c.acquire();
            pegVarAcquire.bindLong(1, this.f28940a ? 1L : 0L);
            pegVarAcquire.bindLong(2, this.f28941b);
            try {
                in0.this.f28933a.beginTransaction();
                try {
                    pegVarAcquire.executeUpdateDelete();
                    in0.this.f28933a.setTransactionSuccessful();
                    return y3i.f54824a;
                } finally {
                    in0.this.f28933a.endTransaction();
                }
            } finally {
                in0.this.f28935c.release(pegVarAcquire);
            }
        }
    }

    /* renamed from: o.in0$e */
    public class CallableC14333e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f28943a;

        public CallableC14333e(RoomSQLiteQuery roomSQLiteQuery) {
            this.f28943a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public fn0 call() {
            fn0 fn0Var = null;
            Boolean boolValueOf = null;
            Cursor cursorQuery = DBUtil.query(in0.this.f28933a, this.f28943a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ClientCookie.VERSION_ATTR);
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "model");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "manufacturer");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "androidVersion");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                if (cursorQuery.moveToFirst()) {
                    int i = cursorQuery.getInt(columnIndexOrThrow);
                    String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6));
                    if (numValueOf != null) {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    fn0Var = new fn0(i, string, string2, string3, string4, boolValueOf);
                }
                return fn0Var;
            } finally {
                cursorQuery.close();
                this.f28943a.release();
            }
        }
    }

    public in0(RoomDatabase roomDatabase) {
        this.f28933a = roomDatabase;
        this.f28934b = new C14329a(roomDatabase);
        this.f28935c = new C14330b(roomDatabase);
    }

    /* renamed from: i */
    public static List m32428i() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Object m32429j(fn0 fn0Var, n64 n64Var) {
        return gn0.C13793a.m29144a(this, fn0Var, n64Var);
    }

    @Override // p001o.gn0
    /* renamed from: a */
    public Object mo29140a(int i, boolean z, n64 n64Var) {
        return CoroutinesRoom.execute(this.f28933a, true, new CallableC14332d(z, i), n64Var);
    }

    @Override // p001o.gn0
    /* renamed from: b */
    public Object mo29141b(final fn0 fn0Var, n64 n64Var) {
        return RoomDatabaseKt.withTransaction(this.f28933a, new xk7() { // from class: o.hn0
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return this.f27196a.m32429j(fn0Var, (n64) obj);
            }
        }, n64Var);
    }

    @Override // p001o.gn0
    /* renamed from: c */
    public Object mo29142c(fn0 fn0Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f28933a, true, new CallableC14331c(fn0Var), n64Var);
    }

    @Override // p001o.gn0
    /* renamed from: d */
    public Object mo29143d(int i, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("\n        SELECT * FROM app_version WHERE id = ?\n    ", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        return CoroutinesRoom.execute(this.f28933a, false, DBUtil.createCancellationSignal(), new CallableC14333e(roomSQLiteQueryAcquire), n64Var);
    }
}
