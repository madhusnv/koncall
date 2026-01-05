package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001o.ch3;
import p001o.meg;
import p001o.sq8;

/* loaded from: classes2.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    public final List<RoomDatabase.Callback> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    public final RoomDatabase.MigrationContainer migrationContainer;
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;
    public final Intent multiInstanceInvalidationServiceIntent;
    public final String name;
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final meg.InterfaceC15303c sqliteOpenHelperFactory;
    public final Executor transactionExecutor;
    public final List<Object> typeConverters;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2, List<? extends AutoMigrationSpec> list3) {
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
        sq8.m48649h(executor2, "transactionExecutor");
        sq8.m48649h(list2, "typeConverters");
        sq8.m48649h(list3, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = interfaceC15303c;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z2;
        this.allowDestructiveMigrationOnDowngrade = z3;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = list2;
        this.autoMigrationSpecs = list3;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean isMigrationRequired(int i, int i2) {
        Set<Integer> set;
        if ((i > i2) && this.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        return this.requireMigration && ((set = this.migrationNotRequiredFrom) == null || !set.contains(Integer.valueOf(i)));
    }

    public boolean isMigrationRequiredFrom(int i) {
        return isMigrationRequired(i, i + 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, boolean z2, Set<Integer> set) {
        this(context, str, interfaceC15303c, migrationContainer, list, z, journalMode, executor, executor, (Intent) null, z2, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) ch3.m21246k(), (List<? extends AutoMigrationSpec>) ch3.m21246k());
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this(context, str, interfaceC15303c, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) ch3.m21246k(), (List<? extends AutoMigrationSpec>) ch3.m21246k());
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
        sq8.m48649h(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this(context, str, interfaceC15303c, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) ch3.m21246k(), (List<? extends AutoMigrationSpec>) ch3.m21246k());
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
        sq8.m48649h(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, interfaceC15303c, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) ch3.m21246k(), (List<? extends AutoMigrationSpec>) ch3.m21246k());
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
        sq8.m48649h(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, interfaceC15303c, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, (List<? extends Object>) ch3.m21246k(), (List<? extends AutoMigrationSpec>) ch3.m21246k());
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
        sq8.m48649h(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2) {
        this(context, str, interfaceC15303c, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, list2, (List<? extends AutoMigrationSpec>) ch3.m21246k());
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
        sq8.m48649h(executor2, "transactionExecutor");
        sq8.m48649h(list2, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, meg.InterfaceC15303c interfaceC15303c, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2, List<? extends AutoMigrationSpec> list3) {
        this(context, str, interfaceC15303c, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, list2, list3);
        sq8.m48649h(context, "context");
        sq8.m48649h(interfaceC15303c, "sqliteOpenHelperFactory");
        sq8.m48649h(migrationContainer, "migrationContainer");
        sq8.m48649h(journalMode, "journalMode");
        sq8.m48649h(executor, "queryExecutor");
        sq8.m48649h(executor2, "transactionExecutor");
        sq8.m48649h(list2, "typeConverters");
        sq8.m48649h(list3, "autoMigrationSpecs");
    }
}
