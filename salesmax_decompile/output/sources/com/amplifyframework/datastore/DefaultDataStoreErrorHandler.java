package com.amplifyframework.datastore;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;

/* loaded from: classes5.dex */
public final class DefaultDataStoreErrorHandler implements DataStoreErrorHandler {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");

    private DefaultDataStoreErrorHandler() {
    }

    public static DataStoreErrorHandler instance() {
        return new DefaultDataStoreErrorHandler();
    }

    @Override // com.amplifyframework.core.Consumer
    public void accept(DataStoreException dataStoreException) {
        LOG.error("Error encountered in the DataStore.", dataStoreException);
    }
}
