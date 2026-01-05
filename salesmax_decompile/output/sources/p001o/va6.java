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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class va6 implements ua6 {

    /* renamed from: a */
    public final RoomDatabase f50053a;

    /* renamed from: b */
    public final EntityInsertionAdapter f50054b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter f50055c;

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f50056d;

    /* renamed from: o.va6$a */
    public class C17536a extends EntityInsertionAdapter {
        public C17536a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, ta6 ta6Var) {
            if (ta6Var.m49639n() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, ta6Var.m49639n());
            }
            if (ta6Var.m49640o() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, ta6Var.m49640o());
            }
            if (ta6Var.m49636k() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, ta6Var.m49636k());
            }
            if (ta6Var.m49637l() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, ta6Var.m49637l());
            }
            if (ta6Var.m49635j() == null) {
                pegVar.bindNull(5);
            } else {
                pegVar.bindString(5, ta6Var.m49635j());
            }
            if (ta6Var.m49634i() == null) {
                pegVar.bindNull(6);
            } else {
                pegVar.bindString(6, ta6Var.m49634i());
            }
            if (ta6Var.m49638m() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, ta6Var.m49638m());
            }
            if (ta6Var.m49641p() == null) {
                pegVar.bindNull(8);
            } else {
                pegVar.bindLong(8, ta6Var.m49641p().longValue());
            }
            if (ta6Var.m49642q() == null) {
                pegVar.bindNull(9);
            } else {
                pegVar.bindString(9, ta6Var.m49642q());
            }
            pegVar.bindLong(10, ta6Var.m49643r());
            pegVar.bindLong(11, ta6Var.m49646u() ? 1L : 0L);
            pegVar.bindLong(12, ta6Var.m49632g() ? 1L : 0L);
            pegVar.bindLong(13, ta6Var.m49644s() ? 1L : 0L);
            if (ta6Var.m49633h() == null) {
                pegVar.bindNull(14);
            } else {
                pegVar.bindString(14, ta6Var.m49633h());
            }
            if (ta6Var.m49631f() == null) {
                pegVar.bindNull(15);
            } else {
                pegVar.bindString(15, ta6Var.m49631f());
            }
            if (ta6Var.m49630e() == null) {
                pegVar.bindNull(16);
            } else {
                pegVar.bindString(16, ta6Var.m49630e());
            }
            if (ta6Var.m49629d() == null) {
                pegVar.bindNull(17);
            } else {
                pegVar.bindString(17, ta6Var.m49629d());
            }
            pegVar.bindLong(18, ta6Var.m49628c() ? 1L : 0L);
            pegVar.bindLong(19, ta6Var.m49627b() ? 1L : 0L);
            pegVar.bindLong(20, ta6Var.m49626a() ? 1L : 0L);
            if (ta6Var.m49645t() == null) {
                pegVar.bindNull(21);
            } else {
                pegVar.bindString(21, ta6Var.m49645t());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `engagement_outcome` (`id`,`idType`,`callOutcome`,`callOutcomeNature`,`callNextStep`,`callInputNotes`,`customCallOutcomeData`,`nextFollowUpOn`,`nextFollowUpSetBy`,`nextTaskDateTimeInMillis`,`transferLead`,`assignment`,`persisted`,`assignmentType`,`assignedUserId`,`assignedTeamId`,`assignedDistributionId`,`assignOpenTasks`,`assignOpenDeals`,`assignChats`,`submittedFormValues`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: o.va6$b */
    public class C17537b extends EntityDeletionOrUpdateAdapter {
        public C17537b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, ta6 ta6Var) {
            if (ta6Var.m49639n() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, ta6Var.m49639n());
            }
            if (ta6Var.m49640o() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, ta6Var.m49640o());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `engagement_outcome` WHERE `id` = ? AND `idType` = ?";
        }
    }

    /* renamed from: o.va6$c */
    public class C17538c extends EntityDeletionOrUpdateAdapter {
        public C17538c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, ta6 ta6Var) {
            if (ta6Var.m49639n() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, ta6Var.m49639n());
            }
            if (ta6Var.m49640o() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, ta6Var.m49640o());
            }
            if (ta6Var.m49636k() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, ta6Var.m49636k());
            }
            if (ta6Var.m49637l() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, ta6Var.m49637l());
            }
            if (ta6Var.m49635j() == null) {
                pegVar.bindNull(5);
            } else {
                pegVar.bindString(5, ta6Var.m49635j());
            }
            if (ta6Var.m49634i() == null) {
                pegVar.bindNull(6);
            } else {
                pegVar.bindString(6, ta6Var.m49634i());
            }
            if (ta6Var.m49638m() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, ta6Var.m49638m());
            }
            if (ta6Var.m49641p() == null) {
                pegVar.bindNull(8);
            } else {
                pegVar.bindLong(8, ta6Var.m49641p().longValue());
            }
            if (ta6Var.m49642q() == null) {
                pegVar.bindNull(9);
            } else {
                pegVar.bindString(9, ta6Var.m49642q());
            }
            pegVar.bindLong(10, ta6Var.m49643r());
            pegVar.bindLong(11, ta6Var.m49646u() ? 1L : 0L);
            pegVar.bindLong(12, ta6Var.m49632g() ? 1L : 0L);
            pegVar.bindLong(13, ta6Var.m49644s() ? 1L : 0L);
            if (ta6Var.m49633h() == null) {
                pegVar.bindNull(14);
            } else {
                pegVar.bindString(14, ta6Var.m49633h());
            }
            if (ta6Var.m49631f() == null) {
                pegVar.bindNull(15);
            } else {
                pegVar.bindString(15, ta6Var.m49631f());
            }
            if (ta6Var.m49630e() == null) {
                pegVar.bindNull(16);
            } else {
                pegVar.bindString(16, ta6Var.m49630e());
            }
            if (ta6Var.m49629d() == null) {
                pegVar.bindNull(17);
            } else {
                pegVar.bindString(17, ta6Var.m49629d());
            }
            pegVar.bindLong(18, ta6Var.m49628c() ? 1L : 0L);
            pegVar.bindLong(19, ta6Var.m49627b() ? 1L : 0L);
            pegVar.bindLong(20, ta6Var.m49626a() ? 1L : 0L);
            if (ta6Var.m49645t() == null) {
                pegVar.bindNull(21);
            } else {
                pegVar.bindString(21, ta6Var.m49645t());
            }
            if (ta6Var.m49639n() == null) {
                pegVar.bindNull(22);
            } else {
                pegVar.bindString(22, ta6Var.m49639n());
            }
            if (ta6Var.m49640o() == null) {
                pegVar.bindNull(23);
            } else {
                pegVar.bindString(23, ta6Var.m49640o());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `engagement_outcome` SET `id` = ?,`idType` = ?,`callOutcome` = ?,`callOutcomeNature` = ?,`callNextStep` = ?,`callInputNotes` = ?,`customCallOutcomeData` = ?,`nextFollowUpOn` = ?,`nextFollowUpSetBy` = ?,`nextTaskDateTimeInMillis` = ?,`transferLead` = ?,`assignment` = ?,`persisted` = ?,`assignmentType` = ?,`assignedUserId` = ?,`assignedTeamId` = ?,`assignedDistributionId` = ?,`assignOpenTasks` = ?,`assignOpenDeals` = ?,`assignChats` = ?,`submittedFormValues` = ? WHERE `id` = ? AND `idType` = ?";
        }
    }

    /* renamed from: o.va6$d */
    public class CallableC17539d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ ta6 f50060a;

        public CallableC17539d(ta6 ta6Var) {
            this.f50060a = ta6Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            va6.this.f50053a.beginTransaction();
            try {
                va6.this.f50054b.insert((EntityInsertionAdapter) this.f50060a);
                va6.this.f50053a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                va6.this.f50053a.endTransaction();
            }
        }
    }

    /* renamed from: o.va6$e */
    public class CallableC17540e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ ta6 f50062a;

        public CallableC17540e(ta6 ta6Var) {
            this.f50062a = ta6Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            va6.this.f50053a.beginTransaction();
            try {
                va6.this.f50055c.handle(this.f50062a);
                va6.this.f50053a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                va6.this.f50053a.endTransaction();
            }
        }
    }

    /* renamed from: o.va6$f */
    public class CallableC17541f implements Callable {

        /* renamed from: a */
        public final /* synthetic */ ta6 f50064a;

        public CallableC17541f(ta6 ta6Var) {
            this.f50064a = ta6Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            va6.this.f50053a.beginTransaction();
            try {
                va6.this.f50056d.handle(this.f50064a);
                va6.this.f50053a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                va6.this.f50053a.endTransaction();
            }
        }
    }

    /* renamed from: o.va6$g */
    public class CallableC17542g implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f50066a;

        public CallableC17542g(RoomSQLiteQuery roomSQLiteQuery) {
            this.f50066a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ta6 call() throws Throwable {
            ta6 ta6Var;
            String string;
            int i;
            String string2;
            int i2;
            String string3;
            int i3;
            String string4;
            int i4;
            int i5;
            boolean z;
            int i6;
            boolean z2;
            CallableC17542g callableC17542g = this;
            Cursor cursorQuery = DBUtil.query(va6.this.f50053a, callableC17542g.f50066a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "idType");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callOutcome");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callOutcomeNature");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callNextStep");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callInputNotes");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customCallOutcomeData");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextFollowUpOn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextFollowUpSetBy");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextTaskDateTimeInMillis");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transferLead");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignment");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignmentType");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignedUserId");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignedTeamId");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignedDistributionId");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignOpenTasks");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignOpenDeals");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignChats");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "submittedFormValues");
                    if (cursorQuery.moveToFirst()) {
                        String string5 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string6 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string7 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        String string8 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        String string9 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        String string10 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        String string11 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                        Long lValueOf = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                        String string12 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        long j = cursorQuery.getLong(columnIndexOrThrow10);
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow11) != 0;
                        boolean z4 = cursorQuery.getInt(columnIndexOrThrow12) != 0;
                        boolean z5 = cursorQuery.getInt(columnIndexOrThrow13) != 0;
                        if (cursorQuery.isNull(columnIndexOrThrow14)) {
                            i = columnIndexOrThrow15;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow14);
                            i = columnIndexOrThrow15;
                        }
                        if (cursorQuery.isNull(i)) {
                            i2 = columnIndexOrThrow16;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(i);
                            i2 = columnIndexOrThrow16;
                        }
                        if (cursorQuery.isNull(i2)) {
                            i3 = columnIndexOrThrow17;
                            string3 = null;
                        } else {
                            string3 = cursorQuery.getString(i2);
                            i3 = columnIndexOrThrow17;
                        }
                        if (cursorQuery.isNull(i3)) {
                            i4 = columnIndexOrThrow18;
                            string4 = null;
                        } else {
                            string4 = cursorQuery.getString(i3);
                            i4 = columnIndexOrThrow18;
                        }
                        if (cursorQuery.getInt(i4) != 0) {
                            z = true;
                            i5 = columnIndexOrThrow19;
                        } else {
                            i5 = columnIndexOrThrow19;
                            z = false;
                        }
                        if (cursorQuery.getInt(i5) != 0) {
                            z2 = true;
                            i6 = columnIndexOrThrow20;
                        } else {
                            i6 = columnIndexOrThrow20;
                            z2 = false;
                        }
                        ta6Var = new ta6(string5, string6, string7, string8, string9, string10, string11, lValueOf, string12, j, z3, z4, z5, string, string2, string3, string4, z, z2, cursorQuery.getInt(i6) != 0, cursorQuery.isNull(columnIndexOrThrow21) ? null : cursorQuery.getString(columnIndexOrThrow21));
                    } else {
                        ta6Var = null;
                    }
                    cursorQuery.close();
                    this.f50066a.release();
                    return ta6Var;
                } catch (Throwable th) {
                    th = th;
                    callableC17542g = this;
                    cursorQuery.close();
                    callableC17542g.f50066a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: o.va6$h */
    public class CallableC17543h implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f50068a;

        public CallableC17543h(RoomSQLiteQuery roomSQLiteQuery) {
            this.f50068a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() throws Throwable {
            CallableC17543h callableC17543h;
            int i;
            boolean z;
            String string;
            int i2;
            Cursor cursorQuery = DBUtil.query(va6.this.f50053a, this.f50068a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "idType");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callOutcome");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callOutcomeNature");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callNextStep");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callInputNotes");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customCallOutcomeData");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextFollowUpOn");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextFollowUpSetBy");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextTaskDateTimeInMillis");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transferLead");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignment");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignmentType");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignedUserId");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignedTeamId");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignedDistributionId");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignOpenTasks");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignOpenDeals");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "assignChats");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "submittedFormValues");
                    int i3 = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string2 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string3 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string4 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        String string5 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        String string6 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        String string7 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        String string8 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                        Long lValueOf = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                        String string9 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        long j = cursorQuery.getLong(columnIndexOrThrow10);
                        boolean z2 = cursorQuery.getInt(columnIndexOrThrow11) != 0;
                        boolean z3 = cursorQuery.getInt(columnIndexOrThrow12) != 0;
                        if (cursorQuery.getInt(columnIndexOrThrow13) != 0) {
                            i = i3;
                            z = true;
                        } else {
                            i = i3;
                            z = false;
                        }
                        String string10 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                        int i4 = columnIndexOrThrow15;
                        int i5 = columnIndexOrThrow;
                        String string11 = cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4);
                        int i6 = columnIndexOrThrow16;
                        String string12 = cursorQuery.isNull(i6) ? null : cursorQuery.getString(i6);
                        int i7 = columnIndexOrThrow17;
                        String string13 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                        int i8 = columnIndexOrThrow18;
                        boolean z4 = cursorQuery.getInt(i8) != 0;
                        int i9 = columnIndexOrThrow19;
                        boolean z5 = cursorQuery.getInt(i9) != 0;
                        int i10 = columnIndexOrThrow20;
                        boolean z6 = cursorQuery.getInt(i10) != 0;
                        int i11 = columnIndexOrThrow21;
                        if (cursorQuery.isNull(i11)) {
                            i2 = i11;
                            string = null;
                        } else {
                            string = cursorQuery.getString(i11);
                            i2 = i11;
                        }
                        arrayList.add(new ta6(string2, string3, string4, string5, string6, string7, string8, lValueOf, string9, j, z2, z3, z, string10, string11, string12, string13, z4, z5, z6, string));
                        columnIndexOrThrow = i5;
                        columnIndexOrThrow15 = i4;
                        columnIndexOrThrow16 = i6;
                        columnIndexOrThrow17 = i7;
                        columnIndexOrThrow18 = i8;
                        columnIndexOrThrow19 = i9;
                        columnIndexOrThrow20 = i10;
                        columnIndexOrThrow21 = i2;
                        i3 = i;
                    }
                    cursorQuery.close();
                    this.f50068a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    callableC17543h = this;
                    cursorQuery.close();
                    callableC17543h.f50068a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                callableC17543h = this;
            }
        }
    }

    public va6(RoomDatabase roomDatabase) {
        this.f50053a = roomDatabase;
        this.f50054b = new C17536a(roomDatabase);
        this.f50055c = new C17537b(roomDatabase);
        this.f50056d = new C17538c(roomDatabase);
    }

    /* renamed from: j */
    public static List m52485j() {
        return Collections.emptyList();
    }

    @Override // p001o.ua6
    /* renamed from: a */
    public Object mo51272a(ta6 ta6Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f50053a, true, new CallableC17539d(ta6Var), n64Var);
    }

    @Override // p001o.ua6
    /* renamed from: b */
    public Object mo51273b(ta6 ta6Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f50053a, true, new CallableC17541f(ta6Var), n64Var);
    }

    @Override // p001o.ua6
    /* renamed from: c */
    public Object mo51274c(ta6 ta6Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f50053a, true, new CallableC17540e(ta6Var), n64Var);
    }

    @Override // p001o.ua6
    /* renamed from: d */
    public Object mo51275d(String str, String str2, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM engagement_outcome WHERE id = ? and idType = ?", 2);
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
        return CoroutinesRoom.execute(this.f50053a, false, DBUtil.createCancellationSignal(), new CallableC17542g(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.ua6
    /* renamed from: e */
    public Object mo51276e(n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM engagement_outcome WHERE persisted = 1", 0);
        return CoroutinesRoom.execute(this.f50053a, false, DBUtil.createCancellationSignal(), new CallableC17543h(roomSQLiteQueryAcquire), n64Var);
    }
}
