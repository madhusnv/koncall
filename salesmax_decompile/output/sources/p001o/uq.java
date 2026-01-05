package p001o;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class uq implements sq {

    /* renamed from: a */
    public final RoomDatabase f49365a;

    /* renamed from: b */
    public final EntityInsertionAdapter f49366b;

    /* renamed from: o.uq$a */
    public class C17431a extends EntityInsertionAdapter {
        public C17431a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: a */
        public void m51916a(peg pegVar, rq rqVar) {
            throw null;
        }

        @Override // androidx.room.EntityInsertionAdapter
        public /* bridge */ /* synthetic */ void bind(peg pegVar, Object obj) {
            tq.m50332a(obj);
            m51916a(pegVar, null);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `activity_log` (`id`,`accountId`,`userId`,`activityType`,`activitySource`,`message`,`properties`,`activityTime`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public uq(RoomDatabase roomDatabase) {
        this.f49365a = roomDatabase;
        this.f49366b = new C17431a(roomDatabase);
    }

    /* renamed from: a */
    public static List m51915a() {
        return Collections.emptyList();
    }
}
