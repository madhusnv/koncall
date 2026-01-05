package com.amplifyframework.datastore.storage.sqlite;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.datastore.DataStoreConfiguration;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.syncengine.LastSyncMetadata;
import com.amplifyframework.util.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class SyncStatus {
    private final DataStoreConfiguration dataStoreConfiguration;
    private final SqlQueryProcessor sqlQueryProcessor;

    public SyncStatus(SqlQueryProcessor sqlQueryProcessor, DataStoreConfiguration dataStoreConfiguration) {
        this.sqlQueryProcessor = sqlQueryProcessor;
        this.dataStoreConfiguration = dataStoreConfiguration;
    }

    private LastSyncMetadata extractSingleResult(String str, List<LastSyncMetadata> list) throws DataStoreException {
        if (list.size() <= 1) {
            return list.size() == 1 ? list.get(0) : LastSyncMetadata.neverSynced(str);
        }
        throw new DataStoreException("Wanted 1 sync time for model = " + str + ", but found " + list.size() + ".", "This is likely a bug. Please report it to AWS.");
    }

    private LastSyncMetadata getLastSyncMetaData(String str, Consumer<DataStoreException> consumer) {
        return extractSingleResult(str, this.sqlQueryProcessor.queryOfflineData(LastSyncMetadata.class, Where.matches(QueryField.field("modelClassName").eq(str)), consumer));
    }

    public boolean get(String str, Consumer<DataStoreException> consumer) {
        try {
            LastSyncMetadata lastSyncMetaData = getLastSyncMetaData(str, consumer);
            if (lastSyncMetaData.getLastSyncTime() != null) {
                return Time.now() - lastSyncMetaData.getLastSyncTime().longValue() < TimeUnit.MINUTES.toMillis(this.dataStoreConfiguration.getSyncIntervalInMinutes().longValue());
            }
            return false;
        } catch (DataStoreException e) {
            consumer.accept(e);
            return false;
        }
    }
}
