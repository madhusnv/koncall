package com.amplifyframework.datastore.storage.sqlite.migrations;

import android.database.sqlite.SQLiteDatabase;
import com.amplifyframework.core.model.ModelProvider;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class ModelMigrations {
    private final List<ModelMigration> modelMigrations;

    public ModelMigrations(SQLiteDatabase sQLiteDatabase, ModelProvider modelProvider) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AddModelNameToModelMetadataKey(sQLiteDatabase, modelProvider));
        arrayList.add(new AddSyncExpressionToLastSyncMetadata(sQLiteDatabase));
        this.modelMigrations = Immutable.of(arrayList);
    }

    public void apply() {
        Iterator<ModelMigration> it = this.modelMigrations.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
    }
}
