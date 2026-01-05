package com.amplifyframework.datastore.storage.sqlite.migrations;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Wrap;

/* loaded from: classes5.dex */
final class AddSyncExpressionToLastSyncMetadata implements ModelMigration {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final SQLiteDatabase database;
    private final String newSyncExpColumnName = "syncExpression";

    public AddSyncExpressionToLastSyncMetadata(SQLiteDatabase sQLiteDatabase) {
        this.database = sQLiteDatabase;
    }

    private void addNewSyncExpColumnName() {
        try {
            this.database.beginTransaction();
            this.database.execSQL("ALTER TABLE LastSyncMetadata ADD COLUMN syncExpression TEXT");
            this.database.setTransactionSuccessful();
            LOG.debug("Successfully upgraded LastSyncMetadata table with new field: syncExpression");
        } finally {
            if (this.database.inTransaction()) {
                this.database.endTransaction();
            }
        }
    }

    private boolean needsMigration() {
        Cursor cursorRawQuery = this.database.rawQuery("SELECT COUNT(*) FROM pragma_table_info('LastSyncMetadata') WHERE name=" + Wrap.inSingleQuotes("syncExpression"), new String[0]);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return false;
            }
            boolean z = cursorRawQuery.getInt(0) == 0;
            cursorRawQuery.close();
            return z;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.amplifyframework.datastore.storage.sqlite.migrations.ModelMigration
    public void apply() {
        if (needsMigration()) {
            addNewSyncExpColumnName();
        } else {
            LOG.debug("No LastSyncMetadata migration needed.");
        }
    }
}
