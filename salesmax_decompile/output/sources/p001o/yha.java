package p001o;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class yha implements xha {

    /* renamed from: a */
    public final RoomDatabase f55520a;

    /* renamed from: b */
    public final EntityInsertionAdapter f55521b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter f55522c;

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f55523d;

    /* renamed from: o.yha$a */
    public class C18406a extends EntityInsertionAdapter {
        public C18406a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, vha vhaVar) {
            if (vhaVar.m52774e() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, vhaVar.m52774e());
            }
            pegVar.bindDouble(2, vhaVar.m52776g());
            pegVar.bindDouble(3, vhaVar.m52775f());
            if (vhaVar.m52778i() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, vhaVar.m52778i());
            }
            pegVar.bindLong(5, vhaVar.m52773d());
            pegVar.bindLong(6, vhaVar.m52777h() ? 1L : 0L);
            if (vhaVar.m52772c() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, vhaVar.m52772c());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `periodic_location` (`id`,`longitude`,`latitude`,`provider`,`createdAt`,`persisted`,`activityLocationId`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: o.yha$b */
    public class C18407b extends EntityDeletionOrUpdateAdapter {
        public C18407b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, vha vhaVar) {
            if (vhaVar.m52774e() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, vhaVar.m52774e());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `periodic_location` WHERE `id` = ?";
        }
    }

    /* renamed from: o.yha$c */
    public class C18408c extends EntityDeletionOrUpdateAdapter {
        public C18408c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, vha vhaVar) {
            if (vhaVar.m52774e() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, vhaVar.m52774e());
            }
            pegVar.bindDouble(2, vhaVar.m52776g());
            pegVar.bindDouble(3, vhaVar.m52775f());
            if (vhaVar.m52778i() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, vhaVar.m52778i());
            }
            pegVar.bindLong(5, vhaVar.m52773d());
            pegVar.bindLong(6, vhaVar.m52777h() ? 1L : 0L);
            if (vhaVar.m52772c() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, vhaVar.m52772c());
            }
            if (vhaVar.m52774e() == null) {
                pegVar.bindNull(8);
            } else {
                pegVar.bindString(8, vhaVar.m52774e());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `periodic_location` SET `id` = ?,`longitude` = ?,`latitude` = ?,`provider` = ?,`createdAt` = ?,`persisted` = ?,`activityLocationId` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: o.yha$d */
    public class CallableC18409d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ vha f55527a;

        public CallableC18409d(vha vhaVar) {
            this.f55527a = vhaVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            yha.this.f55520a.beginTransaction();
            try {
                yha.this.f55521b.insert((EntityInsertionAdapter) this.f55527a);
                yha.this.f55520a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                yha.this.f55520a.endTransaction();
            }
        }
    }

    /* renamed from: o.yha$e */
    public class CallableC18410e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ vha f55529a;

        public CallableC18410e(vha vhaVar) {
            this.f55529a = vhaVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            yha.this.f55520a.beginTransaction();
            try {
                yha.this.f55522c.handle(this.f55529a);
                yha.this.f55520a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                yha.this.f55520a.endTransaction();
            }
        }
    }

    /* renamed from: o.yha$f */
    public class CallableC18411f implements Callable {

        /* renamed from: a */
        public final /* synthetic */ vha f55531a;

        public CallableC18411f(vha vhaVar) {
            this.f55531a = vhaVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            yha.this.f55520a.beginTransaction();
            try {
                yha.this.f55523d.handle(this.f55531a);
                yha.this.f55520a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                yha.this.f55520a.endTransaction();
            }
        }
    }

    /* renamed from: o.yha$g */
    public class CallableC18412g implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f55533a;

        public CallableC18412g(RoomSQLiteQuery roomSQLiteQuery) {
            this.f55533a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorQuery = DBUtil.query(yha.this.f55520a, this.f55533a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "longitude");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "latitude");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityLocationId");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new vha(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.getDouble(columnIndexOrThrow2), cursorQuery.getDouble(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6) != 0, cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7)));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.f55533a.release();
            }
        }
    }

    public yha(RoomDatabase roomDatabase) {
        this.f55520a = roomDatabase;
        this.f55521b = new C18406a(roomDatabase);
        this.f55522c = new C18407b(roomDatabase);
        this.f55523d = new C18408c(roomDatabase);
    }

    /* renamed from: i */
    public static List m57822i() {
        return Collections.emptyList();
    }

    @Override // p001o.xha
    /* renamed from: a */
    public Object mo56316a(vha vhaVar, n64 n64Var) {
        return CoroutinesRoom.execute(this.f55520a, true, new CallableC18410e(vhaVar), n64Var);
    }

    @Override // p001o.xha
    /* renamed from: b */
    public Object mo56317b(long j, boolean z, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM periodic_location WHERE createdAt < ? and persisted = ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, j);
        roomSQLiteQueryAcquire.bindLong(2, z ? 1L : 0L);
        return CoroutinesRoom.execute(this.f55520a, false, DBUtil.createCancellationSignal(), new CallableC18412g(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.xha
    /* renamed from: c */
    public Object mo56318c(vha vhaVar, n64 n64Var) {
        return CoroutinesRoom.execute(this.f55520a, true, new CallableC18409d(vhaVar), n64Var);
    }

    @Override // p001o.xha
    /* renamed from: d */
    public Object mo56319d(vha vhaVar, n64 n64Var) {
        return CoroutinesRoom.execute(this.f55520a, true, new CallableC18411f(vhaVar), n64Var);
    }
}
