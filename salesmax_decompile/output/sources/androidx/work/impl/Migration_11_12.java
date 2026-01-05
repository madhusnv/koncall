package androidx.work.impl;

import androidx.room.migration.Migration;
import p001o.leg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Migration_11_12 extends Migration {
    public static final Migration_11_12 INSTANCE = new Migration_11_12();

    private Migration_11_12() {
        super(11, 12);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
