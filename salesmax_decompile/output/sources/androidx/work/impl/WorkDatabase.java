package androidx.work.impl;

import android.content.Context;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.Data;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.concurrent.Executor;
import p001o.id5;
import p001o.meg;
import p001o.ok7;
import p001o.sq8;

@TypeConverters({Data.class, WorkTypeConverters.class})
@Database(autoMigrations = {@AutoMigration(from = 13, to = 14), @AutoMigration(from = 14, spec = AutoMigration_14_15.class, to = 15)}, entities = {Dependency.class, WorkSpec.class, WorkTag.class, SystemIdInfo.class, WorkName.class, WorkProgress.class, Preference.class}, version = 16)
/* loaded from: classes2.dex */
public abstract class WorkDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final meg create$lambda$0(Context context, meg.C15302b c15302b) {
            sq8.m48649h(context, "$context");
            sq8.m48649h(c15302b, "configuration");
            meg.C15302b.a aVarM38862a = meg.C15302b.f35294f.m38862a(context);
            aVarM38862a.m38860d(c15302b.f35296b).m38859c(c15302b.f35297c).m38861e(true).m38857a(true);
            return new ok7().create(aVarM38862a.m38858b());
        }

        public final WorkDatabase create(final Context context, Executor executor, boolean z) {
            sq8.m48649h(context, "context");
            sq8.m48649h(executor, "queryExecutor");
            return (WorkDatabase) (z ? Room.inMemoryDatabaseBuilder(context, WorkDatabase.class).allowMainThreadQueries() : Room.databaseBuilder(context, WorkDatabase.class, WorkDatabasePathHelperKt.WORK_DATABASE_NAME).openHelperFactory(new meg.InterfaceC15303c() { // from class: o.gbj
                @Override // p001o.meg.InterfaceC15303c
                public final meg create(meg.C15302b c15302b) {
                    return WorkDatabase.Companion.create$lambda$0(context, c15302b);
                }
            })).setQueryExecutor(executor).addCallback(CleanupCallback.INSTANCE).addMigrations(Migration_1_2.INSTANCE).addMigrations(new RescheduleMigration(context, 2, 3)).addMigrations(Migration_3_4.INSTANCE).addMigrations(Migration_4_5.INSTANCE).addMigrations(new RescheduleMigration(context, 5, 6)).addMigrations(Migration_6_7.INSTANCE).addMigrations(Migration_7_8.INSTANCE).addMigrations(Migration_8_9.INSTANCE).addMigrations(new WorkMigration9To10(context)).addMigrations(new RescheduleMigration(context, 10, 11)).addMigrations(Migration_11_12.INSTANCE).addMigrations(Migration_12_13.INSTANCE).addMigrations(Migration_15_16.INSTANCE).fallbackToDestructiveMigration().build();
        }
    }

    public static final WorkDatabase create(Context context, Executor executor, boolean z) {
        return Companion.create(context, executor, z);
    }

    public abstract DependencyDao dependencyDao();

    public abstract PreferenceDao preferenceDao();

    public abstract RawWorkInfoDao rawWorkInfoDao();

    public abstract SystemIdInfoDao systemIdInfoDao();

    public abstract WorkNameDao workNameDao();

    public abstract WorkProgressDao workProgressDao();

    public abstract WorkSpecDao workSpecDao();

    public abstract WorkTagDao workTagDao();
}
