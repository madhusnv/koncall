package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SubscriptionType;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelProvider;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.datastore.AmplifyDisposables;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.appsync.AppSync;
import com.amplifyframework.datastore.appsync.AppSyncExtensions;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.datastore.syncengine.SubscriptionEvent;
import com.amplifyframework.datastore.utils.ErrorInspector;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Empty;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001o.ggd;
import p001o.gu3;
import p001o.i5f;
import p001o.jm;
import p001o.ko3;
import p001o.m8c;
import p001o.n3i;
import p001o.q7c;
import p001o.rl7;
import p001o.su5;
import p001o.x6c;
import p001o.xk3;

/* loaded from: classes5.dex */
final class SubscriptionProcessor {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private static final long NETWORK_OP_TIMEOUT_SECONDS = 60;
    private static final long TIMEOUT_SECONDS_PER_MODEL = 20;
    private final long adjustedTimeoutSeconds;
    private final AppSync appSync;
    private n3i buffer;
    private final Merger merger;
    private final ModelProvider modelProvider;
    private final Consumer<Throwable> onFailure;
    private final ko3 ongoingOperationsDisposable;
    private final QueryPredicateProvider queryPredicateProvider;
    private final SchemaRegistry schemaRegistry;

    /* renamed from: com.amplifyframework.datastore.syncengine.SubscriptionProcessor$1 */
    public static /* synthetic */ class C105781 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$graphql$SubscriptionType;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            $SwitchMap$com$amplifyframework$api$graphql$SubscriptionType = iArr;
            try {
                iArr[SubscriptionType.ON_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$graphql$SubscriptionType[SubscriptionType.ON_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$graphql$SubscriptionType[SubscriptionType.ON_CREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface AppSyncStep {
        ModelProviderStep appSync(AppSync appSync);
    }

    public interface BuildStep {
        SubscriptionProcessor build();
    }

    public static final class Builder implements AppSyncStep, ModelProviderStep, SchemaRegistryStep, MergerStep, QueryPredicateProviderStep, OnFailureStep, BuildStep {
        private AppSync appSync;
        private Merger merger;
        private ModelProvider modelProvider;
        private Consumer<Throwable> onFailure;
        private QueryPredicateProvider queryPredicateProvider;
        private SchemaRegistry schemaRegistry;

        @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.AppSyncStep
        public ModelProviderStep appSync(AppSync appSync) {
            Objects.requireNonNull(appSync);
            this.appSync = appSync;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.BuildStep
        public SubscriptionProcessor build() {
            return new SubscriptionProcessor(this);
        }

        @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.MergerStep
        public QueryPredicateProviderStep merger(Merger merger) {
            Objects.requireNonNull(merger);
            this.merger = merger;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.ModelProviderStep
        public SchemaRegistryStep modelProvider(ModelProvider modelProvider) {
            Objects.requireNonNull(modelProvider);
            this.modelProvider = modelProvider;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.OnFailureStep
        public BuildStep onFailure(Consumer<Throwable> consumer) {
            Objects.requireNonNull(consumer);
            this.onFailure = consumer;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.QueryPredicateProviderStep
        public OnFailureStep queryPredicateProvider(QueryPredicateProvider queryPredicateProvider) {
            Objects.requireNonNull(queryPredicateProvider);
            this.queryPredicateProvider = queryPredicateProvider;
            return this;
        }

        @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.SchemaRegistryStep
        public MergerStep schemaRegistry(SchemaRegistry schemaRegistry) {
            Objects.requireNonNull(schemaRegistry);
            this.schemaRegistry = schemaRegistry;
            return this;
        }
    }

    public interface MergerStep {
        QueryPredicateProviderStep merger(Merger merger);
    }

    public interface ModelProviderStep {
        SchemaRegistryStep modelProvider(ModelProvider modelProvider);
    }

    public interface OnFailureStep {
        BuildStep onFailure(Consumer<Throwable> consumer);
    }

    public interface QueryPredicateProviderStep {
        OnFailureStep queryPredicateProvider(QueryPredicateProvider queryPredicateProvider);
    }

    public interface SchemaRegistryStep {
        MergerStep schemaRegistry(SchemaRegistry schemaRegistry);
    }

    public interface SubscriptionMethod {
        <T extends Model> Cancelable subscribe(ModelSchema modelSchema, Consumer<String> consumer, Consumer<GraphQLResponse<ModelWithMetadata<T>>> consumer2, Consumer<DataStoreException> consumer3, Action action);
    }

    public static AppSyncStep builder() {
        return new Builder();
    }

    private static SubscriptionEvent.Type fromSubscriptionType(SubscriptionType subscriptionType) {
        int i = C105781.$SwitchMap$com$amplifyframework$api$graphql$SubscriptionType[subscriptionType.ordinal()];
        if (i == 1) {
            return SubscriptionEvent.Type.UPDATE;
        }
        if (i == 2) {
            return SubscriptionEvent.Type.DELETE;
        }
        if (i == 3) {
            return SubscriptionEvent.Type.CREATE;
        }
        throw new IllegalArgumentException("Unknown subscription type: " + subscriptionType);
    }

    private boolean isExceptionType(DataStoreException dataStoreException, AppSyncExtensions.AppSyncErrorType appSyncErrorType) {
        if (!(dataStoreException instanceof DataStoreException.GraphQLResponseException)) {
            return false;
        }
        GraphQLResponse.Error error = ((DataStoreException.GraphQLResponseException) dataStoreException).getErrors().get(0);
        if (Empty.check(error.getExtensions())) {
            return false;
        }
        return appSyncErrorType.equals(new AppSyncExtensions(error.getExtensions()).getErrorType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDrainingMutationBuffer$10(su5 su5Var) {
        LOG.info("Starting processing subscription data buffer.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDrainingMutationBuffer$11(Throwable th) {
        LOG.warn("Reading subscriptions buffer has failed.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startDrainingMutationBuffer$12() {
        LOG.warn("Reading from subscriptions buffer is completed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startSubscriptions$0(su5 su5Var) {
        LOG.info("Starting processing subscription events.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startSubscriptions$1(Throwable th) {
        LOG.warn("Reading subscription events has failed.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startSubscriptions$2() {
        LOG.warn("Reading subscription events is completed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscriptionObservable$3(SubscriptionType subscriptionType, ModelSchema modelSchema, AtomicReference atomicReference, AbortableCountDownLatch abortableCountDownLatch, String str) {
        LOG.debug("Subscription started for " + subscriptionType.name() + " " + modelSchema.getName() + " subscriptionId: " + str);
        atomicReference.set(str);
        abortableCountDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscriptionObservable$4(AbortableCountDownLatch abortableCountDownLatch, SubscriptionType subscriptionType, ModelSchema modelSchema, DataStoreException dataStoreException) {
        if (ErrorInspector.contains(dataStoreException, (Class<? extends Throwable>) ApiException.ApiAuthException.class) || isExceptionType(dataStoreException, AppSyncExtensions.AppSyncErrorType.UNAUTHORIZED)) {
            abortableCountDownLatch.countDown();
            LOG.warn("Unauthorized failure:" + subscriptionType.name() + " " + modelSchema.getName());
            return;
        }
        if (!isExceptionType(dataStoreException, AppSyncExtensions.AppSyncErrorType.OPERATION_DISABLED)) {
            if (abortableCountDownLatch.getCount() > 0) {
                abortableCountDownLatch.abort(dataStoreException);
                return;
            } else {
                this.onFailure.accept(dataStoreException);
                return;
            }
        }
        abortableCountDownLatch.countDown();
        LOG.warn("Operation disabled:" + subscriptionType.name() + " " + modelSchema.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscriptionObservable$5(AtomicReference atomicReference, q7c q7cVar) {
        LOG.debug("Subscription completed:" + ((String) atomicReference.get()));
        q7cVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscriptionObservable$6(AppSync appSync, final SubscriptionType subscriptionType, final ModelSchema modelSchema, final AbortableCountDownLatch abortableCountDownLatch, final q7c q7cVar) throws DataStoreException {
        SubscriptionMethod subscriptionMethodSubscriptionMethodFor = subscriptionMethodFor(appSync, subscriptionType);
        final AtomicReference atomicReference = new AtomicReference();
        Consumer<String> consumer = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.h1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                SubscriptionProcessor.lambda$subscriptionObservable$3(subscriptionType, modelSchema, atomicReference, abortableCountDownLatch, (String) obj);
            }
        };
        Objects.requireNonNull(q7cVar);
        q7cVar.mo28141d(AmplifyDisposables.fromCancelable(subscriptionMethodSubscriptionMethodFor.subscribe(modelSchema, consumer, new Consumer() { // from class: o.abg
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                q7cVar.mo16430e((GraphQLResponse) obj);
            }
        }, new Consumer() { // from class: com.amplifyframework.datastore.syncengine.q0
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f10760a.lambda$subscriptionObservable$4(abortableCountDownLatch, subscriptionType, modelSchema, (DataStoreException) obj);
            }
        }, new Action() { // from class: com.amplifyframework.datastore.syncengine.r0
            @Override // com.amplifyframework.core.Action
            public final void call() {
                SubscriptionProcessor.lambda$subscriptionObservable$5(atomicReference, q7cVar);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscriptionObservable$7(SubscriptionType subscriptionType, ModelSchema modelSchema, Throwable th) {
        LOG.warn("An error occurred on the remote " + subscriptionType.name() + " subscription for model " + modelSchema.getName(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$subscriptionObservable$8(ModelSchema modelSchema, ModelWithMetadata modelWithMetadata) {
        return this.queryPredicateProvider.getPredicate(modelSchema.getName()).evaluate(modelWithMetadata.getModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SubscriptionEvent lambda$subscriptionObservable$9(SubscriptionType subscriptionType, ModelSchema modelSchema, ModelWithMetadata modelWithMetadata) {
        return SubscriptionEvent.builder().type(fromSubscriptionType(subscriptionType)).modelWithMetadata(modelWithMetadata).modelSchema(modelSchema).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public xk3 mergeEvent(SubscriptionEvent<? extends Model> subscriptionEvent) {
        ModelWithMetadata<T> modelWithMetadata = subscriptionEvent.modelWithMetadata();
        if (!(modelWithMetadata.getModel() instanceof SerializedModel)) {
            return this.merger.merge(modelWithMetadata);
        }
        return this.merger.merge(new ModelWithMetadata(SerializedModel.builder().modelSchema(subscriptionEvent.modelSchema()).serializedData(SerializedModel.parseSerializedData(((SerializedModel) modelWithMetadata.getModel()).getSerializedData(), subscriptionEvent.modelSchema().getName(), this.schemaRegistry)).build(), modelWithMetadata.getSyncMetadata()));
    }

    public static SubscriptionMethod subscriptionMethodFor(final AppSync appSync, SubscriptionType subscriptionType) throws DataStoreException {
        int i = C105781.$SwitchMap$com$amplifyframework$api$graphql$SubscriptionType[subscriptionType.ordinal()];
        if (i == 1) {
            Objects.requireNonNull(appSync);
            return new SubscriptionMethod() { // from class: com.amplifyframework.datastore.syncengine.p0
                @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.SubscriptionMethod
                public final Cancelable subscribe(ModelSchema modelSchema, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                    return appSync.onUpdate(modelSchema, consumer, consumer2, consumer3, action);
                }
            };
        }
        if (i == 2) {
            Objects.requireNonNull(appSync);
            return new SubscriptionMethod() { // from class: com.amplifyframework.datastore.syncengine.a1
                @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.SubscriptionMethod
                public final Cancelable subscribe(ModelSchema modelSchema, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                    return appSync.onDelete(modelSchema, consumer, consumer2, consumer3, action);
                }
            };
        }
        if (i != 3) {
            throw new DataStoreException("Failed to establish a model subscription.", "Was a new subscription type created?");
        }
        Objects.requireNonNull(appSync);
        return new SubscriptionMethod() { // from class: com.amplifyframework.datastore.syncengine.b1
            @Override // com.amplifyframework.datastore.syncengine.SubscriptionProcessor.SubscriptionMethod
            public final Cancelable subscribe(ModelSchema modelSchema, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                return appSync.onCreate(modelSchema, consumer, consumer2, consumer3, action);
            }
        };
    }

    private <T extends Model> x6c subscriptionObservable(final AppSync appSync, final SubscriptionType subscriptionType, final AbortableCountDownLatch<DataStoreException> abortableCountDownLatch, final ModelSchema modelSchema) {
        return x6c.m55706q(new m8c() { // from class: com.amplifyframework.datastore.syncengine.c1
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) throws DataStoreException {
                this.f10677a.lambda$subscriptionObservable$6(appSync, subscriptionType, modelSchema, abortableCountDownLatch, q7cVar);
            }
        }).m55708A(new gu3() { // from class: com.amplifyframework.datastore.syncengine.d1
            @Override // p001o.gu3
            public final void accept(Object obj) {
                SubscriptionProcessor.lambda$subscriptionObservable$7(subscriptionType, modelSchema, (Throwable) obj);
            }
        }).y0(i5f.m31599c()).h0(i5f.m31599c()).d0(new rl7() { // from class: com.amplifyframework.datastore.syncengine.e1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return SubscriptionProcessor.unwrapResponse((GraphQLResponse) obj);
            }
        }).m55714J(new ggd() { // from class: com.amplifyframework.datastore.syncengine.f1
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return this.f10695a.lambda$subscriptionObservable$8(modelSchema, (ModelWithMetadata) obj);
            }
        }).d0(new rl7() { // from class: com.amplifyframework.datastore.syncengine.g1
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return SubscriptionProcessor.lambda$subscriptionObservable$9(subscriptionType, modelSchema, (ModelWithMetadata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Model> ModelWithMetadata<T> unwrapResponse(GraphQLResponse<? extends ModelWithMetadata<T>> graphQLResponse) throws DataStoreException {
        String str = graphQLResponse.hasErrors() ? String.format("Errors on subscription: %s", graphQLResponse.getErrors()) : !graphQLResponse.hasData() ? "Empty data received on subscription." : null;
        if (str == null) {
            return graphQLResponse.getData();
        }
        throw new DataStoreException(str, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
    }

    public void startDrainingMutationBuffer() {
        this.ongoingOperationsDisposable.mo30304a(this.buffer.m55711D(new gu3() { // from class: com.amplifyframework.datastore.syncengine.s0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                SubscriptionProcessor.lambda$startDrainingMutationBuffer$10((su5) obj);
            }
        }).m55721Q(new rl7() { // from class: com.amplifyframework.datastore.syncengine.t0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10774a.mergeEvent((SubscriptionEvent) obj);
            }
        }).m56402l(new gu3() { // from class: com.amplifyframework.datastore.syncengine.u0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                SubscriptionProcessor.lambda$startDrainingMutationBuffer$11((Throwable) obj);
            }
        }).m56400j(new jm() { // from class: com.amplifyframework.datastore.syncengine.v0
            @Override // p001o.jm
            public final void run() {
                SubscriptionProcessor.lambda$startDrainingMutationBuffer$12();
            }
        }).m56407u());
    }

    public synchronized void startSubscriptions() {
        AbortableCountDownLatch<DataStoreException> abortableCountDownLatch = new AbortableCountDownLatch<>(this.modelProvider.modelNames().size() * SubscriptionType.values().length);
        this.buffer = n3i.M0();
        HashSet hashSet = new HashSet();
        Iterator<ModelSchema> it = this.modelProvider.modelSchemas().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ModelSchema next = it.next();
            for (SubscriptionType subscriptionType : SubscriptionType.values()) {
                hashSet.add(subscriptionObservable(this.appSync, subscriptionType, abortableCountDownLatch, next));
            }
        }
        ko3 ko3Var = this.ongoingOperationsDisposable;
        x6c x6cVarM55740x = x6c.e0(hashSet).y0(i5f.m31599c()).h0(i5f.m31599c()).m55711D(new gu3() { // from class: com.amplifyframework.datastore.syncengine.w0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                SubscriptionProcessor.lambda$startSubscriptions$0((su5) obj);
            }
        }).m55708A(new gu3() { // from class: com.amplifyframework.datastore.syncengine.x0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                SubscriptionProcessor.lambda$startSubscriptions$1((Throwable) obj);
            }
        }).m55740x(new jm() { // from class: com.amplifyframework.datastore.syncengine.y0
            @Override // p001o.jm
            public final void run() {
                SubscriptionProcessor.lambda$startSubscriptions$2();
            }
        });
        final n3i n3iVar = this.buffer;
        Objects.requireNonNull(n3iVar);
        gu3 gu3Var = new gu3() { // from class: com.amplifyframework.datastore.syncengine.z0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                n3iVar.mo16560e((SubscriptionEvent) obj);
            }
        };
        final n3i n3iVar2 = this.buffer;
        Objects.requireNonNull(n3iVar2);
        gu3 gu3Var2 = new gu3() { // from class: o.yag
            @Override // p001o.gu3
            public final void accept(Object obj) {
                n3iVar2.onError((Throwable) obj);
            }
        };
        final n3i n3iVar3 = this.buffer;
        Objects.requireNonNull(n3iVar3);
        ko3Var.mo30304a(x6cVarM55740x.w0(gu3Var, gu3Var2, new jm() { // from class: o.zag
            @Override // p001o.jm
            public final void run() {
                n3iVar3.onComplete();
            }
        }));
        try {
            Logger logger = LOG;
            logger.debug("Waiting for subscriptions to start.");
            if (!abortableCountDownLatch.abortableAwait(this.adjustedTimeoutSeconds, TimeUnit.SECONDS)) {
                throw new DataStoreException("Timed out waiting for subscription processor to start.", "Retry");
            }
            Amplify.Hub.publish(HubChannel.DATASTORE, HubEvent.create(DataStoreChannelEventName.SUBSCRIPTIONS_ESTABLISHED));
            logger.info(String.format(Locale.US, "Started subscription processor for models: %s of types %s.", this.modelProvider.modelNames(), Arrays.toString(SubscriptionType.values())));
        } catch (InterruptedException unused) {
            LOG.warn("Subscription operations were interrupted during setup.");
            throw new DataStoreException("Subscription operations were interrupted during setup.", "Retry");
        }
    }

    public synchronized void stopAllSubscriptionActivity() {
        Logger logger = LOG;
        logger.info("Stopping subscription processor.");
        this.ongoingOperationsDisposable.m35969e();
        logger.info("Stopped subscription processor.");
    }

    private SubscriptionProcessor(Builder builder) {
        this.appSync = builder.appSync;
        this.modelProvider = builder.modelProvider;
        this.merger = builder.merger;
        this.queryPredicateProvider = builder.queryPredicateProvider;
        this.onFailure = builder.onFailure;
        this.schemaRegistry = builder.schemaRegistry;
        this.ongoingOperationsDisposable = new ko3();
        this.adjustedTimeoutSeconds = Math.max(60L, Math.max(r0.models().size(), r0.modelSchemas().size()) * TIMEOUT_SECONDS_PER_MODEL);
    }
}
