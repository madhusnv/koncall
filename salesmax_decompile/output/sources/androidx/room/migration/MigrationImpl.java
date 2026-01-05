package androidx.room.migration;

import p001o.leg;
import p001o.xk7;

/* loaded from: classes2.dex */
final class MigrationImpl extends Migration {
    private final xk7 migrateCallback;

    public MigrationImpl(int i, int i2, xk7 xk7Var) {
        super(i, i2);
        this.migrateCallback = xk7Var;
    }

    public final xk7 getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(leg legVar) {
        this.migrateCallback.invoke(legVar);
    }
}
