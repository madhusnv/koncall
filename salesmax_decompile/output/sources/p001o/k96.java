package p001o;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p001o.i96;

/* loaded from: classes.dex */
public final class k96 implements i96 {

    /* renamed from: a */
    public final RoomDatabase f31672a;

    /* renamed from: b */
    public final EntityInsertionAdapter f31673b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter f31674c;

    /* renamed from: d */
    public final EntityDeletionOrUpdateAdapter f31675d;

    /* renamed from: o.k96$a */
    public class CallableC14739a implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f31676a;

        public CallableC14739a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f31676a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h96 call() throws Throwable {
            h96 h96Var;
            String string;
            int i;
            String string2;
            int i2;
            String string3;
            int i3;
            String string4;
            int i4;
            String string5;
            int i5;
            String string6;
            int i6;
            String string7;
            int i7;
            Long lValueOf;
            int i8;
            int i9;
            boolean z;
            String string8;
            int i10;
            Boolean boolValueOf;
            int i11;
            Boolean boolValueOf2;
            int i12;
            Boolean boolValueOf3;
            int i13;
            String string9;
            int i14;
            String string10;
            int i15;
            String string11;
            int i16;
            String string12;
            int i17;
            String string13;
            int i18;
            String string14;
            int i19;
            Long lValueOf2;
            int i20;
            Long lValueOf3;
            int i21;
            String string15;
            int i22;
            String string16;
            int i23;
            Long lValueOf4;
            int i24;
            String string17;
            int i25;
            CallableC14739a callableC14739a = this;
            Cursor cursorQuery = DBUtil.query(k96.this.f31672a, callableC14739a.f31676a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientID");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientName");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientCompany");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientProfilePic");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientDesignation");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "primaryTeamId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientContactNumber");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userNumber");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callTimeInMillis");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStartTime");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callEndTime");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDuration");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDirection");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectionStatus");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementType");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceType");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSource");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceLevelTwo");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectTime");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "inFlightCall");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "androidDeviceId");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recording");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mapping");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadedFile");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingId");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uri");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileName");
                    int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filePath");
                    int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mimeType");
                    int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingDateAdded");
                    int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                    int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProvider");
                    int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProviderNumber");
                    int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalCallDuration");
                    int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callType");
                    int columnIndexOrThrow39 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hangupReason");
                    int columnIndexOrThrow40 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneCallLogId");
                    if (cursorQuery.moveToFirst()) {
                        String string18 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string19 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string20 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        String string21 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        String string22 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        String string23 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        String string24 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                        String string25 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                        String string26 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        Long lValueOf5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow10));
                        Long lValueOf6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow11));
                        Long lValueOf7 = cursorQuery.isNull(columnIndexOrThrow12) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow12));
                        Long lValueOf8 = cursorQuery.isNull(columnIndexOrThrow13) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow13));
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
                        if (cursorQuery.isNull(i4)) {
                            i5 = columnIndexOrThrow19;
                            string5 = null;
                        } else {
                            string5 = cursorQuery.getString(i4);
                            i5 = columnIndexOrThrow19;
                        }
                        if (cursorQuery.isNull(i5)) {
                            i6 = columnIndexOrThrow20;
                            string6 = null;
                        } else {
                            string6 = cursorQuery.getString(i5);
                            i6 = columnIndexOrThrow20;
                        }
                        if (cursorQuery.isNull(i6)) {
                            i7 = columnIndexOrThrow21;
                            string7 = null;
                        } else {
                            string7 = cursorQuery.getString(i6);
                            i7 = columnIndexOrThrow21;
                        }
                        if (cursorQuery.isNull(i7)) {
                            i8 = columnIndexOrThrow22;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorQuery.getLong(i7));
                            i8 = columnIndexOrThrow22;
                        }
                        boolean z2 = true;
                        if (cursorQuery.getInt(i8) != 0) {
                            z = true;
                            i9 = columnIndexOrThrow23;
                        } else {
                            i9 = columnIndexOrThrow23;
                            z = false;
                        }
                        if (cursorQuery.isNull(i9)) {
                            i10 = columnIndexOrThrow24;
                            string8 = null;
                        } else {
                            string8 = cursorQuery.getString(i9);
                            i10 = columnIndexOrThrow24;
                        }
                        Integer numValueOf = cursorQuery.isNull(i10) ? null : Integer.valueOf(cursorQuery.getInt(i10));
                        if (numValueOf == null) {
                            i11 = columnIndexOrThrow25;
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            i11 = columnIndexOrThrow25;
                        }
                        Integer numValueOf2 = cursorQuery.isNull(i11) ? null : Integer.valueOf(cursorQuery.getInt(i11));
                        if (numValueOf2 == null) {
                            i12 = columnIndexOrThrow26;
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                            i12 = columnIndexOrThrow26;
                        }
                        Integer numValueOf3 = cursorQuery.isNull(i12) ? null : Integer.valueOf(cursorQuery.getInt(i12));
                        if (numValueOf3 == null) {
                            i13 = columnIndexOrThrow27;
                            boolValueOf3 = null;
                        } else {
                            if (numValueOf3.intValue() == 0) {
                                z2 = false;
                            }
                            boolValueOf3 = Boolean.valueOf(z2);
                            i13 = columnIndexOrThrow27;
                        }
                        if (cursorQuery.isNull(i13)) {
                            i14 = columnIndexOrThrow28;
                            string9 = null;
                        } else {
                            string9 = cursorQuery.getString(i13);
                            i14 = columnIndexOrThrow28;
                        }
                        if (cursorQuery.isNull(i14)) {
                            i15 = columnIndexOrThrow29;
                            string10 = null;
                        } else {
                            string10 = cursorQuery.getString(i14);
                            i15 = columnIndexOrThrow29;
                        }
                        if (cursorQuery.isNull(i15)) {
                            i16 = columnIndexOrThrow30;
                            string11 = null;
                        } else {
                            string11 = cursorQuery.getString(i15);
                            i16 = columnIndexOrThrow30;
                        }
                        if (cursorQuery.isNull(i16)) {
                            i17 = columnIndexOrThrow31;
                            string12 = null;
                        } else {
                            string12 = cursorQuery.getString(i16);
                            i17 = columnIndexOrThrow31;
                        }
                        if (cursorQuery.isNull(i17)) {
                            i18 = columnIndexOrThrow32;
                            string13 = null;
                        } else {
                            string13 = cursorQuery.getString(i17);
                            i18 = columnIndexOrThrow32;
                        }
                        if (cursorQuery.isNull(i18)) {
                            i19 = columnIndexOrThrow33;
                            string14 = null;
                        } else {
                            string14 = cursorQuery.getString(i18);
                            i19 = columnIndexOrThrow33;
                        }
                        if (cursorQuery.isNull(i19)) {
                            i20 = columnIndexOrThrow34;
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorQuery.getLong(i19));
                            i20 = columnIndexOrThrow34;
                        }
                        if (cursorQuery.isNull(i20)) {
                            i21 = columnIndexOrThrow35;
                            lValueOf3 = null;
                        } else {
                            lValueOf3 = Long.valueOf(cursorQuery.getLong(i20));
                            i21 = columnIndexOrThrow35;
                        }
                        if (cursorQuery.isNull(i21)) {
                            i22 = columnIndexOrThrow36;
                            string15 = null;
                        } else {
                            string15 = cursorQuery.getString(i21);
                            i22 = columnIndexOrThrow36;
                        }
                        if (cursorQuery.isNull(i22)) {
                            i23 = columnIndexOrThrow37;
                            string16 = null;
                        } else {
                            string16 = cursorQuery.getString(i22);
                            i23 = columnIndexOrThrow37;
                        }
                        if (cursorQuery.isNull(i23)) {
                            i24 = columnIndexOrThrow38;
                            lValueOf4 = null;
                        } else {
                            lValueOf4 = Long.valueOf(cursorQuery.getLong(i23));
                            i24 = columnIndexOrThrow38;
                        }
                        if (cursorQuery.isNull(i24)) {
                            i25 = columnIndexOrThrow39;
                            string17 = null;
                        } else {
                            string17 = cursorQuery.getString(i24);
                            i25 = columnIndexOrThrow39;
                        }
                        h96Var = new h96(string18, string19, string20, string21, string22, string23, string24, string25, string26, lValueOf5, lValueOf6, lValueOf7, lValueOf8, string, string2, string3, string4, string5, string6, string7, lValueOf, z, string8, boolValueOf, boolValueOf2, boolValueOf3, string9, string10, string11, string12, string13, string14, lValueOf2, lValueOf3, string15, string16, lValueOf4, string17, cursorQuery.isNull(i25) ? null : cursorQuery.getString(i25), cursorQuery.isNull(columnIndexOrThrow40) ? null : cursorQuery.getString(columnIndexOrThrow40));
                    } else {
                        h96Var = null;
                    }
                    cursorQuery.close();
                    this.f31676a.release();
                    return h96Var;
                } catch (Throwable th) {
                    th = th;
                    callableC14739a = this;
                    cursorQuery.close();
                    callableC14739a.f31676a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: o.k96$b */
    public class CallableC14740b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f31678a;

        public CallableC14740b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f31678a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() throws Throwable {
            CallableC14740b callableC14740b;
            int columnIndexOrThrow;
            int columnIndexOrThrow2;
            int columnIndexOrThrow3;
            int columnIndexOrThrow4;
            int columnIndexOrThrow5;
            int columnIndexOrThrow6;
            int columnIndexOrThrow7;
            int columnIndexOrThrow8;
            int columnIndexOrThrow9;
            int columnIndexOrThrow10;
            int columnIndexOrThrow11;
            int columnIndexOrThrow12;
            int columnIndexOrThrow13;
            int columnIndexOrThrow14;
            Long lValueOf;
            int i;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string;
            int i2;
            Cursor cursorQuery = DBUtil.query(k96.this.f31672a, this.f31678a, false, null);
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientID");
                columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientName");
                columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientCompany");
                columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientProfilePic");
                columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientDesignation");
                columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "primaryTeamId");
                columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientContactNumber");
                columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userNumber");
                columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callTimeInMillis");
                columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStartTime");
                columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callEndTime");
                columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDuration");
                columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDirection");
            } catch (Throwable th) {
                th = th;
                callableC14740b = this;
            }
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectionStatus");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementType");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceType");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSource");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceLevelTwo");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectTime");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "inFlightCall");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "androidDeviceId");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recording");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mapping");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadedFile");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uri");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileName");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filePath");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mimeType");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingDateAdded");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProvider");
                int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProviderNumber");
                int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalCallDuration");
                int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callType");
                int columnIndexOrThrow39 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hangupReason");
                int columnIndexOrThrow40 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneCallLogId");
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
                    String string9 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string10 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow10));
                    Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow11) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow11));
                    Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow12) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow12));
                    if (cursorQuery.isNull(columnIndexOrThrow13)) {
                        i = i3;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow13));
                        i = i3;
                    }
                    String string11 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                    int i4 = columnIndexOrThrow15;
                    int i5 = columnIndexOrThrow;
                    String string12 = cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4);
                    int i6 = columnIndexOrThrow16;
                    String string13 = cursorQuery.isNull(i6) ? null : cursorQuery.getString(i6);
                    int i7 = columnIndexOrThrow17;
                    String string14 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                    int i8 = columnIndexOrThrow18;
                    String string15 = cursorQuery.isNull(i8) ? null : cursorQuery.getString(i8);
                    int i9 = columnIndexOrThrow19;
                    String string16 = cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9);
                    int i10 = columnIndexOrThrow20;
                    String string17 = cursorQuery.isNull(i10) ? null : cursorQuery.getString(i10);
                    int i11 = columnIndexOrThrow21;
                    Long lValueOf5 = cursorQuery.isNull(i11) ? null : Long.valueOf(cursorQuery.getLong(i11));
                    int i12 = columnIndexOrThrow22;
                    boolean z = true;
                    boolean z2 = cursorQuery.getInt(i12) != 0;
                    int i13 = columnIndexOrThrow23;
                    String string18 = cursorQuery.isNull(i13) ? null : cursorQuery.getString(i13);
                    int i14 = columnIndexOrThrow24;
                    Integer numValueOf = cursorQuery.isNull(i14) ? null : Integer.valueOf(cursorQuery.getInt(i14));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    int i15 = columnIndexOrThrow25;
                    Integer numValueOf2 = cursorQuery.isNull(i15) ? null : Integer.valueOf(cursorQuery.getInt(i15));
                    if (numValueOf2 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    int i16 = columnIndexOrThrow26;
                    Integer numValueOf3 = cursorQuery.isNull(i16) ? null : Integer.valueOf(cursorQuery.getInt(i16));
                    if (numValueOf3 == null) {
                        boolValueOf3 = null;
                    } else {
                        if (numValueOf3.intValue() == 0) {
                            z = false;
                        }
                        boolValueOf3 = Boolean.valueOf(z);
                    }
                    int i17 = columnIndexOrThrow27;
                    String string19 = cursorQuery.isNull(i17) ? null : cursorQuery.getString(i17);
                    int i18 = columnIndexOrThrow28;
                    String string20 = cursorQuery.isNull(i18) ? null : cursorQuery.getString(i18);
                    int i19 = columnIndexOrThrow29;
                    String string21 = cursorQuery.isNull(i19) ? null : cursorQuery.getString(i19);
                    int i20 = columnIndexOrThrow30;
                    String string22 = cursorQuery.isNull(i20) ? null : cursorQuery.getString(i20);
                    int i21 = columnIndexOrThrow31;
                    String string23 = cursorQuery.isNull(i21) ? null : cursorQuery.getString(i21);
                    int i22 = columnIndexOrThrow32;
                    String string24 = cursorQuery.isNull(i22) ? null : cursorQuery.getString(i22);
                    int i23 = columnIndexOrThrow33;
                    Long lValueOf6 = cursorQuery.isNull(i23) ? null : Long.valueOf(cursorQuery.getLong(i23));
                    int i24 = columnIndexOrThrow34;
                    Long lValueOf7 = cursorQuery.isNull(i24) ? null : Long.valueOf(cursorQuery.getLong(i24));
                    int i25 = columnIndexOrThrow35;
                    String string25 = cursorQuery.isNull(i25) ? null : cursorQuery.getString(i25);
                    int i26 = columnIndexOrThrow36;
                    String string26 = cursorQuery.isNull(i26) ? null : cursorQuery.getString(i26);
                    int i27 = columnIndexOrThrow37;
                    Long lValueOf8 = cursorQuery.isNull(i27) ? null : Long.valueOf(cursorQuery.getLong(i27));
                    int i28 = columnIndexOrThrow38;
                    String string27 = cursorQuery.isNull(i28) ? null : cursorQuery.getString(i28);
                    int i29 = columnIndexOrThrow39;
                    String string28 = cursorQuery.isNull(i29) ? null : cursorQuery.getString(i29);
                    int i30 = columnIndexOrThrow40;
                    if (cursorQuery.isNull(i30)) {
                        i2 = i30;
                        string = null;
                    } else {
                        string = cursorQuery.getString(i30);
                        i2 = i30;
                    }
                    arrayList.add(new h96(string2, string3, string4, string5, string6, string7, string8, string9, string10, lValueOf2, lValueOf3, lValueOf4, lValueOf, string11, string12, string13, string14, string15, string16, string17, lValueOf5, z2, string18, boolValueOf, boolValueOf2, boolValueOf3, string19, string20, string21, string22, string23, string24, lValueOf6, lValueOf7, string25, string26, lValueOf8, string27, string28, string));
                    columnIndexOrThrow = i5;
                    columnIndexOrThrow15 = i4;
                    columnIndexOrThrow16 = i6;
                    columnIndexOrThrow17 = i7;
                    columnIndexOrThrow18 = i8;
                    columnIndexOrThrow19 = i9;
                    columnIndexOrThrow20 = i10;
                    columnIndexOrThrow21 = i11;
                    columnIndexOrThrow22 = i12;
                    columnIndexOrThrow23 = i13;
                    columnIndexOrThrow24 = i14;
                    columnIndexOrThrow25 = i15;
                    columnIndexOrThrow26 = i16;
                    columnIndexOrThrow27 = i17;
                    columnIndexOrThrow28 = i18;
                    columnIndexOrThrow29 = i19;
                    columnIndexOrThrow30 = i20;
                    columnIndexOrThrow31 = i21;
                    columnIndexOrThrow32 = i22;
                    columnIndexOrThrow33 = i23;
                    columnIndexOrThrow34 = i24;
                    columnIndexOrThrow35 = i25;
                    columnIndexOrThrow36 = i26;
                    columnIndexOrThrow37 = i27;
                    columnIndexOrThrow38 = i28;
                    columnIndexOrThrow39 = i29;
                    columnIndexOrThrow40 = i2;
                    i3 = i;
                }
                cursorQuery.close();
                this.f31678a.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                callableC14740b = this;
                cursorQuery.close();
                callableC14740b.f31678a.release();
                throw th;
            }
        }
    }

    /* renamed from: o.k96$c */
    public class C14741c extends EntityInsertionAdapter {
        public C14741c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, h96 h96Var) {
            if (h96Var.m30022z() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, h96Var.m30022z());
            }
            if (h96Var.m30009m() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, h96Var.m30009m());
            }
            if (h96Var.m30010n() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, h96Var.m30010n());
            }
            if (h96Var.m30006j() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, h96Var.m30006j());
            }
            if (h96Var.m30011o() == null) {
                pegVar.bindNull(5);
            } else {
                pegVar.bindString(5, h96Var.m30011o());
            }
            if (h96Var.m30008l() == null) {
                pegVar.bindNull(6);
            } else {
                pegVar.bindString(6, h96Var.m30008l());
            }
            if (h96Var.m29987F() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, h96Var.m29987F());
            }
            if (h96Var.m30007k() == null) {
                pegVar.bindNull(8);
            } else {
                pegVar.bindString(8, h96Var.m30007k());
            }
            if (h96Var.m29995N() == null) {
                pegVar.bindNull(9);
            } else {
                pegVar.bindString(9, h96Var.m29995N());
            }
            if (h96Var.m30004h() == null) {
                pegVar.bindNull(10);
            } else {
                pegVar.bindLong(10, h96Var.m30004h().longValue());
            }
            if (h96Var.m30003g() == null) {
                pegVar.bindNull(11);
            } else {
                pegVar.bindLong(11, h96Var.m30003g().longValue());
            }
            if (h96Var.m30002f() == null) {
                pegVar.bindNull(12);
            } else {
                pegVar.bindLong(12, h96Var.m30002f().longValue());
            }
            if (h96Var.m30001e() == null) {
                pegVar.bindNull(13);
            } else {
                pegVar.bindLong(13, h96Var.m30001e().longValue());
            }
            if (h96Var.m30000d() == null) {
                pegVar.bindNull(14);
            } else {
                pegVar.bindString(14, h96Var.m30000d());
            }
            if (h96Var.m29999c() == null) {
                pegVar.bindNull(15);
            } else {
                pegVar.bindString(15, h96Var.m29999c());
            }
            if (h96Var.m30018v() == null) {
                pegVar.bindNull(16);
            } else {
                pegVar.bindString(16, h96Var.m30018v());
            }
            if (h96Var.m29991J() == null) {
                pegVar.bindNull(17);
            } else {
                pegVar.bindString(17, h96Var.m29991J());
            }
            if (h96Var.m30017u() == null) {
                pegVar.bindNull(18);
            } else {
                pegVar.bindString(18, h96Var.m30017u());
            }
            if (h96Var.m30015s() == null) {
                pegVar.bindNull(19);
            } else {
                pegVar.bindString(19, h96Var.m30015s());
            }
            if (h96Var.m30016t() == null) {
                pegVar.bindNull(20);
            } else {
                pegVar.bindString(20, h96Var.m30016t());
            }
            if (h96Var.m29998b() == null) {
                pegVar.bindNull(21);
            } else {
                pegVar.bindLong(21, h96Var.m29998b().longValue());
            }
            pegVar.bindLong(22, h96Var.m29982A() ? 1L : 0L);
            if (h96Var.m29997a() == null) {
                pegVar.bindNull(23);
            } else {
                pegVar.bindString(23, h96Var.m29997a());
            }
            if ((h96Var.m29985D() == null ? null : Integer.valueOf(h96Var.m29985D().booleanValue() ? 1 : 0)) == null) {
                pegVar.bindNull(24);
            } else {
                pegVar.bindLong(24, r0.intValue());
            }
            if ((h96Var.m29988G() == null ? null : Integer.valueOf(h96Var.m29988G().booleanValue() ? 1 : 0)) == null) {
                pegVar.bindNull(25);
            } else {
                pegVar.bindLong(25, r0.intValue());
            }
            if ((h96Var.m29983B() != null ? Integer.valueOf(h96Var.m29983B().booleanValue() ? 1 : 0) : null) == null) {
                pegVar.bindNull(26);
            } else {
                pegVar.bindLong(26, r1.intValue());
            }
            if (h96Var.m29993L() == null) {
                pegVar.bindNull(27);
            } else {
                pegVar.bindString(27, h96Var.m29993L());
            }
            if (h96Var.m29990I() == null) {
                pegVar.bindNull(28);
            } else {
                pegVar.bindString(28, h96Var.m29990I());
            }
            if (h96Var.m29994M() == null) {
                pegVar.bindNull(29);
            } else {
                pegVar.bindString(29, h96Var.m29994M());
            }
            if (h96Var.m30019w() == null) {
                pegVar.bindNull(30);
            } else {
                pegVar.bindString(30, h96Var.m30019w());
            }
            if (h96Var.m30020x() == null) {
                pegVar.bindNull(31);
            } else {
                pegVar.bindString(31, h96Var.m30020x());
            }
            if (h96Var.m29984C() == null) {
                pegVar.bindNull(32);
            } else {
                pegVar.bindString(32, h96Var.m29984C());
            }
            if (h96Var.m29989H() == null) {
                pegVar.bindNull(33);
            } else {
                pegVar.bindLong(33, h96Var.m29989H().longValue());
            }
            if (h96Var.m30014r() == null) {
                pegVar.bindNull(34);
            } else {
                pegVar.bindLong(34, h96Var.m30014r().longValue());
            }
            if (h96Var.m30012p() == null) {
                pegVar.bindNull(35);
            } else {
                pegVar.bindString(35, h96Var.m30012p());
            }
            if (h96Var.m30013q() == null) {
                pegVar.bindNull(36);
            } else {
                pegVar.bindString(36, h96Var.m30013q());
            }
            if (h96Var.m29992K() == null) {
                pegVar.bindNull(37);
            } else {
                pegVar.bindLong(37, h96Var.m29992K().longValue());
            }
            if (h96Var.m30005i() == null) {
                pegVar.bindNull(38);
            } else {
                pegVar.bindString(38, h96Var.m30005i());
            }
            if (h96Var.m30021y() == null) {
                pegVar.bindNull(39);
            } else {
                pegVar.bindString(39, h96Var.m30021y());
            }
            if (h96Var.m29986E() == null) {
                pegVar.bindNull(40);
            } else {
                pegVar.bindString(40, h96Var.m29986E());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `engagement` (`id`,`clientID`,`clientName`,`clientCompany`,`clientProfilePic`,`clientDesignation`,`primaryTeamId`,`clientContactNumber`,`userNumber`,`callTimeInMillis`,`callStartTime`,`callEndTime`,`callDuration`,`callDirection`,`callConnectionStatus`,`engagementType`,`status`,`engagementSourceType`,`engagementSource`,`engagementSourceLevelTwo`,`callConnectTime`,`inFlightCall`,`androidDeviceId`,`persisted`,`recording`,`mapping`,`uploadedFile`,`recordingId`,`uri`,`fileName`,`filePath`,`mimeType`,`recordingDateAdded`,`createdAt`,`cloudProvider`,`cloudProviderNumber`,`totalCallDuration`,`callType`,`hangupReason`,`phoneCallLogId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: o.k96$d */
    public class C14742d extends EntityDeletionOrUpdateAdapter {
        public C14742d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, h96 h96Var) {
            if (h96Var.m30022z() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, h96Var.m30022z());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `engagement` WHERE `id` = ?";
        }
    }

    /* renamed from: o.k96$e */
    public class C14743e extends EntityDeletionOrUpdateAdapter {
        public C14743e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(peg pegVar, h96 h96Var) {
            if (h96Var.m30022z() == null) {
                pegVar.bindNull(1);
            } else {
                pegVar.bindString(1, h96Var.m30022z());
            }
            if (h96Var.m30009m() == null) {
                pegVar.bindNull(2);
            } else {
                pegVar.bindString(2, h96Var.m30009m());
            }
            if (h96Var.m30010n() == null) {
                pegVar.bindNull(3);
            } else {
                pegVar.bindString(3, h96Var.m30010n());
            }
            if (h96Var.m30006j() == null) {
                pegVar.bindNull(4);
            } else {
                pegVar.bindString(4, h96Var.m30006j());
            }
            if (h96Var.m30011o() == null) {
                pegVar.bindNull(5);
            } else {
                pegVar.bindString(5, h96Var.m30011o());
            }
            if (h96Var.m30008l() == null) {
                pegVar.bindNull(6);
            } else {
                pegVar.bindString(6, h96Var.m30008l());
            }
            if (h96Var.m29987F() == null) {
                pegVar.bindNull(7);
            } else {
                pegVar.bindString(7, h96Var.m29987F());
            }
            if (h96Var.m30007k() == null) {
                pegVar.bindNull(8);
            } else {
                pegVar.bindString(8, h96Var.m30007k());
            }
            if (h96Var.m29995N() == null) {
                pegVar.bindNull(9);
            } else {
                pegVar.bindString(9, h96Var.m29995N());
            }
            if (h96Var.m30004h() == null) {
                pegVar.bindNull(10);
            } else {
                pegVar.bindLong(10, h96Var.m30004h().longValue());
            }
            if (h96Var.m30003g() == null) {
                pegVar.bindNull(11);
            } else {
                pegVar.bindLong(11, h96Var.m30003g().longValue());
            }
            if (h96Var.m30002f() == null) {
                pegVar.bindNull(12);
            } else {
                pegVar.bindLong(12, h96Var.m30002f().longValue());
            }
            if (h96Var.m30001e() == null) {
                pegVar.bindNull(13);
            } else {
                pegVar.bindLong(13, h96Var.m30001e().longValue());
            }
            if (h96Var.m30000d() == null) {
                pegVar.bindNull(14);
            } else {
                pegVar.bindString(14, h96Var.m30000d());
            }
            if (h96Var.m29999c() == null) {
                pegVar.bindNull(15);
            } else {
                pegVar.bindString(15, h96Var.m29999c());
            }
            if (h96Var.m30018v() == null) {
                pegVar.bindNull(16);
            } else {
                pegVar.bindString(16, h96Var.m30018v());
            }
            if (h96Var.m29991J() == null) {
                pegVar.bindNull(17);
            } else {
                pegVar.bindString(17, h96Var.m29991J());
            }
            if (h96Var.m30017u() == null) {
                pegVar.bindNull(18);
            } else {
                pegVar.bindString(18, h96Var.m30017u());
            }
            if (h96Var.m30015s() == null) {
                pegVar.bindNull(19);
            } else {
                pegVar.bindString(19, h96Var.m30015s());
            }
            if (h96Var.m30016t() == null) {
                pegVar.bindNull(20);
            } else {
                pegVar.bindString(20, h96Var.m30016t());
            }
            if (h96Var.m29998b() == null) {
                pegVar.bindNull(21);
            } else {
                pegVar.bindLong(21, h96Var.m29998b().longValue());
            }
            pegVar.bindLong(22, h96Var.m29982A() ? 1L : 0L);
            if (h96Var.m29997a() == null) {
                pegVar.bindNull(23);
            } else {
                pegVar.bindString(23, h96Var.m29997a());
            }
            if ((h96Var.m29985D() == null ? null : Integer.valueOf(h96Var.m29985D().booleanValue() ? 1 : 0)) == null) {
                pegVar.bindNull(24);
            } else {
                pegVar.bindLong(24, r0.intValue());
            }
            if ((h96Var.m29988G() == null ? null : Integer.valueOf(h96Var.m29988G().booleanValue() ? 1 : 0)) == null) {
                pegVar.bindNull(25);
            } else {
                pegVar.bindLong(25, r0.intValue());
            }
            if ((h96Var.m29983B() != null ? Integer.valueOf(h96Var.m29983B().booleanValue() ? 1 : 0) : null) == null) {
                pegVar.bindNull(26);
            } else {
                pegVar.bindLong(26, r1.intValue());
            }
            if (h96Var.m29993L() == null) {
                pegVar.bindNull(27);
            } else {
                pegVar.bindString(27, h96Var.m29993L());
            }
            if (h96Var.m29990I() == null) {
                pegVar.bindNull(28);
            } else {
                pegVar.bindString(28, h96Var.m29990I());
            }
            if (h96Var.m29994M() == null) {
                pegVar.bindNull(29);
            } else {
                pegVar.bindString(29, h96Var.m29994M());
            }
            if (h96Var.m30019w() == null) {
                pegVar.bindNull(30);
            } else {
                pegVar.bindString(30, h96Var.m30019w());
            }
            if (h96Var.m30020x() == null) {
                pegVar.bindNull(31);
            } else {
                pegVar.bindString(31, h96Var.m30020x());
            }
            if (h96Var.m29984C() == null) {
                pegVar.bindNull(32);
            } else {
                pegVar.bindString(32, h96Var.m29984C());
            }
            if (h96Var.m29989H() == null) {
                pegVar.bindNull(33);
            } else {
                pegVar.bindLong(33, h96Var.m29989H().longValue());
            }
            if (h96Var.m30014r() == null) {
                pegVar.bindNull(34);
            } else {
                pegVar.bindLong(34, h96Var.m30014r().longValue());
            }
            if (h96Var.m30012p() == null) {
                pegVar.bindNull(35);
            } else {
                pegVar.bindString(35, h96Var.m30012p());
            }
            if (h96Var.m30013q() == null) {
                pegVar.bindNull(36);
            } else {
                pegVar.bindString(36, h96Var.m30013q());
            }
            if (h96Var.m29992K() == null) {
                pegVar.bindNull(37);
            } else {
                pegVar.bindLong(37, h96Var.m29992K().longValue());
            }
            if (h96Var.m30005i() == null) {
                pegVar.bindNull(38);
            } else {
                pegVar.bindString(38, h96Var.m30005i());
            }
            if (h96Var.m30021y() == null) {
                pegVar.bindNull(39);
            } else {
                pegVar.bindString(39, h96Var.m30021y());
            }
            if (h96Var.m29986E() == null) {
                pegVar.bindNull(40);
            } else {
                pegVar.bindString(40, h96Var.m29986E());
            }
            if (h96Var.m30022z() == null) {
                pegVar.bindNull(41);
            } else {
                pegVar.bindString(41, h96Var.m30022z());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `engagement` SET `id` = ?,`clientID` = ?,`clientName` = ?,`clientCompany` = ?,`clientProfilePic` = ?,`clientDesignation` = ?,`primaryTeamId` = ?,`clientContactNumber` = ?,`userNumber` = ?,`callTimeInMillis` = ?,`callStartTime` = ?,`callEndTime` = ?,`callDuration` = ?,`callDirection` = ?,`callConnectionStatus` = ?,`engagementType` = ?,`status` = ?,`engagementSourceType` = ?,`engagementSource` = ?,`engagementSourceLevelTwo` = ?,`callConnectTime` = ?,`inFlightCall` = ?,`androidDeviceId` = ?,`persisted` = ?,`recording` = ?,`mapping` = ?,`uploadedFile` = ?,`recordingId` = ?,`uri` = ?,`fileName` = ?,`filePath` = ?,`mimeType` = ?,`recordingDateAdded` = ?,`createdAt` = ?,`cloudProvider` = ?,`cloudProviderNumber` = ?,`totalCallDuration` = ?,`callType` = ?,`hangupReason` = ?,`phoneCallLogId` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: o.k96$f */
    public class CallableC14744f implements Callable {

        /* renamed from: a */
        public final /* synthetic */ h96 f31683a;

        public CallableC14744f(h96 h96Var) {
            this.f31683a = h96Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            k96.this.f31672a.beginTransaction();
            try {
                Long lValueOf = Long.valueOf(k96.this.f31673b.insertAndReturnId(this.f31683a));
                k96.this.f31672a.setTransactionSuccessful();
                return lValueOf;
            } finally {
                k96.this.f31672a.endTransaction();
            }
        }
    }

    /* renamed from: o.k96$g */
    public class CallableC14745g implements Callable {

        /* renamed from: a */
        public final /* synthetic */ h96 f31685a;

        public CallableC14745g(h96 h96Var) {
            this.f31685a = h96Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            k96.this.f31672a.beginTransaction();
            try {
                k96.this.f31674c.handle(this.f31685a);
                k96.this.f31672a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                k96.this.f31672a.endTransaction();
            }
        }
    }

    /* renamed from: o.k96$h */
    public class CallableC14746h implements Callable {

        /* renamed from: a */
        public final /* synthetic */ h96 f31687a;

        public CallableC14746h(h96 h96Var) {
            this.f31687a = h96Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i call() {
            k96.this.f31672a.beginTransaction();
            try {
                k96.this.f31675d.handle(this.f31687a);
                k96.this.f31672a.setTransactionSuccessful();
                return y3i.f54824a;
            } finally {
                k96.this.f31672a.endTransaction();
            }
        }
    }

    /* renamed from: o.k96$i */
    public class CallableC14747i implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f31689a;

        public CallableC14747i(RoomSQLiteQuery roomSQLiteQuery) {
            this.f31689a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() throws Throwable {
            CallableC14747i callableC14747i;
            int columnIndexOrThrow;
            int columnIndexOrThrow2;
            int columnIndexOrThrow3;
            int columnIndexOrThrow4;
            int columnIndexOrThrow5;
            int columnIndexOrThrow6;
            int columnIndexOrThrow7;
            int columnIndexOrThrow8;
            int columnIndexOrThrow9;
            int columnIndexOrThrow10;
            int columnIndexOrThrow11;
            int columnIndexOrThrow12;
            int columnIndexOrThrow13;
            int columnIndexOrThrow14;
            Long lValueOf;
            int i;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string;
            int i2;
            Cursor cursorQuery = DBUtil.query(k96.this.f31672a, this.f31689a, false, null);
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientID");
                columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientName");
                columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientCompany");
                columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientProfilePic");
                columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientDesignation");
                columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "primaryTeamId");
                columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientContactNumber");
                columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userNumber");
                columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callTimeInMillis");
                columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStartTime");
                columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callEndTime");
                columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDuration");
                columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDirection");
            } catch (Throwable th) {
                th = th;
                callableC14747i = this;
            }
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectionStatus");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementType");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceType");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSource");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceLevelTwo");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectTime");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "inFlightCall");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "androidDeviceId");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recording");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mapping");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadedFile");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingId");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uri");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileName");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filePath");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mimeType");
                int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingDateAdded");
                int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProvider");
                int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProviderNumber");
                int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalCallDuration");
                int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callType");
                int columnIndexOrThrow39 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hangupReason");
                int columnIndexOrThrow40 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneCallLogId");
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
                    String string9 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string10 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow10));
                    Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow11) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow11));
                    Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow12) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow12));
                    if (cursorQuery.isNull(columnIndexOrThrow13)) {
                        i = i3;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow13));
                        i = i3;
                    }
                    String string11 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                    int i4 = columnIndexOrThrow15;
                    int i5 = columnIndexOrThrow;
                    String string12 = cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4);
                    int i6 = columnIndexOrThrow16;
                    String string13 = cursorQuery.isNull(i6) ? null : cursorQuery.getString(i6);
                    int i7 = columnIndexOrThrow17;
                    String string14 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                    int i8 = columnIndexOrThrow18;
                    String string15 = cursorQuery.isNull(i8) ? null : cursorQuery.getString(i8);
                    int i9 = columnIndexOrThrow19;
                    String string16 = cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9);
                    int i10 = columnIndexOrThrow20;
                    String string17 = cursorQuery.isNull(i10) ? null : cursorQuery.getString(i10);
                    int i11 = columnIndexOrThrow21;
                    Long lValueOf5 = cursorQuery.isNull(i11) ? null : Long.valueOf(cursorQuery.getLong(i11));
                    int i12 = columnIndexOrThrow22;
                    boolean z = true;
                    boolean z2 = cursorQuery.getInt(i12) != 0;
                    int i13 = columnIndexOrThrow23;
                    String string18 = cursorQuery.isNull(i13) ? null : cursorQuery.getString(i13);
                    int i14 = columnIndexOrThrow24;
                    Integer numValueOf = cursorQuery.isNull(i14) ? null : Integer.valueOf(cursorQuery.getInt(i14));
                    if (numValueOf == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                    }
                    int i15 = columnIndexOrThrow25;
                    Integer numValueOf2 = cursorQuery.isNull(i15) ? null : Integer.valueOf(cursorQuery.getInt(i15));
                    if (numValueOf2 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    int i16 = columnIndexOrThrow26;
                    Integer numValueOf3 = cursorQuery.isNull(i16) ? null : Integer.valueOf(cursorQuery.getInt(i16));
                    if (numValueOf3 == null) {
                        boolValueOf3 = null;
                    } else {
                        if (numValueOf3.intValue() == 0) {
                            z = false;
                        }
                        boolValueOf3 = Boolean.valueOf(z);
                    }
                    int i17 = columnIndexOrThrow27;
                    String string19 = cursorQuery.isNull(i17) ? null : cursorQuery.getString(i17);
                    int i18 = columnIndexOrThrow28;
                    String string20 = cursorQuery.isNull(i18) ? null : cursorQuery.getString(i18);
                    int i19 = columnIndexOrThrow29;
                    String string21 = cursorQuery.isNull(i19) ? null : cursorQuery.getString(i19);
                    int i20 = columnIndexOrThrow30;
                    String string22 = cursorQuery.isNull(i20) ? null : cursorQuery.getString(i20);
                    int i21 = columnIndexOrThrow31;
                    String string23 = cursorQuery.isNull(i21) ? null : cursorQuery.getString(i21);
                    int i22 = columnIndexOrThrow32;
                    String string24 = cursorQuery.isNull(i22) ? null : cursorQuery.getString(i22);
                    int i23 = columnIndexOrThrow33;
                    Long lValueOf6 = cursorQuery.isNull(i23) ? null : Long.valueOf(cursorQuery.getLong(i23));
                    int i24 = columnIndexOrThrow34;
                    Long lValueOf7 = cursorQuery.isNull(i24) ? null : Long.valueOf(cursorQuery.getLong(i24));
                    int i25 = columnIndexOrThrow35;
                    String string25 = cursorQuery.isNull(i25) ? null : cursorQuery.getString(i25);
                    int i26 = columnIndexOrThrow36;
                    String string26 = cursorQuery.isNull(i26) ? null : cursorQuery.getString(i26);
                    int i27 = columnIndexOrThrow37;
                    Long lValueOf8 = cursorQuery.isNull(i27) ? null : Long.valueOf(cursorQuery.getLong(i27));
                    int i28 = columnIndexOrThrow38;
                    String string27 = cursorQuery.isNull(i28) ? null : cursorQuery.getString(i28);
                    int i29 = columnIndexOrThrow39;
                    String string28 = cursorQuery.isNull(i29) ? null : cursorQuery.getString(i29);
                    int i30 = columnIndexOrThrow40;
                    if (cursorQuery.isNull(i30)) {
                        i2 = i30;
                        string = null;
                    } else {
                        string = cursorQuery.getString(i30);
                        i2 = i30;
                    }
                    arrayList.add(new h96(string2, string3, string4, string5, string6, string7, string8, string9, string10, lValueOf2, lValueOf3, lValueOf4, lValueOf, string11, string12, string13, string14, string15, string16, string17, lValueOf5, z2, string18, boolValueOf, boolValueOf2, boolValueOf3, string19, string20, string21, string22, string23, string24, lValueOf6, lValueOf7, string25, string26, lValueOf8, string27, string28, string));
                    columnIndexOrThrow = i5;
                    columnIndexOrThrow15 = i4;
                    columnIndexOrThrow16 = i6;
                    columnIndexOrThrow17 = i7;
                    columnIndexOrThrow18 = i8;
                    columnIndexOrThrow19 = i9;
                    columnIndexOrThrow20 = i10;
                    columnIndexOrThrow21 = i11;
                    columnIndexOrThrow22 = i12;
                    columnIndexOrThrow23 = i13;
                    columnIndexOrThrow24 = i14;
                    columnIndexOrThrow25 = i15;
                    columnIndexOrThrow26 = i16;
                    columnIndexOrThrow27 = i17;
                    columnIndexOrThrow28 = i18;
                    columnIndexOrThrow29 = i19;
                    columnIndexOrThrow30 = i20;
                    columnIndexOrThrow31 = i21;
                    columnIndexOrThrow32 = i22;
                    columnIndexOrThrow33 = i23;
                    columnIndexOrThrow34 = i24;
                    columnIndexOrThrow35 = i25;
                    columnIndexOrThrow36 = i26;
                    columnIndexOrThrow37 = i27;
                    columnIndexOrThrow38 = i28;
                    columnIndexOrThrow39 = i29;
                    columnIndexOrThrow40 = i2;
                    i3 = i;
                }
                cursorQuery.close();
                this.f31689a.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                callableC14747i = this;
                cursorQuery.close();
                callableC14747i.f31689a.release();
                throw th;
            }
        }
    }

    /* renamed from: o.k96$j */
    public class CallableC14748j implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f31691a;

        public CallableC14748j(RoomSQLiteQuery roomSQLiteQuery) {
            this.f31691a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h96 call() throws Throwable {
            h96 h96Var;
            String string;
            int i;
            String string2;
            int i2;
            String string3;
            int i3;
            String string4;
            int i4;
            String string5;
            int i5;
            String string6;
            int i6;
            String string7;
            int i7;
            Long lValueOf;
            int i8;
            int i9;
            boolean z;
            String string8;
            int i10;
            Boolean boolValueOf;
            int i11;
            Boolean boolValueOf2;
            int i12;
            Boolean boolValueOf3;
            int i13;
            String string9;
            int i14;
            String string10;
            int i15;
            String string11;
            int i16;
            String string12;
            int i17;
            String string13;
            int i18;
            String string14;
            int i19;
            Long lValueOf2;
            int i20;
            Long lValueOf3;
            int i21;
            String string15;
            int i22;
            String string16;
            int i23;
            Long lValueOf4;
            int i24;
            String string17;
            int i25;
            CallableC14748j callableC14748j = this;
            Cursor cursorQuery = DBUtil.query(k96.this.f31672a, callableC14748j.f31691a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientID");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientName");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientCompany");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientProfilePic");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientDesignation");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "primaryTeamId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientContactNumber");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userNumber");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callTimeInMillis");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStartTime");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callEndTime");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDuration");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDirection");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectionStatus");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementType");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceType");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSource");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceLevelTwo");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectTime");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "inFlightCall");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "androidDeviceId");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recording");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mapping");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadedFile");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingId");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uri");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileName");
                    int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filePath");
                    int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mimeType");
                    int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingDateAdded");
                    int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                    int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProvider");
                    int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProviderNumber");
                    int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalCallDuration");
                    int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callType");
                    int columnIndexOrThrow39 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hangupReason");
                    int columnIndexOrThrow40 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneCallLogId");
                    if (cursorQuery.moveToFirst()) {
                        String string18 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string19 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string20 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        String string21 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        String string22 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        String string23 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        String string24 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                        String string25 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                        String string26 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        Long lValueOf5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow10));
                        Long lValueOf6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow11));
                        Long lValueOf7 = cursorQuery.isNull(columnIndexOrThrow12) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow12));
                        Long lValueOf8 = cursorQuery.isNull(columnIndexOrThrow13) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow13));
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
                        if (cursorQuery.isNull(i4)) {
                            i5 = columnIndexOrThrow19;
                            string5 = null;
                        } else {
                            string5 = cursorQuery.getString(i4);
                            i5 = columnIndexOrThrow19;
                        }
                        if (cursorQuery.isNull(i5)) {
                            i6 = columnIndexOrThrow20;
                            string6 = null;
                        } else {
                            string6 = cursorQuery.getString(i5);
                            i6 = columnIndexOrThrow20;
                        }
                        if (cursorQuery.isNull(i6)) {
                            i7 = columnIndexOrThrow21;
                            string7 = null;
                        } else {
                            string7 = cursorQuery.getString(i6);
                            i7 = columnIndexOrThrow21;
                        }
                        if (cursorQuery.isNull(i7)) {
                            i8 = columnIndexOrThrow22;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorQuery.getLong(i7));
                            i8 = columnIndexOrThrow22;
                        }
                        boolean z2 = true;
                        if (cursorQuery.getInt(i8) != 0) {
                            z = true;
                            i9 = columnIndexOrThrow23;
                        } else {
                            i9 = columnIndexOrThrow23;
                            z = false;
                        }
                        if (cursorQuery.isNull(i9)) {
                            i10 = columnIndexOrThrow24;
                            string8 = null;
                        } else {
                            string8 = cursorQuery.getString(i9);
                            i10 = columnIndexOrThrow24;
                        }
                        Integer numValueOf = cursorQuery.isNull(i10) ? null : Integer.valueOf(cursorQuery.getInt(i10));
                        if (numValueOf == null) {
                            i11 = columnIndexOrThrow25;
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            i11 = columnIndexOrThrow25;
                        }
                        Integer numValueOf2 = cursorQuery.isNull(i11) ? null : Integer.valueOf(cursorQuery.getInt(i11));
                        if (numValueOf2 == null) {
                            i12 = columnIndexOrThrow26;
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                            i12 = columnIndexOrThrow26;
                        }
                        Integer numValueOf3 = cursorQuery.isNull(i12) ? null : Integer.valueOf(cursorQuery.getInt(i12));
                        if (numValueOf3 == null) {
                            i13 = columnIndexOrThrow27;
                            boolValueOf3 = null;
                        } else {
                            if (numValueOf3.intValue() == 0) {
                                z2 = false;
                            }
                            boolValueOf3 = Boolean.valueOf(z2);
                            i13 = columnIndexOrThrow27;
                        }
                        if (cursorQuery.isNull(i13)) {
                            i14 = columnIndexOrThrow28;
                            string9 = null;
                        } else {
                            string9 = cursorQuery.getString(i13);
                            i14 = columnIndexOrThrow28;
                        }
                        if (cursorQuery.isNull(i14)) {
                            i15 = columnIndexOrThrow29;
                            string10 = null;
                        } else {
                            string10 = cursorQuery.getString(i14);
                            i15 = columnIndexOrThrow29;
                        }
                        if (cursorQuery.isNull(i15)) {
                            i16 = columnIndexOrThrow30;
                            string11 = null;
                        } else {
                            string11 = cursorQuery.getString(i15);
                            i16 = columnIndexOrThrow30;
                        }
                        if (cursorQuery.isNull(i16)) {
                            i17 = columnIndexOrThrow31;
                            string12 = null;
                        } else {
                            string12 = cursorQuery.getString(i16);
                            i17 = columnIndexOrThrow31;
                        }
                        if (cursorQuery.isNull(i17)) {
                            i18 = columnIndexOrThrow32;
                            string13 = null;
                        } else {
                            string13 = cursorQuery.getString(i17);
                            i18 = columnIndexOrThrow32;
                        }
                        if (cursorQuery.isNull(i18)) {
                            i19 = columnIndexOrThrow33;
                            string14 = null;
                        } else {
                            string14 = cursorQuery.getString(i18);
                            i19 = columnIndexOrThrow33;
                        }
                        if (cursorQuery.isNull(i19)) {
                            i20 = columnIndexOrThrow34;
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorQuery.getLong(i19));
                            i20 = columnIndexOrThrow34;
                        }
                        if (cursorQuery.isNull(i20)) {
                            i21 = columnIndexOrThrow35;
                            lValueOf3 = null;
                        } else {
                            lValueOf3 = Long.valueOf(cursorQuery.getLong(i20));
                            i21 = columnIndexOrThrow35;
                        }
                        if (cursorQuery.isNull(i21)) {
                            i22 = columnIndexOrThrow36;
                            string15 = null;
                        } else {
                            string15 = cursorQuery.getString(i21);
                            i22 = columnIndexOrThrow36;
                        }
                        if (cursorQuery.isNull(i22)) {
                            i23 = columnIndexOrThrow37;
                            string16 = null;
                        } else {
                            string16 = cursorQuery.getString(i22);
                            i23 = columnIndexOrThrow37;
                        }
                        if (cursorQuery.isNull(i23)) {
                            i24 = columnIndexOrThrow38;
                            lValueOf4 = null;
                        } else {
                            lValueOf4 = Long.valueOf(cursorQuery.getLong(i23));
                            i24 = columnIndexOrThrow38;
                        }
                        if (cursorQuery.isNull(i24)) {
                            i25 = columnIndexOrThrow39;
                            string17 = null;
                        } else {
                            string17 = cursorQuery.getString(i24);
                            i25 = columnIndexOrThrow39;
                        }
                        h96Var = new h96(string18, string19, string20, string21, string22, string23, string24, string25, string26, lValueOf5, lValueOf6, lValueOf7, lValueOf8, string, string2, string3, string4, string5, string6, string7, lValueOf, z, string8, boolValueOf, boolValueOf2, boolValueOf3, string9, string10, string11, string12, string13, string14, lValueOf2, lValueOf3, string15, string16, lValueOf4, string17, cursorQuery.isNull(i25) ? null : cursorQuery.getString(i25), cursorQuery.isNull(columnIndexOrThrow40) ? null : cursorQuery.getString(columnIndexOrThrow40));
                    } else {
                        h96Var = null;
                    }
                    cursorQuery.close();
                    this.f31691a.release();
                    return h96Var;
                } catch (Throwable th) {
                    th = th;
                    callableC14748j = this;
                    cursorQuery.close();
                    callableC14748j.f31691a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: o.k96$k */
    public class CallableC14749k implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f31693a;

        public CallableC14749k(RoomSQLiteQuery roomSQLiteQuery) {
            this.f31693a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h96 call() throws Throwable {
            h96 h96Var;
            String string;
            int i;
            String string2;
            int i2;
            String string3;
            int i3;
            String string4;
            int i4;
            String string5;
            int i5;
            String string6;
            int i6;
            String string7;
            int i7;
            Long lValueOf;
            int i8;
            int i9;
            boolean z;
            String string8;
            int i10;
            Boolean boolValueOf;
            int i11;
            Boolean boolValueOf2;
            int i12;
            Boolean boolValueOf3;
            int i13;
            String string9;
            int i14;
            String string10;
            int i15;
            String string11;
            int i16;
            String string12;
            int i17;
            String string13;
            int i18;
            String string14;
            int i19;
            Long lValueOf2;
            int i20;
            Long lValueOf3;
            int i21;
            String string15;
            int i22;
            String string16;
            int i23;
            Long lValueOf4;
            int i24;
            String string17;
            int i25;
            CallableC14749k callableC14749k = this;
            Cursor cursorQuery = DBUtil.query(k96.this.f31672a, callableC14749k.f31693a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, OutcomeConstants.OUTCOME_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientID");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientName");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientCompany");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientProfilePic");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientDesignation");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "primaryTeamId");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "clientContactNumber");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userNumber");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callTimeInMillis");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callStartTime");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callEndTime");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDuration");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callDirection");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectionStatus");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementType");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceType");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSource");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "engagementSourceLevelTwo");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callConnectTime");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "inFlightCall");
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "androidDeviceId");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "persisted");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recording");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mapping");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploadedFile");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingId");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uri");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fileName");
                    int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "filePath");
                    int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mimeType");
                    int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recordingDateAdded");
                    int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                    int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProvider");
                    int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloudProviderNumber");
                    int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalCallDuration");
                    int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "callType");
                    int columnIndexOrThrow39 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hangupReason");
                    int columnIndexOrThrow40 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "phoneCallLogId");
                    if (cursorQuery.moveToFirst()) {
                        String string18 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        String string19 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string20 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        String string21 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        String string22 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        String string23 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        String string24 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                        String string25 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                        String string26 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        Long lValueOf5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow10));
                        Long lValueOf6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow11));
                        Long lValueOf7 = cursorQuery.isNull(columnIndexOrThrow12) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow12));
                        Long lValueOf8 = cursorQuery.isNull(columnIndexOrThrow13) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow13));
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
                        if (cursorQuery.isNull(i4)) {
                            i5 = columnIndexOrThrow19;
                            string5 = null;
                        } else {
                            string5 = cursorQuery.getString(i4);
                            i5 = columnIndexOrThrow19;
                        }
                        if (cursorQuery.isNull(i5)) {
                            i6 = columnIndexOrThrow20;
                            string6 = null;
                        } else {
                            string6 = cursorQuery.getString(i5);
                            i6 = columnIndexOrThrow20;
                        }
                        if (cursorQuery.isNull(i6)) {
                            i7 = columnIndexOrThrow21;
                            string7 = null;
                        } else {
                            string7 = cursorQuery.getString(i6);
                            i7 = columnIndexOrThrow21;
                        }
                        if (cursorQuery.isNull(i7)) {
                            i8 = columnIndexOrThrow22;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorQuery.getLong(i7));
                            i8 = columnIndexOrThrow22;
                        }
                        boolean z2 = true;
                        if (cursorQuery.getInt(i8) != 0) {
                            z = true;
                            i9 = columnIndexOrThrow23;
                        } else {
                            i9 = columnIndexOrThrow23;
                            z = false;
                        }
                        if (cursorQuery.isNull(i9)) {
                            i10 = columnIndexOrThrow24;
                            string8 = null;
                        } else {
                            string8 = cursorQuery.getString(i9);
                            i10 = columnIndexOrThrow24;
                        }
                        Integer numValueOf = cursorQuery.isNull(i10) ? null : Integer.valueOf(cursorQuery.getInt(i10));
                        if (numValueOf == null) {
                            i11 = columnIndexOrThrow25;
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            i11 = columnIndexOrThrow25;
                        }
                        Integer numValueOf2 = cursorQuery.isNull(i11) ? null : Integer.valueOf(cursorQuery.getInt(i11));
                        if (numValueOf2 == null) {
                            i12 = columnIndexOrThrow26;
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                            i12 = columnIndexOrThrow26;
                        }
                        Integer numValueOf3 = cursorQuery.isNull(i12) ? null : Integer.valueOf(cursorQuery.getInt(i12));
                        if (numValueOf3 == null) {
                            i13 = columnIndexOrThrow27;
                            boolValueOf3 = null;
                        } else {
                            if (numValueOf3.intValue() == 0) {
                                z2 = false;
                            }
                            boolValueOf3 = Boolean.valueOf(z2);
                            i13 = columnIndexOrThrow27;
                        }
                        if (cursorQuery.isNull(i13)) {
                            i14 = columnIndexOrThrow28;
                            string9 = null;
                        } else {
                            string9 = cursorQuery.getString(i13);
                            i14 = columnIndexOrThrow28;
                        }
                        if (cursorQuery.isNull(i14)) {
                            i15 = columnIndexOrThrow29;
                            string10 = null;
                        } else {
                            string10 = cursorQuery.getString(i14);
                            i15 = columnIndexOrThrow29;
                        }
                        if (cursorQuery.isNull(i15)) {
                            i16 = columnIndexOrThrow30;
                            string11 = null;
                        } else {
                            string11 = cursorQuery.getString(i15);
                            i16 = columnIndexOrThrow30;
                        }
                        if (cursorQuery.isNull(i16)) {
                            i17 = columnIndexOrThrow31;
                            string12 = null;
                        } else {
                            string12 = cursorQuery.getString(i16);
                            i17 = columnIndexOrThrow31;
                        }
                        if (cursorQuery.isNull(i17)) {
                            i18 = columnIndexOrThrow32;
                            string13 = null;
                        } else {
                            string13 = cursorQuery.getString(i17);
                            i18 = columnIndexOrThrow32;
                        }
                        if (cursorQuery.isNull(i18)) {
                            i19 = columnIndexOrThrow33;
                            string14 = null;
                        } else {
                            string14 = cursorQuery.getString(i18);
                            i19 = columnIndexOrThrow33;
                        }
                        if (cursorQuery.isNull(i19)) {
                            i20 = columnIndexOrThrow34;
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorQuery.getLong(i19));
                            i20 = columnIndexOrThrow34;
                        }
                        if (cursorQuery.isNull(i20)) {
                            i21 = columnIndexOrThrow35;
                            lValueOf3 = null;
                        } else {
                            lValueOf3 = Long.valueOf(cursorQuery.getLong(i20));
                            i21 = columnIndexOrThrow35;
                        }
                        if (cursorQuery.isNull(i21)) {
                            i22 = columnIndexOrThrow36;
                            string15 = null;
                        } else {
                            string15 = cursorQuery.getString(i21);
                            i22 = columnIndexOrThrow36;
                        }
                        if (cursorQuery.isNull(i22)) {
                            i23 = columnIndexOrThrow37;
                            string16 = null;
                        } else {
                            string16 = cursorQuery.getString(i22);
                            i23 = columnIndexOrThrow37;
                        }
                        if (cursorQuery.isNull(i23)) {
                            i24 = columnIndexOrThrow38;
                            lValueOf4 = null;
                        } else {
                            lValueOf4 = Long.valueOf(cursorQuery.getLong(i23));
                            i24 = columnIndexOrThrow38;
                        }
                        if (cursorQuery.isNull(i24)) {
                            i25 = columnIndexOrThrow39;
                            string17 = null;
                        } else {
                            string17 = cursorQuery.getString(i24);
                            i25 = columnIndexOrThrow39;
                        }
                        h96Var = new h96(string18, string19, string20, string21, string22, string23, string24, string25, string26, lValueOf5, lValueOf6, lValueOf7, lValueOf8, string, string2, string3, string4, string5, string6, string7, lValueOf, z, string8, boolValueOf, boolValueOf2, boolValueOf3, string9, string10, string11, string12, string13, string14, lValueOf2, lValueOf3, string15, string16, lValueOf4, string17, cursorQuery.isNull(i25) ? null : cursorQuery.getString(i25), cursorQuery.isNull(columnIndexOrThrow40) ? null : cursorQuery.getString(columnIndexOrThrow40));
                    } else {
                        h96Var = null;
                    }
                    cursorQuery.close();
                    this.f31693a.release();
                    return h96Var;
                } catch (Throwable th) {
                    th = th;
                    callableC14749k = this;
                    cursorQuery.close();
                    callableC14749k.f31693a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public k96(RoomDatabase roomDatabase) {
        this.f31672a = roomDatabase;
        this.f31673b = new C14741c(roomDatabase);
        this.f31674c = new C14742d(roomDatabase);
        this.f31675d = new C14743e(roomDatabase);
    }

    /* renamed from: o */
    public static List m35193o() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m35194p(h96 h96Var, n64 n64Var) {
        return i96.C14225a.m31773a(this, h96Var, n64Var);
    }

    @Override // p001o.i96
    /* renamed from: a */
    public Object mo31764a(long j, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM engagement WHERE engagementSourceLevelTwo = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.f31672a, false, DBUtil.createCancellationSignal(), new CallableC14749k(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: b */
    public Object mo31765b(long j, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM engagement WHERE createdAt < ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.f31672a, false, DBUtil.createCancellationSignal(), new CallableC14740b(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: c */
    public Object mo31766c(h96 h96Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f31672a, true, new CallableC14746h(h96Var), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: d */
    public Object mo31767d(long j, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM engagement WHERE (createdAt <= ? or callStartTime <= ?) and inFlightCall = 0 ORDER BY createdAt ASC", 2);
        roomSQLiteQueryAcquire.bindLong(1, j);
        roomSQLiteQueryAcquire.bindLong(2, j);
        return CoroutinesRoom.execute(this.f31672a, false, DBUtil.createCancellationSignal(), new CallableC14747i(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: e */
    public Object mo31768e(h96 h96Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f31672a, true, new CallableC14744f(h96Var), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: f */
    public Object mo31769f(String str, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM engagement WHERE id = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.f31672a, false, DBUtil.createCancellationSignal(), new CallableC14748j(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: g */
    public Object mo31770g(h96 h96Var, n64 n64Var) {
        return CoroutinesRoom.execute(this.f31672a, true, new CallableC14745g(h96Var), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: h */
    public Object mo31771h(String str, String str2, n64 n64Var) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM engagement WHERE engagementSourceLevelTwo = ? and engagementSourceType = ?", 2);
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
        return CoroutinesRoom.execute(this.f31672a, false, DBUtil.createCancellationSignal(), new CallableC14739a(roomSQLiteQueryAcquire), n64Var);
    }

    @Override // p001o.i96
    /* renamed from: i */
    public Object mo31772i(final h96 h96Var, n64 n64Var) {
        return RoomDatabaseKt.withTransaction(this.f31672a, new xk7() { // from class: o.j96
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return this.f29982a.m35194p(h96Var, (n64) obj);
            }
        }, n64Var);
    }
}
