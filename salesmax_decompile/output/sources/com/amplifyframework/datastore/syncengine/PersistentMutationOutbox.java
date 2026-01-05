package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.core.model.query.Page;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicateGroup;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.events.OutboxStatusEvent;
import com.amplifyframework.datastore.storage.LocalStorageAdapter;
import com.amplifyframework.datastore.storage.StorageItemChange;
import com.amplifyframework.datastore.syncengine.MutationOutbox;
import com.amplifyframework.datastore.syncengine.PendingMutation;
import com.amplifyframework.datastore.syncengine.PersistentMutationOutbox;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.logging.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p001o.dh3;
import p001o.f3e;
import p001o.fl3;
import p001o.g0b;
import p001o.gu3;
import p001o.i0b;
import p001o.id5;
import p001o.idg;
import p001o.jm;
import p001o.kh3;
import p001o.lag;
import p001o.nl3;
import p001o.ql3;
import p001o.qm1;
import p001o.r0b;
import p001o.rl7;
import p001o.sq8;
import p001o.su5;
import p001o.szb;
import p001o.x6c;
import p001o.xk3;

/* loaded from: classes5.dex */
public final class PersistentMutationOutbox implements MutationOutbox {
    public static final Companion Companion = new Companion(null);
    private static final Logger LOG;
    private final PendingMutation.Converter converter;
    private boolean countMutations;
    private final lag events;
    private final Set<TimeBasedUuid> inFlightMutations;
    private PendingMutation<? extends Model> loadedMutation;
    private int numMutationsInOutbox;
    private final Semaphore semaphore;
    private final LocalStorageAdapter storage;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public final class IncomingMutationConflictHandler<T extends Model> {
        private final PendingMutation<T> existing;
        private final PendingMutation<T> incoming;
        final /* synthetic */ PersistentMutationOutbox this$0;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PendingMutation.Type.values().length];
                try {
                    iArr[PendingMutation.Type.CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PendingMutation.Type.UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PendingMutation.Type.DELETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public IncomingMutationConflictHandler(PersistentMutationOutbox persistentMutationOutbox, PendingMutation<T> pendingMutation, PendingMutation<T> pendingMutation2) {
            sq8.m48649h(pendingMutation, "existing");
            sq8.m48649h(pendingMutation2, "incoming");
            this.this$0 = persistentMutationOutbox;
            this.existing = pendingMutation;
            this.incoming = pendingMutation2;
        }

        private final xk3 conflictingCreationError() {
            xk3 xk3VarM56391p = xk3.m56391p(new DataStoreException("Attempted to enqueue a model creation, but there is already a pending creation for that model ID.", "Please report at https://github.com/aws-amplify/amplify-android/issues."));
            sq8.m48648g(xk3VarM56391p, "error(...)");
            return xk3VarM56391p;
        }

        private final xk3 handleIncomingCreate() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.existing.getMutationType().ordinal()];
            if (i == 1) {
                return conflictingCreationError();
            }
            if (i == 2 || i == 3) {
                return unexpectedMutationScenario();
            }
            throw new szb();
        }

