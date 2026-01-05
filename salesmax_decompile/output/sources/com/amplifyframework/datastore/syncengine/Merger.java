package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NoOpConsumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.appsync.ModelMetadata;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.datastore.extensions.ModelExtensionsKt;
import com.amplifyframework.datastore.storage.LocalStorageAdapter;
import com.amplifyframework.datastore.storage.StorageItemChange;
import com.amplifyframework.datastore.storage.StorageOperation;
import com.amplifyframework.datastore.syncengine.Merger;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import p001o.a0f;
import p001o.bce;
import p001o.bh3;
import p001o.cwe;
import p001o.dh3;
import p001o.h84;
import p001o.hsa;
import p001o.id5;
import p001o.jgg;
import p001o.kh3;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.n75;
import p001o.nl7;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.xk3;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class Merger {
    public static final Companion Companion = new Companion(null);
    private static final Logger LOG;
    private final LocalStorageAdapter localStorageAdapter;
    private final MutationOutbox mutationOutbox;
    private final VersionRepository versionRepository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.amplifyframework.datastore.syncengine.Merger$merge$1", m36648f = "Merger.kt", m36649l = {Opcodes.SWAP, Opcodes.I2S}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.datastore.syncengine.Merger$merge$1 */
    public static final class C105661 extends jgg implements nl7 {
        final /* synthetic */ Consumer<StorageItemChange.Type> $changeTypeConsumer;
        final /* synthetic */ List<ModelWithMetadata<T>> $modelsWithMetadata;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Merger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105661(List<ModelWithMetadata<T>> list, Merger merger, Consumer<StorageItemChange.Type> consumer, n64 n64Var) {
            super(2, n64Var);
            this.$modelsWithMetadata = list;
            this.this$0 = merger;
            this.$changeTypeConsumer = consumer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$4(Merger merger, ModelWithMetadata modelWithMetadata) {
            sq8.m48646e(modelWithMetadata);
            merger.announceSuccessfulMerge(modelWithMetadata);
            Merger.LOG.debug("Remote model update was sync'd down into local storage: " + modelWithMetadata);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$5(Consumer consumer, StorageItemChange storageItemChange) {
            consumer.accept(storageItemChange.type());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$7(Map map, Consumer consumer, StorageItemChange storageItemChange) {
            ModelWithMetadata modelWithMetadata = (ModelWithMetadata) map.get(((ModelMetadata) storageItemChange.item()).getPrimaryKeyString());
            if (modelWithMetadata != null) {
                consumer.accept(modelWithMetadata);
            }
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C105661(this.$modelsWithMetadata, this.this$0, this.$changeTypeConsumer, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws Throwable {
            List arrayList;
            Consumer consumer;
            Consumer consumer2;
            Object objFetchModelVersions;
            StorageOperation create;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                if (this.$modelsWithMetadata.isEmpty()) {
                    return y3i.f54824a;
                }
                Collection collection = this.$modelsWithMetadata;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : collection) {
                    String primaryKeyString = ((ModelWithMetadata) obj2).getModel().getPrimaryKeyString();
                    Object arrayList2 = linkedHashMap.get(primaryKeyString);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(primaryKeyString, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        Integer version = ((ModelWithMetadata) next).getSyncMetadata().getVersion();
                        if (version == null) {
                            version = ml1.m39304d(0);
                        }
                        sq8.m48646e(version);
                        Integer numM39304d = ml1.m39304d(version.intValue());
                        do {
                            Object next2 = it2.next();
                            Integer version2 = ((ModelWithMetadata) next2).getSyncMetadata().getVersion();
                            if (version2 == null) {
                                version2 = ml1.m39304d(0);
                            }
                            sq8.m48646e(version2);
                            Integer numM39304d2 = ml1.m39304d(version2.intValue());
                            if (numM39304d.compareTo(numM39304d2) < 0) {
                                next = next2;
                                numM39304d = numM39304d2;
                            }
                        } while (it2.hasNext());
                    }
                    arrayList.add((ModelWithMetadata) next);
                }
                final LinkedHashMap linkedHashMap2 = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(arrayList, 10)), 16));
                for (Object obj3 : arrayList) {
                    linkedHashMap2.put(((ModelWithMetadata) obj3).getSyncMetadata().getPrimaryKeyString(), obj3);
                }
                final Merger merger = this.this$0;
                final Consumer consumer3 = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.e
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(Object obj4) {
                        Merger.C105661.invokeSuspend$lambda$4(merger, (ModelWithMetadata) obj4);
                    }
                };
                final Consumer<StorageItemChange.Type> consumer4 = this.$changeTypeConsumer;
                consumer = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.f
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(Object obj4) {
                        Merger.C105661.invokeSuspend$lambda$5(consumer4, (StorageItemChange) obj4);
                    }
                };
                consumer2 = new Consumer() { // from class: com.amplifyframework.datastore.syncengine.g
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(Object obj4) {
                        Merger.C105661.invokeSuspend$lambda$7(linkedHashMap2, consumer3, (StorageItemChange) obj4);
                    }
                };
                VersionRepository versionRepository = this.this$0.versionRepository;
                this.L$0 = arrayList;
                this.L$1 = consumer;
                this.L$2 = consumer2;
                this.label = 1;
                objFetchModelVersions = versionRepository.fetchModelVersions(arrayList, this);
                if (objFetchModelVersions == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                consumer2 = (Consumer) this.L$2;
                Consumer consumer5 = (Consumer) this.L$1;
                arrayList = (List) this.L$0;
                wre.m54934b(obj);
                consumer = consumer5;
                objFetchModelVersions = obj;
            }
            Map map = (Map) objFetchModelVersions;
            MutationOutbox mutationOutbox = this.this$0.mutationOutbox;
            ArrayList arrayList3 = new ArrayList(dh3.m23088v(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ModelWithMetadata) it3.next()).getModel());
            }
            String name = ((ModelWithMetadata) kh3.f0(arrayList)).getModel().getClass().getName();
            sq8.m48648g(name, "getName(...)");
            Set<String> setFetchPendingMutations = mutationOutbox.fetchPendingMutations(arrayList3, name, true);
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (true) {
                ArrayList arrayList5 = null;
                if (!it4.hasNext()) {
                    break;
                }
                ModelWithMetadata modelWithMetadata = (ModelWithMetadata) it4.next();
                Integer version3 = modelWithMetadata.getSyncMetadata().getVersion();
                if (version3 == null) {
                    version3 = ml1.m39304d(-1);
                }
                sq8.m48646e(version3);
                int iIntValue = version3.intValue();
                Model model = modelWithMetadata.getModel();
                sq8.m48648g(model, "getModel(...)");
                int iIntValue2 = ((Number) map.getOrDefault(ModelExtensionsKt.getMetadataSQLitePrimaryKey(model), ml1.m39304d(-1))).intValue();
                if (iIntValue2 == -1 || iIntValue > iIntValue2) {
                    arrayList5 = new ArrayList();
                    if (setFetchPendingMutations.contains(modelWithMetadata.getModel().getPrimaryKeyString())) {
                        Merger.LOG.info("Mutation outbox has pending mutation for Model: " + modelWithMetadata.getModel().getModelName() + " with primary key: " + modelWithMetadata.getModel().resolveIdentifier() + ". Saving the metadata, but not model itself.");
                    } else {
                        if (sq8.m48644c(modelWithMetadata.getSyncMetadata().isDeleted(), ml1.m39301a(true))) {
                            Model model2 = modelWithMetadata.getModel();
                            sq8.m48648g(model2, "getModel(...)");
                            create = new StorageOperation.Delete(model2, consumer);
                        } else {
                            Model model3 = modelWithMetadata.getModel();
                            sq8.m48648g(model3, "getModel(...)");
                            create = new StorageOperation.Create(model3, consumer);
                        }
                        arrayList5.add(create);
                    }
                    ModelMetadata syncMetadata = modelWithMetadata.getSyncMetadata();
                    sq8.m48648g(syncMetadata, "getSyncMetadata(...)");
                    arrayList5.add(new StorageOperation.Create(syncMetadata, consumer2));
                }
                if (arrayList5 != null) {
                    arrayList4.add(arrayList5);
                }
            }
            List listM23090x = dh3.m23090x(arrayList4);
            Merger merger2 = this.this$0;
            this.L$0 = listM23090x;
            this.L$1 = merger2;
            this.L$2 = null;
            this.label = 2;
            final a0f a0fVar = new a0f(tq8.m50336c(this));
            merger2.localStorageAdapter.batchSyncOperations(listM23090x, new Action() { // from class: com.amplifyframework.datastore.syncengine.Merger$merge$1$1$1
                @Override // com.amplifyframework.core.Action
                public final void call() {
                    n64 n64Var = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var.resumeWith(vre.m53351b(y3i.f54824a));
                }
            }, new Consumer() { // from class: com.amplifyframework.datastore.syncengine.Merger$merge$1$1$2
                @Override // com.amplifyframework.core.Consumer
                public final void accept(DataStoreException dataStoreException) {
                    sq8.m48649h(dataStoreException, "it");
                    n64 n64Var = a0fVar;
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var.resumeWith(vre.m53351b(wre.m54933a(dataStoreException)));
                }
            });
            Object objM16313b = a0fVar.m16313b();
            if (objM16313b == uq8.m51918f()) {
                n75.m40201c(this);
            }
            if (objM16313b == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C105661) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    static {
        Logger logger = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
        sq8.m48648g(logger, "logger(...)");
        LOG = logger;
    }

    public Merger(MutationOutbox mutationOutbox, VersionRepository versionRepository, LocalStorageAdapter localStorageAdapter) {
        sq8.m48649h(mutationOutbox, "mutationOutbox");
        sq8.m48649h(versionRepository, "versionRepository");
        sq8.m48649h(localStorageAdapter, "localStorageAdapter");
        this.mutationOutbox = mutationOutbox;
        this.versionRepository = versionRepository;
        this.localStorageAdapter = localStorageAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends Model> void announceSuccessfulMerge(ModelWithMetadata<T> modelWithMetadata) {
        Amplify.Hub.publish(HubChannel.DATASTORE, HubEvent.create(DataStoreChannelEventName.SUBSCRIPTION_DATA_PROCESSED, modelWithMetadata));
    }

    public final <T extends Model> xk3 merge(ModelWithMetadata<T> modelWithMetadata) {
        sq8.m48649h(modelWithMetadata, "modelWithMetadata");
        List<ModelWithMetadata<T>> listM18963e = bh3.m18963e(modelWithMetadata);
        NoOpConsumer noOpConsumerCreate = NoOpConsumer.create();
        sq8.m48648g(noOpConsumerCreate, "create(...)");
        return merge(listM18963e, noOpConsumerCreate);
    }

    public final <T extends Model> xk3 merge(List<ModelWithMetadata<T>> list, Consumer<StorageItemChange.Type> consumer) {
        sq8.m48649h(list, "modelsWithMetadata");
        sq8.m48649h(consumer, "changeTypeConsumer");
        return cwe.m21894c(null, new C105661(list, this, consumer, null), 1, null);
    }
}
