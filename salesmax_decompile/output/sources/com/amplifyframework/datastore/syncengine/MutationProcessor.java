package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.datastore.DataStoreConfigurationProvider;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.appsync.AppSync;
import com.amplifyframework.datastore.appsync.AppSyncConflictUnhandledError;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.datastore.events.OutboxStatusEvent;
import com.amplifyframework.datastore.syncengine.MutationOutbox;
import com.amplifyframework.datastore.syncengine.PendingMutation;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import p001o.auf;
import p001o.gu3;
import p001o.i5f;
import p001o.jm;
import p001o.ko3;
import p001o.muf;
import p001o.ql3;
import p001o.rl7;
import p001o.su5;
import p001o.ur3;
import p001o.wtf;
import p001o.xk3;
import p001o.xuf;

/* loaded from: classes5.dex */
final class MutationProcessor {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final AppSync appSync;
    private final ConflictResolver conflictResolver;
    private final DataStoreConfigurationProvider dataStoreConfiguration;
    private final Merger merger;
    private final MutationOutbox mutationOutbox;
    private final ko3 ongoingOperationsDisposable;
    private final RetryHandler retryHandler;
    private final SchemaRegistry schemaRegistry;
    private final VersionRepository versionRepository;

    /* renamed from: com.amplifyframework.datastore.syncengine.MutationProcessor$1 */
    public static /* synthetic */ class C105671 {

        /* renamed from: $SwitchMap$com$amplifyframework$datastore$syncengine$PendingMutation$Type */
        static final /* synthetic */ int[] f10655x17746221;

        static {
            int[] iArr = new int[PendingMutation.Type.values().length];
            f10655x17746221 = iArr;
            try {
                iArr[PendingMutation.Type.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10655x17746221[PendingMutation.Type.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10655x17746221[PendingMutation.Type.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Builder implements BuilderSteps.MergerStep, BuilderSteps.VersionRepositoryStep, BuilderSteps.ModelSchemaRegistryStep, BuilderSteps.MutationOutboxStep, BuilderSteps.AppSyncStep, BuilderSteps.DataStoreConfigurationProviderStep, BuilderSteps.RetryHandlerStep, BuilderSteps.BuildStep {
        private AppSync appSync;
        private DataStoreConfigurationProvider dataStoreConfiguration;
        private Merger merger;
        private MutationOutbox mutationOutbox;
        private RetryHandler retryHandler;
        private SchemaRegistry schemaRegistry;
        private VersionRepository versionRepository;

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.AppSyncStep
        public BuilderSteps.DataStoreConfigurationProviderStep appSync(AppSync appSync) {
            Objects.requireNonNull(appSync);
            this.appSync = appSync;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.BuildStep
        public MutationProcessor build() {
            return new MutationProcessor(this);
        }

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.DataStoreConfigurationProviderStep
        public BuilderSteps.RetryHandlerStep dataStoreConfigurationProvider(DataStoreConfigurationProvider dataStoreConfigurationProvider) {
            Objects.requireNonNull(dataStoreConfigurationProvider);
            this.dataStoreConfiguration = dataStoreConfigurationProvider;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.MergerStep
        public BuilderSteps.VersionRepositoryStep merger(Merger merger) {
            Objects.requireNonNull(merger);
            this.merger = merger;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.MutationOutboxStep
        public BuilderSteps.AppSyncStep mutationOutbox(MutationOutbox mutationOutbox) {
            Objects.requireNonNull(mutationOutbox);
            this.mutationOutbox = mutationOutbox;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.RetryHandlerStep
        public BuilderSteps.BuildStep retryHandler(RetryHandler retryHandler) {
            this.retryHandler = retryHandler;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.ModelSchemaRegistryStep
        public BuilderSteps.MutationOutboxStep schemaRegistry(SchemaRegistry schemaRegistry) {
            Objects.requireNonNull(schemaRegistry);
            this.schemaRegistry = schemaRegistry;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.BuilderSteps.VersionRepositoryStep
        public BuilderSteps.ModelSchemaRegistryStep versionRepository(VersionRepository versionRepository) {
            Objects.requireNonNull(versionRepository);
            this.versionRepository = versionRepository;
            return this;
        }
    }

    public interface BuilderSteps {

        public interface AppSyncStep {
            DataStoreConfigurationProviderStep appSync(AppSync appSync);
        }

        public interface BuildStep {
            MutationProcessor build();
        }

        public interface DataStoreConfigurationProviderStep {
            RetryHandlerStep dataStoreConfigurationProvider(DataStoreConfigurationProvider dataStoreConfigurationProvider);
        }

        public interface MergerStep {
            VersionRepositoryStep merger(Merger merger);
        }

        public interface ModelSchemaRegistryStep {
            MutationOutboxStep schemaRegistry(SchemaRegistry schemaRegistry);
        }

        public interface MutationOutboxStep {
            AppSyncStep mutationOutbox(MutationOutbox mutationOutbox);
        }

        public interface RetryHandlerStep {
            BuildStep retryHandler(RetryHandler retryHandler);
        }

        public interface VersionRepositoryStep {
            ModelSchemaRegistryStep versionRepository(VersionRepository versionRepository);
        }
    }

    public interface PublicationStrategy<T extends Model> {
        void publish(T t, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer, Consumer<DataStoreException> consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: announceMutationFailed, reason: merged with bridge method [inline-methods] */
    public <T extends Model> void lambda$processOutboxItem$8(PendingMutation<T> pendingMutation, Throwable th) {
        Amplify.Hub.publish(HubChannel.DATASTORE, OutboxMutationFailedEvent.create(pendingMutation, th instanceof DataStoreException.GraphQLResponseException ? ((DataStoreException.GraphQLResponseException) th).getErrors() : Collections.emptyList()).toHubEvent());
        try {
            this.dataStoreConfiguration.getConfiguration().getErrorHandler().accept(th instanceof DataStoreException.GraphQLResponseException ? (DataStoreException.GraphQLResponseException) th : new DataStoreException("Mutation failed.", th, "See underlying cause."));
        } catch (Throwable th2) {
            LOG.warn("Error invoking the error handler", th2);
        }
    }

    private <T extends Model> void announceMutationProcessed(String str, ModelWithMetadata<T> modelWithMetadata) {
        Amplify.Hub.publish(HubChannel.DATASTORE, OutboxMutationEvent.create(str, modelWithMetadata).toHubEvent());
    }

    public static BuilderSteps.MergerStep builder() {
        return new Builder();
    }

    private <T extends Model> wtf create(PendingMutation<T> pendingMutation) {
        final ModelSchema modelSchemaForModelClass = this.schemaRegistry.getModelSchemaForModelClass(pendingMutation.getMutatedItem().getModelName());
        return publishWithStrategy(pendingMutation, new PublicationStrategy() { // from class: com.amplifyframework.datastore.syncengine.i
            @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.PublicationStrategy
            public final void publish(Model model, Consumer consumer, Consumer consumer2) {
                this.f10719a.lambda$create$13(modelSchemaForModelClass, model, consumer, consumer2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends Model> wtf delete(final PendingMutation<T> pendingMutation) {
        final Model mutatedItem = pendingMutation.getMutatedItem();
        final ModelSchema modelSchemaForModelClass = this.schemaRegistry.getModelSchemaForModelClass(mutatedItem.getModelName());
        return this.versionRepository.findModelVersion(mutatedItem).m55015j(new rl7() { // from class: com.amplifyframework.datastore.syncengine.z
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10791a.lambda$delete$15(pendingMutation, mutatedItem, modelSchemaForModelClass, (Optional) obj);
            }
        });
    }

    private xk3 drainMutationOutbox() throws InterruptedException {
        while (true) {
            try {
                PendingMutation<? extends Model> pendingMutationPeek = this.mutationOutbox.peek();
                if (pendingMutationPeek == null) {
                    return xk3.m56387f();
                }
                processOutboxItem(pendingMutationPeek).m56398d();
            } catch (RuntimeException e) {
                return xk3.m56391p(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ensureModelHasSchema, reason: merged with bridge method [inline-methods] */
    public <T extends Model> ModelWithMetadata<? extends Model> lambda$processOutboxItem$4(PendingMutation<T> pendingMutation, ModelWithMetadata<T> modelWithMetadata) {
        return modelWithMetadata.getModel() instanceof SerializedModel ? modelWithSchemaAdded(modelWithMetadata, pendingMutation.getModelSchema()) : modelWithMetadata;
    }

    private <T extends Model> wtf handleResponseErrors(PendingMutation<T> pendingMutation, List<GraphQLResponse.Error> list) {
        AppSyncConflictUnhandledError<T> appSyncConflictUnhandledErrorFindFirst = AppSyncConflictUnhandledError.findFirst(pendingMutation.getModelSchema().getModelClass(), list);
        if (appSyncConflictUnhandledErrorFindFirst != null) {
            LOG.warn(String.format("Unhandled conflict: %s", appSyncConflictUnhandledErrorFindFirst));
            return this.conflictResolver.resolve(pendingMutation, appSyncConflictUnhandledErrorFindFirst);
        }
        return wtf.m55006g(new DataStoreException.GraphQLResponseException("Mutation failed. Failed mutation = " + pendingMutation + ". AppSync response contained errors = " + list, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$13(ModelSchema modelSchema, Model model, Consumer consumer, Consumer consumer2) {
        this.appSync.create(model, modelSchema, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$delete$14(Model model, ModelSchema modelSchema, Optional optional, PendingMutation pendingMutation, Model model2, Consumer consumer, Consumer consumer2) {
        this.appSync.delete(model, modelSchema, (Integer) optional.orElse(null), pendingMutation.getPredicate(), consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xuf lambda$delete$15(final PendingMutation pendingMutation, final Model model, final ModelSchema modelSchema, final Optional optional) {
        return publishWithStrategy(pendingMutation, new PublicationStrategy() { // from class: com.amplifyframework.datastore.syncengine.l
            @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.PublicationStrategy
            public final void publish(Model model2, Consumer consumer, Consumer consumer2) {
                this.f10736a.lambda$delete$14(model, modelSchema, optional, pendingMutation, model2, consumer, consumer2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processOutboxItem$10(PendingMutation pendingMutation, Throwable th) {
        LOG.warn("Failed to publish a local change = " + pendingMutation, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processOutboxItem$5(PendingMutation pendingMutation, ModelWithMetadata modelWithMetadata) {
        announceMutationProcessed(pendingMutation.getModelSchema().getName(), modelWithMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ql3 lambda$processOutboxItem$6(final PendingMutation pendingMutation, final ModelWithMetadata modelWithMetadata) {
        return this.mutationOutbox.remove(pendingMutation.getMutationId()).m56397c(this.merger.merge(modelWithMetadata)).m56400j(new jm() { // from class: com.amplifyframework.datastore.syncengine.u
            @Override // p001o.jm
            public final void run() {
                this.f10777a.lambda$processOutboxItem$5(pendingMutation, modelWithMetadata);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processOutboxItem$7(PendingMutation pendingMutation) {
        LOG.debug("Pending mutation was published to cloud successfully, and removed from the mutation outbox: " + pendingMutation);
        publishCurrentOutboxStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ql3 lambda$processOutboxItem$9(final PendingMutation pendingMutation, final Throwable th) {
        return this.mutationOutbox.remove(pendingMutation.getMutationId()).m56400j(new jm() { // from class: com.amplifyframework.datastore.syncengine.k
            @Override // p001o.jm
            public final void run() {
                this.f10730a.lambda$processOutboxItem$8(pendingMutation, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$publishWithStrategy$16(auf aufVar, DataStoreException dataStoreException) {
        if (aufVar.isDisposed()) {
            return;
        }
        aufVar.onError(dataStoreException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$publishWithStrategy$17(PublicationStrategy publicationStrategy, PendingMutation pendingMutation, final auf aufVar) {
        Model mutatedItem = pendingMutation.getMutatedItem();
        Objects.requireNonNull(aufVar);
        publicationStrategy.publish(mutatedItem, new ur3(aufVar), new Consumer() { // from class: com.amplifyframework.datastore.syncengine.r
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                MutationProcessor.lambda$publishWithStrategy$16(aufVar, (DataStoreException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xuf lambda$publishWithStrategy$18(PendingMutation pendingMutation, GraphQLResponse graphQLResponse) {
        return (graphQLResponse.hasErrors() || !graphQLResponse.hasData()) ? handleResponseErrors(pendingMutation, graphQLResponse.getErrors()) : wtf.m55009o((ModelWithMetadata) graphQLResponse.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDrainingMutationOutbox$0(su5 su5Var) {
        LOG.info("Started processing the mutation outbox. Pending mutations will be published to the cloud.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ql3 lambda$startDrainingMutationOutbox$1(MutationOutbox.OutboxEvent outboxEvent) {
        return drainMutationOutbox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDrainingMutationOutbox$2() {
        LOG.warn("Observation of mutation outbox was completed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDrainingMutationOutbox$3(Throwable th) {
        LOG.error("Error ended observation of mutation outbox: ", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$update$11(ModelSchema modelSchema, Optional optional, PendingMutation pendingMutation, Model model, Consumer consumer, Consumer consumer2) {
        this.appSync.update(model, modelSchema, (Integer) optional.orElse(null), pendingMutation.getPredicate(), consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xuf lambda$update$12(final PendingMutation pendingMutation, final ModelSchema modelSchema, final Optional optional) {
        return publishWithStrategy(pendingMutation, new PublicationStrategy() { // from class: com.amplifyframework.datastore.syncengine.j
            @Override // com.amplifyframework.datastore.syncengine.MutationProcessor.PublicationStrategy
            public final void publish(Model model, Consumer consumer, Consumer consumer2) {
                this.f10725a.lambda$update$11(modelSchema, optional, pendingMutation, model, consumer, consumer2);
            }
        });
    }

    private <T extends Model> ModelWithMetadata<? extends Model> modelWithSchemaAdded(ModelWithMetadata<T> modelWithMetadata, ModelSchema modelSchema) {
        return new ModelWithMetadata<>(SerializedModel.builder().modelSchema(modelSchema).serializedData(SerializedModel.parseSerializedData(((SerializedModel) modelWithMetadata.getModel()).getSerializedData(), modelSchema.getName(), this.schemaRegistry)).build(), modelWithMetadata.getSyncMetadata());
    }

    private <T extends Model> xk3 processOutboxItem(final PendingMutation<T> pendingMutation) {
        return this.mutationOutbox.markInFlight(pendingMutation.getMutationId()).m56397c(publishWithRetry(pendingMutation).m55019p(new rl7() { // from class: com.amplifyframework.datastore.syncengine.m
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10745a.lambda$processOutboxItem$4(pendingMutation, (ModelWithMetadata) obj);
            }
        }).m55016k(new rl7() { // from class: com.amplifyframework.datastore.syncengine.n
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10750a.lambda$processOutboxItem$6(pendingMutation, (ModelWithMetadata) obj);
            }
        })).m56400j(new jm() { // from class: com.amplifyframework.datastore.syncengine.o
            @Override // p001o.jm
            public final void run() {
                this.f10752a.lambda$processOutboxItem$7(pendingMutation);
            }
        }).m56406t(new rl7() { // from class: com.amplifyframework.datastore.syncengine.p
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10756a.lambda$processOutboxItem$9(pendingMutation, (Throwable) obj);
            }
        }).m56402l(new gu3() { // from class: com.amplifyframework.datastore.syncengine.q
            @Override // p001o.gu3
            public final void accept(Object obj) {
                MutationProcessor.lambda$processOutboxItem$10(pendingMutation, (Throwable) obj);
            }
        });
    }

    private void publishCurrentOutboxStatus() {
        Amplify.Hub.publish(HubChannel.DATASTORE, new OutboxStatusEvent(this.mutationOutbox.peek() == null).toHubEvent());
    }

    private <T extends Model> wtf publishToNetwork(PendingMutation<T> pendingMutation) {
        int i = C105671.f10655x17746221[pendingMutation.getMutationType().ordinal()];
        if (i == 1) {
            return update(pendingMutation);
        }
        if (i == 2) {
            return create(pendingMutation);
        }
        if (i == 3) {
            return delete(pendingMutation);
        }
        return wtf.m55006g(new DataStoreException("Unknown mutation type in storage = " + pendingMutation.getMutationType(), "This is likely a bug. Please file a ticket with AWS."));
    }

    private <T extends Model> wtf publishWithRetry(PendingMutation<T> pendingMutation) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DataStoreException.GraphQLResponseException.class);
        arrayList.add(ApiException.NonRetryableException.class);
        LOG.info("Started Publish with retry: " + pendingMutation);
        return this.retryHandler.retry(publishToNetwork(pendingMutation), arrayList);
    }

    private <T extends Model> wtf publishWithStrategy(final PendingMutation<T> pendingMutation, final PublicationStrategy<T> publicationStrategy) {
        return wtf.m55005e(new muf() { // from class: com.amplifyframework.datastore.syncengine.s
            @Override // p001o.muf
            /* renamed from: a */
            public final void mo12390a(auf aufVar) {
                MutationProcessor.lambda$publishWithStrategy$17(publicationStrategy, pendingMutation, aufVar);
            }
        }).m55015j(new rl7() { // from class: com.amplifyframework.datastore.syncengine.t
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10772a.lambda$publishWithStrategy$18(pendingMutation, (GraphQLResponse) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends Model> wtf update(final PendingMutation<T> pendingMutation) {
        Model mutatedItem = pendingMutation.getMutatedItem();
        final ModelSchema modelSchemaForModelClass = this.schemaRegistry.getModelSchemaForModelClass(mutatedItem.getModelName());
        return this.versionRepository.findModelVersion(mutatedItem).m55015j(new rl7() { // from class: com.amplifyframework.datastore.syncengine.h
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10706a.lambda$update$12(pendingMutation, modelSchemaForModelClass, (Optional) obj);
            }
        });
    }

    public void startDrainingMutationOutbox() {
        this.ongoingOperationsDisposable.mo30304a(this.mutationOutbox.events().m55711D(new gu3() { // from class: com.amplifyframework.datastore.syncengine.v
            @Override // p001o.gu3
            public final void accept(Object obj) {
                MutationProcessor.lambda$startDrainingMutationOutbox$0((su5) obj);
            }
        }).t0(MutationOutbox.OutboxEvent.CONTENT_AVAILABLE).y0(i5f.m31601e()).h0(i5f.m31601e()).m55721Q(new rl7() { // from class: com.amplifyframework.datastore.syncengine.w
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10783a.lambda$startDrainingMutationOutbox$1((MutationOutbox.OutboxEvent) obj);
            }
        }).m56409w(new jm() { // from class: com.amplifyframework.datastore.syncengine.x
            @Override // p001o.jm
            public final void run() {
                MutationProcessor.lambda$startDrainingMutationOutbox$2();
            }
        }, new gu3() { // from class: com.amplifyframework.datastore.syncengine.y
            @Override // p001o.gu3
            public final void accept(Object obj) {
                MutationProcessor.lambda$startDrainingMutationOutbox$3((Throwable) obj);
            }
        }));
    }

    public void stopDrainingMutationOutbox() {
        this.ongoingOperationsDisposable.m35969e();
    }

    private MutationProcessor(Builder builder) {
        Merger merger = builder.merger;
        Objects.requireNonNull(merger);
        this.merger = merger;
        VersionRepository versionRepository = builder.versionRepository;
        Objects.requireNonNull(versionRepository);
        this.versionRepository = versionRepository;
        SchemaRegistry schemaRegistry = builder.schemaRegistry;
        Objects.requireNonNull(schemaRegistry);
        this.schemaRegistry = schemaRegistry;
        MutationOutbox mutationOutbox = builder.mutationOutbox;
        Objects.requireNonNull(mutationOutbox);
        this.mutationOutbox = mutationOutbox;
        AppSync appSync = builder.appSync;
        Objects.requireNonNull(appSync);
        AppSync appSync2 = appSync;
        this.appSync = appSync2;
        DataStoreConfigurationProvider dataStoreConfigurationProvider = builder.dataStoreConfiguration;
        Objects.requireNonNull(dataStoreConfigurationProvider);
        DataStoreConfigurationProvider dataStoreConfigurationProvider2 = dataStoreConfigurationProvider;
        this.dataStoreConfiguration = dataStoreConfigurationProvider2;
        this.conflictResolver = new ConflictResolver(dataStoreConfigurationProvider2, appSync2);
        RetryHandler retryHandler = builder.retryHandler;
        Objects.requireNonNull(retryHandler);
        this.retryHandler = retryHandler;
        this.ongoingOperationsDisposable = new ko3();
    }
}
