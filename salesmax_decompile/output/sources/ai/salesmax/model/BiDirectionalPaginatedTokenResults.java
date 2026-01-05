package ai.salesmax.model;

import ai.salesmax.model.BiDirectionalPaginatedTokenResults;
import ai.salesmax.model.event.ResultsChangeListener;
import ai.salesmax.model.event.ResultsChangedEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.fh1;
import p001o.gu3;
import p001o.ih1;
import p001o.pif;
import p001o.s47;
import p001o.x6c;

/* loaded from: classes.dex */
public class BiDirectionalPaginatedTokenResults<T> extends PaginatedTokenResults<Object, T> {
    private int centerIndex;
    private pif isEmpty;
    private PaginatedTokenResults<?, T> left;
    private PaginatedTokenResults<?, T> right;
    private List<T> allItems = new ArrayList();
    private List<T> leftAllItems = new ArrayList();
    private List<T> rightAllItems = new ArrayList();
    private List<ResultsChangeListener<T>> listeners = new ArrayList();
    private ResultsChangeListener<T> leftResultChangedListener = leftResultChangedListener();
    private ResultsChangeListener<T> rightResultChangedListener = rightResultChangedListener();

    /* renamed from: ai.salesmax.model.BiDirectionalPaginatedTokenResults$3 */
    public static /* synthetic */ class C00983 {

        /* renamed from: $SwitchMap$ai$salesmax$model$event$ResultsChangedEvent$ResultsChangedEventType */
        static final /* synthetic */ int[] f334xc6ffdb9;

        static {
            int[] iArr = new int[ResultsChangedEvent.ResultsChangedEventType.values().length];
            f334xc6ffdb9 = iArr;
            try {
                iArr[ResultsChangedEvent.ResultsChangedEventType.DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f334xc6ffdb9[ResultsChangedEvent.ResultsChangedEventType.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f334xc6ffdb9[ResultsChangedEvent.ResultsChangedEventType.INSERTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BiDirectionalPaginatedTokenResults(PaginatedTokenResults<?, T> paginatedTokenResults, PaginatedTokenResults<?, T> paginatedTokenResults2) {
        this.left = paginatedTokenResults;
        this.right = paginatedTokenResults2;
        this.left.loadInitial();
        this.right.loadInitial();
        this.isEmpty = pif.m43749s();
        x6c.e0(Arrays.asList(this.left.isEmpty(), this.right.isEmpty())).m55733m(new ArrayList(), new fh1()).m55023t(new gu3() { // from class: o.gh1
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f25151a.lambda$new$0((ArrayList) obj);
            }
        });
        this.left.addResultsChangedListener(this.leftResultChangedListener);
        this.right.addResultsChangedListener(this.rightResultChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$map$1(Function function, List list) {
        Stream stream = list.stream();
        Objects.requireNonNull(function);
        return (List) stream.map(new ih1(function)).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ArrayList arrayList) {
        pif pifVar = this.isEmpty;
        boolean z = false;
        if (((Boolean) arrayList.get(0)).booleanValue() && ((Boolean) arrayList.get(1)).booleanValue()) {
            z = true;
        }
        pifVar.mo43750r(Boolean.valueOf(z));
    }

    private ResultsChangeListener<T> leftResultChangedListener() {
        return new ResultsChangeListener<T>() { // from class: ai.salesmax.model.BiDirectionalPaginatedTokenResults.1
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void fireDeletedEvent(List<T> list, int i) {
                BiDirectionalPaginatedTokenResults.this.refreshLeft();
                Iterator it = BiDirectionalPaginatedTokenResults.this.listeners.iterator();
                while (it.hasNext()) {
                    ((ResultsChangeListener) it.next()).fireDeletedEvent(list, i);
                }
            }

            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void fireInsertedEvent(List<T> list, int i) {
                BiDirectionalPaginatedTokenResults.this.refreshLeft();
                Iterator it = BiDirectionalPaginatedTokenResults.this.listeners.iterator();
                while (it.hasNext()) {
                    ((ResultsChangeListener) it.next()).fireInsertedEvent(list, i);
                }
            }

            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void fireUpdatedEvent(List<T> list, int i) {
                BiDirectionalPaginatedTokenResults.this.refreshLeft();
                Iterator it = BiDirectionalPaginatedTokenResults.this.listeners.iterator();
                while (it.hasNext()) {
                    ((ResultsChangeListener) it.next()).fireUpdatedEvent(list, i);
                }
            }

            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void onResultsChanged(ResultsChangedEvent<T> resultsChangedEvent) {
                int i = C00983.f334xc6ffdb9[resultsChangedEvent.eventType().ordinal()];
                if (i == 1) {
                    fireDeletedEvent(resultsChangedEvent.itemsChanged(), BiDirectionalPaginatedTokenResults.this.rightAllItems.size() + resultsChangedEvent.start());
                } else if (i == 2) {
                    fireUpdatedEvent(resultsChangedEvent.itemsChanged(), BiDirectionalPaginatedTokenResults.this.rightAllItems.size() + resultsChangedEvent.start());
                } else {
                    if (i != 3) {
                        return;
                    }
                    fireInsertedEvent(resultsChangedEvent.itemsChanged(), BiDirectionalPaginatedTokenResults.this.rightAllItems.size() + resultsChangedEvent.start());
                }
            }
        };
    }

    private synchronized void refreshAllItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.rightAllItems);
        arrayList.addAll(this.leftAllItems);
        this.allItems = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void refreshLeft() {
        this.leftAllItems = new ArrayList(this.left.getAllItems());
        this.centerIndex = this.rightAllItems.size() == 0 ? 0 : this.rightAllItems.size();
        refreshAllItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void refreshRight() {
        ArrayList arrayList = new ArrayList(this.right.getAllItems());
        Collections.reverse(arrayList);
        this.rightAllItems = arrayList;
        this.centerIndex = arrayList.size() == 0 ? 0 : arrayList.size();
        refreshAllItems();
    }

    private ResultsChangeListener<T> rightResultChangedListener() {
        return new ResultsChangeListener<T>() { // from class: ai.salesmax.model.BiDirectionalPaginatedTokenResults.2
            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void fireDeletedEvent(List<T> list, int i) {
                BiDirectionalPaginatedTokenResults.this.refreshRight();
                Iterator it = BiDirectionalPaginatedTokenResults.this.listeners.iterator();
                while (it.hasNext()) {
                    ((ResultsChangeListener) it.next()).fireDeletedEvent(list, i);
                }
            }

            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void fireInsertedEvent(List<T> list, int i) {
                BiDirectionalPaginatedTokenResults.this.refreshRight();
                Iterator it = BiDirectionalPaginatedTokenResults.this.listeners.iterator();
                while (it.hasNext()) {
                    ((ResultsChangeListener) it.next()).fireInsertedEvent(list, i);
                }
            }

            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void fireUpdatedEvent(List<T> list, int i) {
                BiDirectionalPaginatedTokenResults.this.refreshRight();
                Iterator it = BiDirectionalPaginatedTokenResults.this.listeners.iterator();
                while (it.hasNext()) {
                    ((ResultsChangeListener) it.next()).fireUpdatedEvent(list, i);
                }
            }

            @Override // ai.salesmax.model.event.ResultsChangeListener
            public void onResultsChanged(ResultsChangedEvent<T> resultsChangedEvent) {
                int i = C00983.f334xc6ffdb9[resultsChangedEvent.eventType().ordinal()];
                if (i == 1) {
                    ArrayList arrayList = new ArrayList(resultsChangedEvent.itemsChanged());
                    Collections.reverse(arrayList);
                    fireDeletedEvent(arrayList, BiDirectionalPaginatedTokenResults.this.rightAllItems.size() - resultsChangedEvent.start());
                } else if (i == 2) {
                    ArrayList arrayList2 = new ArrayList(resultsChangedEvent.itemsChanged());
                    Collections.reverse(arrayList2);
                    fireUpdatedEvent(arrayList2, BiDirectionalPaginatedTokenResults.this.rightAllItems.size() - resultsChangedEvent.start());
                } else {
                    if (i != 3) {
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList(resultsChangedEvent.itemsChanged());
                    Collections.reverse(arrayList3);
                    fireInsertedEvent(arrayList3, BiDirectionalPaginatedTokenResults.this.rightAllItems.size() - resultsChangedEvent.start());
                }
            }
        };
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public void addResultsChangedListener(ResultsChangeListener<T> resultsChangeListener) {
        ArrayList arrayList = new ArrayList(this.allItems);
        this.listeners.add(resultsChangeListener);
        if (arrayList.size() > 0) {
            resultsChangeListener.fireInsertedEvent(arrayList, 0);
        } else if (this.isEmpty.isDone()) {
            try {
                if (((Boolean) this.isEmpty.get()).booleanValue()) {
                    resultsChangeListener.fireInsertedEvent(arrayList, 0);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public <R> PaginatedTokenResults<Object, R> batchMap(Function<List<T>, List<R>> function) {
        return new BiDirectionalPaginatedTokenResults(this.left.mo68662clone().batchMap(function), this.right.mo68662clone().batchMap(function));
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public void deleteItemsByPredicate(Predicate<T> predicate) {
        this.left.deleteItemsByPredicate(predicate);
        this.right.deleteItemsByPredicate(predicate);
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public List<T> filterNoReload(Predicate<T> predicate) {
        return (List) this.allItems.stream().filter(predicate).collect(Collectors.toList());
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    /* renamed from: get */
    public synchronized T lambda$getAsync$18(int i) {
        return i < this.rightAllItems.size() ? this.right.lambda$getAsync$18((this.rightAllItems.size() - 1) - i) : this.left.lambda$getAsync$18(i - this.rightAllItems.size());
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public List<T> getAllItems() {
        return this.allItems;
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public int getSize() {
        return this.allItems.size();
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public boolean hasNextPage() {
        return this.right.hasNextPage();
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public void insertItems(List<T> list, int i) {
        if (i >= this.right.getSize()) {
            this.left.insertItems(list, i - this.right.getSize());
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        PaginatedTokenResults<?, T> paginatedTokenResults = this.right;
        paginatedTokenResults.insertItems(arrayList, paginatedTokenResults.getSize() - i);
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public x6c isEmpty() {
        return x6c.m55698V(this.isEmpty);
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public Iterator<T> iterator() {
        return this.right.iterator();
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public void loadInitial() {
        loadMore();
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public synchronized void loadMore() {
        this.left.loadMore();
        this.right.loadMore();
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public <R> PaginatedTokenResults<Object, R> map(final Function<T, R> function) {
        return batchMap(new Function() { // from class: o.hh1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BiDirectionalPaginatedTokenResults.lambda$map$1(function, (List) obj);
            }
        });
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public int pageLimit() {
        return Math.max(this.left.pageLimit(), this.right.pageLimit());
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public int pageStartIndex() {
        return this.centerIndex;
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public void removeResultsChangedListener(ResultsChangeListener<T> resultsChangeListener) {
        this.listeners.remove(resultsChangeListener);
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public void reset() {
        this.left.reset();
        this.right.reset();
        this.listeners.clear();
        this.allItems.clear();
        this.leftAllItems.clear();
        this.rightAllItems.clear();
        this.leftResultChangedListener = null;
        this.rightResultChangedListener = null;
        this.listeners = new ArrayList();
        this.allItems = new ArrayList();
        this.leftAllItems = new ArrayList();
        this.rightAllItems = new ArrayList();
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public s47 toFlowable() {
        return toFlowable(Math.max(this.left.pageLimit(), this.right.pageLimit()));
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public void updateItemByPredicate(Predicate<T> predicate, T t) {
        this.left.updateItemByPredicate(predicate, t);
        this.right.updateItemByPredicate(predicate, t);
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    /* renamed from: clone */
    public PaginatedTokenResults<Object, T> mo68662clone() {
        return new BiDirectionalPaginatedTokenResults(this.left.mo68662clone(), this.right.mo68662clone());
    }

    @Override // ai.salesmax.model.PaginatedTokenResults
    public s47 toFlowable(int i) {
        return s47.m47677p(this.left.mo68662clone().toFlowable(i), this.right.mo68662clone().toFlowable(i));
    }
}
