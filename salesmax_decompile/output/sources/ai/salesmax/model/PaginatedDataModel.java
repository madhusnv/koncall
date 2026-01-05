package ai.salesmax.model;

import ai.salesmax.model.PaginatedDataModel;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import p001o.hpb;
import p001o.j0f;
import p001o.n9c;
import p001o.s47;
import p001o.x6c;
import p001o.xca;

/* loaded from: classes.dex */
public class PaginatedDataModel<T> {
    private String displayTitle;
    private xca lifecycleOwner;
    private PaginatedTokenResults<?, T> paginatedTokenResults;
    private int startIndex = 0;
    private hpb changeEventsQueue = new hpb();

    public PaginatedDataModel() {
    }

    public static <R> PaginatedDataModel<R> empty() {
        return new PaginatedDataModel<>("", PaginatedTokenResults.empty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addResultsChangedListener$2(final ResultsChangedEvent resultsChangedEvent) {
        Optional.ofNullable(this.changeEventsQueue).ifPresent(new Consumer() { // from class: o.ylc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((hpb) obj).setValue(resultsChangedEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addResultsChangedListener$3(final ResultsChangedEvent resultsChangedEvent) {
        j0f.m33008i(new Runnable() { // from class: o.bmc
            @Override // java.lang.Runnable
            public final void run() {
                this.f16534a.lambda$addResultsChangedListener$2(resultsChangedEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addResultsChangedListener$4(PaginatedTokenResults paginatedTokenResults) {
        paginatedTokenResults.addResultsChangedListener(new ResultsChangeListener() { // from class: o.fmc
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public final void onResultsChanged(ResultsChangedEvent resultsChangedEvent) {
                this.f23672a.lambda$addResultsChangedListener$3(resultsChangedEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$filterNoReload$7(Predicate predicate, PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.filterNoReload(predicate);
    }

    public void addResultsChangedListener(final ResultsChangeListener<T> resultsChangeListener) {
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.wlc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).addResultsChangedListener(resultsChangeListener);
            }
        });
    }

    public void deleteItemsByPredicate(final Predicate<T> predicate) {
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.emc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).deleteItemsByPredicate(predicate);
            }
        });
    }

    public List<T> filterNoReload(final Predicate<T> predicate) {
        return (List) Optional.ofNullable(this.paginatedTokenResults).map(new Function() { // from class: o.ulc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PaginatedDataModel.lambda$filterNoReload$7(predicate, (PaginatedTokenResults) obj);
            }
        }).orElse(Collections.emptyList());
    }

    public T get(int i) {
        return this.paginatedTokenResults.lambda$getAsync$18(i);
    }

    public x6c getAsync(int i) {
        return this.paginatedTokenResults.getAsync(i);
    }

    public String getDisplayTitle() {
        return this.displayTitle;
    }

    public Boolean hasMoreItemsThanCurrent(int i) {
        boolean z = true;
        if (!this.paginatedTokenResults.hasNextPage() && i >= this.paginatedTokenResults.getSize() - 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void insertItems(final List<T> list, final int i) {
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.zlc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).insertItems(list, i);
            }
        });
    }

    public x6c isEmpty() {
        return (x6c) Optional.ofNullable(this.paginatedTokenResults).map(new Function() { // from class: o.xlc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((PaginatedTokenResults) obj).isEmpty();
            }
        }).orElse(x6c.c0(Boolean.TRUE));
    }

    public Iterator<T> iterator() {
        return this.paginatedTokenResults.iterator();
    }

    public void loadMore() {
        this.paginatedTokenResults.loadMore();
    }

    public <R> PaginatedDataModel<R> map(Function<T, R> function) {
        PaginatedTokenResults<?, R> map = this.paginatedTokenResults.mo68662clone().map(function);
        map.loadInitial();
        return new PaginatedDataModel<>(this.displayTitle, map);
    }

    public List<T> nextPage() {
        ArrayList arrayList = new ArrayList();
        if (this.paginatedTokenResults.hasNextPage()) {
            int iMin = Math.min(this.paginatedTokenResults.getSize(), this.startIndex + this.paginatedTokenResults.pageLimit());
            while (true) {
                int i = this.startIndex;
                if (i >= iMin) {
                    break;
                }
                PaginatedTokenResults<?, T> paginatedTokenResults = this.paginatedTokenResults;
                this.startIndex = i + 1;
                arrayList.add(paginatedTokenResults.lambda$getAsync$18(i));
            }
        }
        return arrayList;
    }

    public int pageStartIndex() {
        return this.paginatedTokenResults.pageStartIndex();
    }

    public void removeResultsChangedListener(final ResultsChangeListener<T> resultsChangeListener) {
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.vlc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).removeResultsChangedListener(resultsChangeListener);
            }
        });
    }

    public void removeRowAtIndex(int i) {
        this.paginatedTokenResults.removeRowAtIndex(i);
    }

    public void reset() {
        this.startIndex = 0;
        if (this.changeEventsQueue != null) {
            Optional optionalOfNullable = Optional.ofNullable(this.lifecycleOwner);
            final hpb hpbVar = this.changeEventsQueue;
            Objects.requireNonNull(hpbVar);
            optionalOfNullable.ifPresent(new Consumer() { // from class: o.cmc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    hpbVar.removeObservers((xca) obj);
                }
            });
        }
        this.changeEventsQueue = null;
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.dmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).reset();
            }
        });
        this.paginatedTokenResults = null;
        this.displayTitle = null;
        this.lifecycleOwner = null;
    }

    public PaginatedTokenResults<?, T> results() {
        return this.paginatedTokenResults;
    }

    public void setDisplayTitle(String str) {
        this.displayTitle = str;
    }

    public void setPaginatedTokenResultsUpdater(final PaginatedTokenResultsUpdater<T> paginatedTokenResultsUpdater) {
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.gmc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).setPaginatedTokenResultsUpdater(paginatedTokenResultsUpdater);
            }
        });
    }

    public int size() {
        return ((Integer) Optional.ofNullable(this.paginatedTokenResults).map(new Function() { // from class: o.amc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((PaginatedTokenResults) obj).getSize());
            }
        }).orElse(0)).intValue();
    }

    public s47 toFlowable() {
        return this.paginatedTokenResults.toFlowable();
    }

    public void updateItemByPredicate(final Predicate<T> predicate, final T t) {
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.tlc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).updateItemByPredicate(predicate, t);
            }
        });
    }

    public void updateItemByPredicateAndMoveToTop(final Predicate<T> predicate, final T t) {
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.rlc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResults) obj).updateAndInsertItemByPredicate(predicate, t);
            }
        });
    }

    public void addResultsChangedListener(xca xcaVar, final ResultsChangeListener<T> resultsChangeListener) {
        this.lifecycleOwner = xcaVar;
        hpb hpbVar = this.changeEventsQueue;
        Objects.requireNonNull(resultsChangeListener);
        hpbVar.observe(xcaVar, new n9c() { // from class: o.hmc
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                resultsChangeListener.onResultsChanged((ResultsChangedEvent) obj);
            }
        });
        Optional.ofNullable(this.paginatedTokenResults).ifPresent(new Consumer() { // from class: o.slc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f45582a.lambda$addResultsChangedListener$4((PaginatedTokenResults) obj);
            }
        });
    }

    public s47 toFlowable(int i) {
        return this.paginatedTokenResults.toFlowable(i);
    }

    public PaginatedDataModel(String str, PaginatedTokenResults<?, T> paginatedTokenResults) {
        this.displayTitle = str;
        this.paginatedTokenResults = paginatedTokenResults;
    }
}
