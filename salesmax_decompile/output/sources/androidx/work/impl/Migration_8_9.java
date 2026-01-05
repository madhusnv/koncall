package androidx.work.impl;

import androidx.room.migration.Migration;
import p001o.leg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Migration_8_9 extends Migration {
    public static final Migration_8_9 INSTANCE = new Migration_8_9();

    private Migration_8_9() {
        super(8, 9);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
