package com.amplifyframework.rx;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NoOpAction;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.query.ObserveQueryOptions;
import com.amplifyframework.core.model.query.QueryOptions;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.datastore.DataStoreCategory;
import com.amplifyframework.datastore.DataStoreCategoryBehavior;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.DataStoreItemChange;
import com.amplifyframework.rx.RxAdapters;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p001o.dwe;
import p001o.m8c;
import p001o.q7c;
import p001o.rl7;
import p001o.x6c;
import p001o.x8c;
import p001o.xk3;

/* loaded from: classes5.dex */
final class RxDataStoreBinding implements RxDataStoreCategoryBehavior {
    private final DataStoreCategoryBehavior dataStore;

    public RxDataStoreBinding() {
        this(Amplify.DataStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$delete$2(Model model, Consumer consumer, Consumer consumer2) {
        this.dataStore.delete(model, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$delete$3(Model model, QueryPredicate queryPredicate, Consumer consumer, Consumer consumer2) {
        this.dataStore.delete((DataStoreCategoryBehavior) model, queryPredicate, (Consumer<DataStoreItemChange<DataStoreCategoryBehavior>>) consumer, (Consumer<DataStoreException>) consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$delete$4(Class cls, QueryPredicate queryPredicate, Consumer consumer, Consumer consumer2) {
        this.dataStore.delete(cls, queryPredicate, NoOpAction.create(), (Consumer<DataStoreException>) consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observe$10(Class cls, QueryPredicate queryPredicate, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
        this.dataStore.observe(cls, queryPredicate, (Consumer<Cancelable>) consumer, consumer2, (Consumer<DataStoreException>) consumer3, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observe$8(Class cls, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
        this.dataStore.observe(cls, consumer, consumer2, consumer3, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$observe$9(Class cls, String str, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
        this.dataStore.observe(cls, str, (Consumer<Cancelable>) consumer, consumer2, (Consumer<DataStoreException>) consumer3, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$observeQuery$11(AtomicReference atomicReference) {
        Cancelable cancelable = (Cancelable) atomicReference.get();
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Cancelable lambda$observeQuery$12(Class cls, ObserveQueryOptions observeQueryOptions, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
        final AtomicReference atomicReference = new AtomicReference();
        this.dataStore.observeQuery(cls, observeQueryOptions, new dwe(atomicReference), consumer2, consumer3, action);
        return new Cancelable() { // from class: com.amplifyframework.rx.c2
            @Override // com.amplifyframework.core.async.Cancelable
            public final void cancel() {
                RxDataStoreBinding.lambda$observeQuery$11(atomicReference);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$query$5(Class cls, Consumer consumer, Consumer consumer2) {
        this.dataStore.query(cls, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$query$6(Class cls, QueryPredicate queryPredicate, Consumer consumer, Consumer consumer2) {
        this.dataStore.query(cls, queryPredicate, consumer, (Consumer<DataStoreException>) consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$query$7(Class cls, QueryOptions queryOptions, Consumer consumer, Consumer consumer2) {
        this.dataStore.query(cls, queryOptions, consumer, (Consumer<DataStoreException>) consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$save$0(Model model, Consumer consumer, Consumer consumer2) {
        this.dataStore.save(model, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$save$1(Model model, QueryPredicate queryPredicate, Consumer consumer, Consumer consumer2) {
        this.dataStore.save(model, queryPredicate, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toCompletable$18(RxAdapters.VoidBehaviors.ResultEmitter resultEmitter, final Action action, Consumer consumer) {
        resultEmitter.emitTo(new Consumer() { // from class: com.amplifyframework.rx.v1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                action.call();
            }
        }, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toObservable$13(Iterator it, q7c q7cVar) {
        while (it.hasNext()) {
            q7cVar.mo16430e((Model) it.next());
        }
        q7cVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x8c lambda$toObservable$14(final Iterator it) {
        return x6c.m55706q(new m8c() { // from class: com.amplifyframework.rx.t1
            @Override // p001o.m8c
            /* renamed from: a */
            public final void mo12393a(q7c q7cVar) {
                RxDataStoreBinding.lambda$toObservable$13(it, q7cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toObservable$15(AtomicReference atomicReference) {
        Cancelable cancelable = (Cancelable) atomicReference.get();
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Cancelable lambda$toObservable$16(RxAdapters.VoidBehaviors.StreamEmitter streamEmitter, Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
        final AtomicReference atomicReference = new AtomicReference();
        streamEmitter.streamTo(new dwe(atomicReference), consumer2, consumer3, action);
        return new Cancelable() { // from class: com.amplifyframework.rx.y1
            @Override // com.amplifyframework.core.async.Cancelable
            public final void cancel() {
                RxDataStoreBinding.lambda$toObservable$15(atomicReference);
            }
        };
    }

    private static <T extends Model> xk3 toCompletable(final RxAdapters.VoidBehaviors.ResultEmitter<DataStoreItemChange<T>, DataStoreException> resultEmitter) {
        return RxAdapters.VoidBehaviors.toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.i2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                RxDataStoreBinding.lambda$toCompletable$18(resultEmitter, action, consumer);
            }
        });
    }

    private static <T extends Model> x6c toObservable(RxAdapters.VoidBehaviors.ResultEmitter<Iterator<T>, DataStoreException> resultEmitter) {
        return RxAdapters.VoidBehaviors.toSingle(resultEmitter).m55017l(new rl7() { // from class: com.amplifyframework.rx.o2
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return RxDataStoreBinding.lambda$toObservable$14((Iterator) obj);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public xk3 clear() {
        final DataStoreCategoryBehavior dataStoreCategoryBehavior = this.dataStore;
        Objects.requireNonNull(dataStoreCategoryBehavior);
        return RxAdapters.VoidBehaviors.toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.n2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                dataStoreCategoryBehavior.clear(action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> xk3 delete(final T t) {
        return toCompletable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.l2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10966a.lambda$delete$2(t, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public x6c observe() {
        final DataStoreCategoryBehavior dataStoreCategoryBehavior = this.dataStore;
        Objects.requireNonNull(dataStoreCategoryBehavior);
        return toObservable(new RxAdapters.VoidBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.z1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.StreamEmitter
            public final void streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                dataStoreCategoryBehavior.observe(consumer, consumer2, consumer3, action);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> x6c observeQuery(final Class<T> cls, final ObserveQueryOptions observeQueryOptions) {
        return RxAdapters.CancelableBehaviors.toObservable(new RxAdapters.CancelableBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.u1
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.StreamEmitter
            public final Cancelable streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                return this.f11061a.lambda$observeQuery$12(cls, observeQueryOptions, consumer, consumer2, consumer3, action);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> x6c query(final Class<T> cls) {
        return toObservable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.s1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11042a.lambda$query$5(cls, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> xk3 save(final T t) {
        return toCompletable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.b2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10820a.lambda$save$0(t, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public xk3 start() {
        final DataStoreCategoryBehavior dataStoreCategoryBehavior = this.dataStore;
        Objects.requireNonNull(dataStoreCategoryBehavior);
        return RxAdapters.VoidBehaviors.toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.k2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                dataStoreCategoryBehavior.start(action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public xk3 stop() {
        final DataStoreCategoryBehavior dataStoreCategoryBehavior = this.dataStore;
        Objects.requireNonNull(dataStoreCategoryBehavior);
        return RxAdapters.VoidBehaviors.toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.f2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                dataStoreCategoryBehavior.stop(action, consumer);
            }
        });
    }

    public RxDataStoreBinding(DataStoreCategory dataStoreCategory) {
        this.dataStore = dataStoreCategory;
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> xk3 delete(final T t, final QueryPredicate queryPredicate) {
        return toCompletable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.g2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10886a.lambda$delete$3(t, queryPredicate, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> x6c observe(final Class<T> cls) {
        return toObservable(new RxAdapters.VoidBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.e2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.StreamEmitter
            public final void streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                this.f10859a.lambda$observe$8(cls, consumer, consumer2, consumer3, action);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> x6c query(final Class<T> cls, final QueryPredicate queryPredicate) {
        return toObservable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.x1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11098a.lambda$query$6(cls, queryPredicate, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> xk3 save(final T t, final QueryPredicate queryPredicate) {
        return toCompletable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.j2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10935a.lambda$save$1(t, queryPredicate, consumer, consumer2);
            }
        });
    }

    private static <T> x6c toObservable(final RxAdapters.VoidBehaviors.StreamEmitter<Cancelable, T, DataStoreException> streamEmitter) {
        return RxAdapters.CancelableBehaviors.toObservable(new RxAdapters.CancelableBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.a2
            @Override // com.amplifyframework.rx.RxAdapters.CancelableBehaviors.StreamEmitter
            public final Cancelable streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                return RxDataStoreBinding.lambda$toObservable$16(streamEmitter, consumer, consumer2, consumer3, action);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> xk3 delete(final Class<T> cls, final QueryPredicate queryPredicate) {
        return toCompletable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.m2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10982a.lambda$delete$4(cls, queryPredicate, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> x6c observe(final Class<T> cls, final String str) {
        return toObservable(new RxAdapters.VoidBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.h2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.StreamEmitter
            public final void streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                this.f10900a.lambda$observe$9(cls, str, consumer, consumer2, consumer3, action);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> x6c query(final Class<T> cls, final QueryOptions queryOptions) {
        return toObservable(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.d2
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10841a.lambda$query$7(cls, queryOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxDataStoreCategoryBehavior
    public <T extends Model> x6c observe(final Class<T> cls, final QueryPredicate queryPredicate) {
        return toObservable(new RxAdapters.VoidBehaviors.StreamEmitter() { // from class: com.amplifyframework.rx.w1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.StreamEmitter
            public final void streamTo(Consumer consumer, Consumer consumer2, Consumer consumer3, Action action) {
                this.f11085a.lambda$observe$10(cls, queryPredicate, consumer, consumer2, consumer3, action);
            }
        });
    }
}
