package androidx.work.impl;

import androidx.room.migration.Migration;
import p001o.leg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Migration_7_8 extends Migration {
    public static final Migration_7_8 INSTANCE = new Migration_7_8();

    private Migration_7_8() {
        super(7, 8);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
