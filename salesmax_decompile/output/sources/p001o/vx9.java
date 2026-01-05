package p001o;

import ai.salesmax.model.LeadFilter;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import type.SearchableContactFilterInput;
import type.SearchableContactSortInput;
import type.SearchableContactSortableFields;
import type.SearchableIDFilterInput;
import type.SearchableSortDirection;
import type.SearchableStringFilterInput;

/* loaded from: classes.dex */
public class vx9 {

    /* renamed from: g */
    public static Map f50991g = new ConcurrentHashMap();

    /* renamed from: a */
    public wx9 f50992a;

    /* renamed from: b */
    public Optional f50993b = Optional.empty();

    /* renamed from: c */
    public Optional f50994c = Optional.empty();

    /* renamed from: d */
    public Optional f50995d = Optional.empty();

    /* renamed from: e */
    public Optional f50996e = Optional.of(new ls9());

    /* renamed from: f */
    public Optional f50997f = Optional.of(new mw9());

    /* renamed from: o.vx9$a */
    public static /* synthetic */ class C17691a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50998a;

        static {
            int[] iArr = new int[wx9.values().length];
            f50998a = iArr;
            try {
                iArr[wx9.MY_TEAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50998a[wx9.ME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50998a[wx9.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public vx9(wx9 wx9Var) {
        this.f50992a = wx9Var;
    }

    /* renamed from: G */
    public static /* synthetic */ SearchableContactFilterInput m53536G(String str) {
        return SearchableContactFilterInput.builder().id(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: H */
    public static /* synthetic */ SearchableContactFilterInput m53537H(String str) {
        return SearchableContactFilterInput.builder().primaryTeamId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* renamed from: I */
    public static /* synthetic */ SearchableContactFilterInput m53538I(String str) {
        return SearchableContactFilterInput.builder().ownerId(SearchableIDFilterInput.builder().eq(str).build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ SearchableContactFilterInput m53539J(String str, String str2, ls9 ls9Var) {
        List<SearchableContactFilterInput> list = (List) ls9Var.m24027b().stream().map(new Function() { // from class: o.kx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53536G((String) obj);
            }
        }).collect(Collectors.toList());
        List<SearchableContactFilterInput> list2 = (List) ls9Var.m24029d().stream().map(new Function() { // from class: o.lx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53537H((String) obj);
            }
        }).collect(Collectors.toList());
        List<SearchableContactFilterInput> list3 = (List) ls9Var.m24030e().stream().map(new Function() { // from class: o.mx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53538I((String) obj);
            }
        }).collect(Collectors.toList());
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            arrayList.add(m53584v(str, str2).or(list).build());
        }
        if (list2.size() > 0) {
            arrayList.add(m53584v(str, str2).or(list2).build());
        }
        if (list3.size() > 0) {
            arrayList.add(m53584v(str, str2).or(list3).build());
        }
        if (arrayList.size() > 0) {
            return m53584v(str, str2).and(arrayList).build();
        }
        return null;
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m53540K(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: L */
    public static /* synthetic */ SearchableContactFilterInput m53541L(String str, String str2) {
        return SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).primaryTeamId(SearchableIDFilterInput.builder().eq(str2).build()).build();
    }

    /* renamed from: M */
    public static /* synthetic */ List m53542M(final String str, List list) {
        return (List) list.stream().map(new tu()).filter(new Predicate() { // from class: o.ux9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vx9.m53540K((String) obj);
            }
        }).map(new Function() { // from class: o.xw9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53541L(str, (String) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m53543N(List list) {
        return !list.isEmpty();
    }

    /* renamed from: O */
    public static /* synthetic */ SearchableContactFilterInput m53544O(SearchableContactFilterInput searchableContactFilterInput, SearchableContactFilterInput searchableContactFilterInput2) {
        return SearchableContactFilterInput.builder().and(Arrays.asList(searchableContactFilterInput, searchableContactFilterInput2)).build();
    }

    /* renamed from: P */
    public static /* synthetic */ ryh m53545P(SearchableContactFilterInput searchableContactFilterInput, LeadFilter leadFilter) {
        return leadFilter.getSearchableContactSortInput(searchableContactFilterInput);
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m53547R(LeadFilter leadFilter) {
        return !leadFilter.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m53548S(String str, String str2, List list, LeadFilter leadFilter) {
        list.add(leadFilter.getSearchableContactFilterInput(m53584v(str, str2)));
    }

    /* renamed from: T */
    public static /* synthetic */ SearchableContactFilterInput m53549T(Optional optional, SearchableContactFilterInput searchableContactFilterInput) {
        return SearchableContactFilterInput.builder().and(Arrays.asList((SearchableContactFilterInput) optional.get(), searchableContactFilterInput)).build();
    }

    /* renamed from: U */
    public static /* synthetic */ SearchableContactFilterInput m53550U(SearchableContactFilterInput searchableContactFilterInput, final Optional optional, SearchableContactFilterInput searchableContactFilterInput2) {
        return (SearchableContactFilterInput) Optional.ofNullable(searchableContactFilterInput).map(new Function() { // from class: o.jx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53549T(optional, (SearchableContactFilterInput) obj);
            }
        }).orElse((SearchableContactFilterInput) optional.get());
    }

    /* renamed from: V */
    public static /* synthetic */ boolean m53551V(LeadFilter leadFilter) {
        return !StringUtils.isBlank(leadFilter.getSortByField());
    }

    /* renamed from: W */
    public static /* synthetic */ mw9 m53552W(LeadFilter leadFilter) {
        mw9 mw9Var = new mw9();
        mw9Var.m34797c(leadFilter.getSortByField());
        mw9Var.m34798d("asc".equalsIgnoreCase(leadFilter.getSortDirection()));
        return mw9Var;
    }

    /* renamed from: X */
    public static /* synthetic */ vx9 m53553X(String str) {
        return b0(wx9.fromLeadOptionType(str));
    }

    /* renamed from: Y */
    public static /* synthetic */ void m53554Y(SearchableContactFilterInput.Builder builder, String str) {
        builder.ownerId(SearchableIDFilterInput.builder().eq(str).build());
    }

    /* renamed from: Z */
    public static /* synthetic */ SearchableContactFilterInput m53555Z(String str, String str2) {
        return SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).primaryTeamId(SearchableIDFilterInput.builder().eq(str2).build()).build();
    }

    public static vx9 a0(String str) {
        return (vx9) Optional.ofNullable(str).map(new Function() { // from class: o.tx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53553X((String) obj);
            }
        }).orElse(b0(wx9.ME));
    }

    public static synchronized vx9 b0(wx9 wx9Var) {
        if (!f50991g.containsKey(wx9Var)) {
            f50991g.put(wx9Var, new vx9(wx9Var));
        }
        return (vx9) f50991g.get(wx9Var);
    }

    public static SearchableContactFilterInput d0(final String str, String str2, String str3, List list) {
        String strTrim = str3.trim();
        vx9 vx9Var = new vx9(wx9.ALL);
        vx9Var.h0(strTrim);
        final SearchableContactFilterInput.Builder builderAccountId = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build());
        Optional.ofNullable(str2).ifPresent(new Consumer() { // from class: o.ww9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                vx9.m53554Y(builderAccountId, (String) obj);
            }
        });
        SearchableContactFilterInput searchableContactFilterInputBuild = builderAccountId.build();
        ArrayList arrayList = new ArrayList((List) list.stream().map(new Function() { // from class: o.hx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53555Z(str, (String) obj);
            }
        }).collect(Collectors.toList()));
        arrayList.add(searchableContactFilterInputBuild);
        if (arrayList.size() != 1) {
            searchableContactFilterInputBuild = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).or(arrayList).build();
        }
        if (StringUtils.isBlank(strTrim)) {
            return searchableContactFilterInputBuild;
        }
        return SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build()).and(Arrays.asList(searchableContactFilterInputBuild, vx9Var.m53546Q(str, str2, strTrim))).build();
    }

    /* renamed from: x */
    public static synchronized void m53576x() {
        f50991g.values().forEach(new Consumer() { // from class: o.sx9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((vx9) obj).c0();
            }
        });
    }

    /* renamed from: A */
    public wx9 m53577A() {
        return this.f50992a;
    }

    /* renamed from: B */
    public Optional m53578B() {
        return this.f50995d;
    }

    /* renamed from: C */
    public Optional m53579C() {
        return this.f50993b;
    }

    /* renamed from: D */
    public Optional m53580D() {
        return this.f50996e.map(new zw9()).filter(new Predicate() { // from class: o.fx9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vx9.m53551V((LeadFilter) obj);
            }
        }).map(new Function() { // from class: o.gx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53552W((LeadFilter) obj);
            }
        });
    }

    /* renamed from: E */
    public boolean m53581E() {
        Optional map = this.f50996e.map(new Function() { // from class: o.nx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ls9) obj).mo24031f());
            }
        });
        Boolean bool = Boolean.TRUE;
        return ((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) this.f50997f.map(new Function() { // from class: o.ox9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((mw9) obj).m34796b());
            }
        }).orElse(bool)).booleanValue();
    }

    /* renamed from: F */
    public boolean m53582F() {
        return !this.f50995d.isPresent() && m53581E();
    }

    public void c0() {
        this.f50993b = Optional.empty();
        this.f50995d = Optional.empty();
        this.f50996e = Optional.empty();
        this.f50997f = Optional.empty();
        this.f50994c = Optional.empty();
    }

    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final SearchableContactFilterInput m53546Q(String str, String str2, String str3) {
        String[] strArrSplit = str3.replaceAll("^\\s*\\+", "").split("[\\s,]+");
        ArrayList arrayList = new ArrayList();
        for (String str4 : strArrSplit) {
            arrayList.add(m53584v(str, str2).or(Arrays.asList(m53584v(str, str2).name(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str4)).build()).build(), m53584v(str, str2).contactNumberDetail__phoneNumber(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str4)).build()).build(), m53584v(str, str2).businessDetail__name(SearchableStringFilterInput.builder().wildcard(String.format("*%s*", str4)).build()).build())).build());
        }
        return m53584v(str, str2).and(arrayList).build();
    }

    public void f0(ls9 ls9Var) {
        this.f50996e = Optional.ofNullable(ls9Var);
    }

    public void g0(List list) {
        this.f50994c = Optional.ofNullable(list);
    }

    public void h0(String str) {
        if (StringUtils.isBlank(str)) {
            this.f50995d = Optional.empty();
        } else {
            this.f50995d = Optional.ofNullable(str);
        }
    }

    public void i0(Team team) {
        this.f50993b = Optional.ofNullable(team);
    }

    /* renamed from: u */
    public final Optional m53583u(final String str, final String str2) {
        return m53587z().map(new Function() { // from class: o.ix9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f29342a.m53539J(str, str2, (ls9) obj);
            }
        });
    }

    /* renamed from: v */
    public final SearchableContactFilterInput.Builder m53584v(String str, String str2) {
        SearchableContactFilterInput.Builder builderAccountId = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build());
        int i = C17691a.f50998a[m53577A().ordinal()];
        return i != 1 ? i != 2 ? builderAccountId : builderAccountId.ownerId(SearchableIDFilterInput.builder().eq(str2).build()) : m53585w(str, str2);
    }

    /* renamed from: w */
    public final SearchableContactFilterInput.Builder m53585w(final String str, String str2) {
        String strTrim = ((String) m53579C().map(new tu()).orElse("")).trim();
        final SearchableContactFilterInput.Builder builderAccountId = SearchableContactFilterInput.builder().accountId(SearchableIDFilterInput.builder().eq(str).build());
        if (!strTrim.equalsIgnoreCase("ALL") && !StringUtils.isBlank(strTrim)) {
            return builderAccountId.primaryTeamId(SearchableIDFilterInput.builder().eq(strTrim).build());
        }
        Optional optionalFilter = this.f50994c.map(new Function() { // from class: o.px9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53542M(str, (List) obj);
            }
        }).filter(new Predicate() { // from class: o.qx9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vx9.m53543N((List) obj);
            }
        });
        Objects.requireNonNull(builderAccountId);
        return (SearchableContactFilterInput.Builder) optionalFilter.map(new Function() { // from class: o.rx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return builderAccountId.or((List) obj);
            }
        }).orElse(builderAccountId);
    }

    /* renamed from: y */
    public ryh m53586y(final String str, final String str2) {
        final ArrayList arrayList = new ArrayList();
        final Optional map = m53578B().map(new Function() { // from class: o.yw9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f56202a.m53546Q(str, str2, (String) obj);
            }
        });
        m53587z().map(new zw9()).filter(new Predicate() { // from class: o.ax9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return vx9.m53547R((LeadFilter) obj);
            }
        }).ifPresent(new Consumer() { // from class: o.bx9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f16954a.m53548S(str, str2, arrayList, (LeadFilter) obj);
            }
        });
        final SearchableContactFilterInput searchableContactFilterInputBuild = arrayList.size() > 0 ? arrayList.size() == 1 ? arrayList.get(0) : m53584v(str, str2).or(arrayList).build() : m53584v(str, str2).build();
        final SearchableContactFilterInput searchableContactFilterInput = (SearchableContactFilterInput) map.map(new Function() { // from class: o.cx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53550U(searchableContactFilterInputBuild, map, (SearchableContactFilterInput) obj);
            }
        }).orElse(searchableContactFilterInputBuild);
        final SearchableContactFilterInput searchableContactFilterInput2 = (SearchableContactFilterInput) m53583u(str, str2).map(new Function() { // from class: o.dx9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53544O(searchableContactFilterInput, (SearchableContactFilterInput) obj);
            }
        }).orElse(searchableContactFilterInput);
        return (ryh) m53587z().map(new zw9()).map(new Function() { // from class: o.ex9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vx9.m53545P(searchableContactFilterInput2, (LeadFilter) obj);
            }
        }).orElse(uyh.of(searchableContactFilterInput2, SearchableContactSortInput.builder().direction(SearchableSortDirection.desc).field(SearchableContactSortableFields.updatedAt).build()));
    }

    /* renamed from: z */
    public Optional m53587z() {
        return this.f50996e;
    }
}
