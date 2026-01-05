package androidx.work.impl;

import android.content.ContentValues;
import androidx.room.RenameColumn;
import androidx.room.migration.AutoMigrationSpec;
import p001o.leg;
import p001o.sq8;

@RenameColumn(fromColumnName = "period_start_time", tableName = "WorkSpec", toColumnName = "last_enqueue_time")
/* loaded from: classes2.dex */
public final class AutoMigration_14_15 implements AutoMigrationSpec {
    @Override // androidx.room.migration.AutoMigrationSpec
    public void onPostMigrate(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.execSQL("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        legVar.update("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
