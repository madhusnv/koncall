package com.amplifyframework.datastore.storage.sqlite;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import java.util.Set;

/* loaded from: classes5.dex */
interface SQLCommandFactory {
    Set<SqlCommand> createIndexesFor(ModelSchema modelSchema);

    Set<SqlCommand> createIndexesForForeignKeys(ModelSchema modelSchema);

    SqlCommand createTableFor(ModelSchema modelSchema);

    SqlCommand deleteFor(ModelSchema modelSchema, QueryPredicate queryPredicate);

    SqlCommand existsFor(ModelSchema modelSchema, QueryPredicate queryPredicate);

    <T extends Model> SqlCommand insertFor(ModelSchema modelSchema, T t);

    SqlCommand queryFor(ModelSchema modelSchema, QueryOptions queryOptions);

    <T extends Model> SqlCommand updateFor(ModelSchema modelSchema, T t);
}
