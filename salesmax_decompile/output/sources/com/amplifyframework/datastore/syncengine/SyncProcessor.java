package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelProvider;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.datastore.AmplifyDisposables;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.datastore.DataStoreConfigurationProvider;
import com.amplifyframework.datastore.DataStoreErrorHandler;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.appsync.AppSync;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.datastore.events.NonApplicableDataReceivedEvent;
import com.amplifyframework.datastore.events.SyncQueriesStartedEvent;
import com.amplifyframework.datastore.storage.StorageItemChange;
import com.amplifyframework.datastore.utils.ErrorInspector;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import p001o.auf;
import p001o.g3e;
import p001o.ggd;
import p001o.gu3;
import p001o.i5f;
import p001o.idg;
import p001o.jm;
import p001o.k5d;
import p001o.muf;
import p001o.pnd;
import p001o.ql3;
import p001o.rl7;
import p001o.s47;
import p001o.su5;
import p001o.u1c;
import p001o.wtf;
import p001o.xk3;
import p001o.xuf;
import p001o.zg1;

/* loaded from: classes5.dex */
final class SyncProcessor {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final AppSync appSync;
    private final DataStoreConfigurationProvider dataStoreConfigurationProvider;
    private final boolean isSyncRetryEnabled;
    private final Merger merger;
    private final ModelProvider modelProvider;
    private final QueryPredicateProvider queryPredicateProvider;
    private final RetryHandler requestRetry;
    private final SchemaRegistry schemaRegistry;
    private final SyncTimeRegistry syncTimeRegistry;

    public interface AppSyncStep {
        MergerStep appSync(AppSync appSync);
    }

    public interface BuildStep {
        SyncProcessor build();
    }

