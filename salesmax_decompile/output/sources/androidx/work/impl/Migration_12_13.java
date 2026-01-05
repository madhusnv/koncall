package androidx.work.impl;

import androidx.room.migration.Migration;
import p001o.leg;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Migration_12_13 extends Migration {
    public static final Migration_12_13 INSTANCE = new Migration_12_13();

    private Migration_12_13() {
        super(12, 13);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(leg legVar) {
        sq8.m48649h(legVar, "db");
        legVar.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        legVar.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
