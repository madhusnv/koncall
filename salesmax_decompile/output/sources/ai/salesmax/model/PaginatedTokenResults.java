package ai.salesmax.model;

import ai.salesmax.model.Page;
import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PaginatedTokenResultsUpdater;
import ai.salesmax.model.event.ResultsChangeListener;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.SimpleGraphQLRequest;
import com.amplifyframework.datastore.generated.model.AccountMembership;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Subscription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p001o.ayh;
import p001o.bsc;
import p001o.c5f;
import p001o.ch9;
import p001o.dpd;
import p001o.g57;
import p001o.grc;
import p001o.gu3;
import p001o.i5f;
import p001o.ih1;
import p001o.ja8;
import p001o.jm;
import p001o.mrc;
import p001o.o83;
import p001o.pif;
import p001o.pl7;
import p001o.rl7;
import p001o.ryh;
import p001o.s47;
import p001o.src;
import p001o.su5;
import p001o.uyh;
import p001o.wtf;
import p001o.x6c;

/* loaded from: classes.dex */
public class PaginatedTokenResults<Q, T> {
    private int DATA_WAIT_TIME_IN_SECONDS;
    private int SCALE_INITIAL_LOAD;
    private List<T> allItems;
    private List<T> bottomLiveData;
    private Page<T> currentPage;
    private c5f executor;
    private int expectedSize;
    pif isEmpty;
    public pif isLoadingComplete;
    private List<ResultsChangeListener<T>> listeners;
    private x6c liveDataObservable;
    private su5 liveDataSubscription;
    private int pageSizeLimit;
    private PaginatedTokenResultsUpdater<T> paginatedTokenResultsUpdater;
    private su5 paginatedTokenResultsUpdaterSubscription;
    private Q queryInput;
    private boolean shouldAddLiveDataObservableToTop;
    public pl7 supplierFunction;

    public static class PaginatedTokenResultsIterator<T> implements Iterator<T> {
        private AtomicInteger currentIndex = new AtomicInteger(0);
        private PaginatedTokenResults<?, T> paginatedTokenResults;

        public PaginatedTokenResultsIterator(PaginatedTokenResults<?, T> paginatedTokenResults) {
            this.paginatedTokenResults = paginatedTokenResults;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex.get() < this.paginatedTokenResults.getSize() || this.paginatedTokenResults.hasNextPage();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.paginatedTokenResults.lambda$getAsync$18(this.currentIndex.getAndIncrement());
        }
    }

    public PaginatedTokenResults() {
        this(null, null, 0);
    }

