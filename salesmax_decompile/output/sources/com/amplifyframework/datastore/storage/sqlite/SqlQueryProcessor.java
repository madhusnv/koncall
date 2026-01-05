package com.amplifyframework.datastore.storage.sqlite;

import android.database.Cursor;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.storage.sqlite.adapter.SQLiteTable;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.GsonFactory;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
class SqlQueryProcessor {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final Gson gson = GsonFactory.instance();
    private final SchemaRegistry modelSchemaRegistry;
    private final SQLCommandFactory sqlCommandFactory;
    private final SQLCommandProcessor sqlCommandProcessor;

    public SqlQueryProcessor(SQLCommandProcessor sQLCommandProcessor, SQLCommandFactory sQLCommandFactory, SchemaRegistry schemaRegistry) {
        this.sqlCommandProcessor = sQLCommandProcessor;
        this.sqlCommandFactory = sQLCommandFactory;
        this.modelSchemaRegistry = schemaRegistry;
    }

    public boolean modelExists(Model model, QueryPredicate queryPredicate) {
        ModelSchema modelSchemaForModelClass = this.modelSchemaRegistry.getModelSchemaForModelClass(model.getModelName());
        SQLiteTable sQLiteTableFromSchema = SQLiteTable.fromSchema(modelSchemaForModelClass);
        return this.sqlCommandProcessor.executeExists(this.sqlCommandFactory.existsFor(modelSchemaForModelClass, queryPredicate.and(QueryField.field(sQLiteTableFromSchema.getName(), sQLiteTableFromSchema.getPrimaryKey().getName()).eq(model.getPrimaryKeyString()))));
    }

    public <T extends Model> List<T> queryOfflineData(Class<T> cls, QueryOptions queryOptions, Consumer<DataStoreException> consumer) {
        ModelSchema modelSchemaForModelClass = this.modelSchemaRegistry.getModelSchemaForModelClass(cls.getSimpleName());
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = this.sqlCommandProcessor.rawQuery(this.sqlCommandFactory.queryFor(modelSchemaForModelClass, queryOptions));
            try {
                LOG.debug("Querying item for: " + cls.getSimpleName());
                SQLiteModelFieldTypeConverter sQLiteModelFieldTypeConverter = new SQLiteModelFieldTypeConverter(modelSchemaForModelClass, this.modelSchemaRegistry, this.gson);
                if (cursorRawQuery == null) {
                    consumer.accept(new DataStoreException("Error in getting a cursor to the table for class: " + cls.getSimpleName(), "Sorry, we don’t have a recovery suggestion for this error."));
                } else if (cursorRawQuery.moveToFirst()) {
                    do {
                        arrayList.add((Model) this.gson.fromJson(this.gson.toJson(sQLiteModelFieldTypeConverter.buildMapForModel(cursorRawQuery)), (Class) cls));
                    } while (cursorRawQuery.moveToNext());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } finally {
            }
        } catch (Exception e) {
            consumer.accept(new DataStoreException("Error in querying the model.", e, "See attached exception for details."));
        }
        return arrayList;
    }
}