    public static final class Builder implements ModelProviderStep, SchemaRegistryStep, SyncTimeRegistryStep, AppSyncStep, MergerStep, DataStoreConfigurationProviderStep, QueryPredicateProviderStep, RetryHandlerStep, SyncRetryStep, BuildStep {
        private AppSync appSync;
        private DataStoreConfigurationProvider dataStoreConfigurationProvider;
        private boolean isSyncRetryEnabled;
        private Merger merger;
        private ModelProvider modelProvider;
        private QueryPredicateProvider queryPredicateProvider;
        private RetryHandler requestRetry;
        private SchemaRegistry schemaRegistry;
        private SyncTimeRegistry syncTimeRegistry;

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.AppSyncStep
        public MergerStep appSync(AppSync appSync) {
            Objects.requireNonNull(appSync);
            this.appSync = appSync;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.BuildStep
        public SyncProcessor build() {
            return new SyncProcessor(this);
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.DataStoreConfigurationProviderStep
        public QueryPredicateProviderStep dataStoreConfigurationProvider(DataStoreConfigurationProvider dataStoreConfigurationProvider) {
            this.dataStoreConfigurationProvider = dataStoreConfigurationProvider;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.SyncRetryStep
        public BuildStep isSyncRetryEnabled(boolean z) {
            this.isSyncRetryEnabled = z;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.MergerStep
        public DataStoreConfigurationProviderStep merger(Merger merger) {
            Objects.requireNonNull(merger);
            this.merger = merger;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.ModelProviderStep
        public SchemaRegistryStep modelProvider(ModelProvider modelProvider) {
            Objects.requireNonNull(modelProvider);
            this.modelProvider = modelProvider;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.QueryPredicateProviderStep
        public RetryHandlerStep queryPredicateProvider(QueryPredicateProvider queryPredicateProvider) {
            Objects.requireNonNull(queryPredicateProvider);
            this.queryPredicateProvider = queryPredicateProvider;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.RetryHandlerStep
        public SyncRetryStep retryHandler(RetryHandler retryHandler) {
            this.requestRetry = retryHandler;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.SchemaRegistryStep
        public SyncTimeRegistryStep schemaRegistry(SchemaRegistry schemaRegistry) {
            Objects.requireNonNull(schemaRegistry);
            this.schemaRegistry = schemaRegistry;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SyncProcessor.SyncTimeRegistryStep
        public AppSyncStep syncTimeRegistry(SyncTimeRegistry syncTimeRegistry) {
            Objects.requireNonNull(syncTimeRegistry);
            this.syncTimeRegistry = syncTimeRegistry;
            return this;
        }
    }

    public interface DataStoreConfigurationProviderStep {
        QueryPredicateProviderStep dataStoreConfigurationProvider(DataStoreConfigurationProvider dataStoreConfigurationProvider);
    }

    public interface MergerStep {
        DataStoreConfigurationProviderStep merger(Merger merger);
    }

    public interface ModelProviderStep {
        SchemaRegistryStep modelProvider(ModelProvider modelProvider);
    }

    public interface QueryPredicateProviderStep {
        RetryHandlerStep queryPredicateProvider(QueryPredicateProvider queryPredicateProvider);
    }

    public interface RetryHandlerStep {
        SyncRetryStep retryHandler(RetryHandler retryHandler);
    }

    public interface SchemaRegistryStep {
        SyncTimeRegistryStep schemaRegistry(SchemaRegistry schemaRegistry);
    }

    public interface SyncRetryStep {
        BuildStep isSyncRetryEnabled(boolean z);
    }

    public interface SyncTimeRegistryStep {
        AppSyncStep syncTimeRegistry(SyncTimeRegistry syncTimeRegistry);
    }

    public static ModelProviderStep builder() {
        return new Builder();
    }

    private xk3 createHydrationTask(final ModelSchema modelSchema) {
        final ModelSyncMetricsAccumulator modelSyncMetricsAccumulator = new ModelSyncMetricsAccumulator(modelSchema.getName());
        final QueryPredicate predicate = this.queryPredicateProvider.getPredicate(modelSchema.getName());
        return this.syncTimeRegistry.lookupLastSyncTime(modelSchema.getName(), predicate).m55019p(new rl7() { // from class: com.amplifyframework.datastore.syncengine.j1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10729a.filterOutOldSyncTimes((SyncTime) obj);
            }
        }).m55015j(new rl7() { // from class: com.amplifyframework.datastore.syncengine.k1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10733a.lambda$createHydrationTask$6(modelSchema, modelSyncMetricsAccumulator, (SyncTime) obj);
            }
        }).m55016k(new rl7() { // from class: com.amplifyframework.datastore.syncengine.l1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10741a.lambda$createHydrationTask$8(modelSchema, predicate, modelSyncMetricsAccumulator, (SyncType) obj);
            }
        }).m56402l(new gu3() { // from class: com.amplifyframework.datastore.syncengine.m1
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f10748a.lambda$createHydrationTask$9(modelSchema, (Throwable) obj);
            }
        }).m56400j(new jm() { // from class: com.amplifyframework.datastore.syncengine.n1
            @Override // p001o.jm
            public final void run() {
                SyncProcessor.lambda$createHydrationTask$10();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SyncTime filterOutOldSyncTimes(SyncTime syncTime) {
        return !syncTime.exists() ? SyncTime.never() : Time.now() - syncTime.toLong() <= this.dataStoreConfigurationProvider.getConfiguration().getSyncIntervalMs().longValue() ? syncTime : SyncTime.never();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hydrateSchemaIfNeeded, reason: merged with bridge method [inline-methods] */
    public <T extends Model> ModelWithMetadata<T> lambda$syncModel$13(ModelWithMetadata<T> modelWithMetadata, ModelSchema modelSchema) {
        if (!(modelWithMetadata.getModel() instanceof SerializedModel)) {
            return modelWithMetadata;
        }
        return new ModelWithMetadata<>(SerializedModel.builder().modelSchema(modelSchema).serializedData(SerializedModel.parseSerializedData(((SerializedModel) modelWithMetadata.getModel()).getSerializedData(), modelSchema.getName(), this.schemaRegistry)).build(), modelWithMetadata.getSyncMetadata());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createHydrationTask$10() {
        LOG.info("Successfully sync'd down model state from cloud.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$createHydrationTask$2(u1c u1cVar) {
        return (u1cVar.m50853g() && ErrorInspector.contains(u1cVar.m50850d(), (Class<? extends Throwable>) ApiException.ApiAuthException.class)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u1c lambda$createHydrationTask$3(u1c u1cVar) {
        return u1cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ql3 lambda$createHydrationTask$4(final ModelSyncMetricsAccumulator modelSyncMetricsAccumulator, List list) {
        Merger merger = this.merger;
        Objects.requireNonNull(modelSyncMetricsAccumulator);
        return merger.merge(list, new Consumer() { // from class: com.amplifyframework.datastore.syncengine.i1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                modelSyncMetricsAccumulator.increment((StorageItemChange.Type) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SyncType lambda$createHydrationTask$5(SyncTime syncTime) {
        return syncTime.exists() ? SyncType.DELTA : SyncType.BASE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xuf lambda$createHydrationTask$6(ModelSchema modelSchema, final ModelSyncMetricsAccumulator modelSyncMetricsAccumulator, final SyncTime syncTime) {
        return syncModel(modelSchema, syncTime).m47688P(i5f.m31599c()).m47687N().m47682D(new ggd() { // from class: com.amplifyframework.datastore.syncengine.p1
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return SyncProcessor.lambda$createHydrationTask$2((u1c) obj);
            }
        }).m47712w(new rl7() { // from class: com.amplifyframework.datastore.syncengine.q1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return SyncProcessor.lambda$createHydrationTask$3((u1c) obj);
            }
        }).m47710t(new rl7() { // from class: com.amplifyframework.datastore.syncengine.r1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10767a.lambda$createHydrationTask$4(modelSyncMetricsAccumulator, (List) obj);
            }
        }).m56396E(new idg() { // from class: com.amplifyframework.datastore.syncengine.s1
            @Override // p001o.idg
            public final Object get() {
                return SyncProcessor.lambda$createHydrationTask$5(syncTime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createHydrationTask$7(ModelSyncMetricsAccumulator modelSyncMetricsAccumulator, SyncType syncType) {
        Amplify.Hub.publish(HubChannel.DATASTORE, modelSyncMetricsAccumulator.toModelSyncedEvent(syncType).toHubEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ql3 lambda$createHydrationTask$8(ModelSchema modelSchema, QueryPredicate queryPredicate, final ModelSyncMetricsAccumulator modelSyncMetricsAccumulator, final SyncType syncType) {
        return (SyncType.DELTA.equals(syncType) ? this.syncTimeRegistry.saveLastDeltaSync(modelSchema.getName(), SyncTime.now(), queryPredicate) : this.syncTimeRegistry.saveLastBaseSync(modelSchema.getName(), SyncTime.now(), queryPredicate)).m56397c(xk3.m56392q(new jm() { // from class: com.amplifyframework.datastore.syncengine.u1
            @Override // p001o.jm
            public final void run() {
                SyncProcessor.lambda$createHydrationTask$7(modelSyncMetricsAccumulator, syncType);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createHydrationTask$9(ModelSchema modelSchema, Throwable th) {
        LOG.warn("Initial cloud sync failed for " + modelSchema.getName() + ".", th);
        this.dataStoreConfigurationProvider.getConfiguration().getErrorHandler().accept(new DataStoreException("Initial cloud sync failed for " + modelSchema.getName() + ".", th, "Check your internet connection."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hydrate$0(ArrayList arrayList, su5 su5Var) {
        Amplify.Hub.publish(HubChannel.DATASTORE, HubEvent.create(DataStoreChannelEventName.SYNC_QUERIES_STARTED, new SyncQueriesStartedEvent((String[]) arrayList.toArray(new String[0]))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hydrate$1() {
        Amplify.Hub.publish(HubChannel.DATASTORE, HubEvent.create(DataStoreChannelEventName.SYNC_QUERIES_READY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g3e lambda$syncModel$11(GraphQLRequest graphQLRequest) {
        return this.isSyncRetryEnabled ? syncPageWithRetry(graphQLRequest).m55026x() : syncPage(graphQLRequest).m55026x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncModel$12(ModelSchema modelSchema, zg1 zg1Var, GraphQLResponse graphQLResponse) {
        if (graphQLResponse.hasErrors()) {
            DataStoreErrorHandler errorHandler = this.dataStoreConfigurationProvider.getConfiguration().getErrorHandler();
            Iterator<GraphQLResponse.Error> it = graphQLResponse.getErrors().iterator();
            while (it.hasNext()) {
                errorHandler.accept(new DataStoreException("Error received when syncing data: " + it.next().getMessage(), "Ensure app code is up to date, auth directives exist and are correct on each model, and that server-side data has not been invalidated by a schema change."));
            }
            Amplify.Hub.publish(HubChannel.DATASTORE, new NonApplicableDataReceivedEvent(graphQLResponse.getErrors(), modelSchema.getName()).toHubEvent());
        }
        if (((PaginatedResult) graphQLResponse.getData()).hasNextResult()) {
            zg1Var.mo18166e(((PaginatedResult) graphQLResponse.getData()).getRequestForNextResult());
        } else {
            zg1Var.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$syncModel$14(final ModelSchema modelSchema, GraphQLResponse graphQLResponse) {
        return (List) s47.m47671J((Iterable) graphQLResponse.getData()).m47686M(new rl7() { // from class: com.amplifyframework.datastore.syncengine.t1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10775a.lambda$syncModel$13(modelSchema, (ModelWithMetadata) obj);
            }
        }).g0().m55012d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$syncModel$15(AtomicReference atomicReference, Integer num, List list) {
        return ((Integer) atomicReference.accumulateAndGet(Integer.valueOf(list.size()), new BinaryOperator() { // from class: o.pgg
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Integer.valueOf(Integer.sum(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            }
        })).intValue() >= num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$syncPage$16(auf aufVar, GraphQLResponse graphQLResponse) {
        if (graphQLResponse.hasData()) {
            if (graphQLResponse.hasErrors()) {
                LOG.warn(String.format("Both data and errors received on model sync: %s", graphQLResponse.getErrors()));
            }
            aufVar.onSuccess(graphQLResponse);
        } else {
            aufVar.onError(new DataStoreException.IrRecoverableException("Received errors from AppSync: " + pnd.m43910a(",\n", (List) graphQLResponse.getErrors().stream().map(new Function() { // from class: o.ogg
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((GraphQLResponse.Error) obj).toString();
                }
            }).collect(Collectors.toList())), "Report to AWS team."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$syncPage$17(GraphQLRequest graphQLRequest, final auf aufVar) {
        AppSync appSync = this.appSync;
        Consumer consumer = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.z1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                SyncProcessor.lambda$syncPage$16(aufVar, (GraphQLResponse) obj);
            }
        };
        Objects.requireNonNull(aufVar);
        aufVar.mo17849d(AmplifyDisposables.fromCancelable(appSync.sync(graphQLRequest, consumer, new k5d(aufVar))));
    }

    private <T extends Model> s47 syncModel(final ModelSchema modelSchema, SyncTime syncTime) {
        Long lValueOf = syncTime.exists() ? Long.valueOf(syncTime.toLong()) : null;
        Integer syncPageSize = this.dataStoreConfigurationProvider.getConfiguration().getSyncPageSize();
        final Integer syncMaxRecords = this.dataStoreConfigurationProvider.getConfiguration().getSyncMaxRecords();
        final AtomicReference atomicReference = new AtomicReference(0);
        final zg1 zg1VarJ0 = zg1.j0(this.appSync.buildSyncRequest(modelSchema, lValueOf, syncPageSize, this.queryPredicateProvider.getPredicate(modelSchema.getName())));
        return zg1VarJ0.m47708r(new rl7() { // from class: com.amplifyframework.datastore.syncengine.v1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10782a.lambda$syncModel$11((GraphQLRequest) obj);
            }
        }).m47715z(new gu3() { // from class: com.amplifyframework.datastore.syncengine.w1
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f10784a.lambda$syncModel$12(modelSchema, zg1VarJ0, (GraphQLResponse) obj);
            }
        }).m47686M(new rl7() { // from class: com.amplifyframework.datastore.syncengine.x1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10787a.lambda$syncModel$14(modelSchema, (GraphQLResponse) obj);
            }
        }).f0(new ggd() { // from class: com.amplifyframework.datastore.syncengine.y1
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return SyncProcessor.lambda$syncModel$15(atomicReference, syncMaxRecords, (List) obj);
            }
        });
    }

    private <T extends Model> wtf syncPage(final GraphQLRequest<PaginatedResult<ModelWithMetadata<T>>> graphQLRequest) {
        return wtf.m55005e(new muf() { // from class: com.amplifyframework.datastore.syncengine.o1
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                this.f10754a.lambda$syncPage$17(graphQLRequest, aufVar);
            }
        });
    }

    private <T extends Model> wtf syncPageWithRetry(GraphQLRequest<PaginatedResult<ModelWithMetadata<T>>> graphQLRequest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DataStoreException.IrRecoverableException.class);
        arrayList.add(ApiException.NonRetryableException.class);
        return this.requestRetry.retry(syncPage(graphQLRequest), arrayList);
    }

    public xk3 hydrate() {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        ArrayList<ModelSchema> arrayList2 = new ArrayList(this.modelProvider.modelSchemas().values());
        final TopologicalOrdering topologicalOrderingForRegisteredModels = TopologicalOrdering.forRegisteredModels(this.schemaRegistry, this.modelProvider);
        Objects.requireNonNull(topologicalOrderingForRegisteredModels);
        Collections.sort(arrayList2, new Comparator() { // from class: com.amplifyframework.datastore.syncengine.a2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return topologicalOrderingForRegisteredModels.compare((ModelSchema) obj, (ModelSchema) obj2);
            }
        });
        final ArrayList arrayList3 = new ArrayList();
        boolean z = true;
        for (ModelSchema modelSchema : arrayList2) {
            if (!QueryPredicates.none().equals(this.queryPredicateProvider.getPredicate(modelSchema.getName()))) {
                arrayList.add(createHydrationTask(modelSchema));
                arrayList3.add(modelSchema.getName());
                if (!modelSchema.getAssociations().isEmpty()) {
                    z = false;
                }
            }
        }
        try {
            iIntValue = this.dataStoreConfigurationProvider.getConfiguration().getSyncMaxConcurrentModels().intValue();
        } catch (DataStoreException unused) {
            iIntValue = 1;
        }
        return ((!z || iIntValue <= 1) ? xk3.m56388g(arrayList) : xk3.m56394s(s47.m47671J(arrayList), iIntValue)).m56404n(new gu3() { // from class: com.amplifyframework.datastore.syncengine.b2
            @Override // p001o.gu3
            public final void accept(Object obj) {
                SyncProcessor.lambda$hydrate$0(arrayList3, (su5) obj);
            }
        }).m56400j(new jm() { // from class: com.amplifyframework.datastore.syncengine.c2
            @Override // p001o.jm
            public final void run() {
                SyncProcessor.lambda$hydrate$1();
            }
        });
    }

    private SyncProcessor(Builder builder) {
        this.modelProvider = builder.modelProvider;
        this.schemaRegistry = builder.schemaRegistry;
        this.syncTimeRegistry = builder.syncTimeRegistry;
        this.appSync = builder.appSync;
        this.merger = builder.merger;
        this.dataStoreConfigurationProvider = builder.dataStoreConfigurationProvider;
        this.queryPredicateProvider = builder.queryPredicateProvider;
        this.requestRetry = builder.requestRetry;
        boolean z = builder.isSyncRetryEnabled;
        this.isSyncRetryEnabled = z;
        if (z) {
            return;
        }
        LOG.warn("Disabling sync retries will be deprecated in a future version.");
    }
}
