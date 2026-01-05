package androidx.room;

import android.database.Cursor;
import androidx.room.migration.Migration;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.leg;
import p001o.meg;
import p001o.sq8;
import p001o.tb3;
import p001o.ttf;

/* loaded from: classes2.dex */
public class RoomOpenHelper extends meg.AbstractC15301a {
    public static final Companion Companion = new Companion(null);
    private DatabaseConfiguration configuration;
    private final Delegate delegate;
    private final String identityHash;
    private final String legacyHash;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final boolean hasEmptySchema$room_runtime_release(leg legVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(legVar, "db");
            Cursor cursorQuery = legVar.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) == 0) {
                        z = true;
                    }
                }
                tb3.m49666a(cursorQuery, null);
                return z;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(leg legVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            sq8.m48649h(legVar, "db");
            Cursor cursorQuery = legVar.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getInt(0) != 0) {
                        z = true;
                    }
                }
                tb3.m49666a(cursorQuery, null);
                return z;
            } finally {
            }
        }
    }

    public static abstract class Delegate {
        public final int version;

        public Delegate(int i) {
            this.version = i;
        }

        public abstract void createAllTables(leg legVar);

        public abstract void dropAllTables(leg legVar);

        public abstract void onCreate(leg legVar);

        public abstract void onOpen(leg legVar);

        public void onPostMigrate(leg legVar) {
            sq8.m48649h(legVar, "db");
        }

        public void onPreMigrate(leg legVar) {
            sq8.m48649h(legVar, "db");
        }

        public ValidationResult onValidateSchema(leg legVar) {
            sq8.m48649h(legVar, "db");
            validateMigration(legVar);
            return new ValidationResult(true, null);
        }

        public void validateMigration(leg legVar) {
            sq8.m48649h(legVar, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public static class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str, String str2) {
        super(delegate.version);
        sq8.m48649h(databaseConfiguration, "configuration");
        sq8.m48649h(delegate, "delegate");
        sq8.m48649h(str, "identityHash");
        sq8.m48649h(str2, "legacyHash");
        this.configuration = databaseConfiguration;
        this.delegate = delegate;
        this.identityHash = str;
        this.legacyHash = str2;
    }

    private final void checkIdentity(leg legVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (!Companion.hasRoomMasterTable$room_runtime_release(legVar)) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(legVar);
            if (validationResultOnValidateSchema.isValid) {
                this.delegate.onPostMigrate(legVar);
                updateIdentity(legVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        Cursor cursorQuery = legVar.query(new ttf(RoomMasterTable.READ_QUERY));
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
            tb3.m49666a(cursorQuery, null);
            if (sq8.m48644c(this.identityHash, string) || sq8.m48644c(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tb3.m49666a(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final void createMasterTableIfNotExists(leg legVar) {
        legVar.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    private final void updateIdentity(leg legVar) {
        createMasterTableIfNotExists(legVar);
        legVar.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    @Override // p001o.meg.AbstractC15301a
    public void onConfigure(leg legVar) {
        sq8.m48649h(legVar, "db");
        super.onConfigure(legVar);
    }

    @Override // p001o.meg.AbstractC15301a
    public void onCreate(leg legVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(legVar, "db");
        boolean zHasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(legVar);
        this.delegate.createAllTables(legVar);
        if (!zHasEmptySchema$room_runtime_release) {
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(legVar);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(legVar);
        this.delegate.onCreate(legVar);
    }

    @Override // p001o.meg.AbstractC15301a
    public void onDowngrade(leg legVar, int i, int i2) {
        sq8.m48649h(legVar, "db");
        onUpgrade(legVar, i, i2);
    }

    @Override // p001o.meg.AbstractC15301a
    public void onOpen(leg legVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(legVar, "db");
        super.onOpen(legVar);
        checkIdentity(legVar);
        this.delegate.onOpen(legVar);
        this.configuration = null;
    }

    @Override // p001o.meg.AbstractC15301a
    public void onUpgrade(leg legVar, int i, int i2) {
        List<Migration> listFindMigrationPath;
        sq8.m48649h(legVar, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        boolean z = false;
        if (databaseConfiguration != null && (listFindMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i, i2)) != null) {
            this.delegate.onPreMigrate(legVar);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(legVar);
            }
            ValidationResult validationResultOnValidateSchema = this.delegate.onValidateSchema(legVar);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Migration didn't properly handle: " + validationResultOnValidateSchema.expectedFoundMsg);
            }
            this.delegate.onPostMigrate(legVar);
            updateIdentity(legVar);
            z = true;
        }
        if (z) {
            return;
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(i, i2)) {
            this.delegate.dropAllTables(legVar);
            this.delegate.createAllTables(legVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str) {
        this(databaseConfiguration, delegate, "", str);
        sq8.m48649h(databaseConfiguration, "configuration");
        sq8.m48649h(delegate, "delegate");
        sq8.m48649h(str, "legacyHash");
    }
}
