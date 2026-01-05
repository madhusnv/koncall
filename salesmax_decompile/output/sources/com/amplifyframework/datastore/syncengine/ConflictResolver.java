package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.datastore.DataStoreConfigurationProvider;
import com.amplifyframework.datastore.DataStoreConflictHandler;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.appsync.AppSync;
import com.amplifyframework.datastore.appsync.AppSyncConflictUnhandledError;
import com.amplifyframework.datastore.appsync.ModelMetadata;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.datastore.syncengine.PendingMutation;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.GsonFactory;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.Objects;
import p001o.auf;
import p001o.k5d;
import p001o.muf;
import p001o.rl7;
import p001o.ur3;
import p001o.wtf;
import p001o.xuf;

/* loaded from: classes5.dex */
final class ConflictResolver {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final AppSync appSync;
    private final DataStoreConfigurationProvider configurationProvider;

    /* renamed from: com.amplifyframework.datastore.syncengine.ConflictResolver$1 */
    public static /* synthetic */ class C105651 {

        /* renamed from: $SwitchMap$com$amplifyframework$datastore$DataStoreConflictHandler$ResolutionStrategy */
        static final /* synthetic */ int[] f10654x1626713e;

        static {
            int[] iArr = new int[DataStoreConflictHandler.ResolutionStrategy.values().length];
            f10654x1626713e = iArr;
            try {
                iArr[DataStoreConflictHandler.ResolutionStrategy.RETRY_LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10654x1626713e[DataStoreConflictHandler.ResolutionStrategy.APPLY_REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10654x1626713e[DataStoreConflictHandler.ResolutionStrategy.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ConflictResolver(DataStoreConfigurationProvider dataStoreConfigurationProvider, AppSync appSync) {
        this.configurationProvider = dataStoreConfigurationProvider;
        this.appSync = appSync;
    }

    private <T extends Model> T getMutatedModelFromSerializedModel(PendingMutation<T> pendingMutation) {
        SerializedModel serializedModel = (T) pendingMutation.getMutatedItem();
        if (!(serializedModel instanceof SerializedModel)) {
            return serializedModel;
        }
        SerializedModel serializedModel2 = serializedModel;
        ModelSchema modelSchema = ((SerializedModel) pendingMutation.getMutatedItem()).getModelSchema();
        Objects.requireNonNull(modelSchema);
        Class<? extends Model> modelClass = modelSchema.getModelClass();
        if (modelClass == SerializedModel.class) {
            return serializedModel;
        }
        Gson gsonInstance = GsonFactory.instance();
        return (T) gsonInstance.fromJson(gsonInstance.toJson(serializedModel2.getSerializedData()), (Type) modelClass);
    }

    private <T extends Model> T getServerModel(ModelWithMetadata<T> modelWithMetadata, T t) {
        SerializedModel serializedModel = (T) modelWithMetadata.getModel();
        return serializedModel instanceof SerializedModel ? SerializedModel.builder().modelSchema(((SerializedModel) t).getModelSchema()).serializedData(serializedModel.getSerializedData()).build() : serializedModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$publish$2(Model model, PendingMutation.Type type2, int i, auf aufVar) {
        ModelSchema modelSchemaForModelClass = SchemaRegistry.instance().getModelSchemaForModelClass(model.getModelName());
        if (type2 == PendingMutation.Type.DELETE) {
            AppSync appSync = this.appSync;
            Integer numValueOf = Integer.valueOf(i);
            Objects.requireNonNull(aufVar);
            appSync.delete(model, modelSchemaForModelClass, numValueOf, new ur3(aufVar), new k5d(aufVar));
            return;
        }
        AppSync appSync2 = this.appSync;
        Integer numValueOf2 = Integer.valueOf(i);
        Objects.requireNonNull(aufVar);
        appSync2.update(model, modelSchemaForModelClass, numValueOf2, new ur3(aufVar), new k5d(aufVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xuf lambda$publish$3(GraphQLResponse graphQLResponse) {
        return (graphQLResponse.hasErrors() || !graphQLResponse.hasData()) ? wtf.m55006g(new DataStoreException("Error encountered while processing conflict data.", "Please check your conflict handler logic.")) : wtf.m55009o((ModelWithMetadata) graphQLResponse.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resolve$0(DataStoreConflictHandler dataStoreConflictHandler, DataStoreConflictHandler.ConflictData conflictData, final auf aufVar) {
        LOG.debug("Invoking conflict handler");
        Objects.requireNonNull(aufVar);
        dataStoreConflictHandler.onConflictDetected(conflictData, new Consumer() { // from class: o.tr3
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                aufVar.onSuccess((DataStoreConflictHandler.ConflictResolutionDecision) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xuf lambda$resolve$1(DataStoreConflictHandler.ConflictData conflictData, ModelMetadata modelMetadata, PendingMutation pendingMutation, DataStoreConflictHandler.ConflictResolutionDecision conflictResolutionDecision) {
        LOG.debug(String.format("Conflict handler decision: %s", conflictResolutionDecision));
        return resolveModelAndMetadata(conflictData, modelMetadata, conflictResolutionDecision, pendingMutation.getMutationType());
    }

    private <T extends Model> wtf publish(final T t, final int i, final PendingMutation.Type type2) {
        return wtf.m55005e(new muf() { // from class: com.amplifyframework.datastore.syncengine.a
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                this.f10658a.lambda$publish$2(t, type2, i, aufVar);
            }
        }).m55015j(new rl7() { // from class: com.amplifyframework.datastore.syncengine.b
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ConflictResolver.lambda$publish$3((GraphQLResponse) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends Model> wtf resolveModelAndMetadata(DataStoreConflictHandler.ConflictData<T> conflictData, ModelMetadata modelMetadata, DataStoreConflictHandler.ConflictResolutionDecision<T> conflictResolutionDecision, PendingMutation.Type type2) {
        int i = C105651.f10654x1626713e[conflictResolutionDecision.getResolutionStrategy().ordinal()];
        if (i == 1) {
            return publish(conflictData.getLocal(), modelMetadata.getVersion().intValue(), type2);
        }
        if (i == 2) {
            return wtf.m55009o(new ModelWithMetadata(conflictData.getRemote(), modelMetadata));
        }
        if (i == 3) {
            return publish(conflictResolutionDecision.getCustomModel(), modelMetadata.getVersion().intValue(), PendingMutation.Type.UPDATE);
        }
        throw new IllegalStateException("Unknown resolution strategy = " + conflictResolutionDecision.getResolutionStrategy());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Model> wtf resolve(final PendingMutation<T> pendingMutation, AppSyncConflictUnhandledError<T> appSyncConflictUnhandledError) {
        try {
            final DataStoreConflictHandler conflictHandler = this.configurationProvider.getConfiguration().getConflictHandler();
            ModelWithMetadata<T> serverVersion = appSyncConflictUnhandledError.getServerVersion();
            final ModelMetadata syncMetadata = serverVersion.getSyncMetadata();
            final DataStoreConflictHandler.ConflictData conflictDataCreate = DataStoreConflictHandler.ConflictData.create(getMutatedModelFromSerializedModel(pendingMutation), getServerModel(serverVersion, pendingMutation.getMutatedItem()));
            return wtf.m55005e(new muf() { // from class: com.amplifyframework.datastore.syncengine.c
                @Override // p001o.muf
                /* renamed from: a */
                public final void mo12390a(auf aufVar) {
                    ConflictResolver.lambda$resolve$0(conflictHandler, conflictDataCreate, aufVar);
                }
            }).m55015j(new rl7() { // from class: com.amplifyframework.datastore.syncengine.d
                @Override // p001o.rl7
                public final Object apply(Object obj) {
                    return this.f10682a.lambda$resolve$1(conflictDataCreate, syncMetadata, pendingMutation, (DataStoreConflictHandler.ConflictResolutionDecision) obj);
                }
            });
        } catch (DataStoreException e) {
            return wtf.m55006g(e);
        }
    }
}
