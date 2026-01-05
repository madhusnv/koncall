package ai.salesmax.model;

import ai.salesmax.model.PaginatedTokenResultsUpdater;
import java.util.Optional;
import java.util.function.Predicate;
import p001o.dpd;
import p001o.ggd;
import p001o.gu3;
import p001o.jh1;
import p001o.jm;
import p001o.rl7;
import p001o.su5;
import p001o.x6c;

/* loaded from: classes.dex */
public class PaginatedTokenResultsUpdater<T> {
    private Boolean allowDelete;
    private Boolean allowUpdate;
    private ggd consumeUpdateAsDeleteByPredicate;
    private x6c deleteObservable;
    private su5 deleteSubscription;
    private ggd filter;
    private jh1 matchItemsOnSubscriptionWithPaginatedTokenResultsByPredicate;
    private x6c updateObservable;
    private su5 updateSubscription;

    public PaginatedTokenResultsUpdater(x6c x6cVar, x6c x6cVar2, ggd ggdVar, jh1 jh1Var, ggd ggdVar2, Boolean bool, Boolean bool2) {
        this.updateObservable = x6cVar;
        this.deleteObservable = x6cVar2;
        this.filter = ggdVar;
        this.matchItemsOnSubscriptionWithPaginatedTokenResultsByPredicate = jh1Var;
        this.consumeUpdateAsDeleteByPredicate = ggdVar2;
        this.allowDelete = bool;
        this.allowUpdate = bool2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$beginSubscription$0(Object obj, Object obj2) {
        try {
            return ((Boolean) this.matchItemsOnSubscriptionWithPaginatedTokenResultsByPredicate.apply(obj2, obj)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$beginSubscription$1(Object obj, Object obj2) {
        try {
            return ((Boolean) this.matchItemsOnSubscriptionWithPaginatedTokenResultsByPredicate.apply(obj2, obj)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$beginSubscription$2(PaginatedTokenResults paginatedTokenResults, final Object obj) {
        if (this.consumeUpdateAsDeleteByPredicate.test(obj)) {
            if (this.allowDelete.booleanValue()) {
                paginatedTokenResults.deleteItemsByPredicate(new Predicate() { // from class: o.ksc
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return this.f32664a.lambda$beginSubscription$0(obj, obj2);
                    }
                });
            }
        } else if (this.allowUpdate.booleanValue()) {
            paginatedTokenResults.updateItemByPredicate(new Predicate() { // from class: o.lsc
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return this.f34340a.lambda$beginSubscription$1(obj, obj2);
                }
            }, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$beginSubscription$3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$beginSubscription$4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$beginSubscription$5(Object obj, Object obj2) {
        try {
            return ((Boolean) this.matchItemsOnSubscriptionWithPaginatedTokenResultsByPredicate.apply(obj2, obj)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$beginSubscription$6(PaginatedTokenResults paginatedTokenResults, final Object obj) {
        paginatedTokenResults.deleteItemsByPredicate(new Predicate() { // from class: o.dsc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return this.f20478a.lambda$beginSubscription$5(obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$beginSubscription$7(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$beginSubscription$8() {
    }

    public void beginSubscription(final PaginatedTokenResults<?, T> paginatedTokenResults) {
        this.updateSubscription = this.updateObservable.m55714J(this.filter).w0(new gu3() { // from class: o.esc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f22113a.lambda$beginSubscription$2(paginatedTokenResults, obj);
            }
        }, new gu3() { // from class: o.fsc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f24037a.lambda$beginSubscription$3((Throwable) obj);
            }
        }, new jm() { // from class: o.gsc
            @Override // p001o.jm
            public final void run() {
                PaginatedTokenResultsUpdater.lambda$beginSubscription$4();
            }
        });
        this.deleteSubscription = this.deleteObservable.m55714J(this.filter).w0(new gu3() { // from class: o.hsc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f27436a.lambda$beginSubscription$6(paginatedTokenResults, obj);
            }
        }, new gu3() { // from class: o.isc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f29197a.lambda$beginSubscription$7((Throwable) obj);
            }
        }, new jm() { // from class: o.jsc
            @Override // p001o.jm
            public final void run() {
                PaginatedTokenResultsUpdater.lambda$beginSubscription$8();
            }
        });
    }

    public void destroy() {
        stopSubscription();
        this.updateObservable = null;
        this.deleteObservable = null;
        this.updateSubscription = null;
        this.deleteSubscription = null;
        this.filter = null;
        this.matchItemsOnSubscriptionWithPaginatedTokenResultsByPredicate = null;
        this.consumeUpdateAsDeleteByPredicate = null;
    }

    public <S> PaginatedTokenResultsUpdater<S> map(rl7 rl7Var, ggd ggdVar, jh1 jh1Var, ggd ggdVar2) {
        return new PaginatedTokenResultsUpdater<>(this.updateObservable.d0(rl7Var), this.deleteObservable.d0(rl7Var), ggdVar, jh1Var, ggdVar2, this.allowDelete, this.allowUpdate);
    }

    public void stopSubscription() {
        Optional.ofNullable(this.updateSubscription).ifPresent(new dpd());
        Optional.ofNullable(this.deleteSubscription).ifPresent(new dpd());
    }
}
