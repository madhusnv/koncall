package androidx.work.impl;

import android.content.Context;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.bce;
import p001o.hsa;
import p001o.hwc;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;

/* loaded from: classes2.dex */
public final class WorkDatabasePathHelper {
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    private final File getNoBackupPath(Context context) {
        return new File(Api21Impl.INSTANCE.getNoBackupFilesDir(context), WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }

    public static final void migrateDatabase(Context context) {
        sq8.m48649h(context, "context");
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(context).exists()) {
            Logger.get().debug(WorkDatabasePathHelperKt.TAG, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger.get().warning(WorkDatabasePathHelperKt.TAG, "Over-writing contents of " + value);
                    }
                    Logger.get().debug(WorkDatabasePathHelperKt.TAG, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    public final File getDatabasePath(Context context) {
        sq8.m48649h(context, "context");
        return getNoBackupPath(context);
    }

    public final File getDefaultDatabasePath(Context context) {
        sq8.m48649h(context, "context");
        File databasePath = context.getDatabasePath(WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        sq8.m48648g(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> migrationPaths(Context context) {
        sq8.m48649h(context, "context");
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        String[] strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(strArr.length), 16));
        for (String str : strArr) {
            hwc hwcVarM53620a = vyh.m53620a(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
            linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        return isa.m32688o(linkedHashMap, vyh.m53620a(defaultDatabasePath, databasePath));
    }
}
