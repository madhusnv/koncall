package p001o;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p001o.dv1;

/* loaded from: classes.dex */
public final class fv1 implements dv1 {

    /* renamed from: a */
    public final RoomDatabase f24115a;

    /* renamed from: b */
    public final EntityInsertionAdapter f24116b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter f24117c;

    /* renamed from: d */
    public final SharedSQLiteStatement f24118d;

    /* renamed from: e */
    public final SharedSQLiteStatement f24119e;

    /* renamed from: f */
    public final SharedSQLiteStatement f24120f;

    /* renamed from: o.fv1$a */
    public class CallableC13562a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ long f24121a;

        public CallableC13562a(long j) {
            this.f24121a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            peg pegVarAcquire = fv1.this.f24120f.acquire();
            pegVarAcquire.bindLong(1, this.f24121a);
            try {
                fv1.this.f24115a.beginTransaction();
                try {
                    pegVarAcquire.executeUpdateDelete();
                    fv1.this.f24115a.setTransactionSuccessful();
                    return y3i.f54824a;
                } finally {
                    fv1.this.f24115a.endTransaction();
                }
            } finally {
                fv1.this.f24120f.release(pegVarAcquire);
            }
        }
    }

    /* renamed from: o.fv1$b */
    public class CallableC13563b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f24123a;

        public CallableC13563b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24123a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorQuery = DBUtil.query(fv1.this.f24115a, this.f24123a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.f24123a.release();
            }
        }
    }

    /* renamed from: o.fv1$c */
    public class CallableC13564c implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f24125a;

        public CallableC13564c(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24125a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorQuery = DBUtil.query(fv1.this.f24115a, this.f24125a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.f24125a.release();
            }
        }
    }

    /* renamed from: o.fv1$d */
    public class CallableC13565d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f24127a;

        public CallableC13565d(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24127a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public cv1 call() {
            cv1 cv1Var;
            Boolean boolValueOf;
            int i;
            String string;
            int i2;
            String string2;
            int i3;
            String string3;
            int i4;
            Long lValueOf;
            int i5;
            String string4;
            int i6;
            String string5;
            int i7;
            String string6;
            int i8;
            String string7;
            int i9;
            Cursor cursorQuery = DBUtil.query(fv1.this.f24115a, this.f24127a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "number");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phone");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "direction");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStartTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callEndTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectTime");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectStatus");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subscriptionId");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isConnectedCall");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStatus");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProvider");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProviderNumber");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalCallDuration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callType");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hangupReason");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneCallLogId");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneHandle");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "processed");
                if (cursorQuery.moveToFirst()) {
                    String string8 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string9 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string10 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string11 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5));
                    String string12 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                    String string13 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                    Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow9));
                    Long lValueOf5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow10));
                    CallConnectStatus callConnectStatusM27539t = cursorQuery.isNull(columnIndexOrThrow11) ? null : fv1.this.m27539t(cursorQuery.getString(columnIndexOrThrow11));
                    Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow12) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow12));
                    Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow13) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow13));
                    if (numValueOf2 == null) {
                        i = columnIndexOrThrow14;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        i = columnIndexOrThrow14;
                    }
                    if (cursorQuery.isNull(i)) {
                        i2 = columnIndexOrThrow15;
                        string = null;
                    } else {
                        string = cursorQuery.getString(i);
                        i2 = columnIndexOrThrow15;
                    }
                    if (cursorQuery.isNull(i2)) {
                        i3 = columnIndexOrThrow16;
                        string2 = null;
                    } else {
                        string2 = cursorQuery.getString(i2);
                        i3 = columnIndexOrThrow16;
                    }
                    if (cursorQuery.isNull(i3)) {
                        i4 = columnIndexOrThrow17;
                        string3 = null;
                    } else {
                        string3 = cursorQuery.getString(i3);
                        i4 = columnIndexOrThrow17;
                    }
                    if (cursorQuery.isNull(i4)) {
                        i5 = columnIndexOrThrow18;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorQuery.getLong(i4));
                        i5 = columnIndexOrThrow18;
                    }
                    if (cursorQuery.isNull(i5)) {
                        i6 = columnIndexOrThrow19;
                        string4 = null;
                    } else {
                        string4 = cursorQuery.getString(i5);
                        i6 = columnIndexOrThrow19;
                    }
                    if (cursorQuery.isNull(i6)) {
                        i7 = columnIndexOrThrow20;
                        string5 = null;
                    } else {
                        string5 = cursorQuery.getString(i6);
                        i7 = columnIndexOrThrow20;
                    }
                    if (cursorQuery.isNull(i7)) {
                        i8 = columnIndexOrThrow21;
                        string6 = null;
                    } else {
                        string6 = cursorQuery.getString(i7);
                        i8 = columnIndexOrThrow21;
                    }
                    if (cursorQuery.isNull(i8)) {
                        i9 = columnIndexOrThrow22;
                        string7 = null;
                    } else {
                        string7 = cursorQuery.getString(i8);
                        i9 = columnIndexOrThrow22;
                    }
                    cv1Var = new cv1(string8, string9, string10, string11, lValueOf2, string12, string13, lValueOf3, lValueOf4, lValueOf5, callConnectStatusM27539t, numValueOf, boolValueOf, string, string2, string3, lValueOf, string4, string5, string6, string7, cursorQuery.getLong(i9), cursorQuery.getInt(columnIndexOrThrow23) != 0);
                } else {
                    cv1Var = null;
                }
                return cv1Var;
            } finally {
                cursorQuery.close();
                this.f24127a.release();
            }
        }
    }

    /* renamed from: o.fv1$e */
    public class CallableC13566e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f24129a;

        public CallableC13566e(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24129a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i;
            CallConnectStatus callConnectStatusM27539t;
            Integer numValueOf;
            int i2;
            Boolean boolValueOf;
            int i3;
            String string;
            int i4;
            int i5;
            String string2;
            int i6;
            String string3;
            int i7;
            Long lValueOf;
            int i8;
            String string4;
            int i9;
            String string5;
            int i10;
            String string6;
            int i11;
            String string7;
            int i12;
            boolean z;
            Cursor cursorQuery = DBUtil.query(fv1.this.f24115a, this.f24129a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "number");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phone");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "direction");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStartTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callEndTime");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectTime");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectStatus");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subscriptionId");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isConnectedCall");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStatus");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProvider");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProviderNumber");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalCallDuration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callType");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hangupReason");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneCallLogId");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneHandle");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "processed");
                int i13 = columnIndexOrThrow13;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string8 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    String string9 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string10 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string11 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5));
                    String string12 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                    String string13 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                    Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow9));
                    Long lValueOf5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow10));
                    if (cursorQuery.isNull(columnIndexOrThrow11)) {
                        i = columnIndexOrThrow;
                        callConnectStatusM27539t = null;
                    } else {
                        i = columnIndexOrThrow;
                        callConnectStatusM27539t = fv1.this.m27539t(cursorQuery.getString(columnIndexOrThrow11));
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow12)) {
                        i2 = i13;
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow12));
                        i2 = i13;
                    }
                    Integer numValueOf2 = cursorQuery.isNull(i2) ? null : Integer.valueOf(cursorQuery.getInt(i2));
                    if (numValueOf2 == null) {
                        i3 = columnIndexOrThrow14;
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        i3 = columnIndexOrThrow14;
                    }
                    if (cursorQuery.isNull(i3)) {
                        i4 = i2;
                        i5 = columnIndexOrThrow15;
                        string = null;
                    } else {
                        string = cursorQuery.getString(i3);
                        i4 = i2;
                        i5 = columnIndexOrThrow15;
                    }
                    if (cursorQuery.isNull(i5)) {
                        columnIndexOrThrow15 = i5;
                        i6 = columnIndexOrThrow16;
                        string2 = null;
                    } else {
                        string2 = cursorQuery.getString(i5);
                        columnIndexOrThrow15 = i5;
                        i6 = columnIndexOrThrow16;
                    }
                    if (cursorQuery.isNull(i6)) {
                        columnIndexOrThrow16 = i6;
                        i7 = columnIndexOrThrow17;
                        string3 = null;
                    } else {
                        string3 = cursorQuery.getString(i6);
                        columnIndexOrThrow16 = i6;
                        i7 = columnIndexOrThrow17;
                    }
                    if (cursorQuery.isNull(i7)) {
                        columnIndexOrThrow17 = i7;
                        i8 = columnIndexOrThrow18;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorQuery.getLong(i7));
                        columnIndexOrThrow17 = i7;
                        i8 = columnIndexOrThrow18;
                    }
                    if (cursorQuery.isNull(i8)) {
                        columnIndexOrThrow18 = i8;
                        i9 = columnIndexOrThrow19;
                        string4 = null;
                    } else {
                        string4 = cursorQuery.getString(i8);
                        columnIndexOrThrow18 = i8;
                        i9 = columnIndexOrThrow19;
                    }
                    if (cursorQuery.isNull(i9)) {
                        columnIndexOrThrow19 = i9;
                        i10 = columnIndexOrThrow20;
                        string5 = null;
                    } else {
                        string5 = cursorQuery.getString(i9);
                        columnIndexOrThrow19 = i9;
                        i10 = columnIndexOrThrow20;
                    }
                    if (cursorQuery.isNull(i10)) {
                        columnIndexOrThrow20 = i10;
                        i11 = columnIndexOrThrow21;
                        string6 = null;
                    } else {
                        string6 = cursorQuery.getString(i10);
                        columnIndexOrThrow20 = i10;
                        i11 = columnIndexOrThrow21;
                    }
                    if (cursorQuery.isNull(i11)) {
                        columnIndexOrThrow21 = i11;
                        i12 = columnIndexOrThrow22;
                        string7 = null;
                    } else {
                        string7 = cursorQuery.getString(i11);
                        columnIndexOrThrow21 = i11;
                        i12 = columnIndexOrThrow22;
                    }
                    long j = cursorQuery.getLong(i12);
                    columnIndexOrThrow22 = i12;
                    int i14 = columnIndexOrThrow23;
                    if (cursorQuery.getInt(i14) != 0) {
                        columnIndexOrThrow23 = i14;
                        z = true;
                    } else {
                        columnIndexOrThrow23 = i14;
                        z = false;
                    }
                    arrayList.add(new cv1(string8, string9, string10, string11, lValueOf2, string12, string13, lValueOf3, lValueOf4, lValueOf5, callConnectStatusM27539t, numValueOf, boolValueOf, string, string2, string3, lValueOf, string4, string5, string6, string7, j, z));
                    i13 = i4;
                    columnIndexOrThrow = i;
                    columnIndexOrThrow14 = i3;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.f24129a.release();
            }
        }
    }

    /* renamed from: o.fv1$f */
    public static /* synthetic */ class C13567f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24131a;

        static {
            int[] iArr = new int[CallConnectStatus.values().length];
            f24131a = iArr;
            try {
                iArr[CallConnectStatus.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24131a[CallConnectStatus.NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.fv1$g */
    public class C13568g extends EntityInsertionAdapter {
        public C13568g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, cv1 cv1Var) {
            if (cv1Var.m21840d() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, cv1Var.m21840d());
            }
            if (cv1Var.m21851o() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, cv1Var.m21851o());
            }
            if (cv1Var.m21852p() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, cv1Var.m21852p());
            }
            if (cv1Var.m21847k() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, cv1Var.m21847k());
            }
            if (cv1Var.m21841e() == null) {
                pegVar.bindNull(5);
            } else {
                pegVar.bindLong(5, cv1Var.m21841e().longValue());
            }
            if (cv1Var.m21850n() == null) {
                pegVar.bindNull(6);
            } else {
                pegVar.bindString(6, cv1Var.m21850n());
            }
            if (cv1Var.m21856t() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, cv1Var.m21856t());
            }
            if (cv1Var.m21848l() == null) {
                pegVar.bindNull(8);
            } else {
                pegVar.bindLong(8, cv1Var.m21848l().longValue());
            }
            if (cv1Var.m21839c() == null) {
                pegVar.bindNull(9);
            } else {
                pegVar.bindLong(9, cv1Var.m21839c().longValue());
            }
            if (cv1Var.m21838b() == null) {
                pegVar.bindNull(10);
            } else {
                pegVar.bindLong(10, cv1Var.m21838b().longValue());
            }
            if (cv1Var.m21837a() == null) {
                pegVar.bindNull(11);
            } else {
                pegVar.bindString(11, fv1.this.m27538s(cv1Var.m21837a()));
            }
            if (cv1Var.m21857u() == null) {
                pegVar.bindNull(12);
            } else {
                pegVar.bindLong(12, cv1Var.m21857u().intValue());
            }
            if ((cv1Var.m21859w() == null ? null : Integer.valueOf(cv1Var.m21859w().booleanValue() ? 1 : 0)) == null) {
                pegVar.bindNull(13);
            } else {
                pegVar.bindLong(13, r0.intValue());
            }
            if (cv1Var.m21842f() == null) {
                pegVar.bindNull(14);
            } else {
                pegVar.bindString(14, cv1Var.m21842f());
            }
            if (cv1Var.m21844h() == null) {
                pegVar.bindNull(15);
            } else {
                pegVar.bindString(15, cv1Var.m21844h());
            }
            if (cv1Var.m21845i() == null) {
                pegVar.bindNull(16);
            } else {
                pegVar.bindString(16, cv1Var.m21845i());
            }
            if (cv1Var.m21858v() == null) {
                pegVar.bindNull(17);
            } else {
                pegVar.bindLong(17, cv1Var.m21858v().longValue());
            }
            if (cv1Var.m21843g() == null) {
                pegVar.bindNull(18);
            } else {
                pegVar.bindString(18, cv1Var.m21843g());
            }
            if (cv1Var.m21849m() == null) {
                pegVar.bindNull(19);
            } else {
                pegVar.bindString(19, cv1Var.m21849m());
            }
            if (cv1Var.m21853q() == null) {
                pegVar.bindNull(20);
            } else {
                pegVar.bindString(20, cv1Var.m21853q());
            }
            if (cv1Var.m21854r() == null) {
                pegVar.bindNull(21);
            } else {
                pegVar.bindString(21, cv1Var.m21854r());
            }
            pegVar.bindLong(22, cv1Var.m21846j());
            pegVar.bindLong(23, cv1Var.m21855s() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `call_log` (`callId`,`number`,`phone`,`direction`,`callStartTime`,`name`,`source`,`duration`,`callEndTime`,`callConnectTime`,`callConnectStatus`,`subscriptionId`,`isConnectedCall`,`callStatus`,`cloudProvider`,`cloudProviderNumber`,`totalCallDuration`,`callType`,`hangupReason`,`phoneCallLogId`,`phoneHandle`,`createdAt`,`processed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: o.fv1$h */
    public class C13569h extends EntityDeletionOrUpdateAdapter {
        public C13569h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, cv1 cv1Var) {
            if (cv1Var.m21840d() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, cv1Var.m21840d());
            }
            if (cv1Var.m21851o() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, cv1Var.m21851o());
            }
            if (cv1Var.m21852p() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, cv1Var.m21852p());
            }
            if (cv1Var.m21847k() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, cv1Var.m21847k());
            }
            if (cv1Var.m21841e() == null) {
                pegVar.bindNull(5);
            } else {
                pegVar.bindLong(5, cv1Var.m21841e().longValue());
            }
            if (cv1Var.m21850n() == null) {
                pegVar.bindNull(6);
            } else {
                pegVar.bindString(6, cv1Var.m21850n());
            }
            if (cv1Var.m21856t() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, cv1Var.m21856t());
            }
            if (cv1Var.m21848l() == null) {
                pegVar.bindNull(8);
            } else {
                pegVar.bindLong(8, cv1Var.m21848l().longValue());
            }
            if (cv1Var.m21839c() == null) {
                pegVar.bindNull(9);
            } else {
                pegVar.bindLong(9, cv1Var.m21839c().longValue());
            }
            if (cv1Var.m21838b() == null) {
                pegVar.bindNull(10);
            } else {
                pegVar.bindLong(10, cv1Var.m21838b().longValue());
            }
            if (cv1Var.m21837a() == null) {
                pegVar.bindNull(11);
            } else {
                pegVar.bindString(11, fv1.this.m27538s(cv1Var.m21837a()));
            }
            if (cv1Var.m21857u() == null) {
                pegVar.bindNull(12);
            } else {
                pegVar.bindLong(12, cv1Var.m21857u().intValue());
            }
            if ((cv1Var.m21859w() == null ? null : Integer.valueOf(cv1Var.m21859w().booleanValue() ? 1 : 0)) == null) {
                pegVar.bindNull(13);
            } else {
                pegVar.bindLong(13, r0.intValue());
            }
            if (cv1Var.m21842f() == null) {
                pegVar.bindNull(14);
            } else {
                pegVar.bindString(14, cv1Var.m21842f());
            }
            if (cv1Var.m21844h() == null) {
                pegVar.bindNull(15);
            } else {
                pegVar.bindString(15, cv1Var.m21844h());
            }
            if (cv1Var.m21845i() == null) {
                pegVar.bindNull(16);
            } else {
                pegVar.bindString(16, cv1Var.m21845i());
            }
            if (cv1Var.m21858v() == null) {
                pegVar.bindNull(17);
            } else {
                pegVar.bindLong(17, cv1Var.m21858v().longValue());
            }
            if (cv1Var.m21843g() == null) {
                pegVar.bindNull(18);
            } else {
                pegVar.bindString(18, cv1Var.m21843g());
            }
            if (cv1Var.m21849m() == null) {
                pegVar.bindNull(19);
            } else {
                pegVar.bindString(19, cv1Var.m21849m());
            }
            if (cv1Var.m21853q() == null) {
                pegVar.bindNull(20);
            } else {
                pegVar.bindString(20, cv1Var.m21853q());
            }
            if (cv1Var.m21854r() == null) {
                pegVar.bindNull(21);
            } else {
                pegVar.bindString(21, cv1Var.m21854r());
            }
            pegVar.bindLong(22, cv1Var.m21846j());
            pegVar.bindLong(23, cv1Var.m21855s() ? 1L : 0L);
            if (cv1Var.m21840d() == null) {
                pegVar.bindNull(24);
            } else {
                pegVar.bindString(24, cv1Var.m21840d());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `call_log` SET `callId` = ?,`number` = ?,`phone` = ?,`direction` = ?,`callStartTime` = ?,`name` = ?,`source` = ?,`duration` = ?,`callEndTime` = ?,`callConnectTime` = ?,`callConnectStatus` = ?,`subscriptionId` = ?,`isConnectedCall` = ?,`callStatus` = ?,`cloudProvider` = ?,`cloudProviderNumber` = ?,`totalCallDuration` = ?,`callType` = ?,`hangupReason` = ?,`phoneCallLogId` = ?,`phoneHandle` = ?,`createdAt` = ?,`processed` = ? WHERE `callId` = ?";
        }
    }

    /* renamed from: o.fv1$i */
    public class C13570i extends SharedSQLiteStatement {
        public C13570i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE call_log set processed = ? where callId = ? and processed != ?";
        }
    }

    /* renamed from: o.fv1$j */
    public class C13571j extends SharedSQLiteStatement {
        public C13571j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from call_log where callId = ?";
        }
    }

    /* renamed from: o.fv1$k */
    public class C13572k extends SharedSQLiteStatement {
        public C13572k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from call_log where callStartTime < ?";
        }
    }

    /* renamed from: o.fv1$l */
    public class CallableC13573l implements Callable {

        /* renamed from: a */
        public final /* synthetic */ List f24137a;

        public CallableC13573l(List list) {
            this.f24137a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            fv1.this.f24115a.beginTransaction();
            try {
                List<Long> listInsertAndReturnIdsList = fv1.this.f24116b.insertAndReturnIdsList(this.f24137a);
                fv1.this.f24115a.setTransactionSuccessful();
                return listInsertAndReturnIdsList;
            } finally {
                fv1.this.f24115a.endTransaction();
            }
        }
    }

    /* renamed from: o.fv1$m */
    public class CallableC13574m implements Callable {

        /* renamed from: a */
        public final /* synthetic */ cv1 f24139a;

        public CallableC13574m(cv1 cv1Var) {
            this.f24139a = cv1Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            fv1.this.f24115a.beginTransaction();
            try {
                fv1.this.f24117c.handle(this.f24139a);
                fv1.this.f24115a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                fv1.this.f24115a.endTransaction();
            }
        }
    }

    /* renamed from: o.fv1$n */
    public class CallableC13575n implements Callable {

        /* renamed from: a */
        public final /* synthetic */ boolean f24141a;

        /* renamed from: b */
        public final /* synthetic */ String f24142b;

        public CallableC13575n(boolean z, String str) {
            this.f24141a = z;
            this.f24142b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            peg pegVarAcquire = fv1.this.f24118d.acquire();
            pegVarAcquire.bindLong(1, this.f24141a ? 1L : 0L);
            String str = this.f24142b;
            if (str == null) {
                pegVarAcquire.bindNull(2);
            } else {
                pegVarAcquire.bindString(2, str);
            }
            pegVarAcquire.bindLong(3, this.f24141a ? 1L : 0L);
            try {
                fv1.this.f24115a.beginTransaction();
                try {
                    pegVarAcquire.executeUpdateDelete();
                    fv1.this.f24115a.setTransactionSuccessful();
                    return y3i.f54824a;
                } finally {
                    fv1.this.f24115a.endTransaction();
                }
            } finally {
                fv1.this.f24118d.release(pegVarAcquire);
            }
        }
    }

    public fv1(RoomDatabase roomDatabase) {
        this.f24115a = roomDatabase;
        this.f24116b = new C13568g(roomDatabase);
        this.f24117c = new C13569h(roomDatabase);
        this.f24118d = new C13570i(roomDatabase);
        this.f24119e = new C13571j(roomDatabase);
        this.f24120f = new C13572k(roomDatabase);
    }

    /* renamed from: u */
    public static List m27536u() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Object m27537v(List list, n64 n64Var) {
        return dv1.C13048a.m23885b(this, list, n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: a */
    public Object mo23874a(long j, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT callId from call_log where callStartTime > ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.f24115a, false, DBUtil.createCancellationSignal(), new CallableC13563b(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: b */
    public Object mo23875b(String str, String str2, n64 n64Var) {
        return dv1.C13048a.m23884a(this, str, str2, n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: c */
    public Object mo23876c(n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from call_log where processed = 0", 0);
        return CoroutinesRoom.execute(this.f24115a, false, DBUtil.createCancellationSignal(), new CallableC13566e(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: d */
    public Object mo23877d(long j, n64 n64Var) {
        return CoroutinesRoom.execute(this.f24115a, true, new CallableC13562a(j), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: e */
    public Object mo23878e(cv1 cv1Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f24115a, true, new CallableC13574m(cv1Var), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: f */
    public Object mo23879f(List list, n64 n64Var) {
        return CoroutinesRoom.execute(this.f24115a, true, new CallableC13573l(list), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: g */
    public Object mo23880g(String str, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from call_log where callId = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.f24115a, false, DBUtil.createCancellationSignal(), new CallableC13565d(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: h */
    public Object mo23881h(String str, boolean z, n64 n64Var) {
        return CoroutinesRoom.execute(this.f24115a, true, new CallableC13575n(z, str), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: i */
    public Object mo23882i(long j, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("\n    SELECT callId FROM call_log\n     WHERE (number IS NULL OR number = '')\n       AND callStartTime >= ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.f24115a, false, DBUtil.createCancellationSignal(), new CallableC13564c(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.dv1
    /* renamed from: j */
    public Object mo23883j(final List list, n64 n64Var) {
        return RoomDatabaseKt.withTransaction(this.f24115a, new xk7() { // from class: o.ev1
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return this.f22213a.m27537v(list, (n64) obj);
            }
        }, n64Var);
    }

    /* renamed from: s */
    public final String m27538s(CallConnectStatus callConnectStatus) {
        int i = C13567f.f24131a[callConnectStatus.ordinal()];
        if (i == 1) {
            return "CONNECTED";
        }
        if (i == 2) {
            return "NOT_CONNECTED";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + callConnectStatus);
    }

    /* renamed from: t */
    public final CallConnectStatus m27539t(String str) {
        str.hashCode();
        if (str.equals("CONNECTED")) {
            return CallConnectStatus.CONNECTED;
        }
        if (str.equals("NOT_CONNECTED")) {
            return CallConnectStatus.NOT_CONNECTED;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }
}