        private final xk3 handleIncomingDelete() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.existing.getMutationType().ordinal()];
            if (i == 1) {
                if (this.this$0.inFlightMutations.contains(this.existing.getMutationId())) {
                    return this.this$0.save(this.incoming, true);
                }
                PersistentMutationOutbox persistentMutationOutbox = this.this$0;
                TimeBasedUuid mutationId = this.existing.getMutationId();
                sq8.m48648g(mutationId, "getMutationId(...)");
                return persistentMutationOutbox.removeNotLocking(mutationId);
            }
            if (i != 2 && i != 3) {
                throw new szb();
            }
            PendingMutation.Type type2 = PendingMutation.Type.DELETE;
            QueryPredicate predicate = this.incoming.getPredicate();
            sq8.m48648g(predicate, "getPredicate(...)");
            return overwriteExistingAndNotify(type2, predicate);
        }

        private final xk3 handleIncomingUpdate() {
            xk3 xk3VarOverwriteExistingAndNotify;
            xk3 xk3VarSaveAndNotify;
            int i = WhenMappings.$EnumSwitchMapping$0[this.existing.getMutationType().ordinal()];
            if (i == 1) {
                if ((this.incoming.getMutatedItem() instanceof SerializedModel) && (this.existing.getMutatedItem() instanceof SerializedModel)) {
                    Model mutatedItem = this.incoming.getMutatedItem();
                    sq8.m48647f(mutatedItem, "null cannot be cast to non-null type com.amplifyframework.core.model.SerializedModel");
                    Model mutatedItem2 = this.existing.getMutatedItem();
                    sq8.m48647f(mutatedItem2, "null cannot be cast to non-null type com.amplifyframework.core.model.SerializedModel");
                    ModelSchema modelSchema = this.incoming.getModelSchema();
                    sq8.m48648g(modelSchema, "getModelSchema(...)");
                    PendingMutation<T> pendingMutationMergeAndCreatePendingMutation = mergeAndCreatePendingMutation((SerializedModel) mutatedItem, (SerializedModel) mutatedItem2, modelSchema, PendingMutation.Type.CREATE);
                    PersistentMutationOutbox persistentMutationOutbox = this.this$0;
                    TimeBasedUuid mutationId = this.existing.getMutationId();
                    sq8.m48648g(mutationId, "getMutationId(...)");
                    xk3VarOverwriteExistingAndNotify = persistentMutationOutbox.removeNotLocking(mutationId).m56397c(saveAndNotify(pendingMutationMergeAndCreatePendingMutation, true));
                } else {
                    PendingMutation.Type type2 = PendingMutation.Type.CREATE;
                    QueryPredicate queryPredicateAll = QueryPredicates.all();
                    sq8.m48648g(queryPredicateAll, "all(...)");
                    xk3VarOverwriteExistingAndNotify = overwriteExistingAndNotify(type2, queryPredicateAll);
                }
                sq8.m48646e(xk3VarOverwriteExistingAndNotify);
                return xk3VarOverwriteExistingAndNotify;
            }
            if (i != 2) {
                if (i == 3) {
                    return modelAlreadyScheduledForDeletion();
                }
                throw new szb();
            }
            if (!sq8.m48644c(QueryPredicates.all(), this.incoming.getPredicate())) {
                xk3VarSaveAndNotify = saveAndNotify(this.incoming, true);
            } else if ((this.incoming.getMutatedItem() instanceof SerializedModel) && (this.existing.getMutatedItem() instanceof SerializedModel)) {
                Model mutatedItem3 = this.incoming.getMutatedItem();
                sq8.m48647f(mutatedItem3, "null cannot be cast to non-null type com.amplifyframework.core.model.SerializedModel");
                Model mutatedItem4 = this.existing.getMutatedItem();
                sq8.m48647f(mutatedItem4, "null cannot be cast to non-null type com.amplifyframework.core.model.SerializedModel");
                ModelSchema modelSchema2 = this.incoming.getModelSchema();
                sq8.m48648g(modelSchema2, "getModelSchema(...)");
                PendingMutation<T> pendingMutationMergeAndCreatePendingMutation2 = mergeAndCreatePendingMutation((SerializedModel) mutatedItem3, (SerializedModel) mutatedItem4, modelSchema2, PendingMutation.Type.UPDATE);
                PersistentMutationOutbox persistentMutationOutbox2 = this.this$0;
                TimeBasedUuid mutationId2 = this.existing.getMutationId();
                sq8.m48648g(mutationId2, "getMutationId(...)");
                xk3VarSaveAndNotify = persistentMutationOutbox2.removeNotLocking(mutationId2).m56397c(saveAndNotify(pendingMutationMergeAndCreatePendingMutation2, true));
            } else {
                PersistentMutationOutbox persistentMutationOutbox3 = this.this$0;
                TimeBasedUuid mutationId3 = this.existing.getMutationId();
                sq8.m48648g(mutationId3, "getMutationId(...)");
                xk3VarSaveAndNotify = persistentMutationOutbox3.removeNotLocking(mutationId3).m56397c(saveAndNotify(this.incoming, true));
            }
            sq8.m48646e(xk3VarSaveAndNotify);
            return xk3VarSaveAndNotify;
        }

        private final PendingMutation<T> mergeAndCreatePendingMutation(SerializedModel serializedModel, SerializedModel serializedModel2, ModelSchema modelSchema, PendingMutation.Type type2) {
            PendingMutation<T> pendingMutationInstance = PendingMutation.instance(SerializedModel.merge(serializedModel, serializedModel2, modelSchema), modelSchema, type2, QueryPredicates.all());
            sq8.m48647f(pendingMutationInstance, "null cannot be cast to non-null type com.amplifyframework.datastore.syncengine.PendingMutation<T of com.amplifyframework.datastore.syncengine.PersistentMutationOutbox.IncomingMutationConflictHandler>");
            return pendingMutationInstance;
        }

        private final xk3 modelAlreadyScheduledForDeletion() {
            xk3 xk3VarM56391p = xk3.m56391p(new DataStoreException("Attempted to enqueue a model mutation, but that model already had a delete mutation pending.", "This should not be possible. Please report on GitHub issues."));
            sq8.m48648g(xk3VarM56391p, "error(...)");
            return xk3VarM56391p;
        }

        private final xk3 overwriteExistingAndNotify(PendingMutation.Type type2, QueryPredicate queryPredicate) {
            TimeBasedUuid mutationId = this.existing.getMutationId();
            sq8.m48648g(mutationId, "getMutationId(...)");
            Model mutatedItem = this.incoming.getMutatedItem();
            sq8.m48648g(mutatedItem, "getMutatedItem(...)");
            ModelSchema modelSchema = this.incoming.getModelSchema();
            sq8.m48648g(modelSchema, "getModelSchema(...)");
            PersistentMutationOutbox persistentMutationOutbox = this.this$0;
            PendingMutation pendingMutationInstance = PendingMutation.instance(mutationId, mutatedItem, modelSchema, type2, queryPredicate);
            sq8.m48648g(pendingMutationInstance, "instance(...)");
            xk3 xk3VarM56397c = persistentMutationOutbox.save(pendingMutationInstance, false).m56397c(this.this$0.notifyContentAvailable());
            sq8.m48648g(xk3VarM56397c, "andThen(...)");
            return xk3VarM56397c;
        }

        private final xk3 saveAndNotify(PendingMutation<T> pendingMutation, boolean z) {
            xk3 xk3VarM56397c = this.this$0.save(pendingMutation, z).m56397c(this.this$0.notifyContentAvailable());
            sq8.m48648g(xk3VarM56397c, "andThen(...)");
            return xk3VarM56397c;
        }

        private final xk3 unexpectedMutationScenario() {
            xk3 xk3VarM56391p = xk3.m56391p(new DataStoreException("Unable to handle existing mutation of type = " + this.existing.getMutationType() + " and incoming mutation of type = " + this.incoming.getMutationType(), "Please report at https://github.com/aws-amplify/amplify-android/issues."));
            sq8.m48648g(xk3VarM56391p, "error(...)");
            return xk3VarM56391p;
        }

        private final xk3 unknownMutationType(PendingMutation.Type type2) {
            xk3 xk3VarM56391p = xk3.m56391p(new DataStoreException("Existing mutation of unknown type = " + type2, "Please report at https://github.com/aws-amplify/amplify-android/issues."));
            sq8.m48648g(xk3VarM56391p, "error(...)");
            return xk3VarM56391p;
        }

        public final xk3 resolve() {
            PersistentMutationOutbox.LOG.debug("IncomingMutationConflict -  existing " + this.existing.getMutationType() + " incoming " + this.incoming.getMutationType());
            int i = WhenMappings.$EnumSwitchMapping$0[this.incoming.getMutationType().ordinal()];
            if (i == 1) {
                return handleIncomingCreate();
            }
            if (i == 2) {
                return handleIncomingUpdate();
            }
            if (i == 3) {
                return handleIncomingDelete();
            }
            throw new szb();
        }
    }

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
        sq8.m48648g(logger, "logger(...)");
        LOG = logger;
    }

    public PersistentMutationOutbox(LocalStorageAdapter localStorageAdapter) {
        sq8.m48649h(localStorageAdapter, "storage");
        this.storage = localStorageAdapter;
        this.inFlightMutations = new HashSet();
        this.converter = new GsonPendingMutationConverter();
        lag lagVarL0 = f3e.N0().L0();
        sq8.m48648g(lagVarL0, "toSerialized(...)");
        this.events = lagVarL0;
        this.semaphore = new Semaphore(1);
        this.countMutations = true;
    }

    private final <T extends Model> void announceEventEnqueued(PendingMutation<T> pendingMutation) {
        OutboxMutationEvent outboxMutationEventFromPendingMutation = OutboxMutationEvent.fromPendingMutation(pendingMutation);
        sq8.m48648g(outboxMutationEventFromPendingMutation, "fromPendingMutation(...)");
        Amplify.Hub.publish(HubChannel.DATASTORE, outboxMutationEventFromPendingMutation.toHubEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ql3 enqueue$lambda$11(PendingMutation pendingMutation, PersistentMutationOutbox persistentMutationOutbox) throws InterruptedException {
        sq8.m48649h(pendingMutation, "$incomingMutation");
        sq8.m48649h(persistentMutationOutbox, "this$0");
        String primaryKeyString = pendingMutation.getMutatedItem().getPrimaryKeyString();
        sq8.m48648g(primaryKeyString, "getPrimaryKeyString(...)");
        String modelName = pendingMutation.getMutatedItem().getModelName();
        sq8.m48648g(modelName, "getModelName(...)");
        PendingMutation<? extends Model> mutationForModelId = persistentMutationOutbox.getMutationForModelId(primaryKeyString, modelName);
        return (mutationForModelId == null || persistentMutationOutbox.inFlightMutations.contains(mutationForModelId.getMutationId())) ? persistentMutationOutbox.save(pendingMutation, true).m56397c(persistentMutationOutbox.notifyContentAvailable()) : persistentMutationOutbox.resolveConflict(mutationForModelId, pendingMutation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$12(PersistentMutationOutbox persistentMutationOutbox) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        persistentMutationOutbox.semaphore.release();
    }

    private final PendingMutation<? extends Model> getMutationById(final String str) throws InterruptedException {
        final AtomicReference atomicReference = new AtomicReference();
        xk3.m56389h(new nl3() { // from class: o.r5d
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) {
                PersistentMutationOutbox.getMutationById$lambda$9(this.f43035a, str, atomicReference, fl3Var);
            }
        }).m56404n(new gu3() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox.getMutationById.2
            @Override // p001o.gu3
            public final void accept(su5 su5Var) throws InterruptedException {
                sq8.m48649h(su5Var, "it");
                PersistentMutationOutbox.this.semaphore.acquire();
            }
        }).m56405o(new jm() { // from class: o.s5d
            @Override // p001o.jm
            public final void run() {
                PersistentMutationOutbox.getMutationById$lambda$10(this.f44840a);
            }
        }).m56398d();
        return (PendingMutation) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationById$lambda$10(PersistentMutationOutbox persistentMutationOutbox) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        persistentMutationOutbox.semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationById$lambda$9(final PersistentMutationOutbox persistentMutationOutbox, String str, final AtomicReference atomicReference, final fl3 fl3Var) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(str, "$mutationId");
        sq8.m48649h(atomicReference, "$mutationResult");
        sq8.m48649h(fl3Var, "emitter");
        persistentMutationOutbox.storage.query(PendingMutation.PersistentRecord.class, Where.matches(PendingMutation.PersistentRecord.ID.eq(str)), new Consumer() { // from class: o.z5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.getMutationById$lambda$9$lambda$7(atomicReference, persistentMutationOutbox, fl3Var, (Iterator) obj);
            }
        }, new Consumer() { // from class: o.a6d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.getMutationById$lambda$9$lambda$8(fl3Var, (DataStoreException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationById$lambda$9$lambda$7(AtomicReference atomicReference, PersistentMutationOutbox persistentMutationOutbox, fl3 fl3Var, Iterator it) {
        sq8.m48649h(atomicReference, "$mutationResult");
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(it, "results");
        if (it.hasNext()) {
            try {
                atomicReference.set(persistentMutationOutbox.converter.fromRecord((PendingMutation.PersistentRecord) it.next()));
            } catch (Throwable th) {
                fl3Var.onError(th);
            }
        }
        fl3Var.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationById$lambda$9$lambda$8(fl3 fl3Var, DataStoreException dataStoreException) {
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(dataStoreException, "t");
        fl3Var.onError(dataStoreException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationForModelId$lambda$2(final PersistentMutationOutbox persistentMutationOutbox, String str, final String str2, final AtomicReference atomicReference, final fl3 fl3Var) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(str, "$modelId");
        sq8.m48649h(str2, "$modelClass");
        sq8.m48649h(atomicReference, "$mutationResult");
        sq8.m48649h(fl3Var, "emitter");
        persistentMutationOutbox.storage.query(PendingMutation.PersistentRecord.class, Where.matches(PendingMutation.PersistentRecord.CONTAINED_MODEL_ID.eq(str)), new Consumer() { // from class: o.p5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.getMutationForModelId$lambda$2$lambda$0(this.f39349a, str2, atomicReference, fl3Var, (Iterator) obj);
            }
        }, new Consumer() { // from class: o.q5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.getMutationForModelId$lambda$2$lambda$1(fl3Var, (DataStoreException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationForModelId$lambda$2$lambda$0(PersistentMutationOutbox persistentMutationOutbox, String str, AtomicReference atomicReference, fl3 fl3Var, Iterator it) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(str, "$modelClass");
        sq8.m48649h(atomicReference, "$mutationResult");
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(it, "results");
        if (it.hasNext()) {
            try {
                PendingMutation pendingMutationFromRecord = persistentMutationOutbox.converter.fromRecord((PendingMutation.PersistentRecord) it.next());
                sq8.m48648g(pendingMutationFromRecord, "fromRecord(...)");
                if (sq8.m48644c(pendingMutationFromRecord.getModelSchema().getName(), str)) {
                    atomicReference.set(pendingMutationFromRecord);
                }
            } catch (Throwable th) {
                fl3Var.onError(th);
            }
        }
        fl3Var.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationForModelId$lambda$2$lambda$1(fl3 fl3Var, DataStoreException dataStoreException) {
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(dataStoreException, "t");
        fl3Var.onError(dataStoreException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMutationForModelId$lambda$3(PersistentMutationOutbox persistentMutationOutbox) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        persistentMutationOutbox.semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$23(final PersistentMutationOutbox persistentMutationOutbox, final fl3 fl3Var) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(fl3Var, "emitter");
        persistentMutationOutbox.inFlightMutations.clear();
        QueryOptions queryOptionsMatchesAll = Where.matchesAll();
        if (!persistentMutationOutbox.countMutations) {
            queryOptionsMatchesAll = queryOptionsMatchesAll.paginated(Page.firstResult());
        }
        persistentMutationOutbox.storage.query(PendingMutation.PersistentRecord.class, queryOptionsMatchesAll, new Consumer() { // from class: o.n5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.load$lambda$23$lambda$21(this.f36405a, fl3Var, (Iterator) obj);
            }
        }, new Consumer() { // from class: o.w5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.load$lambda$23$lambda$22(fl3Var, (DataStoreException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$23$lambda$21(PersistentMutationOutbox persistentMutationOutbox, fl3 fl3Var, Iterator it) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(it, "results");
        if (!it.hasNext()) {
            persistentMutationOutbox.loadedMutation = null;
            persistentMutationOutbox.numMutationsInOutbox = 0;
        }
        boolean z = true;
        while (it.hasNext()) {
            PendingMutation.PersistentRecord persistentRecord = (PendingMutation.PersistentRecord) it.next();
            if (z) {
                try {
                    persistentMutationOutbox.loadedMutation = persistentMutationOutbox.converter.fromRecord(persistentRecord);
                    if (!persistentMutationOutbox.countMutations) {
                        break;
                    }
                    persistentMutationOutbox.numMutationsInOutbox = 0;
                    z = false;
                } catch (Throwable th) {
                    fl3Var.onError(th);
                    return;
                }
            }
            if (persistentMutationOutbox.countMutations) {
                persistentMutationOutbox.numMutationsInOutbox++;
            }
        }
        persistentMutationOutbox.countMutations = false;
        persistentMutationOutbox.publishCurrentOutboxStatus();
        fl3Var.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$23$lambda$22(fl3 fl3Var, DataStoreException dataStoreException) {
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(dataStoreException, "t");
        fl3Var.onError(dataStoreException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$24(PersistentMutationOutbox persistentMutationOutbox) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        persistentMutationOutbox.semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markInFlight$lambda$26(PersistentMutationOutbox persistentMutationOutbox, TimeBasedUuid timeBasedUuid, fl3 fl3Var) throws InterruptedException {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(timeBasedUuid, "$pendingMutationId");
        sq8.m48649h(fl3Var, "emitter");
        String string = timeBasedUuid.toString();
        sq8.m48648g(string, "toString(...)");
        PendingMutation<? extends Model> mutationById = persistentMutationOutbox.getMutationById(string);
        if (mutationById != null) {
            Set<TimeBasedUuid> set = persistentMutationOutbox.inFlightMutations;
            TimeBasedUuid mutationId = mutationById.getMutationId();
            sq8.m48648g(mutationId, "getMutationId(...)");
            set.add(mutationId);
            fl3Var.onComplete();
            return;
        }
        fl3Var.onError(new DataStoreException("Outbox was asked to mark a mutation with ID = " + timeBasedUuid + " as in-flight. However, there was no mutation with that ID in the outbox, to begin with.", AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xk3 notifyContentAvailable() {
        xk3 xk3VarM56392q = xk3.m56392q(new jm() { // from class: o.t5d
            @Override // p001o.jm
            public final void run() {
                PersistentMutationOutbox.notifyContentAvailable$lambda$25(this.f46469a);
            }
        });
        sq8.m48648g(xk3VarM56392q, "fromAction(...)");
        return xk3VarM56392q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyContentAvailable$lambda$25(PersistentMutationOutbox persistentMutationOutbox) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        persistentMutationOutbox.events.mo16560e(MutationOutbox.OutboxEvent.CONTENT_AVAILABLE);
    }

    private final void publishCurrentOutboxStatus() {
        Amplify.Hub.publish(HubChannel.DATASTORE, new OutboxStatusEvent(this.numMutationsInOutbox == 0).toHubEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void remove$lambda$16(PersistentMutationOutbox persistentMutationOutbox) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        persistentMutationOutbox.semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xk3 removeNotLocking(final TimeBasedUuid timeBasedUuid) {
        Objects.requireNonNull(timeBasedUuid);
        xk3 xk3VarM56390i = xk3.m56390i(new idg() { // from class: com.amplifyframework.datastore.syncengine.d0
            @Override // p001o.idg
            public final Object get() {
                return PersistentMutationOutbox.removeNotLocking$lambda$20(this.f10686a, timeBasedUuid);
            }
        });
        sq8.m48648g(xk3VarM56390i, "defer(...)");
        return xk3VarM56390i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ql3 removeNotLocking$lambda$20(final PersistentMutationOutbox persistentMutationOutbox, final TimeBasedUuid timeBasedUuid) throws DataStoreException, InterruptedException {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(timeBasedUuid, "$pendingMutationId");
        String string = timeBasedUuid.toString();
        sq8.m48648g(string, "toString(...)");
        final PendingMutation<? extends Model> mutationById = persistentMutationOutbox.getMutationById(string);
        if (mutationById != null) {
            return g0b.m27836e(new r0b() { // from class: com.amplifyframework.datastore.syncengine.b0
                @Override // p001o.r0b
                /* renamed from: a */
                public final void mo12391a(i0b i0bVar) {
                    PersistentMutationOutbox.removeNotLocking$lambda$20$lambda$19(this.f10668a, mutationById, timeBasedUuid, i0bVar);
                }
            }).m27843i(new rl7() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox$removeNotLocking$1$2
                @Override // p001o.rl7
                public final ql3 apply(MutationOutbox.OutboxEvent outboxEvent) {
                    return this.this$0.notifyContentAvailable();
                }
            });
        }
        throw new DataStoreException("Outbox was asked to remove a mutation with ID = " + timeBasedUuid + ". However, there was no mutation with that ID in the outbox, to begin with.", AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeNotLocking$lambda$20$lambda$19(final PersistentMutationOutbox persistentMutationOutbox, final PendingMutation pendingMutation, final TimeBasedUuid timeBasedUuid, final i0b i0bVar) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(pendingMutation, "$pendingMutation");
        sq8.m48649h(timeBasedUuid, "$pendingMutationId");
        sq8.m48649h(i0bVar, "subscriber");
        persistentMutationOutbox.storage.delete((LocalStorageAdapter) persistentMutationOutbox.converter.toRecord(pendingMutation), StorageItemChange.Initiator.SYNC_ENGINE, QueryPredicates.all(), (Consumer<StorageItemChange<LocalStorageAdapter>>) new Consumer() { // from class: com.amplifyframework.datastore.syncengine.a0
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.removeNotLocking$lambda$20$lambda$19$lambda$17(this.f10662a, timeBasedUuid, pendingMutation, i0bVar, (StorageItemChange) obj);
            }
        }, new Consumer() { // from class: o.o5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.removeNotLocking$lambda$20$lambda$19$lambda$18(i0bVar, (DataStoreException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeNotLocking$lambda$20$lambda$19$lambda$17(PersistentMutationOutbox persistentMutationOutbox, TimeBasedUuid timeBasedUuid, PendingMutation pendingMutation, i0b i0bVar, StorageItemChange storageItemChange) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(timeBasedUuid, "$pendingMutationId");
        sq8.m48649h(pendingMutation, "$pendingMutation");
        sq8.m48649h(i0bVar, "$subscriber");
        sq8.m48649h(storageItemChange, "it");
        persistentMutationOutbox.inFlightMutations.remove(timeBasedUuid);
        LOG.info("Successfully removed from mutations outbox" + pendingMutation);
        int i = persistentMutationOutbox.numMutationsInOutbox - 1;
        persistentMutationOutbox.numMutationsInOutbox = i;
        if (i > 0) {
            i0bVar.onSuccess(MutationOutbox.OutboxEvent.CONTENT_AVAILABLE);
        } else {
            i0bVar.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeNotLocking$lambda$20$lambda$19$lambda$18(i0b i0bVar, DataStoreException dataStoreException) {
        sq8.m48649h(i0bVar, "$subscriber");
        sq8.m48649h(dataStoreException, "t");
        i0bVar.onError(dataStoreException);
    }

    private final <T extends Model> xk3 resolveConflict(PendingMutation<T> pendingMutation, PendingMutation<T> pendingMutation2) {
        return new IncomingMutationConflictHandler(this, pendingMutation, pendingMutation2).resolve();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends Model> xk3 save(final PendingMutation<T> pendingMutation, final boolean z) {
        final PendingMutation.PersistentRecord record = this.converter.toRecord(pendingMutation);
        xk3 xk3VarM56389h = xk3.m56389h(new nl3() { // from class: o.c6d
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) {
                PersistentMutationOutbox.save$lambda$15(this.f17408a, record, pendingMutation, z, fl3Var);
            }
        });
        sq8.m48648g(xk3VarM56389h, "create(...)");
        return xk3VarM56389h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void save$lambda$15(final PersistentMutationOutbox persistentMutationOutbox, PendingMutation.PersistentRecord persistentRecord, final PendingMutation pendingMutation, final boolean z, final fl3 fl3Var) {
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(pendingMutation, "$pendingMutation");
        sq8.m48649h(fl3Var, "emitter");
        persistentMutationOutbox.storage.save(persistentRecord, StorageItemChange.Initiator.SYNC_ENGINE, QueryPredicates.all(), new Consumer() { // from class: o.x5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.save$lambda$15$lambda$13(pendingMutation, z, persistentMutationOutbox, fl3Var, (StorageItemChange) obj);
            }
        }, new Consumer() { // from class: o.y5d
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                PersistentMutationOutbox.save$lambda$15$lambda$14(fl3Var, (DataStoreException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void save$lambda$15$lambda$13(PendingMutation pendingMutation, boolean z, PersistentMutationOutbox persistentMutationOutbox, fl3 fl3Var, StorageItemChange storageItemChange) {
        sq8.m48649h(pendingMutation, "$pendingMutation");
        sq8.m48649h(persistentMutationOutbox, "this$0");
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(storageItemChange, "it");
        LOG.info("Successfully enqueued " + pendingMutation);
        if (z) {
            persistentMutationOutbox.numMutationsInOutbox++;
        }
        persistentMutationOutbox.announceEventEnqueued(pendingMutation);
        persistentMutationOutbox.publishCurrentOutboxStatus();
        fl3Var.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void save$lambda$15$lambda$14(fl3 fl3Var, DataStoreException dataStoreException) {
        sq8.m48649h(fl3Var, "$emitter");
        sq8.m48649h(dataStoreException, "t");
        fl3Var.onError(dataStoreException);
    }

    @Override // com.amplifyframework.datastore.syncengine.MutationOutbox
    public <T extends Model> xk3 enqueue(final PendingMutation<T> pendingMutation) {
        sq8.m48649h(pendingMutation, "incomingMutation");
        xk3 xk3VarM56405o = xk3.m56390i(new idg() { // from class: o.d6d
            @Override // p001o.idg
            public final Object get() {
                return PersistentMutationOutbox.enqueue$lambda$11(pendingMutation, this);
            }
        }).m56404n(new gu3() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox.enqueue.2
            @Override // p001o.gu3
            public final void accept(su5 su5Var) throws InterruptedException {
                sq8.m48649h(su5Var, "it");
                PersistentMutationOutbox.this.semaphore.acquire();
            }
        }).m56405o(new jm() { // from class: o.e6d
            @Override // p001o.jm
            public final void run() {
                PersistentMutationOutbox.enqueue$lambda$12(this.f21064a);
            }
        });
        sq8.m48648g(xk3VarM56405o, "doOnTerminate(...)");
        return xk3VarM56405o;
    }

    @Override // com.amplifyframework.datastore.syncengine.MutationOutbox
    public x6c events() {
        return this.events;
    }

    @Override // com.amplifyframework.datastore.syncengine.MutationOutbox
    public <T extends Model> Set<String> fetchPendingMutations(List<? extends T> list, String str, boolean z) throws InterruptedException {
        sq8.m48649h(list, "models");
        sq8.m48649h(str, "modelClass");
        this.semaphore.acquire();
        List<List> listM35707W = kh3.m35707W(list, 950);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (List list2 : listM35707W) {
            QueryPredicateGroup.Type type2 = QueryPredicateGroup.Type.OR;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(PendingMutation.PersistentRecord.CONTAINED_MODEL_ID.eq(((Model) it.next()).getPrimaryKeyString()));
            }
            Iterator it2 = (Iterator) qm1.m45641b(null, new C10570xab3f1a31(this, Where.matches(new QueryPredicateGroup(type2, arrayList)), null), 1, null);
            while (it2.hasNext()) {
                PendingMutation.PersistentRecord persistentRecord = (PendingMutation.PersistentRecord) it2.next();
                PendingMutation<T> pendingMutationFromRecord = this.converter.fromRecord(persistentRecord);
                sq8.m48648g(pendingMutationFromRecord, "fromRecord(...)");
                if (sq8.m48644c(pendingMutationFromRecord.getModelSchema().getModelClass().getName(), str) && z && !this.inFlightMutations.contains(pendingMutationFromRecord.getMutationId())) {
                    String containedModelId = persistentRecord.getContainedModelId();
                    sq8.m48648g(containedModelId, "getContainedModelId(...)");
                    linkedHashSet.add(containedModelId);
                }
            }
        }
        this.semaphore.release();
        return linkedHashSet;
    }

    public final PendingMutation<? extends Model> getMutationForModelId(final String str, final String str2) throws InterruptedException {
        sq8.m48649h(str, "modelId");
        sq8.m48649h(str2, "modelClass");
        final AtomicReference atomicReference = new AtomicReference();
        xk3.m56389h(new nl3() { // from class: o.u5d
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) {
                PersistentMutationOutbox.getMutationForModelId$lambda$2(this.f48371a, str, str2, atomicReference, fl3Var);
            }
        }).m56404n(new gu3() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox.getMutationForModelId.2
            @Override // p001o.gu3
            public final void accept(su5 su5Var) throws InterruptedException {
                sq8.m48649h(su5Var, "it");
                PersistentMutationOutbox.this.semaphore.acquire();
            }
        }).m56405o(new jm() { // from class: o.v5d
            @Override // p001o.jm
            public final void run() {
                PersistentMutationOutbox.getMutationForModelId$lambda$3(this.f49900a);
            }
        }).m56398d();
        return (PendingMutation) atomicReference.get();
    }

    @Override // com.amplifyframework.datastore.syncengine.MutationOutbox
    public xk3 load() {
        xk3 xk3VarM56405o = xk3.m56389h(new nl3() { // from class: o.f6d
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) {
                PersistentMutationOutbox.load$lambda$23(this.f22800a, fl3Var);
            }
        }).m56404n(new gu3() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox.load.2
            @Override // p001o.gu3
            public final void accept(su5 su5Var) throws InterruptedException {
                sq8.m48649h(su5Var, "it");
                PersistentMutationOutbox.this.semaphore.acquire();
            }
        }).m56405o(new jm() { // from class: o.g6d
            @Override // p001o.jm
            public final void run() {
                PersistentMutationOutbox.load$lambda$24(this.f24648a);
            }
        });
        sq8.m48648g(xk3VarM56405o, "doOnTerminate(...)");
        return xk3VarM56405o;
    }

    @Override // com.amplifyframework.datastore.syncengine.MutationOutbox
    public xk3 markInFlight(final TimeBasedUuid timeBasedUuid) {
        sq8.m48649h(timeBasedUuid, "pendingMutationId");
        xk3 xk3VarM56389h = xk3.m56389h(new nl3() { // from class: com.amplifyframework.datastore.syncengine.c0
            @Override // p001o.nl3
            /* renamed from: a */
            public final void mo12392a(fl3 fl3Var) throws InterruptedException {
                PersistentMutationOutbox.markInFlight$lambda$26(this.f10675a, timeBasedUuid, fl3Var);
            }
        });
        sq8.m48648g(xk3VarM56389h, "create(...)");
        return xk3VarM56389h;
    }

    @Override // com.amplifyframework.datastore.syncengine.MutationOutbox
    public PendingMutation<? extends Model> peek() throws InterruptedException {
        load().m56398d();
        return this.loadedMutation;
    }

    @Override // com.amplifyframework.datastore.syncengine.MutationOutbox
    public xk3 remove(TimeBasedUuid timeBasedUuid) {
        sq8.m48649h(timeBasedUuid, "pendingMutationId");
        xk3 xk3VarM56405o = removeNotLocking(timeBasedUuid).m56404n(new gu3() { // from class: com.amplifyframework.datastore.syncengine.PersistentMutationOutbox.remove.1
            @Override // p001o.gu3
            public final void accept(su5 su5Var) throws InterruptedException {
                sq8.m48649h(su5Var, "it");
                PersistentMutationOutbox.this.semaphore.acquire();
            }
        }).m56405o(new jm() { // from class: o.b6d
            @Override // p001o.jm
            public final void run() {
                PersistentMutationOutbox.remove$lambda$16(this.f15597a);
            }
        });
        sq8.m48648g(xk3VarM56405o, "doOnTerminate(...)");
        return xk3VarM56405o;
    }
}