    private void __loadFirstTimeCache(Page<T> page) {
        cachePage(page);
        this.liveDataSubscription = this.liveDataObservable.m55711D(new gu3() { // from class: o.wrc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f52599a.lambda$__loadFirstTimeCache$15((su5) obj);
            }
        }).w0(new gu3() { // from class: o.xrc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f54173a.addToTop(obj);
            }
        }, new gu3() { // from class: o.yrc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f55848a.lambda$__loadFirstTimeCache$16((Throwable) obj);
            }
        }, new jm() { // from class: o.zrc
            @Override // p001o.jm
            public final void run() {
                this.f57570a.lambda$__loadFirstTimeCache$17();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void _loadMore() {
        _loadMore(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void addToTop(T t) {
        if (this.shouldAddLiveDataObservableToTop) {
            insertItems(Collections.singletonList(t), 0);
        } else if (hasNextPage()) {
            this.bottomLiveData.add(t);
        } else {
            insertItems(Collections.singletonList(t), this.allItems.size());
        }
    }

    private synchronized void cachePage(Page<T> page) {
        int size = this.allItems.size();
        if (!this.isEmpty.isDone()) {
            this.isEmpty.mo43750r(page.isEmpty());
        }
        if (page.isEmpty().booleanValue()) {
            this.currentPage = page;
            firePageEvents(Collections.emptyList(), size);
            this.isLoadingComplete.mo43750r(Boolean.TRUE);
        } else {
            String.format("Getting cached %s", Integer.valueOf(page.getItems().size()));
            this.allItems.addAll(page.getItems());
            this.currentPage = page;
            firePageEvents(page.getItems(), size);
            this.isLoadingComplete.mo43750r(Boolean.TRUE);
        }
    }

    public static <Q1, T1> PaginatedTokenResults<Q1, T1> empty() {
        return new PaginatedTokenResults<>(null, null, 0);
    }

    private void firePageDeleteEvent(T t, int i) {
        Iterator<ResultsChangeListener<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().fireDeletedEvent(Collections.singletonList(t), i);
        }
    }

    private void firePageEvents(List<T> list, int i) {
        Iterator<ResultsChangeListener<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().fireInsertedEvent(list, i);
        }
    }

    private void firePageUpdateEvent(T t, T t2, int i) {
        Iterator<ResultsChangeListener<T>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().fireUpdatedEvent(Collections.singletonList(t), i);
        }
    }

    public static <T1> PaginatedTokenResults<Integer, T1> fromList(List<T1> list, int i) {
        return new PaginatedTokenResults<>(new mrc(list), 0, i);
    }

    public static <T1> PaginatedTokenResults<Integer, T1> fromSubscription(x6c x6cVar) {
        return x6cVar == null ? empty() : new PaginatedTokenResults<>(new bsc(), 0, 10, x6cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$__loadFirstTimeCache$15(su5 su5Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$__loadFirstTimeCache$16(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$__loadFirstTimeCache$17() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$_loadMore$10(final int i, final long j, final int i2, pl7 pl7Var) {
        ((s47) pl7Var.mo17639w(this.queryInput, null, Integer.valueOf(i))).m47686M(new rl7() { // from class: o.nrc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return PaginatedTokenResults.lambda$_loadMore$7(i, (ryh) obj);
            }
        }).m47697Z(new gu3() { // from class: o.prc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f40448a.lambda$_loadMore$8(j, (Page) obj);
            }
        }, new gu3() { // from class: o.qrc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f42341a.lambda$_loadMore$9(i2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Page lambda$_loadMore$11(ryh ryhVar) {
        return new Page((List) ryhVar.f44265a, Optional.ofNullable((String) ryhVar.f44266b), this.pageSizeLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$_loadMore$12(long j, Page page) {
        StringBuilder sb = new StringBuilder();
        sb.append("Paginated Service Call time for page taken: ");
        sb.append(System.currentTimeMillis() - j);
        cachePage(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$_loadMore$13(int i, Throwable th) {
        retryLoad(th, i - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$_loadMore$14(String str, final long j, final int i, pl7 pl7Var) {
        ((s47) pl7Var.mo17639w(this.queryInput, str, Integer.valueOf(this.pageSizeLimit))).m47686M(new rl7() { // from class: o.crc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f18528a.lambda$_loadMore$11((ryh) obj);
            }
        }).m47697Z(new gu3() { // from class: o.erc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f22088a.lambda$_loadMore$12(j, (Page) obj);
            }
        }, new gu3() { // from class: o.frc
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f23981a.lambda$_loadMore$13(i, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Page lambda$_loadMore$7(int i, ryh ryhVar) {
        return new Page((List) ryhVar.f44265a, Optional.ofNullable((String) ryhVar.f44266b), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$_loadMore$8(long j, Page page) {
        StringBuilder sb = new StringBuilder();
        sb.append("Paginated Service Call time for page taken: ");
        sb.append(System.currentTimeMillis() - j);
        __loadFirstTimeCache(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$_loadMore$9(int i, Throwable th) {
        retryLoad(th, i - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addLiveDataObservable$2(su5 su5Var) {
        return !su5Var.isDisposed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ryh lambda$batchMap$5(Function function, ryh ryhVar) {
        return uyh.of((List) Optional.ofNullable(ryhVar).map(new Function() { // from class: o.arc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (List) ((ryh) obj).m47300g();
            }
        }).map(function).orElse(Collections.emptyList()), (String) Optional.ofNullable(ryhVar).map(new Function() { // from class: o.brc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((ryh) obj).m47301h();
            }
        }).orElse(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$batchMap$6(List list) {
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ s47 lambda$batchMap$fbde34e1$1(final Function function, Object obj, String str, Integer num) {
        return ((s47) this.supplierFunction.mo17639w(obj, str, num)).m47686M(new rl7() { // from class: o.sqc
            @Override // p001o.rl7
            public final Object apply(Object obj2) {
                return PaginatedTokenResults.lambda$batchMap$5(function, (ryh) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ryh lambda$fromList$0(String str, Integer num, List list, String str2) throws NumberFormatException {
        int i = Integer.parseInt(str);
        return uyh.of(list.subList(i, Math.min(num.intValue(), list.size() - i) + i), num.intValue() + i >= list.size() ? null : String.valueOf(num.intValue() + i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ryh lambda$fromList$1(Integer num, Integer num2, List list) {
        int iIntValue = num.intValue();
        return uyh.of(list.subList(iIntValue, Math.min(num2.intValue(), list.size() - iIntValue) + iIntValue), num2.intValue() + iIntValue >= list.size() ? null : String.valueOf(num2.intValue() + iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s47 lambda$fromList$7fbea7f5$1(final List list, final Integer num, final String str, final Integer num2) {
        return s47.m47673L((ryh) Optional.ofNullable(str).map(new Function() { // from class: o.jrc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PaginatedTokenResults.lambda$fromList$0(str, num2, list, (String) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.krc
            @Override // java.util.function.Supplier
            public final Object get() {
                return PaginatedTokenResults.lambda$fromList$1(num, num2, list);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s47 lambda$fromSubscription$4216556d$1(Integer num, String str, Integer num2) {
        return s47.m47673L(uyh.of(Collections.emptyList(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$map$3(Function function, List list) {
        Stream stream = list.stream();
        Objects.requireNonNull(function);
        return (List) stream.map(new ih1(function)).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nextPageToken$23(Optional optional) {
        return (String) optional.orElse(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ s47 lambda$toFlowable$4(int i, String str) {
        return (s47) this.supplierFunction.mo17639w(this.queryInput, str, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$waitForDataLoad$19(pif pifVar) {
        pifVar.get(this.DATA_WAIT_TIME_IN_SECONDS, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$waitForDataLoad$20(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$waitForDataLoad$21(final pif pifVar) {
        ayh.Z2(new o83() { // from class: o.hrc
            @Override // p001o.o83
            public final void run() {
                this.f27399a.lambda$waitForDataLoad$19(pifVar);
            }
        }).q1(new Consumer() { // from class: o.irc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                PaginatedTokenResults.lambda$waitForDataLoad$20((Throwable) obj);
            }
        });
    }

    private Optional<String> nextPageToken() {
        return Optional.ofNullable(this.currentPage).filter(new Predicate() { // from class: o.uqc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Page) obj).isPageFull();
            }
        }).map(new Function() { // from class: o.vqc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Page) obj).getNextPageToken();
            }
        }).map(new Function() { // from class: o.wqc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PaginatedTokenResults.lambda$nextPageToken$23((Optional) obj);
            }
        });
    }

    private void retryLoad(Throwable th, int i) {
        if (i >= 0) {
            _loadMore(i);
        } else {
            cachePage(Page.emptyPage());
        }
    }

    private void waitForDataLoad() {
        Optional.ofNullable(this.isLoadingComplete).ifPresent(new Consumer() { // from class: o.rrc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f43987a.lambda$waitForDataLoad$21((pif) obj);
            }
        });
    }

    public PaginatedTokenResults<Q, T> addLiveDataObservable(x6c x6cVar, boolean z) {
        Optional.ofNullable(this.liveDataSubscription).filter(new Predicate() { // from class: o.drc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PaginatedTokenResults.lambda$addLiveDataObservable$2((su5) obj);
            }
        }).ifPresent(new dpd());
        this.liveDataObservable = x6cVar;
        this.shouldAddLiveDataObservableToTop = z;
        this.bottomLiveData = new ArrayList();
        return this;
    }

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

    public <R> PaginatedTokenResults<Q, R> batchMap(final Function<List<T>, List<R>> function) {
        src srcVar = new src(this, function);
        x6c x6cVarD0 = this.liveDataObservable.d0(new rl7() { // from class: o.trc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return Collections.singletonList(obj);
            }
        });
        Objects.requireNonNull(function);
        PaginatedTokenResults<Q, R> paginatedTokenResults = new PaginatedTokenResults<>(srcVar, this.queryInput, this.pageSizeLimit, x6cVarD0.d0(new rl7() { // from class: o.urc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return (List) function.apply((List) obj);
            }
        }).d0(new rl7() { // from class: o.vrc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return PaginatedTokenResults.lambda$batchMap$6((List) obj);
            }
        }));
        paginatedTokenResults.shouldAddLiveDataObservableToTop = this.shouldAddLiveDataObservableToTop;
        return paginatedTokenResults;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void deleteItemsByPredicate(Predicate<T> predicate) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.allItems.size(); i++) {
            T t = this.allItems.get(i);
            if (predicate.test(t)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(t);
            }
        }
        this.allItems.removeIf(predicate);
        this.expectedSize -= arrayList2.size();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            firePageDeleteEvent(arrayList2.get(i2), ((Integer) arrayList.get(i2)).intValue());
        }
    }

    public List<T> filterNoReload(Predicate<T> predicate) {
        return (List) this.allItems.stream().filter(predicate).collect(Collectors.toList());
    }

    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public T lambda$getAsync$18(int i) {
        if (this.expectedSize - i <= (this.SCALE_INITIAL_LOAD - 1) * this.pageSizeLimit && ((Boolean) Optional.ofNullable(this.isLoadingComplete).map(new grc()).orElse(Boolean.TRUE)).booleanValue()) {
            this.expectedSize += this.pageSizeLimit;
            loadMore();
        }
        while (i >= this.allItems.size()) {
            waitForDataLoad();
        }
        if (i >= this.allItems.size()) {
            i = this.allItems.size() - 1;
        }
        return this.allItems.get(i);
    }

    public List<T> getAllItems() {
        return this.allItems;
    }

    public x6c getAsync(final int i) {
        return x6c.m55697U(new Callable() { // from class: o.csc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18580a.lambda$getAsync$18(i);
            }
        }).y0(i5f.m31599c());
    }

    public int getSize() {
        return this.allItems.size();
    }

    public boolean hasNextPage() {
        if (this.supplierFunction == null) {
            return false;
        }
        if (this.currentPage == null) {
            return true;
        }
        String.format("Getting token %s", nextPageToken());
        return nextPageToken().isPresent();
    }

    public void insertItems(List<T> list, int i) {
        this.allItems.addAll(i, list);
        firePageEvents(list, i);
    }

    public x6c isEmpty() {
        return x6c.m55698V(this.isEmpty);
    }

    public Iterator<T> iterator() {
        return new PaginatedTokenResultsIterator(this);
    }

    public void loadInitial() {
        loadMore();
        this.expectedSize = this.SCALE_INITIAL_LOAD * this.pageSizeLimit;
    }

    public synchronized void loadMore() {
        if (this.supplierFunction == null) {
            return;
        }
        this.isLoadingComplete = pif.m43749s();
        this.executor.mo20302c(new Runnable() { // from class: o.orc
            @Override // java.lang.Runnable
            public final void run() {
                this.f38795a._loadMore();
            }
        });
    }

    public <R> PaginatedTokenResults<Q, R> map(final Function<T, R> function) {
        return batchMap(new Function() { // from class: o.lrc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PaginatedTokenResults.lambda$map$3(function, (List) obj);
            }
        });
    }

    public int pageLimit() {
        return this.pageSizeLimit;
    }

    public int pageStartIndex() {
        return 0;
    }

    public void removeResultsChangedListener(ResultsChangeListener<T> resultsChangeListener) {
        this.listeners.remove(resultsChangeListener);
    }

    public void removeRowAtIndex(int i) {
        if (i < 0 || i >= this.allItems.size()) {
            return;
        }
        final T t = this.allItems.get(i);
        deleteItemsByPredicate(new Predicate() { // from class: o.asc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.equals(t, obj);
            }
        });
    }

    public void reset() {
        Optional.ofNullable(this.liveDataSubscription).ifPresent(new dpd());
        Optional.ofNullable(this.paginatedTokenResultsUpdaterSubscription).ifPresent(new dpd());
        Optional.ofNullable(this.paginatedTokenResultsUpdater).ifPresent(new Consumer() { // from class: o.tqc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((PaginatedTokenResultsUpdater) obj).destroy();
            }
        });
        this.listeners.clear();
        this.allItems.clear();
        this.currentPage = null;
        this.supplierFunction = null;
        this.liveDataObservable = x6c.m55693G();
        this.liveDataSubscription = null;
        this.listeners = new ArrayList();
        this.allItems = new ArrayList();
        this.bottomLiveData = new ArrayList();
        this.paginatedTokenResultsUpdater = null;
        this.paginatedTokenResultsUpdaterSubscription = null;
    }

    public void setPaginatedTokenResultsUpdater(PaginatedTokenResultsUpdater<T> paginatedTokenResultsUpdater) {
        this.paginatedTokenResultsUpdater = paginatedTokenResultsUpdater;
        paginatedTokenResultsUpdater.beginSubscription(this);
    }

    public s47 toFlowable() {
        return toFlowable(this.pageSizeLimit);
    }

    public void updateAndInsertItemByPredicate(Predicate<T> predicate, T t) {
        deleteItemsByPredicate(predicate);
        insertItems(Collections.singletonList(t), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateItemByPredicate(Predicate<T> predicate, T t) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.allItems.size(); i++) {
            T t2 = this.allItems.get(i);
            if (predicate.test(t2)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(t2);
            }
        }
        if (arrayList.isEmpty()) {
            insertItems(Arrays.asList(t), 0);
            firePageEvents(Arrays.asList(t), 0);
            return;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            Object obj = arrayList2.get(i2);
            this.allItems.set(iIntValue, t);
            firePageUpdateEvent(t, obj, iIntValue);
        }
    }

    public PaginatedTokenResults(pl7 pl7Var, Q q, int i) {
        this(pl7Var, q, i, x6c.m55693G());
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PaginatedTokenResults<Q, T> mo68662clone() {
        return new PaginatedTokenResults<>(this.supplierFunction, this.queryInput, this.pageSizeLimit, this.liveDataObservable);
    }

    public s47 toFlowable(final int i) {
        return this.supplierFunction == null ? s47.m47668C() : new ja8() { // from class: ai.salesmax.model.PaginatedTokenResults.1
            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ CompletableFuture __emitFromFlowableListWithTokenToEmitter(s47 s47Var, g57 g57Var) {
                return super.__emitFromFlowableListWithTokenToEmitter(s47Var, g57Var);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ Object convertGraphQLResponse(GraphQLResponse graphQLResponse, Class cls) {
                return super.convertGraphQLResponse(graphQLResponse, cls);
            }

            @Override // p001o.ja8
            /* renamed from: convertResponse */
            public /* bridge */ /* synthetic */ Object sf(Object obj, Class cls) {
                return super.sf(obj, cls);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ AccountMembership dummyMembership(String str) {
                return super.dummyMembership(str);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ wtf executeGraphQL(SimpleGraphQLRequest simpleGraphQLRequest) {
                return super.executeGraphQL(simpleGraphQLRequest);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ s47 fromFlowableListWithTokenToFlowable(rl7 rl7Var) {
                return super.fromFlowableListWithTokenToFlowable(rl7Var);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ x6c graphqlMutation(Mutation mutation, Class cls, Function function, Class cls2) {
                return super.graphqlMutation(mutation, cls, function, cls2);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ x6c graphqlQuery(Query query, Class cls, Function function, Class cls2) {
                return super.graphqlQuery(query, cls, function, cls2);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ x6c graphqlSubscription(Subscription subscription, Class cls, Function function, Class cls2) {
                return super.graphqlSubscription(subscription, cls, function, cls2);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ x6c isAccountSubscriptionActive() {
                return super.isAccountSubscriptionActive();
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ Boolean isDummyAccount(String str) {
                return super.isDummyAccount(str);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ Boolean isDummyAccountMembership(AccountMembership accountMembership) {
                return super.isDummyAccountMembership(accountMembership);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ boolean raiseIfErrorInResponse(GraphQLResponse graphQLResponse) {
                return super.raiseIfErrorInResponse(graphQLResponse);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ boolean raiseIfOnlyErrorInResponse(GraphQLResponse graphQLResponse) {
                return super.raiseIfOnlyErrorInResponse(graphQLResponse);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ ch9 toLatLongMap(ch9 ch9Var) {
                return super.toLatLongMap(ch9Var);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ Map toVariablesMap(Mutation mutation) {
                return super.toVariablesMap(mutation);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ x6c graphqlMutation(Mutation mutation, String str, Class cls, Function function, Class cls2) {
                return super.graphqlMutation(mutation, str, cls, function, cls2);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ x6c graphqlQuery(Query query, String str, Class cls, Function function, Class cls2) {
                return super.graphqlQuery(query, str, cls, function, cls2);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ x6c graphqlSubscription(Subscription subscription, String str, Class cls, Function function, Class cls2) {
                return super.graphqlSubscription(subscription, str, cls, function, cls2);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ Boolean isDummyAccountMembership(String str) {
                return super.isDummyAccountMembership(str);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ Map toVariablesMap(Query query) {
                return super.toVariablesMap(query);
            }

            @Override // p001o.ja8
            public /* bridge */ /* synthetic */ Map toVariablesMap(Subscription subscription) {
                return super.toVariablesMap(subscription);
            }
        }.fromFlowableListWithTokenToFlowable(new rl7() { // from class: o.xqc
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f54141a.lambda$toFlowable$4(i, (String) obj);
            }
        });
    }

    public PaginatedTokenResults(pl7 pl7Var, Q q, int i, x6c x6cVar) {
        this.expectedSize = 0;
        this.SCALE_INITIAL_LOAD = 3;
        this.DATA_WAIT_TIME_IN_SECONDS = 2;
        this.shouldAddLiveDataObservableToTop = true;
        this.allItems = Collections.synchronizedList(new ArrayList());
        this.bottomLiveData = Collections.synchronizedList(new ArrayList());
        this.supplierFunction = pl7Var;
        this.pageSizeLimit = i;
        this.queryInput = q;
        this.listeners = new ArrayList();
        this.executor = pl7Var == null ? null : i5f.m31600d();
        this.isEmpty = pif.m43749s();
        this.liveDataObservable = (x6c) Optional.ofNullable(x6cVar).orElse(x6c.m55693G());
    }

    private synchronized void _loadMore(final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.allItems.isEmpty()) {
            final int i2 = this.SCALE_INITIAL_LOAD * this.pageSizeLimit;
            Optional.ofNullable(this.supplierFunction).ifPresent(new Consumer() { // from class: o.yqc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f55821a.lambda$_loadMore$10(i2, jCurrentTimeMillis, i, (pl7) obj);
                }
            });
        } else {
            if (!hasNextPage()) {
                return;
            }
            final String strOrElse = nextPageToken().orElse(null);
            Optional.ofNullable(this.supplierFunction).ifPresent(new Consumer() { // from class: o.zqc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f57515a.lambda$_loadMore$14(strOrElse, jCurrentTimeMillis, i, (pl7) obj);
                }
            });
        }
    }
}
