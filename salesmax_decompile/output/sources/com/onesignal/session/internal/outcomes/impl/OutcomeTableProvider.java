package com.onesignal.session.internal.outcomes.impl;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.onesignal.session.internal.influence.InfluenceChannel;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OutcomeTableProvider {
    public final void upgradeCacheOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "db");
        String str = "_id,name,notification_id";
        String str2 = "_id,name,channel_influence_id";
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL(OutcomesDbContract.SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2);
                sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + str2 + ") SELECT " + str + " FROM " + CachedUniqueOutcomeTable.TABLE_NAME_V1 + ';');
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE cached_unique_outcome SET channel_type = '");
                sb.append(InfluenceChannel.NOTIFICATION);
                sb.append("';");
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase.execSQL("DROP TABLE " + CachedUniqueOutcomeTable.TABLE_NAME_V1 + ';');
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL(OutcomesDbContract.SQL_CREATE_OUTCOME_ENTRIES_V2);
                sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision2To3(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "db");
        String str = "_id,name,timestamp,notification_ids,weight,session";
        String str2 = "_id,name,timestamp,notification_ids,weight,notification_influence_type";
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                sQLiteDatabase.execSQL(OutcomesDbContract.SQL_CREATE_OUTCOME_ENTRIES_V3);
                sQLiteDatabase.execSQL("INSERT INTO outcome(" + str2 + ") SELECT " + str + " FROM outcome_aux;");
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TABLE ");
                sb.append("outcome_aux");
                sb.append(';');
                sQLiteDatabase.execSQL(sb.toString());
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void upgradeOutcomeTableRevision3To4(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sq8.m48649h(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("ALTER TABLE outcome ADD COLUMN session_time INTEGER DEFAULT 1;");
            } catch (SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }
}
