package p001o;

import ai.salesmax.model.TodoFilter;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import type.SearchableEngagementFilterInput;
import type.SearchableEngagementSortInput;
import type.SearchableIDFilterInput;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public class vqh {

    /* renamed from: g */
    public static Map f50750g = new ConcurrentHashMap();

    /* renamed from: a */
    public wqh f50751a;

    /* renamed from: b */
    public Optional f50752b = Optional.empty();

    /* renamed from: c */
    public Optional f50753c = Optional.empty();

    /* renamed from: d */
    public Optional f50754d = Optional.empty();

    /* renamed from: e */
    public Optional f50755e = Optional.empty();

    /* renamed from: f */
    public Optional f50756f = Optional.empty();

    /* renamed from: o.vqh$a */
    public static /* synthetic */ class C17655a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50757a;

        static {
            int[] iArr = new int[wqh.values().length];
            f50757a = iArr;
            try {
                iArr[wqh.MY_TEAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50757a[wqh.ME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50757a[wqh.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public vqh(wqh wqhVar) {
        this.f50751a = wqhVar;
    }

    /* renamed from: H */
    public static /* synthetic */ SearchableEngagementFilterInput m53241H(String str) {
        return SearchableEngagementFilterInput.builder().contactId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: I */
    public static /* synthetic */ SearchableEngagementFilterInput m53242I(String str) {
        return SearchableEngagementFilterInput.builder().primaryTeamId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: J */
    public static /* synthetic */ SearchableEngagementFilterInput m53243J(String str) {
        return SearchableEngagementFilterInput.builder().ownerId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ SearchableEngagementFilterInput m53244K(String str, String str2, String str3, eoh eohVar) {
        List<SearchableEngagementFilterInput> list = (List) eohVar.m24027b().stream().map(new Function() { // from class: o.iqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53241H((String) obj);
            }
        }).collect(Collectors.toList());
        List<SearchableEngagementFilterInput> list2 = (List) eohVar.m24029d().stream().map(new Function() { // from class: o.jqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53242I((String) obj);
            }
        }).collect(Collectors.toList());
        List<SearchableEngagementFilterInput> list3 = (List) eohVar.m24030e().stream().map(new Function() { // from class: o.kqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53243J((String) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            arrayList.add(m53290w(str, str2, Optional.ofNullable(str3)).or(list).build());
        }
        if (list2.size() > 0) {
            arrayList.add(m53290w(str, str2, Optional.ofNullable(str3)).or(list2).build());
        }
        if (list3.size() > 0) {
            arrayList.add(m53290w(str, str2, Optional.ofNullable(str3)).or(list3).build());
        }
        if (arrayList.size() > 0) {
            return m53290w(str, str2, Optional.ofNullable(str3)).and(arrayList).build();
        }
        return null;
    }

    /* renamed from: M */
    public static /* synthetic */ Optional m53246M(Optional optional) {
        return optional;
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m53248O(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: P */
    public static /* synthetic */ SearchableEngagementFilterInput m53249P(String str, String str2) {
        return SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).primaryTeamId(SearchableIDFilterInput.builder().eq(str2).build()).build();
    }

    /* renamed from: Q */
    public static /* synthetic */ List m53250Q(final String str, List list) {
        return (List) list.stream().map(new tu()).filter(new Predicate() { // from class: o.lqh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vqh.m53248O((String) obj);
            }
        }).map(new Function() { // from class: o.mqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53249P(str, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m53251R(List list) {
        return !list.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m53252S(final String str, final String str2, final String str3, final List list, eoh eohVar) {
        eohVar.m25399m().ifPresent(new Consumer() { // from class: o.bqh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f16706a.m53259Z(str, str2, str3, list, (List) obj);
            }
        });
    }

    /* renamed from: T */
    public static /* synthetic */ SearchableEngagementFilterInput m53253T(Optional optional, SearchableEngagementFilterInput searchableEngagementFilterInput) {
        return SearchableEngagementFilterInput.builder().and(Arrays.asList((SearchableEngagementFilterInput) optional.get(), searchableEngagementFilterInput)).build();
    }

    /* renamed from: U */
    public static /* synthetic */ SearchableEngagementFilterInput m53254U(SearchableEngagementFilterInput searchableEngagementFilterInput, final Optional optional, SearchableEngagementFilterInput searchableEngagementFilterInput2) {
        return (SearchableEngagementFilterInput) Optional.ofNullable(searchableEngagementFilterInput).map(new Function() { // from class: o.cqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53253T(optional, (SearchableEngagementFilterInput) obj);
            }
        }).orElse((SearchableEngagementFilterInput) optional.get());
    }

    /* renamed from: V */
    public static /* synthetic */ SearchableEngagementFilterInput m53255V(SearchableEngagementFilterInput searchableEngagementFilterInput, SearchableEngagementFilterInput searchableEngagementFilterInput2) {
        return SearchableEngagementFilterInput.builder().and(Arrays.asList(searchableEngagementFilterInput, searchableEngagementFilterInput2)).build();
    }

    /* renamed from: X */
    public static /* synthetic */ boolean m53257X(TodoFilter todoFilter) {
        return !todoFilter.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m53258Y(String str, String str2, String str3, List list, TodoFilter todoFilter) {
        list.add(todoFilter.getSearchableTasksFilterInput(m53290w(str, str2, Optional.ofNullable(str3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m53259Z(String str, String str2, String str3, List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list.add(eoh.m25396k(m53290w(str, str2, Optional.ofNullable(str3)), (String) it.next()).build());
        }
    }

    public static /* synthetic */ vqh a0(String str) {
        return c0(wqh.fromTodoOption(str));
    }

    public static vqh b0(String str) {
        return (vqh) Optional.ofNullable(str).map(new Function() { // from class: o.oqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.a0((String) obj);
            }
        }).orElse(c0(wqh.ME));
    }

    public static synchronized vqh c0(wqh wqhVar) {
        if (!f50750g.containsKey(wqhVar)) {
            f50750g.put(wqhVar, new vqh(wqhVar));
        }
        return (vqh) f50750g.get(wqhVar);
    }

    /* renamed from: y */
    public static synchronized void m53280y() {
        f50750g.values().forEach(new Consumer() { // from class: o.nqh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((vqh) obj).d0();
            }
        });
    }

    /* renamed from: A */
    public ryh m53281A(final String str, final String str2, final String str3) {
        final ArrayList arrayList = new ArrayList();
        final Optional map = m53284D().map(new Function() { // from class: o.pqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f40424a.m53256W(str, str2, str3, (String) obj);
            }
        });
        SearchableEngagementSortInput searchableEngagementSortInput = (SearchableEngagementSortInput) m53282B().map(new Function() { // from class: o.qqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eoh) obj).m25401o();
            }
        }).map(new Function() { // from class: o.rqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TodoFilter) obj).getSearchableContactSortInput();
            }
        }).orElse(null);
        m53282B().map(new Function() { // from class: o.qqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((eoh) obj).m25401o();
            }
        }).filter(new Predicate() { // from class: o.sqh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vqh.m53257X((TodoFilter) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.tqh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f47617a.m53258Y(str, str2, str3, arrayList, (TodoFilter) obj);
            }
        });
        m53282B().ifPresent(new Consumer() { // from class: o.uqh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f49380a.m53252S(str, str2, str3, arrayList, (eoh) obj);
            }
        });
        final SearchableEngagementFilterInput searchableEngagementFilterInputBuild = arrayList.size() > 0 ? SearchableEngagementFilterInput.builder().or(arrayList).build() : m53290w(str, str2, Optional.ofNullable(str3)).build();
        final SearchableEngagementFilterInput searchableEngagementFilterInput = (SearchableEngagementFilterInput) map.map(new Function() { // from class: o.vph
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53254U(searchableEngagementFilterInputBuild, map, (SearchableEngagementFilterInput) obj);
            }
        }).orElse(searchableEngagementFilterInputBuild);
        return uyh.of((SearchableEngagementFilterInput) m53289v(str, str2, str3).map(new Function() { // from class: o.wph
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53255V(searchableEngagementFilterInput, (SearchableEngagementFilterInput) obj);
            }
        }).orElse(searchableEngagementFilterInput), searchableEngagementSortInput);
    }

    /* renamed from: B */
    public Optional m53282B() {
        return this.f50755e;
    }

    /* renamed from: C */
    public wqh m53283C() {
        return this.f50751a;
    }

    /* renamed from: D */
    public Optional m53284D() {
        return this.f50754d;
    }

    /* renamed from: E */
    public Optional m53285E() {
        return this.f50752b;
    }

    /* renamed from: F */
    public boolean m53286F() {
        Optional map = this.f50755e.map(new Function() { // from class: o.uph
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((eoh) obj).mo24031f());
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) this.f50756f.map(new Function() { // from class: o.fqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                tq.m50332a(obj);
                throw null;
            }
        }).orElse(bool)).booleanValue();
    }

    /* renamed from: G */
    public boolean m53287G() {
        return !this.f50754d.isPresent() && m53286F();
    }

    public void d0() {
        this.f50752b = Optional.empty();
        this.f50753c = Optional.empty();
        this.f50754d = Optional.empty();
        this.f50755e = Optional.empty();
        this.f50756f = Optional.empty();
    }

    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final SearchableEngagementFilterInput m53256W(String str, String str2, String str3, String str4) {
        String[] strArrSplit = str3.split("[\\s,]+");
        ArrayList arrayList = new ArrayList();
        for (String str5 : strArrSplit) {
            arrayList.add(m53288u(str, str2, str5, str4));
        }
        return m53290w(str, str2, Optional.ofNullable(str4)).and(arrayList).build();
    }

    public void f0(eoh eohVar) {
        this.f50755e = Optional.ofNullable(eohVar);
    }

    public void g0(List list) {
        this.f50753c = Optional.ofNullable(list);
    }

    public void h0(String str) {
        if (StringUtils.isBlank(str)) {
            this.f50754d = Optional.empty();
        } else {
            this.f50754d = Optional.ofNullable(str);
        }
    }

    public void i0(Team team) {
        this.f50752b = Optional.ofNullable(team);
    }

    /* renamed from: u */
    public final SearchableEngagementFilterInput m53288u(String str, String str2, String str3, String str4) {
        return SearchableEngagementFilterInput.builder().or(Arrays.asList(m53290w(str, str2, Optional.ofNullable(str4)).taskHeading(SearchableStringFilterInput.builder().matchPhrasePrefix(str3).build()).build(), m53290w(str, str2, Optional.ofNullable(str4)).noteHeading(SearchableStringFilterInput.builder().matchPhrasePrefix(str3).build()).build(), m53290w(str, str2, Optional.ofNullable(str4)).taskInputNote(SearchableStringFilterInput.builder().matchPhrasePrefix(str3).build()).build(), m53290w(str, str2, Optional.ofNullable(str4)).visitNote(SearchableStringFilterInput.builder().matchPhrasePrefix(str3).build()).build(), m53290w(str, str2, Optional.ofNullable(str4)).body(SearchableStringFilterInput.builder().matchPhrasePrefix(str3).build()).build(), m53290w(str, str2, Optional.ofNullable(str4)).taskCompletionNote(SearchableStringFilterInput.builder().matchPhrasePrefix(str3).build()).build())).build();
    }

    /* renamed from: v */
    public final Optional m53289v(final String str, final String str2, final String str3) {
        return m53282B().map(new Function() { // from class: o.xph
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f54044a.m53244K(str, str2, str3, (eoh) obj);
            }
        });
    }

    /* renamed from: w */
    public final SearchableEngagementFilterInput.Builder m53290w(String str, String str2, Optional optional) {
        final SearchableEngagementFilterInput.Builder builderAccountId = SearchableEngagementFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build());
        if (!optional.isPresent()) {
            optional = m53282B().map(new Function() { // from class: o.yph
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((eoh) obj).m25400n();
                }
            }).flatMap(new Function() { // from class: o.zph
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return vqh.m53246M((Optional) obj);
                }
            });
        }
        SearchableEngagementFilterInput.Builder builder = (SearchableEngagementFilterInput.Builder) optional.map(new Function() { // from class: o.aqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return eoh.m25395j(builderAccountId, (String) obj);
            }
        }).orElse(builderAccountId);
        int i = C17655a.f50757a[m53283C().ordinal()];
        return i != 1 ? i != 2 ? builder : builder.ownerId(SearchableIDFilterInput.builder().eq(str2).build()) : m53291x(str, str2, builder);
    }

    /* renamed from: x */
    public final SearchableEngagementFilterInput.Builder m53291x(final String str, String str2, SearchableEngagementFilterInput.Builder builder) {
        String strTrim = ((String) m53285E().map(new tu()).orElse("")).trim();
        final SearchableEngagementFilterInput.Builder builderAccountId = ((SearchableEngagementFilterInput.Builder) Optional.ofNullable(builder).orElseGet(new Supplier() { // from class: o.dqh
            @Override // java.util.function.Supplier
            public final Object get() {
                return SearchableEngagementFilterInput.builder();
            }
        })).accountId(SearchableIDFilterInput.builder().eq(str).build());
        if (!strTrim.equalsIgnoreCase("ALL") && !StringUtils.isBlank(strTrim)) {
            return builderAccountId.primaryTeamId(SearchableIDFilterInput.builder().eq(strTrim).build());
        }
        Optional optionalFilter = this.f50753c.map(new Function() { // from class: o.eqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vqh.m53250Q(str, (List) obj);
            }
        }).filter(new Predicate() { // from class: o.gqh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vqh.m53251R((List) obj);
            }
        });
        Objects.requireNonNull(builderAccountId);
        return (SearchableEngagementFilterInput.Builder) optionalFilter.map(new Function() { // from class: o.hqh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builderAccountId.or((List) obj);
            }
        }).orElse(builderAccountId);
    }

    /* renamed from: z */
    public ryh m53292z(String str, String str2) {
        return m53281A(str, str2, null);
    }
}
