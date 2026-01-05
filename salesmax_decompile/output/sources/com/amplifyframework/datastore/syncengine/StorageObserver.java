package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.storage.LocalStorageAdapter;
import com.amplifyframework.datastore.storage.StorageItemChange;
import com.amplifyframework.datastore.syncengine.PendingMutation;
import com.amplifyframework.logging.Logger;
import java.util.Objects;
import p001o.ggd;
import p001o.gu3;
import p001o.i5f;
import p001o.jm;
import p001o.k6g;
import p001o.ko3;
import p001o.m8c;
import p001o.q7c;
import p001o.rl7;
import p001o.su5;
import p001o.x6c;

/* loaded from: classes5.dex */
final class StorageObserver {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final LocalStorageAdapter localStorageAdapter;
    private final MutationOutbox mutationOutbox;
    private final ko3 ongoingOperationsDisposable;

    /* renamed from: com.amplifyframework.datastore.syncengine.StorageObserver$1 */
    public static /* synthetic */ class C105771 {

        /* renamed from: $SwitchMap$com$amplifyframework$datastore$storage$StorageItemChange$Type */
        static final /* synthetic */ int[] f10657x4d065f6d;

        static {
            int[] iArr = new int[StorageItemChange.Type.values().length];
            f10657x4d065f6d = iArr;
            try {
                iArr[StorageItemChange.Type.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10657x4d065f6d[StorageItemChange.Type.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10657x4d065f6d[StorageItemChange.Type.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public StorageObserver(LocalStorageAdapter localStorageAdapter, MutationOutbox mutationOutbox) {
        Objects.requireNonNull(localStorageAdapter);
        this.localStorageAdapter = localStorageAdapter;
        Objects.requireNonNull(mutationOutbox);
        this.mutationOutbox = mutationOutbox;
        this.ongoingOperationsDisposable = new ko3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startObservingStorageChanges$0(Action action, final q7c q7cVar) {
        LocalStorageAdapter localStorageAdapter = this.localStorageAdapter;
        Objects.requireNonNull(q7cVar);
        localStorageAdapter.observe(new Consumer() { // from class: o.m6g
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                q7cVar.mo16430e((StorageItemChange) obj);
            }
        }, new Consumer() { // from class: o.n6g
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                q7cVar.onError((DataStoreException) obj);
            }
        }, new k6g(q7cVar));
        action.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startObservingStorageChanges$1(su5 su5Var) {
        LOG.info("Now observing local storage. Local changes will be enqueued to mutation outbox.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$startObservingStorageChanges$2(StorageItemChange storageItemChange) {
        return Model.Type.USER.equals(storageItemChange.modelSchema().getModelType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$startObservingStorageChanges$3(StorageItemChange storageItemChange) {
        return !StorageItemChange.Initiator.SYNC_ENGINE.equals(storageItemChange.initiator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startObservingStorageChanges$4() {
        LOG.warn("Storage adapter subscription terminated with completion.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startObservingStorageChanges$5(Throwable th) {
        LOG.warn("Storage adapter subscription ended in error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PendingMutation<SerializedModel> toPendingMutation(StorageItemChange<? extends Model> storageItemChange) {
        int i = C105771.f10657x4d065f6d[storageItemChange.type().ordinal()];
        if (i == 1) {
            return PendingMutation.creation(storageItemChange.patchItem(), storageItemChange.modelSchema());
        }
        if (i == 2) {
            return PendingMutation.update(storageItemChange.patchItem(), storageItemChange.modelSchema(), storageItemChange.predicate());
        }
        if (i == 3) {
            return PendingMutation.deletion(storageItemChange.patchItem(), storageItemChange.modelSchema(), storageItemChange.predicate());
        }
        throw new IllegalStateException("Unknown mutation type = " + storageItemChange.type());
    }

    public void startObservingStorageChanges(final Action action) {
        ko3 ko3Var = this.ongoingOperationsDisposable;
        x6c x6cVarD0 = x6c.m55706q(new m8c() { // from class: com.amplifyframework.datastore.syncengine.i0
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                this.f10721a.lambda$startObservingStorageChanges$0(action, q7cVar);
            }
        }).y0(i5f.m31601e()).h0(i5f.m31601e()).m55711D(new gu3() { // from class: com.amplifyframework.datastore.syncengine.j0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                StorageObserver.lambda$startObservingStorageChanges$1((su5) obj);
            }
        }).m55714J(new ggd() { // from class: com.amplifyframework.datastore.syncengine.k0
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return StorageObserver.lambda$startObservingStorageChanges$2((StorageItemChange) obj);
            }
        }).m55714J(new ggd() { // from class: com.amplifyframework.datastore.syncengine.l0
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return StorageObserver.lambda$startObservingStorageChanges$3((StorageItemChange) obj);
            }
        }).d0(new rl7() { // from class: com.amplifyframework.datastore.syncengine.m0
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f10747a.toPendingMutation((StorageItemChange) obj);
            }
        });
        final MutationOutbox mutationOutbox = this.mutationOutbox;
        Objects.requireNonNull(mutationOutbox);
        ko3Var.mo30304a(x6cVarD0.m55721Q(new rl7() { // from class: o.l6g
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return mutationOutbox.enqueue((PendingMutation) obj);
            }
        }).m56409w(new jm() { // from class: com.amplifyframework.datastore.syncengine.n0
            @Override // p001o.jm
            public final void run() {
                StorageObserver.lambda$startObservingStorageChanges$4();
            }
        }, new gu3() { // from class: com.amplifyframework.datastore.syncengine.o0
            @Override // p001o.gu3
            public final void accept(Object obj) {
                StorageObserver.lambda$startObservingStorageChanges$5((Throwable) obj);
            }
        }));
    }

    public void stopObservingStorageChanges() {
        this.ongoingOperationsDisposable.m35969e();
    }
}
